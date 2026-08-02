package defpackage;

import com.sofascore.model.mvvm.model.CricketEvent;
import com.sofascore.model.mvvm.model.Event;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pz3 implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CricketEvent b;

    public /* synthetic */ pz3(CricketEvent cricketEvent, int i) {
        this.a = i;
        this.b = cricketEvent;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        CricketEvent cricketEvent = this.b;
        switch (i) {
            case 0:
                boolean z = false;
                xtc xtcVar = (xtc) obj;
                long j = ((r13) obj2).a;
                of3 of3Var = (of3) obj3;
                int intValue = ((Number) obj4).intValue();
                xtcVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(xtcVar) ? 4 : 2;
                }
                if ((intValue & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130) {
                    z = true;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, z)) {
                    td4.G(Event.getHomeTeam$default(cricketEvent, null, 1, null).getId(), xtcVar, false, 0L, av8Var, (intValue << 3) & 112, 12);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                boolean z2 = false;
                xtc xtcVar2 = (xtc) obj;
                long j2 = ((r13) obj2).a;
                of3 of3Var2 = (of3) obj3;
                int intValue2 = ((Number) obj4).intValue();
                xtcVar2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(xtcVar2) ? 4 : 2;
                }
                if ((intValue2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130) {
                    z2 = true;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, z2)) {
                    td4.G(Event.getAwayTeam$default(cricketEvent, null, 1, null).getId(), xtcVar2, false, 0L, av8Var2, (intValue2 << 3) & 112, 12);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                boolean z3 = false;
                xtc xtcVar3 = (xtc) obj;
                long j3 = ((r13) obj2).a;
                of3 of3Var3 = (of3) obj3;
                int intValue3 = ((Number) obj4).intValue();
                xtcVar3.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var3).g(xtcVar3) ? 4 : 2;
                }
                if ((intValue3 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130) {
                    z3 = true;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, z3)) {
                    td4.G(Event.getHomeTeam$default(cricketEvent, null, 1, null).getId(), xtcVar3, false, 0L, av8Var3, (intValue3 << 3) & 112, 12);
                } else {
                    av8Var3.W();
                }
                break;
            default:
                xtc xtcVar4 = (xtc) obj;
                long j4 = ((r13) obj2).a;
                of3 of3Var4 = (of3) obj3;
                int intValue4 = ((Number) obj4).intValue();
                xtcVar4.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((av8) of3Var4).g(xtcVar4) ? 4 : 2;
                }
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                    td4.G(Event.getAwayTeam$default(cricketEvent, null, 1, null).getId(), xtcVar4, false, 0L, av8Var4, (intValue4 << 3) & 112, 12);
                } else {
                    av8Var4.W();
                }
                break;
        }
        return Unit.a;
    }
}
