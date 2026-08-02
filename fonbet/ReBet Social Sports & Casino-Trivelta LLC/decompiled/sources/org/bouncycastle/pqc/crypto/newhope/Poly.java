package org.bouncycastle.pqc.crypto.newhope;

import android.R;
import kotlin.UByte;
import kotlin.UShort;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Pack;

/* loaded from: classes5.dex */
class Poly {
    public static void add(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i10 = 0; i10 < 1024; i10++) {
            sArr3[i10] = Reduce.barrett((short) (sArr[i10] + sArr2[i10]));
        }
    }

    public static void fromBytes(short[] sArr, byte[] bArr) {
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = i10 * 7;
            int i12 = bArr[i11] & UByte.MAX_VALUE;
            byte b10 = bArr[i11 + 1];
            int i13 = b10 & UByte.MAX_VALUE;
            int i14 = bArr[i11 + 2] & UByte.MAX_VALUE;
            byte b11 = bArr[i11 + 3];
            int i15 = b11 & UByte.MAX_VALUE;
            int i16 = bArr[i11 + 4] & UByte.MAX_VALUE;
            byte b12 = bArr[i11 + 5];
            int i17 = b12 & UByte.MAX_VALUE;
            int i18 = bArr[i11 + 6] & UByte.MAX_VALUE;
            int i19 = i10 * 4;
            sArr[i19] = (short) (i12 | ((b10 & 63) << 8));
            sArr[i19 + 1] = (short) ((i13 >>> 6) | (i14 << 2) | ((b11 & 15) << 10));
            sArr[i19 + 2] = (short) ((i15 >>> 4) | (i16 << 4) | ((b12 & 3) << 12));
            sArr[i19 + 3] = (short) ((i18 << 6) | (i17 >>> 2));
        }
    }

    public static void fromNTT(short[] sArr) {
        NTT.bitReverse(sArr);
        NTT.core(sArr, Precomp.OMEGAS_INV_MONTGOMERY);
        NTT.mulCoefficients(sArr, Precomp.PSIS_INV_MONTGOMERY);
    }

    public static void getNoise(short[] sArr, byte[] bArr, byte b10) {
        byte[] bArr2 = new byte[8];
        bArr2[0] = b10;
        byte[] bArr3 = new byte[4096];
        ChaCha20.process(bArr, bArr2, bArr3, 0, 4096);
        for (int i10 = 0; i10 < 1024; i10++) {
            int bigEndianToInt = Pack.bigEndianToInt(bArr3, i10 * 4);
            int i11 = 0;
            for (int i12 = 0; i12 < 8; i12++) {
                i11 += (bigEndianToInt >> i12) & R.attr.cacheColorHint;
            }
            sArr[i10] = (short) (((((i11 >>> 24) + i11) & 255) + 12289) - (((i11 >>> 16) + (i11 >>> 8)) & 255));
        }
    }

    private static short normalize(short s10) {
        short barrett = Reduce.barrett(s10);
        int i10 = barrett - 12289;
        return (short) (((barrett ^ i10) & (i10 >> 31)) ^ i10);
    }

    public static void pointWise(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i10 = 0; i10 < 1024; i10++) {
            sArr3[i10] = Reduce.montgomery((sArr[i10] & UShort.MAX_VALUE) * (65535 & Reduce.montgomery((sArr2[i10] & UShort.MAX_VALUE) * 3186)));
        }
    }

    public static void toBytes(byte[] bArr, short[] sArr) {
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = i10 * 4;
            short normalize = normalize(sArr[i11]);
            short normalize2 = normalize(sArr[i11 + 1]);
            short normalize3 = normalize(sArr[i11 + 2]);
            short normalize4 = normalize(sArr[i11 + 3]);
            int i12 = i10 * 7;
            bArr[i12] = (byte) normalize;
            bArr[i12 + 1] = (byte) ((normalize >> 8) | (normalize2 << 6));
            bArr[i12 + 2] = (byte) (normalize2 >> 2);
            bArr[i12 + 3] = (byte) ((normalize2 >> 10) | (normalize3 << 4));
            bArr[i12 + 4] = (byte) (normalize3 >> 4);
            bArr[i12 + 5] = (byte) ((normalize3 >> 12) | (normalize4 << 2));
            bArr[i12 + 6] = (byte) (normalize4 >> 6);
        }
    }

    public static void toNTT(short[] sArr) {
        NTT.mulCoefficients(sArr, Precomp.PSIS_BITREV_MONTGOMERY);
        NTT.core(sArr, Precomp.OMEGAS_MONTGOMERY);
    }

    public static void uniform(short[] sArr, byte[] bArr) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
        sHAKEDigest.update(bArr, 0, bArr.length);
        int i10 = 0;
        while (true) {
            byte[] bArr2 = new byte[256];
            sHAKEDigest.doOutput(bArr2, 0, 256);
            for (int i11 = 0; i11 < 256; i11 += 2) {
                int i12 = (bArr2[i11] & UByte.MAX_VALUE) | ((bArr2[i11 + 1] & UByte.MAX_VALUE) << 8);
                if (i12 < 61445) {
                    int i13 = i10 + 1;
                    sArr[i10] = (short) i12;
                    if (i13 == 1024) {
                        return;
                    } else {
                        i10 = i13;
                    }
                }
            }
        }
    }
}
