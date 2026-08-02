package defpackage;

import com.sofascore.results.referee.events.RefereeEventsFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class tsf implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RefereeEventsFragment b;
    public final /* synthetic */ u6e c;

    public /* synthetic */ tsf(RefereeEventsFragment refereeEventsFragment, u6e u6eVar, int i) {
        this.a = i;
        this.b = refereeEventsFragment;
        this.c = u6eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 0;
        int i3 = 1;
        u6e u6eVar = this.c;
        RefereeEventsFragment refereeEventsFragment = this.b;
        List list = (List) obj;
        switch (i) {
            case 0:
                kda.p(wca.x(refereeEventsFragment.getLifecycle()), new vsf(refereeEventsFragment, list, null, i2), new tsf(refereeEventsFragment, u6eVar, i3));
                break;
            default:
                list.getClass();
                refereeEventsFragment.n();
                ((b7e) refereeEventsFragment.t.getValue()).X(list);
                if (refereeEventsFragment.u) {
                    refereeEventsFragment.u = false;
                    u6eVar.e = true;
                    u6eVar.f = true;
                }
                break;
        }
        return Unit.a;
    }
}
