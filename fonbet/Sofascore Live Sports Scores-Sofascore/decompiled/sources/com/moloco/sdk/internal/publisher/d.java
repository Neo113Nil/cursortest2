package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d implements InterstitialAdShowListener, AdShowListener {
    public final /* synthetic */ com.facebook.c0 a;

    public d(InterstitialAdShowListener interstitialAdShowListener) {
        this.a = new com.facebook.c0(interstitialAdShowListener, 7);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdClicked(MolocoAd molocoAd) {
        molocoAd.getClass();
        this.a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdHidden(MolocoAd molocoAd) {
        molocoAd.getClass();
        this.a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowFailed(MolocoAdError molocoAdError) {
        molocoAdError.getClass();
        this.a.onAdShowFailed(molocoAdError);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowSuccess(MolocoAd molocoAd) {
        molocoAd.getClass();
        this.a.onAdShowSuccess(molocoAd);
    }
}
