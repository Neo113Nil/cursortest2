package kotlin.text;

import androidx.appcompat.widget.c1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f19260a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f19261b;

    static {
        int[] iArr = new int[256];
        int i5 = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            iArr[i10] = "0123456789abcdef".charAt(i10 & 15) | ("0123456789abcdef".charAt(i10 >> 4) << '\b');
        }
        f19260a = iArr;
        int[] iArr2 = new int[256];
        for (int i11 = 0; i11 < 256; i11++) {
            iArr2[i11] = "0123456789ABCDEF".charAt(i11 & 15) | ("0123456789ABCDEF".charAt(i11 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr3[i12] = -1;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i13)] = i14;
            i13++;
            i14++;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i15)] = i16;
            i15++;
            i16++;
        }
        long[] jArr = new long[256];
        for (int i17 = 0; i17 < 256; i17++) {
            jArr[i17] = -1;
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i18)] = i19;
            i18++;
            i19++;
        }
        int i20 = 0;
        while (i5 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i5)] = i20;
            i5++;
            i20++;
        }
        f19261b = jArr;
    }

    public static final void a(int i5, int i10, String str) {
        int i11 = i10 - i5;
        if (i11 < 1) {
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
            String substring = str.substring(i5, i10);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            throw new NumberFormatException("Expected at least 1 hexadecimal digits at index " + i5 + ", but was \"" + substring + "\" of length " + i11);
        }
        if (i11 > 16) {
            int i12 = (i11 + i5) - 16;
            while (i5 < i12) {
                if (str.charAt(i5) != '0') {
                    StringBuilder r5 = c1.r(i5, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    r5.append(str.charAt(i5));
                    r5.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(r5.toString());
                }
                i5++;
            }
        }
    }

    public static long b(int i5, int i10, String str) {
        j.f19268d.getClass();
        j format = j.f19269e;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int length = str.length();
        cVar.getClass();
        kotlin.collections.c.a(i5, i10, length);
        if (format.f19272c.f19266a) {
            a(i5, i10, str);
            return c(i5, i10, str);
        }
        if (i10 - i5 > 0) {
            a(i5, i10, str);
            return c(i5, i10, str);
        }
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i5, i10);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        throw new NumberFormatException(c1.m("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ", substring));
    }

    public static final long c(int i5, int i10, String str) {
        long j = 0;
        while (i5 < i10) {
            long j6 = j << 4;
            char charAt = str.charAt(i5);
            if ((charAt >>> '\b') == 0) {
                long j10 = f19261b[charAt];
                if (j10 >= 0) {
                    j = j6 | j10;
                    i5++;
                }
            }
            StringBuilder r5 = c1.r(i5, "Expected a hexadecimal digit at index ", ", but was ");
            r5.append(str.charAt(i5));
            throw new NumberFormatException(r5.toString());
        }
        return j;
    }

    public static String d(long j) {
        j.f19268d.getClass();
        j format = j.f19269e;
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.f19270a ? "0123456789ABCDEF" : "0123456789abcdef";
        if (format.f19272c.f19267b) {
            return z.g(new char[]{str.charAt((int) ((j >> 60) & 15)), str.charAt((int) ((j >> 56) & 15)), str.charAt((int) ((j >> 52) & 15)), str.charAt((int) ((j >> 48) & 15)), str.charAt((int) ((j >> 44) & 15)), str.charAt((int) ((j >> 40) & 15)), str.charAt((int) ((j >> 36) & 15)), str.charAt((int) ((j >> 32) & 15)), str.charAt((int) ((j >> 28) & 15)), str.charAt((int) ((j >> 24) & 15)), str.charAt((int) ((j >> 20) & 15)), str.charAt((int) ((j >> 16) & 15)), str.charAt((int) ((j >> 12) & 15)), str.charAt((int) ((j >> 8) & 15)), str.charAt((int) ((j >> 4) & 15)), str.charAt((int) (j & 15))});
        }
        long j6 = 0;
        long j10 = j6 + j6 + 16 + j6;
        if (0 > j10 || j10 > 2147483647L) {
            StringBuilder sb2 = new StringBuilder("The resulting string length is too big: ");
            gf.c0 c0Var = gf.d0.f10017b;
            sb2.append((Object) io.sentry.config.a.D(10, j10));
            throw new IllegalArgumentException(sb2.toString());
        }
        int i5 = (int) j10;
        char[] cArr = new char[i5];
        int i10 = 64;
        int i11 = 0;
        int i12 = 0;
        while (i11 < 16) {
            i10 -= 4;
            cArr[i12] = str.charAt((int) ((j >> i10) & 15));
            i11++;
            i12++;
        }
        return i12 == i5 ? z.g(cArr) : z.h(cArr, 0, i12);
    }
}
