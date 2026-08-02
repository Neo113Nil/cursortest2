package Qi;

import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.AbstractC5947z;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.d0;
import org.spongycastle.asn1.i0;

/* loaded from: classes5.dex */
public class y extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public o f9873a;

    /* renamed from: b, reason: collision with root package name */
    public q f9874b;

    /* renamed from: c, reason: collision with root package name */
    public s f9875c;

    public y(AbstractC5941t abstractC5941t) {
        int i10;
        if (abstractC5941t.size() > 3) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC5941t.size());
        }
        if (abstractC5941t.n(0) instanceof AbstractC5947z) {
            i10 = 0;
        } else {
            this.f9873a = o.c(abstractC5941t.n(0));
            i10 = 1;
        }
        while (i10 != abstractC5941t.size()) {
            AbstractC5947z k10 = AbstractC5947z.k(abstractC5941t.n(i10));
            if (k10.n() == 0) {
                this.f9874b = q.e(k10, false);
            } else {
                if (k10.n() != 1) {
                    throw new IllegalArgumentException("Bad tag number: " + k10.n());
                }
                this.f9875c = s.e(k10, false);
            }
            i10++;
        }
    }

    public static y c(Object obj) {
        if (obj instanceof y) {
            return (y) obj;
        }
        if (obj != null) {
            return new y(AbstractC5941t.k(obj));
        }
        return null;
    }

    public static y e(AbstractC5947z abstractC5947z, boolean z10) {
        return c(AbstractC5941t.l(abstractC5947z, z10));
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        o oVar = this.f9873a;
        if (oVar != null) {
            c5928f.a(oVar);
        }
        if (this.f9874b != null) {
            c5928f.a(new i0(false, 0, this.f9874b));
        }
        if (this.f9875c != null) {
            c5928f.a(new i0(false, 1, this.f9875c));
        }
        return new d0(c5928f);
    }
}
