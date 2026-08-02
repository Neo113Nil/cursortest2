package com.vungle.ads.internal;

import android.os.Handler;
import com.vungle.ads.VungleError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class h0 implements com.vungle.ads.internal.presenter.b {
    public final /* synthetic */ i0 a;

    public h0(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdClick(String str) {
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new b0(this.a));
        this.a.getDisplayToClickMetric().d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        t1 displayToClickMetric = this.a.getDisplayToClickMetric();
        analyticsClient.a(displayToClickMetric, this.a.getLogEntry(), displayToClickMetric.b);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdEnd(String str) {
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new c0(this.a));
        this.a.getShowToCloseMetric().d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        t1 showToCloseMetric = this.a.getShowToCloseMetric();
        analyticsClient.a(showToCloseMetric, this.a.getLogEntry(), showToCloseMetric.b);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdImpression(String str) {
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new d0(this.a));
        this.a.getPresentToDisplayMetric().d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        t1 presentToDisplayMetric = this.a.getPresentToDisplayMetric();
        analyticsClient.a(presentToDisplayMetric, this.a.getLogEntry(), presentToDisplayMetric.b);
        this.a.getDisplayToClickMetric().e();
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdLeftApplication(String str) {
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new e0(this.a));
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.a.getLeaveApplicationMetric(), this.a.getLogEntry(), 4);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdStart(String str) {
        com.vungle.ads.internal.signals.j signalManager$vungle_ads_release = this.a.getSignalManager$vungle_ads_release();
        synchronized (signalManager$vungle_ads_release) {
            signalManager$vungle_ads_release.h.f++;
        }
        this.a.getAdInternal$vungle_ads_release().l.d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        t1 t1Var = this.a.getAdInternal$vungle_ads_release().l;
        analyticsClient.a(t1Var, this.a.getLogEntry(), t1Var.b);
        this.a.getPresentToDisplayMetric().e();
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new f0(this.a));
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onFailure(VungleError vungleError) {
        vungleError.getClass();
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new g0(this.a, vungleError));
        this.a.getShowToFailMetric().d();
        AnalyticsClient.INSTANCE.a(this.a.getShowToFailMetric(), this.a.getLogEntry(), vungleError.getCode() + '-' + vungleError.getErrorMessage());
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdRewarded(String str) {
    }
}
