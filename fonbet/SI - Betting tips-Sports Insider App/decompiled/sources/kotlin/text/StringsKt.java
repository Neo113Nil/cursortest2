package kotlin.text;

import androidx.appcompat.widget.c1;
import com.google.android.material.navigation.NavigationBarView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"kotlin/text/s", "kotlin/text/t", "kotlin/text/u", "kotlin/text/v", "kotlin/text/w", "kotlin/text/x", "kotlin/text/y", "kotlin/text/StringsKt__StringNumberConversionsKt", "kotlin/text/z", "kotlin/text/StringsKt__StringsKt", "kotlin/text/c0", "kotlin/text/d0"}, d2 = {}, k = 4, mv = {2, 2, 0}, xi = NavigationBarView.ITEM_GRAVITY_TOP_CENTER)
/* loaded from: classes3.dex */
public final class StringsKt extends d0 {
    private StringsKt() {
    }

    public static boolean A(CharSequence charSequence, CharSequence other, boolean z5) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof String) {
            if (G(charSequence, (String) other, 0, z5, 2) >= 0) {
                return true;
            }
        } else if (StringsKt__StringsKt.r(charSequence, other, 0, charSequence.length(), z5, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean B(CharSequence charSequence, char c2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return F(charSequence, c2, 0, false, 2) >= 0;
    }

    public static boolean C(String str, char c2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.length() > 0 && a.c(str.charAt(StringsKt__StringsKt.q(str)), c2, false);
    }

    public static Pair D(String str, List strings) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        return StringsKt__StringsKt.p(str, strings, 0, true);
    }

    public static int E(int i5, CharSequence charSequence, String string, boolean z5) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z5 || !(charSequence instanceof String)) ? StringsKt__StringsKt.r(charSequence, string, i5, charSequence.length(), z5, false) : ((String) charSequence).indexOf(string, i5);
    }

    public static int F(CharSequence charSequence, char c2, int i5, boolean z5, int i10) {
        if ((i10 & 2) != 0) {
            i5 = 0;
        }
        if ((i10 & 4) != 0) {
            z5 = false;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z5 || !(charSequence instanceof String)) ? StringsKt__StringsKt.s(charSequence, new char[]{c2}, i5, z5) : ((String) charSequence).indexOf(c2, i5);
    }

    public static /* synthetic */ int G(CharSequence charSequence, String str, int i5, boolean z5, int i10) {
        if ((i10 & 2) != 0) {
            i5 = 0;
        }
        if ((i10 & 4) != 0) {
            z5 = false;
        }
        return E(i5, charSequence, str, z5);
    }

    public static boolean H(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            if (!CharsKt__CharJVMKt.a(charSequence.charAt(i5))) {
                return false;
            }
        }
        return true;
    }

    public static int I(CharSequence charSequence, String string, int i5, int i10) {
        if ((i10 & 2) != 0) {
            i5 = StringsKt__StringsKt.q(charSequence);
        }
        int i11 = i5;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return !(charSequence instanceof String) ? StringsKt__StringsKt.r(charSequence, string, i11, 0, false, true) : ((String) charSequence).lastIndexOf(string, i11);
    }

    public static int J(String str, char c2, int i5, int i10) {
        if ((i10 & 2) != 0) {
            i5 = StringsKt__StringsKt.q(str);
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (c1.v(str)) {
            return str.lastIndexOf(c2, i5);
        }
        char[] chars = {c2};
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (c1.v(str)) {
            return str.lastIndexOf(kotlin.collections.p.w(chars), i5);
        }
        int q = StringsKt__StringsKt.q(str);
        if (i5 > q) {
            i5 = q;
        }
        while (-1 < i5) {
            if (a.c(chars[0], str.charAt(i5), false)) {
                return i5;
            }
            i5--;
        }
        return -1;
    }

    public static List K(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        return bg.q.h(new bg.k(4, str));
    }

    public static String L(int i5, String str) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i5 < 0) {
            throw new IllegalArgumentException(d9.e.f(i5, "Desired length ", " is less than zero."));
        }
        if (i5 <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i5);
            int length = i5 - str.length();
            int i10 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append('0');
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            sb2.append((CharSequence) str);
            charSequence = sb2;
        }
        return charSequence.toString();
    }

    public static String M(String str, String prefix) {
        String str2;
        String str3;
        boolean t3;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (str == null || !c1.v(prefix)) {
            str2 = str;
            str3 = prefix;
            t3 = StringsKt__StringsKt.t(str2, 0, str3, 0, prefix.length(), false);
        } else {
            t3 = z.o(str, prefix, false);
            str2 = str;
            str3 = prefix;
        }
        if (!t3) {
            return str2;
        }
        String substring = str2.substring(str3.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String N(String str, String suffix) {
        String str2;
        String str3;
        boolean t3;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (str != null) {
            t3 = z.i(str, suffix, false);
            str2 = str;
            str3 = suffix;
        } else {
            str2 = str;
            str3 = suffix;
            t3 = StringsKt__StringsKt.t(str2, str.length() - suffix.length(), str3, 0, suffix.length(), false);
        }
        if (!t3) {
            return str2;
        }
        String substring = str2.substring(0, str2.length() - str3.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static StringBuilder O(String str, IntRange range) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter("", "replacement");
        int i5 = range.f19234a;
        int i10 = range.f19235b + 1;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "replacement");
        if (i10 < i5) {
            throw new IndexOutOfBoundsException("End index (" + i10 + ") is less than start index (" + i5 + ").");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str, 0, i5);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append((CharSequence) "");
        sb2.append((CharSequence) str, i10, str.length());
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    public static List P(CharSequence charSequence, String[] delimiters, final boolean z5, int i5) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return StringsKt__StringsKt.v(i5, charSequence, str, z5);
            }
        }
        StringsKt__StringsKt.u(i5);
        final List c2 = kotlin.collections.o.c(delimiters);
        c cVar = new c(charSequence, i5, new Function2() { // from class: kotlin.text.b0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int intValue = ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                Pair p10 = StringsKt__StringsKt.p(DelimitedRangesSequence, c2, intValue, z5);
                if (p10 != null) {
                    return new Pair(p10.f19192a, Integer.valueOf(((String) p10.f19193b).length()));
                }
                return null;
            }
        });
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        bg.p pVar = new bg.p(0, cVar);
        ArrayList arrayList = new ArrayList(kotlin.collections.v.k(pVar, 10));
        Iterator it = pVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            IntRange range = (IntRange) bVar.next();
            Intrinsics.checkNotNullParameter(charSequence, "<this>");
            Intrinsics.checkNotNullParameter(range, "range");
            arrayList.add(charSequence.subSequence(range.f19234a, range.f19235b + 1).toString());
        }
    }

    public static List R(String str, final char[] delimiters) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return StringsKt__StringsKt.v(0, str, String.valueOf(delimiters[0]), false);
        }
        StringsKt__StringsKt.u(0);
        c cVar = new c(str, 0, new Function2() { // from class: kotlin.text.a0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int intValue = ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                int s8 = StringsKt__StringsKt.s(DelimitedRangesSequence, delimiters, intValue, false);
                if (s8 < 0) {
                    return null;
                }
                return new Pair(Integer.valueOf(s8), 1);
            }
        });
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        bg.p pVar = new bg.p(0, cVar);
        ArrayList arrayList = new ArrayList(kotlin.collections.v.k(pVar, 10));
        Iterator it = pVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            IntRange range = (IntRange) bVar.next();
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(range, "range");
            arrayList.add(str.subSequence(range.f19234a, range.f19235b + 1).toString());
        }
    }

    public static boolean S(String str, char c2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.length() > 0 && a.c(str.charAt(0), c2, false);
    }

    public static String T(char c2, String str, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int F = F(str, c2, 0, false, 6);
        if (F == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(F + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String U(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int G = G(str, delimiter, 0, false, 6);
        if (G == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(delimiter.length() + G, str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String V(char c2, String str, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int J = J(str, c2, 0, 6);
        if (J == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(J + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String W(String missingDelimiterValue, char c2) {
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int F = F(missingDelimiterValue, c2, 0, false, 6);
        if (F == -1) {
            return missingDelimiterValue;
        }
        String substring = missingDelimiterValue.substring(0, F);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String X(String missingDelimiterValue, char c2) {
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int J = J(missingDelimiterValue, c2, 0, 6);
        if (J == -1) {
            return missingDelimiterValue;
        }
        String substring = missingDelimiterValue.substring(0, J);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static Long Y(String str) {
        boolean z5;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        char charAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            z5 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z5 = false;
                i5 = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i5 = 1;
            }
        } else {
            z5 = false;
        }
        long j6 = 0;
        long j10 = -256204778801521550L;
        while (i5 < length) {
            int digit = Character.digit((int) str.charAt(i5), 10);
            if (digit < 0) {
                return null;
            }
            if (j6 < j10) {
                if (j10 != -256204778801521550L) {
                    return null;
                }
                j10 = j / 10;
                if (j6 < j10) {
                    return null;
                }
            }
            long j11 = j6 * 10;
            long j12 = digit;
            if (j11 < j + j12) {
                return null;
            }
            j6 = j11 - j12;
            i5++;
        }
        return z5 ? Long.valueOf(j6) : Long.valueOf(-j6);
    }

    public static CharSequence Z(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length() - 1;
        int i5 = 0;
        boolean z5 = false;
        while (i5 <= length) {
            boolean a7 = CharsKt__CharJVMKt.a(str.charAt(!z5 ? i5 : length));
            if (z5) {
                if (!a7) {
                    break;
                }
                length--;
            } else if (a7) {
                i5++;
            } else {
                z5 = true;
            }
        }
        return str.subSequence(i5, length + 1);
    }

    public static String a0(String str, char... chars) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                char charAt = str.charAt(length);
                Intrinsics.checkNotNullParameter(chars, "<this>");
                Intrinsics.checkNotNullParameter(chars, "<this>");
                int length2 = chars.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        i10 = -1;
                        break;
                    }
                    if (charAt == chars[i10]) {
                        break;
                    }
                    i10++;
                }
                if (!(i10 >= 0)) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static String b0(String str, char... chars) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length();
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                charSequence = "";
                break;
            }
            char charAt = str.charAt(i5);
            Intrinsics.checkNotNullParameter(chars, "<this>");
            Intrinsics.checkNotNullParameter(chars, "<this>");
            int length2 = chars.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length2) {
                    i10 = -1;
                    break;
                }
                if (charAt == chars[i10]) {
                    break;
                }
                i10++;
            }
            if (!(i10 >= 0)) {
                charSequence = str.subSequence(i5, str.length());
                break;
            }
            i5++;
        }
        return charSequence.toString();
    }
}
