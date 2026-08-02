package io.appmetrica.analytics.coreutils.internal.parsing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ParseUtils {
    public static final int NEGATIVE_INT = -1;
    public static final int ZERO = 0;

    public static Integer intValueOf(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Float parseFloat(String str) {
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static int parseInt(String str, int i5) {
        if (str == null) {
            return i5;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i5;
        }
    }

    public static int parseIntOrNegative(String str) {
        return parseInt(str, -1);
    }

    public static int parseIntOrZero(String str) {
        return parseInt(str, 0);
    }

    public static long parseLong(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static Integer parseInt(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Long parseLong(String str) {
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
