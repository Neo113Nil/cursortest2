package zendesk.talk.android.internal.call.setup;

import Dj.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zendesk.talk.android.internal.call.setup.c;
import zendesk.talk.android.internal.call.setup.e;

/* loaded from: classes5.dex */
public final class d {
    public final c a(c.b.a aVar, e eVar) {
        if (Intrinsics.areEqual(eVar, e.a.f68910a)) {
            return c.a.f68902a;
        }
        if (!Intrinsics.areEqual(eVar, e.C1007e.f68914a)) {
            if (Intrinsics.areEqual(eVar, e.d.f68913a)) {
                List c10 = aVar.c();
                if (!(c10 instanceof Collection) || !c10.isEmpty()) {
                    Iterator it = c10.iterator();
                    while (it.hasNext()) {
                        if (((c.b.AbstractC1004c) it.next()) instanceof c.b.AbstractC1004c.a) {
                            return d(aVar);
                        }
                    }
                }
                return new c.e(null);
            }
            if (Intrinsics.areEqual(eVar, e.b.f68911a)) {
                return c.a.f68902a;
            }
            if (eVar instanceof e.f) {
                return new c.e(((e.f) eVar).a());
            }
            if (!Intrinsics.areEqual(eVar, e.c.f68912a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return aVar;
    }

    public final c b(Mj.a setupData) {
        Intrinsics.checkNotNullParameter(setupData, "setupData");
        if (setupData.a() instanceof e.a) {
            return c.d.f68908a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final c c(c state, e viewAction) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(viewAction, "viewAction");
        return viewAction instanceof e.a ? c.a.f68902a : state instanceof c.b.a ? a((c.b.a) state, viewAction) : state;
    }

    public final c.b d(c.b.a aVar) {
        if (aVar.c().size() == 1) {
            return aVar;
        }
        return c.b.a.b(aVar, null, (c.b.AbstractC1004c) aVar.c().get(aVar.c().indexOf(aVar.d()) + 1), 1, null);
    }
}
