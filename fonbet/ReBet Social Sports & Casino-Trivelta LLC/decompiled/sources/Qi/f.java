package Qi;

import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5933k;
import org.spongycastle.asn1.InterfaceC5927e;
import org.spongycastle.asn1.P;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class f extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public C5933k f9769a;

    /* renamed from: b, reason: collision with root package name */
    public p f9770b;

    /* renamed from: c, reason: collision with root package name */
    public b f9771c;

    /* renamed from: d, reason: collision with root package name */
    public a f9772d;

    /* renamed from: e, reason: collision with root package name */
    public C5933k f9773e;

    /* renamed from: f, reason: collision with root package name */
    public c f9774f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC5941t f9775g;

    /* renamed from: h, reason: collision with root package name */
    public P f9776h;

    /* renamed from: i, reason: collision with root package name */
    public l f9777i;

    public f(AbstractC5941t abstractC5941t) {
        if (abstractC5941t.size() < 6 || abstractC5941t.size() > 9) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC5941t.size());
        }
        int i10 = 0;
        if (abstractC5941t.n(0) instanceof C5933k) {
            this.f9769a = C5933k.k(abstractC5941t.n(0));
            i10 = 1;
        } else {
            this.f9769a = new C5933k(0L);
        }
        this.f9770b = p.c(abstractC5941t.n(i10));
        this.f9771c = b.c(abstractC5941t.n(i10 + 1));
        this.f9772d = a.e(abstractC5941t.n(i10 + 2));
        this.f9773e = C5933k.k(abstractC5941t.n(i10 + 3));
        this.f9774f = c.c(abstractC5941t.n(i10 + 4));
        this.f9775g = AbstractC5941t.k(abstractC5941t.n(i10 + 5));
        for (int i11 = i10 + 6; i11 < abstractC5941t.size(); i11++) {
            InterfaceC5927e n10 = abstractC5941t.n(i11);
            if (n10 instanceof P) {
                this.f9776h = P.q(abstractC5941t.n(i11));
            } else if ((n10 instanceof AbstractC5941t) || (n10 instanceof l)) {
                this.f9777i = l.e(abstractC5941t.n(i11));
            }
        }
    }

    public static f e(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj != null) {
            return new f(AbstractC5941t.k(obj));
        }
        return null;
    }

    public l c() {
        return this.f9777i;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        if (this.f9769a.n().intValue() != 0) {
            c5928f.a(this.f9769a);
        }
        c5928f.a(this.f9770b);
        c5928f.a(this.f9771c);
        c5928f.a(this.f9772d);
        c5928f.a(this.f9773e);
        c5928f.a(this.f9774f);
        c5928f.a(this.f9775g);
        P p10 = this.f9776h;
        if (p10 != null) {
            c5928f.a(p10);
        }
        l lVar = this.f9777i;
        if (lVar != null) {
            c5928f.a(lVar);
        }
        return new d0(c5928f);
    }
}
