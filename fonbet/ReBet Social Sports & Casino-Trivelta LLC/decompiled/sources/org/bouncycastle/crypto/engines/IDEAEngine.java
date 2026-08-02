package org.bouncycastle.crypto.engines;

import kotlin.UByte;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: classes5.dex */
public class IDEAEngine implements BlockCipher {
    private static final int BASE = 65537;
    protected static final int BLOCK_SIZE = 8;
    private static final int MASK = 65535;
    private int[] workingKey = null;

    private int bytesToWord(byte[] bArr, int i10) {
        return ((bArr[i10] << 8) & 65280) + (bArr[i10 + 1] & UByte.MAX_VALUE);
    }

    private int[] expandKey(byte[] bArr) {
        int i10;
        int[] iArr = new int[52];
        int i11 = 0;
        if (bArr.length < 16) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        while (true) {
            if (i11 >= 8) {
                break;
            }
            iArr[i11] = bytesToWord(bArr, i11 * 2);
            i11++;
        }
        for (i10 = 8; i10 < 52; i10++) {
            int i12 = i10 & 7;
            if (i12 < 6) {
                iArr[i10] = (((iArr[i10 - 7] & 127) << 9) | (iArr[i10 - 6] >> 7)) & 65535;
            } else if (i12 == 6) {
                iArr[i10] = (((iArr[i10 - 7] & 127) << 9) | (iArr[i10 - 14] >> 7)) & 65535;
            } else {
                iArr[i10] = (((iArr[i10 - 15] & 127) << 9) | (iArr[i10 - 14] >> 7)) & 65535;
            }
        }
        return iArr;
    }

    private int[] generateWorkingKey(boolean z10, byte[] bArr) {
        return z10 ? expandKey(bArr) : invertKey(expandKey(bArr));
    }

    private void ideaFunc(int[] iArr, byte[] bArr, int i10, byte[] bArr2, int i11) {
        int bytesToWord = bytesToWord(bArr, i10);
        int bytesToWord2 = bytesToWord(bArr, i10 + 2);
        int bytesToWord3 = bytesToWord(bArr, i10 + 4);
        int bytesToWord4 = bytesToWord(bArr, i10 + 6);
        int i12 = 0;
        int i13 = bytesToWord3;
        int i14 = bytesToWord2;
        int i15 = bytesToWord;
        int i16 = 0;
        while (i12 < 8) {
            int mul = mul(i15, iArr[i16]);
            int i17 = (i14 + iArr[i16 + 1]) & 65535;
            int i18 = (i13 + iArr[i16 + 2]) & 65535;
            int mul2 = mul(bytesToWord4, iArr[i16 + 3]);
            int i19 = i16 + 5;
            int mul3 = mul(i18 ^ mul, iArr[i16 + 4]);
            i16 += 6;
            int mul4 = mul(((i17 ^ mul2) + mul3) & 65535, iArr[i19]);
            int i20 = 65535 & (mul3 + mul4);
            i15 = mul ^ mul4;
            bytesToWord4 = mul2 ^ i20;
            int i21 = i18 ^ mul4;
            i12++;
            i13 = i17 ^ i20;
            i14 = i21;
        }
        wordToBytes(mul(i15, iArr[i16]), bArr2, i11);
        wordToBytes(i13 + iArr[i16 + 1], bArr2, i11 + 2);
        wordToBytes(i14 + iArr[i16 + 2], bArr2, i11 + 4);
        wordToBytes(mul(bytesToWord4, iArr[i16 + 3]), bArr2, i11 + 6);
    }

    private int[] invertKey(int[] iArr) {
        int[] iArr2 = new int[52];
        int mulInv = mulInv(iArr[0]);
        int addInv = addInv(iArr[1]);
        int addInv2 = addInv(iArr[2]);
        iArr2[51] = mulInv(iArr[3]);
        iArr2[50] = addInv2;
        iArr2[49] = addInv;
        int i10 = 48;
        iArr2[48] = mulInv;
        int i11 = 4;
        for (int i12 = 1; i12 < 8; i12++) {
            int i13 = iArr[i11];
            iArr2[i10 - 1] = iArr[i11 + 1];
            iArr2[i10 - 2] = i13;
            int mulInv2 = mulInv(iArr[i11 + 2]);
            int addInv3 = addInv(iArr[i11 + 3]);
            int i14 = i11 + 5;
            int addInv4 = addInv(iArr[i11 + 4]);
            i11 += 6;
            iArr2[i10 - 3] = mulInv(iArr[i14]);
            iArr2[i10 - 4] = addInv3;
            iArr2[i10 - 5] = addInv4;
            i10 -= 6;
            iArr2[i10] = mulInv2;
        }
        int i15 = iArr[i11];
        iArr2[i10 - 1] = iArr[i11 + 1];
        iArr2[i10 - 2] = i15;
        int mulInv3 = mulInv(iArr[i11 + 2]);
        int addInv5 = addInv(iArr[i11 + 3]);
        int addInv6 = addInv(iArr[i11 + 4]);
        iArr2[i10 - 3] = mulInv(iArr[i11 + 5]);
        iArr2[i10 - 4] = addInv6;
        iArr2[i10 - 5] = addInv5;
        iArr2[i10 - 6] = mulInv3;
        return iArr2;
    }

    private int mul(int i10, int i11) {
        int i12;
        if (i10 == 0) {
            i12 = BASE - i11;
        } else if (i11 == 0) {
            i12 = BASE - i10;
        } else {
            int i13 = i10 * i11;
            int i14 = i13 & 65535;
            int i15 = i13 >>> 16;
            i12 = (i14 - i15) + (i14 < i15 ? 1 : 0);
        }
        return i12 & 65535;
    }

    private int mulInv(int i10) {
        if (i10 < 2) {
            return i10;
        }
        int i11 = BASE / i10;
        int i12 = BASE % i10;
        int i13 = 1;
        while (i12 != 1) {
            int i14 = i10 / i12;
            i10 %= i12;
            i13 = (i13 + (i14 * i11)) & 65535;
            if (i10 == 1) {
                return i13;
            }
            int i15 = i12 / i10;
            i12 %= i10;
            i11 = (i11 + (i15 * i13)) & 65535;
        }
        return (1 - i11) & 65535;
    }

    private void wordToBytes(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) (i10 >>> 8);
        bArr[i11 + 1] = (byte) i10;
    }

    public int addInv(int i10) {
        return (0 - i10) & 65535;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "IDEA";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.workingKey = generateWorkingKey(z10, ((KeyParameter) cipherParameters).getKey());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to IDEA init - " + cipherParameters.getClass().getName());
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArr = this.workingKey;
        if (iArr == null) {
            throw new IllegalStateException("IDEA engine not initialised");
        }
        if (i10 + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        ideaFunc(iArr, bArr, i10, bArr2, i11);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
