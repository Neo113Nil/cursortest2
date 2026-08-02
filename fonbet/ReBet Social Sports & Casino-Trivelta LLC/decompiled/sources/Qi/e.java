package Qi;

import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.P;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class e extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public f f9766a;

    /* renamed from: b, reason: collision with root package name */
    public a f9767b;

    /* renamed from: c, reason: collision with root package name */
    public P f9768c;

    public e(AbstractC5941t abstractC5941t) {
        if (abstractC5941t.size() == 3) {
            this.f9766a = f.e(abstractC5941t.n(0));
            this.f9767b = a.e(abstractC5941t.n(1));
            this.f9768c = P.q(abstractC5941t.n(2));
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC5941t.size());
        }
    }

    public static e e(Object obj) {
        if (obj instanceof e) {
            return (e) obj;
        }
        if (obj != null) {
            return new e(AbstractC5941t.k(obj));
        }
        return null;
    }

    public f c() {
        return this.f9766a;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(this.f9766a);
        c5928f.a(this.f9767b);
        c5928f.a(this.f9768c);
        return new d0(c5928f);
    }
}
