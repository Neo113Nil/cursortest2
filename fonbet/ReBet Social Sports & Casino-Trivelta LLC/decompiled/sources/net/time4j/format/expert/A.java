package net.time4j.format.expert;

import java.util.Locale;
import java.util.Set;
import oi.InterfaceC5907c;
import oi.InterfaceC5908d;
import pi.InterfaceC6081a;

/* loaded from: classes5.dex */
public final class A implements h {

    /* renamed from: a, reason: collision with root package name */
    public final net.time4j.format.t f57852a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f57853b;

    /* renamed from: c, reason: collision with root package name */
    public final pi.e f57854c;

    /* renamed from: d, reason: collision with root package name */
    public final Locale f57855d;

    /* renamed from: e, reason: collision with root package name */
    public final net.time4j.format.v f57856e;

    /* renamed from: f, reason: collision with root package name */
    public final net.time4j.format.m f57857f;

    /* renamed from: g, reason: collision with root package name */
    public final net.time4j.format.g f57858g;

    /* renamed from: h, reason: collision with root package name */
    public final int f57859h;

    public A(net.time4j.format.t tVar, boolean z10, Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar, net.time4j.format.g gVar, int i10) {
        if (tVar == null) {
            throw new NullPointerException("Missing element.");
        }
        this.f57852a = tVar;
        this.f57853b = z10;
        this.f57854c = tVar instanceof pi.e ? (pi.e) tVar : null;
        this.f57855d = locale;
        this.f57856e = vVar;
        this.f57857f = mVar;
        this.f57858g = gVar;
        this.f57859h = i10;
    }

    public static A g(net.time4j.format.t tVar) {
        return new A(tVar, false, Locale.ROOT, net.time4j.format.v.WIDE, net.time4j.format.m.FORMAT, net.time4j.format.g.SMART, 0);
    }

    @Override // net.time4j.format.expert.h
    public int a(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d, Set set, boolean z10) {
        if (!(appendable instanceof CharSequence)) {
            return h(oVar, appendable, interfaceC5908d, z10) ? Integer.MAX_VALUE : -1;
        }
        CharSequence charSequence = (CharSequence) appendable;
        int length = charSequence.length();
        if (!h(oVar, appendable, interfaceC5908d, z10)) {
            return -1;
        }
        if (set != null) {
            set.add(new C5713g(this.f57852a, length, charSequence.length()));
        }
        return charSequence.length() - length;
    }

    @Override // net.time4j.format.expert.h
    public oi.p b() {
        return this.f57852a;
    }

    @Override // net.time4j.format.expert.h
    public void c(CharSequence charSequence, s sVar, InterfaceC5908d interfaceC5908d, t tVar, boolean z10) {
        Object l10;
        pi.e eVar;
        int f10 = sVar.f();
        int length = charSequence.length();
        int intValue = z10 ? this.f57859h : ((Integer) interfaceC5908d.b(net.time4j.format.a.f57820s, 0)).intValue();
        if (intValue > 0) {
            length -= intValue;
        }
        if (f10 >= length) {
            sVar.k(f10, "Missing chars for: " + this.f57852a.name());
            sVar.n();
            return;
        }
        if (!z10 || (eVar = this.f57854c) == null || this.f57858g == null) {
            net.time4j.format.t tVar2 = this.f57852a;
            l10 = tVar2 instanceof InterfaceC6081a ? ((InterfaceC6081a) tVar2).l(charSequence, sVar.e(), interfaceC5908d, tVar) : tVar2.a0(charSequence, sVar.e(), interfaceC5908d);
        } else {
            l10 = eVar.k(charSequence, sVar.e(), this.f57855d, this.f57856e, this.f57857f, this.f57858g);
        }
        if (!sVar.i()) {
            if (l10 == null) {
                sVar.k(f10, "No interpretable value.");
                return;
            }
            net.time4j.format.t tVar3 = this.f57852a;
            if (tVar3 == net.time4j.F.f57539q) {
                tVar.B(net.time4j.F.f57540r, ((net.time4j.B) net.time4j.B.class.cast(l10)).b());
                return;
            } else {
                tVar.C(tVar3, l10);
                return;
            }
        }
        Class type = this.f57852a.getType();
        if (type.isEnum()) {
            sVar.k(sVar.c(), "No suitable enum found: " + type.getName());
            return;
        }
        sVar.k(sVar.c(), "Unparseable element: " + this.f57852a.name());
    }

    @Override // net.time4j.format.expert.h
    public h d(C5709c c5709c, InterfaceC5908d interfaceC5908d, int i10) {
        InterfaceC5907c interfaceC5907c = net.time4j.format.a.f57807f;
        net.time4j.format.g gVar = net.time4j.format.g.SMART;
        net.time4j.format.g gVar2 = (net.time4j.format.g) interfaceC5908d.b(interfaceC5907c, gVar);
        InterfaceC5907c interfaceC5907c2 = net.time4j.format.a.f57812k;
        Boolean bool = Boolean.TRUE;
        boolean booleanValue = ((Boolean) interfaceC5908d.b(interfaceC5907c2, bool)).booleanValue();
        boolean booleanValue2 = ((Boolean) interfaceC5908d.b(net.time4j.format.a.f57810i, bool)).booleanValue();
        boolean booleanValue3 = ((Boolean) interfaceC5908d.b(net.time4j.format.a.f57811j, Boolean.FALSE)).booleanValue();
        return new A(this.f57852a, this.f57853b, (Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT), (net.time4j.format.v) interfaceC5908d.b(net.time4j.format.a.f57808g, net.time4j.format.v.WIDE), (net.time4j.format.m) interfaceC5908d.b(net.time4j.format.a.f57809h, net.time4j.format.m.FORMAT), (!(gVar2 == net.time4j.format.g.STRICT && (booleanValue || booleanValue2 || booleanValue3)) && (gVar2 != gVar || (booleanValue && booleanValue2 && !booleanValue3)) && booleanValue && booleanValue2 && booleanValue3) ? gVar2 : null, ((Integer) interfaceC5908d.b(net.time4j.format.a.f57820s, 0)).intValue());
    }

    @Override // net.time4j.format.expert.h
    public boolean e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof A) {
            A a10 = (A) obj;
            if (this.f57852a.equals(a10.f57852a) && this.f57853b == a10.f57853b) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public h f(oi.p pVar) {
        if (this.f57853b || this.f57852a == pVar) {
            return this;
        }
        if (pVar instanceof net.time4j.format.t) {
            return g((net.time4j.format.t) pVar);
        }
        throw new IllegalArgumentException("Text element required: " + pVar.getClass().getName());
    }

    public final boolean h(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d, boolean z10) {
        pi.e eVar = this.f57854c;
        if (eVar != null && z10) {
            eVar.f(oVar, appendable, this.f57855d, this.f57856e, this.f57857f);
            return true;
        }
        if (!oVar.f(this.f57852a)) {
            return false;
        }
        this.f57852a.Z(oVar, appendable, interfaceC5908d);
        return true;
    }

    public int hashCode() {
        return this.f57852a.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(A.class.getName());
        sb2.append("[element=");
        sb2.append(this.f57852a.name());
        sb2.append(",protected-mode=");
        sb2.append(this.f57853b);
        sb2.append(']');
        return sb2.toString();
    }
}
