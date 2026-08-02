package Qi;

import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.AbstractC5947z;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.d0;
import org.spongycastle.asn1.i0;

/* loaded from: classes5.dex */
public class p extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public q f9833a;

    /* renamed from: b, reason: collision with root package name */
    public o f9834b;

    /* renamed from: c, reason: collision with root package name */
    public s f9835c;

    /* renamed from: d, reason: collision with root package name */
    public int f9836d;

    public p(AbstractC5947z abstractC5947z) {
        this.f9836d = 1;
        int n10 = abstractC5947z.n();
        if (n10 == 0) {
            this.f9833a = q.e(abstractC5947z, true);
        } else {
            if (n10 != 1) {
                throw new IllegalArgumentException("unknown tag in Holder");
            }
            this.f9834b = o.e(abstractC5947z, true);
        }
        this.f9836d = 0;
    }

    public static p c(Object obj) {
        if (obj instanceof p) {
            return (p) obj;
        }
        if (obj instanceof AbstractC5947z) {
            return new p(AbstractC5947z.k(obj));
        }
        if (obj != null) {
            return new p(AbstractC5941t.k(obj));
        }
        return null;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        if (this.f9836d != 1) {
            return this.f9834b != null ? new i0(true, 1, this.f9834b) : new i0(true, 0, this.f9833a);
        }
        C5928f c5928f = new C5928f();
        if (this.f9833a != null) {
            c5928f.a(new i0(false, 0, this.f9833a));
        }
        if (this.f9834b != null) {
            c5928f.a(new i0(false, 1, this.f9834b));
        }
        if (this.f9835c != null) {
            c5928f.a(new i0(false, 2, this.f9835c));
        }
        return new d0(c5928f);
    }

    public p(AbstractC5941t abstractC5941t) {
        this.f9836d = 1;
        if (abstractC5941t.size() <= 3) {
            for (int i10 = 0; i10 != abstractC5941t.size(); i10++) {
                AbstractC5947z k10 = AbstractC5947z.k(abstractC5941t.n(i10));
                int n10 = k10.n();
                if (n10 == 0) {
                    this.f9833a = q.e(k10, false);
                } else if (n10 == 1) {
                    this.f9834b = o.e(k10, false);
                } else if (n10 == 2) {
                    this.f9835c = s.e(k10, false);
                } else {
                    throw new IllegalArgumentException("unknown tag in Holder");
                }
            }
            this.f9836d = 1;
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + abstractC5941t.size());
    }
}
