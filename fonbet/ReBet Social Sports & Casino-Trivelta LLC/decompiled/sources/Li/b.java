package Li;

import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.P;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class b extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public c f7206a;

    /* renamed from: b, reason: collision with root package name */
    public Qi.a f7207b;

    /* renamed from: c, reason: collision with root package name */
    public P f7208c;

    public b(c cVar, Qi.a aVar, P p10) {
        this.f7206a = cVar;
        this.f7207b = aVar;
        this.f7208c = p10;
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
        c5928f.a(this.f7206a);
        c5928f.a(this.f7207b);
        c5928f.a(this.f7208c);
        return new d0(c5928f);
    }

    public b(AbstractC5941t abstractC5941t) {
        this.f7206a = null;
        this.f7207b = null;
        this.f7208c = null;
        this.f7206a = c.c(abstractC5941t.n(0));
        this.f7207b = Qi.a.e(abstractC5941t.n(1));
        this.f7208c = (P) abstractC5941t.n(2);
    }
}
