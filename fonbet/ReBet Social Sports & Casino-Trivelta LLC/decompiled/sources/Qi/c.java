package Qi;

import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5931i;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class c extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public C5931i f9764a;

    /* renamed from: b, reason: collision with root package name */
    public C5931i f9765b;

    public c(AbstractC5941t abstractC5941t) {
        if (abstractC5941t.size() == 2) {
            this.f9764a = C5931i.n(abstractC5941t.n(0));
            this.f9765b = C5931i.n(abstractC5941t.n(1));
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC5941t.size());
        }
    }

    public static c c(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(AbstractC5941t.k(obj));
        }
        return null;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(this.f9764a);
        c5928f.a(this.f9765b);
        return new d0(c5928f);
    }
}
