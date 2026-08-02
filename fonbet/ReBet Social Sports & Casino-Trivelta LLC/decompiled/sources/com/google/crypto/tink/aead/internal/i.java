package com.google.crypto.tink.aead.internal;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import kotlin.UByte;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public abstract class i {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long c10 = c(bArr, 0, 0) & 67108863;
        int i10 = 3;
        int i11 = 2;
        long c11 = c(bArr, 3, 2) & 67108611;
        long c12 = c(bArr, 6, 4) & 67092735;
        long c13 = c(bArr, 9, 6) & 66076671;
        long c14 = c(bArr, 12, 8) & 1048575;
        long j10 = c11 * 5;
        long j11 = c12 * 5;
        long j12 = c13 * 5;
        long j13 = c14 * 5;
        byte[] bArr3 = new byte[17];
        long j14 = 0;
        int i12 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        while (i12 < bArr2.length) {
            b(bArr3, bArr2, i12);
            long c15 = j18 + c(bArr3, 0, 0);
            long c16 = j14 + c(bArr3, i10, i11);
            long c17 = j15 + c(bArr3, 6, 4);
            long c18 = j16 + c(bArr3, 9, 6);
            long j19 = c11;
            long c19 = j17 + (c(bArr3, 12, 8) | (bArr3[16] << 24));
            long j20 = (c15 * c10) + (c16 * j13) + (c17 * j12) + (c18 * j11) + (c19 * j10);
            long j21 = (c15 * j19) + (c16 * c10) + (c17 * j13) + (c18 * j12) + (c19 * j11);
            long j22 = (c15 * c12) + (c16 * j19) + (c17 * c10) + (c18 * j13) + (c19 * j12);
            long j23 = (c15 * c13) + (c16 * c12) + (c17 * j19) + (c18 * c10) + (c19 * j13);
            long j24 = (c15 * c14) + (c16 * c13) + (c17 * c12) + (c18 * j19) + (c19 * c10);
            long j25 = j21 + (j20 >> 26);
            long j26 = j22 + (j25 >> 26);
            j15 = j26 & 67108863;
            long j27 = j23 + (j26 >> 26);
            j16 = j27 & 67108863;
            long j28 = j24 + (j27 >> 26);
            j17 = j28 & 67108863;
            long j29 = (j20 & 67108863) + ((j28 >> 26) * 5);
            j18 = j29 & 67108863;
            j14 = (j25 & 67108863) + (j29 >> 26);
            i12 += 16;
            c11 = j19;
            i10 = 3;
            i11 = 2;
        }
        long j30 = j15 + (j14 >> 26);
        long j31 = j30 & 67108863;
        long j32 = j16 + (j30 >> 26);
        long j33 = j32 & 67108863;
        long j34 = j17 + (j32 >> 26);
        long j35 = j34 & 67108863;
        long j36 = j18 + ((j34 >> 26) * 5);
        long j37 = j36 & 67108863;
        long j38 = (j14 & 67108863) + (j36 >> 26);
        long j39 = j37 + 5;
        long j40 = j39 & 67108863;
        long j41 = (j39 >> 26) + j38;
        long j42 = j31 + (j41 >> 26);
        long j43 = j33 + (j42 >> 26);
        long j44 = j43 & 67108863;
        long j45 = (j35 + (j43 >> 26)) - 67108864;
        long j46 = j45 >> 63;
        long j47 = j37 & j46;
        long j48 = j38 & j46;
        long j49 = j31 & j46;
        long j50 = j33 & j46;
        long j51 = j35 & j46;
        long j52 = ~j46;
        long j53 = (j41 & 67108863 & j52) | j48;
        long j54 = (j42 & 67108863 & j52) | j49;
        long j55 = (j44 & j52) | j50;
        long j56 = j51 | (j45 & j52);
        long j57 = (j47 | (j40 & j52) | (j53 << 26)) & BodyPartID.bodyIdMax;
        long j58 = ((j53 >> 6) | (j54 << 20)) & BodyPartID.bodyIdMax;
        long j59 = ((j54 >> 12) | (j55 << 14)) & BodyPartID.bodyIdMax;
        long j60 = ((j55 >> 18) | (j56 << 8)) & BodyPartID.bodyIdMax;
        long d10 = j57 + d(bArr, 16);
        long j61 = d10 & BodyPartID.bodyIdMax;
        long d11 = j58 + d(bArr, 20) + (d10 >> 32);
        long j62 = d11 & BodyPartID.bodyIdMax;
        long d12 = j59 + d(bArr, 24) + (d11 >> 32);
        long j63 = d12 & BodyPartID.bodyIdMax;
        long d13 = (j60 + d(bArr, 28) + (d12 >> 32)) & BodyPartID.bodyIdMax;
        byte[] bArr4 = new byte[16];
        e(bArr4, j61, 0);
        e(bArr4, j62, 4);
        e(bArr4, j63, 8);
        e(bArr4, d13, 12);
        return bArr4;
    }

    public static void b(byte[] bArr, byte[] bArr2, int i10) {
        int min = Math.min(16, bArr2.length - i10);
        System.arraycopy(bArr2, i10, bArr, 0, min);
        bArr[min] = 1;
        if (min != 16) {
            Arrays.fill(bArr, min + 1, bArr.length, (byte) 0);
        }
    }

    public static long c(byte[] bArr, int i10, int i11) {
        return (d(bArr, i10) >> i11) & 67108863;
    }

    public static long d(byte[] bArr, int i10) {
        return (((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16)) & BodyPartID.bodyIdMax;
    }

    public static void e(byte[] bArr, long j10, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) (255 & j10);
            i11++;
            j10 >>= 8;
        }
    }

    public static void f(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!cb.f.b(a(bArr, bArr2), bArr3)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
