package org.bouncycastle.crypto.digests;

import kotlin.UByte;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes5.dex */
public class SHA224Digest extends GeneralDigest implements EncodableDigest {
    private static final int DIGEST_LENGTH = 28;

    /* renamed from: K, reason: collision with root package name */
    static final int[] f61522K = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: H1, reason: collision with root package name */
    private int f61523H1;

    /* renamed from: H2, reason: collision with root package name */
    private int f61524H2;

    /* renamed from: H3, reason: collision with root package name */
    private int f61525H3;

    /* renamed from: H4, reason: collision with root package name */
    private int f61526H4;

    /* renamed from: H5, reason: collision with root package name */
    private int f61527H5;

    /* renamed from: H6, reason: collision with root package name */
    private int f61528H6;

    /* renamed from: H7, reason: collision with root package name */
    private int f61529H7;

    /* renamed from: H8, reason: collision with root package name */
    private int f61530H8;

    /* renamed from: X, reason: collision with root package name */
    private int[] f61531X;
    private int xOff;

    public SHA224Digest() {
        this.f61531X = new int[64];
        reset();
    }

    private int Ch(int i10, int i11, int i12) {
        return ((~i10) & i12) ^ (i11 & i10);
    }

    private int Maj(int i10, int i11, int i12) {
        return ((i10 & i12) ^ (i10 & i11)) ^ (i11 & i12);
    }

    private int Sum0(int i10) {
        return ((i10 << 10) | (i10 >>> 22)) ^ (((i10 >>> 2) | (i10 << 30)) ^ ((i10 >>> 13) | (i10 << 19)));
    }

    private int Sum1(int i10) {
        return ((i10 << 7) | (i10 >>> 25)) ^ (((i10 >>> 6) | (i10 << 26)) ^ ((i10 >>> 11) | (i10 << 21)));
    }

    private int Theta0(int i10) {
        return (i10 >>> 3) ^ (((i10 >>> 7) | (i10 << 25)) ^ ((i10 >>> 18) | (i10 << 14)));
    }

    private int Theta1(int i10) {
        return (i10 >>> 10) ^ (((i10 >>> 17) | (i10 << 15)) ^ ((i10 >>> 19) | (i10 << 13)));
    }

