package org.spongycastle.crypto.digests;

import kotlin.UByte;

/* loaded from: classes5.dex */
public class q extends e {

    /* renamed from: K, reason: collision with root package name */
    static final int[] f62410K = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: X, reason: collision with root package name */
    private int[] f62411X;

    /* renamed from: c, reason: collision with root package name */
    public int f62412c;

    /* renamed from: d, reason: collision with root package name */
    public int f62413d;

    /* renamed from: e, reason: collision with root package name */
    public int f62414e;

    /* renamed from: f, reason: collision with root package name */
    public int f62415f;

    /* renamed from: g, reason: collision with root package name */
    public int f62416g;

    /* renamed from: h, reason: collision with root package name */
    public int f62417h;

    /* renamed from: i, reason: collision with root package name */
    public int f62418i;

    /* renamed from: j, reason: collision with root package name */
    public int f62419j;

    /* renamed from: k, reason: collision with root package name */
    public int f62420k;

    public q() {
        this.f62411X = new int[64];
        reset();
    }

    private int g(int i10, int i11, int i12) {
        return ((~i10) & i12) ^ (i11 & i10);
    }

    private int h(int i10, int i11, int i12) {
        return ((i10 & i12) ^ (i10 & i11)) ^ (i11 & i12);
    }

    private int i(int i10) {
        return ((i10 << 10) | (i10 >>> 22)) ^ (((i10 >>> 2) | (i10 << 30)) ^ ((i10 >>> 13) | (i10 << 19)));
    }

    private int j(int i10) {
        return ((i10 << 7) | (i10 >>> 25)) ^ (((i10 >>> 6) | (i10 << 26)) ^ ((i10 >>> 11) | (i10 << 21)));
    }

    private int k(int i10) {
        return (i10 >>> 3) ^ (((i10 >>> 7) | (i10 << 25)) ^ ((i10 >>> 18) | (i10 << 14)));
    }

    private int l(int i10) {
        return (i10 >>> 10) ^ (((i10 >>> 17) | (i10 << 15)) ^ ((i10 >>> 19) | (i10 << 13)));
    }

    @Override // Aj.d
    public void a(Aj.d dVar) {
        m((q) dVar);
    }

    @Override // Aj.d
    public Aj.d copy() {
        return new q(this);
    }

    @Override // org.spongycastle.crypto.digests.e
    public void d() {
        for (int i10 = 16; i10 <= 63; i10++) {
            int[] iArr = this.f62411X;
            int l10 = l(iArr[i10 - 2]);
            int[] iArr2 = this.f62411X;
            iArr[i10] = l10 + iArr2[i10 - 7] + k(iArr2[i10 - 15]) + this.f62411X[i10 - 16];
        }
        int i11 = this.f62412c;
        int i12 = this.f62413d;
        int i13 = this.f62414e;
        int i14 = this.f62415f;
        int i15 = this.f62416g;
        int i16 = this.f62417h;
        int i17 = this.f62418i;
        int i18 = this.f62419j;
        int i19 = 0;
        for (int i20 = 0; i20 < 8; i20++) {
            int j10 = j(i15) + g(i15, i16, i17);
            int[] iArr3 = f62410K;
            int i21 = i18 + j10 + iArr3[i19] + this.f62411X[i19];
            int i22 = i14 + i21;
            int i23 = i21 + i(i11) + h(i11, i12, i13);
            int i24 = i19 + 1;
            int j11 = i17 + j(i22) + g(i22, i15, i16) + iArr3[i24] + this.f62411X[i24];
            int i25 = i13 + j11;
            int i26 = j11 + i(i23) + h(i23, i11, i12);
            int i27 = i19 + 2;
            int j12 = i16 + j(i25) + g(i25, i22, i15) + iArr3[i27] + this.f62411X[i27];
            int i28 = i12 + j12;
            int i29 = j12 + i(i26) + h(i26, i23, i11);
            int i30 = i19 + 3;
            int j13 = i15 + j(i28) + g(i28, i25, i22) + iArr3[i30] + this.f62411X[i30];
            int i31 = i11 + j13;
            int i32 = j13 + i(i29) + h(i29, i26, i23);
            int i33 = i19 + 4;
            int j14 = i22 + j(i31) + g(i31, i28, i25) + iArr3[i33] + this.f62411X[i33];
            i18 = i23 + j14;
            i14 = j14 + i(i32) + h(i32, i29, i26);
            int i34 = i19 + 5;
            int j15 = i25 + j(i18) + g(i18, i31, i28) + iArr3[i34] + this.f62411X[i34];
            i17 = i26 + j15;
            i13 = j15 + i(i14) + h(i14, i32, i29);
            int i35 = i19 + 6;
            int j16 = i28 + j(i17) + g(i17, i18, i31) + iArr3[i35] + this.f62411X[i35];
            i16 = i29 + j16;
            i12 = j16 + i(i13) + h(i13, i14, i32);
            int i36 = i19 + 7;
            int j17 = i31 + j(i16) + g(i16, i17, i18) + iArr3[i36] + this.f62411X[i36];
            i15 = i32 + j17;
            i11 = j17 + i(i12) + h(i12, i13, i14);
            i19 += 8;
        }
        this.f62412c += i11;
        this.f62413d += i12;
        this.f62414e += i13;
        this.f62415f += i14;
        this.f62416g += i15;
        this.f62417h += i16;
        this.f62418i += i17;
        this.f62419j += i18;
        this.f62420k = 0;
        for (int i37 = 0; i37 < 16; i37++) {
            this.f62411X[i37] = 0;
        }
    }

