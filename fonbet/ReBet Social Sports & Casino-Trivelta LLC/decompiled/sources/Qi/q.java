package Qi;

import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.AbstractC5947z;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5933k;
import org.spongycastle.asn1.P;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class q extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public o f9837a;

    /* renamed from: b, reason: collision with root package name */
    public C5933k f9838b;

    /* renamed from: c, reason: collision with root package name */
    public P f9839c;

    public q(AbstractC5941t abstractC5941t) {
        if (abstractC5941t.size() != 2 && abstractC5941t.size() != 3) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC5941t.size());
        }
        this.f9837a = o.c(abstractC5941t.n(0));
        this.f9838b = C5933k.k(abstractC5941t.n(1));
        if (abstractC5941t.size() == 3) {
            this.f9839c = P.q(abstractC5941t.n(2));
        }
    }

    public static q c(Object obj) {
        if (obj instanceof q) {
            return (q) obj;
        }
        if (obj != null) {
            return new q(AbstractC5941t.k(obj));
        }
        return null;
    }

    public static q e(AbstractC5947z abstractC5947z, boolean z10) {
        return c(AbstractC5941t.l(abstractC5947z, z10));
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(this.f9837a);
        c5928f.a(this.f9838b);
        P p10 = this.f9839c;
        if (p10 != null) {
            c5928f.a(p10);
        }
        return new d0(c5928f);
    }
}
