package defpackage;

import com.sofascore.results.event.standings.EventStandingsFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ya6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventStandingsFragment b;

    public /* synthetic */ ya6(EventStandingsFragment eventStandingsFragment, int i) {
        this.a = i;
        this.b = eventStandingsFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        EventStandingsFragment eventStandingsFragment = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                if (list != null) {
                    if (list.isEmpty()) {
                        list = null;
                    }
                    if (list != null) {
                        eventStandingsFragment.C().F(list);
                    }
                }
                break;
            default:
                r9i r9iVar = (r9i) obj;
                r9iVar.getClass();
                eventStandingsFragment.E().j = r9iVar;
                if (r9iVar instanceof q9i) {
                    eventStandingsFragment.u();
                } else {
                    eventStandingsFragment.E().n();
                }
                break;
        }
        return Unit.a;
    }
}
