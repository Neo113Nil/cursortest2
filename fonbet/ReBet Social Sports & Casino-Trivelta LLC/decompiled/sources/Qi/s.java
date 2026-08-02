package Qi;

import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.AbstractC5947z;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5929g;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.asn1.P;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class s extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public C5929g f9847a;

    /* renamed from: b, reason: collision with root package name */
    public C5936n f9848b;

    /* renamed from: c, reason: collision with root package name */
    public a f9849c;

    /* renamed from: d, reason: collision with root package name */
    public P f9850d;

    public s(AbstractC5941t abstractC5941t) {
        if (abstractC5941t.size() > 4 || abstractC5941t.size() < 3) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC5941t.size());
        }
        int i10 = 0;
        this.f9847a = C5929g.l(abstractC5941t.n(0));
        if (abstractC5941t.size() == 4) {
            i10 = 1;
            this.f9848b = C5936n.p(abstractC5941t.n(1));
        }
        this.f9849c = a.e(abstractC5941t.n(i10 + 1));
        this.f9850d = P.q(abstractC5941t.n(i10 + 2));
    }

    public static s c(Object obj) {
        if (obj instanceof s) {
            return (s) obj;
        }
        if (obj != null) {
            return new s(AbstractC5941t.k(obj));
        }
        return null;
    }

    public static s e(AbstractC5947z abstractC5947z, boolean z10) {
        return c(AbstractC5941t.l(abstractC5947z, z10));
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(this.f9847a);
        C5936n c5936n = this.f9848b;
        if (c5936n != null) {
            c5928f.a(c5936n);
        }
        c5928f.a(this.f9849c);
        c5928f.a(this.f9850d);
        return new d0(c5928f);
    }
}
