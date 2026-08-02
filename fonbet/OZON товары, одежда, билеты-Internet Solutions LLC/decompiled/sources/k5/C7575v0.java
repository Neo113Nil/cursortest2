package k5;

import androidx.annotation.NonNull;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Locale;

/* renamed from: k5.v0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7575v0 {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f70875a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(double d11) {
        BigDecimal bigDecimal = new BigDecimal(String.format(Locale.ROOT, "%.10f", Double.valueOf(d11)));
        return (bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros()).toPlainString();
    }

    public static String b(int i11, byte[] bArr) {
        if (bArr.length <= 0) {
            return "";
        }
        if (i11 > bArr.length) {
            i11 = bArr.length;
        }
        StringBuilder sb2 = new StringBuilder(i11 * 2);
        for (int i12 = 0; i12 < i11; i12++) {
            byte b11 = bArr[i12];
            char[] cArr = f70875a;
            sb2.append(cArr[(b11 & 255) >>> 4]);
            sb2.append(cArr[b11 & 15]);
        }
        return sb2.toString();
    }

    public static String c(@NonNull String str) {
        int length = str.length();
        if (length == 0) {
            return str;
        }
        if (length == 1) {
            return str.toUpperCase(Locale.ROOT);
        }
        return str.substring(0, 1).toUpperCase(Locale.ROOT) + str.substring(1);
    }
}
