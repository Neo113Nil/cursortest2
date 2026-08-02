package defpackage;

import com.sofascore.results.manager.matches.ManagerEventsFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ksb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ManagerEventsFragment b;
    public final /* synthetic */ u6e c;

    public /* synthetic */ ksb(ManagerEventsFragment managerEventsFragment, u6e u6eVar, int i) {
        this.a = i;
        this.b = managerEventsFragment;
        this.c = u6eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 1;
        u6e u6eVar = this.c;
        ManagerEventsFragment managerEventsFragment = this.b;
        switch (i) {
            case 0:
                kda.p(wca.x(managerEventsFragment.getLifecycle()), new n50(managerEventsFragment, (wsb) obj, null, 8), new ksb(managerEventsFragment, u6eVar, i2));
                break;
            default:
                List list = (List) obj;
                list.getClass();
                managerEventsFragment.n();
                if (list.isEmpty()) {
                    managerEventsFragment.C().F(a.c(managerEventsFragment.v));
                } else {
                    managerEventsFragment.C().X(list);
                    if (managerEventsFragment.t) {
                        managerEventsFragment.t = false;
                        u6eVar.e = true;
                        u6eVar.f = true;
                    }
                }
                break;
        }
        return Unit.a;
    }
}
