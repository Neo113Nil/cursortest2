package org.spongycastle.crypto.engines;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.spongycastle.crypto.params.AbstractC5975b;

/* renamed from: org.spongycastle.crypto.engines.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5969t {
    private byte[] IV;

    /* renamed from: V, reason: collision with root package name */
    byte[] f62592V;

    /* renamed from: a, reason: collision with root package name */
    public org.spongycastle.crypto.d f62593a;

    /* renamed from: b, reason: collision with root package name */
    public org.spongycastle.crypto.m f62594b;

    /* renamed from: c, reason: collision with root package name */
    public org.spongycastle.crypto.v f62595c;

    /* renamed from: d, reason: collision with root package name */
    public org.spongycastle.crypto.g f62596d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f62597e;

    /* renamed from: f, reason: collision with root package name */
    public org.spongycastle.crypto.j f62598f;

    /* renamed from: g, reason: collision with root package name */
    public org.spongycastle.crypto.j f62599g;

    /* renamed from: h, reason: collision with root package name */
    public org.spongycastle.crypto.params.t f62600h;

    /* renamed from: i, reason: collision with root package name */
    public Xi.g f62601i;

    /* renamed from: j, reason: collision with root package name */
    public org.spongycastle.crypto.u f62602j;
    byte[] macBuf;

    public C5969t(org.spongycastle.crypto.d dVar, org.spongycastle.crypto.m mVar, org.spongycastle.crypto.v vVar) {
        this.f62593a = dVar;
        this.f62594b = mVar;
        this.f62595c = vVar;
        this.macBuf = new byte[vVar.getMacSize()];
        this.f62596d = null;
    }

    public final byte[] a(byte[] bArr, int i10, int i11) {
        byte[] bArr2;
        byte[] bArr3;
        int g10;
        byte[] bArr4;
        if (i11 < this.f62592V.length + this.f62595c.getMacSize()) {
            throw new org.spongycastle.crypto.r("Length of input must be greater than the MAC and V combined");
        }
        if (this.f62596d == null) {
            int length = (i11 - this.f62592V.length) - this.f62595c.getMacSize();
            byte[] bArr5 = new byte[length];
            int c10 = this.f62600h.c() / 8;
            bArr2 = new byte[c10];
            int i12 = length + c10;
            byte[] bArr6 = new byte[i12];
            this.f62594b.generateBytes(bArr6, 0, i12);
            if (this.f62592V.length != 0) {
                System.arraycopy(bArr6, 0, bArr2, 0, c10);
                System.arraycopy(bArr6, c10, bArr5, 0, length);
            } else {
                System.arraycopy(bArr6, 0, bArr5, 0, length);
                System.arraycopy(bArr6, length, bArr2, 0, c10);
            }
            bArr4 = new byte[length];
            for (int i13 = 0; i13 != length; i13++) {
                bArr4[i13] = (byte) (bArr[(this.f62592V.length + i10) + i13] ^ bArr5[i13]);
            }
            bArr3 = bArr;
            g10 = 0;
        } else {
            int d10 = ((org.spongycastle.crypto.params.u) this.f62600h).d() / 8;
            byte[] bArr7 = new byte[d10];
            int c11 = this.f62600h.c() / 8;
            bArr2 = new byte[c11];
            int i14 = d10 + c11;
            byte[] bArr8 = new byte[i14];
            this.f62594b.generateBytes(bArr8, 0, i14);
            System.arraycopy(bArr8, 0, bArr7, 0, d10);
            System.arraycopy(bArr8, d10, bArr2, 0, c11);
            if (this.IV != null) {
                this.f62596d.f(false, new org.spongycastle.crypto.params.z(new org.spongycastle.crypto.params.w(bArr7), this.IV));
            } else {
                this.f62596d.f(false, new org.spongycastle.crypto.params.w(bArr7));
            }
            byte[] bArr9 = new byte[this.f62596d.c((i11 - this.f62592V.length) - this.f62595c.getMacSize())];
            org.spongycastle.crypto.g gVar = this.f62596d;
            byte[] bArr10 = this.f62592V;
            bArr3 = bArr;
            g10 = gVar.g(bArr3, i10 + bArr10.length, (i11 - bArr10.length) - this.f62595c.getMacSize(), bArr9, 0);
            bArr4 = bArr9;
        }
        byte[] b10 = this.f62600h.b();
        byte[] e10 = this.f62592V.length != 0 ? e(b10) : null;
        int i15 = i10 + i11;
        byte[] l10 = Aj.a.l(bArr3, i15 - this.f62595c.getMacSize(), i15);
        int length2 = l10.length;
        byte[] bArr11 = new byte[length2];
        this.f62595c.a(new org.spongycastle.crypto.params.w(bArr2));
        org.spongycastle.crypto.v vVar = this.f62595c;
        byte[] bArr12 = this.f62592V;
        vVar.update(bArr3, i10 + bArr12.length, (i11 - bArr12.length) - length2);
        if (b10 != null) {
            this.f62595c.update(b10, 0, b10.length);
        }
        if (this.f62592V.length != 0) {
            this.f62595c.update(e10, 0, e10.length);
        }
        this.f62595c.doFinal(bArr11, 0);
        if (!Aj.a.k(l10, bArr11)) {
            throw new org.spongycastle.crypto.r("invalid MAC");
        }
        org.spongycastle.crypto.g gVar2 = this.f62596d;
        return gVar2 == null ? bArr4 : Aj.a.l(bArr4, 0, g10 + gVar2.a(bArr4, g10));
    }

    public final byte[] b(byte[] bArr, int i10, int i11) {
        byte[] bArr2;
        byte[] bArr3;
        if (this.f62596d == null) {
            byte[] bArr4 = new byte[i11];
            int c10 = this.f62600h.c() / 8;
            bArr2 = new byte[c10];
            int i12 = i11 + c10;
            byte[] bArr5 = new byte[i12];
            this.f62594b.generateBytes(bArr5, 0, i12);
            if (this.f62592V.length != 0) {
                System.arraycopy(bArr5, 0, bArr2, 0, c10);
                System.arraycopy(bArr5, c10, bArr4, 0, i11);
            } else {
                System.arraycopy(bArr5, 0, bArr4, 0, i11);
                System.arraycopy(bArr5, i11, bArr2, 0, c10);
            }
            bArr3 = new byte[i11];
            for (int i13 = 0; i13 != i11; i13++) {
                bArr3[i13] = (byte) (bArr[i10 + i13] ^ bArr4[i13]);
            }
        } else {
            int d10 = ((org.spongycastle.crypto.params.u) this.f62600h).d() / 8;
            byte[] bArr6 = new byte[d10];
            int c11 = this.f62600h.c() / 8;
            byte[] bArr7 = new byte[c11];
            int i14 = d10 + c11;
            byte[] bArr8 = new byte[i14];
            this.f62594b.generateBytes(bArr8, 0, i14);
            System.arraycopy(bArr8, 0, bArr6, 0, d10);
            System.arraycopy(bArr8, d10, bArr7, 0, c11);
            if (this.IV != null) {
                this.f62596d.f(true, new org.spongycastle.crypto.params.z(new org.spongycastle.crypto.params.w(bArr6), this.IV));
            } else {
                this.f62596d.f(true, new org.spongycastle.crypto.params.w(bArr6));
            }
            byte[] bArr9 = new byte[this.f62596d.c(i11)];
            int g10 = this.f62596d.g(bArr, i10, i11, bArr9, 0);
            i11 = g10 + this.f62596d.a(bArr9, g10);
            bArr2 = bArr7;
            bArr3 = bArr9;
        }
        byte[] b10 = this.f62600h.b();
        byte[] e10 = this.f62592V.length != 0 ? e(b10) : null;
        int macSize = this.f62595c.getMacSize();
        byte[] bArr10 = new byte[macSize];
        this.f62595c.a(new org.spongycastle.crypto.params.w(bArr2));
        this.f62595c.update(bArr3, 0, bArr3.length);
        if (b10 != null) {
            this.f62595c.update(b10, 0, b10.length);
        }
        if (this.f62592V.length != 0) {
            this.f62595c.update(e10, 0, e10.length);
        }
        this.f62595c.doFinal(bArr10, 0);
        byte[] bArr11 = this.f62592V;
        byte[] bArr12 = new byte[bArr11.length + i11 + macSize];
        System.arraycopy(bArr11, 0, bArr12, 0, bArr11.length);
        System.arraycopy(bArr3, 0, bArr12, this.f62592V.length, i11);
        System.arraycopy(bArr10, 0, bArr12, this.f62592V.length + i11, macSize);
        return bArr12;
    }

    public final void c(org.spongycastle.crypto.j jVar) {
        if (!(jVar instanceof org.spongycastle.crypto.params.z)) {
            this.IV = null;
            this.f62600h = (org.spongycastle.crypto.params.t) jVar;
        } else {
            org.spongycastle.crypto.params.z zVar = (org.spongycastle.crypto.params.z) jVar;
            this.IV = zVar.a();
            this.f62600h = (org.spongycastle.crypto.params.t) zVar.b();
        }
    }

    public org.spongycastle.crypto.g d() {
        return this.f62596d;
    }

    public byte[] e(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        if (bArr != null) {
            Aj.f.m(bArr.length * 8, bArr2, 0);
        }
        return bArr2;
    }

    public org.spongycastle.crypto.v f() {
        return this.f62595c;
    }

    public void g(AbstractC5975b abstractC5975b, org.spongycastle.crypto.j jVar, Xi.g gVar) {
        this.f62597e = true;
        this.f62599g = abstractC5975b;
        this.f62601i = gVar;
        c(jVar);
    }

    public void h(AbstractC5975b abstractC5975b, org.spongycastle.crypto.j jVar, org.spongycastle.crypto.u uVar) {
        this.f62597e = false;
        this.f62598f = abstractC5975b;
        this.f62602j = uVar;
        c(jVar);
    }

    public void i(boolean z10, org.spongycastle.crypto.j jVar, org.spongycastle.crypto.j jVar2, org.spongycastle.crypto.j jVar3) {
        this.f62597e = z10;
        this.f62598f = jVar;
        this.f62599g = jVar2;
        this.f62592V = new byte[0];
        c(jVar3);
    }

    public byte[] j(byte[] bArr, int i10, int i11) {
        if (this.f62597e) {
            Xi.g gVar = this.f62601i;
            if (gVar != null) {
                org.spongycastle.crypto.p a10 = gVar.a();
                this.f62598f = a10.b().a();
                this.f62592V = a10.a();
            }
        } else if (this.f62602j != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i10, i11);
            try {
                this.f62599g = this.f62602j.readKey(byteArrayInputStream);
                this.f62592V = Aj.a.l(bArr, i10, (i11 - byteArrayInputStream.available()) + i10);
            } catch (IOException e10) {
                throw new org.spongycastle.crypto.r("unable to recover ephemeral public key: " + e10.getMessage(), e10);
            } catch (IllegalArgumentException e11) {
                throw new org.spongycastle.crypto.r("unable to recover ephemeral public key: " + e11.getMessage(), e11);
            }
        }
        this.f62593a.a(this.f62598f);
        byte[] a11 = Aj.b.a(this.f62593a.getFieldSize(), this.f62593a.b(this.f62599g));
        byte[] bArr2 = this.f62592V;
        if (bArr2.length != 0) {
            byte[] j10 = Aj.a.j(bArr2, a11);
            Aj.a.m(a11, (byte) 0);
            a11 = j10;
        }
        try {
            this.f62594b.a(new org.spongycastle.crypto.params.v(a11, this.f62600h.a()));
            byte[] b10 = this.f62597e ? b(bArr, i10, i11) : a(bArr, i10, i11);
            Aj.a.m(a11, (byte) 0);
            return b10;
        } catch (Throwable th2) {
            Aj.a.m(a11, (byte) 0);
            throw th2;
        }
    }

    public C5969t(org.spongycastle.crypto.d dVar, org.spongycastle.crypto.m mVar, org.spongycastle.crypto.v vVar, org.spongycastle.crypto.g gVar) {
        this.f62593a = dVar;
        this.f62594b = mVar;
        this.f62595c = vVar;
        this.macBuf = new byte[vVar.getMacSize()];
        this.f62596d = gVar;
    }
}
