package org.spongycastle.asn1;

import java.util.Enumeration;

/* loaded from: classes5.dex */
public class w0 extends AbstractC5941t {
    private byte[] encoded;

    public w0(byte[] bArr) {
        this.encoded = bArr;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        byte[] bArr = this.encoded;
        if (bArr != null) {
            c5939q.g(48, bArr);
        } else {
            super.j().e(c5939q);
        }
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public int f() {
        byte[] bArr = this.encoded;
        return bArr != null ? z0.a(bArr.length) + 1 + this.encoded.length : super.j().f();
    }

    @Override // org.spongycastle.asn1.AbstractC5941t, org.spongycastle.asn1.AbstractC5940s
    public AbstractC5940s i() {
        if (this.encoded != null) {
            q();
        }
        return super.i();
    }

    @Override // org.spongycastle.asn1.AbstractC5941t, org.spongycastle.asn1.AbstractC5940s
    public AbstractC5940s j() {
        if (this.encoded != null) {
            q();
        }
        return super.j();
    }

    @Override // org.spongycastle.asn1.AbstractC5941t
    public synchronized InterfaceC5927e n(int i10) {
        try {
            if (this.encoded != null) {
                q();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return super.n(i10);
    }

    @Override // org.spongycastle.asn1.AbstractC5941t
    public synchronized Enumeration o() {
        byte[] bArr = this.encoded;
        if (bArr == null) {
            return super.o();
        }
        return new v0(bArr);
    }

    public final void q() {
        v0 v0Var = new v0(this.encoded);
        while (v0Var.hasMoreElements()) {
            this.f62271a.addElement(v0Var.nextElement());
        }
        this.encoded = null;
    }

    @Override // org.spongycastle.asn1.AbstractC5941t
    public synchronized int size() {
        try {
            if (this.encoded != null) {
                q();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return super.size();
    }
}
