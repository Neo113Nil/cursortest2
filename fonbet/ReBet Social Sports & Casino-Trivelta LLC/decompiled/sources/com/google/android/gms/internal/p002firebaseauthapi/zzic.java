package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import kotlin.UByte;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes2.dex */
public final class zzic {
    private static long zza(byte[] bArr, int i10, int i11) {
        return (zza(bArr, i10) >> i11) & 67108863;
    }

    private static long zza(byte[] bArr, int i10) {
        return (((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16)) & BodyPartID.bodyIdMax;
    }

    private static void zza(byte[] bArr, long j10, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) (255 & j10);
            i11++;
            j10 >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long zza = zza(bArr, 0, 0) & 67108863;
            int i10 = 3;
            int i11 = 2;
            long zza2 = zza(bArr, 3, 2) & 67108611;
            long zza3 = zza(bArr, 6, 4) & 67092735;
            long zza4 = zza(bArr, 9, 6) & 66076671;
            long zza5 = zza(bArr, 12, 8) & 1048575;
            long j10 = zza2 * 5;
            long j11 = zza3 * 5;
            long j12 = zza4 * 5;
            long j13 = zza5 * 5;
            int i12 = 17;
            byte[] bArr3 = new byte[17];
            long j14 = 0;
            int i13 = 0;
            long j15 = 0;
            long j16 = 0;
            long j17 = 0;
            long j18 = 0;
            while (i13 < bArr2.length) {
                int min = Math.min(16, bArr2.length - i13);
                System.arraycopy(bArr2, i13, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, i12, (byte) 0);
                }
                long zza6 = j18 + zza(bArr3, 0, 0);
                long zza7 = j14 + zza(bArr3, i10, i11);
                long zza8 = j15 + zza(bArr3, 6, 4);
                long zza9 = j16 + zza(bArr3, 9, 6);
                long j19 = zza2;
                long zza10 = j17 + (zza(bArr3, 12, 8) | (bArr3[16] << 24));
                long j20 = (zza6 * zza) + (zza7 * j13) + (zza8 * j12) + (zza9 * j11) + (zza10 * j10);
                long j21 = (zza6 * j19) + (zza7 * zza) + (zza8 * j13) + (zza9 * j12) + (zza10 * j11);
                long j22 = (zza6 * zza3) + (zza7 * j19) + (zza8 * zza) + (zza9 * j13) + (zza10 * j12);
                long j23 = (zza6 * zza4) + (zza7 * zza3) + (zza8 * j19) + (zza9 * zza) + (zza10 * j13);
                long j24 = j21 + (j20 >> 26);
                long j25 = j22 + (j24 >> 26);
                long j26 = j23 + (j25 >> 26);
                long j27 = (zza6 * zza5) + (zza7 * zza4) + (zza8 * zza3) + (zza9 * j19) + (zza10 * zza) + (j26 >> 26);
                long j28 = (j20 & 67108863) + ((j27 >> 26) * 5);
                j14 = (j24 & 67108863) + (j28 >> 26);
                i13 += 16;
                j15 = j25 & 67108863;
                j16 = j26 & 67108863;
                j17 = j27 & 67108863;
                i12 = 17;
                i10 = 3;
                j18 = j28 & 67108863;
                zza2 = j19;
                i11 = 2;
            }
            long j29 = j15 + (j14 >> 26);
            long j30 = j29 & 67108863;
            long j31 = j16 + (j29 >> 26);
            long j32 = j31 & 67108863;
            long j33 = j17 + (j31 >> 26);
            long j34 = j33 & 67108863;
            long j35 = j18 + ((j33 >> 26) * 5);
            long j36 = j35 & 67108863;
            long j37 = (j14 & 67108863) + (j35 >> 26);
            long j38 = j36 + 5;
            long j39 = j38 & 67108863;
            long j40 = (j38 >> 26) + j37;
            long j41 = j30 + (j40 >> 26);
            long j42 = j32 + (j41 >> 26);
            long j43 = (j34 + (j42 >> 26)) - 67108864;
            long j44 = j43 >> 63;
            long j45 = ~j44;
            long j46 = (j37 & j44) | (j40 & 67108863 & j45);
            long j47 = (j30 & j44) | (j41 & 67108863 & j45);
            long j48 = (j32 & j44) | (j42 & 67108863 & j45);
            long j49 = ((j46 << 26) | (j36 & j44) | (j39 & j45)) & BodyPartID.bodyIdMax;
            long j50 = ((j46 >> 6) | (j47 << 20)) & BodyPartID.bodyIdMax;
            long j51 = ((j47 >> 12) | (j48 << 14)) & BodyPartID.bodyIdMax;
            long j52 = ((((j43 & j45) | (j34 & j44)) << 8) | (j48 >> 18)) & BodyPartID.bodyIdMax;
            long zza11 = j49 + zza(bArr, 16);
            long j53 = zza11 & BodyPartID.bodyIdMax;
            long zza12 = j50 + zza(bArr, 20) + (zza11 >> 32);
            long j54 = zza12 & BodyPartID.bodyIdMax;
            long zza13 = j51 + zza(bArr, 24) + (zza12 >> 32);
            long j55 = zza13 & BodyPartID.bodyIdMax;
            long zza14 = (j52 + zza(bArr, 28) + (zza13 >> 32)) & BodyPartID.bodyIdMax;
            byte[] bArr4 = new byte[16];
            zza(bArr4, j53, 0);
            zza(bArr4, j54, 4);
            zza(bArr4, j55, 8);
            zza(bArr4, zza14, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }
}