    private void doCopy(SHA224Digest sHA224Digest) {
        super.copyIn(sHA224Digest);
        this.f61523H1 = sHA224Digest.f61523H1;
        this.f61524H2 = sHA224Digest.f61524H2;
        this.f61525H3 = sHA224Digest.f61525H3;
        this.f61526H4 = sHA224Digest.f61526H4;
        this.f61527H5 = sHA224Digest.f61527H5;
        this.f61528H6 = sHA224Digest.f61528H6;
        this.f61529H7 = sHA224Digest.f61529H7;
        this.f61530H8 = sHA224Digest.f61530H8;
        int[] iArr = sHA224Digest.f61531X;
        System.arraycopy(iArr, 0, this.f61531X, 0, iArr.length);
        this.xOff = sHA224Digest.xOff;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA224Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        Pack.intToBigEndian(this.f61523H1, bArr, i10);
        Pack.intToBigEndian(this.f61524H2, bArr, i10 + 4);
        Pack.intToBigEndian(this.f61525H3, bArr, i10 + 8);
        Pack.intToBigEndian(this.f61526H4, bArr, i10 + 12);
        Pack.intToBigEndian(this.f61527H5, bArr, i10 + 16);
        Pack.intToBigEndian(this.f61528H6, bArr, i10 + 20);
        Pack.intToBigEndian(this.f61529H7, bArr, i10 + 24);
        reset();
        return 28;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return McElieceCCA2KeyGenParameterSpec.SHA224;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 28;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.xOff * 4) + 52];
        super.populateState(bArr);
        Pack.intToBigEndian(this.f61523H1, bArr, 16);
        Pack.intToBigEndian(this.f61524H2, bArr, 20);
        Pack.intToBigEndian(this.f61525H3, bArr, 24);
        Pack.intToBigEndian(this.f61526H4, bArr, 28);
        Pack.intToBigEndian(this.f61527H5, bArr, 32);
        Pack.intToBigEndian(this.f61528H6, bArr, 36);
        Pack.intToBigEndian(this.f61529H7, bArr, 40);
        Pack.intToBigEndian(this.f61530H8, bArr, 44);
        Pack.intToBigEndian(this.xOff, bArr, 48);
        for (int i10 = 0; i10 != this.xOff; i10++) {
            Pack.intToBigEndian(this.f61531X[i10], bArr, (i10 * 4) + 52);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        for (int i10 = 16; i10 <= 63; i10++) {
            int[] iArr = this.f61531X;
            int Theta1 = Theta1(iArr[i10 - 2]);
            int[] iArr2 = this.f61531X;
            iArr[i10] = Theta1 + iArr2[i10 - 7] + Theta0(iArr2[i10 - 15]) + this.f61531X[i10 - 16];
        }
        int i11 = this.f61523H1;
        int i12 = this.f61524H2;
        int i13 = this.f61525H3;
        int i14 = this.f61526H4;
        int i15 = this.f61527H5;
        int i16 = this.f61528H6;
        int i17 = this.f61529H7;
        int i18 = this.f61530H8;
        int i19 = 0;
        for (int i20 = 0; i20 < 8; i20++) {
            int Sum1 = Sum1(i15) + Ch(i15, i16, i17);
            int[] iArr3 = f61522K;
            int i21 = i18 + Sum1 + iArr3[i19] + this.f61531X[i19];
            int i22 = i14 + i21;
            int Sum0 = i21 + Sum0(i11) + Maj(i11, i12, i13);
            int i23 = i19 + 1;
            int Sum12 = i17 + Sum1(i22) + Ch(i22, i15, i16) + iArr3[i23] + this.f61531X[i23];
            int i24 = i13 + Sum12;
            int Sum02 = Sum12 + Sum0(Sum0) + Maj(Sum0, i11, i12);
            int i25 = i19 + 2;
            int Sum13 = i16 + Sum1(i24) + Ch(i24, i22, i15) + iArr3[i25] + this.f61531X[i25];
            int i26 = i12 + Sum13;
            int Sum03 = Sum13 + Sum0(Sum02) + Maj(Sum02, Sum0, i11);
            int i27 = i19 + 3;
            int Sum14 = i15 + Sum1(i26) + Ch(i26, i24, i22) + iArr3[i27] + this.f61531X[i27];
            int i28 = i11 + Sum14;
            int Sum04 = Sum14 + Sum0(Sum03) + Maj(Sum03, Sum02, Sum0);
            int i29 = i19 + 4;
            int Sum15 = i22 + Sum1(i28) + Ch(i28, i26, i24) + iArr3[i29] + this.f61531X[i29];
            i18 = Sum0 + Sum15;
            i14 = Sum15 + Sum0(Sum04) + Maj(Sum04, Sum03, Sum02);
            int i30 = i19 + 5;
            int Sum16 = i24 + Sum1(i18) + Ch(i18, i28, i26) + iArr3[i30] + this.f61531X[i30];
            i17 = Sum02 + Sum16;
            i13 = Sum16 + Sum0(i14) + Maj(i14, Sum04, Sum03);
            int i31 = i19 + 6;
            int Sum17 = i26 + Sum1(i17) + Ch(i17, i18, i28) + iArr3[i31] + this.f61531X[i31];
            i16 = Sum03 + Sum17;
            i12 = Sum17 + Sum0(i13) + Maj(i13, i14, Sum04);
            int i32 = i19 + 7;
            int Sum18 = i28 + Sum1(i16) + Ch(i16, i17, i18) + iArr3[i32] + this.f61531X[i32];
            i15 = Sum04 + Sum18;
            i11 = Sum18 + Sum0(i12) + Maj(i12, i13, i14);
            i19 += 8;
        }
        this.f61523H1 += i11;
        this.f61524H2 += i12;
        this.f61525H3 += i13;
        this.f61526H4 += i14;
        this.f61527H5 += i15;
        this.f61528H6 += i16;
        this.f61529H7 += i17;
        this.f61530H8 += i18;
        this.xOff = 0;
        for (int i33 = 0; i33 < 16; i33++) {
            this.f61531X[i33] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j10) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f61531X;
        iArr[14] = (int) (j10 >>> 32);
        iArr[15] = (int) j10;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 3] & UByte.MAX_VALUE) | (bArr[i10] << 24) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8);
        int[] iArr = this.f61531X;
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
        this.f61523H1 = -1056596264;
        this.f61524H2 = 914150663;
        this.f61525H3 = 812702999;
        this.f61526H4 = -150054599;
        this.f61527H5 = -4191439;
        this.f61528H6 = 1750603025;
        this.f61529H7 = 1694076839;
        this.f61530H8 = -1090891868;
        this.xOff = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f61531X;
            if (i10 == iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }

    public SHA224Digest(SHA224Digest sHA224Digest) {
        super(sHA224Digest);
        this.f61531X = new int[64];
        doCopy(sHA224Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        doCopy((SHA224Digest) memoable);
    }

    public SHA224Digest(byte[] bArr) {
        super(bArr);
        this.f61531X = new int[64];
        this.f61523H1 = Pack.bigEndianToInt(bArr, 16);
        this.f61524H2 = Pack.bigEndianToInt(bArr, 20);
        this.f61525H3 = Pack.bigEndianToInt(bArr, 24);
        this.f61526H4 = Pack.bigEndianToInt(bArr, 28);
        this.f61527H5 = Pack.bigEndianToInt(bArr, 32);
        this.f61528H6 = Pack.bigEndianToInt(bArr, 36);
        this.f61529H7 = Pack.bigEndianToInt(bArr, 40);
        this.f61530H8 = Pack.bigEndianToInt(bArr, 44);
        this.xOff = Pack.bigEndianToInt(bArr, 48);
        for (int i10 = 0; i10 != this.xOff; i10++) {
            this.f61531X[i10] = Pack.bigEndianToInt(bArr, (i10 * 4) + 52);
        }
    }
}
