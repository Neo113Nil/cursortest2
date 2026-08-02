package com.unity3d.ironsourceads.interstitial;

import com.ironsource.B9;
import com.ironsource.Bb;
import com.ironsource.C4388jc;
import com.ironsource.Eb;
import com.ironsource.R7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.Executor;
import xsna.iox;

/* loaded from: classes14.dex */
public final class InterstitialAdLoader {
    public static final InterstitialAdLoader INSTANCE = new InterstitialAdLoader();
    private static final Executor a = R7.a.d();

    private InterstitialAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Bb bb) {
        bb.start();
    }

    public static final void loadAd(InterstitialAdRequest interstitialAdRequest, InterstitialAdLoaderListener interstitialAdLoaderListener) {
        IronLog.API.info("instanceId: " + interstitialAdRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(a, new B9(interstitialAdRequest, interstitialAdLoaderListener, C4388jc.e.a(IronSource.a.INTERSTITIAL), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(Executor executor, Eb eb) {
        executor.execute(new iox(eb.a(), 0));
    }
}
