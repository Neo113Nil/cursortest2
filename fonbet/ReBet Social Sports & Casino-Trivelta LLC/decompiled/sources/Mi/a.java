package Mi;

import java.util.Enumeration;
import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.AbstractC5947z;
import org.spongycastle.asn1.InterfaceC5927e;
import org.spongycastle.asn1.P;

/* loaded from: classes5.dex */
public class a extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC5941t f7668a;

    public a(AbstractC5941t abstractC5941t) {
        this.f7668a = abstractC5941t;
    }

    public static a c(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(AbstractC5941t.k(obj));
        }
        return null;
    }

    public final AbstractC5940s e(int i10) {
        Enumeration o10 = this.f7668a.o();
        while (o10.hasMoreElements()) {
            InterfaceC5927e interfaceC5927e = (InterfaceC5927e) o10.nextElement();
            if (interfaceC5927e instanceof AbstractC5947z) {
                AbstractC5947z abstractC5947z = (AbstractC5947z) interfaceC5927e;
                if (abstractC5947z.n() == i10) {
                    return abstractC5947z.m().toASN1Primitive();
                }
            }
        }
        return null;
    }

    public AbstractC5940s f() {
        return e(0);
    }

    public P g() {
        return (P) e(1);
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        return this.f7668a;
    }
}
