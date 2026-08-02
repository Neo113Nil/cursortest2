package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceEntrant;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Ld3i;", "Lynb;", "La3i;", "Lx2i;", "", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class d3i extends ynb {
    public final s96 l;
    public final Stage m;
    public Integer n;
    public boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3i(Application application, fqg fqgVar, s96 s96Var) {
        super(application, tnb.a);
        fqgVar.getClass();
        s96Var.getClass();
        this.l = s96Var;
        Object a = fqgVar.a("EVENT");
        rq3 rq3Var = null;
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.m = (Stage) a;
        this.o = true;
        wf2 wf2Var = this.k;
        l2i l2iVar = new l2i(1);
        sc6 sc6Var = hkg.q;
        fcp.m0(new v98(hkg.I(wf2Var, l2iVar, sc6Var), new hje(this, rq3Var, 8), 3), un0.z(this));
        fcp.m0(new v98(hkg.I(this.k, new l2i(2), sc6Var), new m1f(this, rq3Var, 21), 3), un0.z(this));
    }

    public static AbstractList t(a3i a3iVar) {
        gv9 gv9Var = a3iVar.c;
        if (gv9Var.size() < 3) {
            ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
            Iterator<E> it = gv9Var.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((RaceFlowModels$RaceEntrant) it.next()).a));
            }
            return arrayList;
        }
        Collection values = a3iVar.d.values();
        int i = 0;
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it2 = values.iterator();
            while (it2.hasNext()) {
                if (!((List) it2.next()).isEmpty() && (i = i + 1) < 0) {
                    b.p();
                    throw null;
                }
            }
        }
        if (i < 3) {
            ArrayList arrayList2 = new ArrayList(k13.r(gv9Var, 10));
            Iterator<E> it3 = gv9Var.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Integer.valueOf(((RaceFlowModels$RaceEntrant) it3.next()).a));
            }
            return arrayList2;
        }
        xbb b = a.b();
        dsf dsfVar = new dsf();
        dsfVar.a = a3iVar.j;
        while (b.size() < 3) {
            List H0 = CollectionsKt.H0(gv9Var, new i31(7, a3iVar, dsfVar));
            ArrayList arrayList3 = new ArrayList(k13.r(H0, 10));
            Iterator it4 = H0.iterator();
            while (it4.hasNext()) {
                arrayList3.add(Integer.valueOf(((RaceFlowModels$RaceEntrant) it4.next()).a));
            }
            b.addAll(CollectionsKt.L0(arrayList3, 3 - b.size()));
            dsfVar.a--;
        }
        return a.a(b);
    }
}
