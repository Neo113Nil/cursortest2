package org.spongycastle.crypto;

/* loaded from: classes5.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public int f62620a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f62621b;
    protected byte[] buf;

    /* renamed from: c, reason: collision with root package name */
    public e f62622c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f62623d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f62624e;

    public g() {
    }

    public int a(byte[] bArr, int i10) {
        try {
            int i11 = this.f62620a;
            if (i10 + i11 > bArr.length) {
                throw new x("output buffer too short for doFinal()");
            }
            int i12 = 0;
            if (i11 != 0) {
                if (!this.f62623d) {
                    throw new l("data not block size aligned");
                }
                e eVar = this.f62622c;
                byte[] bArr2 = this.buf;
                eVar.processBlock(bArr2, 0, bArr2, 0);
                int i13 = this.f62620a;
                this.f62620a = 0;
                System.arraycopy(this.buf, 0, bArr, i10, i13);
                i12 = i13;
            }
            h();
            return i12;
        } catch (Throwable th2) {
            h();
            throw th2;
        }
    }

    public int b() {
        return this.f62622c.getBlockSize();
    }

    public int c(int i10) {
        return i10 + this.f62620a;
    }

    public e d() {
        return this.f62622c;
    }

    public int e(int i10) {
        int i11 = i10 + this.f62620a;
        return i11 - (this.f62624e ? this.f62621b ? (i11 % this.buf.length) - (this.f62622c.getBlockSize() + 2) : i11 % this.buf.length : i11 % this.buf.length);
    }

    public void f(boolean z10, j jVar) {
        this.f62621b = z10;
        h();
        this.f62622c.a(z10, jVar);
    }

    public int g(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13;
        if (i11 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int b10 = b();
        int e10 = e(i11);
        if (e10 > 0 && e10 + i12 > bArr2.length) {
            throw new x("output buffer too short");
        }
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i14 = this.f62620a;
        int i15 = length - i14;
        if (i11 > i15) {
            System.arraycopy(bArr, i10, bArr3, i14, i15);
            i13 = this.f62622c.processBlock(this.buf, 0, bArr2, i12);
            this.f62620a = 0;
            i11 -= i15;
            i10 += i15;
            while (i11 > this.buf.length) {
                i13 += this.f62622c.processBlock(bArr, i10, bArr2, i12 + i13);
                i11 -= b10;
                i10 += b10;
            }
        } else {
            i13 = 0;
        }
        System.arraycopy(bArr, i10, this.buf, this.f62620a, i11);
        int i16 = this.f62620a + i11;
        this.f62620a = i16;
        byte[] bArr4 = this.buf;
        if (i16 != bArr4.length) {
            return i13;
        }
        int processBlock = i13 + this.f62622c.processBlock(bArr4, 0, bArr2, i12 + i13);
        this.f62620a = 0;
        return processBlock;
    }

    public void h() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i10 >= bArr.length) {
                this.f62620a = 0;
                this.f62622c.reset();
                return;
            } else {
                bArr[i10] = 0;
                i10++;
            }
        }
    }

    public g(e eVar) {
        this.f62622c = eVar;
        this.buf = new byte[eVar.getBlockSize()];
        boolean z10 = false;
        this.f62620a = 0;
        String algorithmName = eVar.getAlgorithmName();
        int indexOf = algorithmName.indexOf(47) + 1;
        boolean z11 = indexOf > 0 && algorithmName.startsWith("PGP", indexOf);
        this.f62624e = z11;
        if (z11 || (eVar instanceof B)) {
            this.f62623d = true;
            return;
        }
        if (indexOf > 0 && algorithmName.startsWith("OpenPGP", indexOf)) {
            z10 = true;
        }
        this.f62623d = z10;
    }
}
