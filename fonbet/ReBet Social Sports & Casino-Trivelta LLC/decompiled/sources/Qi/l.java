package Qi;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class l extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public Hashtable f9827a = new Hashtable();

    /* renamed from: b, reason: collision with root package name */
    public Vector f9828b = new Vector();

    public l(AbstractC5941t abstractC5941t) {
        Enumeration o10 = abstractC5941t.o();
        while (o10.hasMoreElements()) {
            k g10 = k.g(o10.nextElement());
            this.f9827a.put(g10.e(), g10);
            this.f9828b.addElement(g10.e());
        }
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

    public k c(C5936n c5936n) {
        return (k) this.f9827a.get(c5936n);
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        Enumeration elements = this.f9828b.elements();
        while (elements.hasMoreElements()) {
            c5928f.a((k) this.f9827a.get((C5936n) elements.nextElement()));
        }
        return new d0(c5928f);
    }

    public l(k[] kVarArr) {
        for (int i10 = 0; i10 != kVarArr.length; i10++) {
            k kVar = kVarArr[i10];
            this.f9828b.addElement(kVar.e());
            this.f9827a.put(kVar.e(), kVar);
        }
    }
}
