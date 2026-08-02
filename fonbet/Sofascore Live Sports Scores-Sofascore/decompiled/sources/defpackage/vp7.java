package defpackage;

import android.app.Application;
import androidx.compose.runtime.e;
import com.sofascore.results.fantasy.ui.model.FantasyFootballPlayerPlaceholder;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvp7;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class vp7 extends q8 {
    public final wi7 e;
    public final ky6 f;
    public final ev6 g;
    public final int h;
    public final e1d i;
    public final g62 j;
    public final nn2 k;
    public final g62 l;
    public final nn2 m;
    public final pog n;
    public oz6 o;
    public FantasyRoundPlayerUiModel p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp7(Application application, fqg fqgVar, wi7 wi7Var, ky6 ky6Var) {
        super(application);
        fqgVar.getClass();
        wi7Var.getClass();
        ky6Var.getClass();
        this.e = wi7Var;
        this.f = ky6Var;
        Object a = fqgVar.a("competition");
        rq3 rq3Var = null;
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        ev6 ev6Var = (ev6) a;
        this.g = ev6Var;
        Object a2 = fqgVar.a("roundId");
        if (a2 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        int intValue = ((Number) a2).intValue();
        this.h = intValue;
        this.i = e.f(new qp7(ev6Var, intValue, true, l6g.W(qp7.j), 0, false, false, rlh.b, km5.a));
        g62 g = ml4.g(0, 7, null);
        this.j = g;
        this.k = f5p.J(g);
        g62 g2 = ml4.g(0, 7, null);
        this.l = g2;
        this.m = f5p.J(g2);
        this.n = sea.y(new qo6(this, 22));
        xw3.L(un0.z(this), null, null, new qu1(this, intValue, rq3Var, 11), 3);
    }

    public final qp7 k() {
        return (qp7) ((eoh) this.i).getValue();
    }

    public final void l(oz6 oz6Var) {
        int i;
        oz6Var.getClass();
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = this.p;
        if (fantasyRoundPlayerUiModel == null) {
            return;
        }
        gv9 gv9Var = k().d;
        ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
        Iterator<E> it = gv9Var.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            oz6 oz6Var2 = (oz6) it.next();
            if (oz6Var2.getE() == oz6Var.getE()) {
                oz6Var2 = FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel, null, oz6Var.getC(), false, false, false, null, null, 536870903);
            } else if (oz6Var2 instanceof FantasyRoundPlayerUiModel) {
                oz6Var2 = FantasyRoundPlayerUiModel.b((FantasyRoundPlayerUiModel) oz6Var2, null, 0, false, false, false, null, null, 536870891);
            } else if (oz6Var2 instanceof FantasyFootballPlayerPlaceholder) {
                oz6Var2 = FantasyFootballPlayerPlaceholder.b((FantasyFootballPlayerPlaceholder) oz6Var2, null, false, 21);
            }
            arrayList.add(oz6Var2);
        }
        qp7 k = k();
        gv9 W = l6g.W(arrayList);
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if ((((oz6) it2.next()) instanceof FantasyRoundPlayerUiModel) && (i = i + 1) < 0) {
                    b.p();
                    throw null;
                }
            }
        }
        m(qp7.a(k, W, i, false, false, null, null, 423));
        this.p = null;
        this.o = null;
        n();
    }

    public final void m(qp7 qp7Var) {
        ((eoh) this.i).setValue(qp7Var);
    }

    public final void n() {
        gv9 gv9Var = k().d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : gv9Var) {
            if (obj instanceof FantasyRoundPlayerUiModel) {
                arrayList.add(obj);
            }
        }
        Map a = h49.a(new t50(arrayList, 2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : a.entrySet()) {
            if (((Number) entry.getValue()).intValue() > k().a.p) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((Pair) ((Map.Entry) it.next()).getKey());
        }
        xbb b = a.b();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            b.add(new sp7((String) ((Pair) it2.next()).b, k().a.p));
        }
        xbb a2 = a.a(b);
        m(qp7.a(k(), null, 0, a2.isEmpty() && k().e == 15, false, l6g.W(a2), null, 351));
    }
}
