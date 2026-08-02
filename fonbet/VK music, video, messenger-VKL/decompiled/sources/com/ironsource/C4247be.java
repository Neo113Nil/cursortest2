package com.ironsource;

import com.ironsource.adapters.fyber.FyberConstants;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import xsna.zcl;

/* renamed from: com.ironsource.be, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4247be implements Eb {
    private final RewardedAdRequest a;
    private final RewardedAdLoaderListener b;
    private final InterfaceC4324g1 c;
    private final InterfaceC4520r1 d;

    public C4247be(RewardedAdRequest rewardedAdRequest, RewardedAdLoaderListener rewardedAdLoaderListener, InterfaceC4324g1 interfaceC4324g1, InterfaceC4520r1 interfaceC4520r1) {
        this.a = rewardedAdRequest;
        this.b = rewardedAdLoaderListener;
        this.c = interfaceC4324g1;
        this.d = interfaceC4520r1;
    }

    @Override // com.ironsource.Eb
    public Bb a() throws Exception {
        IronSourceError d;
        InterfaceC4538s1 a = this.d.a(new C4431m1(SDKUtils.getSDKVersion(), this.a.getInstanceId(), IronSource.a.REWARDED_VIDEO, false, false, false, 56, null));
        try {
            Cb a2 = new Db(this.a.getAdm(), this.a.getProviderName$mediationsdk_release(), this.c, C4388jc.e.a().c().get()).a();
            new Zd(a2).a();
            C4603vc c4603vc = new C4603vc();
            C4468o2 c4468o2 = new C4468o2(this.a.getAdm(), this.a.getProviderName$mediationsdk_release());
            RewardedAdRequest rewardedAdRequest = this.a;
            R7 r7 = R7.a;
            return new Yd(rewardedAdRequest, a2, new C4229ae(r7, this.b), c4468o2, c4603vc, a, new Td(a, r7.d()), null, null, 384, null);
        } catch (Exception e) {
            C4452n4.d().a(e);
            if (e instanceof C4533re) {
                d = ((C4533re) e).a();
            } else {
                C4578u5 c4578u5 = C4578u5.a;
                String message = e.getMessage();
                if (message == null) {
                    message = FyberConstants.Logs.UNKNOWN_ERROR;
                }
                d = c4578u5.d(message);
            }
            return new C4614w5(this.a, new C4229ae(R7.a, this.b), a, d);
        }
    }

    public /* synthetic */ C4247be(RewardedAdRequest rewardedAdRequest, RewardedAdLoaderListener rewardedAdLoaderListener, InterfaceC4324g1 interfaceC4324g1, InterfaceC4520r1 interfaceC4520r1, int i, zcl zclVar) {
        this(rewardedAdRequest, rewardedAdLoaderListener, interfaceC4324g1, (i & 8) != 0 ? new C4503q1(IronSource.a.REWARDED_VIDEO) : interfaceC4520r1);
    }
}
