package defpackage;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.results.event.details.view.cricket.wagonwheel.CricketWagonWheelView;
import com.sofascore.results.event.graphs.view.CricketBowlerView;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class jz3 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Player b;

    public /* synthetic */ jz3(Player player, int i) {
        this.a = i;
        this.b = player;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Player player = this.b;
        switch (i) {
            case 0:
                boolean z = false;
                xtc xtcVar = (xtc) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                int i2 = CricketBowlerView.n;
                xtcVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(xtcVar) ? 4 : 2;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, z)) {
                    td4.C(player.getId(), xtcVar, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, (intValue << 3) & 112, 12);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                boolean z2 = false;
                xtc xtcVar2 = (xtc) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                int i3 = CricketWagonWheelView.l;
                xtcVar2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(xtcVar2) ? 4 : 2;
                }
                if ((intValue2 & 19) != 18) {
                    z2 = true;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, z2)) {
                    td4.C(player.getId(), xtcVar2, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, (intValue2 << 3) & 112, 12);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                xtc xtcVar3 = (xtc) obj;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                xtcVar3.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var3).g(xtcVar3) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    td4.C(player.getId(), xtcVar3, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var3, (intValue3 << 3) & 112, 12);
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }
}
