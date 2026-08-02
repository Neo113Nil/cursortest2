package org.bouncycastle.crypto.digests;

import kotlin.UByte;
import org.bouncycastle.util.Memoable;

/* loaded from: classes5.dex */
public class MD4Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 16;
    private static final int S11 = 3;
    private static final int S12 = 7;
    private static final int S13 = 11;
    private static final int S14 = 19;
    private static final int S21 = 3;
    private static final int S22 = 5;
    private static final int S23 = 9;
    private static final int S24 = 13;
    private static final int S31 = 3;
    private static final int S32 = 9;
    private static final int S33 = 11;
    private static final int S34 = 15;

    /* renamed from: H1, reason: collision with root package name */
    private int f61471H1;

    /* renamed from: H2, reason: collision with root package name */
    private int f61472H2;

    /* renamed from: H3, reason: collision with root package name */
    private int f61473H3;

    /* renamed from: H4, reason: collision with root package name */
    private int f61474H4;

    /* renamed from: X, reason: collision with root package name */
    private int[] f61475X;
    private int xOff;

    public MD4Digest() {
        this.f61475X = new int[16];
        reset();
    }

    private int F(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    private int G(int i10, int i11, int i12) {
        return (i10 & (i11 | i12)) | (i11 & i12);
    }

    private int H(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    private void copyIn(MD4Digest mD4Digest) {
        super.copyIn((GeneralDigest) mD4Digest);
        this.f61471H1 = mD4Digest.f61471H1;
        this.f61472H2 = mD4Digest.f61472H2;
        this.f61473H3 = mD4Digest.f61473H3;
        this.f61474H4 = mD4Digest.f61474H4;
        int[] iArr = mD4Digest.f61475X;
        System.arraycopy(iArr, 0, this.f61475X, 0, iArr.length);
        this.xOff = mD4Digest.xOff;
    }

    private int rotateLeft(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    private void unpackWord(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 3] = (byte) (i10 >>> 24);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new MD4Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        unpackWord(this.f61471H1, bArr, i10);
        unpackWord(this.f61472H2, bArr, i10 + 4);
        unpackWord(this.f61473H3, bArr, i10 + 8);
        unpackWord(this.f61474H4, bArr, i10 + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "MD4";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i10 = this.f61471H1;
        int i11 = this.f61472H2;
        int i12 = this.f61473H3;
        int i13 = this.f61474H4;
        int rotateLeft = rotateLeft(i10 + F(i11, i12, i13) + this.f61475X[0], 3);
        int rotateLeft2 = rotateLeft(i13 + F(rotateLeft, i11, i12) + this.f61475X[1], 7);
        int rotateLeft3 = rotateLeft(i12 + F(rotateLeft2, rotateLeft, i11) + this.f61475X[2], 11);
        int rotateLeft4 = rotateLeft(i11 + F(rotateLeft3, rotateLeft2, rotateLeft) + this.f61475X[3], 19);
        int rotateLeft5 = rotateLeft(rotateLeft + F(rotateLeft4, rotateLeft3, rotateLeft2) + this.f61475X[4], 3);
        int rotateLeft6 = rotateLeft(rotateLeft2 + F(rotateLeft5, rotateLeft4, rotateLeft3) + this.f61475X[5], 7);
        int rotateLeft7 = rotateLeft(rotateLeft3 + F(rotateLeft6, rotateLeft5, rotateLeft4) + this.f61475X[6], 11);
        int rotateLeft8 = rotateLeft(rotateLeft4 + F(rotateLeft7, rotateLeft6, rotateLeft5) + this.f61475X[7], 19);
        int rotateLeft9 = rotateLeft(rotateLeft5 + F(rotateLeft8, rotateLeft7, rotateLeft6) + this.f61475X[8], 3);
        int rotateLeft10 = rotateLeft(rotateLeft6 + F(rotateLeft9, rotateLeft8, rotateLeft7) + this.f61475X[9], 7);
        int rotateLeft11 = rotateLeft(rotateLeft7 + F(rotateLeft10, rotateLeft9, rotateLeft8) + this.f61475X[10], 11);
        int rotateLeft12 = rotateLeft(rotateLeft8 + F(rotateLeft11, rotateLeft10, rotateLeft9) + this.f61475X[11], 19);
        int rotateLeft13 = rotateLeft(rotateLeft9 + F(rotateLeft12, rotateLeft11, rotateLeft10) + this.f61475X[12], 3);
        int rotateLeft14 = rotateLeft(rotateLeft10 + F(rotateLeft13, rotateLeft12, rotateLeft11) + this.f61475X[13], 7);
        int rotateLeft15 = rotateLeft(rotateLeft11 + F(rotateLeft14, rotateLeft13, rotateLeft12) + this.f61475X[14], 11);
        int rotateLeft16 = rotateLeft(rotateLeft12 + F(rotateLeft15, rotateLeft14, rotateLeft13) + this.f61475X[15], 19);
        int rotateLeft17 = rotateLeft(rotateLeft13 + G(rotateLeft16, rotateLeft15, rotateLeft14) + this.f61475X[0] + 1518500249, 3);
        int rotateLeft18 = rotateLeft(rotateLeft14 + G(rotateLeft17, rotateLeft16, rotateLeft15) + this.f61475X[4] + 1518500249, 5);
        int rotateLeft19 = rotateLeft(rotateLeft15 + G(rotateLeft18, rotateLeft17, rotateLeft16) + this.f61475X[8] + 1518500249, 9);
        int rotateLeft20 = rotateLeft(rotateLeft16 + G(rotateLeft19, rotateLeft18, rotateLeft17) + this.f61475X[12] + 1518500249, 13);
        int rotateLeft21 = rotateLeft(rotateLeft17 + G(rotateLeft20, rotateLeft19, rotateLeft18) + this.f61475X[1] + 1518500249, 3);
        int rotateLeft22 = rotateLeft(rotateLeft18 + G(rotateLeft21, rotateLeft20, rotateLeft19) + this.f61475X[5] + 1518500249, 5);
        int rotateLeft23 = rotateLeft(rotateLeft19 + G(rotateLeft22, rotateLeft21, rotateLeft20) + this.f61475X[9] + 1518500249, 9);
        int rotateLeft24 = rotateLeft(rotateLeft20 + G(rotateLeft23, rotateLeft22, rotateLeft21) + this.f61475X[13] + 1518500249, 13);
        int rotateLeft25 = rotateLeft(rotateLeft21 + G(rotateLeft24, rotateLeft23, rotateLeft22) + this.f61475X[2] + 1518500249, 3);
        int rotateLeft26 = rotateLeft(rotateLeft22 + G(rotateLeft25, rotateLeft24, rotateLeft23) + this.f61475X[6] + 1518500249, 5);
        int rotateLeft27 = rotateLeft(rotateLeft23 + G(rotateLeft26, rotateLeft25, rotateLeft24) + this.f61475X[10] + 1518500249, 9);
        int rotateLeft28 = rotateLeft(rotateLeft24 + G(rotateLeft27, rotateLeft26, rotateLeft25) + this.f61475X[14] + 1518500249, 13);
        int rotateLeft29 = rotateLeft(rotateLeft25 + G(rotateLeft28, rotateLeft27, rotateLeft26) + this.f61475X[3] + 1518500249, 3);
        int rotateLeft30 = rotateLeft(rotateLeft26 + G(rotateLeft29, rotateLeft28, rotateLeft27) + this.f61475X[7] + 1518500249, 5);
        int rotateLeft31 = rotateLeft(rotateLeft27 + G(rotateLeft30, rotateLeft29, rotateLeft28) + this.f61475X[11] + 1518500249, 9);
        int rotateLeft32 = rotateLeft(rotateLeft28 + G(rotateLeft31, rotateLeft30, rotateLeft29) + this.f61475X[15] + 1518500249, 13);
        int rotateLeft33 = rotateLeft(rotateLeft29 + H(rotateLeft32, rotateLeft31, rotateLeft30) + this.f61475X[0] + 1859775393, 3);
        int rotateLeft34 = rotateLeft(rotateLeft30 + H(rotateLeft33, rotateLeft32, rotateLeft31) + this.f61475X[8] + 1859775393, 9);
        int rotateLeft35 = rotateLeft(rotateLeft31 + H(rotateLeft34, rotateLeft33, rotateLeft32) + this.f61475X[4] + 1859775393, 11);
        int rotateLeft36 = rotateLeft(rotateLeft32 + H(rotateLeft35, rotateLeft34, rotateLeft33) + this.f61475X[12] + 1859775393, 15);
        int rotateLeft37 = rotateLeft(rotateLeft33 + H(rotateLeft36, rotateLeft35, rotateLeft34) + this.f61475X[2] + 1859775393, 3);
        int rotateLeft38 = rotateLeft(rotateLeft34 + H(rotateLeft37, rotateLeft36, rotateLeft35) + this.f61475X[10] + 1859775393, 9);
        int rotateLeft39 = rotateLeft(rotateLeft35 + H(rotateLeft38, rotateLeft37, rotateLeft36) + this.f61475X[6] + 1859775393, 11);
        int rotateLeft40 = rotateLeft(rotateLeft36 + H(rotateLeft39, rotateLeft38, rotateLeft37) + this.f61475X[14] + 1859775393, 15);
        int rotateLeft41 = rotateLeft(rotateLeft37 + H(rotateLeft40, rotateLeft39, rotateLeft38) + this.f61475X[1] + 1859775393, 3);
        int rotateLeft42 = rotateLeft(rotateLeft38 + H(rotateLeft41, rotateLeft40, rotateLeft39) + this.f61475X[9] + 1859775393, 9);
        int rotateLeft43 = rotateLeft(rotateLeft39 + H(rotateLeft42, rotateLeft41, rotateLeft40) + this.f61475X[5] + 1859775393, 11);
        int rotateLeft44 = rotateLeft(rotateLeft40 + H(rotateLeft43, rotateLeft42, rotateLeft41) + this.f61475X[13] + 1859775393, 15);
        int rotateLeft45 = rotateLeft(rotateLeft41 + H(rotateLeft44, rotateLeft43, rotateLeft42) + this.f61475X[3] + 1859775393, 3);
        int rotateLeft46 = rotateLeft(rotateLeft42 + H(rotateLeft45, rotateLeft44, rotateLeft43) + this.f61475X[11] + 1859775393, 9);
        int rotateLeft47 = rotateLeft(rotateLeft43 + H(rotateLeft46, rotateLeft45, rotateLeft44) + this.f61475X[7] + 1859775393, 11);
        int rotateLeft48 = rotateLeft(rotateLeft44 + H(rotateLeft47, rotateLeft46, rotateLeft45) + this.f61475X[15] + 1859775393, 15);
        this.f61471H1 += rotateLeft45;
        this.f61472H2 += rotateLeft48;
        this.f61473H3 += rotateLeft47;
        this.f61474H4 += rotateLeft46;
        this.xOff = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f61475X;
            if (i14 == iArr.length) {
                return;
            }
            iArr[i14] = 0;
            i14++;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j10) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f61475X;
        iArr[14] = (int) j10;
        iArr[15] = (int) (j10 >>> 32);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i10) {
        int[] iArr = this.f61475X;
        int i11 = this.xOff;
        int i12 = i11 + 1;
        this.xOff = i12;
        iArr[i11] = ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
        if (i12 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f61471H1 = 1732584193;
        this.f61472H2 = -271733879;
        this.f61473H3 = -1732584194;
        this.f61474H4 = 271733878;
        this.xOff = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f61475X;
            if (i10 == iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }

    public MD4Digest(MD4Digest mD4Digest) {
        super(mD4Digest);
        this.f61475X = new int[16];
        copyIn(mD4Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((MD4Digest) memoable);
    }
}
