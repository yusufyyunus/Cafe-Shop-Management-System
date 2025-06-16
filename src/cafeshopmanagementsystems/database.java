
package cafeshopmanagementsystems;

import java.sql.Connection;
import java.sql.DriverManager;

/* 
    Author     : yusufyunus
*/

public class database {

    public static Connection connectDB() {

        try {

            Class.forName("com.mysql.jdbc.Driver");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/cafeShopDB", "root", ""); // LINK YOUR DATABASE
            return connect;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
