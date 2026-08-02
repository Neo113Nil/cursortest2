package org.joda.time.format;

import B0.A0;
import I0.C3173b;
import g.C6594f;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final double f79289a = Math.log(10.0d);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f79290b = 0;

    public static void a(Appendable appendable, int i11, int i12) throws IOException {
        if (i11 < 0) {
            appendable.append('-');
            if (i11 == Integer.MIN_VALUE) {
                while (i12 > 10) {
                    appendable.append('0');
                    i12--;
                }
                appendable.append("2147483648");
                return;
            }
            i11 = -i11;
        }
        if (i11 < 10) {
            while (i12 > 1) {
                appendable.append('0');
                i12--;
            }
            appendable.append((char) (i11 + 48));
            return;
        }
        if (i11 >= 100) {
            int log = i11 < 1000 ? 3 : i11 < 10000 ? 4 : ((int) (Math.log(i11) / f79289a)) + 1;
            while (i12 > log) {
                appendable.append('0');
                i12--;
            }
            appendable.append(Integer.toString(i11));
            return;
        }
        while (i12 > 2) {
            appendable.append('0');
            i12--;
        }
        int i13 = ((i11 + 1) * 13421772) >> 27;
        appendable.append((char) (i13 + 48));
        appendable.append((char) (((i11 - (i13 << 3)) - (i13 << 1)) + 48));
    }

    public static void b(StringBuffer stringBuffer, int i11, int i12) {
        try {
            a(stringBuffer, i11, i12);
        } catch (IOException unused) {
        }
    }

    public static void c(Appendable appendable, int i11) throws IOException {
        if (i11 < 0) {
            appendable.append('-');
            if (i11 == Integer.MIN_VALUE) {
                appendable.append("2147483648");
                return;
            }
            i11 = -i11;
        }
        if (i11 < 10) {
            appendable.append((char) (i11 + 48));
        } else {
            if (i11 >= 100) {
                appendable.append(Integer.toString(i11));
                return;
            }
            int i12 = ((i11 + 1) * 13421772) >> 27;
            appendable.append((char) (i12 + 48));
            appendable.append((char) (((i11 - (i12 << 3)) - (i12 << 1)) + 48));
        }
    }

    public static int d(long j11) {
        int log;
        if (j11 < 0) {
            if (j11 == Long.MIN_VALUE) {
                return 20;
            }
            log = d(-j11);
        } else {
            if (j11 < 10) {
                return 1;
            }
            if (j11 < 100) {
                return 2;
            }
            if (j11 < 1000) {
                return 3;
            }
            if (j11 < 10000) {
                return 4;
            }
            log = (int) (Math.log(j11) / f79289a);
        }
        return log + 1;
    }

    static String e(int i11, String str) {
        String concat = str.length() <= i11 + 35 ? str : str.substring(0, i11 + 32).concat("...");
        if (i11 <= 0) {
            return C3173b.a('\"', "Invalid format: \"", concat);
        }
        if (i11 >= str.length()) {
            return A0.b("Invalid format: \"", concat, "\" is too short");
        }
        StringBuilder b11 = C6594f.b("Invalid format: \"", concat, "\" is malformed at \"");
        b11.append(concat.substring(i11));
        b11.append('\"');
        return b11.toString();
    }

    static int f(int i11, String str) {
        int charAt = str.charAt(i11) - '0';
        return (str.charAt(i11 + 1) + ((charAt << 3) + (charAt << 1))) - 48;
    }
}
