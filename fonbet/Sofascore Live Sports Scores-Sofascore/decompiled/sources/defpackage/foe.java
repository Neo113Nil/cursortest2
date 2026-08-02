package defpackage;

import android.content.Context;
import com.sofascore.results.R;
import com.sofascore.results.player.details.PlayerDetailsFragment;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class foe implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerDetailsFragment b;

    public /* synthetic */ foe(PlayerDetailsFragment playerDetailsFragment, int i) {
        this.a = i;
        this.b = playerDetailsFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        utc utcVar = utc.a;
        PlayerDetailsFragment playerDetailsFragment = this.b;
        int i2 = 2;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(609305879, av8Var, new foe(playerDetailsFragment, 3)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    haa.f(yqo.H(1579445373, av8Var2, new foe(playerDetailsFragment, i2)), av8Var2, 6);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Context requireContext = playerDetailsFragment.requireContext();
                    requireContext.getClass();
                    x2a.d(hkg.Q(requireContext, R.string.player_profile_age_limit_info, playerDetailsFragment.E().getGender(), new Object[0]), l98.c0(utcVar, 8.0f, 4.0f), null, 0L, 0L, 0L, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var3, 48, 0, 2044);
                } else {
                    av8Var3.W();
                }
                break;
            default:
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    xtc c0 = l98.c0(utcVar, 8.0f, 4.0f);
                    gv9 b = ele.b(playerDetailsFragment.E(), false);
                    if (b == null) {
                        b = rlh.b;
                    }
                    w1a.e(b, c0, av8Var4, 48);
                } else {
                    av8Var4.W();
                }
                break;
        }
        return Unit.a;
    }
}
