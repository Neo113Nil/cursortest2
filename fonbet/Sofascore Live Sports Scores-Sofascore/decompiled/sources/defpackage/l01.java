package defpackage;

import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.base.BaseActivity;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class l01 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseActivity b;

    public /* synthetic */ l01(BaseActivity baseActivity, int i) {
        this.a = i;
        this.b = baseActivity;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        AdBannerView adBannerView;
        int i = this.a;
        BaseActivity baseActivity = this.b;
        switch (i) {
            case 0:
                j52 j52Var = (j52) obj;
                if (j52Var == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.LoginAgain");
                    break;
                } else {
                    vha.L(baseActivity);
                    break;
                }
            case 1:
                j52 j52Var2 = (j52) obj;
                if (j52Var2 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshAds");
                    break;
                } else {
                    KProperty[] kPropertyArr = BaseActivity.H;
                    if (baseActivity.D && (adBannerView = baseActivity.E) != null) {
                        baseActivity.I(adBannerView, baseActivity.F);
                    }
                    break;
                }
            case 2:
                j52 j52Var3 = (j52) obj;
                if (j52Var3 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.CountryChanged");
                    break;
                } else {
                    baseActivity.z().b(baseActivity, true);
                    break;
                }
            default:
                j52 j52Var4 = (j52) obj;
                if (j52Var4 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.WeeklyChallenge");
                    break;
                } else {
                    baseActivity.z().a(new i1f(((i52) j52Var4).a));
                    break;
                }
        }
        return null;
    }
}
