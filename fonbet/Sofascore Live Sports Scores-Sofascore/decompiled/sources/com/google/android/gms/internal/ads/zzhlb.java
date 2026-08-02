package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.ceo;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhlb {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        long b = b(0, bArr) & 67108863;
        int i = 3;
        long b2 = (b(3, bArr) >> 2) & 67108611;
        long b3 = (b(6, bArr) >> 4) & 67092735;
        long b4 = (b(9, bArr) >> 6) & 66076671;
        long b5 = (b(12, bArr) >> 8) & 1048575;
        byte[] bArr3 = new byte[17];
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        int i2 = 0;
        while (true) {
            int length = bArr2.length;
            if (i2 >= length) {
                long j6 = j + (j2 >> 26);
                long j7 = j6 & 67108863;
                long j8 = j3 + (j6 >> 26);
                long j9 = j8 & 67108863;
                long j10 = j4 + (j8 >> 26);
                long j11 = j10 & 67108863;
                long j12 = ((j10 >> 26) * 5) + j5;
                long j13 = j12 >> 26;
                long j14 = j12 & 67108863;
                long j15 = j14 + 5;
                long j16 = (j2 & 67108863) + j13;
                long j17 = j16 + (j15 >> 26);
                long j18 = j7 + (j17 >> 26);
                long j19 = j9 + (j18 >> 26);
                long j20 = (j11 + (j19 >> 26)) - 67108864;
                long j21 = j20 >> 63;
                long j22 = ~j21;
                long j23 = (j16 & j21) | (j17 & 67108863 & j22);
                long j24 = (j7 & j21) | (j18 & 67108863 & j22);
                long j25 = (j9 & j21) | (j19 & 67108863 & j22);
                long b6 = b(16, bArr) + (((j15 & 67108863 & j22) | (j14 & j21) | (j23 << 26)) & 4294967295L);
                long b7 = b(20, bArr);
                long b8 = b(24, bArr);
                long b9 = b(28, bArr) + (((j25 >> 18) | (((j11 & j21) | (j20 & j22)) << 8)) & 4294967295L);
                byte[] bArr4 = new byte[16];
                c(b6 & 4294967295L, bArr4, 0);
                long j26 = b7 + (((j23 >> 6) | (j24 << 20)) & 4294967295L) + (b6 >> 32);
                c(j26 & 4294967295L, bArr4, 4);
                long j27 = b8 + (((j25 << 14) | (j24 >> 12)) & 4294967295L) + (j26 >> 32);
                c(j27 & 4294967295L, bArr4, 8);
                c((b9 + (j27 >> 32)) & 4294967295L, bArr4, 12);
                return bArr4;
            }
            int min = Math.min(16, length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, 17, (byte) 0);
            }
            long j28 = b5 * 5;
            long j29 = b4 * 5;
            long j30 = b3 * 5;
            long b10 = j5 + (b(0, bArr3) & 67108863);
            long b11 = j2 + ((b(i, bArr3) >> 2) & 67108863);
            long b12 = j + ((b(6, bArr3) >> 4) & 67108863);
            long b13 = j3 + ((b(9, bArr3) >> 6) & 67108863);
            long j31 = b2;
            long b14 = j4 + (((b(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j32 = b11 * b;
            long j33 = b11 * j31;
            long j34 = b12 * b;
            long j35 = b11 * b3;
            long j36 = b12 * j31;
            long j37 = b13 * b;
            long j38 = b11 * b4;
            long j39 = b12 * b3;
            long j40 = b13 * j31;
            long j41 = (b2 * 5 * b14) + (b13 * j30) + (b12 * j29) + (b11 * j28) + (b10 * b);
            long j42 = b13 * j29;
            long d = ceo.d(b14, j30, j42 + (b12 * j28) + (b10 * j31) + j32, j41 >> 26);
            long d2 = ceo.d(b14, j29, (b13 * j28) + (b10 * b3) + j33 + j34, d >> 26);
            long d3 = ceo.d(b14, j28, (b10 * b4) + j35 + j36 + j37, d2 >> 26);
            long j43 = d3 >> 26;
            j3 = d3 & 67108863;
            long j44 = (b10 * b5) + j38 + j39 + j40 + (b14 * b) + j43;
            long j45 = j44 >> 26;
            long j46 = j44 & 67108863;
            long j47 = (j45 * 5) + (j41 & 67108863);
            long j48 = (d & 67108863) + (j47 >> 26);
            i2 += 16;
            j5 = j47 & 67108863;
            j4 = j46;
            j = d2 & 67108863;
            j2 = j48;
            b2 = j31;
            i = 3;
        }
    }

    public static long b(int i, byte[] bArr) {
        int i2 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i3 = bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return (((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i3 << 8) | i2 | (i4 << 16)) & 4294967295L;
    }

    public static void c(long j, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i + i2] = (byte) (255 & j);
            j >>= 8;
        }
    }
}
