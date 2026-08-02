package org.spongycastle.asn1;

import org.bouncycastle.asn1.ASN1Encoding;

/* loaded from: classes5.dex */
public class P extends AbstractC5924b {
    public P(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    public static P p(byte[] bArr) {
        if (bArr.length < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        byte b10 = bArr[0];
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        if (length != 0) {
            System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
        }
        return new P(bArr2, b10);
    }

    public static P q(Object obj) {
        if (obj == null || (obj instanceof P)) {
            return (P) obj;
        }
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            return new P(n0Var.data, n0Var.f62248a);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (P) AbstractC5940s.g((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e10.toString());
        }
    }

    public static P r(AbstractC5947z abstractC5947z, boolean z10) {
        AbstractC5940s m10 = abstractC5947z.m();
        return (z10 || (m10 instanceof P)) ? q(m10) : p(((AbstractC5937o) m10).m());
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        byte[] k10 = AbstractC5924b.k(this.data, this.f62248a);
        int length = k10.length;
        byte[] bArr = new byte[length + 1];
        bArr[0] = (byte) o();
        System.arraycopy(k10, 0, bArr, 1, length);
        c5939q.g(3, bArr);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public int f() {
        return z0.a(this.data.length + 1) + 1 + this.data.length + 1;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean h() {
        return false;
    }

    public P(byte[] bArr) {
        this(bArr, 0);
    }

    public P(InterfaceC5927e interfaceC5927e) {
        super(interfaceC5927e.toASN1Primitive().b(ASN1Encoding.DER), 0);
    }
}
