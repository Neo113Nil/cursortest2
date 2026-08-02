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
public class h extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public BigInteger f7360a;

    /* renamed from: b, reason: collision with root package name */
    public BigInteger f7361b;

    /* renamed from: c, reason: collision with root package name */
    public BigInteger f7362c;

    /* renamed from: d, reason: collision with root package name */
    public BigInteger f7363d;

    /* renamed from: e, reason: collision with root package name */
    public BigInteger f7364e;

    /* renamed from: f, reason: collision with root package name */
    public BigInteger f7365f;

    /* renamed from: g, reason: collision with root package name */
    public BigInteger f7366g;

    /* renamed from: h, reason: collision with root package name */
    public BigInteger f7367h;

    /* renamed from: i, reason: collision with root package name */
    public BigInteger f7368i;

    /* renamed from: j, reason: collision with root package name */
    public AbstractC5941t f7369j;

    public h(AbstractC5941t abstractC5941t) {
        this.f7369j = null;
        Enumeration o10 = abstractC5941t.o();
        BigInteger n10 = ((C5933k) o10.nextElement()).n();
        if (n10.intValue() != 0 && n10.intValue() != 1) {
            throw new IllegalArgumentException("wrong version for RSA private key");
        }
        this.f7360a = n10;
        this.f7361b = ((C5933k) o10.nextElement()).n();
        this.f7362c = ((C5933k) o10.nextElement()).n();
        this.f7363d = ((C5933k) o10.nextElement()).n();
        this.f7364e = ((C5933k) o10.nextElement()).n();
        this.f7365f = ((C5933k) o10.nextElement()).n();
        this.f7366g = ((C5933k) o10.nextElement()).n();
        this.f7367h = ((C5933k) o10.nextElement()).n();
        this.f7368i = ((C5933k) o10.nextElement()).n();
        if (o10.hasMoreElements()) {
            this.f7369j = (AbstractC5941t) o10.nextElement();
        }
    }

    public static h g(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj != null) {
            return new h(AbstractC5941t.k(obj));
        }
        return null;
    }

    public BigInteger c() {
        return this.f7368i;
    }

    public BigInteger e() {
        return this.f7366g;
    }

    public BigInteger f() {
        return this.f7367h;
    }

    public BigInteger h() {
        return this.f7361b;
    }

    public BigInteger i() {
        return this.f7364e;
    }

    public BigInteger j() {
        return this.f7365f;
    }

    public BigInteger k() {
        return this.f7363d;
    }

    public BigInteger l() {
        return this.f7362c;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(new C5933k(this.f7360a));
        c5928f.a(new C5933k(h()));
        c5928f.a(new C5933k(l()));
        c5928f.a(new C5933k(k()));
        c5928f.a(new C5933k(i()));
        c5928f.a(new C5933k(j()));
        c5928f.a(new C5933k(e()));
        c5928f.a(new C5933k(f()));
        c5928f.a(new C5933k(c()));
        AbstractC5941t abstractC5941t = this.f7369j;
        if (abstractC5941t != null) {
            c5928f.a(abstractC5941t);
        }
        return new d0(c5928f);
    }
}
