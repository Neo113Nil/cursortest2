package Li;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5937o;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.AbstractC5943v;
import org.spongycastle.asn1.AbstractC5947z;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5933k;
import org.spongycastle.asn1.InterfaceC5927e;
import org.spongycastle.asn1.Z;
import org.spongycastle.asn1.d0;
import org.spongycastle.asn1.i0;

/* loaded from: classes5.dex */
public class g extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC5937o f7357a;

    /* renamed from: b, reason: collision with root package name */
    public Qi.a f7358b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC5943v f7359c;

    public g(Qi.a aVar, InterfaceC5927e interfaceC5927e) {
        this(aVar, interfaceC5927e, null);
    }

    public static g e(Object obj) {
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj != null) {
            return new g(AbstractC5941t.k(obj));
        }
        return null;
    }

    public Qi.a c() {
        return this.f7358b;
    }

    public Qi.a f() {
        return this.f7358b;
    }

    public InterfaceC5927e g() {
        return AbstractC5940s.g(this.f7357a.m());
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(new C5933k(0L));
        c5928f.a(this.f7358b);
        c5928f.a(this.f7357a);
        if (this.f7359c != null) {
            c5928f.a(new i0(false, 0, this.f7359c));
        }
        return new d0(c5928f);
    }

    public g(Qi.a aVar, InterfaceC5927e interfaceC5927e, AbstractC5943v abstractC5943v) {
        this.f7357a = new Z(interfaceC5927e.toASN1Primitive().b(ASN1Encoding.DER));
        this.f7358b = aVar;
        this.f7359c = abstractC5943v;
    }

    public g(AbstractC5941t abstractC5941t) {
        Enumeration o10 = abstractC5941t.o();
        if (((C5933k) o10.nextElement()).n().intValue() == 0) {
            this.f7358b = Qi.a.e(o10.nextElement());
            this.f7357a = AbstractC5937o.k(o10.nextElement());
            if (o10.hasMoreElements()) {
                this.f7359c = AbstractC5943v.m((AbstractC5947z) o10.nextElement(), false);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("wrong version for private key info");
    }
}
