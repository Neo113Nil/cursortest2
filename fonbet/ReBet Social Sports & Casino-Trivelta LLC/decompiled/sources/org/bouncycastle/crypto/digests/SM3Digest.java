package org.bouncycastle.crypto.digests;

import kotlin.UByte;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes5.dex */
public class SM3Digest extends GeneralDigest {
    private static final int BLOCK_SIZE = 16;
    private static final int DIGEST_LENGTH = 32;

    /* renamed from: T, reason: collision with root package name */
    private static final int[] f61542T = new int[64];

    /* renamed from: V, reason: collision with root package name */
    private int[] f61543V;

    /* renamed from: W, reason: collision with root package name */
    private int[] f61544W;
    private int[] inwords;
    private int xOff;

    static {
        int i10;
        int i11 = 0;
        while (true) {
            if (i11 >= 16) {
                break;
            }
            f61542T[i11] = (2043430169 >>> (32 - i11)) | (2043430169 << i11);
            i11++;
        }
        for (i10 = 16; i10 < 64; i10++) {
            int i12 = i10 % 32;
            f61542T[i10] = (2055708042 >>> (32 - i12)) | (2055708042 << i12);
        }
    }

    public SM3Digest() {
        this.f61543V = new int[8];
        this.inwords = new int[16];
        this.f61544W = new int[68];
        reset();
    }

    private int FF0(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    private int FF1(int i10, int i11, int i12) {
        return (i10 & (i11 | i12)) | (i11 & i12);
    }

    private int GG0(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    private int GG1(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    private int P0(int i10) {
        return (i10 ^ ((i10 << 9) | (i10 >>> 23))) ^ ((i10 << 17) | (i10 >>> 15));
    }

    private int P1(int i10) {
        return (i10 ^ ((i10 << 15) | (i10 >>> 17))) ^ ((i10 << 23) | (i10 >>> 9));
    }

    private void copyIn(SM3Digest sM3Digest) {
        int[] iArr = sM3Digest.f61543V;
        int[] iArr2 = this.f61543V;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = sM3Digest.inwords;
        int[] iArr4 = this.inwords;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.xOff = sM3Digest.xOff;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SM3Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        Pack.intToBigEndian(this.f61543V, bArr, i10);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SM3";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i10;
        int i11 = 0;
        while (true) {
            if (i11 >= 16) {
                break;
            }
            this.f61544W[i11] = this.inwords[i11];
            i11++;
        }
        for (int i12 = 16; i12 < 68; i12++) {
            int[] iArr = this.f61544W;
            int i13 = iArr[i12 - 3];
            int i14 = iArr[i12 - 13];
            iArr[i12] = (P1(((i13 >>> 17) | (i13 << 15)) ^ (iArr[i12 - 16] ^ iArr[i12 - 9])) ^ ((i14 >>> 25) | (i14 << 7))) ^ this.f61544W[i12 - 6];
        }
        int[] iArr2 = this.f61543V;
        int i15 = iArr2[0];
        int i16 = iArr2[1];
        int i17 = iArr2[2];
        char c10 = 3;
        int i18 = iArr2[3];
        int i19 = iArr2[4];
        int i20 = iArr2[5];
        int i21 = iArr2[6];
        int i22 = iArr2[7];
        int i23 = i21;
        int i24 = 0;
        for (i10 = 16; i24 < i10; i10 = 16) {
            int i25 = (i15 << 12) | (i15 >>> 20);
            int i26 = i25 + i19 + f61542T[i24];
            int i27 = (i26 << 7) | (i26 >>> 25);
            int[] iArr3 = this.f61544W;
            int i28 = iArr3[i24];
            int i29 = i28 ^ iArr3[i24 + 4];
            int FF0 = FF0(i15, i16, i17) + i18;
            int GG0 = GG0(i19, i20, i23) + i22 + i27 + i28;
            int i30 = (i16 << 9) | (i16 >>> 23);
            int i31 = (i20 << 19) | (i20 >>> 13);
            i24++;
            i20 = i19;
            i19 = P0(GG0);
            i18 = i17;
            i17 = i30;
            i22 = i23;
            i23 = i31;
            i16 = i15;
            i15 = FF0 + (i27 ^ i25) + i29;
        }
        int i32 = i22;
        int i33 = i23;
        int i34 = i15;
        int i35 = 16;
        while (i35 < 64) {
            int i36 = (i34 << 12) | (i34 >>> 20);
            int i37 = i36 + i19 + f61542T[i35];
            int i38 = (i37 << 7) | (i37 >>> 25);
            char c11 = c10;
            int[] iArr4 = this.f61544W;
            int i39 = iArr4[i35];
            int FF1 = FF1(i34, i16, i17) + i18 + (i38 ^ i36) + (i39 ^ iArr4[i35 + 4]);
            int GG1 = GG1(i19, i20, i33) + i32 + i38 + i39;
            int i40 = (i16 << 9) | (i16 >>> 23);
            int i41 = (i20 << 19) | (i20 >>> 13);
            i35++;
            i18 = i17;
            i20 = i19;
            i17 = i40;
            i19 = P0(GG1);
            c10 = c11;
            i32 = i33;
            i33 = i41;
            i16 = i34;
            i34 = FF1;
        }
        char c12 = c10;
        int[] iArr5 = this.f61543V;
        iArr5[0] = i34 ^ iArr5[0];
        iArr5[1] = iArr5[1] ^ i16;
        iArr5[2] = iArr5[2] ^ i17;
        iArr5[c12] = iArr5[c12] ^ i18;
        iArr5[4] = iArr5[4] ^ i19;
        iArr5[5] = iArr5[5] ^ i20;
        iArr5[6] = i33 ^ iArr5[6];
        iArr5[7] = iArr5[7] ^ i32;
        this.xOff = 0;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j10) {
        int i10 = this.xOff;
        if (i10 > 14) {
            this.inwords[i10] = 0;
            this.xOff = i10 + 1;
            processBlock();
        }
        while (true) {
            int i11 = this.xOff;
            if (i11 >= 14) {
                int[] iArr = this.inwords;
                int i12 = i11 + 1;
                this.xOff = i12;
                iArr[i11] = (int) (j10 >>> 32);
                this.xOff = i11 + 2;
                iArr[i12] = (int) j10;
                return;
            }
            this.inwords[i11] = 0;
            this.xOff = i11 + 1;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 3] & UByte.MAX_VALUE) | ((bArr[i10] & UByte.MAX_VALUE) << 24) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8);
        int[] iArr = this.inwords;
        int i12 = this.xOff;
        iArr[i12] = i11;
        int i13 = i12 + 1;
        this.xOff = i13;
        if (i13 >= 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        int[] iArr = this.f61543V;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.xOff = 0;
    }

    public SM3Digest(SM3Digest sM3Digest) {
        super(sM3Digest);
        this.f61543V = new int[8];
        this.inwords = new int[16];
        this.f61544W = new int[68];
        copyIn(sM3Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SM3Digest sM3Digest = (SM3Digest) memoable;
        super.copyIn((GeneralDigest) sM3Digest);
        copyIn(sM3Digest);
    }
}
