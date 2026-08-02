package defpackage;

import com.sofascore.model.firebase.AdType;
import com.sofascore.results.main.MainActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kob implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ kob(MainActivity mainActivity, int i) {
        this.a = i;
        this.b = mainActivity;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        MainActivity mainActivity = this.b;
        switch (i) {
            case 0:
                j52 j52Var = (j52) obj;
                if (j52Var == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.ShowInterstitialAd");
                    break;
                } else {
                    boolean z = MainActivity.n0;
                    if (mainActivity.Q().j.getCurrentItem() == 0) {
                        mainActivity.T().f.e(mainActivity, new p15(mainActivity, 2));
                    }
                    break;
                }
            case 1:
                j52 j52Var2 = (j52) obj;
                if (j52Var2 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshAds");
                    break;
                } else {
                    boolean z2 = MainActivity.n0;
                    if (mainActivity.T().f.d() == null) {
                        mainActivity.T().l(mainActivity, AdType.Interstitial.Media);
                    }
                    break;
                }
            default:
                j52 j52Var3 = (j52) obj;
                if (j52Var3 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.CheckInAppMessages");
                    break;
                } else {
                    boolean z3 = MainActivity.n0;
                    mainActivity.e0();
                    break;
                }
        }
        return null;
    }
}
