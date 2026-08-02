package defpackage;

import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.services.ads.UnityAdsImplementation;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class wvg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ IUnityAdsInitializationListener b;

    public /* synthetic */ wvg(IUnityAdsInitializationListener iUnityAdsInitializationListener, int i) {
        this.a = i;
        this.b = iUnityAdsInitializationListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        IUnityAdsInitializationListener iUnityAdsInitializationListener = this.b;
        switch (i) {
            case 0:
                iUnityAdsInitializationListener.onInitializationComplete();
                break;
            default:
                UnityAdsImplementation.lambda$initialize$0(iUnityAdsInitializationListener);
                break;
        }
    }
}
