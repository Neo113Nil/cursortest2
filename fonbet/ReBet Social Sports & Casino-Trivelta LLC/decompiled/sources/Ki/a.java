package Ki;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5933k;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class a extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public C5933k f6648a;

    /* renamed from: b, reason: collision with root package name */
    public C5933k f6649b;

    public a(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f6648a = new C5933k(bigInteger);
        this.f6649b = new C5933k(bigInteger2);
    }

    public static a e(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(AbstractC5941t.k(obj));
        }
        return null;
    }

    public BigInteger c() {
        return this.f6649b.m();
    }

    public BigInteger f() {
        return this.f6648a.m();
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(this.f6648a);
        c5928f.a(this.f6649b);
        return new d0(c5928f);
    }

    public a(AbstractC5941t abstractC5941t) {
        Enumeration o10 = abstractC5941t.o();
        this.f6648a = (C5933k) o10.nextElement();
        this.f6649b = (C5933k) o10.nextElement();
    }
}
