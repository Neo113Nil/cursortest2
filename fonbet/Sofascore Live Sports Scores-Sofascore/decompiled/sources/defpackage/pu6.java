package defpackage;

import android.app.Application;
import androidx.compose.runtime.e;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lpu6;", "Lq8;", "Lmk7;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class pu6 extends q8 implements mk7 {
    public final fqg e;
    public final wi7 f;
    public final ky6 g;
    public final tj7 h;
    public final String i;
    public final boolean j;
    public final e1d k;
    public final pog l;
    public final g62 m;
    public final nn2 n;
    public final e1d o;
    public g9i p;
    public Integer q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu6(Application application, bfk bfkVar, fqg fqgVar, wi7 wi7Var, ky6 ky6Var, tj7 tj7Var) {
        super(application);
        bfkVar.getClass();
        fqgVar.getClass();
        wi7Var.getClass();
        ky6Var.getClass();
        tj7Var.getClass();
        this.e = fqgVar;
        this.f = wi7Var;
        this.g = ky6Var;
        this.h = tj7Var;
        this.i = bfkVar.b().getId();
        this.j = jca.G(bfkVar.b());
        this.k = e.f(new hu6(uj7.a, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, false, false, u77.a, null, null, null, new gu6(null, false)));
        this.l = sea.y(new qo6(this, 2));
        g62 g = ml4.g(0, 7, null);
        this.m = g;
        this.n = f5p.J(g);
        this.o = e.f(null);
        yea yeaVar = j58.a;
        nxf[] nxfVarArr = nxf.a;
        fcp.m0(new v98(yso.q(new i58(null)), new iu6(this, null, 0), 3), un0.z(this));
    }

    public static vl7 o(ev6 ev6Var, ho7 ho7Var, boolean z, boolean z2) {
        if (!ev6Var.G) {
            return null;
        }
        tl7 tl7Var = tl7.h;
        boolean z3 = ev6Var.I;
        boolean d = ho7Var.d();
        mj7 mj7Var = ho7Var.a;
        return hz8.H(tl7Var, z2, z3, d, z || mj7Var.p, ho7Var.f, mj7Var.h(), false, mj7Var.n);
    }

    public static vl7 t(ev6 ev6Var, ho7 ho7Var, boolean z, boolean z2) {
        if (!ev6Var.F) {
            return null;
        }
        tl7 tl7Var = tl7.g;
        boolean z3 = ev6Var.J;
        boolean d = ho7Var.d();
        mj7 mj7Var = ho7Var.a;
        return hz8.H(tl7Var, z2, z3, d, z || mj7Var.p, ho7Var.e, mj7Var.h(), false, mj7Var.n);
    }

    public static void u(pu6 pu6Var, ho7 ho7Var, int i) {
        boolean z;
        ho7 ho7Var2;
        mj7 mj7Var;
        boolean z2 = (i & 1) == 0;
        ho7 ho7Var3 = (i & 2) != 0 ? null : ho7Var;
        g9i g9iVar = pu6Var.p;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        boolean z3 = pu6Var.getR() == FantasyCompetitionType.WEEKLY;
        boolean z4 = ho7Var3 != null && ((ho7Var2 = pu6Var.l().c) == null || (mj7Var = ho7Var2.a) == null || mj7Var.a != ho7Var3.a.a);
        if (z2) {
            pu6Var.x(hu6.a(pu6Var.l(), uj7.a, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, false, false, null, null, null, null, null, 16777214));
        }
        if (z4) {
            long longValue = ((Number) n9e.x(pu6Var.i(), new q13(pu6Var.m().c.c, 24))).longValue();
            Long l = ho7Var3.a.h;
            boolean z5 = !z3 || (ho7Var3.a.i() && ((longValue > (l != null ? l.longValue() : 0L) ? 1 : (longValue == (l != null ? l.longValue() : 0L) ? 0 : -1)) >= 0));
            z = z4;
            hu6 l2 = pu6Var.l();
            gv9 gv9Var = z5 ? pu6Var.l().f : rlh.b;
            gv9 gv9Var2 = z5 ? pu6Var.l().u : null;
            pu6Var.x(hu6.a(l2, null, null, ho7Var3, null, null, gv9Var, null, null, null, false, false, null, false, z5 && pu6Var.l().n, null, null, null, z5, false, z5 ? pu6Var.l().t : u77.a, gv9Var2, null, null, null, 12704219));
        } else {
            z = z4;
        }
        iz2 z6 = un0.z(pu6Var);
        hs4 hs4Var = z45.a;
        pu6Var.p = xw3.L(z6, hq4.c, null, new mu6(z, pu6Var, z3, null), 2);
    }

    public static vl7 y(ev6 ev6Var, ho7 ho7Var, boolean z) {
        if (!ev6Var.E) {
            return null;
        }
        tl7 tl7Var = tl7.f;
        boolean z2 = ev6Var.H;
        boolean d = ho7Var.d();
        mj7 mj7Var = ho7Var.a;
        return hz8.H(tl7Var, z, z2, d, false, ho7Var.g, mj7Var.h(), !mj7Var.h(), mj7Var.n);
    }

    public final void A(ArrayList arrayList, Integer num) {
        gv9 gv9Var;
        Object obj;
        g9i g9iVar = this.p;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        if (num != null && (gv9Var = l().d) != null) {
            Iterator<E> it = gv9Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((ho7) obj).a.a == num.intValue()) {
                        break;
                    }
                }
            }
            ho7 ho7Var = (ho7) obj;
            if (ho7Var != null) {
                u(this, ho7Var, 1);
            }
        }
        xw3.L(un0.z(this), null, null, new ou6(this, arrayList, null), 3);
    }

    public final Pair k(List list, List list2, ho7 ho7Var) {
        Object obj;
        Object obj2;
        boolean z;
        mj7 mj7Var;
        mj7 mj7Var2;
        mj7 mj7Var3;
        mj7 mj7Var4;
        mj7 mj7Var5 = ho7Var.a;
        if (mj7Var5.n) {
            Boolean bool = Boolean.FALSE;
            return new Pair(bool, bool);
        }
        Iterator it = list2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((ho7) obj2).a.a == m().c.n) {
                break;
            }
        }
        ho7 ho7Var2 = (ho7) obj2;
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int i = ((ho7) next).a.a;
            Integer num = m().c.m;
            if (num != null && i == num.intValue()) {
                obj = next;
                break;
            }
        }
        ho7 ho7Var3 = (ho7) obj;
        boolean z2 = true;
        boolean z3 = (ho7Var2 == null || (mj7Var4 = ho7Var2.a) == null || mj7Var5.a != mj7Var4.a) ? false : true;
        boolean z4 = (ho7Var3 == null || (mj7Var3 = ho7Var3.a) == null || mj7Var5.a != mj7Var3.a) ? false : true;
        boolean d = mj7Var5.d();
        if (list == null || !list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                if (!((FantasyRoundPlayerUiModel) it3.next()).v) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z5 = (z3 || z4) && !d && z;
        int i2 = mj7Var5.a;
        if (ho7Var2 == null || (mj7Var2 = ho7Var2.a) == null || i2 != mj7Var2.a ? ho7Var3 == null || (mj7Var = ho7Var3.a) == null || i2 != mj7Var.a || (((ho7Var2 == null || !Boolean.valueOf(ho7Var2.a.h()).equals(Boolean.TRUE)) && ho7Var2 != null) || mj7Var5.h()) : mj7Var5.h()) {
            z2 = false;
        }
        return new Pair(Boolean.valueOf(z5), Boolean.valueOf(z2));
    }

    public final hu6 l() {
        return (hu6) ((eoh) this.k).getValue();
    }

    public final do7 m() {
        Object a = this.e.a("USER_COMPETITION_EXTRA");
        if (a != null) {
            return (do7) a;
        }
        a70.r("Required value was null.");
        return null;
    }

    public final void n(gt6 gt6Var) {
        xw3.L(un0.z(this), null, null, new hs6(this, gt6Var, (rq3) null, 1), 3);
    }

    @Override // defpackage.mk7
    /* renamed from: p */
    public final FantasyCompetitionType getR() {
        return m().c.d;
    }

    @Override // defpackage.mk7
    public final void q(il8 il8Var) {
        this.o.setValue(il8Var);
    }

    @Override // defpackage.mk7
    public final il8 r() {
        return (il8) ((eoh) this.o).getValue();
    }

    public final void v(vl7 vl7Var) {
        hu6 l = l();
        gu6 gu6Var = l().x;
        x(hu6.a(l, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, false, false, null, null, null, null, new gu6(vl7Var, false), 8388607));
    }

    public final Object w(mu6 mu6Var) {
        hs4 hs4Var = z45.a;
        Object R = xw3.R(rob.a, new iu6(this, null, 2), mu6Var);
        return R == lu3.a ? R : Unit.a;
    }

    public final void x(hu6 hu6Var) {
        ((eoh) this.k).setValue(hu6Var);
    }

    public final void z(List list, List list2, int i, Double d, Boolean bool, Boolean bool2, Boolean bool3, boolean z) {
        list.getClass();
        g9i g9iVar = this.p;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        xw3.L(un0.z(this), null, null, new nu6(this, bool2, bool3, i, bool, list, list2, z, d, null), 3);
    }
}
