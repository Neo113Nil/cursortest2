package com.ironsource;

import com.ironsource.adapters.fyber.FyberConstants;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import ru.ok.gl.tf.Tensorflow;
import xsna.zcl;

/* renamed from: com.ironsource.d3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4272d3 implements Eb {
    private final BannerAdRequest a;
    private final BannerAdLoaderListener b;
    private final InterfaceC4324g1 c;
    private final InterfaceC4520r1 d;

    public C4272d3(BannerAdRequest bannerAdRequest, BannerAdLoaderListener bannerAdLoaderListener, InterfaceC4324g1 interfaceC4324g1, InterfaceC4520r1 interfaceC4520r1) {
        this.a = bannerAdRequest;
        this.b = bannerAdLoaderListener;
        this.c = interfaceC4324g1;
        this.d = interfaceC4520r1;
    }

    @Override // com.ironsource.Eb
    public Bb a() throws Exception {
        IronSourceError a;
        InterfaceC4538s1 a2 = this.d.a(new C4431m1(SDKUtils.getSDKVersion(), this.a.getInstanceId(), IronSource.a.BANNER, false, false, false, 56, null));
        try {
            Cb a3 = new Db(this.a.getAdm(), this.a.getProviderName$mediationsdk_release(), this.c, C4388jc.e.a().c().get()).a();
            new C4236b3(a3, this.a.getSize()).a();
            C4603vc c4603vc = new C4603vc();
            C4468o2 c4468o2 = new C4468o2(this.a.getAdm(), this.a.getProviderName$mediationsdk_release());
            BannerAdRequest bannerAdRequest = this.a;
            AdSize size = bannerAdRequest.getSize();
            R7 r7 = R7.a;
            return new C4218a3(bannerAdRequest, size, c4468o2, a3, c4603vc, a2, new C4254c3(r7, this.b), new I2(a2, r7.d()), null, null, Tensorflow.FRAME_HEIGHT, null);
        } catch (Exception e) {
            C4452n4.d().a(e);
            if (e instanceof C4533re) {
                a = ((C4533re) e).a();
            } else {
                C4578u5 c4578u5 = C4578u5.a;
                String message = e.getMessage();
                if (message == null) {
                    message = FyberConstants.Logs.UNKNOWN_ERROR;
                }
                a = c4578u5.a(message);
            }
            return new C4560t5(a, new C4254c3(R7.a, this.b), a2);
        }
    }

    public /* synthetic */ C4272d3(BannerAdRequest bannerAdRequest, BannerAdLoaderListener bannerAdLoaderListener, InterfaceC4324g1 interfaceC4324g1, InterfaceC4520r1 interfaceC4520r1, int i, zcl zclVar) {
        this(bannerAdRequest, bannerAdLoaderListener, interfaceC4324g1, (i & 8) != 0 ? new C4503q1(IronSource.a.BANNER) : interfaceC4520r1);
    }
}
