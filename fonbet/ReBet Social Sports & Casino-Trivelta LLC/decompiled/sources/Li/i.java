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
public class i extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public BigInteger f7370a;

    /* renamed from: b, reason: collision with root package name */
    public BigInteger f7371b;

    public i(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f7370a = bigInteger;
        this.f7371b = bigInteger2;
    }

    public static i c(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj != null) {
            return new i(AbstractC5941t.k(obj));
        }
        return null;
    }

    public BigInteger e() {
        return this.f7370a;
    }

    public BigInteger f() {
        return this.f7371b;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(new C5933k(e()));
        c5928f.a(new C5933k(f()));
        return new d0(c5928f);
    }

    public i(AbstractC5941t abstractC5941t) {
        if (abstractC5941t.size() == 2) {
            Enumeration o10 = abstractC5941t.o();
            this.f7370a = C5933k.k(o10.nextElement()).m();
            this.f7371b = C5933k.k(o10.nextElement()).m();
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC5941t.size());
        }
    }
}
