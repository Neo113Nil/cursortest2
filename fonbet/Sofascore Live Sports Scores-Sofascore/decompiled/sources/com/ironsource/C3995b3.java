package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.b3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3995b3 implements Cb {

    @NotNull
    private final BannerAdRequest a;

    @NotNull
    private final BannerAdLoaderListener b;

    @NotNull
    private final InterfaceC4047e1 c;

    @NotNull
    private final InterfaceC4244p1 d;

    public C3995b3(@NotNull BannerAdRequest bannerAdRequest, @NotNull BannerAdLoaderListener bannerAdLoaderListener, @NotNull InterfaceC4047e1 interfaceC4047e1, @NotNull InterfaceC4244p1 interfaceC4244p1) {
        bannerAdRequest.getClass();
        bannerAdLoaderListener.getClass();
        interfaceC4047e1.getClass();
        interfaceC4244p1.getClass();
        this.a = bannerAdRequest;
        this.b = bannerAdLoaderListener;
        this.c = interfaceC4047e1;
        this.d = interfaceC4244p1;
    }

    @Override // com.ironsource.Cb
    @NotNull
    public InterfaceC4433zb a() throws Exception {
        IronSourceError a;
        String instanceId = this.a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.BANNER;
        sDKVersion.getClass();
        InterfaceC4262q1 a2 = this.d.a(new C4154k1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            Ab a3 = new Bb(this.a.getAdm(), this.a.getProviderName$mediationsdk_release(), this.c, C4130ic.e.a().c().get()).a();
            new Z2(a3, this.a.getSize()).a();
            C4344uc c4344uc = new C4344uc();
            C4191m2 c4191m2 = new C4191m2(this.a.getAdm(), this.a.getProviderName$mediationsdk_release());
            BannerAdRequest bannerAdRequest = this.a;
            AdSize size = bannerAdRequest.getSize();
            a3.getClass();
            O7 o7 = O7.a;
            return new Y2(bannerAdRequest, size, c4191m2, a3, c4344uc, a2, new C3952a3(o7, this.b), new G2(a2, o7.d()), null, null, 768, null);
        } catch (Exception e) {
            C4157k4.d().a(e);
            if (e instanceof C4257pe) {
                a = ((C4257pe) e).a();
            } else {
                C4301s5 c4301s5 = C4301s5.a;
                String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                a = c4301s5.a(message);
            }
            return new C4283r5(a, new C3952a3(O7.a, this.b), a2);
        }
    }

    public /* synthetic */ C3995b3(BannerAdRequest bannerAdRequest, BannerAdLoaderListener bannerAdLoaderListener, InterfaceC4047e1 interfaceC4047e1, InterfaceC4244p1 interfaceC4244p1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdRequest, bannerAdLoaderListener, interfaceC4047e1, (i & 8) != 0 ? new C4226o1(IronSource.a.BANNER) : interfaceC4244p1);
    }
}
