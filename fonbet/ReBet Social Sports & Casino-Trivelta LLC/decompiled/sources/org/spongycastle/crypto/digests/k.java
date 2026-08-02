package org.spongycastle.crypto.digests;

import kotlin.UByte;

/* loaded from: classes5.dex */
public class k extends e {

    /* renamed from: X, reason: collision with root package name */
    private int[] f62357X;

    /* renamed from: c, reason: collision with root package name */
    public int f62358c;

    /* renamed from: d, reason: collision with root package name */
    public int f62359d;

    /* renamed from: e, reason: collision with root package name */
    public int f62360e;

    /* renamed from: f, reason: collision with root package name */
    public int f62361f;

    /* renamed from: g, reason: collision with root package name */
    public int f62362g;

    public k() {
        this.f62357X = new int[16];
        reset();
    }

    private void u(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 3] = (byte) (i10 >>> 24);
    }

    @Override // Aj.d
    public void a(Aj.d dVar) {
        p((k) dVar);
    }

    @Override // Aj.d
    public Aj.d copy() {
        return new k(this);
    }

    @Override // org.spongycastle.crypto.digests.e
    public void d() {
        int i10 = this.f62358c;
        int i11 = this.f62359d;
        int i12 = this.f62360e;
        int i13 = this.f62361f;
        int g10 = g(i10, i11, i12, i13, this.f62357X[0], 11);
        int g11 = g(i13, g10, i11, i12, this.f62357X[1], 14);
        int g12 = g(i12, g11, g10, i11, this.f62357X[2], 15);
        int g13 = g(i11, g12, g11, g10, this.f62357X[3], 12);
        int g14 = g(g10, g13, g12, g11, this.f62357X[4], 5);
        int g15 = g(g11, g14, g13, g12, this.f62357X[5], 8);
        int g16 = g(g12, g15, g14, g13, this.f62357X[6], 7);
        int g17 = g(g13, g16, g15, g14, this.f62357X[7], 9);
        int g18 = g(g14, g17, g16, g15, this.f62357X[8], 11);
        int g19 = g(g15, g18, g17, g16, this.f62357X[9], 13);
        int g20 = g(g16, g19, g18, g17, this.f62357X[10], 14);
        int g21 = g(g17, g20, g19, g18, this.f62357X[11], 15);
        int g22 = g(g18, g21, g20, g19, this.f62357X[12], 6);
        int g23 = g(g19, g22, g21, g20, this.f62357X[13], 7);
        int g24 = g(g20, g23, g22, g21, this.f62357X[14], 9);
        int g25 = g(g21, g24, g23, g22, this.f62357X[15], 8);
        int h10 = h(g22, g25, g24, g23, this.f62357X[7], 7);
        int h11 = h(g23, h10, g25, g24, this.f62357X[4], 6);
        int h12 = h(g24, h11, h10, g25, this.f62357X[13], 8);
        int h13 = h(g25, h12, h11, h10, this.f62357X[1], 13);
        int h14 = h(h10, h13, h12, h11, this.f62357X[10], 11);
        int h15 = h(h11, h14, h13, h12, this.f62357X[6], 9);
        int h16 = h(h12, h15, h14, h13, this.f62357X[15], 7);
        int h17 = h(h13, h16, h15, h14, this.f62357X[3], 15);
        int h18 = h(h14, h17, h16, h15, this.f62357X[12], 7);
        int h19 = h(h15, h18, h17, h16, this.f62357X[0], 12);
        int h20 = h(h16, h19, h18, h17, this.f62357X[9], 15);
        int h21 = h(h17, h20, h19, h18, this.f62357X[5], 9);
        int h22 = h(h18, h21, h20, h19, this.f62357X[2], 11);
        int h23 = h(h19, h22, h21, h20, this.f62357X[14], 7);
        int h24 = h(h20, h23, h22, h21, this.f62357X[11], 13);
        int h25 = h(h21, h24, h23, h22, this.f62357X[8], 12);
        int i14 = i(h22, h25, h24, h23, this.f62357X[3], 11);
        int i15 = i(h23, i14, h25, h24, this.f62357X[10], 13);
        int i16 = i(h24, i15, i14, h25, this.f62357X[14], 6);
        int i17 = i(h25, i16, i15, i14, this.f62357X[4], 7);
        int i18 = i(i14, i17, i16, i15, this.f62357X[9], 14);
        int i19 = i(i15, i18, i17, i16, this.f62357X[15], 9);
        int i20 = i(i16, i19, i18, i17, this.f62357X[8], 13);
        int i21 = i(i17, i20, i19, i18, this.f62357X[1], 15);
        int i22 = i(i18, i21, i20, i19, this.f62357X[2], 14);
        int i23 = i(i19, i22, i21, i20, this.f62357X[7], 8);
        int i24 = i(i20, i23, i22, i21, this.f62357X[0], 13);
        int i25 = i(i21, i24, i23, i22, this.f62357X[6], 6);
        int i26 = i(i22, i25, i24, i23, this.f62357X[13], 5);
        int i27 = i(i23, i26, i25, i24, this.f62357X[11], 12);
        int i28 = i(i24, i27, i26, i25, this.f62357X[5], 7);
        int i29 = i(i25, i28, i27, i26, this.f62357X[12], 5);
        int j10 = j(i26, i29, i28, i27, this.f62357X[1], 11);
        int j11 = j(i27, j10, i29, i28, this.f62357X[9], 12);
        int j12 = j(i28, j11, j10, i29, this.f62357X[11], 14);
        int j13 = j(i29, j12, j11, j10, this.f62357X[10], 15);
        int j14 = j(j10, j13, j12, j11, this.f62357X[0], 14);
        int j15 = j(j11, j14, j13, j12, this.f62357X[8], 15);
        int j16 = j(j12, j15, j14, j13, this.f62357X[12], 9);
        int j17 = j(j13, j16, j15, j14, this.f62357X[4], 8);
        int j18 = j(j14, j17, j16, j15, this.f62357X[13], 9);
        int j19 = j(j15, j18, j17, j16, this.f62357X[3], 14);
        int j20 = j(j16, j19, j18, j17, this.f62357X[7], 5);
        int j21 = j(j17, j20, j19, j18, this.f62357X[15], 6);
        int j22 = j(j18, j21, j20, j19, this.f62357X[14], 8);
        int j23 = j(j19, j22, j21, j20, this.f62357X[5], 6);
        int j24 = j(j20, j23, j22, j21, this.f62357X[6], 5);
        int j25 = j(j21, j24, j23, j22, this.f62357X[2], 12);
        int n10 = n(i10, i11, i12, i13, this.f62357X[5], 8);
        int n11 = n(i13, n10, i11, i12, this.f62357X[14], 9);
        int n12 = n(i12, n11, n10, i11, this.f62357X[7], 9);
        int n13 = n(i11, n12, n11, n10, this.f62357X[0], 11);
        int n14 = n(n10, n13, n12, n11, this.f62357X[9], 13);
        int n15 = n(n11, n14, n13, n12, this.f62357X[2], 15);
        int n16 = n(n12, n15, n14, n13, this.f62357X[11], 15);
        int n17 = n(n13, n16, n15, n14, this.f62357X[4], 5);
        int n18 = n(n14, n17, n16, n15, this.f62357X[13], 7);
        int n19 = n(n15, n18, n17, n16, this.f62357X[6], 7);
        int n20 = n(n16, n19, n18, n17, this.f62357X[15], 8);
        int n21 = n(n17, n20, n19, n18, this.f62357X[8], 11);
        int n22 = n(n18, n21, n20, n19, this.f62357X[1], 14);
        int n23 = n(n19, n22, n21, n20, this.f62357X[10], 14);
        int n24 = n(n20, n23, n22, n21, this.f62357X[3], 12);
        int n25 = n(n21, n24, n23, n22, this.f62357X[12], 6);
        int m10 = m(n22, n25, n24, n23, this.f62357X[6], 9);
        int m11 = m(n23, m10, n25, n24, this.f62357X[11], 13);
        int m12 = m(n24, m11, m10, n25, this.f62357X[3], 15);
        int m13 = m(n25, m12, m11, m10, this.f62357X[7], 7);
        int m14 = m(m10, m13, m12, m11, this.f62357X[0], 12);
        int m15 = m(m11, m14, m13, m12, this.f62357X[13], 8);
        int m16 = m(m12, m15, m14, m13, this.f62357X[5], 9);
        int m17 = m(m13, m16, m15, m14, this.f62357X[10], 11);
        int m18 = m(m14, m17, m16, m15, this.f62357X[14], 7);
        int m19 = m(m15, m18, m17, m16, this.f62357X[15], 7);
        int m20 = m(m16, m19, m18, m17, this.f62357X[8], 12);
        int m21 = m(m17, m20, m19, m18, this.f62357X[12], 7);
        int m22 = m(m18, m21, m20, m19, this.f62357X[4], 6);
        int m23 = m(m19, m22, m21, m20, this.f62357X[9], 15);
        int m24 = m(m20, m23, m22, m21, this.f62357X[1], 13);
        int m25 = m(m21, m24, m23, m22, this.f62357X[2], 11);
        int l10 = l(m22, m25, m24, m23, this.f62357X[15], 9);
        int l11 = l(m23, l10, m25, m24, this.f62357X[5], 7);
        int l12 = l(m24, l11, l10, m25, this.f62357X[1], 15);
        int l13 = l(m25, l12, l11, l10, this.f62357X[3], 11);
        int l14 = l(l10, l13, l12, l11, this.f62357X[7], 8);
        int l15 = l(l11, l14, l13, l12, this.f62357X[14], 6);
        int l16 = l(l12, l15, l14, l13, this.f62357X[6], 6);
        int l17 = l(l13, l16, l15, l14, this.f62357X[9], 14);
        int l18 = l(l14, l17, l16, l15, this.f62357X[11], 12);
        int l19 = l(l15, l18, l17, l16, this.f62357X[8], 13);
        int l20 = l(l16, l19, l18, l17, this.f62357X[12], 5);
        int l21 = l(l17, l20, l19, l18, this.f62357X[2], 14);
        int l22 = l(l18, l21, l20, l19, this.f62357X[10], 13);
        int l23 = l(l19, l22, l21, l20, this.f62357X[0], 13);
        int l24 = l(l20, l23, l22, l21, this.f62357X[4], 7);
        int l25 = l(l21, l24, l23, l22, this.f62357X[13], 5);
        int k10 = k(l22, l25, l24, l23, this.f62357X[8], 15);
        int k11 = k(l23, k10, l25, l24, this.f62357X[6], 5);
        int k12 = k(l24, k11, k10, l25, this.f62357X[4], 8);
        int k13 = k(l25, k12, k11, k10, this.f62357X[1], 11);
        int k14 = k(k10, k13, k12, k11, this.f62357X[3], 14);
        int k15 = k(k11, k14, k13, k12, this.f62357X[11], 14);
        int k16 = k(k12, k15, k14, k13, this.f62357X[15], 6);
        int k17 = k(k13, k16, k15, k14, this.f62357X[0], 14);
        int k18 = k(k14, k17, k16, k15, this.f62357X[5], 6);
        int k19 = k(k15, k18, k17, k16, this.f62357X[12], 9);
        int k20 = k(k16, k19, k18, k17, this.f62357X[2], 12);
        int k21 = k(k17, k20, k19, k18, this.f62357X[13], 9);
        int k22 = k(k18, k21, k20, k19, this.f62357X[9], 12);
        int k23 = k(k19, k22, k21, k20, this.f62357X[7], 5);
        int k24 = k(k20, k23, k22, k21, this.f62357X[10], 15);
        int k25 = k(k21, k24, k23, k22, this.f62357X[14], 8);
        int i30 = k23 + j24 + this.f62359d;
        this.f62359d = this.f62360e + j23 + k22;
        this.f62360e = this.f62361f + j22 + k25;
        this.f62361f = this.f62358c + j25 + k24;
        this.f62358c = i30;
        this.f62362g = 0;
        int i31 = 0;
        while (true) {
            int[] iArr = this.f62357X;
            if (i31 == iArr.length) {
                return;
            }
            iArr[i31] = 0;
            i31++;
        }
    }

    @Override // org.spongycastle.crypto.o
    public int doFinal(byte[] bArr, int i10) {
        c();
        u(this.f62358c, bArr, i10);
        u(this.f62359d, bArr, i10 + 4);
        u(this.f62360e, bArr, i10 + 8);
        u(this.f62361f, bArr, i10 + 12);
        reset();
        return 16;
    }

    @Override // org.spongycastle.crypto.digests.e
    public void e(long j10) {
        if (this.f62362g > 14) {
            d();
        }
        int[] iArr = this.f62357X;
        iArr[14] = (int) j10;
        iArr[15] = (int) (j10 >>> 32);
    }

    @Override // org.spongycastle.crypto.digests.e
    public void f(byte[] bArr, int i10) {
        int[] iArr = this.f62357X;
        int i11 = this.f62362g;
        int i12 = i11 + 1;
        this.f62362g = i12;
        iArr[i11] = ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
        if (i12 == 16) {
            d();
        }
    }

    public final int g(int i10, int i11, int i12, int i13, int i14, int i15) {
        return o(i10 + q(i11, i12, i13) + i14, i15);
    }

    @Override // org.spongycastle.crypto.o
    public String getAlgorithmName() {
        return "RIPEMD128";
    }

    @Override // org.spongycastle.crypto.o
    public int getDigestSize() {
        return 16;
    }

    public final int h(int i10, int i11, int i12, int i13, int i14, int i15) {
        return o(i10 + r(i11, i12, i13) + i14 + 1518500249, i15);
    }

    public final int i(int i10, int i11, int i12, int i13, int i14, int i15) {
        return o(i10 + s(i11, i12, i13) + i14 + 1859775393, i15);
    }

    public final int j(int i10, int i11, int i12, int i13, int i14, int i15) {
        return o(((i10 + t(i11, i12, i13)) + i14) - 1894007588, i15);
    }

    public final int k(int i10, int i11, int i12, int i13, int i14, int i15) {
        return o(i10 + q(i11, i12, i13) + i14, i15);
    }

    public final int l(int i10, int i11, int i12, int i13, int i14, int i15) {
        return o(i10 + r(i11, i12, i13) + i14 + 1836072691, i15);
    }

    public final int m(int i10, int i11, int i12, int i13, int i14, int i15) {
        return o(i10 + s(i11, i12, i13) + i14 + 1548603684, i15);
    }

    public final int n(int i10, int i11, int i12, int i13, int i14, int i15) {
        return o(i10 + t(i11, i12, i13) + i14 + 1352829926, i15);
    }

    public final int o(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    public final void p(k kVar) {
        super.b(kVar);
        this.f62358c = kVar.f62358c;
        this.f62359d = kVar.f62359d;
        this.f62360e = kVar.f62360e;
        this.f62361f = kVar.f62361f;
        int[] iArr = kVar.f62357X;
        System.arraycopy(iArr, 0, this.f62357X, 0, iArr.length);
        this.f62362g = kVar.f62362g;
    }

    public final int q(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    public final int r(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    @Override // org.spongycastle.crypto.digests.e, org.spongycastle.crypto.o
    public void reset() {
        super.reset();
        this.f62358c = 1732584193;
        this.f62359d = -271733879;
        this.f62360e = -1732584194;
        this.f62361f = 271733878;
        this.f62362g = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f62357X;
            if (i10 == iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }

    public final int s(int i10, int i11, int i12) {
        return (i10 | (~i11)) ^ i12;
    }

    public final int t(int i10, int i11, int i12) {
        return (i10 & i12) | (i11 & (~i12));
    }

    public k(k kVar) {
        super(kVar);
        this.f62357X = new int[16];
        p(kVar);
    }
}
