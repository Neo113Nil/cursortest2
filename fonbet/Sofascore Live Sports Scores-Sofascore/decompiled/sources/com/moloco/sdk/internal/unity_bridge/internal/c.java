package com.moloco.sdk.internal.unity_bridge.internal;

import android.os.Handler;
import com.appsflyer.internal.p;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import defpackage.wh3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c implements AdLoad.Listener {
    public final /* synthetic */ f a;
    public final /* synthetic */ String b;
    public final /* synthetic */ InterstitialAd c;
    public final /* synthetic */ Handler d;
    public final /* synthetic */ MolocoUnityLoadCallback e;

    public c(f fVar, String str, InterstitialAd interstitialAd, Handler handler, MolocoUnityLoadCallback molocoUnityLoadCallback) {
        this.a = fVar;
        this.b = str;
        this.c = interstitialAd;
        this.d = handler;
        this.e = molocoUnityLoadCallback;
    }

    @Override // com.moloco.sdk.publisher.AdLoad.Listener
    public final void onAdLoadFailed(MolocoAdError molocoAdError) {
        molocoAdError.getClass();
        this.d.post(new p(6, this.e, this.b, molocoAdError));
    }

    @Override // com.moloco.sdk.publisher.AdLoad.Listener
    public final void onAdLoadSuccess(MolocoAd molocoAd) {
        molocoAd.getClass();
        wh3 wh3Var = this.a.a;
        InterstitialAd interstitialAd = this.c;
        String str = this.b;
        wh3Var.put(str, interstitialAd);
        this.d.post(new b(this.e, str, 1));
    }
}
