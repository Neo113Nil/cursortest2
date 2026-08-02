package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f implements RewardedInterstitialAd, v0, FullscreenAd {
    public final c1 a;
    public final String b;
    public final com.moloco.sdk.internal.services.config.a c;
    public final com.moloco.sdk.acm.recorder.c d;

    public f(c1 c1Var, String str, com.moloco.sdk.internal.services.config.a aVar, com.moloco.sdk.acm.recorder.c cVar) {
        str.getClass();
        this.a = c1Var;
        this.b = str;
        this.c = aVar;
        this.d = cVar;
    }

    @Override // com.moloco.sdk.internal.publisher.v0
    public final void a(long j, long j2) {
        this.a.a(j, j2);
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public final void destroy() {
        this.a.destroy();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final boolean isLoaded() {
        return this.a.p.k;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final void load(String str, AdLoad.Listener listener) {
        str.getClass();
        this.a.load(str, listener);
    }

    @Override // com.moloco.sdk.publisher.FullscreenAd
    public final void show(RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener) {
        h hVar = new h(rewardedInterstitialAdShowListener, new e(this, 0), (com.moloco.sdk.internal.m0) com.moloco.sdk.internal.a.a.getValue());
        boolean containsKey = this.c.b.containsKey("reward_on_skip_visible");
        c1 c1Var = this.a;
        g gVar = new g(hVar, c1Var.c() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m.a, new e(this, 1), this.b, containsKey, new e(this, 2), this.d);
        c1Var.s = new com.appsflyer.f(1, gVar, this);
        c1Var.t = new com.moloco.sdk.acm.services.d(gVar, 4);
        c1Var.show(gVar);
    }
}
