package net.time4j.format.expert;

import java.util.Locale;
import java.util.Set;
import net.time4j.H;
import oi.InterfaceC5907c;
import oi.InterfaceC5908d;

/* loaded from: classes5.dex */
public final class z implements h {

    /* renamed from: a, reason: collision with root package name */
    public final C5709c f58074a;

    /* renamed from: b, reason: collision with root package name */
    public final oi.y f58075b;

    /* renamed from: c, reason: collision with root package name */
    public final oi.y f58076c;

    public z(oi.y yVar, oi.y yVar2) {
        this(null, yVar, yVar2);
    }

    public static C5709c g(oi.x xVar, oi.y yVar, oi.y yVar2, Locale locale, boolean z10, net.time4j.tz.l lVar) {
        String n10;
        if (xVar.equals(net.time4j.F.l0())) {
            n10 = net.time4j.format.b.r((net.time4j.format.e) yVar, locale);
        } else if (xVar.equals(net.time4j.G.c0())) {
            n10 = net.time4j.format.b.t((net.time4j.format.e) yVar2, locale);
        } else if (xVar.equals(H.M())) {
            n10 = net.time4j.format.b.u((net.time4j.format.e) yVar, (net.time4j.format.e) yVar2, locale);
        } else if (xVar.equals(net.time4j.A.N())) {
            n10 = net.time4j.format.b.s((net.time4j.format.e) yVar, (net.time4j.format.e) yVar2, locale);
        } else {
            if (!net.time4j.format.h.class.isAssignableFrom(xVar.r())) {
                throw new UnsupportedOperationException("Localized format patterns not available: " + xVar);
            }
            n10 = xVar.n(yVar, locale);
        }
        if (z10 && n10.contains("yy") && !n10.contains("yyy")) {
            n10 = n10.replace("yy", "yyyy");
        }
        C5709c C10 = C5709c.C(n10, w.CLDR, locale, xVar);
        return lVar != null ? C10.T(lVar) : C10;
    }

    @Override // net.time4j.format.expert.h
    public int a(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d, Set set, boolean z10) {
        Set K10 = this.f58074a.K(oVar, appendable, interfaceC5908d, set != null);
        if (set == null) {
            return Integer.MAX_VALUE;
        }
        set.addAll(K10);
        return Integer.MAX_VALUE;
    }

    @Override // net.time4j.format.expert.h
    public oi.p b() {
        return null;
    }

    @Override // net.time4j.format.expert.h
    public void c(CharSequence charSequence, s sVar, InterfaceC5908d interfaceC5908d, t tVar, boolean z10) {
        C5709c g10;
        if (z10) {
            g10 = this.f58074a;
        } else {
            InterfaceC5908d o10 = this.f58074a.o();
            InterfaceC5907c interfaceC5907c = net.time4j.format.a.f57806e;
            net.time4j.tz.o oVar = (net.time4j.tz.o) interfaceC5908d.b(interfaceC5907c, o10.b(interfaceC5907c, net.time4j.tz.l.f58348d));
            InterfaceC5907c interfaceC5907c2 = net.time4j.format.a.f57805d;
            net.time4j.tz.k kVar = (net.time4j.tz.k) interfaceC5908d.b(interfaceC5907c2, o10.b(interfaceC5907c2, null));
            g10 = g(this.f58074a.q(), this.f58075b, this.f58076c, (Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, this.f58074a.u()), ((Boolean) interfaceC5908d.b(net.time4j.format.a.f57823v, Boolean.FALSE)).booleanValue(), kVar != null ? net.time4j.tz.l.N(kVar).Q(oVar) : null);
        }
        Object b10 = g10.b(charSequence, sVar, interfaceC5908d);
        if (sVar.i() || b10 == null) {
            return;
        }
        tVar.D(b10);
    }

    @Override // net.time4j.format.expert.h
    public h d(C5709c c5709c, InterfaceC5908d interfaceC5908d, int i10) {
        net.time4j.tz.o oVar = (net.time4j.tz.o) interfaceC5908d.b(net.time4j.format.a.f57806e, net.time4j.tz.l.f58348d);
        net.time4j.tz.k kVar = (net.time4j.tz.k) interfaceC5908d.b(net.time4j.format.a.f57805d, null);
        return new z(g(c5709c.q(), this.f58075b, this.f58076c, (Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT), ((Boolean) interfaceC5908d.b(net.time4j.format.a.f57823v, Boolean.FALSE)).booleanValue(), kVar != null ? net.time4j.tz.l.N(kVar).Q(oVar) : null), this.f58075b, this.f58076c);
    }

    @Override // net.time4j.format.expert.h
    public boolean e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f58075b.equals(zVar.f58075b) && this.f58076c.equals(zVar.f58076c)) {
                C5709c c5709c = this.f58074a;
                return c5709c == null ? zVar.f58074a == null : c5709c.equals(zVar.f58074a);
            }
        }
        return false;
    }

    public int hashCode() {
        C5709c c5709c = this.f58074a;
        if (c5709c == null) {
            return 0;
        }
        return c5709c.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(z.class.getName());
        sb2.append("[date-style=");
        sb2.append(this.f58075b);
        sb2.append(",time-style=");
        sb2.append(this.f58076c);
        sb2.append(",delegate=");
        sb2.append(this.f58074a);
        sb2.append(']');
        return sb2.toString();
    }

    public z(C5709c c5709c, oi.y yVar, oi.y yVar2) {
        if (yVar == null || yVar2 == null) {
            throw new NullPointerException("Missing display style.");
        }
        this.f58075b = yVar;
        this.f58076c = yVar2;
        this.f58074a = c5709c;
    }

    @Override // net.time4j.format.expert.h
    public h f(oi.p pVar) {
        return this;
    }
}
