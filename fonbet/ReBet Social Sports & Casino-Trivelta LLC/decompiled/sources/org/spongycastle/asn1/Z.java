package org.spongycastle.asn1;

/* loaded from: classes5.dex */
public class Z extends AbstractC5937o {
    public Z(byte[] bArr) {
        super(bArr);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        c5939q.g(4, this.string);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public int f() {
        return z0.a(this.string.length) + 1 + this.string.length;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean h() {
        return false;
    }
}
