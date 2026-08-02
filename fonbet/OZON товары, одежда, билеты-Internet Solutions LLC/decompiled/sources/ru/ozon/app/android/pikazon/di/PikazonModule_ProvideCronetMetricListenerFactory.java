package ru.ozon.app.android.pikazon.di;

import Jb.e;
import Jb.j;
import ei0.InterfaceC6369b;
import qj.C9067a;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.network.cronet.ComposerCronetMetricsListener;
import ru.ozon.app.android.network.cronet.CronetConfig;
import ru.ozon.app.android.pikazon.PikazonEventListenerInterceptor;

/* loaded from: classes7.dex */
public final class PikazonModule_ProvideCronetMetricListenerFactory implements e<ComposerCronetMetricsListener> {
    public static ComposerCronetMetricsListener provideCronetMetricListener(PikazonModule pikazonModule, C9067a c9067a, InterfaceC6369b interfaceC6369b, PerformanceTrackerDelegate performanceTrackerDelegate, PikazonEventListenerInterceptor pikazonEventListenerInterceptor, CronetConfig cronetConfig) {
        ComposerCronetMetricsListener provideCronetMetricListener = pikazonModule.provideCronetMetricListener(c9067a, interfaceC6369b, performanceTrackerDelegate, pikazonEventListenerInterceptor, cronetConfig);
        j.d(provideCronetMetricListener);
        return provideCronetMetricListener;
    }
}
