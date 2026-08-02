package ru.ozon.app.android.composer.di.modules;

import Jb.e;
import Jb.j;
import ei0.InterfaceC6369b;
import qj.C9067a;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.network.cronet.ComposerCronetMetricsListener;
import ru.ozon.app.android.composer.network.prefetch.PrefetchEventInterceptor;
import ru.ozon.app.android.network.cronet.CronetConfig;

/* loaded from: classes6.dex */
public final class ComposerNetworkModule_Companion_ProvideCronetMetricListenerFactory implements e<ComposerCronetMetricsListener> {
    public static ComposerCronetMetricsListener provideCronetMetricListener(C9067a c9067a, InterfaceC6369b interfaceC6369b, PerformanceTrackerDelegate performanceTrackerDelegate, PrefetchEventInterceptor prefetchEventInterceptor, CronetConfig cronetConfig) {
        ComposerCronetMetricsListener provideCronetMetricListener = ComposerNetworkModule.INSTANCE.provideCronetMetricListener(c9067a, interfaceC6369b, performanceTrackerDelegate, prefetchEventInterceptor, cronetConfig);
        j.d(provideCronetMetricListener);
        return provideCronetMetricListener;
    }
}
