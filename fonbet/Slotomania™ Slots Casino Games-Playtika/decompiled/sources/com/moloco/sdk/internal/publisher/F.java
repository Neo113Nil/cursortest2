package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class F implements InterstitialAd, s, FullscreenAd<InterstitialAdShowListener> {
    public final v<InterstitialAdShowListener> a;

    /* JADX WARN: Multi-variable type inference failed */
    public F(v<? super InterstitialAdShowListener> fullscreenAd) {
        Intrinsics.checkNotNullParameter(fullscreenAd, "fullscreenAd");
        this.a = fullscreenAd;
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        this.a.destroy();
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public long getCreateAdObjectStartTime() {
        return this.a.getCreateAdObjectStartTime();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.a.isLoaded();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(String bidResponseJson, AdLoad.Listener listener) {
        Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        this.a.load(bidResponseJson, listener);
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public void setCreateAdObjectStartTime(long j) {
        this.a.setCreateAdObjectStartTime(j);
    }

    @Override // com.moloco.sdk.publisher.FullscreenAd
    public void show(InterstitialAdShowListener interstitialAdShowListener) {
        this.a.show(G.a(interstitialAdShowListener));
    }
}
