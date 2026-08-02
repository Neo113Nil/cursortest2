package defpackage;

import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ut8 implements OnFyberMarketplaceInitializedListener {
    public final /* synthetic */ InitializationCompleteCallback a;

    public ut8(InitializationCompleteCallback initializationCompleteCallback) {
        this.a = initializationCompleteCallback;
    }

    @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
    public final void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
        OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus2 = OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY;
        InitializationCompleteCallback initializationCompleteCallback = this.a;
        if (fyberInitStatus == fyberInitStatus2) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        AdError b = qb4.b(fyberInitStatus);
        InneractiveMediationName inneractiveMediationName = FyberMediationAdapter.c;
        b.getMessage();
        initializationCompleteCallback.onInitializationFailed(b.getMessage());
    }
}
