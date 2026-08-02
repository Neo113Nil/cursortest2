package zc;

import android.text.SpannableStringBuilder;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            String m6 = z.m(z.m(str, " ", ""), " ", "");
            Pair D = StringsKt.D(m6, d.a());
            if (D != null) {
                Object obj = D.f19193b;
                String str2 = b.valueOf((String) obj).f25909a;
                m6 = str2 + z.m(z.m(m6, (String) obj, ""), str2, "");
            }
            char[] charArray = m6.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            int i5 = -1;
            int length = charArray.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (Character.isDigit(charArray[length])) {
                        break;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                }
            }
            length = -1;
            int i11 = length - 2;
            if (i11 >= 0 && m6.charAt(length) == '0' && m6.charAt(length - 1) == '0' && (m6.charAt(i11) == '.' || m6.charAt(i11) == ',')) {
                m6 = StringsKt.O(m6, new IntRange(i11, length, 1)).toString();
            } else {
                int i12 = length - 1;
                if (i12 >= 0 && m6.charAt(length) == '0' && (m6.charAt(i12) == '.' || m6.charAt(i12) == ',')) {
                    m6 = StringsKt.O(m6, new IntRange(i12, length, 1)).toString();
                }
            }
            char[] charArray2 = m6.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray2, "toCharArray(...)");
            int length2 = charArray2.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length2) {
                    break;
                }
                if (Character.isDigit(charArray2[i13])) {
                    i5 = i13;
                    break;
                }
                i13++;
            }
            if (i5 <= 1) {
                return m6;
            }
            String spannableStringBuilder = SpannableStringBuilder.valueOf(m6).insert(i5, (CharSequence) " ").toString();
            Intrinsics.checkNotNullExpressionValue(spannableStringBuilder, "toString(...)");
            return spannableStringBuilder;
        } catch (Exception unused) {
            d.c(str.toString(), "replaceCodePrice");
            return str;
        }
    }
}
