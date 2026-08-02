package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g implements RewardedInterstitialAdShowListener {
    public final h a;
    public final boolean b;
    public final e c;
    public final String d;
    public final boolean e;
    public final e f;
    public final com.moloco.sdk.acm.recorder.c g;
    public boolean h;

    public g(h hVar, boolean z, e eVar, String str, boolean z2, e eVar2, com.moloco.sdk.acm.recorder.c cVar) {
        str.getClass();
        this.a = hVar;
        this.b = z;
        this.c = eVar;
        this.d = str;
        this.e = z2;
        this.f = eVar2;
        this.g = cVar;
    }

    public final void a(MolocoAd molocoAd) {
        String name;
        if (this.h) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "RewardedInterstitialAdShowListenerImpl", "issuing of reward is already handled", false, 4, null);
            return;
        }
        this.h = true;
        if (!Intrinsics.c(this.c.invoke(), Boolean.FALSE)) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "RewardedInterstitialAdShowListenerImpl", "reward can't be issued: ad was forcibly closed or ad was missing", false, 4, null);
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m mVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m) this.f.invoke();
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "RewardedInterstitialAdShowListenerImpl", "issuing of reward... creativeType: " + mVar, false, 4, null);
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("reward_issued");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
        String lowerCase = (mVar == null || (name = mVar.name()) == null) ? "UNKNOWN".toLowerCase(Locale.ROOT) : name.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        dVar.a("creative_type", lowerCase);
        this.g.a(dVar);
        onUserRewarded(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdClicked(MolocoAd molocoAd) {
        molocoAd.getClass();
        this.a.a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdHidden(MolocoAd molocoAd) {
        molocoAd.getClass();
        a(molocoAd);
        this.a.a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowFailed(MolocoAdError molocoAdError) {
        molocoAdError.getClass();
        this.a.onAdShowFailed(molocoAdError);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowSuccess(MolocoAd molocoAd) {
        molocoAd.getClass();
        h hVar = this.a;
        hVar.a.onAdShowSuccess(molocoAd);
        if (this.b) {
            hVar.onRewardedVideoStarted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public final void onRewardedVideoCompleted(MolocoAd molocoAd) {
        molocoAd.getClass();
        a(molocoAd);
        this.a.onRewardedVideoCompleted(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public final void onRewardedVideoStarted(MolocoAd molocoAd) {
        molocoAd.getClass();
        this.a.onRewardedVideoStarted(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public final void onUserRewarded(MolocoAd molocoAd) {
        molocoAd.getClass();
        this.a.onUserRewarded(molocoAd);
    }
}
