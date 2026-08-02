package com.moloco.sdk.internal.unity_bridge.internal;

import com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MolocoUnityLoadCallback b;
    public final /* synthetic */ String c;

    public /* synthetic */ b(MolocoUnityLoadCallback molocoUnityLoadCallback, String str, int i) {
        this.a = i;
        this.b = molocoUnityLoadCallback;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        MolocoUnityLoadCallback molocoUnityLoadCallback = this.b;
        switch (i) {
            case 0:
                molocoUnityLoadCallback.onAdLoadSuccess(str);
                break;
            default:
                molocoUnityLoadCallback.onAdLoadSuccess(str);
                break;
        }
    }
}
