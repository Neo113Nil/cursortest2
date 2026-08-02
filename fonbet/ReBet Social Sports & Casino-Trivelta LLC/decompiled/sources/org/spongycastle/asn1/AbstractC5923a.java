package org.spongycastle.asn1;

/* renamed from: org.spongycastle.asn1.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5923a extends AbstractC5940s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f62245a;

    /* renamed from: b, reason: collision with root package name */
    public final int f62246b;
    protected final byte[] octets;

    public AbstractC5923a(boolean z10, int i10, byte[] bArr) {
        this.f62245a = z10;
        this.f62246b = i10;
        this.octets = Aj.a.d(bArr);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean c(AbstractC5940s abstractC5940s) {
        if (!(abstractC5940s instanceof AbstractC5923a)) {
            return false;
        }
        AbstractC5923a abstractC5923a = (AbstractC5923a) abstractC5940s;
        return this.f62245a == abstractC5923a.f62245a && this.f62246b == abstractC5923a.f62246b && Aj.a.a(this.octets, abstractC5923a.octets);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public int f() {
        return z0.b(this.f62246b) + z0.a(this.octets.length) + this.octets.length;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean h() {
        return this.f62245a;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s, org.spongycastle.asn1.AbstractC5935m
    public int hashCode() {
        boolean z10 = this.f62245a;
        return ((z10 ? 1 : 0) ^ this.f62246b) ^ Aj.a.q(this.octets);
    }
}
