package com.mbridge.msdk.foundation.tools;

import androidx.core.app.NotificationCompat;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class j0 {
    public static final char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    public static final int[] b;

    static {
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        b = iArr;
        Arrays.fill(iArr, -1);
        for (int i = 0; i < 64; i++) {
            b[a[i]] = i;
        }
        b[61] = 0;
    }

    public static String a(String str) {
        byte[] b2 = b(str);
        return (b2 == null || b2.length == 0) ? "" : new String(b2, StandardCharsets.UTF_8);
    }

    public static byte[] b(String str) {
        int i;
        int length = str.length();
        if (length == 0) {
            return new byte[0];
        }
        int i2 = length - 1;
        int i3 = 0;
        while (i3 < i2 && b[str.charAt(i3) & 255] < 0) {
            i3++;
        }
        while (i2 > 0 && b[str.charAt(i2) & 255] < 0) {
            i2--;
        }
        int i4 = str.charAt(i2) == '=' ? str.charAt(i2 + (-1)) == '=' ? 2 : 1 : 0;
        int i5 = (i2 - i3) + 1;
        if (length > 76) {
            i = (str.charAt(76) == '\r' ? i5 / 78 : 0) << 1;
        } else {
            i = 0;
        }
        int i6 = (((i5 - i) * 6) >> 3) - i4;
        byte[] bArr = new byte[i6];
        int i7 = (i6 / 3) * 3;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i7) {
            int[] iArr = b;
            int i10 = i3 + 4;
            int i11 = iArr[str.charAt(i3 + 3)] | (iArr[str.charAt(i3 + 1)] << 12) | (iArr[str.charAt(i3)] << 18) | (iArr[str.charAt(i3 + 2)] << 6);
            bArr[i8] = (byte) (i11 >> 16);
            int i12 = i8 + 2;
            bArr[i8 + 1] = (byte) (i11 >> 8);
            i8 += 3;
            bArr[i12] = (byte) i11;
            if (i <= 0 || (i9 = i9 + 1) != 19) {
                i3 = i10;
            } else {
                i3 += 6;
                i9 = 0;
            }
        }
        if (i8 < i6) {
            int i13 = 0;
            int i14 = 0;
            while (i3 <= i2 - i4) {
                i13 |= b[str.charAt(i3)] << (18 - (i14 * 6));
                i14++;
                i3++;
            }
            int i15 = 16;
            while (i8 < i6) {
                bArr[i8] = (byte) (i13 >> i15);
                i15 -= 8;
                i8++;
            }
        }
        return bArr;
    }
}
