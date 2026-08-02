package Qi;

import org.spongycastle.asn1.A;
import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.AbstractC5947z;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5931i;
import org.spongycastle.asn1.C5933k;
import org.spongycastle.asn1.d0;
import org.spongycastle.asn1.i0;

/* loaded from: classes5.dex */
public class v extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public C5933k f9853a;

    /* renamed from: b, reason: collision with root package name */
    public a f9854b;

    /* renamed from: c, reason: collision with root package name */
    public Oi.c f9855c;

    /* renamed from: d, reason: collision with root package name */
    public x f9856d;

    /* renamed from: e, reason: collision with root package name */
    public x f9857e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC5941t f9858f;

    /* renamed from: g, reason: collision with root package name */
    public l f9859g;

    public v(AbstractC5941t abstractC5941t) {
        if (abstractC5941t.size() < 3 || abstractC5941t.size() > 7) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC5941t.size());
        }
        int i10 = 0;
        if (abstractC5941t.n(0) instanceof C5933k) {
            this.f9853a = C5933k.k(abstractC5941t.n(0));
            i10 = 1;
        } else {
            this.f9853a = null;
        }
        this.f9854b = a.e(abstractC5941t.n(i10));
        this.f9855c = Oi.c.c(abstractC5941t.n(i10 + 1));
        int i11 = i10 + 3;
        this.f9856d = x.c(abstractC5941t.n(i10 + 2));
        if (i11 < abstractC5941t.size() && ((abstractC5941t.n(i11) instanceof A) || (abstractC5941t.n(i11) instanceof C5931i) || (abstractC5941t.n(i11) instanceof x))) {
            this.f9857e = x.c(abstractC5941t.n(i11));
            i11 = i10 + 4;
        }
        if (i11 < abstractC5941t.size() && !(abstractC5941t.n(i11) instanceof AbstractC5947z)) {
            this.f9858f = AbstractC5941t.k(abstractC5941t.n(i11));
            i11++;
        }
        if (i11 >= abstractC5941t.size() || !(abstractC5941t.n(i11) instanceof AbstractC5947z)) {
            return;
        }
        this.f9859g = l.e(AbstractC5941t.l((AbstractC5947z) abstractC5941t.n(i11), true));
    }

    public static v e(Object obj) {
        if (obj instanceof v) {
            return (v) obj;
        }
        if (obj != null) {
            return new v(AbstractC5941t.k(obj));
        }
        return null;
    }

    public l c() {
        return this.f9859g;
    }

    public Oi.c f() {
        return this.f9855c;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        C5933k c5933k = this.f9853a;
        if (c5933k != null) {
            c5928f.a(c5933k);
        }
        c5928f.a(this.f9854b);
        c5928f.a(this.f9855c);
        c5928f.a(this.f9856d);
        x xVar = this.f9857e;
        if (xVar != null) {
            c5928f.a(xVar);
        }
        AbstractC5941t abstractC5941t = this.f9858f;
        if (abstractC5941t != null) {
            c5928f.a(abstractC5941t);
        }
        if (this.f9859g != null) {
            c5928f.a(new i0(0, this.f9859g));
        }
        return new d0(c5928f);
    }
}
