package org.spongycastle.crypto.digests;

import kotlin.UByte;

/* loaded from: classes5.dex */
public class i extends e {

    /* renamed from: X, reason: collision with root package name */
    private int[] f62345X;

    /* renamed from: c, reason: collision with root package name */
    public int f62346c;

    /* renamed from: d, reason: collision with root package name */
    public int f62347d;

    /* renamed from: e, reason: collision with root package name */
    public int f62348e;

    /* renamed from: f, reason: collision with root package name */
    public int f62349f;

    /* renamed from: g, reason: collision with root package name */
    public int f62350g;

    public i() {
        this.f62345X = new int[16];
        reset();
    }

    @Override // Aj.d
    public void a(Aj.d dVar) {
        j((i) dVar);
    }

    @Override // Aj.d
    public Aj.d copy() {
        return new i(this);
    }

    @Override // org.spongycastle.crypto.digests.e
    public void d() {
        int i10 = this.f62346c;
        int i11 = this.f62347d;
        int i12 = this.f62348e;
        int i13 = this.f62349f;
        int k10 = k(i10 + g(i11, i12, i13) + this.f62345X[0], 3);
        int k11 = k(i13 + g(k10, i11, i12) + this.f62345X[1], 7);
        int k12 = k(i12 + g(k11, k10, i11) + this.f62345X[2], 11);
        int k13 = k(i11 + g(k12, k11, k10) + this.f62345X[3], 19);
        int k14 = k(k10 + g(k13, k12, k11) + this.f62345X[4], 3);
        int k15 = k(k11 + g(k14, k13, k12) + this.f62345X[5], 7);
        int k16 = k(k12 + g(k15, k14, k13) + this.f62345X[6], 11);
        int k17 = k(k13 + g(k16, k15, k14) + this.f62345X[7], 19);
        int k18 = k(k14 + g(k17, k16, k15) + this.f62345X[8], 3);
        int k19 = k(k15 + g(k18, k17, k16) + this.f62345X[9], 7);
        int k20 = k(k16 + g(k19, k18, k17) + this.f62345X[10], 11);
        int k21 = k(k17 + g(k20, k19, k18) + this.f62345X[11], 19);
        int k22 = k(k18 + g(k21, k20, k19) + this.f62345X[12], 3);
        int k23 = k(k19 + g(k22, k21, k20) + this.f62345X[13], 7);
        int k24 = k(k20 + g(k23, k22, k21) + this.f62345X[14], 11);
        int k25 = k(k21 + g(k24, k23, k22) + this.f62345X[15], 19);
        int k26 = k(k22 + h(k25, k24, k23) + this.f62345X[0] + 1518500249, 3);
        int k27 = k(k23 + h(k26, k25, k24) + this.f62345X[4] + 1518500249, 5);
        int k28 = k(k24 + h(k27, k26, k25) + this.f62345X[8] + 1518500249, 9);
        int k29 = k(k25 + h(k28, k27, k26) + this.f62345X[12] + 1518500249, 13);
        int k30 = k(k26 + h(k29, k28, k27) + this.f62345X[1] + 1518500249, 3);
        int k31 = k(k27 + h(k30, k29, k28) + this.f62345X[5] + 1518500249, 5);
        int k32 = k(k28 + h(k31, k30, k29) + this.f62345X[9] + 1518500249, 9);
        int k33 = k(k29 + h(k32, k31, k30) + this.f62345X[13] + 1518500249, 13);
        int k34 = k(k30 + h(k33, k32, k31) + this.f62345X[2] + 1518500249, 3);
        int k35 = k(k31 + h(k34, k33, k32) + this.f62345X[6] + 1518500249, 5);
        int k36 = k(k32 + h(k35, k34, k33) + this.f62345X[10] + 1518500249, 9);
        int k37 = k(k33 + h(k36, k35, k34) + this.f62345X[14] + 1518500249, 13);
        int k38 = k(k34 + h(k37, k36, k35) + this.f62345X[3] + 1518500249, 3);
        int k39 = k(k35 + h(k38, k37, k36) + this.f62345X[7] + 1518500249, 5);
        int k40 = k(k36 + h(k39, k38, k37) + this.f62345X[11] + 1518500249, 9);
        int k41 = k(k37 + h(k40, k39, k38) + this.f62345X[15] + 1518500249, 13);
        int k42 = k(k38 + i(k41, k40, k39) + this.f62345X[0] + 1859775393, 3);
        int k43 = k(k39 + i(k42, k41, k40) + this.f62345X[8] + 1859775393, 9);
        int k44 = k(k40 + i(k43, k42, k41) + this.f62345X[4] + 1859775393, 11);
        int k45 = k(k41 + i(k44, k43, k42) + this.f62345X[12] + 1859775393, 15);
        int k46 = k(k42 + i(k45, k44, k43) + this.f62345X[2] + 1859775393, 3);
        int k47 = k(k43 + i(k46, k45, k44) + this.f62345X[10] + 1859775393, 9);
        int k48 = k(k44 + i(k47, k46, k45) + this.f62345X[6] + 1859775393, 11);
        int k49 = k(k45 + i(k48, k47, k46) + this.f62345X[14] + 1859775393, 15);
        int k50 = k(k46 + i(k49, k48, k47) + this.f62345X[1] + 1859775393, 3);
        int k51 = k(k47 + i(k50, k49, k48) + this.f62345X[9] + 1859775393, 9);
        int k52 = k(k48 + i(k51, k50, k49) + this.f62345X[5] + 1859775393, 11);
        int k53 = k(k49 + i(k52, k51, k50) + this.f62345X[13] + 1859775393, 15);
        int k54 = k(k50 + i(k53, k52, k51) + this.f62345X[3] + 1859775393, 3);
        int k55 = k(k51 + i(k54, k53, k52) + this.f62345X[11] + 1859775393, 9);
        int k56 = k(k52 + i(k55, k54, k53) + this.f62345X[7] + 1859775393, 11);
        int k57 = k(k53 + i(k56, k55, k54) + this.f62345X[15] + 1859775393, 15);
        this.f62346c += k54;
        this.f62347d += k57;
        this.f62348e += k56;
        this.f62349f += k55;
        this.f62350g = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f62345X;
            if (i14 == iArr.length) {
                return;
            }
            iArr[i14] = 0;
            i14++;
        }
    }

    @Override // org.spongycastle.crypto.o
    public int doFinal(byte[] bArr, int i10) {
        c();
        l(this.f62346c, bArr, i10);
        l(this.f62347d, bArr, i10 + 4);
        l(this.f62348e, bArr, i10 + 8);
        l(this.f62349f, bArr, i10 + 12);
        reset();
        return 16;
    }

    @Override // org.spongycastle.crypto.digests.e
    public void e(long j10) {
        if (this.f62350g > 14) {
            d();
        }
        int[] iArr = this.f62345X;
        iArr[14] = (int) j10;
        iArr[15] = (int) (j10 >>> 32);
    }

    @Override // org.spongycastle.crypto.digests.e
    public void f(byte[] bArr, int i10) {
        int[] iArr = this.f62345X;
        int i11 = this.f62350g;
        int i12 = i11 + 1;
        this.f62350g = i12;
        iArr[i11] = ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
        if (i12 == 16) {
            d();
        }
    }

    public final int g(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    @Override // org.spongycastle.crypto.o
    public String getAlgorithmName() {
        return "MD4";
    }

    @Override // org.spongycastle.crypto.o
    public int getDigestSize() {
        return 16;
    }

    public final int h(int i10, int i11, int i12) {
        return (i10 & (i11 | i12)) | (i11 & i12);
    }

    public final int i(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    public final void j(i iVar) {
        super.b(iVar);
        this.f62346c = iVar.f62346c;
        this.f62347d = iVar.f62347d;
        this.f62348e = iVar.f62348e;
        this.f62349f = iVar.f62349f;
        int[] iArr = iVar.f62345X;
        System.arraycopy(iArr, 0, this.f62345X, 0, iArr.length);
        this.f62350g = iVar.f62350g;
    }

    public final int k(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    public final void l(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 3] = (byte) (i10 >>> 24);
    }

    @Override // org.spongycastle.crypto.digests.e, org.spongycastle.crypto.o
    public void reset() {
        super.reset();
        this.f62346c = 1732584193;
        this.f62347d = -271733879;
        this.f62348e = -1732584194;
        this.f62349f = 271733878;
        this.f62350g = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f62345X;
            if (i10 == iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }

    public i(i iVar) {
        super(iVar);
        this.f62345X = new int[16];
        j(iVar);
    }
}
