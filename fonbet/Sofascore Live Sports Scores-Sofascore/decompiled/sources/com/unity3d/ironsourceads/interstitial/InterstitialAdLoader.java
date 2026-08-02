package com.unity3d.ironsourceads.interstitial;

import com.ironsource.A9;
import com.ironsource.C4130ic;
import com.ironsource.Cb;
import com.ironsource.InterfaceC4433zb;
import com.ironsource.O7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.oz0;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class InterstitialAdLoader {

    @NotNull
    public static final InterstitialAdLoader INSTANCE = new InterstitialAdLoader();

    @NotNull
    private static final Executor a = O7.a.d();

    private InterstitialAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4433zb interfaceC4433zb) {
        interfaceC4433zb.getClass();
        interfaceC4433zb.start();
    }

    public static final void loadAd(@NotNull InterstitialAdRequest interstitialAdRequest, @NotNull InterstitialAdLoaderListener interstitialAdLoaderListener) {
        interstitialAdRequest.getClass();
        interstitialAdLoaderListener.getClass();
        IronLog.API.info("instanceId: " + interstitialAdRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(a, new A9(interstitialAdRequest, interstitialAdLoaderListener, C4130ic.e.a(IronSource.a.INTERSTITIAL), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(@NotNull Executor executor, @NotNull Cb cb) {
        executor.getClass();
        cb.getClass();
        executor.execute(new oz0(cb.a(), 1));
    }
}
