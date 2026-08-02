package Li;

import Qi.u;
import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.AbstractC5943v;
import org.spongycastle.asn1.AbstractC5947z;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5933k;
import org.spongycastle.asn1.d0;
import org.spongycastle.asn1.i0;

/* loaded from: classes5.dex */
public class c extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public C5933k f7209a;

    /* renamed from: b, reason: collision with root package name */
    public Oi.c f7210b;

    /* renamed from: c, reason: collision with root package name */
    public u f7211c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC5943v f7212d;

    public c(Oi.c cVar, u uVar, AbstractC5943v abstractC5943v) {
        this.f7209a = new C5933k(0L);
        this.f7212d = null;
        if (cVar == null || uVar == null) {
            throw new IllegalArgumentException("Not all mandatory fields set in CertificationRequestInfo generator.");
        }
        this.f7210b = cVar;
        this.f7211c = uVar;
        this.f7212d = abstractC5943v;
    }

    public static c c(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(AbstractC5941t.k(obj));
        }
        return null;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(this.f7209a);
        c5928f.a(this.f7210b);
        c5928f.a(this.f7211c);
        if (this.f7212d != null) {
            c5928f.a(new i0(false, 0, this.f7212d));
        }
        return new d0(c5928f);
    }

    public c(AbstractC5941t abstractC5941t) {
        this.f7209a = new C5933k(0L);
        this.f7212d = null;
        this.f7209a = (C5933k) abstractC5941t.n(0);
        this.f7210b = Oi.c.c(abstractC5941t.n(1));
        this.f7211c = u.f(abstractC5941t.n(2));
        if (abstractC5941t.size() > 3) {
            this.f7212d = AbstractC5943v.m((AbstractC5947z) abstractC5941t.n(3), false);
        }
        if (this.f7210b == null || this.f7209a == null || this.f7211c == null) {
            throw new IllegalArgumentException("Not all mandatory fields set in CertificationRequestInfo generator.");
        }
    }
}
