package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.crowdsourcing.EventContributeFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class iw5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventContributeFragment b;

    public /* synthetic */ iw5(EventContributeFragment eventContributeFragment, int i) {
        this.a = i;
        this.b = eventContributeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        EventContributeFragment eventContributeFragment = this.b;
        switch (i) {
            case 0:
                Event event = (Event) obj;
                if (event != null) {
                    tr3 D = eventContributeFragment.D();
                    xw3.L(un0.z(D), null, null, new hy1(D, event, null, 20), 3);
                }
                break;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    eventContributeFragment.D().x(false);
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    tr3 D2 = eventContributeFragment.D();
                    xw3.L(un0.z(D2), null, null, new rr3(D2, false, null), 3).n(new vq3(D2, 0));
                }
                break;
        }
        return Unit.a;
    }
}
