package defpackage;

import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class cbk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ IUnityAdsInitializationListener b;
    public final /* synthetic */ Throwable c;

    public /* synthetic */ cbk(IUnityAdsInitializationListener iUnityAdsInitializationListener, Throwable th, int i) {
        this.a = i;
        this.b = iUnityAdsInitializationListener;
        this.c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Throwable th = this.c;
        IUnityAdsInitializationListener iUnityAdsInitializationListener = this.b;
        switch (i) {
            case 0:
                UnityAds.initialize$lambda$9$lambda$8$lambda$7(iUnityAdsInitializationListener, th);
                break;
            default:
                UnityAds.initialize$lambda$4$lambda$3$lambda$2(iUnityAdsInitializationListener, th);
                break;
        }
    }
}
