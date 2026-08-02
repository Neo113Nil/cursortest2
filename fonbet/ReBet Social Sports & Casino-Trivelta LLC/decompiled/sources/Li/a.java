package Li;

import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.AbstractC5943v;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class a extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public C5936n f7204a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC5943v f7205b;

    public a(AbstractC5941t abstractC5941t) {
        this.f7204a = (C5936n) abstractC5941t.n(0);
        this.f7205b = (AbstractC5943v) abstractC5941t.n(1);
    }

    public static a c(Object obj) {
        if (obj == null || (obj instanceof a)) {
            return (a) obj;
        }
        if (obj instanceof AbstractC5941t) {
            return new a((AbstractC5941t) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(this.f7204a);
        c5928f.a(this.f7205b);
        return new d0(c5928f);
    }

    public a(C5936n c5936n, AbstractC5943v abstractC5943v) {
        this.f7204a = c5936n;
        this.f7205b = abstractC5943v;
    }
}
