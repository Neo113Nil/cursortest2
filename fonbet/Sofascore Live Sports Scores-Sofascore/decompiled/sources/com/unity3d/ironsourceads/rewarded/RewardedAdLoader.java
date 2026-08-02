package com.unity3d.ironsourceads.rewarded;

import com.ironsource.C3988ae;
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
public final class RewardedAdLoader {

    @NotNull
    public static final RewardedAdLoader INSTANCE = new RewardedAdLoader();

    @NotNull
    private static final Executor a = O7.a.d();

    private RewardedAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4433zb interfaceC4433zb) {
        interfaceC4433zb.getClass();
        interfaceC4433zb.start();
    }

    public static final void loadAd(@NotNull RewardedAdRequest rewardedAdRequest, @NotNull RewardedAdLoaderListener rewardedAdLoaderListener) {
        rewardedAdRequest.getClass();
        rewardedAdLoaderListener.getClass();
        IronLog.API.info("instanceId: " + rewardedAdRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(a, new C3988ae(rewardedAdRequest, rewardedAdLoaderListener, C4130ic.e.a(IronSource.a.REWARDED_VIDEO), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(@NotNull Executor executor, @NotNull Cb cb) {
        executor.getClass();
        cb.getClass();
        executor.execute(new oz0(cb.a(), 2));
    }
}
