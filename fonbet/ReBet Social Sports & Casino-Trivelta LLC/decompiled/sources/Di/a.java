package Di;

import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.AbstractC5947z;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.asn1.G;
import org.spongycastle.asn1.InterfaceC5927e;
import org.spongycastle.asn1.K;

/* loaded from: classes5.dex */
public class a extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public C5936n f2806a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC5927e f2807b;

    public a(AbstractC5941t abstractC5941t) {
        if (abstractC5941t.size() < 1 || abstractC5941t.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC5941t.size());
        }
        this.f2806a = (C5936n) abstractC5941t.n(0);
        if (abstractC5941t.size() > 1) {
            AbstractC5947z abstractC5947z = (AbstractC5947z) abstractC5941t.n(1);
            if (!abstractC5947z.o() || abstractC5947z.n() != 0) {
                throw new IllegalArgumentException("Bad tag for 'content'");
            }
            this.f2807b = abstractC5947z.m();
        }
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

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(this.f2806a);
        InterfaceC5927e interfaceC5927e = this.f2807b;
        if (interfaceC5927e != null) {
            c5928f.a(new K(0, interfaceC5927e));
        }
        return new G(c5928f);
    }
}
