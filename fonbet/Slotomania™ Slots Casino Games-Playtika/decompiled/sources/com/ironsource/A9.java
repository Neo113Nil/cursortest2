package com.ironsource;

import com.google.android.exoplayer2.RendererCapabilities;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class A9 implements Db {
    private final InterstitialAdRequest a;
    private final InterstitialAdLoaderListener b;
    private final InterfaceC2428g1 c;
    private final InterfaceC2624r1 d;

    public A9(InterstitialAdRequest adRequest, InterstitialAdLoaderListener publisherListener, InterfaceC2428g1 adapterConfigProvider, InterfaceC2624r1 analyticsFactory) {
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
        IronSourceError b;
        String instanceId = this.a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.INTERSTITIAL;
        Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        InterfaceC2642s1 a = this.d.a(new C2535m1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            Bb a2 = new Cb(this.a.getAdm(), this.a.getProviderName$mediationsdk_release(), this.c, C2475ic.e.a().c().get()).a();
            new C2758y9(a2).a();
            C2689uc c2689uc = new C2689uc();
            C2572o2 c2572o2 = new C2572o2(this.a.getAdm(), this.a.getProviderName$mediationsdk_release());
            InterstitialAdRequest interstitialAdRequest = this.a;
            Intrinsics.checkNotNull(a2);
            Q7 q7 = Q7.a;
            return new C2740x9(interstitialAdRequest, a2, new C2776z9(q7, this.b), c2572o2, c2689uc, a, new C2668t9(a, q7.d()), null, null, RendererCapabilities.MODE_SUPPORT_MASK, null);
        } catch (Exception e) {
            C2556n4.d().a(e);
            if (e instanceof C2637re) {
                b = ((C2637re) e).a();
            } else {
                C2682u5 c2682u5 = C2682u5.a;
                String message = e.getMessage();
                if (message == null) {
                    message = "unknown error";
                }
                b = c2682u5.b(message);
            }
            return new C2700v5(this.a, new C2776z9(Q7.a, this.b), a, b);
        }
    }

    public /* synthetic */ A9(InterstitialAdRequest interstitialAdRequest, InterstitialAdLoaderListener interstitialAdLoaderListener, InterfaceC2428g1 interfaceC2428g1, InterfaceC2624r1 interfaceC2624r1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interstitialAdRequest, interstitialAdLoaderListener, interfaceC2428g1, (i & 8) != 0 ? new C2607q1(IronSource.a.INTERSTITIAL) : interfaceC2624r1);
    }
}
