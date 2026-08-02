package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.b0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2337b0 implements InterfaceC2319a0 {
    private final InterfaceC2671tc a;

    /* renamed from: com.ironsource.b0$a */
    public static final class a {
        public static final a a = new a();
        public static final int b = 1000;

        private a() {
        }
    }

    public C2337b0(InterfaceC2671tc networkLoadApi) {
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        this.a = networkLoadApi;
    }

    @Override // com.ironsource.InterfaceC2319a0
    public String a() {
        return this.a.a();
    }

    @Override // com.ironsource.InterfaceC2319a0
    public void a(J9 adInstance, Map<String, String> loadParams) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        try {
            this.a.a(adInstance, new C2707vc(null, false, 3, null));
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.ADAPTER_API.verbose("load ad with identifier: " + adInstance.e() + " failed. error: " + e.getMessage());
            String str = "1000: loadAd failed: " + e.getMessage();
            Gc b = adInstance.b();
            if (b instanceof Z5) {
                Gc b2 = adInstance.b();
                Intrinsics.checkNotNull(b2, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.FullScreenAdInstanceListenerWrapper");
                ((Z5) b2).onInterstitialLoadFailed(str);
            } else if (b instanceof Ic) {
                Gc b3 = adInstance.b();
                Intrinsics.checkNotNull(b3, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.OnBannerListenerWrapper");
                ((Ic) b3).onBannerLoadFail(str);
            }
        }
    }
}
