package Ri;

import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5933k;
import org.spongycastle.asn1.P;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class b extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public P f10390a;

    /* renamed from: b, reason: collision with root package name */
    public C5933k f10391b;

    public b(AbstractC5941t abstractC5941t) {
        if (abstractC5941t.size() == 2) {
            this.f10390a = P.q(abstractC5941t.n(0));
            this.f10391b = C5933k.k(abstractC5941t.n(1));
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC5941t.size());
        }
    }

    public static b c(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(AbstractC5941t.k(obj));
        }
        return null;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(this.f10390a);
        c5928f.a(this.f10391b);
        return new d0(c5928f);
    }
}
