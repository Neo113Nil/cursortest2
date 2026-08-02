package defpackage;

import com.sofascore.model.mvvm.model.Category;
import com.sofascore.results.main.matches.redesign.datematches.DateMatchesFragment;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class yg4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DateMatchesFragment b;

    public /* synthetic */ yg4(DateMatchesFragment dateMatchesFragment, int i) {
        this.a = i;
        this.b = dateMatchesFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 0;
        r2 = false;
        boolean z = false;
        int i3 = 0;
        int i4 = 1;
        DateMatchesFragment dateMatchesFragment = this.b;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                gi6 E = dateMatchesFragment.E();
                map.getClass();
                E.getClass();
                Iterator it = E.i.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int i5 = i2 + 1;
                    if (i2 < 0) {
                        b.q();
                        throw null;
                    }
                    if (next instanceof ci6) {
                        ci6 ci6Var = (ci6) next;
                        Category category = ci6Var.b;
                        Integer num = (Integer) map.get(String.valueOf(category.getId()));
                        category.setLiveEvents(num != null ? num.intValue() : category.getLiveEvents());
                        E.notifyItemChanged(E.g.size() + i2, new tcb(ci6Var));
                    }
                    i2 = i5;
                }
                return Unit.a;
            case 1:
                dateMatchesFragment.E().Q();
                return Unit.a;
            case 2:
                Map map2 = (Map) obj;
                gi6 E2 = dateMatchesFragment.E();
                map2.getClass();
                E2.getClass();
                Iterator it2 = E2.i.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    int i6 = i3 + 1;
                    if (i3 < 0) {
                        b.q();
                        throw null;
                    }
                    if (next2 instanceof ci6) {
                        ci6 ci6Var2 = (ci6) next2;
                        Category category2 = ci6Var2.b;
                        ih4 ih4Var = (ih4) map2.get(String.valueOf(category2.getId()));
                        category2.setLiveEvents(ih4Var != null ? ih4Var.a : category2.getLiveEvents());
                        ih4 ih4Var2 = (ih4) map2.get(String.valueOf(category2.getId()));
                        category2.setTotalEvents(ih4Var2 != null ? ih4Var2.b : category2.getTotalEvents());
                        E2.notifyItemChanged(E2.g.size() + i3, new tcb(ci6Var2));
                    }
                    i3 = i6;
                }
                return Unit.a;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    g6b lifecycle = dateMatchesFragment.getLifecycle();
                    lifecycle.getClass();
                    if (lifecycle.b().compareTo(e6b.e) < 0) {
                        lifecycle.a(new o01(lifecycle, dateMatchesFragment, i4));
                    } else if (dateMatchesFragment.E().getItemCount() == 0) {
                        dateMatchesFragment.u();
                        if (!dateMatchesFragment.C()) {
                            dateMatchesFragment.l();
                        }
                    }
                }
                return Unit.a;
            case 4:
                Boolean bool = (Boolean) obj;
                if (dateMatchesFragment.getViewLifecycleOwner().getLifecycle().b().compareTo(e6b.e) >= 0) {
                    if (bool.booleanValue()) {
                        dateMatchesFragment.y(true);
                    } else {
                        dateMatchesFragment.h = System.currentTimeMillis();
                    }
                }
                return Unit.a;
            case 5:
                dateMatchesFragment.H().k(((sqb) obj).a);
                return Unit.a;
            default:
                ai4 H = dateMatchesFragment.H();
                oqb oqbVar = ((qqb) obj).b;
                long j = H.h;
                oqb oqbVar2 = H.v;
                if (oqbVar2 != null && !i2a.z(oqbVar2, j, false).equals(i2a.z(oqbVar, j, false))) {
                    z = true;
                }
                H.s = z;
                H.v = oqbVar;
                H.o(H.j);
                return Unit.a;
        }
    }
}
