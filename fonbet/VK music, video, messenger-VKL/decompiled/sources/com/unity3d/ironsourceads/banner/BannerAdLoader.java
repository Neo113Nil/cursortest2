package com.unity3d.ironsourceads.banner;

import com.ironsource.Bb;
import com.ironsource.C4272d3;
import com.ironsource.C4388jc;
import com.ironsource.Eb;
import com.ironsource.R7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.Executor;
import xsna.gs2;

/* loaded from: classes14.dex */
public final class BannerAdLoader {
    public static final BannerAdLoader INSTANCE = new BannerAdLoader();
    private static final Executor a = R7.a.d();

    private BannerAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Bb bb) {
        bb.start();
    }

    public static final void loadAd(BannerAdRequest bannerAdRequest, BannerAdLoaderListener bannerAdLoaderListener) {
        IronLog.API.info("instanceId: " + bannerAdRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(a, new C4272d3(bannerAdRequest, bannerAdLoaderListener, C4388jc.e.a(IronSource.a.BANNER), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(Executor executor, Eb eb) {
        executor.execute(new gs2(eb.a(), 1));
    }
}
