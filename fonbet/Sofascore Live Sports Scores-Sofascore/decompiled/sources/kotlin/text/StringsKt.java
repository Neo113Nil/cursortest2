package kotlin.text;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a70;
import defpackage.fx4;
import defpackage.iii;
import defpackage.k13;
import defpackage.lnb;
import defpackage.me4;
import defpackage.nh0;
import defpackage.ph0;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"cii", "dii", "eii", "fii", "gii", "hii", "kotlin/text/b", "kotlin/text/StringsKt__StringNumberConversionsKt", "kotlin/text/c", "kotlin/text/StringsKt__StringsKt", "kotlin/text/f", "iii"}, d2 = {}, k = 4, mv = {2, 4, 0}, xi = 49)
/* loaded from: classes7.dex */
public final class StringsKt extends iii {
    private StringsKt() {
    }

    public static boolean J(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (P(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (StringsKt__StringsKt.x(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean K(CharSequence charSequence, char c) {
        charSequence.getClass();
        return O(charSequence, c, 0, 2) >= 0;
    }

    public static boolean L(CharSequence charSequence, char c) {
        charSequence.getClass();
        return charSequence.length() > 0 && a.a(charSequence.charAt(charSequence.length() - 1), c, false);
    }

    public static boolean M(CharSequence charSequence, String str) {
        return charSequence instanceof String ? c.n((String) charSequence, str, false) : StringsKt__StringsKt.z(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static int N(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static int O(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? StringsKt__StringsKt.y(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int P(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.w(i, charSequence, str, z);
    }

    public static boolean R(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!CharsKt.b(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int S(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = N(charSequence);
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(ph0.P(cArr), i);
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            if (a.a(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int T(String str, CharSequence charSequence, int i) {
        int N = (i & 2) != 0 ? N(charSequence) : 0;
        charSequence.getClass();
        str.getClass();
        return !(charSequence instanceof String) ? StringsKt__StringsKt.x(charSequence, str, N, 0, false, true) : ((String) charSequence).lastIndexOf(str, N);
    }

    public static String U(int i, String str) {
        CharSequence charSequence;
        str.getClass();
        if (i < 0) {
            a70.p(lnb.k(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static String V(String str, String str2) {
        str.getClass();
        return c.v(str, str2, false) ? str.substring(str2.length()) : str;
    }

    public static String W(String str, String str2) {
        str.getClass();
        return M(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static StringBuilder X(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < i) {
            zzl.r(lnb.j(i2, i, "End index (", ") is less than start index (", ")."));
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static List Y(CharSequence charSequence, final char[] cArr) {
        charSequence.getClass();
        if (cArr.length == 1) {
            return StringsKt__StringsKt.B(0, charSequence, String.valueOf(cArr[0]), false);
        }
        StringsKt__StringsKt.A(0);
        fx4<IntRange> fx4Var = new fx4(charSequence, 0, new Function2() { // from class: kotlin.text.d
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CharSequence charSequence2 = (CharSequence) obj;
                int intValue = ((Integer) obj2).intValue();
                charSequence2.getClass();
                int y = StringsKt__StringsKt.y(charSequence2, cArr, intValue, false);
                if (y < 0) {
                    return null;
                }
                return new Pair(Integer.valueOf(y), 1);
            }
        });
        ArrayList arrayList = new ArrayList(k13.r(new nh0(fx4Var, 3), 10));
        for (IntRange intRange : fx4Var) {
            intRange.getClass();
            arrayList.add(charSequence.subSequence(intRange.a, intRange.b + 1).toString());
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ List Z(CharSequence charSequence, String[] strArr, int i, int i2) {
        return StringsKt__StringsKt.split$default(charSequence, strArr, false, i, i2, null);
    }

    public static boolean a0(int i, CharSequence charSequence, String str, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? StringsKt__StringsKt.z(charSequence, i, str, 0, str.length(), z) : c.u(i, (String) charSequence, str, false);
    }

    public static boolean b0(String str, String str2, boolean z) {
        return !z ? c.v(str, str2, false) : StringsKt__StringsKt.z(str, 0, str2, 0, str2.length(), z);
    }

    public static boolean c0(String str, char c) {
        str.getClass();
        return str.length() > 0 && a.a(str.charAt(0), c, false);
    }

    public static String d0(String str, String str2, String str3) {
        me4.p(str, str2, str3);
        int P = P(str, str2, 0, false, 6);
        return P == -1 ? str3 : str.substring(str2.length() + P, str.length());
    }

    public static String e0(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int S = S(str, c, 0, 6);
        return S == -1 ? str2 : str.substring(S + 1, str.length());
    }

    public static String f0(String str, String str2) {
        str.getClass();
        str.getClass();
        int T = T(str2, str, 6);
        return T == -1 ? str : str.substring(str2.length() + T, str.length());
    }

    public static String g0(String str, char c) {
        str.getClass();
        str.getClass();
        int O = O(str, c, 0, 6);
        return O == -1 ? str : str.substring(0, O);
    }

    public static String h0(String str, String str2) {
        str.getClass();
        str.getClass();
        int P = P(str, str2, 0, false, 6);
        return P == -1 ? str : str.substring(0, P);
    }

    public static String i0(String str, char c) {
        str.getClass();
        str.getClass();
        int S = S(str, c, 0, 6);
        return S == -1 ? str : str.substring(0, S);
    }

    public static Boolean j0(String str) {
        str.getClass();
        if (Intrinsics.c(str, "true")) {
            return Boolean.TRUE;
        }
        if (Intrinsics.c(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static Long k0(String str) {
        boolean z;
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char charAt = str.charAt(0);
        long j = C.TIME_UNSET;
        if (charAt < '0') {
            z = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
                i = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = j / 10;
                if (j2 < j3) {
                    return null;
                }
            }
            long j4 = j2 * 10;
            long j5 = digit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }

    public static CharSequence l0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean b = CharsKt.b(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!b) {
                    break;
                }
                length--;
            } else if (b) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String m0(String str, char... cArr) {
        str.getClass();
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean u = ph0.u(cArr, str.charAt(!z ? i : length));
            if (z) {
                if (!u) {
                    break;
                }
                length--;
            } else if (u) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static String n0(String str, char... cArr) {
        CharSequence charSequence;
        str.getClass();
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!ph0.u(cArr, str.charAt(length))) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        charSequence = "";
        return charSequence.toString();
    }
}
