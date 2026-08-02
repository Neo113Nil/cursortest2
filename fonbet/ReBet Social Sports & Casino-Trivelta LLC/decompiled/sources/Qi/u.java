package Qi;

import java.util.Enumeration;
import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5932j;
import org.spongycastle.asn1.InterfaceC5927e;
import org.spongycastle.asn1.P;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class u extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public a f9851a;

    /* renamed from: b, reason: collision with root package name */
    public P f9852b;

    public u(a aVar, InterfaceC5927e interfaceC5927e) {
        this.f9852b = new P(interfaceC5927e);
        this.f9851a = aVar;
    }

    public static u f(Object obj) {
        if (obj instanceof u) {
            return (u) obj;
        }
        if (obj != null) {
            return new u(AbstractC5941t.k(obj));
        }
        return null;
    }

    public a c() {
        return this.f9851a;
    }

    public a e() {
        return this.f9851a;
    }

    public AbstractC5940s g() {
        return new C5932j(this.f9852b.n()).D0();
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(this.f9851a);
        c5928f.a(this.f9852b);
        return new d0(c5928f);
    }

    public u(a aVar, byte[] bArr) {
        this.f9852b = new P(bArr);
        this.f9851a = aVar;
    }

    public u(AbstractC5941t abstractC5941t) {
        if (abstractC5941t.size() == 2) {
            Enumeration o10 = abstractC5941t.o();
            this.f9851a = a.e(o10.nextElement());
            this.f9852b = P.q(o10.nextElement());
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC5941t.size());
        }
    }
}
