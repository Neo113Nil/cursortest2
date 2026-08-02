package org.spongycastle.crypto.digests;

import kotlin.UByte;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes5.dex */
public class o extends e {

    /* renamed from: X, reason: collision with root package name */
    private int[] f62392X;

    /* renamed from: c, reason: collision with root package name */
    public int f62393c;

    /* renamed from: d, reason: collision with root package name */
    public int f62394d;

    /* renamed from: e, reason: collision with root package name */
    public int f62395e;

    /* renamed from: f, reason: collision with root package name */
    public int f62396f;

    /* renamed from: g, reason: collision with root package name */
    public int f62397g;

    /* renamed from: h, reason: collision with root package name */
    public int f62398h;

    public o() {
        this.f62392X = new int[80];
        reset();
    }

    @Override // Aj.d
    public void a(Aj.d dVar) {
        o oVar = (o) dVar;
        super.b(oVar);
        g(oVar);
    }

    @Override // Aj.d
    public Aj.d copy() {
        return new o(this);
    }

    @Override // org.spongycastle.crypto.digests.e
    public void d() {
        for (int i10 = 16; i10 < 80; i10++) {
            int[] iArr = this.f62392X;
            int i11 = ((iArr[i10 - 3] ^ iArr[i10 - 8]) ^ iArr[i10 - 14]) ^ iArr[i10 - 16];
            iArr[i10] = (i11 >>> 31) | (i11 << 1);
        }
        int i12 = this.f62393c;
        int i13 = this.f62394d;
        int i14 = this.f62395e;
        int i15 = this.f62396f;
        int i16 = this.f62397g;
        int i17 = 0;
        for (int i18 = 0; i18 < 4; i18++) {
            int h10 = i16 + ((i12 << 5) | (i12 >>> 27)) + h(i13, i14, i15) + this.f62392X[i17] + 1518500249;
            int i19 = (i13 >>> 2) | (i13 << 30);
            int h11 = i15 + ((h10 << 5) | (h10 >>> 27)) + h(i12, i19, i14) + this.f62392X[i17 + 1] + 1518500249;
            int i20 = (i12 >>> 2) | (i12 << 30);
            int h12 = i14 + ((h11 << 5) | (h11 >>> 27)) + h(h10, i20, i19) + this.f62392X[i17 + 2] + 1518500249;
            i16 = (h10 >>> 2) | (h10 << 30);
            int i21 = i17 + 4;
            i13 = i19 + ((h12 << 5) | (h12 >>> 27)) + h(h11, i16, i20) + this.f62392X[i17 + 3] + 1518500249;
            i15 = (h11 >>> 2) | (h11 << 30);
            i17 += 5;
            i12 = i20 + ((i13 << 5) | (i13 >>> 27)) + h(h12, i15, i16) + this.f62392X[i21] + 1518500249;
            i14 = (h12 >>> 2) | (h12 << 30);
        }
        for (int i22 = 0; i22 < 4; i22++) {
            int j10 = i16 + ((i12 << 5) | (i12 >>> 27)) + j(i13, i14, i15) + this.f62392X[i17] + 1859775393;
            int i23 = (i13 >>> 2) | (i13 << 30);
            int j11 = i15 + ((j10 << 5) | (j10 >>> 27)) + j(i12, i23, i14) + this.f62392X[i17 + 1] + 1859775393;
            int i24 = (i12 >>> 2) | (i12 << 30);
            int j12 = i14 + ((j11 << 5) | (j11 >>> 27)) + j(j10, i24, i23) + this.f62392X[i17 + 2] + 1859775393;
            i16 = (j10 >>> 2) | (j10 << 30);
            int i25 = i17 + 4;
            i13 = i23 + ((j12 << 5) | (j12 >>> 27)) + j(j11, i16, i24) + this.f62392X[i17 + 3] + 1859775393;
            i15 = (j11 >>> 2) | (j11 << 30);
            i17 += 5;
            i12 = i24 + ((i13 << 5) | (i13 >>> 27)) + j(j12, i15, i16) + this.f62392X[i25] + 1859775393;
            i14 = (j12 >>> 2) | (j12 << 30);
        }
        for (int i26 = 0; i26 < 4; i26++) {
            int i27 = i16 + (((((i12 << 5) | (i12 >>> 27)) + i(i13, i14, i15)) + this.f62392X[i17]) - 1894007588);
            int i28 = i15 + (((((i27 << 5) | (i27 >>> 27)) + i(i12, r2, i14)) + this.f62392X[i17 + 1]) - 1894007588);
            int i29 = i14 + (((((i28 << 5) | (i28 >>> 27)) + i(i27, r1, r2)) + this.f62392X[i17 + 2]) - 1894007588);
            i16 = (i27 >>> 2) | (i27 << 30);
            int i30 = i17 + 4;
            i13 = ((i13 >>> 2) | (i13 << 30)) + (((((i29 << 5) | (i29 >>> 27)) + i(i28, i16, r1)) + this.f62392X[i17 + 3]) - 1894007588);
            i15 = (i28 >>> 2) | (i28 << 30);
            i17 += 5;
            i12 = ((i12 >>> 2) | (i12 << 30)) + (((((i13 << 5) | (i13 >>> 27)) + i(i29, i15, i16)) + this.f62392X[i30]) - 1894007588);
            i14 = (i29 >>> 2) | (i29 << 30);
        }
        for (int i31 = 0; i31 <= 3; i31++) {
            int j13 = i16 + (((((i12 << 5) | (i12 >>> 27)) + j(i13, i14, i15)) + this.f62392X[i17]) - 899497514);
            int j14 = i15 + (((((j13 << 5) | (j13 >>> 27)) + j(i12, r2, i14)) + this.f62392X[i17 + 1]) - 899497514);
            int j15 = i14 + (((((j14 << 5) | (j14 >>> 27)) + j(j13, r1, r2)) + this.f62392X[i17 + 2]) - 899497514);
            i16 = (j13 >>> 2) | (j13 << 30);
            int i32 = i17 + 4;
            i13 = ((i13 >>> 2) | (i13 << 30)) + (((((j15 << 5) | (j15 >>> 27)) + j(j14, i16, r1)) + this.f62392X[i17 + 3]) - 899497514);
            i15 = (j14 >>> 2) | (j14 << 30);
            i17 += 5;
            i12 = ((i12 >>> 2) | (i12 << 30)) + (((((i13 << 5) | (i13 >>> 27)) + j(j15, i15, i16)) + this.f62392X[i32]) - 899497514);
            i14 = (j15 >>> 2) | (j15 << 30);
        }
        this.f62393c += i12;
        this.f62394d += i13;
        this.f62395e += i14;
        this.f62396f += i15;
        this.f62397g += i16;
        this.f62398h = 0;
        for (int i33 = 0; i33 < 16; i33++) {
            this.f62392X[i33] = 0;
        }
    }

