package io.sentry.vendor;

import com.plaid.internal.EnumC3631g;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes3.dex */
public abstract class b {
    public static boolean a(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    public static long b(int i10, int i11, int i12) {
        return new GregorianCalendar(i10, i11 - 1, i12).getTimeInMillis();
    }

    public static long c(String str, int i10, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        char charAt = str.charAt(i11);
        boolean z10 = false;
        if (charAt == 'Z') {
            i16 = i11 + 1;
            i17 = 0;
            z10 = true;
        } else {
            if (charAt != '+' && charAt != '-') {
                throw new IllegalArgumentException("Invalid time zone indicator");
            }
            int i18 = charAt != '+' ? -1 : 1;
            int i19 = i11 + 3;
            int o10 = o(str, i11 + 1, i19);
            if (a(str, i19, ':')) {
                i19 = i11 + 4;
            }
            int i20 = i19 + 2;
            if (i10 >= i20) {
                i15 = o(str, i19, i20);
            } else {
                i20 = i19;
                i15 = 0;
            }
            s(o10, i15);
            int i21 = i18 * ((int) ((o10 * 3600000) + (i15 * 60000)));
            i16 = i20;
            i17 = i21;
        }
        if (!z10 && i16 != i10) {
            throw new IllegalArgumentException("Invalid trailing characters");
        }
        if (l(i12, i13, i14)) {
            return h(i12, i13, i14, 0, 0, 0, 0, i17);
        }
        q(i12, i13, i14);
        return g(i12, i13, i14, 0, 0, 0, 0, i17);
    }

    public static long d(int i10, int i11, int i12) {
        long j10 = i10 - (i11 <= 2 ? 1 : 0);
        long a10 = c.a(j10, 400L);
        int i13 = (int) (j10 - (400 * a10));
        return ((a10 * 146097) + ((((i13 * 365) + (i13 / 4)) - (i13 / 100)) + ((((((i11 + (i11 > 2 ? -3 : 9)) * EnumC3631g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE) + 2) / 5) + i12) - 1))) - 719468;
    }

    public static int e(int i10, int i11) {
        return i11 != 2 ? (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) ? 30 : 31 : m(i10) ? 29 : 28;
    }

    public static int[] f(long j10) {
        long j11 = j10 + 719468;
        long a10 = c.a(j11, 146097L);
        int i10 = (int) (j11 - (146097 * a10));
        int i11 = (((i10 - (i10 / 1460)) + (i10 / 36524)) - (i10 / 146096)) / 365;
        int i12 = (int) (i11 + (a10 * 400));
        int i13 = i10 - (((i11 * 365) + (i11 / 4)) - (i11 / 100));
        int i14 = ((i13 * 5) + 2) / EnumC3631g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE;
        int i15 = (i13 - (((i14 * EnumC3631g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE) + 2) / 5)) + 1;
        int i16 = i14 < 10 ? i14 + 3 : i14 - 9;
        return new int[]{i12 + (i16 > 2 ? 0 : 1), i16, i15};
    }

    public static long g(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        return (((((d(i10, i11, i12) * 86400000) + (i13 * 3600000)) + (i14 * 60000)) + (i15 * 1000)) + i16) - i17;
    }

    public static long h(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(new SimpleTimeZone(i17, "GMT"));
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i10);
        gregorianCalendar.set(2, i11 - 1);
        gregorianCalendar.set(5, i12);
        gregorianCalendar.set(11, i13);
        gregorianCalendar.set(12, i14);
        gregorianCalendar.set(13, i15);
        gregorianCalendar.set(14, i16);
        return gregorianCalendar.getTimeInMillis();
    }

    public static String i(long j10) {
        if (j10 < -12219292800000L) {
            return j(j10);
        }
        long a10 = c.a(j10, 86400000L);
        int b10 = (int) c.b(j10, 86400000L);
        int[] f10 = f(a10);
        int i10 = b10 / 3600000;
        int i11 = b10 - (3600000 * i10);
        int i12 = i11 / 60000;
        int i13 = i11 - (60000 * i12);
        int i14 = i13 / 1000;
        StringBuilder sb2 = new StringBuilder(24);
        n(sb2, f10[0], 4);
        sb2.append('-');
        n(sb2, f10[1], 2);
        sb2.append('-');
        n(sb2, f10[2], 2);
        sb2.append('T');
        n(sb2, i10, 2);
        sb2.append(':');
        n(sb2, i12, 2);
        sb2.append(':');
        n(sb2, i14, 2);
        sb2.append('.');
        n(sb2, i13 - (i14 * 1000), 3);
        sb2.append(Matrix.MATRIX_TYPE_ZERO);
        return sb2.toString();
    }

