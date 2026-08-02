package com.unity3d.ironsourceads.interstitial;

import com.ironsource.A9;
import com.ironsource.Ab;
import com.ironsource.C2475ic;
import com.ironsource.Db;
import com.ironsource.Q7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.Executor;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class InterstitialAdLoader {
    public static final InterstitialAdLoader INSTANCE = new InterstitialAdLoader();
    private static final Executor a = Q7.a.d();

    private InterstitialAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ab loadTask) {
        Intrinsics.checkNotNullParameter(loadTask, "$loadTask");
        loadTask.start();
    }

    @JvmStatic
    public static final void loadAd(InterstitialAdRequest adRequest, InterstitialAdLoaderListener listener) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.API.info("instanceId: " + adRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(a, new A9(adRequest, listener, C2475ic.e.a(IronSource.a.INTERSTITIAL), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(Executor executor, Db loadTaskProvider) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(loadTaskProvider, "loadTaskProvider");
        final Ab a2 = loadTaskProvider.a();
        executor.execute(new Runnable() { // from class: com.unity3d.ironsourceads.interstitial.InterstitialAdLoader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                InterstitialAdLoader.a(Ab.this);
            }
        });
    }
}
