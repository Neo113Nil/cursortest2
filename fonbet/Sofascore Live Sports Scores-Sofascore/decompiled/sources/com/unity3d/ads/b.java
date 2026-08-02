package com.unity3d.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LoadListener b;
    public final /* synthetic */ Throwable c;

    public /* synthetic */ b(LoadListener loadListener, Throwable th, int i) {
        this.a = i;
        this.b = loadListener;
        this.c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Throwable th = this.c;
        LoadListener loadListener = this.b;
        switch (i) {
            case 0:
                InterstitialAd$Companion$load$1.invokeSuspend$lambda$3$lambda$2(loadListener, th);
                break;
            default:
                RewardedAd$Companion$load$1.invokeSuspend$lambda$3$lambda$2(loadListener, th);
                break;
        }
    }
}
