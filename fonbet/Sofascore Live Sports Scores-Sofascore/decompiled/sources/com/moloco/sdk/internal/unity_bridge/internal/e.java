package com.moloco.sdk.internal.unity_bridge.internal;

import android.os.Handler;
import com.facebook.v;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e implements InterstitialAdShowListener {
    public final /* synthetic */ Handler a;
    public final /* synthetic */ MolocoUnityShowCallback b;

    public e(Handler handler, MolocoUnityShowCallback molocoUnityShowCallback) {
        this.a = handler;
        this.b = molocoUnityShowCallback;
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdClicked(MolocoAd molocoAd) {
        molocoAd.getClass();
        this.a.post(new d(this.b, molocoAd, 1));
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdHidden(MolocoAd molocoAd) {
        molocoAd.getClass();
        this.a.post(new d(this.b, molocoAd, 0));
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowFailed(MolocoAdError molocoAdError) {
        molocoAdError.getClass();
        this.a.post(new v(7, this.b, molocoAdError));
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowSuccess(MolocoAd molocoAd) {
        molocoAd.getClass();
        this.a.post(new d(this.b, molocoAd, 2));
    }
}
