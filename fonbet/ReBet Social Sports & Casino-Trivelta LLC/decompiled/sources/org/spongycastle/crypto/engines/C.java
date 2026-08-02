package org.spongycastle.crypto.engines;

/* loaded from: classes5.dex */
public class C implements org.spongycastle.crypto.C {

    /* renamed from: a, reason: collision with root package name */
    public org.spongycastle.crypto.e f62465a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f62466b;

    /* renamed from: c, reason: collision with root package name */
    public org.spongycastle.crypto.params.w f62467c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f62468d;
    private byte[] iv;

    public C(org.spongycastle.crypto.e eVar) {
        this(eVar, false);
    }

    @Override // org.spongycastle.crypto.C
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        this.f62468d = z10;
        if (jVar instanceof org.spongycastle.crypto.params.A) {
            jVar = ((org.spongycastle.crypto.params.A) jVar).a();
        }
        if (jVar instanceof org.spongycastle.crypto.params.w) {
            this.f62467c = (org.spongycastle.crypto.params.w) jVar;
            return;
        }
        if (jVar instanceof org.spongycastle.crypto.params.z) {
            org.spongycastle.crypto.params.z zVar = (org.spongycastle.crypto.params.z) jVar;
            this.iv = zVar.a();
            this.f62467c = (org.spongycastle.crypto.params.w) zVar.b();
            if (this.iv.length != 8) {
                throw new IllegalArgumentException("IV not equal to 8");
            }
        }
    }

    @Override // org.spongycastle.crypto.C
    public String getAlgorithmName() {
        return this.f62465a.getAlgorithmName();
    }

    @Override // org.spongycastle.crypto.C
    public byte[] unwrap(byte[] bArr, int i10, int i11) {
        if (this.f62468d) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int i12 = i11 / 8;
        if (i12 * 8 != i11) {
            throw new org.spongycastle.crypto.r("unwrap data must be a multiple of 8 bytes");
        }
        byte[] bArr2 = this.iv;
        byte[] bArr3 = new byte[i11 - bArr2.length];
        byte[] bArr4 = new byte[bArr2.length];
        byte[] bArr5 = new byte[bArr2.length + 8];
        System.arraycopy(bArr, i10, bArr4, 0, bArr2.length);
        byte[] bArr6 = this.iv;
        System.arraycopy(bArr, i10 + bArr6.length, bArr3, 0, i11 - bArr6.length);
        this.f62465a.a(!this.f62466b, this.f62467c);
        int i13 = i12 - 1;
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = i13; i15 >= 1; i15--) {
                System.arraycopy(bArr4, 0, bArr5, 0, this.iv.length);
                int i16 = (i15 - 1) * 8;
                System.arraycopy(bArr3, i16, bArr5, this.iv.length, 8);
                int i17 = (i13 * i14) + i15;
                int i18 = 1;
                while (i17 != 0) {
                    int length = this.iv.length - i18;
                    bArr5[length] = (byte) (((byte) i17) ^ bArr5[length]);
                    i17 >>>= 8;
                    i18++;
                }
                this.f62465a.processBlock(bArr5, 0, bArr5, 0);
                System.arraycopy(bArr5, 0, bArr4, 0, 8);
                System.arraycopy(bArr5, 8, bArr3, i16, 8);
            }
        }
        if (Aj.a.k(bArr4, this.iv)) {
            return bArr3;
        }
        throw new org.spongycastle.crypto.r("checksum failed");
    }

    @Override // org.spongycastle.crypto.C
    public byte[] wrap(byte[] bArr, int i10, int i11) {
        if (!this.f62468d) {
            throw new IllegalStateException("not set for wrapping");
        }
        int i12 = i11 / 8;
        if (i12 * 8 != i11) {
            throw new org.spongycastle.crypto.l("wrap data must be a multiple of 8 bytes");
        }
        byte[] bArr2 = this.iv;
        byte[] bArr3 = new byte[bArr2.length + i11];
        byte[] bArr4 = new byte[bArr2.length + 8];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, this.iv.length, i11);
        this.f62465a.a(this.f62466b, this.f62467c);
        for (int i13 = 0; i13 != 6; i13++) {
            for (int i14 = 1; i14 <= i12; i14++) {
                System.arraycopy(bArr3, 0, bArr4, 0, this.iv.length);
                int i15 = i14 * 8;
                System.arraycopy(bArr3, i15, bArr4, this.iv.length, 8);
                this.f62465a.processBlock(bArr4, 0, bArr4, 0);
                int i16 = (i12 * i13) + i14;
                int i17 = 1;
                while (i16 != 0) {
                    int length = this.iv.length - i17;
                    bArr4[length] = (byte) (((byte) i16) ^ bArr4[length]);
                    i16 >>>= 8;
                    i17++;
                }
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr3, i15, 8);
            }
        }
        return bArr3;
    }

    public C(org.spongycastle.crypto.e eVar, boolean z10) {
        this.iv = new byte[]{-90, -90, -90, -90, -90, -90, -90, -90};
        this.f62465a = eVar;
        this.f62466b = !z10;
    }
}
