package Qi;

import java.io.IOException;
import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5937o;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.C5925c;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.asn1.InterfaceC5927e;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class k extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public C5936n f9824a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9825b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC5937o f9826c;

    /* renamed from: d, reason: collision with root package name */
    public static final C5936n f9801d = new C5936n("2.5.29.9").r();

    /* renamed from: e, reason: collision with root package name */
    public static final C5936n f9802e = new C5936n("2.5.29.14").r();

    /* renamed from: f, reason: collision with root package name */
    public static final C5936n f9803f = new C5936n("2.5.29.15").r();

    /* renamed from: g, reason: collision with root package name */
    public static final C5936n f9804g = new C5936n("2.5.29.16").r();

    /* renamed from: h, reason: collision with root package name */
    public static final C5936n f9805h = new C5936n("2.5.29.17").r();

    /* renamed from: i, reason: collision with root package name */
    public static final C5936n f9806i = new C5936n("2.5.29.18").r();

    /* renamed from: j, reason: collision with root package name */
    public static final C5936n f9807j = new C5936n("2.5.29.19").r();

    /* renamed from: k, reason: collision with root package name */
    public static final C5936n f9808k = new C5936n("2.5.29.20").r();

    /* renamed from: l, reason: collision with root package name */
    public static final C5936n f9809l = new C5936n("2.5.29.21").r();

    /* renamed from: m, reason: collision with root package name */
    public static final C5936n f9810m = new C5936n("2.5.29.23").r();

    /* renamed from: n, reason: collision with root package name */
    public static final C5936n f9811n = new C5936n("2.5.29.24").r();

    /* renamed from: o, reason: collision with root package name */
    public static final C5936n f9812o = new C5936n("2.5.29.27").r();

    /* renamed from: p, reason: collision with root package name */
    public static final C5936n f9813p = new C5936n("2.5.29.28").r();

    /* renamed from: q, reason: collision with root package name */
    public static final C5936n f9814q = new C5936n("2.5.29.29").r();

    /* renamed from: r, reason: collision with root package name */
    public static final C5936n f9815r = new C5936n("2.5.29.30").r();

    /* renamed from: s, reason: collision with root package name */
    public static final C5936n f9816s = new C5936n("2.5.29.31").r();

    /* renamed from: t, reason: collision with root package name */
    public static final C5936n f9817t = new C5936n("2.5.29.32").r();

    /* renamed from: u, reason: collision with root package name */
    public static final C5936n f9818u = new C5936n("2.5.29.33").r();

    /* renamed from: v, reason: collision with root package name */
    public static final C5936n f9819v = new C5936n("2.5.29.35").r();

    /* renamed from: w, reason: collision with root package name */
    public static final C5936n f9820w = new C5936n("2.5.29.36").r();

    /* renamed from: x, reason: collision with root package name */
    public static final C5936n f9821x = new C5936n("2.5.29.37").r();

    /* renamed from: y, reason: collision with root package name */
    public static final C5936n f9822y = new C5936n("2.5.29.46").r();

    /* renamed from: z, reason: collision with root package name */
    public static final C5936n f9823z = new C5936n("2.5.29.54").r();

    /* renamed from: A, reason: collision with root package name */
    public static final C5936n f9792A = new C5936n("1.3.6.1.5.5.7.1.1").r();

    /* renamed from: B, reason: collision with root package name */
    public static final C5936n f9793B = new C5936n("1.3.6.1.5.5.7.1.11").r();

    /* renamed from: C, reason: collision with root package name */
    public static final C5936n f9794C = new C5936n("1.3.6.1.5.5.7.1.12").r();

    /* renamed from: D, reason: collision with root package name */
    public static final C5936n f9795D = new C5936n("1.3.6.1.5.5.7.1.2").r();

    /* renamed from: E, reason: collision with root package name */
    public static final C5936n f9796E = new C5936n("1.3.6.1.5.5.7.1.3").r();

    /* renamed from: F, reason: collision with root package name */
    public static final C5936n f9797F = new C5936n("1.3.6.1.5.5.7.1.4").r();

    /* renamed from: G, reason: collision with root package name */
    public static final C5936n f9798G = new C5936n("2.5.29.56").r();

    /* renamed from: H, reason: collision with root package name */
    public static final C5936n f9799H = new C5936n("2.5.29.55").r();

    /* renamed from: I, reason: collision with root package name */
    public static final C5936n f9800I = new C5936n("2.5.29.60").r();

    public k(AbstractC5941t abstractC5941t) {
        if (abstractC5941t.size() == 2) {
            this.f9824a = C5936n.p(abstractC5941t.n(0));
            this.f9825b = false;
            this.f9826c = AbstractC5937o.k(abstractC5941t.n(1));
        } else if (abstractC5941t.size() == 3) {
            this.f9824a = C5936n.p(abstractC5941t.n(0));
            this.f9825b = C5925c.l(abstractC5941t.n(1)).o();
            this.f9826c = AbstractC5937o.k(abstractC5941t.n(2));
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC5941t.size());
        }
    }

    public static AbstractC5940s c(k kVar) {
        try {
            return AbstractC5940s.g(kVar.f().m());
        } catch (IOException e10) {
            throw new IllegalArgumentException("can't convert extension: " + e10);
        }
    }

    public static k g(Object obj) {
        if (obj instanceof k) {
            return (k) obj;
        }
        if (obj != null) {
            return new k(AbstractC5941t.k(obj));
        }
        return null;
    }

    public C5936n e() {
        return this.f9824a;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m
    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.e().equals(e()) && kVar.f().equals(f()) && kVar.i() == i();
    }

    public AbstractC5937o f() {
        return this.f9826c;
    }

    public InterfaceC5927e h() {
        return c(this);
    }

    @Override // org.spongycastle.asn1.AbstractC5935m
    public int hashCode() {
        return i() ? f().hashCode() ^ e().hashCode() : ~(f().hashCode() ^ e().hashCode());
    }

    public boolean i() {
        return this.f9825b;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(this.f9824a);
        if (this.f9825b) {
            c5928f.a(C5925c.n(true));
        }
        c5928f.a(this.f9826c);
        return new d0(c5928f);
    }
}
