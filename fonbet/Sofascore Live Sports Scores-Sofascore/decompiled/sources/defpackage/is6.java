package defpackage;

import android.app.Application;
import androidx.compose.runtime.e;
import com.sofascore.model.fantasy.FantasyLeagueType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lis6;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class is6 extends q8 {
    public final wi7 e;
    public final fqg f;
    public final e1d g;
    public final g62 h;
    public final nn2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is6(wi7 wi7Var, fqg fqgVar, Application application) {
        super(application);
        wi7Var.getClass();
        fqgVar.getClass();
        this.e = wi7Var;
        this.f = fqgVar;
        rlh rlhVar = rlh.b;
        this.g = e.f(new gs6(true, null, rlhVar, rlhVar, 0, 0));
        g62 g = ml4.g(0, 7, null);
        this.h = g;
        this.i = f5p.J(g);
    }

    public final void k(fo7 fo7Var, boolean z) {
        int i;
        xw3.L(un0.z(this), null, null, new t3(fo7Var, this, z, (rq3) null, 7), 3);
        ArrayList x0 = CollectionsKt.x0(CollectionsKt.w0(l().d, l().c), fo7Var);
        Pair Q = rz8.Q(x0, i(), new yn6(27));
        List list = (List) Q.a;
        List list2 = (List) Q.b;
        gs6 l = l();
        gv9 W = l6g.W(list);
        gv9 W2 = l6g.W(list2);
        int i2 = 0;
        if (x0.isEmpty()) {
            i = 0;
        } else {
            Iterator it = x0.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                if (((fo7) it.next()).c && (i3 = i3 + 1) < 0) {
                    b.p();
                    throw null;
                }
            }
            i = i3;
        }
        if (!x0.isEmpty()) {
            Iterator it2 = x0.iterator();
            while (it2.hasNext()) {
                j67 j67Var = ((fo7) it2.next()).a;
                if ((j67Var != null ? j67Var.j : null) == FantasyLeagueType.RANDOM && (i2 = i2 + 1) < 0) {
                    b.p();
                    throw null;
                }
            }
        }
        ((eoh) this.g).setValue(gs6.a(l, W, W2, i, i2, 3));
    }

    public final gs6 l() {
        return (gs6) ((eoh) this.g).getValue();
    }

    public final do7 m() {
        Object a = this.f.a("USER_COMPETITION_EXTRA");
        if (a != null) {
            return (do7) a;
        }
        a70.r("Required value was null.");
        return null;
    }
}
