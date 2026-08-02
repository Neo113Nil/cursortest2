package Ri;

import java.math.BigInteger;
import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5937o;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5933k;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.asn1.P;
import org.spongycastle.asn1.d0;
import org.spongycastle.math.ec.d;

/* loaded from: classes5.dex */
public class g extends AbstractC5935m implements n {

    /* renamed from: a, reason: collision with root package name */
    public org.spongycastle.math.ec.d f10425a;

    /* renamed from: b, reason: collision with root package name */
    public C5936n f10426b;
    private byte[] seed;

    public g(org.spongycastle.math.ec.d dVar, byte[] bArr) {
        this.f10426b = null;
        this.f10425a = dVar;
        this.seed = bArr;
        f();
    }

    public org.spongycastle.math.ec.d c() {
        return this.f10425a;
    }

    public byte[] e() {
        return this.seed;
    }

    public final void f() {
        if (org.spongycastle.math.ec.b.k(this.f10425a)) {
            this.f10426b = n.f10491s3;
        } else {
            if (!org.spongycastle.math.ec.b.i(this.f10425a)) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            this.f10426b = n.f10493t3;
        }
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        if (this.f10426b.equals(n.f10491s3)) {
            c5928f.a(new k(this.f10425a.n()).toASN1Primitive());
            c5928f.a(new k(this.f10425a.o()).toASN1Primitive());
        } else if (this.f10426b.equals(n.f10493t3)) {
            c5928f.a(new k(this.f10425a.n()).toASN1Primitive());
            c5928f.a(new k(this.f10425a.o()).toASN1Primitive());
        }
        if (this.seed != null) {
            c5928f.a(new P(this.seed));
        }
        return new d0(c5928f);
    }

    public g(l lVar, AbstractC5941t abstractC5941t) {
        int intValue;
        int i10;
        int i11;
        this.f10426b = null;
        C5936n c10 = lVar.c();
        this.f10426b = c10;
        if (c10.equals(n.f10491s3)) {
            BigInteger n10 = ((C5933k) lVar.f()).n();
            this.f10425a = new d.e(n10, new k(n10, (AbstractC5937o) abstractC5941t.n(0)).c().t(), new k(n10, (AbstractC5937o) abstractC5941t.n(1)).c().t());
        } else if (this.f10426b.equals(n.f10493t3)) {
            AbstractC5941t k10 = AbstractC5941t.k(lVar.f());
            int intValue2 = ((C5933k) k10.n(0)).n().intValue();
            C5936n c5936n = (C5936n) k10.n(1);
            if (c5936n.equals(n.f10497v3)) {
                i10 = C5933k.k(k10.n(2)).n().intValue();
                i11 = 0;
                intValue = 0;
            } else if (c5936n.equals(n.f10499w3)) {
                AbstractC5941t k11 = AbstractC5941t.k(k10.n(2));
                int intValue3 = C5933k.k(k11.n(0)).n().intValue();
                int intValue4 = C5933k.k(k11.n(1)).n().intValue();
                intValue = C5933k.k(k11.n(2)).n().intValue();
                i10 = intValue3;
                i11 = intValue4;
            } else {
                throw new IllegalArgumentException("This type of EC basis is not implemented");
            }
            this.f10425a = new d.C0867d(intValue2, i10, i11, intValue, new k(intValue2, i10, i11, intValue, (AbstractC5937o) abstractC5941t.n(0)).c().t(), new k(intValue2, i10, i11, intValue, (AbstractC5937o) abstractC5941t.n(1)).c().t());
        } else {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        }
        if (abstractC5941t.size() == 3) {
            this.seed = ((P) abstractC5941t.n(2)).m();
        }
    }
}
