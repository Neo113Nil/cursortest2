package net.time4j.format.expert;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import net.time4j.c0;
import oi.InterfaceC5908d;

/* renamed from: net.time4j.format.expert.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5712f implements h {

    /* renamed from: h, reason: collision with root package name */
    public static final oi.t f57949h = new a();

    /* renamed from: a, reason: collision with root package name */
    public final oi.p f57950a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5711e f57951b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC5710d f57952c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f57953d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f57954e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f57955f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f57956g;

    /* renamed from: net.time4j.format.expert.f$a */
    public static class a implements oi.t {
        @Override // oi.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void apply(oi.o oVar) {
            return null;
        }
    }

    public C5712f(oi.p pVar, InterfaceC5711e interfaceC5711e, InterfaceC5710d interfaceC5710d) {
        this(pVar, interfaceC5711e, interfaceC5710d, false, false, false);
    }

    public static Map g(Map map, C5709c c5709c) {
        oi.x q10 = c5709c.q();
        HashMap hashMap = new HashMap();
        for (oi.p pVar : map.keySet()) {
            if (q10.y(pVar)) {
                hashMap.put(pVar, map.get(pVar));
            }
        }
        return hashMap;
    }

    public static Set i(C5709c c5709c, Object obj, StringBuilder sb2, InterfaceC5908d interfaceC5908d) {
        return c5709c.J(c5709c.q().r().cast(obj), sb2, interfaceC5908d);
    }

    @Override // net.time4j.format.expert.h
    public int a(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d, Set set, boolean z10) {
        if (z10 && this.f57954e) {
            interfaceC5908d = ((C5709c) C5709c.class.cast(this.f57951b)).o();
        }
        if (this.f57953d && (oVar instanceof c0) && set == null) {
            ((C5709c) this.f57951b).K(oVar, appendable, interfaceC5908d, false);
            return Integer.MAX_VALUE;
        }
        Object j10 = oVar.j(this.f57950a);
        StringBuilder sb2 = new StringBuilder();
        if (!(appendable instanceof CharSequence) || set == null) {
            this.f57951b.a(j10, sb2, interfaceC5908d, f57949h);
        } else {
            int length = ((CharSequence) appendable).length();
            InterfaceC5711e interfaceC5711e = this.f57951b;
            if (interfaceC5711e instanceof C5709c) {
                Set<C5713g> i10 = i((C5709c) C5709c.class.cast(interfaceC5711e), j10, sb2, interfaceC5908d);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (C5713g c5713g : i10) {
                    linkedHashSet.add(new C5713g(c5713g.a(), c5713g.c() + length, c5713g.b() + length));
                }
                set.addAll(linkedHashSet);
            } else {
                interfaceC5711e.a(j10, sb2, interfaceC5908d, f57949h);
            }
            set.add(new C5713g(this.f57950a, length, sb2.length() + length));
        }
        appendable.append(sb2);
        return sb2.length();
    }

    @Override // net.time4j.format.expert.h
    public oi.p b() {
        return this.f57950a;
    }

    @Override // net.time4j.format.expert.h
    public void c(CharSequence charSequence, s sVar, InterfaceC5908d interfaceC5908d, t tVar, boolean z10) {
        int f10 = sVar.f();
        if (z10) {
            try {
                if (this.f57955f) {
                    interfaceC5908d = ((C5709c) C5709c.class.cast(this.f57952c)).o();
                }
            } catch (IndexOutOfBoundsException e10) {
                sVar.k(f10, e10.getMessage());
                return;
            }
        }
        Object b10 = this.f57952c.b(charSequence, sVar, interfaceC5908d);
        if (b10 == null) {
            sVar.k(f10, sVar.d());
            return;
        }
        if (this.f57956g && (tVar instanceof u)) {
            tVar.D(b10);
            return;
        }
        oi.q g10 = sVar.g();
        for (oi.p pVar : g10.u()) {
            if (pVar.getType() == Integer.class) {
                tVar.B(pVar, g10.e(pVar));
            } else {
                tVar.C(pVar, g10.j(pVar));
            }
        }
        tVar.C(this.f57950a, b10);
    }

    @Override // net.time4j.format.expert.h
    public h d(C5709c c5709c, InterfaceC5908d interfaceC5908d, int i10) {
        boolean z10;
        boolean z11;
        boolean z12 = c5709c.z() && this.f57950a.getType().equals(c5709c.q().r());
        if (!(interfaceC5908d instanceof C5708b)) {
            return (this.f57954e || this.f57955f) ? new C5712f(this.f57950a, this.f57951b, this.f57952c) : this;
        }
        InterfaceC5711e interfaceC5711e = this.f57951b;
        InterfaceC5710d interfaceC5710d = this.f57952c;
        Map r10 = c5709c.r();
        C5708b c5708b = (C5708b) interfaceC5908d;
        InterfaceC5711e interfaceC5711e2 = this.f57951b;
        if (interfaceC5711e2 instanceof C5709c) {
            C5709c c5709c2 = (C5709c) C5709c.class.cast(interfaceC5711e2);
            interfaceC5711e = c5709c2.R(g(r10, c5709c2), c5708b);
            z10 = true;
        } else {
            z10 = false;
        }
        InterfaceC5711e interfaceC5711e3 = interfaceC5711e;
        InterfaceC5710d interfaceC5710d2 = this.f57952c;
        if (interfaceC5710d2 instanceof C5709c) {
            C5709c c5709c3 = (C5709c) C5709c.class.cast(interfaceC5710d2);
            interfaceC5710d = c5709c3.R(g(r10, c5709c3), c5708b);
            z11 = true;
        } else {
            z11 = false;
        }
        return new C5712f(this.f57950a, interfaceC5711e3, interfaceC5710d, z10, z11, z12);
    }

    @Override // net.time4j.format.expert.h
    public boolean e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5712f) {
            C5712f c5712f = (C5712f) obj;
            if (this.f57950a.equals(c5712f.f57950a) && this.f57951b.equals(c5712f.f57951b) && this.f57952c.equals(c5712f.f57952c)) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public h f(oi.p pVar) {
        return this.f57950a == pVar ? this : new C5712f(pVar, this.f57951b, this.f57952c);
    }

    public boolean h() {
        return this.f57956g;
    }

    public int hashCode() {
        return (this.f57950a.hashCode() * 7) + (this.f57951b.hashCode() * 31) + (this.f57952c.hashCode() * 37);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(C5712f.class.getName());
        sb2.append("[element=");
        sb2.append(this.f57950a.name());
        sb2.append(", printer=");
        sb2.append(this.f57951b);
        sb2.append(", parser=");
        sb2.append(this.f57952c);
        sb2.append(']');
        return sb2.toString();
    }

    public C5712f(oi.p pVar, InterfaceC5711e interfaceC5711e, InterfaceC5710d interfaceC5710d, boolean z10, boolean z11, boolean z12) {
        if (pVar == null) {
            throw new NullPointerException("Missing element.");
        }
        if (interfaceC5711e == null) {
            throw new NullPointerException("Missing printer.");
        }
        if (interfaceC5710d == null) {
            throw new NullPointerException("Missing parser.");
        }
        this.f57950a = pVar;
        this.f57951b = interfaceC5711e;
        this.f57952c = interfaceC5710d;
        this.f57953d = (interfaceC5711e instanceof C5709c) && pVar.getType() == net.time4j.A.class;
        this.f57954e = z10;
        this.f57955f = z11;
        this.f57956g = z12;
    }
}
