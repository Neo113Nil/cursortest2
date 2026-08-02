package defpackage;

import android.content.ClipDescription;
import androidx.compose.runtime.e;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tbj {
    public boolean A;
    public final aak a;
    public q5b d;
    public Function0 f;
    public iy2 g;
    public ku3 h;
    public eje i;
    public z69 j;
    public ce8 k;
    public final e1d l;
    public final e1d m;
    public long n;
    public pej o;
    public long p;
    public final e1d q;
    public final e1d r;
    public int s;
    public wcj t;
    public yih u;
    public pej v;
    public final e1d w;
    public final kkj x;
    public final rbj y;
    public final yih z;
    public nnd b = ckk.a;
    public Function1 c = new qaj(2);
    public final e1d e = e.f(new wcj(7, 0, (String) null));

    public tbj(aak aakVar) {
        this.a = aakVar;
        Boolean bool = Boolean.TRUE;
        this.l = e.f(bool);
        this.m = e.f(bool);
        this.n = 0L;
        this.p = 0L;
        this.q = e.f(null);
        this.r = e.f(null);
        this.s = -1;
        this.t = new wcj(7, 0L, (String) null);
        this.w = e.f(Boolean.FALSE);
        this.x = new kkj();
        this.y = new rbj(this);
        this.z = new yih(this);
    }

    public static wcj b(q80 q80Var, long j) {
        return new wcj(q80Var, j, (pej) null);
    }

    public final g9i a(boolean z) {
        ku3 ku3Var = this.h;
        rq3 rq3Var = null;
        if (ku3Var != null) {
            return xw3.L(ku3Var, null, nu3.d, new j92(this, z, rq3Var, 3), 1);
        }
        return null;
    }

    public final void c() {
        ku3 ku3Var = this.h;
        if (ku3Var != null) {
            xw3.L(ku3Var, null, nu3.d, new nbj(this, null, 1), 1);
        }
    }

    public final void d(dnd dndVar) {
        if (!pej.d(l().b)) {
            q5b q5bVar = this.d;
            bej d = q5bVar != null ? q5bVar.d() : null;
            int f = (dndVar == null || d == null) ? pej.f(l().b) : this.b.i(d.b(dndVar.a, true));
            wcj a = wcj.a(l(), null, t6a.g(f, f), 5);
            this.c.invoke(a);
            this.v = new pej(a.b);
        }
        r((dndVar == null || l().a.b.length() <= 0) ? p69.a : p69.c);
        u(false);
    }

    public final void e(boolean z) {
        ce8 ce8Var;
        q5b q5bVar = this.d;
        if (q5bVar != null && !q5bVar.b() && (ce8Var = this.k) != null) {
            ce8.a(ce8Var);
        }
        this.t = l();
        u(z);
        r(p69.b);
    }

    public final Pair f() {
        String str;
        pej pejVar;
        q80 k = k();
        if (k == null || (str = k.b) == null || (pejVar = this.v) == null) {
            return null;
        }
        long j = pejVar.a;
        return new Pair(str, new pej(t6a.g(this.b.v((int) (j >> 32)), this.b.v((int) (j & 4294967295L)))));
    }

    public final dnd g() {
        return (dnd) ((eoh) this.r).getValue();
    }

    public final boolean h() {
        return ((Boolean) ((eoh) this.l).getValue()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) ((eoh) this.m).getValue()).booleanValue();
    }

    public final long j(boolean z) {
        bej d;
        long j;
        q5b q5bVar = this.d;
        if (q5bVar == null || (d = q5bVar.d()) == null) {
            return 9205357640488583168L;
        }
        aej aejVar = d.a;
        q80 k = k();
        if (k == null) {
            return 9205357640488583168L;
        }
        if (!Intrinsics.c(k.b, aejVar.a.a.b)) {
            return 9205357640488583168L;
        }
        wcj l = l();
        if (z) {
            long j2 = l.b;
            int i = pej.c;
            j = j2 >> 32;
        } else {
            long j3 = l.b;
            int i2 = pej.c;
            j = j3 & 4294967295L;
        }
        return y6a.D(aejVar, this.b.v((int) j), z, pej.h(l().b));
    }

    public final q80 k() {
        q5b q5bVar = this.d;
        if (q5bVar != null) {
            return (q80) q5bVar.a.b;
        }
        return null;
    }

    public final wcj l() {
        return (wcj) ((eoh) this.e).getValue();
    }

    public final void m() {
        g9i g9iVar;
        u8j u8jVar = this.x.a;
        if (u8jVar == null || (g9iVar = u8jVar.u) == null) {
            return;
        }
        g9iVar.e(null);
        u8jVar.u = null;
    }

    public final void n(pej pejVar) {
        q80 k;
        String str;
        ku3 ku3Var;
        if (pejVar == null) {
            return;
        }
        long j = pejVar.a;
        eje ejeVar = this.i;
        if (ejeVar == null || (k = k()) == null || (str = k.b) == null) {
            return;
        }
        nnd nndVar = this.b;
        long g = t6a.g(nndVar.v((int) (j >> 32)), nndVar.v((int) (j & 4294967295L)));
        if (str.length() <= 0 || pej.d(g) || (ku3Var = this.h) == null) {
            return;
        }
        xw3.L(ku3Var, null, null, new uo3(ejeVar, str, g, pejVar, this, nndVar, null), 3);
    }

    public final void o() {
        ku3 ku3Var = this.h;
        if (ku3Var != null) {
            xw3.L(ku3Var, null, nu3.d, new nbj(this, null, 2), 1);
        }
    }

    public final void p(dnd dndVar) {
        ((eoh) this.r).setValue(dndVar);
    }

    public final void q(k69 k69Var) {
        ((eoh) this.q).setValue(k69Var);
    }

    public final void r(p69 p69Var) {
        q5b q5bVar = this.d;
        if (q5bVar != null) {
            if (q5bVar.a() == p69Var) {
                q5bVar = null;
            }
            if (q5bVar != null) {
                ((eoh) q5bVar.k).setValue(p69Var);
            }
        }
    }

    public final void s() {
        q5b q5bVar;
        nnh w = bea.w();
        Function1 e = w != null ? w.e() : null;
        nnh C = bea.C(w);
        try {
            if (i() && ((q5bVar = this.d) == null || ((Boolean) ((eoh) q5bVar.q).getValue()).booleanValue())) {
                Unit unit = Unit.a;
                bea.K(w, C, e);
                this.x.a();
            }
        } finally {
            bea.K(w, C, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(sq3 sq3Var) {
        sbj sbjVar;
        int i;
        if (sq3Var instanceof sbj) {
            sbjVar = (sbj) sq3Var;
            int i2 = sbjVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sbjVar.u = i2 - Integer.MIN_VALUE;
                Object obj = sbjVar.s;
                Object obj2 = lu3.a;
                i = sbjVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    iy2 iy2Var = this.g;
                    if (iy2Var != null) {
                        sbjVar.r = this;
                        sbjVar.u = 1;
                        ClipDescription primaryClipDescription = ((fy) iy2Var).a.a().getPrimaryClipDescription();
                        obj = Boolean.valueOf(primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*"));
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = sbjVar.r;
                y6a.M(obj);
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((eoh) this.w).setValue(bool);
                return Unit.a;
            }
        }
        sbjVar = new sbj(this, sq3Var);
        Object obj3 = sbjVar.s;
        Object obj22 = lu3.a;
        i = sbjVar.u;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj3;
        bool2.getClass();
        ((eoh) this.w).setValue(bool2);
        return Unit.a;
    }

    public final void u(boolean z) {
        q5b q5bVar = this.d;
        if (q5bVar != null) {
            ((eoh) q5bVar.l).setValue(Boolean.valueOf(z));
        }
        if (z) {
            s();
        } else {
            m();
        }
    }

    public final long v(wcj wcjVar, long j, boolean z, boolean z2, ilg ilgVar, boolean z3, a79 a79Var) {
        bej d;
        char c;
        z69 z69Var;
        q5b q5bVar = this.d;
        if (q5bVar == null || (d = q5bVar.d()) == null) {
            return pej.b;
        }
        nnd nndVar = this.b;
        long j2 = wcjVar.b;
        q80 q80Var = wcjVar.a;
        int i = pej.c;
        long g = t6a.g(nndVar.v((int) (j2 >> 32)), this.b.v((int) (j2 & 4294967295L)));
        boolean z4 = false;
        int b = d.b(j, false);
        int i2 = (z2 || z) ? b : (int) (g >> 32);
        int i3 = (!z2 || z) ? b : (int) (g & 4294967295L);
        yih yihVar = this.u;
        int i4 = -1;
        if (z || yihVar == null) {
            c = ' ';
        } else {
            c = ' ';
            int i5 = this.s;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        yih m = oea.m(d.a, i2, i3, i4, g, z, z2);
        if (m.o(yihVar)) {
            this.u = m;
            this.s = b;
            w2h a = ilgVar.a(m);
            long g2 = t6a.g(this.b.i(a.a.b), this.b.i(a.b.b));
            if (!pej.c(g2, j2)) {
                boolean z5 = pej.h(g2) != pej.h(j2) && pej.c(t6a.g((int) (4294967295L & g2), (int) (g2 >> c)), j2);
                boolean z6 = pej.d(g2) && pej.d(j2);
                if (z3 && q80Var.b.length() > 0 && !z5 && !z6 && a79Var != null && (z69Var = this.j) != null) {
                    ((kie) z69Var).a(a79Var.a);
                }
                this.c.invoke(b(q80Var, g2));
                this.v = new pej(g2);
                if (!z3) {
                    u(!pej.d(g2));
                }
                q5b q5bVar2 = this.d;
                if (q5bVar2 != null) {
                    ((eoh) q5bVar2.q).setValue(Boolean.valueOf(z3));
                }
                q5b q5bVar3 = this.d;
                if (q5bVar3 != null) {
                    ((eoh) q5bVar3.m).setValue(Boolean.valueOf(!pej.d(g2) && u0a.E(this, true)));
                }
                q5b q5bVar4 = this.d;
                if (q5bVar4 != null) {
                    ((eoh) q5bVar4.n).setValue(Boolean.valueOf(!pej.d(g2) && u0a.E(this, false)));
                }
                q5b q5bVar5 = this.d;
                if (q5bVar5 != null) {
                    if (pej.d(g2) && u0a.E(this, true)) {
                        z4 = true;
                    }
                    ((eoh) q5bVar5.o).setValue(Boolean.valueOf(z4));
                }
                return g2;
            }
        }
        return j2;
    }
}
