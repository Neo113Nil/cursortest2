package org.spongycastle.asn1;

/* loaded from: classes5.dex */
public class j0 extends AbstractC5940s implements InterfaceC5946y {
    private final byte[] string;

    public j0(byte[] bArr) {
        this.string = bArr;
    }

    public static j0 k(Object obj) {
        if (obj == null || (obj instanceof j0)) {
            return (j0) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (j0) AbstractC5940s.g((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e10.toString());
        }
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean c(AbstractC5940s abstractC5940s) {
        if (abstractC5940s instanceof j0) {
            return Aj.a.a(this.string, ((j0) abstractC5940s).string);
        }
        return false;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        c5939q.g(12, this.string);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public int f() {
        return z0.a(this.string.length) + 1 + this.string.length;
    }

    @Override // org.spongycastle.asn1.InterfaceC5946y
    public String getString() {
        return Aj.h.c(this.string);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean h() {
        return false;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s, org.spongycastle.asn1.AbstractC5935m
    public int hashCode() {
        return Aj.a.q(this.string);
    }

    public String toString() {
        return getString();
    }

    public j0(String str) {
        this.string = Aj.h.i(str);
    }
}
