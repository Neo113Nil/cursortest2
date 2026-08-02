package org.spongycastle.crypto.digests;

import kotlin.UByte;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes5.dex */
public class p extends e {

    /* renamed from: K, reason: collision with root package name */
    static final int[] f62399K = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: X, reason: collision with root package name */
    private int[] f62400X;

    /* renamed from: c, reason: collision with root package name */
    public int f62401c;

    /* renamed from: d, reason: collision with root package name */
    public int f62402d;

    /* renamed from: e, reason: collision with root package name */
    public int f62403e;

    /* renamed from: f, reason: collision with root package name */
    public int f62404f;

    /* renamed from: g, reason: collision with root package name */
    public int f62405g;

    /* renamed from: h, reason: collision with root package name */
    public int f62406h;

    /* renamed from: i, reason: collision with root package name */
    public int f62407i;

    /* renamed from: j, reason: collision with root package name */
    public int f62408j;

    /* renamed from: k, reason: collision with root package name */
    public int f62409k;

    public p() {
        this.f62400X = new int[64];
        reset();
    }

    @Override // Aj.d
    public void a(Aj.d dVar) {
        m((p) dVar);
    }

    @Override // Aj.d
    public Aj.d copy() {
        return new p(this);
    }

    @Override // org.spongycastle.crypto.digests.e
    public void d() {
        for (int i10 = 16; i10 <= 63; i10++) {
            int[] iArr = this.f62400X;
            int l10 = l(iArr[i10 - 2]);
            int[] iArr2 = this.f62400X;
            iArr[i10] = l10 + iArr2[i10 - 7] + k(iArr2[i10 - 15]) + this.f62400X[i10 - 16];
        }
        int i11 = this.f62401c;
        int i12 = this.f62402d;
        int i13 = this.f62403e;
        int i14 = this.f62404f;
        int i15 = this.f62405g;
        int i16 = this.f62406h;
        int i17 = this.f62407i;
        int i18 = this.f62408j;
        int i19 = 0;
        for (int i20 = 0; i20 < 8; i20++) {
            int j10 = j(i15) + g(i15, i16, i17);
            int[] iArr3 = f62399K;
            int i21 = i18 + j10 + iArr3[i19] + this.f62400X[i19];
            int i22 = i14 + i21;
            int i23 = i21 + i(i11) + h(i11, i12, i13);
            int i24 = i19 + 1;
            int j11 = i17 + j(i22) + g(i22, i15, i16) + iArr3[i24] + this.f62400X[i24];
            int i25 = i13 + j11;
            int i26 = j11 + i(i23) + h(i23, i11, i12);
            int i27 = i19 + 2;
            int j12 = i16 + j(i25) + g(i25, i22, i15) + iArr3[i27] + this.f62400X[i27];
            int i28 = i12 + j12;
            int i29 = j12 + i(i26) + h(i26, i23, i11);
            int i30 = i19 + 3;
            int j13 = i15 + j(i28) + g(i28, i25, i22) + iArr3[i30] + this.f62400X[i30];
            int i31 = i11 + j13;
            int i32 = j13 + i(i29) + h(i29, i26, i23);
            int i33 = i19 + 4;
            int j14 = i22 + j(i31) + g(i31, i28, i25) + iArr3[i33] + this.f62400X[i33];
            i18 = i23 + j14;
            i14 = j14 + i(i32) + h(i32, i29, i26);
            int i34 = i19 + 5;
            int j15 = i25 + j(i18) + g(i18, i31, i28) + iArr3[i34] + this.f62400X[i34];
            i17 = i26 + j15;
            i13 = j15 + i(i14) + h(i14, i32, i29);
            int i35 = i19 + 6;
            int j16 = i28 + j(i17) + g(i17, i18, i31) + iArr3[i35] + this.f62400X[i35];
            i16 = i29 + j16;
            i12 = j16 + i(i13) + h(i13, i14, i32);
            int i36 = i19 + 7;
            int j17 = i31 + j(i16) + g(i16, i17, i18) + iArr3[i36] + this.f62400X[i36];
            i15 = i32 + j17;
            i11 = j17 + i(i12) + h(i12, i13, i14);
            i19 += 8;
        }
        this.f62401c += i11;
        this.f62402d += i12;
        this.f62403e += i13;
        this.f62404f += i14;
        this.f62405g += i15;
        this.f62406h += i16;
        this.f62407i += i17;
        this.f62408j += i18;
        this.f62409k = 0;
        for (int i37 = 0; i37 < 16; i37++) {
            this.f62400X[i37] = 0;
        }
    }

