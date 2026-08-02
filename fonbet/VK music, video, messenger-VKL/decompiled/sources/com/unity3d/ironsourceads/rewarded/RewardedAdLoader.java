package com.unity3d.ironsourceads.rewarded;

import com.ironsource.Bb;
import com.ironsource.C4247be;
import com.ironsource.C4388jc;
import com.ironsource.Eb;
import com.ironsource.R7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.Executor;
import xsna.iox;

/* loaded from: classes14.dex */
public final class RewardedAdLoader {
    public static final RewardedAdLoader INSTANCE = new RewardedAdLoader();
    private static final Executor a = R7.a.d();

    private RewardedAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Bb bb) {
        bb.start();
    }

    public static final void loadAd(RewardedAdRequest rewardedAdRequest, RewardedAdLoaderListener rewardedAdLoaderListener) {
        IronLog.API.info("instanceId: " + rewardedAdRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(a, new C4247be(rewardedAdRequest, rewardedAdLoaderListener, C4388jc.e.a(IronSource.a.REWARDED_VIDEO), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(Executor executor, Eb eb) {
        executor.execute(new iox(eb.a(), 1));
    }
}
