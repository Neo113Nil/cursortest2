package ru.ozon.app.android.video.di;

import Jb.e;
import Jb.j;
import Ld0.c;
import We.E;
import ei0.InterfaceC6369b;
import qj.C9067a;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.cronet.CronetConfig;
import ru.ozon.app.android.network.cronet.CronetOkHttpClientProvider;
import ru.ozon.app.android.video.player.performance.cronet.VideoCronetMetricListener;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager;

/* loaded from: classes7.dex */
public final class VideoModule_Companion_ProvideOkHttpClientFactory implements e<E> {
    public static E provideOkHttpClient(C9067a c9067a, PerformanceTrackerDelegate performanceTrackerDelegate, FeatureChecker featureChecker, VideoPerfMetricsManager videoPerfMetricsManager, CronetOkHttpClientProvider cronetOkHttpClientProvider, CronetConfig cronetConfig, VideoCronetMetricListener videoCronetMetricListener, InterfaceC6369b interfaceC6369b, c cVar) {
        E provideOkHttpClient = VideoModule.INSTANCE.provideOkHttpClient(c9067a, performanceTrackerDelegate, featureChecker, videoPerfMetricsManager, cronetOkHttpClientProvider, cronetConfig, videoCronetMetricListener, interfaceC6369b, cVar);
        j.d(provideOkHttpClient);
        return provideOkHttpClient;
    }
}