    @Override // org.spongycastle.crypto.o
    public int doFinal(byte[] bArr, int i10) {
        c();
        Aj.f.d(this.f62393c, bArr, i10);
        Aj.f.d(this.f62394d, bArr, i10 + 4);
        Aj.f.d(this.f62395e, bArr, i10 + 8);
        Aj.f.d(this.f62396f, bArr, i10 + 12);
        Aj.f.d(this.f62397g, bArr, i10 + 16);
        reset();
        return 20;
    }

    @Override // org.spongycastle.crypto.digests.e
    public void e(long j10) {
        if (this.f62398h > 14) {
            d();
        }
        int[] iArr = this.f62392X;
        iArr[14] = (int) (j10 >>> 32);
        iArr[15] = (int) j10;
    }

    @Override // org.spongycastle.crypto.digests.e
    public void f(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 3] & UByte.MAX_VALUE) | (bArr[i10] << 24) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8);
        int[] iArr = this.f62392X;
        int i12 = this.f62398h;
        iArr[i12] = i11;
        int i13 = i12 + 1;
        this.f62398h = i13;
        if (i13 == 16) {
            d();
        }
    }

    public final void g(o oVar) {
        this.f62393c = oVar.f62393c;
        this.f62394d = oVar.f62394d;
        this.f62395e = oVar.f62395e;
        this.f62396f = oVar.f62396f;
        this.f62397g = oVar.f62397g;
        int[] iArr = oVar.f62392X;
        System.arraycopy(iArr, 0, this.f62392X, 0, iArr.length);
        this.f62398h = oVar.f62398h;
    }

    @Override // org.spongycastle.crypto.o
    public String getAlgorithmName() {
        return McElieceCCA2KeyGenParameterSpec.SHA1;
    }

    @Override // org.spongycastle.crypto.o
    public int getDigestSize() {
        return 20;
    }

    public final int h(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    public final int i(int i10, int i11, int i12) {
        return (i10 & (i11 | i12)) | (i11 & i12);
    }

    public final int j(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    @Override // org.spongycastle.crypto.digests.e, org.spongycastle.crypto.o
    public void reset() {
        super.reset();
        this.f62393c = 1732584193;
        this.f62394d = -271733879;
        this.f62395e = -1732584194;
        this.f62396f = 271733878;
        this.f62397g = -1009589776;
        this.f62398h = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f62392X;
            if (i10 == iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }

    public o(o oVar) {
        super(oVar);
        this.f62392X = new int[80];
        g(oVar);
    }
}
