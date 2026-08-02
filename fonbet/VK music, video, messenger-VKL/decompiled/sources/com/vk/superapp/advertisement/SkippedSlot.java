package com.vk.superapp.advertisement;

import com.vk.external.miniapp.net.ad.AdSlotSkipReason;
import com.vk.superapp.advertisement.TimeoutConfig;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdvertisementWaterfallImpl.kt */
/* loaded from: classes6.dex */
public final class SkippedSlot {

    @pmi0("interstitial")
    private TimeoutConfig.a interstitial;

    @pmi0("multi_interstitial")
    private TimeoutConfig.a multiInterstitial;

    @pmi0("reason")
    private AdSlotSkipReason reason;

    @pmi0("rewarded")
    private TimeoutConfig.b rewarded;

    public SkippedSlot() {
        this(null, null, null, null, 15, null);
    }

    public final TimeoutConfig.a a() {
        return this.interstitial;
    }

    public final TimeoutConfig.a b() {
        return this.multiInterstitial;
    }

    public final AdSlotSkipReason c() {
        return this.reason;
    }

    public final TimeoutConfig.b d() {
        return this.rewarded;
    }

    public final void e(TimeoutConfig.a aVar) {
        this.interstitial = aVar;
    }

    public final void f(TimeoutConfig.a aVar) {
        this.multiInterstitial = aVar;
    }

    public final void g(AdSlotSkipReason adSlotSkipReason) {
        this.reason = adSlotSkipReason;
    }

    public final void h(TimeoutConfig.b bVar) {
        this.rewarded = bVar;
    }

    public SkippedSlot(TimeoutConfig.b bVar, TimeoutConfig.a aVar, TimeoutConfig.a aVar2, AdSlotSkipReason adSlotSkipReason) {
        this.rewarded = bVar;
        this.interstitial = aVar;
        this.multiInterstitial = aVar2;
        this.reason = adSlotSkipReason;
    }

    public /* synthetic */ SkippedSlot(TimeoutConfig.b bVar, TimeoutConfig.a aVar, TimeoutConfig.a aVar2, AdSlotSkipReason adSlotSkipReason, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bVar, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : aVar2, (i & 8) != 0 ? AdSlotSkipReason.NETWORK_NO_AD : adSlotSkipReason);
    }
}
