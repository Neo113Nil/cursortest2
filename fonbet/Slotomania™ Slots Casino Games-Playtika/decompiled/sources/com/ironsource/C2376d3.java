package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.d3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2376d3 implements Db {
    private final BannerAdRequest a;
    private final BannerAdLoaderListener b;
    private final InterfaceC2428g1 c;
    private final InterfaceC2624r1 d;

    public C2376d3(BannerAdRequest adRequest, BannerAdLoaderListener publisherListener, InterfaceC2428g1 adapterConfigProvider, InterfaceC2624r1 analyticsFactory) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        Intrinsics.checkNotNullParameter(adapterConfigProvider, "adapterConfigProvider");
        Intrinsics.checkNotNullParameter(analyticsFactory, "analyticsFactory");
        this.a = adRequest;
        this.b = publisherListener;
        this.c = adapterConfigProvider;
        this.d = analyticsFactory;
    }

    @Override // com.ironsource.Db
    public Ab a() throws Exception {
        IronSourceError a;
        String instanceId = this.a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.BANNER;
        Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        InterfaceC2642s1 a2 = this.d.a(new C2535m1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            Bb a3 = new Cb(this.a.getAdm(), this.a.getProviderName$mediationsdk_release(), this.c, C2475ic.e.a().c().get()).a();
            new C2340b3(a3, this.a.getSize()).a();
            C2689uc c2689uc = new C2689uc();
            C2572o2 c2572o2 = new C2572o2(this.a.getAdm(), this.a.getProviderName$mediationsdk_release());
            BannerAdRequest bannerAdRequest = this.a;
            AdSize size = bannerAdRequest.getSize();
            Intrinsics.checkNotNull(a3);
            Q7 q7 = Q7.a;
            return new C2322a3(bannerAdRequest, size, c2572o2, a3, c2689uc, a2, new C2358c3(q7, this.b), new I2(a2, q7.d()), null, null, 768, null);
        } catch (Exception e) {
            C2556n4.d().a(e);
            if (e instanceof C2637re) {
                a = ((C2637re) e).a();
            } else {
                C2682u5 c2682u5 = C2682u5.a;
                String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                a = c2682u5.a(message);
            }
            return new C2664t5(a, new C2358c3(Q7.a, this.b), a2);
        }
    }

    public /* synthetic */ C2376d3(BannerAdRequest bannerAdRequest, BannerAdLoaderListener bannerAdLoaderListener, InterfaceC2428g1 interfaceC2428g1, InterfaceC2624r1 interfaceC2624r1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdRequest, bannerAdLoaderListener, interfaceC2428g1, (i & 8) != 0 ? new C2607q1(IronSource.a.BANNER) : interfaceC2624r1);
    }
}
