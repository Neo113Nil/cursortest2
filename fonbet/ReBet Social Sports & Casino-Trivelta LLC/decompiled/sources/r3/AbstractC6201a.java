package r3;

import java.util.Calendar;
import java.util.Locale;

/* renamed from: r3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6201a {
    public static boolean a(int i10, int i11) {
        Calendar calendar = Calendar.getInstance();
        return b(i10) || (f(i10) == calendar.get(1) && i11 < calendar.get(2) + 1);
    }

    public static boolean b(int i10) {
        return f(i10) < Calendar.getInstance().get(1);
    }

    public static boolean c(int i10, int i11) {
        return (b(i10) || a(i10, i11)) ? false : true;
    }

    public static boolean d(int i10) {
        return i10 > 0 && i10 < 13;
    }

    public static boolean e(String str) {
        if (str == null) {
            return false;
        }
        for (char c10 : str.toCharArray()) {
            if (!Character.isDigit(c10)) {
                return false;
            }
        }
        return true;
    }

    public static int f(int i10) {
        if (i10 >= 100 || i10 < 0) {
            return i10;
        }
        return Integer.parseInt(String.format(Locale.US, "%s%02d", String.valueOf(Calendar.getInstance().get(1)).substring(0, r0.length() - 2), Integer.valueOf(i10)));
    }
}