    @Override // org.spongycastle.crypto.o
    public int doFinal(byte[] bArr, int i10) {
        c();
        Aj.f.d(this.f62412c, bArr, i10);
        Aj.f.d(this.f62413d, bArr, i10 + 4);
        Aj.f.d(this.f62414e, bArr, i10 + 8);
        Aj.f.d(this.f62415f, bArr, i10 + 12);
        Aj.f.d(this.f62416g, bArr, i10 + 16);
        Aj.f.d(this.f62417h, bArr, i10 + 20);
        Aj.f.d(this.f62418i, bArr, i10 + 24);
        Aj.f.d(this.f62419j, bArr, i10 + 28);
        reset();
        return 32;
    }

    @Override // org.spongycastle.crypto.digests.e
    public void e(long j10) {
        if (this.f62420k > 14) {
            d();
        }
        int[] iArr = this.f62411X;
        iArr[14] = (int) (j10 >>> 32);
        iArr[15] = (int) j10;
    }

    @Override // org.spongycastle.crypto.digests.e
    public void f(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 3] & UByte.MAX_VALUE) | (bArr[i10] << 24) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8);
        int[] iArr = this.f62411X;
        int i12 = this.f62420k;
        iArr[i12] = i11;
        int i13 = i12 + 1;
        this.f62420k = i13;
        if (i13 == 16) {
            d();
        }
    }

    @Override // org.spongycastle.crypto.o
    public String getAlgorithmName() {
        return "SHA-256";
    }

    @Override // org.spongycastle.crypto.o
    public int getDigestSize() {
        return 32;
    }

    public final void m(q qVar) {
        super.b(qVar);
        this.f62412c = qVar.f62412c;
        this.f62413d = qVar.f62413d;
        this.f62414e = qVar.f62414e;
        this.f62415f = qVar.f62415f;
        this.f62416g = qVar.f62416g;
        this.f62417h = qVar.f62417h;
        this.f62418i = qVar.f62418i;
        this.f62419j = qVar.f62419j;
        int[] iArr = qVar.f62411X;
        System.arraycopy(iArr, 0, this.f62411X, 0, iArr.length);
        this.f62420k = qVar.f62420k;
    }

    @Override // org.spongycastle.crypto.digests.e, org.spongycastle.crypto.o
    public void reset() {
        super.reset();
        this.f62412c = 1779033703;
        this.f62413d = -1150833019;
        this.f62414e = 1013904242;
        this.f62415f = -1521486534;
        this.f62416g = 1359893119;
        this.f62417h = -1694144372;
        this.f62418i = 528734635;
        this.f62419j = 1541459225;
        this.f62420k = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f62411X;
            if (i10 == iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }

    public q(q qVar) {
        super(qVar);
        this.f62411X = new int[64];
        m(qVar);
    }
}
