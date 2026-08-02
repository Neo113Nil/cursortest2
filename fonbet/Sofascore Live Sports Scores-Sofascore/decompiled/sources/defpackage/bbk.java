package defpackage;

import com.unity3d.ads.IUnityAdsTokenListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class bbk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ IUnityAdsTokenListener b;

    public /* synthetic */ bbk(IUnityAdsTokenListener iUnityAdsTokenListener, int i) {
        this.a = i;
        this.b = iUnityAdsTokenListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        IUnityAdsTokenListener iUnityAdsTokenListener = this.b;
        switch (i) {
            case 0:
                iUnityAdsTokenListener.onUnityAdsTokenReady(null);
                break;
            default:
                iUnityAdsTokenListener.onUnityAdsTokenReady(null);
                break;
        }
    }
}
