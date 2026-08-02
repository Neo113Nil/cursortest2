package com.moloco.sdk.internal.unity_bridge.internal;

import com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback;
import com.moloco.sdk.publisher.MolocoAd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MolocoUnityShowCallback b;
    public final /* synthetic */ MolocoAd c;

    public /* synthetic */ d(MolocoUnityShowCallback molocoUnityShowCallback, MolocoAd molocoAd, int i) {
        this.a = i;
        this.b = molocoUnityShowCallback;
        this.c = molocoAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MolocoAd molocoAd = this.c;
        MolocoUnityShowCallback molocoUnityShowCallback = this.b;
        switch (i) {
            case 0:
                molocoUnityShowCallback.onAdHidden(molocoAd.getAdUnitId());
                break;
            case 1:
                molocoUnityShowCallback.onAdClicked(molocoAd.getAdUnitId());
                break;
            default:
                molocoUnityShowCallback.onAdShowSuccess(molocoAd.getAdUnitId());
                break;
        }
    }
}
