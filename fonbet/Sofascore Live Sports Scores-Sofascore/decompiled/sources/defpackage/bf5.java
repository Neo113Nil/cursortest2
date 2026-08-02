package defpackage;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class bf5 implements AudienceNetworkAds.InitResult {
    public final /* synthetic */ Throwable a;

    public bf5(Throwable th) {
        this.a = th;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public final String getMessage() {
        String createErrorMessage;
        createErrorMessage = DynamicLoaderFactory.createErrorMessage(this.a);
        return createErrorMessage;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public final boolean isSuccess() {
        return false;
    }
}
