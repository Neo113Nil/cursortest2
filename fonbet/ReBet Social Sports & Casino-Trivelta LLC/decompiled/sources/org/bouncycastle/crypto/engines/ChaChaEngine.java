package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: classes5.dex */
public class ChaChaEngine extends Salsa20Engine {
    public ChaChaEngine() {
    }

    public static void chachaCore(int i10, int[] iArr, int[] iArr2) {
        int i11 = 16;
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i10 % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        char c10 = 3;
        int i15 = iArr[3];
        char c11 = 4;
        int i16 = iArr[4];
        char c12 = 5;
        int i17 = iArr[5];
        char c13 = 6;
        int i18 = iArr[6];
        int i19 = 7;
        int i20 = iArr[7];
        int i21 = 8;
        int i22 = iArr[8];
        int i23 = iArr[9];
        int i24 = iArr[10];
        int i25 = iArr[11];
        int i26 = 12;
        int i27 = iArr[12];
        int i28 = iArr[13];
        int i29 = iArr[14];
        int i30 = iArr[15];
        int i31 = i29;
        int i32 = i28;
        int i33 = i27;
        int i34 = i25;
        int i35 = i24;
        int i36 = i23;
        int i37 = i22;
        int i38 = i20;
        int i39 = i18;
        int i40 = i17;
        int i41 = i16;
        int i42 = i15;
        int i43 = i14;
        int i44 = i13;
        int i45 = i12;
        int i46 = i10;
        while (i46 > 0) {
            int i47 = i45 + i41;
            char c14 = c10;
            int rotateLeft = Integers.rotateLeft(i33 ^ i47, i11);
            int i48 = i37 + rotateLeft;
            int rotateLeft2 = Integers.rotateLeft(i41 ^ i48, i26);
            int i49 = i47 + rotateLeft2;
            int rotateLeft3 = Integers.rotateLeft(rotateLeft ^ i49, i21);
            int i50 = i48 + rotateLeft3;
            int rotateLeft4 = Integers.rotateLeft(rotateLeft2 ^ i50, i19);
            int i51 = i44 + i40;
            char c15 = c11;
            int rotateLeft5 = Integers.rotateLeft(i32 ^ i51, i11);
            int i52 = i36 + rotateLeft5;
            char c16 = c12;
            int rotateLeft6 = Integers.rotateLeft(i40 ^ i52, i26);
            int i53 = i51 + rotateLeft6;
            int rotateLeft7 = Integers.rotateLeft(rotateLeft5 ^ i53, i21);
            int i54 = i52 + rotateLeft7;
            int rotateLeft8 = Integers.rotateLeft(rotateLeft6 ^ i54, i19);
            int i55 = i43 + i39;
            char c17 = c13;
            int rotateLeft9 = Integers.rotateLeft(i31 ^ i55, i11);
            int i56 = i35 + rotateLeft9;
            int rotateLeft10 = Integers.rotateLeft(i39 ^ i56, i26);
            int i57 = i55 + rotateLeft10;
            int rotateLeft11 = Integers.rotateLeft(rotateLeft9 ^ i57, i21);
            int i58 = i56 + rotateLeft11;
            int rotateLeft12 = Integers.rotateLeft(rotateLeft10 ^ i58, i19);
            int i59 = i42 + i38;
            int rotateLeft13 = Integers.rotateLeft(i30 ^ i59, 16);
            int i60 = i34 + rotateLeft13;
            int rotateLeft14 = Integers.rotateLeft(i38 ^ i60, i26);
            int i61 = i59 + rotateLeft14;
            int rotateLeft15 = Integers.rotateLeft(rotateLeft13 ^ i61, 8);
            int i62 = i60 + rotateLeft15;
            int rotateLeft16 = Integers.rotateLeft(rotateLeft14 ^ i62, 7);
            int i63 = i49 + rotateLeft8;
            int rotateLeft17 = Integers.rotateLeft(rotateLeft15 ^ i63, 16);
            int i64 = i58 + rotateLeft17;
            int rotateLeft18 = Integers.rotateLeft(rotateLeft8 ^ i64, 12);
            i45 = i63 + rotateLeft18;
            i30 = Integers.rotateLeft(rotateLeft17 ^ i45, 8);
            i35 = i64 + i30;
            i40 = Integers.rotateLeft(rotateLeft18 ^ i35, 7);
            int i65 = i53 + rotateLeft12;
            int rotateLeft19 = Integers.rotateLeft(rotateLeft3 ^ i65, 16);
            int i66 = i62 + rotateLeft19;
            int rotateLeft20 = Integers.rotateLeft(rotateLeft12 ^ i66, 12);
            i44 = i65 + rotateLeft20;
            i33 = Integers.rotateLeft(rotateLeft19 ^ i44, 8);
            i34 = i66 + i33;
            i39 = Integers.rotateLeft(rotateLeft20 ^ i34, 7);
            int i67 = i57 + rotateLeft16;
            int rotateLeft21 = Integers.rotateLeft(rotateLeft7 ^ i67, 16);
            int i68 = i50 + rotateLeft21;
            int rotateLeft22 = Integers.rotateLeft(rotateLeft16 ^ i68, 12);
            i43 = i67 + rotateLeft22;
            i32 = Integers.rotateLeft(rotateLeft21 ^ i43, 8);
            i37 = i68 + i32;
            i38 = Integers.rotateLeft(rotateLeft22 ^ i37, 7);
            int i69 = i61 + rotateLeft4;
            int rotateLeft23 = Integers.rotateLeft(rotateLeft11 ^ i69, 16);
            int i70 = i54 + rotateLeft23;
            int rotateLeft24 = Integers.rotateLeft(rotateLeft4 ^ i70, 12);
            i42 = i69 + rotateLeft24;
            i31 = Integers.rotateLeft(rotateLeft23 ^ i42, 8);
            i36 = i70 + i31;
            i41 = Integers.rotateLeft(rotateLeft24 ^ i36, 7);
            i46 -= 2;
            i11 = 16;
            c10 = c14;
            c11 = c15;
            c12 = c16;
            c13 = c17;
            i19 = 7;
            i21 = 8;
            i26 = 12;
        }
        char c18 = c10;
        char c19 = c11;
        char c20 = c12;
        char c21 = c13;
        iArr2[0] = i45 + iArr[0];
        iArr2[1] = i44 + iArr[1];
        iArr2[2] = i43 + iArr[2];
        iArr2[c18] = i42 + iArr[c18];
        iArr2[c19] = i41 + iArr[c19];
        iArr2[c20] = i40 + iArr[c20];
        iArr2[c21] = i39 + iArr[c21];
        iArr2[7] = i38 + iArr[7];
        iArr2[8] = i37 + iArr[8];
        iArr2[9] = i36 + iArr[9];
        iArr2[10] = i35 + iArr[10];
        iArr2[11] = i34 + iArr[11];
        iArr2[12] = i33 + iArr[12];
        iArr2[13] = i32 + iArr[13];
        iArr2[14] = i31 + iArr[14];
        iArr2[15] = i30 + iArr[15];
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void advanceCounter() {
        int[] iArr = this.engineState;
        int i10 = iArr[12] + 1;
        iArr[12] = i10;
        if (i10 == 0) {
            iArr[13] = iArr[13] + 1;
        }
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void generateKeyStream(byte[] bArr) {
        chachaCore(this.rounds, this.engineState, this.f61649x);
        Pack.intToLittleEndian(this.f61649x, bArr, 0);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine, org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "ChaCha" + this.rounds;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public long getCounter() {
        int[] iArr = this.engineState;
        return (iArr[13] << 32) | (iArr[12] & BodyPartID.bodyIdMax);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void resetCounter() {
        int[] iArr = this.engineState;
        iArr[13] = 0;
        iArr[12] = 0;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void retreatCounter() {
        int[] iArr = this.engineState;
        int i10 = iArr[12];
        if (i10 == 0 && iArr[13] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        int i11 = i10 - 1;
        iArr[12] = i11;
        if (i11 == -1) {
            iArr[13] = iArr[13] - 1;
        }
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            packTauOrSigma(bArr.length, this.engineState, 0);
            Pack.littleEndianToInt(bArr, 0, this.engineState, 4, 4);
            Pack.littleEndianToInt(bArr, bArr.length - 16, this.engineState, 8, 4);
        }
        Pack.littleEndianToInt(bArr2, 0, this.engineState, 14, 2);
    }

    public ChaChaEngine(int i10) {
        super(i10);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void advanceCounter(long j10) {
        int i10 = (int) (j10 >>> 32);
        int i11 = (int) j10;
        if (i10 > 0) {
            int[] iArr = this.engineState;
            iArr[13] = iArr[13] + i10;
        }
        int[] iArr2 = this.engineState;
        int i12 = iArr2[12];
        int i13 = i11 + i12;
        iArr2[12] = i13;
        if (i12 == 0 || i13 >= i12) {
            return;
        }
        iArr2[13] = iArr2[13] + 1;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void retreatCounter(long j10) {
        int i10 = (int) (j10 >>> 32);
        int i11 = (int) j10;
        if (i10 != 0) {
            int[] iArr = this.engineState;
            int i12 = iArr[13];
            if ((i12 & BodyPartID.bodyIdMax) < (i10 & BodyPartID.bodyIdMax)) {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
            iArr[13] = i12 - i10;
        }
        int[] iArr2 = this.engineState;
        int i13 = iArr2[12];
        if ((i13 & BodyPartID.bodyIdMax) >= (BodyPartID.bodyIdMax & i11)) {
            iArr2[12] = i13 - i11;
            return;
        }
        int i14 = iArr2[13];
        if (i14 == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        iArr2[13] = i14 - 1;
        iArr2[12] = i13 - i11;
    }
}
