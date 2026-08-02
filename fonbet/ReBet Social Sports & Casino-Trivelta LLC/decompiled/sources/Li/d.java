package Li;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5933k;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class d extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public C5933k f7213a;

    /* renamed from: b, reason: collision with root package name */
    public C5933k f7214b;

    /* renamed from: c, reason: collision with root package name */
    public C5933k f7215c;

    public d(BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        this.f7213a = new C5933k(bigInteger);
        this.f7214b = new C5933k(bigInteger2);
        if (i10 != 0) {
            this.f7215c = new C5933k(i10);
        } else {
            this.f7215c = null;
        }
    }

    public static d e(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj != null) {
            return new d(AbstractC5941t.k(obj));
        }
        return null;
    }

    public BigInteger c() {
        return this.f7214b.m();
    }

    public BigInteger f() {
        C5933k c5933k = this.f7215c;
        if (c5933k == null) {
            return null;
        }
        return c5933k.m();
    }

    public BigInteger g() {
        return this.f7213a.m();
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(this.f7213a);
        c5928f.a(this.f7214b);
        if (f() != null) {
            c5928f.a(this.f7215c);
        }
        return new d0(c5928f);
    }

    public d(AbstractC5941t abstractC5941t) {
        Enumeration o10 = abstractC5941t.o();
        this.f7213a = C5933k.k(o10.nextElement());
        this.f7214b = C5933k.k(o10.nextElement());
        if (o10.hasMoreElements()) {
            this.f7215c = (C5933k) o10.nextElement();
        } else {
            this.f7215c = null;
        }
    }
}
