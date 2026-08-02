package Qi;

import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.AbstractC5947z;
import org.spongycastle.asn1.C5933k;
import org.spongycastle.asn1.P;

/* loaded from: classes5.dex */
public class w extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC5941t f9860a;

    /* renamed from: b, reason: collision with root package name */
    public C5933k f9861b;

    /* renamed from: c, reason: collision with root package name */
    public C5933k f9862c;

    /* renamed from: d, reason: collision with root package name */
    public a f9863d;

    /* renamed from: e, reason: collision with root package name */
    public Oi.c f9864e;

    /* renamed from: f, reason: collision with root package name */
    public x f9865f;

    /* renamed from: g, reason: collision with root package name */
    public x f9866g;

    /* renamed from: h, reason: collision with root package name */
    public Oi.c f9867h;

    /* renamed from: i, reason: collision with root package name */
    public u f9868i;

    /* renamed from: j, reason: collision with root package name */
    public P f9869j;

    /* renamed from: k, reason: collision with root package name */
    public P f9870k;

    /* renamed from: l, reason: collision with root package name */
    public l f9871l;

    public w(AbstractC5941t abstractC5941t) {
        int i10;
        this.f9860a = abstractC5941t;
        if (abstractC5941t.n(0) instanceof AbstractC5947z) {
            this.f9861b = C5933k.l((AbstractC5947z) abstractC5941t.n(0), true);
            i10 = 0;
        } else {
            this.f9861b = new C5933k(0L);
            i10 = -1;
        }
        this.f9862c = C5933k.k(abstractC5941t.n(i10 + 1));
        this.f9863d = a.e(abstractC5941t.n(i10 + 2));
        this.f9864e = Oi.c.c(abstractC5941t.n(i10 + 3));
        AbstractC5941t abstractC5941t2 = (AbstractC5941t) abstractC5941t.n(i10 + 4);
        this.f9865f = x.c(abstractC5941t2.n(0));
        this.f9866g = x.c(abstractC5941t2.n(1));
        this.f9867h = Oi.c.c(abstractC5941t.n(i10 + 5));
        int i11 = i10 + 6;
        this.f9868i = u.f(abstractC5941t.n(i11));
        for (int size = (abstractC5941t.size() - i11) - 1; size > 0; size--) {
            AbstractC5947z abstractC5947z = (AbstractC5947z) abstractC5941t.n(i11 + size);
            int n10 = abstractC5947z.n();
            if (n10 == 1) {
                this.f9869j = P.r(abstractC5947z, false);
            } else if (n10 == 2) {
                this.f9870k = P.r(abstractC5947z, false);
            } else if (n10 == 3) {
                this.f9871l = l.e(AbstractC5941t.l(abstractC5947z, true));
            }
        }
    }

    public static w e(Object obj) {
        if (obj instanceof w) {
            return (w) obj;
        }
        if (obj != null) {
            return new w(AbstractC5941t.k(obj));
        }
        return null;
    }

    public l c() {
        return this.f9871l;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        return this.f9860a;
    }
}
