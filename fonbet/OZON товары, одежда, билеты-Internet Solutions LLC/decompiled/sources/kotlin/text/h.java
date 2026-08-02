package kotlin.text;

import K1.C3422b;
import Sc.InterfaceC3999a;
import T7.E;
import android.text.Spanned;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.O;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.I;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

/* loaded from: classes.dex */
public final class h extends A {
    private h() {
    }

    public static boolean A(@NotNull String str, @NotNull String suffix, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return !z11 ? str.endsWith(suffix) : r.a(str.length() - suffix.length(), 0, suffix.length(), str, suffix, true);
    }

    @NotNull
    public static CharSequence A0(@NotNull OzonSpannableString ozonSpannableString, @NotNull char... chars) {
        Intrinsics.checkNotNullParameter(ozonSpannableString, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = ozonSpannableString.length() - 1;
        int i11 = 0;
        boolean z11 = false;
        while (i11 <= length) {
            boolean j11 = C7705l.j(chars, ozonSpannableString.charAt(!z11 ? i11 : length));
            if (z11) {
                if (!j11) {
                    break;
                }
                length--;
            } else if (j11) {
                i11++;
            } else {
                z11 = true;
            }
        }
        return ozonSpannableString.subSequence(i11, length + 1);
    }

    public static boolean B(CharSequence charSequence, String suffix) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return (!(charSequence instanceof String) || suffix == null) ? w.i(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), false) : A((String) charSequence, suffix, false);
    }

    @NotNull
    public static String B0(@NotNull String str, @NotNull char... chars) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        int i11 = 0;
        boolean z11 = false;
        while (i11 <= length) {
            boolean j11 = C7705l.j(chars, str.charAt(!z11 ? i11 : length));
            if (z11) {
                if (!j11) {
                    break;
                }
                length--;
            } else if (j11) {
                i11++;
            } else {
                z11 = true;
            }
        }
        return str.subSequence(i11, length + 1).toString();
    }

    public static boolean C(String str, char c11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.length() > 0 && C7750a.a(str.charAt(G(str)), c11, false);
    }

    @NotNull
    public static CharSequence C0(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i11 = length - 1;
            if (!CharsKt.c(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i11 < 0) {
                return "";
            }
            length = i11;
        }
    }

    public static boolean D(String str, String str2, boolean z11) {
        return str == null ? str2 == null : !z11 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    @NotNull
    public static String D0(@NotNull String str, @NotNull char... chars) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (!C7705l.j(chars, str.charAt(length))) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static char E(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
    
        if (r8 == null) goto L41;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String E0(@NotNull String str) {
        int i11;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        List g10 = w.g(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : g10) {
            if (!K((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                if (!CharsKt.c(str2.charAt(i11))) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                i11 = str2.length();
            }
            arrayList2.add(Integer.valueOf(i11));
        }
        Integer num = (Integer) C7714v.h0(arrayList2);
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        g10.size();
        j jVar = j.f71974b;
        int P11 = C7714v.P(g10);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : g10) {
            int i12 = i11 + 1;
            String str3 = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            String str4 = (String) obj2;
            if ((i11 != 0 && i11 != P11) || !K(str4)) {
                String y11 = y(intValue, str4);
                if (y11 != null) {
                    jVar.getClass();
                    str3 = jVar.invoke(y11);
                }
                str3 = str4;
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i11 = i12;
        }
        StringBuilder sb2 = new StringBuilder(length2);
        C7714v.U(arrayList3, sb2, "\n", null, null, null, 124);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static Character F(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
    
        if (r9 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String F0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        if (K("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List g10 = w.g(str);
        int length = str.length();
        g10.size();
        j jVar = j.f71974b;
        int P11 = C7714v.P(g10);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : g10) {
            int i12 = i11 + 1;
            String str2 = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            String str3 = (String) obj;
            if ((i11 != 0 && i11 != P11) || !K(str3)) {
                int length2 = str3.length();
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        i13 = -1;
                        break;
                    }
                    if (!CharsKt.c(str3.charAt(i13))) {
                        break;
                    }
                    i13++;
                }
                if (i13 != -1 && d0(i13, str3, "|", false)) {
                    str2 = str3.substring(1 + i13);
                    Intrinsics.checkNotNullExpressionValue(str2, "substring(...)");
                }
                if (str2 != null) {
                    jVar.getClass();
                    str2 = jVar.invoke(str2);
                }
                str2 = str3;
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i11 = i12;
        }
        StringBuilder sb2 = new StringBuilder(length);
        C7714v.U(arrayList, sb2, "\n", null, null, null, 124);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static int G(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    @NotNull
    public static String G0(@NotNull String str, @NotNull char... chars) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length();
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                charSequence = "";
                break;
            }
            if (!C7705l.j(chars, str.charAt(i11))) {
                charSequence = str.subSequence(i11, str.length());
                break;
            }
            i11++;
        }
        return charSequence.toString();
    }

    public static Character H(int i11, @NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i11 < 0 || i11 >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i11));
    }

    public static int I(char c11, int i11, int i12, CharSequence charSequence) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return !(charSequence instanceof String) ? w.e(charSequence, new char[]{c11}, i11, false) : ((String) charSequence).indexOf(c11, i11);
    }

    @NotNull
    public static O I0(@NotNull C3422b c3422b) {
        Intrinsics.checkNotNullParameter(c3422b, "<this>");
        return new O(new z(c3422b));
    }

    public static /* synthetic */ int J(CharSequence charSequence, String str, int i11, boolean z11, int i12) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return w.b(i11, str, charSequence, z11);
    }

    public static boolean K(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (!CharsKt.c(charSequence.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static s L(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new s(charSequence);
    }

    public static char M(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(G(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int N(char c11, int i11, int i12, CharSequence charSequence) {
        if ((i12 & 2) != 0) {
            i11 = G(charSequence);
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c11, i11);
        }
        char[] chars = {c11};
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(C7705l.X(chars), i11);
        }
        int G11 = G(charSequence);
        if (i11 > G11) {
            i11 = G11;
        }
        while (-1 < i11) {
            if (C7750a.a(chars[0], charSequence.charAt(i11), false)) {
                return i11;
            }
            i11--;
        }
        return -1;
    }

    public static Character O(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        return Character.valueOf(str.charAt(str.length() - 1));
    }

    @NotNull
    public static String P(@NotNull String str, int i11, char c11) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(E.a(i11, "Desired length ", " is less than zero."));
        }
        if (i11 <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i11);
            int length = i11 - str.length();
            int i12 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append(c11);
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                }
            }
            sb2.append((CharSequence) str);
            charSequence = sb2;
        }
        return charSequence.toString();
    }

    @NotNull
    public static CharSequence R(@NotNull CharSequence charSequence, @NotNull String prefix) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return g0(charSequence, prefix) ? charSequence.subSequence(prefix.length(), charSequence.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @NotNull
    public static String S(@NotNull String str, @NotNull String prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!g0(str, prefix)) {
            return str;
        }
        String substring = str.substring(prefix.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @NotNull
    public static CharSequence T(int i11, int i12, @NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i12 < i11) {
            throw new IndexOutOfBoundsException(Cm.e.c("End index (", i12, ") is less than start index (", ").", i11));
        }
        if (i12 == i11) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() - (i12 - i11));
        sb2.append(charSequence, 0, i11);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append(charSequence, i12, charSequence.length());
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @NotNull
    public static String U(@NotNull String str, @NotNull String suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!B(str, suffix)) {
            return str;
        }
        String substring = str.substring(0, str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @NotNull
    public static String V(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("\"", "delimiter");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("\"", "prefix");
        Intrinsics.checkNotNullParameter("\"", "suffix");
        if (str.length() < 2 || !g0(str, "\"") || !B(str, "\"")) {
            return str;
        }
        String substring = str.substring(1, str.length() - 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @NotNull
    public static String W(int i11, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(P4.f.c("Count 'n' must be non-negative, but was ", i11, '.').toString());
        }
        if (i11 == 0) {
            return "";
        }
        int i12 = 1;
        if (i11 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char charAt = str.charAt(0);
            char[] cArr = new char[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                cArr[i13] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(str.length() * i11);
        if (1 <= i11) {
            while (true) {
                sb2.append((CharSequence) str);
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.f(sb3);
        return sb3;
    }

    @NotNull
    public static String X(@NotNull String str, @NotNull String oldValue, @NotNull String newValue, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int i11 = 0;
        int b11 = w.b(0, oldValue, str, z11);
        if (b11 < 0) {
            return str;
        }
        int length = oldValue.length();
        int i12 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i11, b11);
            sb2.append(newValue);
            i11 = b11 + length;
            if (b11 >= str.length()) {
                break;
            }
            b11 = w.b(b11 + i12, oldValue, str, z11);
        } while (b11 > 0);
        sb2.append((CharSequence) str, i11, str.length());
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static String Y(String str, char c11, char c12) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String replace = str.replace(c11, c12);
        Intrinsics.checkNotNullExpressionValue(replace, "replace(...)");
        return replace;
    }

    public static String Z(String str, String oldValue, String newValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int J11 = J(str, oldValue, 0, false, 2);
        return J11 < 0 ? str : a0(str, J11, oldValue.length() + J11, newValue).toString();
    }

    @NotNull
    public static StringBuilder a0(@NotNull CharSequence charSequence, int i11, int i12, @NotNull CharSequence replacement) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        if (i12 < i11) {
            throw new IndexOutOfBoundsException(Cm.e.c("End index (", i12, ") is less than start index (", ").", i11));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence, 0, i11);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append(replacement);
        sb2.append(charSequence, i12, charSequence.length());
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @NotNull
    public static StringBuilder b0(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        StringBuilder reverse = new StringBuilder(charSequence).reverse();
        Intrinsics.checkNotNullExpressionValue(reverse, "reverse(...)");
        return reverse;
    }

    public static I c0(String str, String[] delimiters) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return kotlin.sequences.l.v(w.h(str, delimiters, 0), new v(str));
    }

    public static boolean d0(int i11, @NotNull String str, @NotNull String prefix, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z11 ? str.startsWith(prefix, i11) : r.a(i11, 0, prefix.length(), str, prefix, z11);
    }

    public static boolean e0(@NotNull String str, @NotNull String prefix, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z11 ? str.startsWith(prefix) : r.a(0, 0, prefix.length(), str, prefix, z11);
    }

    public static boolean f0(CharSequence charSequence, char c11) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && C7750a.a(charSequence.charAt(0), c11, false);
    }

    public static boolean g0(CharSequence charSequence, String prefix) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return (!(charSequence instanceof String) || prefix == null) ? w.i(charSequence, 0, prefix, 0, prefix.length(), false) : e0((String) charSequence, prefix, false);
    }

    @NotNull
    public static String h0(char c11, @NotNull String str, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int I11 = I(c11, 0, 6, str);
        if (I11 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(I11 + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String i0(String missingDelimiterValue, String delimiter) {
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int J11 = J(missingDelimiterValue, delimiter, 0, false, 6);
        if (J11 == -1) {
            return missingDelimiterValue;
        }
        String substring = missingDelimiterValue.substring(delimiter.length() + J11, missingDelimiterValue.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @NotNull
    public static String j0(char c11, @NotNull String str, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int N11 = N(c11, 0, 6, str);
        if (N11 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(N11 + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @NotNull
    public static String k0(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int f7 = w.f(str, delimiter, 0, 6);
        if (f7 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(delimiter.length() + f7, str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String l0(String missingDelimiterValue, char c11) {
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int I11 = I(c11, 0, 6, missingDelimiterValue);
        if (I11 == -1) {
            return missingDelimiterValue;
        }
        String substring = missingDelimiterValue.substring(0, I11);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String m0(String missingDelimiterValue, String delimiter) {
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int J11 = J(missingDelimiterValue, delimiter, 0, false, 6);
        if (J11 == -1) {
            return missingDelimiterValue;
        }
        String substring = missingDelimiterValue.substring(0, J11);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @NotNull
    public static String n0(char c11, @NotNull String str, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int N11 = N(c11, 0, 6, str);
        if (N11 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, N11);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @NotNull
    public static String o0(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int f7 = w.f(str, delimiter, 0, 6);
        if (f7 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, f7);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static void p(@NotNull Appendable appendable, Object obj, Function1 function1) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        if (function1 != null) {
            appendable.append((CharSequence) function1.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }

    @NotNull
    public static CharSequence p0(@NotNull Spanned spanned, int i11) {
        Intrinsics.checkNotNullParameter(spanned, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(E.a(i11, "Requested character count ", " is less than zero.").toString());
        }
        int length = spanned.length();
        if (i11 > length) {
            i11 = length;
        }
        return spanned.subSequence(0, i11);
    }

    @InterfaceC3999a
    @NotNull
    public static String q(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (str.length() <= 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!Character.isLowerCase(charAt)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char titleCase = Character.toTitleCase(charAt);
        if (titleCase != Character.toUpperCase(charAt)) {
            sb2.append(titleCase);
        } else {
            String substring = str.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Intrinsics.g(substring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = substring.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb2.append(upperCase);
        }
        String substring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        sb2.append(substring2);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @NotNull
    public static String q0(int i11, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(E.a(i11, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i11 > length) {
            i11 = length;
        }
        String substring = str.substring(0, i11);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @NotNull
    public static ArrayList r(int i11, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return A.o(str, i11, i11, true);
    }

    @NotNull
    public static String r0(int i11, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(E.a(i11, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i11 > length) {
            i11 = length;
        }
        String substring = str.substring(length - i11);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @NotNull
    public static void s(@NotNull StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.setLength(0);
    }

    public static BigDecimal s0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (g.f71973b.f(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static boolean t(@NotNull CharSequence charSequence, @NotNull CharSequence other, boolean z11) {
        int c11;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (!(other instanceof String)) {
            c11 = w.c(charSequence, other, 0, charSequence.length(), z11, false);
            if (c11 >= 0) {
                return true;
            }
        } else if (J(charSequence, (String) other, 0, z11, 2) >= 0) {
            return true;
        }
        return false;
    }

    public static Boolean t0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.d(str, "true")) {
            return Boolean.TRUE;
        }
        if (Intrinsics.d(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static boolean u(CharSequence charSequence, char c11) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return I(c11, 0, 2, charSequence) >= 0;
    }

    public static Double u0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (g.f71973b.f(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static boolean v(CharSequence charSequence, CharSequence charSequence2) {
        boolean z11 = charSequence instanceof String;
        if (z11 && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (z11 && (charSequence2 instanceof String)) {
            return Intrinsics.d(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence != null && charSequence2 != null && charSequence.length() == charSequence2.length()) {
            int length = charSequence.length();
            for (int i11 = 0; i11 < length; i11++) {
                if (charSequence.charAt(i11) == charSequence2.charAt(i11)) {
                }
            }
            return true;
        }
        return false;
    }

    public static Float v0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (g.f71973b.f(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @InterfaceC3999a
    @NotNull
    public static String w(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String substring = str.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        Intrinsics.g(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        sb2.append(lowerCase);
        String substring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        sb2.append(substring2);
        return sb2.toString();
    }

    public static Integer w0(@NotNull String str) {
        boolean z11;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char charAt = str.charAt(0);
        int i14 = -2147483647;
        if (Intrinsics.i(charAt, 48) < 0) {
            i11 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z11 = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i14 = LinearLayoutManager.INVALID_OFFSET;
                z11 = true;
            }
        } else {
            z11 = false;
            i11 = 0;
        }
        int i15 = -59652323;
        while (i11 < length) {
            int digit = Character.digit((int) str.charAt(i11), 10);
            if (digit < 0) {
                return null;
            }
            if ((i13 < i15 && (i15 != -59652323 || i13 < (i15 = i14 / 10))) || (i12 = i13 * 10) < i14 + digit) {
                return null;
            }
            i13 = i12 - digit;
            i11++;
        }
        return z11 ? Integer.valueOf(i13) : Integer.valueOf(-i13);
    }

    @NotNull
    public static String x(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }

    public static Long x0(int i11, @NotNull String str) {
        boolean z11;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i11);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char charAt = str.charAt(0);
        long j11 = -9223372036854775807L;
        if (Intrinsics.i(charAt, 48) < 0) {
            z11 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z11 = false;
                i12 = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j11 = Long.MIN_VALUE;
                i12 = 1;
            }
        } else {
            z11 = false;
        }
        long j12 = 0;
        long j13 = -256204778801521550L;
        while (i12 < length) {
            int digit = Character.digit((int) str.charAt(i12), i11);
            if (digit < 0) {
                return null;
            }
            if (j12 < j13) {
                if (j13 != -256204778801521550L) {
                    return null;
                }
                j13 = j11 / i11;
                if (j12 < j13) {
                    return null;
                }
            }
            long j14 = j12 * i11;
            long j15 = digit;
            if (j14 < j11 + j15) {
                return null;
            }
            j12 = j14 - j15;
            i12++;
        }
        return z11 ? Long.valueOf(j12) : Long.valueOf(-j12);
    }

    @NotNull
    public static String y(int i11, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(E.a(i11, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i11 > length) {
            i11 = length;
        }
        String substring = str.substring(i11);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static Long y0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return x0(10, str);
    }

    @NotNull
    public static String z(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length() - 1;
        if (length < 0) {
            length = 0;
        }
        return q0(length, str);
    }

    @NotNull
    public static CharSequence z0(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i11 = 0;
        boolean z11 = false;
        while (i11 <= length) {
            boolean c11 = CharsKt.c(charSequence.charAt(!z11 ? i11 : length));
            if (z11) {
                if (!c11) {
                    break;
                }
                length--;
            } else if (c11) {
                i11++;
            } else {
                z11 = true;
            }
        }
        return charSequence.subSequence(i11, length + 1);
    }
}
