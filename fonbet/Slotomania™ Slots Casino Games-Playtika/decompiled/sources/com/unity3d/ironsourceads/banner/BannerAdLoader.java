package com.unity3d.ironsourceads.banner;

import com.ironsource.Ab;
import com.ironsource.C2376d3;
import com.ironsource.C2475ic;
import com.ironsource.Db;
import com.ironsource.Q7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.Executor;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class BannerAdLoader {
    public static final BannerAdLoader INSTANCE = new BannerAdLoader();
    private static final Executor a = Q7.a.d();

    private BannerAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ab loadTask) {
        Intrinsics.checkNotNullParameter(loadTask, "$loadTask");
        loadTask.start();
    }

    @JvmStatic
    public static final void loadAd(BannerAdRequest adRequest, BannerAdLoaderListener listener) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.API.info("instanceId: " + adRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(a, new C2376d3(adRequest, listener, C2475ic.e.a(IronSource.a.BANNER), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(Executor executor, Db loadTaskProvider) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(loadTaskProvider, "loadTaskProvider");
        final Ab a2 = loadTaskProvider.a();
        executor.execute(new Runnable() { // from class: com.unity3d.ironsourceads.banner.BannerAdLoader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BannerAdLoader.a(Ab.this);
            }
        });
    }
}
