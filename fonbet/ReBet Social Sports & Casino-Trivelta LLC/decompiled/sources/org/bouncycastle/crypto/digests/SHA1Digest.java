package org.bouncycastle.crypto.digests;

import kotlin.UByte;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes5.dex */
public class SHA1Digest extends GeneralDigest implements EncodableDigest {
    private static final int DIGEST_LENGTH = 20;

    /* renamed from: Y1, reason: collision with root package name */
    private static final int f61512Y1 = 1518500249;

    /* renamed from: Y2, reason: collision with root package name */
    private static final int f61513Y2 = 1859775393;

    /* renamed from: Y3, reason: collision with root package name */
    private static final int f61514Y3 = -1894007588;

    /* renamed from: Y4, reason: collision with root package name */
    private static final int f61515Y4 = -899497514;

    /* renamed from: H1, reason: collision with root package name */
    private int f61516H1;

    /* renamed from: H2, reason: collision with root package name */
    private int f61517H2;

    /* renamed from: H3, reason: collision with root package name */
    private int f61518H3;

    /* renamed from: H4, reason: collision with root package name */
    private int f61519H4;

    /* renamed from: H5, reason: collision with root package name */
    private int f61520H5;

    /* renamed from: X, reason: collision with root package name */
    private int[] f61521X;
    private int xOff;

    public SHA1Digest() {
        this.f61521X = new int[80];
        reset();
    }

    private void copyIn(SHA1Digest sHA1Digest) {
        this.f61516H1 = sHA1Digest.f61516H1;
        this.f61517H2 = sHA1Digest.f61517H2;
        this.f61518H3 = sHA1Digest.f61518H3;
        this.f61519H4 = sHA1Digest.f61519H4;
        this.f61520H5 = sHA1Digest.f61520H5;
        int[] iArr = sHA1Digest.f61521X;
        System.arraycopy(iArr, 0, this.f61521X, 0, iArr.length);
        this.xOff = sHA1Digest.xOff;
    }

