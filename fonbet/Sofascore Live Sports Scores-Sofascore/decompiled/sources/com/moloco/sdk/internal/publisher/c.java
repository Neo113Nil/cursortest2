package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.InterstitialAdShowListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c implements InterstitialAd, v0, FullscreenAd {
    public final c1 a;

    public c(c1 c1Var) {
        this.a = c1Var;
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
    public final void show(InterstitialAdShowListener interstitialAdShowListener) {
        this.a.show(new d(interstitialAdShowListener));
    }
}
