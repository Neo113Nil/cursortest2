package Ri;

import java.math.BigInteger;
import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5933k;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class l extends AbstractC5935m implements n {

    /* renamed from: a, reason: collision with root package name */
    public C5936n f10438a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC5940s f10439b;

    public l(BigInteger bigInteger) {
        this.f10438a = n.f10491s3;
        this.f10439b = new C5933k(bigInteger);
    }

    public static l e(Object obj) {
        if (obj instanceof l) {
            return (l) obj;
        }
        if (obj != null) {
            return new l(AbstractC5941t.k(obj));
        }
        return null;
    }

    public C5936n c() {
        return this.f10438a;
    }

    public AbstractC5940s f() {
        return this.f10439b;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(this.f10438a);
        c5928f.a(this.f10439b);
        return new d0(c5928f);
    }

    public l(int i10, int i11) {
        this(i10, i11, 0, 0);
    }

    public l(int i10, int i11, int i12, int i13) {
        this.f10438a = n.f10493t3;
        C5928f c5928f = new C5928f();
        c5928f.a(new C5933k(i10));
        if (i12 == 0) {
            if (i13 == 0) {
                c5928f.a(n.f10497v3);
                c5928f.a(new C5933k(i11));
            } else {
                throw new IllegalArgumentException("inconsistent k values");
            }
        } else if (i12 > i11 && i13 > i12) {
            c5928f.a(n.f10499w3);
            C5928f c5928f2 = new C5928f();
            c5928f2.a(new C5933k(i11));
            c5928f2.a(new C5933k(i12));
            c5928f2.a(new C5933k(i13));
            c5928f.a(new d0(c5928f2));
        } else {
            throw new IllegalArgumentException("inconsistent k values");
        }
        this.f10439b = new d0(c5928f);
    }

    public l(AbstractC5941t abstractC5941t) {
        this.f10438a = C5936n.p(abstractC5941t.n(0));
        this.f10439b = abstractC5941t.n(1).toASN1Primitive();
    }
}
