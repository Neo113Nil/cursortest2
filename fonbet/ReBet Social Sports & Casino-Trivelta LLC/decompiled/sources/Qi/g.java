package Qi;

import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.P;

/* loaded from: classes5.dex */
public class g extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC5941t f9778a;

    /* renamed from: b, reason: collision with root package name */
    public w f9779b;

    /* renamed from: c, reason: collision with root package name */
    public a f9780c;

    /* renamed from: d, reason: collision with root package name */
    public P f9781d;

    public g(AbstractC5941t abstractC5941t) {
        this.f9778a = abstractC5941t;
        if (abstractC5941t.size() != 3) {
            throw new IllegalArgumentException("sequence wrong size for a certificate");
        }
        this.f9779b = w.e(abstractC5941t.n(0));
        this.f9780c = a.e(abstractC5941t.n(1));
        this.f9781d = P.q(abstractC5941t.n(2));
    }

    public static g c(Object obj) {
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj != null) {
            return new g(AbstractC5941t.k(obj));
        }
        return null;
    }

    public w e() {
        return this.f9779b;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        return this.f9778a;
    }
}
