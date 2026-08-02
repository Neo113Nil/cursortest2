package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.event.overs.EventOversFragment;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class u46 implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventOversFragment b;

    public /* synthetic */ u46(EventOversFragment eventOversFragment, int i) {
        this.a = i;
        this.b = eventOversFragment;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        EventOversFragment eventOversFragment = this.b;
        switch (i) {
            case 0:
                xtc xtcVar = (xtc) obj;
                long j = ((r13) obj2).a;
                of3 of3Var = (of3) obj3;
                int intValue = ((Number) obj4).intValue();
                xtcVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(xtcVar) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                    td4.G(Event.getHomeTeam$default(eventOversFragment.C(), null, 1, null).getId(), xtcVar, false, 0L, av8Var, (intValue << 3) & 112, 12);
                } else {
                    av8Var.W();
                }
                break;
            default:
                xtc xtcVar2 = (xtc) obj;
                long j2 = ((r13) obj2).a;
                of3 of3Var2 = (of3) obj3;
                int intValue2 = ((Number) obj4).intValue();
                xtcVar2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(xtcVar2) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                    td4.G(Event.getAwayTeam$default(eventOversFragment.C(), null, 1, null).getId(), xtcVar2, false, 0L, av8Var2, (intValue2 << 3) & 112, 12);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
