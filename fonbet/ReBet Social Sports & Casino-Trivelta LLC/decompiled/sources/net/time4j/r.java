package net.time4j;

import oi.AbstractC5916l;
import oi.AbstractC5917m;
import oi.C5912h;

/* loaded from: classes5.dex */
public final class r implements oi.o {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5917m f58312a;

    /* renamed from: b, reason: collision with root package name */
    public final G f58313b;

    public r(AbstractC5916l abstractC5916l, AbstractC5917m abstractC5917m, G g10) {
        if (g10.q() == 24) {
            this.f58312a = abstractC5917m.L(C5912h.c(1L));
            this.f58313b = G.z0();
        } else {
            this.f58312a = abstractC5917m;
            this.f58313b = g10;
        }
    }

    public static r b(AbstractC5917m abstractC5917m, G g10) {
        if (abstractC5917m != null) {
            return new r(null, abstractC5917m, g10);
        }
        throw new NullPointerException("Missing date component.");
    }

    public A a(net.time4j.tz.l lVar, oi.F f10) {
        H i02 = ((F) this.f58312a.N(F.class)).i0(this.f58313b);
        int intValue = ((Integer) this.f58313b.j(G.f57595y)).intValue() - f10.b(i02.P(), lVar.z());
        if (intValue >= 86400) {
            i02 = (H) i02.D(1L, EnumC5706f.f57798h);
        } else if (intValue < 0) {
            i02 = (H) i02.E(1L, EnumC5706f.f57798h);
        }
        return i02.S(lVar);
    }

    @Override // oi.o
    public Object c(oi.p pVar) {
        return pVar.Y() ? h().c(pVar) : this.f58313b.c(pVar);
    }

    @Override // oi.o
    public boolean d() {
        return false;
    }

    @Override // oi.o
    public int e(oi.p pVar) {
        return pVar.Y() ? h().e(pVar) : this.f58313b.e(pVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) r.class.cast(obj);
            if (this.f58313b.equals(rVar.f58313b) && this.f58312a.equals(rVar.f58312a)) {
                return true;
            }
        }
        return false;
    }

    @Override // oi.o
    public boolean f(oi.p pVar) {
        return pVar.Y() ? h().f(pVar) : this.f58313b.f(pVar);
    }

    public Object g() {
        return this.f58312a;
    }

    public final oi.o h() {
        return this.f58312a;
    }

    public int hashCode() {
        return this.f58312a.hashCode() + this.f58313b.hashCode();
    }

    @Override // oi.o
    public Object j(oi.p pVar) {
        return pVar.Y() ? h().j(pVar) : this.f58313b.j(pVar);
    }

    @Override // oi.o
    public Object m(oi.p pVar) {
        return pVar.Y() ? h().m(pVar) : this.f58313b.m(pVar);
    }

    @Override // oi.o
    public net.time4j.tz.k r() {
        throw new oi.r("Timezone not available: " + this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f58312a);
        sb2.append(this.f58313b);
        return sb2.toString();
    }
}