    public static String j(long j10) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(new SimpleTimeZone(0, "UTC"));
        gregorianCalendar.setTimeInMillis(j10);
        StringBuilder sb2 = new StringBuilder(24);
        n(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        n(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        n(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        n(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        n(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        n(sb2, gregorianCalendar.get(13), 2);
        sb2.append('.');
        n(sb2, gregorianCalendar.get(14), 3);
        sb2.append(Matrix.MATRIX_TYPE_ZERO);
        return sb2.toString();
    }

    public static int k(String str, int i10) {
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (charAt < '0' || charAt > '9') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static boolean l(int i10, int i11, int i12) {
        if (i10 < 1582) {
            return true;
        }
        if (i10 != 1582) {
            return false;
        }
        if (i11 >= 10) {
            return i11 == 10 && i12 < 15;
        }
        return true;
    }

    public static boolean m(int i10) {
        if (i10 % 4 == 0) {
            return i10 % 100 != 0 || i10 % 400 == 0;
        }
        return false;
    }

    public static void n(StringBuilder sb2, int i10, int i11) {
        if (i10 < 0) {
            sb2.append('-');
            n(sb2, -i10, i11);
            return;
        }
        String num = Integer.toString(i10);
        for (int length = i11 - num.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(num);
    }

    public static int o(String str, int i10, int i11) {
        if (i10 < 0 || i11 > str.length() || i10 >= i11) {
            throw new NumberFormatException(str);
        }
        int i12 = 0;
        for (int i13 = i10; i13 < i11; i13++) {
            char charAt = str.charAt(i13);
            if (charAt < '0' || charAt > '9') {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = ((i12 * 10) + charAt) - 48;
        }
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long p(String str) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char charAt;
        int length = str.length();
        int o10 = o(str, 0, 4);
        int i17 = a(str, 4, '-') ? 5 : 4;
        int i18 = i17 + 2;
        int o11 = o(str, i17, i18);
        if (a(str, i18, '-')) {
            i18 = i17 + 3;
        }
        int i19 = i18 + 2;
        int o12 = o(str, i18, i19);
        if (!a(str, i19, 'T')) {
            if (i19 == length) {
                return b(o10, o11, o12);
            }
            char charAt2 = str.charAt(i19);
            if (charAt2 == 'Z' || charAt2 == '+' || charAt2 == '-') {
                return c(str, length, i19, o10, o11, o12);
            }
            throw new IllegalArgumentException("Invalid date separator");
        }
        q(o10, o11, o12);
        int i20 = i18 + 5;
        int o13 = o(str, i18 + 3, i20);
        if (a(str, i20, ':')) {
            i20 = i18 + 6;
        }
        int i21 = i20 + 2;
        int o14 = o(str, i20, i21);
        if (a(str, i21, ':')) {
            i21 = i20 + 3;
        }
        if (length <= i21 || (charAt = str.charAt(i21)) == 'Z' || charAt == '+' || charAt == '-') {
            i10 = 1;
            i11 = 0;
        } else {
            int i22 = i21 + 2;
            i11 = o(str, i21, i22);
            if (i11 > 59 && i11 < 63) {
                i11 = 59;
            }
            if (a(str, i22, '.')) {
                int i23 = i21 + 3;
                int k10 = k(str, i23);
                if (k10 == i23) {
                    throw new IllegalArgumentException("Missing millisecond digits");
                }
                int min = Math.min(k10, i21 + 6);
                int o15 = o(str, i23, min);
                int i24 = min - i23;
                if (i24 == 1) {
                    o15 *= 100;
                } else if (i24 == 2) {
                    o15 *= 10;
                }
                i10 = 1;
                i21 = k10;
                i12 = o15;
                r(o13, o14, i11, i12);
                if (length > i21) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                char charAt3 = str.charAt(i21);
                if (charAt3 == 'Z') {
                    i13 = i21 + i10;
                    i16 = i10;
                    i15 = 0;
                } else {
                    if (charAt3 != '+' && charAt3 != '-') {
                        throw new IllegalArgumentException("Invalid time zone indicator");
                    }
                    int i25 = charAt3 == '+' ? i10 : -1;
                    int i26 = i21 + 3;
                    int o16 = o(str, i21 + 1, i26);
                    if (a(str, i26, ':')) {
                        i26 = i21 + 4;
                    }
                    i13 = i26 + 2;
                    if (length >= i13) {
                        i14 = o(str, i26, i13);
                    } else {
                        i13 = i26;
                        i14 = 0;
                    }
                    s(o16, i14);
                    i15 = i25 * ((int) ((o16 * 3600000) + (i14 * 60000)));
                    i16 = 0;
                }
                if (i16 != 0 || i13 == length) {
                    return l(o10, o11, o12) ? h(o10, o11, o12, o13, o14, i11, i12, i15) : g(o10, o11, o12, o13, o14, i11, i12, i15);
                }
                throw new IllegalArgumentException("Invalid trailing characters");
            }
            i10 = 1;
            i21 = i22;
        }
        i12 = 0;
        r(o13, o14, i11, i12);
        if (length > i21) {
        }
    }

    public static void q(int i10, int i11, int i12) {
        if (i10 < 1 || i11 < 1 || i11 > 12 || i12 < 1 || i12 > e(i10, i11)) {
            throw new IllegalArgumentException("Invalid date");
        }
    }

    public static void r(int i10, int i11, int i12, int i13) {
        if (i10 < 0 || i10 > 23 || i11 < 0 || i11 > 59 || i12 < 0 || i12 > 59 || i13 < 0 || i13 > 999) {
            throw new IllegalArgumentException("Invalid time");
        }
    }

    public static void s(int i10, int i11) {
        if (i10 < 0 || i10 > 23 || i11 < 0 || i11 > 59) {
            throw new IllegalArgumentException("Invalid time zone");
        }
    }
}
