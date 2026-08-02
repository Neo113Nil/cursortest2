package Li;

import java.util.Enumeration;
import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5937o;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class e extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public Qi.a f7216a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC5937o f7217b;

    public e(AbstractC5941t abstractC5941t) {
        Enumeration o10 = abstractC5941t.o();
        this.f7216a = Qi.a.e(o10.nextElement());
        this.f7217b = AbstractC5937o.k(o10.nextElement());
    }

    public static e c(Object obj) {
        if (obj instanceof e) {
            return (e) obj;
        }
        if (obj != null) {
            return new e(AbstractC5941t.k(obj));
        }
        return null;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(this.f7216a);
        c5928f.a(this.f7217b);
        return new d0(c5928f);
    }
}
