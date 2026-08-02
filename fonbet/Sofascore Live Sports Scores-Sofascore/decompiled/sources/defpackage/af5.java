package defpackage;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class af5 implements Runnable {
    public final /* synthetic */ AudienceNetworkAds.InitListener a;
    public final /* synthetic */ Throwable b;

    public af5(AudienceNetworkAds.InitListener initListener, Throwable th) {
        this.a = initListener;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudienceNetworkAds.InitResult createErrorInitResult;
        createErrorInitResult = DynamicLoaderFactory.createErrorInitResult(this.b);
        this.a.onInitialized(createErrorInitResult);
    }
}
