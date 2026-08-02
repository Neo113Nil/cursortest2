package Qi;

import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.asn1.InterfaceC5927e;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class a extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public C5936n f9760a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC5927e f9761b;

    public a(C5936n c5936n) {
        this.f9760a = c5936n;
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

    public C5936n c() {
        return this.f9760a;
    }

    public InterfaceC5927e f() {
        return this.f9761b;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(this.f9760a);
        InterfaceC5927e interfaceC5927e = this.f9761b;
        if (interfaceC5927e != null) {
            c5928f.a(interfaceC5927e);
        }
        return new d0(c5928f);
    }

    public a(C5936n c5936n, InterfaceC5927e interfaceC5927e) {
        this.f9760a = c5936n;
        this.f9761b = interfaceC5927e;
    }

    public a(AbstractC5941t abstractC5941t) {
        if (abstractC5941t.size() >= 1 && abstractC5941t.size() <= 2) {
            this.f9760a = C5936n.p(abstractC5941t.n(0));
            if (abstractC5941t.size() == 2) {
                this.f9761b = abstractC5941t.n(1);
                return;
            } else {
                this.f9761b = null;
                return;
            }
        }
        throw new IllegalArgumentException("Bad sequence size: " + abstractC5941t.size());
    }
}
