package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class B9 implements Eb {
    private final InterstitialAdRequest a;
    private final InterstitialAdLoaderListener b;
    private final InterfaceC4324g1 c;
    private final InterfaceC4520r1 d;

    public B9(InterstitialAdRequest interstitialAdRequest, InterstitialAdLoaderListener interstitialAdLoaderListener, InterfaceC4324g1 interfaceC4324g1, InterfaceC4520r1 interfaceC4520r1) {
        this.a = interstitialAdRequest;
        this.b = interstitialAdLoaderListener;
        this.c = interfaceC4324g1;
        this.d = interfaceC4520r1;
    }

    @Override // com.ironsource.Eb
    public Bb a() throws Exception {
        IronSourceError b;
        InterfaceC4538s1 a = this.d.a(new C4431m1(SDKUtils.getSDKVersion(), this.a.getInstanceId(), IronSource.a.INTERSTITIAL, false, false, false, 56, null));
        try {
            Cb a2 = new Db(this.a.getAdm(), this.a.getProviderName$mediationsdk_release(), this.c, C4388jc.e.a().c().get()).a();
            new C4672z9(a2).a();
            C4603vc c4603vc = new C4603vc();
            C4468o2 c4468o2 = new C4468o2(this.a.getAdm(), this.a.getProviderName$mediationsdk_release());
            InterstitialAdRequest interstitialAdRequest = this.a;
            R7 r7 = R7.a;
            return new C4654y9(interstitialAdRequest, a2, new A9(r7, this.b), c4468o2, c4603vc, a, new C4582u9(a, r7.d()), null, null, 384, null);
        } catch (Exception e) {
            C4452n4.d().a(e);
            if (e instanceof C4533re) {
                b = ((C4533re) e).a();
            } else {
                C4578u5 c4578u5 = C4578u5.a;
                String message = e.getMessage();
                if (message == null) {
                    message = "unknown error";
                }
                b = c4578u5.b(message);
            }
            return new C4596v5(this.a, new A9(R7.a, this.b), a, b);
        }
    }

    public /* synthetic */ B9(InterstitialAdRequest interstitialAdRequest, InterstitialAdLoaderListener interstitialAdLoaderListener, InterfaceC4324g1 interfaceC4324g1, InterfaceC4520r1 interfaceC4520r1, int i, zcl zclVar) {
        this(interstitialAdRequest, interstitialAdLoaderListener, interfaceC4324g1, (i & 8) != 0 ? new C4503q1(IronSource.a.INTERSTITIAL) : interfaceC4520r1);
    }
}
