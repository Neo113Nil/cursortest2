package org.bouncycastle.crypto.engines;

import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: classes5.dex */
public class NoekeonEngine implements BlockCipher {
    private static final int SIZE = 16;
    private static final byte[] roundConstants = {ByteCompanionObject.MIN_VALUE, 27, 54, 108, -40, -85, 77, -102, 47, 94, PSSSigner.TRAILER_IMPLICIT, 99, -58, -105, 53, 106, -44};
    private boolean _forEncryption;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f61639k = new int[4];
    private boolean _initialised = false;

    private int decryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int bigEndianToInt = Pack.bigEndianToInt(bArr, i10);
        int bigEndianToInt2 = Pack.bigEndianToInt(bArr, i10 + 4);
        int bigEndianToInt3 = Pack.bigEndianToInt(bArr, i10 + 8);
        int bigEndianToInt4 = Pack.bigEndianToInt(bArr, i10 + 12);
        int[] iArr = this.f61639k;
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        int i16 = 16;
        while (true) {
            int i17 = bigEndianToInt ^ bigEndianToInt3;
            int rotateLeft = i17 ^ (Integers.rotateLeft(i17, 8) ^ Integers.rotateLeft(i17, 24));
            int i18 = (bigEndianToInt2 ^ rotateLeft) ^ i13;
            int i19 = (bigEndianToInt4 ^ rotateLeft) ^ i15;
            int i20 = i18 ^ i19;
            int rotateLeft2 = (Integers.rotateLeft(i20, 24) ^ Integers.rotateLeft(i20, 8)) ^ i20;
            int i21 = (bigEndianToInt3 ^ i14) ^ rotateLeft2;
            int i22 = ((bigEndianToInt ^ i12) ^ rotateLeft2) ^ (roundConstants[i16] & UByte.MAX_VALUE);
            i16--;
            if (i16 < 0) {
                Pack.intToBigEndian(i22, bArr2, i11);
                Pack.intToBigEndian(i18, bArr2, i11 + 4);
                Pack.intToBigEndian(i21, bArr2, i11 + 8);
                Pack.intToBigEndian(i19, bArr2, i11 + 12);
                return 16;
            }
            int rotateLeft3 = Integers.rotateLeft(i18, 1);
            int rotateLeft4 = Integers.rotateLeft(i21, 5);
            int rotateLeft5 = Integers.rotateLeft(i19, 2);
            int i23 = rotateLeft3 ^ ((~rotateLeft5) & (~rotateLeft4));
            int i24 = i22 ^ (rotateLeft4 & i23);
            int i25 = rotateLeft4 ^ ((rotateLeft5 ^ i23) ^ i24);
            int i26 = i23 ^ ((~i24) & (~i25));
            int i27 = rotateLeft5 ^ (i25 & i26);
            bigEndianToInt2 = Integers.rotateLeft(i26, 31);
            bigEndianToInt3 = Integers.rotateLeft(i25, 27);
            int rotateLeft6 = Integers.rotateLeft(i24, 30);
            bigEndianToInt = i27;
            bigEndianToInt4 = rotateLeft6;
        }
    }

    private int encryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int bigEndianToInt = Pack.bigEndianToInt(bArr, i10);
        int bigEndianToInt2 = Pack.bigEndianToInt(bArr, i10 + 4);
        int bigEndianToInt3 = Pack.bigEndianToInt(bArr, i10 + 8);
        int bigEndianToInt4 = Pack.bigEndianToInt(bArr, i10 + 12);
        int[] iArr = this.f61639k;
        int i12 = 0;
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = iArr[2];
        int i16 = iArr[3];
        while (true) {
            int i17 = bigEndianToInt ^ (roundConstants[i12] & UByte.MAX_VALUE);
            int i18 = i17 ^ bigEndianToInt3;
            int rotateLeft = i18 ^ (Integers.rotateLeft(i18, 8) ^ Integers.rotateLeft(i18, 24));
            int i19 = (bigEndianToInt2 ^ rotateLeft) ^ i14;
            int i20 = (bigEndianToInt4 ^ rotateLeft) ^ i16;
            int i21 = i19 ^ i20;
            int rotateLeft2 = (Integers.rotateLeft(i21, 24) ^ Integers.rotateLeft(i21, 8)) ^ i21;
            int i22 = (i17 ^ i13) ^ rotateLeft2;
            int i23 = (bigEndianToInt3 ^ i15) ^ rotateLeft2;
            i12++;
            if (i12 > 16) {
                Pack.intToBigEndian(i22, bArr2, i11);
                Pack.intToBigEndian(i19, bArr2, i11 + 4);
                Pack.intToBigEndian(i23, bArr2, i11 + 8);
                Pack.intToBigEndian(i20, bArr2, i11 + 12);
                return 16;
            }
            int rotateLeft3 = Integers.rotateLeft(i19, 1);
            int rotateLeft4 = Integers.rotateLeft(i23, 5);
            int rotateLeft5 = Integers.rotateLeft(i20, 2);
            int i24 = rotateLeft3 ^ ((~rotateLeft5) & (~rotateLeft4));
            int i25 = i22 ^ (rotateLeft4 & i24);
            int i26 = rotateLeft4 ^ ((rotateLeft5 ^ i24) ^ i25);
            int i27 = i24 ^ ((~i25) & (~i26));
            int i28 = rotateLeft5 ^ (i26 & i27);
            bigEndianToInt2 = Integers.rotateLeft(i27, 31);
            bigEndianToInt3 = Integers.rotateLeft(i26, 27);
            int rotateLeft6 = Integers.rotateLeft(i25, 30);
            bigEndianToInt = i28;
            bigEndianToInt4 = rotateLeft6;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Noekeon";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to Noekeon init - " + cipherParameters.getClass().getName());
        }
        this._forEncryption = z10;
        this._initialised = true;
        Pack.bigEndianToInt(((KeyParameter) cipherParameters).getKey(), 0, this.f61639k, 0, 4);
        if (z10) {
            return;
        }
        int[] iArr = this.f61639k;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = i10 ^ i12;
        int rotateLeft = i14 ^ (Integers.rotateLeft(i14, 8) ^ Integers.rotateLeft(i14, 24));
        int i15 = i11 ^ rotateLeft;
        int i16 = i13 ^ rotateLeft;
        int i17 = i15 ^ i16;
        int rotateLeft2 = i17 ^ (Integers.rotateLeft(i17, 8) ^ Integers.rotateLeft(i17, 24));
        int i18 = i10 ^ rotateLeft2;
        int i19 = i12 ^ rotateLeft2;
        int[] iArr2 = this.f61639k;
        iArr2[0] = i18;
        iArr2[1] = i15;
        iArr2[2] = i19;
        iArr2[3] = i16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (!this._initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i10 > bArr.length - 16) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 <= bArr2.length - 16) {
            return this._forEncryption ? encryptBlock(bArr, i10, bArr2, i11) : decryptBlock(bArr, i10, bArr2, i11);
        }
        throw new OutputLengthException("output buffer too short");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