    @Override // org.spongycastle.crypto.o
    public int doFinal(byte[] bArr, int i10) {
        c();
        Aj.f.d(this.f62401c, bArr, i10);
        Aj.f.d(this.f62402d, bArr, i10 + 4);
        Aj.f.d(this.f62403e, bArr, i10 + 8);
        Aj.f.d(this.f62404f, bArr, i10 + 12);
        Aj.f.d(this.f62405g, bArr, i10 + 16);
        Aj.f.d(this.f62406h, bArr, i10 + 20);
        Aj.f.d(this.f62407i, bArr, i10 + 24);
        reset();
        return 28;
    }

    @Override // org.spongycastle.crypto.digests.e
    public void e(long j10) {
        if (this.f62409k > 14) {
            d();
        }
        int[] iArr = this.f62400X;
        iArr[14] = (int) (j10 >>> 32);
        iArr[15] = (int) j10;
    }

    @Override // org.spongycastle.crypto.digests.e
    public void f(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 3] & UByte.MAX_VALUE) | (bArr[i10] << 24) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8);
        int[] iArr = this.f62400X;
        int i12 = this.f62409k;
        iArr[i12] = i11;
        int i13 = i12 + 1;
        this.f62409k = i13;
        if (i13 == 16) {
            d();
        }
    }

    public final int g(int i10, int i11, int i12) {
        return ((~i10) & i12) ^ (i11 & i10);
    }

    @Override // org.spongycastle.crypto.o
    public String getAlgorithmName() {
        return McElieceCCA2KeyGenParameterSpec.SHA224;
    }

    @Override // org.spongycastle.crypto.o
    public int getDigestSize() {
        return 28;
    }

    public final int h(int i10, int i11, int i12) {
        return ((i10 & i12) ^ (i10 & i11)) ^ (i11 & i12);
    }

    public final int i(int i10) {
        return ((i10 << 10) | (i10 >>> 22)) ^ (((i10 >>> 2) | (i10 << 30)) ^ ((i10 >>> 13) | (i10 << 19)));
    }

    public final int j(int i10) {
        return ((i10 << 7) | (i10 >>> 25)) ^ (((i10 >>> 6) | (i10 << 26)) ^ ((i10 >>> 11) | (i10 << 21)));
    }

    public final int k(int i10) {
        return (i10 >>> 3) ^ (((i10 >>> 7) | (i10 << 25)) ^ ((i10 >>> 18) | (i10 << 14)));
    }

    public final int l(int i10) {
        return (i10 >>> 10) ^ (((i10 >>> 17) | (i10 << 15)) ^ ((i10 >>> 19) | (i10 << 13)));
    }

    public final void m(p pVar) {
        super.b(pVar);
        this.f62401c = pVar.f62401c;
        this.f62402d = pVar.f62402d;
        this.f62403e = pVar.f62403e;
        this.f62404f = pVar.f62404f;
        this.f62405g = pVar.f62405g;
        this.f62406h = pVar.f62406h;
        this.f62407i = pVar.f62407i;
        this.f62408j = pVar.f62408j;
        int[] iArr = pVar.f62400X;
        System.arraycopy(iArr, 0, this.f62400X, 0, iArr.length);
        this.f62409k = pVar.f62409k;
    }

    @Override // org.spongycastle.crypto.digests.e, org.spongycastle.crypto.o
    public void reset() {
        super.reset();
        this.f62401c = -1056596264;
        this.f62402d = 914150663;
        this.f62403e = 812702999;
        this.f62404f = -150054599;
        this.f62405g = -4191439;
        this.f62406h = 1750603025;
        this.f62407i = 1694076839;
        this.f62408j = -1090891868;
        this.f62409k = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f62400X;
            if (i10 == iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }

    public p(p pVar) {
        super(pVar);
        this.f62400X = new int[64];
        m(pVar);
    }
}
