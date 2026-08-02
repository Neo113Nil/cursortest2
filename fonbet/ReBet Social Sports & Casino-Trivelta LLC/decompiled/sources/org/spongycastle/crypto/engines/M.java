package org.spongycastle.crypto.engines;

/* loaded from: classes5.dex */
public abstract class M implements org.spongycastle.crypto.e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f62502a;

    /* renamed from: b, reason: collision with root package name */
    public int f62503b;

    /* renamed from: c, reason: collision with root package name */
    public int f62504c;

    /* renamed from: d, reason: collision with root package name */
    public int f62505d;

    /* renamed from: e, reason: collision with root package name */
    public int f62506e;
    protected int[] wKey;

    public static int o(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    public static int p(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    @Override // org.spongycastle.crypto.e
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        if (jVar instanceof org.spongycastle.crypto.params.w) {
            this.f62502a = z10;
            this.wKey = n(((org.spongycastle.crypto.params.w) jVar).a());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to " + getAlgorithmName() + " init - " + jVar.getClass().getName());
    }

    public final void b() {
        int o10 = o(this.f62503b, 13);
        int o11 = o(this.f62505d, 3);
        int i10 = (this.f62504c ^ o10) ^ o11;
        int i11 = (this.f62506e ^ o11) ^ (o10 << 3);
        this.f62504c = o(i10, 1);
        int o12 = o(i11, 7);
        this.f62506e = o12;
        this.f62503b = o((o10 ^ this.f62504c) ^ o12, 5);
        this.f62505d = o((this.f62506e ^ o11) ^ (this.f62504c << 7), 22);
    }

    public abstract void c(byte[] bArr, int i10, byte[] bArr2, int i11);

    public abstract void d(byte[] bArr, int i10, byte[] bArr2, int i11);

    public final void e(int i10, int i11, int i12, int i13) {
        int i14 = ~i10;
        int i15 = i11 ^ i10;
        int i16 = (i14 | i15) ^ i13;
        int i17 = i12 ^ i16;
        int i18 = i15 ^ i17;
        this.f62505d = i18;
        int i19 = (i15 & i13) ^ i14;
        int i20 = (i18 & i19) ^ i16;
        this.f62504c = i20;
        int i21 = (i10 & i16) ^ (i20 | i17);
        this.f62506e = i21;
        this.f62503b = i21 ^ (i19 ^ i17);
    }

    public final void f(int i10, int i11, int i12, int i13) {
        int i14 = i13 ^ i11;
        int i15 = i10 ^ (i11 & i14);
        int i16 = i14 ^ i15;
        int i17 = i12 ^ i16;
        this.f62506e = i17;
        int i18 = i11 ^ (i14 & i15);
        int i19 = i15 ^ (i17 | i18);
        this.f62504c = i19;
        int i20 = ~i19;
        int i21 = i18 ^ i17;
        this.f62503b = i20 ^ i21;
        this.f62505d = (i20 | i21) ^ i16;
    }

    public final void g(int i10, int i11, int i12, int i13) {
        int i14 = i11 ^ i13;
        int i15 = ~i14;
        int i16 = i10 ^ i12;
        int i17 = i12 ^ i14;
        int i18 = (i11 & i17) ^ i16;
        this.f62503b = i18;
        int i19 = (((i10 | i15) ^ i13) | i16) ^ i14;
        this.f62506e = i19;
        int i20 = ~i17;
        int i21 = i19 | i18;
        this.f62504c = i20 ^ i21;
        this.f62505d = (i21 ^ i16) ^ (i13 & i20);
    }

    @Override // org.spongycastle.crypto.e
    public String getAlgorithmName() {
        return "Serpent";
    }

    @Override // org.spongycastle.crypto.e
    public int getBlockSize() {
        return 16;
    }

    public final void h(int i10, int i11, int i12, int i13) {
        int i14 = i10 | i11;
        int i15 = i11 ^ i12;
        int i16 = i10 ^ (i11 & i15);
        int i17 = i12 ^ i16;
        int i18 = i13 | i16;
        int i19 = i15 ^ i18;
        this.f62503b = i19;
        int i20 = (i18 | i15) ^ i13;
        this.f62505d = i17 ^ i20;
        int i21 = i14 ^ i20;
        int i22 = i16 ^ (i19 & i21);
        this.f62506e = i22;
        this.f62504c = i22 ^ (i21 ^ i19);
    }

    public final void i(int i10, int i11, int i12, int i13) {
        int i14 = i11 ^ ((i12 | i13) & i10);
        int i15 = i12 ^ (i10 & i14);
        int i16 = i13 ^ i15;
        this.f62504c = i16;
        int i17 = ~i10;
        int i18 = (i15 & i16) ^ i14;
        this.f62506e = i18;
        int i19 = i13 ^ (i16 | i17);
        this.f62503b = i18 ^ i19;
        this.f62505d = (i17 ^ i16) ^ (i14 & i19);
    }

    public final void j(int i10, int i11, int i12, int i13) {
        int i14 = ~i12;
        int i15 = (i11 & i14) ^ i13;
        int i16 = i10 & i15;
        int i17 = (i11 ^ i14) ^ i16;
        this.f62506e = i17;
        int i18 = i17 | i11;
        this.f62504c = i15 ^ (i10 & i18);
        int i19 = i13 | i10;
        this.f62503b = (i14 ^ i18) ^ i19;
        this.f62505d = ((i10 ^ i12) | i16) ^ (i11 & i19);
    }

    public final void k(int i10, int i11, int i12, int i13) {
        int i14 = ~i10;
        int i15 = i10 ^ i11;
        int i16 = i12 ^ i15;
        int i17 = (i12 | i14) ^ i13;
        this.f62504c = i16 ^ i17;
        int i18 = i15 ^ (i16 & i17);
        int i19 = i17 ^ (i11 | i18);
        this.f62506e = i19;
        int i20 = i11 | i19;
        this.f62503b = i18 ^ i20;
        this.f62505d = (i13 & i14) ^ (i20 ^ i16);
    }

    public final void l(int i10, int i11, int i12, int i13) {
        int i14 = (i10 & i11) | i12;
        int i15 = (i10 | i11) & i13;
        int i16 = i14 ^ i15;
        this.f62506e = i16;
        int i17 = i11 ^ i15;
        int i18 = ((i16 ^ (~i13)) | i17) ^ i10;
        this.f62504c = i18;
        int i19 = (i17 ^ i12) ^ (i13 | i18);
        this.f62503b = i19;
        this.f62505d = ((i10 & i16) ^ i19) ^ (i14 ^ i18);
    }

    public final void m() {
        int p10 = (p(this.f62505d, 22) ^ this.f62506e) ^ (this.f62504c << 7);
        int p11 = p(this.f62503b, 5) ^ this.f62504c;
        int i10 = this.f62506e;
        int i11 = p11 ^ i10;
        int p12 = p(i10, 7);
        int p13 = p(this.f62504c, 1);
        this.f62506e = (p12 ^ p10) ^ (i11 << 3);
        this.f62504c = (p13 ^ i11) ^ p10;
        this.f62505d = p(p10, 3);
        this.f62503b = p(i11, 13);
    }

    public abstract int[] n(byte[] bArr);

    @Override // org.spongycastle.crypto.e
    public final int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.wKey == null) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i10 + 16 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        if (i11 + 16 > bArr2.length) {
            throw new org.spongycastle.crypto.x("output buffer too short");
        }
        if (this.f62502a) {
            d(bArr, i10, bArr2, i11);
            return 16;
        }
        c(bArr, i10, bArr2, i11);
        return 16;
    }

    public final void q(int i10, int i11, int i12, int i13) {
        int i14 = i10 ^ i13;
        int i15 = i12 ^ i14;
        int i16 = i11 ^ i15;
        int i17 = (i13 & i10) ^ i16;
        this.f62506e = i17;
        int i18 = i10 ^ (i11 & i14);
        this.f62505d = (i12 | i18) ^ i16;
        int i19 = (i15 ^ i18) & i17;
        this.f62504c = (~i15) ^ i19;
        this.f62503b = (~i18) ^ i19;
    }

    public final void r(int i10, int i11, int i12, int i13) {
        int i14 = (~i10) ^ i11;
        int i15 = (i10 | i14) ^ i12;
        int i16 = i13 ^ i15;
        this.f62505d = i16;
        int i17 = i11 ^ (i13 | i14);
        int i18 = i16 ^ i14;
        int i19 = (i15 & i17) ^ i18;
        this.f62506e = i19;
        int i20 = i17 ^ i15;
        this.f62504c = i19 ^ i20;
        this.f62503b = i15 ^ (i20 & i18);
    }

    @Override // org.spongycastle.crypto.e
    public void reset() {
    }

    public final void s(int i10, int i11, int i12, int i13) {
        int i14 = ~i10;
        int i15 = i11 ^ i13;
        int i16 = (i12 & i14) ^ i15;
        this.f62503b = i16;
        int i17 = i12 ^ i14;
        int i18 = i11 & (i12 ^ i16);
        int i19 = i17 ^ i18;
        this.f62506e = i19;
        int i20 = i10 ^ ((i18 | i13) & (i16 | i17));
        this.f62505d = i20;
        this.f62504c = (i20 ^ (i13 | i14)) ^ (i15 ^ i19);
    }

    public final void t(int i10, int i11, int i12, int i13) {
        int i14 = i10 ^ i11;
        int i15 = i10 & i12;
        int i16 = i10 | i13;
        int i17 = i12 ^ i13;
        int i18 = i15 | (i14 & i16);
        int i19 = i17 ^ i18;
        this.f62505d = i19;
        int i20 = (i16 ^ i11) ^ i18;
        int i21 = i14 ^ (i17 & i20);
        this.f62503b = i21;
        int i22 = i21 & i19;
        this.f62504c = i20 ^ i22;
        this.f62506e = (i11 | i13) ^ (i17 ^ i22);
    }

    public final void u(int i10, int i11, int i12, int i13) {
        int i14 = i10 ^ i13;
        int i15 = i12 ^ (i13 & i14);
        int i16 = i11 | i15;
        this.f62506e = i14 ^ i16;
        int i17 = ~i11;
        int i18 = (i14 | i17) ^ i15;
        this.f62503b = i18;
        int i19 = i17 ^ i14;
        int i20 = (i16 & i19) ^ (i18 & i10);
        this.f62505d = i20;
        this.f62504c = (i10 ^ i15) ^ (i19 & i20);
    }

    public final void v(int i10, int i11, int i12, int i13) {
        int i14 = ~i10;
        int i15 = i10 ^ i11;
        int i16 = i10 ^ i13;
        int i17 = (i12 ^ i14) ^ (i15 | i16);
        this.f62503b = i17;
        int i18 = i13 & i17;
        int i19 = (i15 ^ i17) ^ i18;
        this.f62504c = i19;
        int i20 = i16 ^ (i17 | i14);
        this.f62505d = (i15 | i18) ^ i20;
        this.f62506e = (i20 & i19) ^ (i11 ^ i18);
    }

    public final void w(int i10, int i11, int i12, int i13) {
        int i14 = ~i10;
        int i15 = i10 ^ i13;
        int i16 = i11 ^ i15;
        int i17 = i12 ^ (i14 | i15);
        int i18 = i11 ^ i17;
        this.f62504c = i18;
        int i19 = (i15 | i18) ^ i13;
        int i20 = (i17 & i19) ^ i16;
        this.f62505d = i20;
        int i21 = i19 ^ i17;
        this.f62503b = i20 ^ i21;
        this.f62506e = (i21 & i16) ^ (~i17);
    }

    public final void x(int i10, int i11, int i12, int i13) {
        int i14 = i11 ^ i12;
        int i15 = (i12 & i14) ^ i13;
        int i16 = i10 ^ i15;
        int i17 = i11 ^ ((i13 | i14) & i16);
        this.f62504c = i17;
        int i18 = (i10 & i16) ^ i14;
        this.f62506e = i18;
        int i19 = (i17 | i15) ^ i16;
        int i20 = i15 ^ (i18 & i19);
        this.f62505d = i20;
        this.f62503b = (i18 & i20) ^ (~i19);
    }
}
