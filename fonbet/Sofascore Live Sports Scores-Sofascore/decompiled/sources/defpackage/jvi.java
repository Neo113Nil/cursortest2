package defpackage;

import android.content.Context;
import com.sofascore.results.R;
import com.sofascore.results.team.details.TeamDetailsFragment;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class jvi implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TeamDetailsFragment b;

    public /* synthetic */ jvi(TeamDetailsFragment teamDetailsFragment, int i) {
        this.a = i;
        this.b = teamDetailsFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        TeamDetailsFragment teamDetailsFragment = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(1 & intValue, (intValue & 3) != 2)) {
                    Context requireContext = teamDetailsFragment.requireContext();
                    requireContext.getClass();
                    x2a.d(hkg.Q(requireContext, R.string.player_profile_age_limit_info, teamDetailsFragment.C().getGender(), new Object[0]), l98.c0(utc.a, 8.0f, 4.0f), null, 0L, 0L, 0L, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 48, 0, 2044);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(1 & intValue2, (intValue2 & 3) != 2)) {
                    haa.f(yqo.H(-312950857, av8Var2, new jvi(teamDetailsFragment, i2)), av8Var2, 6);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
