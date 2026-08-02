package org.spongycastle.asn1;

/* loaded from: classes5.dex */
public class V extends AbstractC5940s implements InterfaceC5946y {
    private final byte[] string;

    public V(byte[] bArr) {
        this.string = Aj.a.d(bArr);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean c(AbstractC5940s abstractC5940s) {
        if (abstractC5940s instanceof V) {
            return Aj.a.a(this.string, ((V) abstractC5940s).string);
        }
        return false;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        c5939q.g(25, this.string);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public int f() {
        return z0.a(this.string.length) + 1 + this.string.length;
    }

    @Override // org.spongycastle.asn1.InterfaceC5946y
    public String getString() {
        return Aj.h.b(this.string);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean h() {
        return false;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s, org.spongycastle.asn1.AbstractC5935m
    public int hashCode() {
        return Aj.a.q(this.string);
    }
}
