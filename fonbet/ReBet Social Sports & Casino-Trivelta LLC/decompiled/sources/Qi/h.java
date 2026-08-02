package Qi;

import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.P;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class h extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public v f9782a;

    /* renamed from: b, reason: collision with root package name */
    public a f9783b;

    /* renamed from: c, reason: collision with root package name */
    public P f9784c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9785d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f9786e;

    public h(AbstractC5941t abstractC5941t) {
        if (abstractC5941t.size() != 3) {
            throw new IllegalArgumentException("sequence wrong size for CertificateList");
        }
        this.f9782a = v.e(abstractC5941t.n(0));
        this.f9783b = a.e(abstractC5941t.n(1));
        this.f9784c = P.q(abstractC5941t.n(2));
    }

    public static h c(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj != null) {
            return new h(AbstractC5941t.k(obj));
        }
        return null;
    }

    public Oi.c e() {
        return this.f9782a.f();
    }

    public v f() {
        return this.f9782a;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m
    public int hashCode() {
        if (!this.f9785d) {
            this.f9786e = super.hashCode();
            this.f9785d = true;
        }
        return this.f9786e;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(this.f9782a);
        c5928f.a(this.f9783b);
        c5928f.a(this.f9784c);
        return new d0(c5928f);
    }
}
