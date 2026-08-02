package org.spongycastle.crypto.engines;

/* loaded from: classes5.dex */
public class D implements org.spongycastle.crypto.C {

    /* renamed from: a, reason: collision with root package name */
    public org.spongycastle.crypto.e f62469a;

    /* renamed from: b, reason: collision with root package name */
    public org.spongycastle.crypto.params.w f62470b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f62471c;
    private byte[] extractedAIV = null;
    private byte[] highOrderIV;
    private byte[] preIV;

    public D(org.spongycastle.crypto.e eVar) {
        byte[] bArr = {-90, 89, 89, -90};
        this.highOrderIV = bArr;
        this.preIV = bArr;
        this.f62469a = eVar;
    }

    @Override // org.spongycastle.crypto.C
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        this.f62471c = z10;
        if (jVar instanceof org.spongycastle.crypto.params.A) {
            jVar = ((org.spongycastle.crypto.params.A) jVar).a();
        }
        if (jVar instanceof org.spongycastle.crypto.params.w) {
            this.f62470b = (org.spongycastle.crypto.params.w) jVar;
            this.preIV = this.highOrderIV;
        } else if (jVar instanceof org.spongycastle.crypto.params.z) {
            org.spongycastle.crypto.params.z zVar = (org.spongycastle.crypto.params.z) jVar;
            this.preIV = zVar.a();
            this.f62470b = (org.spongycastle.crypto.params.w) zVar.b();
            if (this.preIV.length != 4) {
                throw new IllegalArgumentException("IV length not equal to 4");
            }
        }
    }

    public final byte[] b(byte[] bArr) {
        int length = bArr.length;
        int i10 = (8 - (length % 8)) % 8;
        byte[] bArr2 = new byte[length + i10];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        if (i10 != 0) {
            System.arraycopy(new byte[i10], 0, bArr2, length, i10);
        }
        return bArr2;
    }

    public final byte[] c(byte[] bArr, int i10, int i11) {
        int i12 = i11 - 8;
        byte[] bArr2 = new byte[i12];
        byte[] bArr3 = new byte[8];
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArr, i10, bArr3, 0, 8);
        System.arraycopy(bArr, i10 + 8, bArr2, 0, i12);
        this.f62469a.a(false, this.f62470b);
        int i13 = (i11 / 8) - 1;
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = i13; i15 >= 1; i15--) {
                System.arraycopy(bArr3, 0, bArr4, 0, 8);
                int i16 = (i15 - 1) * 8;
                System.arraycopy(bArr2, i16, bArr4, 8, 8);
                int i17 = (i13 * i14) + i15;
                int i18 = 1;
                while (i17 != 0) {
                    int i19 = 8 - i18;
                    bArr4[i19] = (byte) (((byte) i17) ^ bArr4[i19]);
                    i17 >>>= 8;
                    i18++;
                }
                this.f62469a.processBlock(bArr4, 0, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr2, i16, 8);
            }
        }
        this.extractedAIV = bArr3;
        return bArr2;
    }

    @Override // org.spongycastle.crypto.C
    public String getAlgorithmName() {
        return this.f62469a.getAlgorithmName();
    }

    @Override // org.spongycastle.crypto.C
    public byte[] unwrap(byte[] bArr, int i10, int i11) {
        byte[] c10;
        if (this.f62471c) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int i12 = i11 / 8;
        if (i12 * 8 != i11) {
            throw new org.spongycastle.crypto.r("unwrap data must be a multiple of 8 bytes");
        }
        if (i12 == 1) {
            throw new org.spongycastle.crypto.r("unwrap data must be at least 16 bytes");
        }
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        byte[] bArr3 = new byte[i11];
        if (i12 == 2) {
            this.f62469a.a(false, this.f62470b);
            int i13 = 0;
            while (i13 < i11) {
                this.f62469a.processBlock(bArr2, i13, bArr3, i13);
                i13 += this.f62469a.getBlockSize();
            }
            byte[] bArr4 = new byte[8];
            this.extractedAIV = bArr4;
            System.arraycopy(bArr3, 0, bArr4, 0, bArr4.length);
            byte[] bArr5 = this.extractedAIV;
            int length = i11 - bArr5.length;
            c10 = new byte[length];
            System.arraycopy(bArr3, bArr5.length, c10, 0, length);
        } else {
            c10 = c(bArr, i10, i11);
        }
        byte[] bArr6 = new byte[4];
        byte[] bArr7 = new byte[4];
        System.arraycopy(this.extractedAIV, 0, bArr6, 0, 4);
        System.arraycopy(this.extractedAIV, 4, bArr7, 0, 4);
        int a10 = Aj.f.a(bArr7, 0);
        boolean k10 = Aj.a.k(bArr6, this.preIV);
        int length2 = c10.length;
        if (a10 <= length2 - 8) {
            k10 = false;
        }
        if (a10 > length2) {
            k10 = false;
        }
        int i14 = length2 - a10;
        if (i14 >= c10.length) {
            i14 = c10.length;
            k10 = false;
        }
        byte[] bArr8 = new byte[i14];
        System.arraycopy(c10, c10.length - i14, bArr8, 0, i14);
        if (!Aj.a.k(bArr8, new byte[i14])) {
            k10 = false;
        }
        if (!k10) {
            throw new org.spongycastle.crypto.r("checksum failed");
        }
        byte[] bArr9 = new byte[a10];
        System.arraycopy(c10, 0, bArr9, 0, a10);
        return bArr9;
    }

    @Override // org.spongycastle.crypto.C
    public byte[] wrap(byte[] bArr, int i10, int i11) {
        if (!this.f62471c) {
            throw new IllegalStateException("not set for wrapping");
        }
        byte[] bArr2 = new byte[8];
        byte[] f10 = Aj.f.f(i11);
        byte[] bArr3 = this.preIV;
        int i12 = 0;
        System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        System.arraycopy(f10, 0, bArr2, this.preIV.length, f10.length);
        byte[] bArr4 = new byte[i11];
        System.arraycopy(bArr, i10, bArr4, 0, i11);
        byte[] b10 = b(bArr4);
        if (b10.length != 8) {
            C c10 = new C(this.f62469a);
            c10.a(true, new org.spongycastle.crypto.params.z(this.f62470b, bArr2));
            return c10.wrap(b10, 0, b10.length);
        }
        int length = b10.length + 8;
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, 8);
        System.arraycopy(b10, 0, bArr5, 8, b10.length);
        this.f62469a.a(true, this.f62470b);
        while (i12 < length) {
            this.f62469a.processBlock(bArr5, i12, bArr5, i12);
            i12 += this.f62469a.getBlockSize();
        }
        return bArr5;
    }
}
