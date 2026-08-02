package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class A9 implements Cb {

    @NotNull
    private final InterstitialAdRequest a;

    @NotNull
    private final InterstitialAdLoaderListener b;

    @NotNull
    private final InterfaceC4047e1 c;

    @NotNull
    private final InterfaceC4244p1 d;

    public A9(@NotNull InterstitialAdRequest interstitialAdRequest, @NotNull InterstitialAdLoaderListener interstitialAdLoaderListener, @NotNull InterfaceC4047e1 interfaceC4047e1, @NotNull InterfaceC4244p1 interfaceC4244p1) {
        interstitialAdRequest.getClass();
        interstitialAdLoaderListener.getClass();
        interfaceC4047e1.getClass();
        interfaceC4244p1.getClass();
        this.a = interstitialAdRequest;
        this.b = interstitialAdLoaderListener;
        this.c = interfaceC4047e1;
        this.d = interfaceC4244p1;
    }

    @Override // com.ironsource.Cb
    @NotNull
    public InterfaceC4433zb a() throws Exception {
        IronSourceError b;
        String instanceId = this.a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.INTERSTITIAL;
        sDKVersion.getClass();
        InterfaceC4262q1 a = this.d.a(new C4154k1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            Ab a2 = new Bb(this.a.getAdm(), this.a.getProviderName$mediationsdk_release(), this.c, C4130ic.e.a().c().get()).a();
            new C4413y9(a2).a();
            C4344uc c4344uc = new C4344uc();
            C4191m2 c4191m2 = new C4191m2(this.a.getAdm(), this.a.getProviderName$mediationsdk_release());
            InterstitialAdRequest interstitialAdRequest = this.a;
            a2.getClass();
            O7 o7 = O7.a;
            return new C4395x9(interstitialAdRequest, a2, new C4431z9(o7, this.b), c4191m2, c4344uc, a, new C4323t9(a, o7.d()), null, null, 384, null);
        } catch (Exception e) {
            C4157k4.d().a(e);
            if (e instanceof C4257pe) {
                b = ((C4257pe) e).a();
            } else {
                C4301s5 c4301s5 = C4301s5.a;
                String message = e.getMessage();
                if (message == null) {
                    message = "unknown error";
                }
                b = c4301s5.b(message);
            }
            return new C4319t5(this.a, new C4431z9(O7.a, this.b), a, b);
        }
    }

    public /* synthetic */ A9(InterstitialAdRequest interstitialAdRequest, InterstitialAdLoaderListener interstitialAdLoaderListener, InterfaceC4047e1 interfaceC4047e1, InterfaceC4244p1 interfaceC4244p1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interstitialAdRequest, interstitialAdLoaderListener, interfaceC4047e1, (i & 8) != 0 ? new C4226o1(IronSource.a.INTERSTITIAL) : interfaceC4244p1);
    }
}