    private int f(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    private int g(int i10, int i11, int i12) {
        return (i10 & (i11 | i12)) | (i11 & i12);
    }

    private int h(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA1Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        Pack.intToBigEndian(this.f61516H1, bArr, i10);
        Pack.intToBigEndian(this.f61517H2, bArr, i10 + 4);
        Pack.intToBigEndian(this.f61518H3, bArr, i10 + 8);
        Pack.intToBigEndian(this.f61519H4, bArr, i10 + 12);
        Pack.intToBigEndian(this.f61520H5, bArr, i10 + 16);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return McElieceCCA2KeyGenParameterSpec.SHA1;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.xOff * 4) + 40];
        super.populateState(bArr);
        Pack.intToBigEndian(this.f61516H1, bArr, 16);
        Pack.intToBigEndian(this.f61517H2, bArr, 20);
        Pack.intToBigEndian(this.f61518H3, bArr, 24);
        Pack.intToBigEndian(this.f61519H4, bArr, 28);
        Pack.intToBigEndian(this.f61520H5, bArr, 32);
        Pack.intToBigEndian(this.xOff, bArr, 36);
        for (int i10 = 0; i10 != this.xOff; i10++) {
            Pack.intToBigEndian(this.f61521X[i10], bArr, (i10 * 4) + 40);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        for (int i10 = 16; i10 < 80; i10++) {
            int[] iArr = this.f61521X;
            int i11 = ((iArr[i10 - 3] ^ iArr[i10 - 8]) ^ iArr[i10 - 14]) ^ iArr[i10 - 16];
            iArr[i10] = (i11 >>> 31) | (i11 << 1);
        }
        int i12 = this.f61516H1;
        int i13 = this.f61517H2;
        int i14 = this.f61518H3;
        int i15 = this.f61519H4;
        int i16 = this.f61520H5;
        int i17 = 0;
        for (int i18 = 0; i18 < 4; i18++) {
            int f10 = i16 + ((i12 << 5) | (i12 >>> 27)) + f(i13, i14, i15) + this.f61521X[i17] + f61512Y1;
            int i19 = (i13 >>> 2) | (i13 << 30);
            int f11 = i15 + ((f10 << 5) | (f10 >>> 27)) + f(i12, i19, i14) + this.f61521X[i17 + 1] + f61512Y1;
            int i20 = (i12 >>> 2) | (i12 << 30);
            int f12 = i14 + ((f11 << 5) | (f11 >>> 27)) + f(f10, i20, i19) + this.f61521X[i17 + 2] + f61512Y1;
            i16 = (f10 >>> 2) | (f10 << 30);
            int i21 = i17 + 4;
            i13 = i19 + ((f12 << 5) | (f12 >>> 27)) + f(f11, i16, i20) + this.f61521X[i17 + 3] + f61512Y1;
            i15 = (f11 >>> 2) | (f11 << 30);
            i17 += 5;
            i12 = i20 + ((i13 << 5) | (i13 >>> 27)) + f(f12, i15, i16) + this.f61521X[i21] + f61512Y1;
            i14 = (f12 >>> 2) | (f12 << 30);
        }
        for (int i22 = 0; i22 < 4; i22++) {
            int h10 = i16 + ((i12 << 5) | (i12 >>> 27)) + h(i13, i14, i15) + this.f61521X[i17] + f61513Y2;
            int i23 = (i13 >>> 2) | (i13 << 30);
            int h11 = i15 + ((h10 << 5) | (h10 >>> 27)) + h(i12, i23, i14) + this.f61521X[i17 + 1] + f61513Y2;
            int i24 = (i12 >>> 2) | (i12 << 30);
            int h12 = i14 + ((h11 << 5) | (h11 >>> 27)) + h(h10, i24, i23) + this.f61521X[i17 + 2] + f61513Y2;
            i16 = (h10 >>> 2) | (h10 << 30);
            int i25 = i17 + 4;
            i13 = i23 + ((h12 << 5) | (h12 >>> 27)) + h(h11, i16, i24) + this.f61521X[i17 + 3] + f61513Y2;
            i15 = (h11 >>> 2) | (h11 << 30);
            i17 += 5;
            i12 = i24 + ((i13 << 5) | (i13 >>> 27)) + h(h12, i15, i16) + this.f61521X[i25] + f61513Y2;
            i14 = (h12 >>> 2) | (h12 << 30);
        }
        for (int i26 = 0; i26 < 4; i26++) {
            int g10 = i16 + ((i12 << 5) | (i12 >>> 27)) + g(i13, i14, i15) + this.f61521X[i17] + f61514Y3;
            int i27 = (i13 >>> 2) | (i13 << 30);
            int g11 = i15 + ((g10 << 5) | (g10 >>> 27)) + g(i12, i27, i14) + this.f61521X[i17 + 1] + f61514Y3;
            int i28 = (i12 >>> 2) | (i12 << 30);
            int g12 = i14 + ((g11 << 5) | (g11 >>> 27)) + g(g10, i28, i27) + this.f61521X[i17 + 2] + f61514Y3;
            i16 = (g10 >>> 2) | (g10 << 30);
            int i29 = i17 + 4;
            i13 = i27 + ((g12 << 5) | (g12 >>> 27)) + g(g11, i16, i28) + this.f61521X[i17 + 3] + f61514Y3;
            i15 = (g11 >>> 2) | (g11 << 30);
            i17 += 5;
            i12 = i28 + ((i13 << 5) | (i13 >>> 27)) + g(g12, i15, i16) + this.f61521X[i29] + f61514Y3;
            i14 = (g12 >>> 2) | (g12 << 30);
        }
        for (int i30 = 0; i30 <= 3; i30++) {
            int h13 = i16 + ((i12 << 5) | (i12 >>> 27)) + h(i13, i14, i15) + this.f61521X[i17] + f61515Y4;
            int i31 = (i13 >>> 2) | (i13 << 30);
            int h14 = i15 + ((h13 << 5) | (h13 >>> 27)) + h(i12, i31, i14) + this.f61521X[i17 + 1] + f61515Y4;
            int i32 = (i12 >>> 2) | (i12 << 30);
            int h15 = i14 + ((h14 << 5) | (h14 >>> 27)) + h(h13, i32, i31) + this.f61521X[i17 + 2] + f61515Y4;
            i16 = (h13 >>> 2) | (h13 << 30);
            int i33 = i17 + 4;
            i13 = i31 + ((h15 << 5) | (h15 >>> 27)) + h(h14, i16, i32) + this.f61521X[i17 + 3] + f61515Y4;
            i15 = (h14 >>> 2) | (h14 << 30);
            i17 += 5;
            i12 = i32 + ((i13 << 5) | (i13 >>> 27)) + h(h15, i15, i16) + this.f61521X[i33] + f61515Y4;
            i14 = (h15 >>> 2) | (h15 << 30);
        }
        this.f61516H1 += i12;
        this.f61517H2 += i13;
        this.f61518H3 += i14;
        this.f61519H4 += i15;
        this.f61520H5 += i16;
        this.xOff = 0;
        for (int i34 = 0; i34 < 16; i34++) {
            this.f61521X[i34] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j10) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f61521X;
        iArr[14] = (int) (j10 >>> 32);
        iArr[15] = (int) j10;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 3] & UByte.MAX_VALUE) | (bArr[i10] << 24) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8);
        int[] iArr = this.f61521X;
        int i12 = this.xOff;
        iArr[i12] = i11;
        int i13 = i12 + 1;
        this.xOff = i13;
        if (i13 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f61516H1 = 1732584193;
        this.f61517H2 = -271733879;
        this.f61518H3 = -1732584194;
        this.f61519H4 = 271733878;
        this.f61520H5 = -1009589776;
        this.xOff = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f61521X;
            if (i10 == iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }

    public SHA1Digest(SHA1Digest sHA1Digest) {
        super(sHA1Digest);
        this.f61521X = new int[80];
        copyIn(sHA1Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SHA1Digest sHA1Digest = (SHA1Digest) memoable;
        super.copyIn((GeneralDigest) sHA1Digest);
        copyIn(sHA1Digest);
    }

    public SHA1Digest(byte[] bArr) {
        super(bArr);
        this.f61521X = new int[80];
        this.f61516H1 = Pack.bigEndianToInt(bArr, 16);
        this.f61517H2 = Pack.bigEndianToInt(bArr, 20);
        this.f61518H3 = Pack.bigEndianToInt(bArr, 24);
        this.f61519H4 = Pack.bigEndianToInt(bArr, 28);
        this.f61520H5 = Pack.bigEndianToInt(bArr, 32);
        this.xOff = Pack.bigEndianToInt(bArr, 36);
        for (int i10 = 0; i10 != this.xOff; i10++) {
            this.f61521X[i10] = Pack.bigEndianToInt(bArr, (i10 * 4) + 40);
        }
    }
}
