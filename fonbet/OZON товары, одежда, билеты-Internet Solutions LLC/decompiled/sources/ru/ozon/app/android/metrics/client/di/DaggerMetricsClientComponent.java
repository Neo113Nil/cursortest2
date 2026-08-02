package ru.ozon.app.android.metrics.client.di;

import Jb.d;
import Jb.j;
import Pc.a;
import We.E;
import android.app.Application;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.metrics.client.MetricsClient;
import ru.ozon.app.android.metrics.client.MetricsClientImpl;
import ru.ozon.app.android.metrics.client.di.MetricsClientComponent;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.gnc.GncOkHttpClientBuilder;

/* loaded from: classes6.dex */
public final class DaggerMetricsClientComponent {

    private static final class Factory implements MetricsClientComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.metrics.client.di.MetricsClientComponent.Factory
        public MetricsClientComponent create(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            contextComponentDependencies.getClass();
            networkComponentApi.getClass();
            analyticsComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            return new MetricsClientComponentImpl(0, analyticsComponentApi, analyticsScreenStorageComponentApi, contextComponentDependencies, networkComponentApi);
        }

        private Factory() {
        }
    }

    private static final class MetricsClientComponentImpl implements MetricsClientComponent {
        private final AnalyticsComponentApi analyticsComponentApi;
        private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
        private a<MetricsClient> bindMetricsClientProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private final MetricsClientComponentImpl metricsClientComponentImpl;
        private a<MetricsClientImpl> metricsClientImplProvider;
        private final NetworkComponentApi networkComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92908id;
            private final MetricsClientComponentImpl metricsClientComponentImpl;

            SwitchingProvider(MetricsClientComponentImpl metricsClientComponentImpl, int i11) {
                this.metricsClientComponentImpl = metricsClientComponentImpl;
                this.f92908id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92908id != 0) {
                    throw new AssertionError(this.f92908id);
                }
                E okHttpClient = this.metricsClientComponentImpl.networkComponentApi.getOkHttpClient();
                j.c(okHttpClient);
                GncOkHttpClientBuilder gncOkHttpClientBuilder = this.metricsClientComponentImpl.networkComponentApi.getGncOkHttpClientBuilder();
                j.c(gncOkHttpClientBuilder);
                FeatureChecker featureChecker = this.metricsClientComponentImpl.networkComponentApi.getFeatureChecker();
                j.c(featureChecker);
                Application application = this.metricsClientComponentImpl.contextComponentDependencies.getApplication();
                j.c(application);
                PerformanceTrackerDelegate performanceTrackerDelegate = this.metricsClientComponentImpl.analyticsComponentApi.getPerformanceTrackerDelegate();
                j.c(performanceTrackerDelegate);
                NetworkComponentConfig networkComponentConfig = this.metricsClientComponentImpl.networkComponentApi.getNetworkComponentConfig();
                j.c(networkComponentConfig);
                Sg.a analyticsScreenStorage = this.metricsClientComponentImpl.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
                j.c(analyticsScreenStorage);
                return (T) new MetricsClientImpl(okHttpClient, gncOkHttpClientBuilder, featureChecker, application, performanceTrackerDelegate, networkComponentConfig, analyticsScreenStorage);
            }
        }

        /* synthetic */ MetricsClientComponentImpl(int i11, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi) {
            this(contextComponentDependencies, networkComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.metricsClientComponentImpl, 0);
            this.metricsClientImplProvider = switchingProvider;
            this.bindMetricsClientProvider = d.b(switchingProvider);
        }

        @Override // ru.ozon.app.android.metrics.client.di.MetricsClientComponentApi
        public MetricsClient getMetricsClient() {
            return this.bindMetricsClientProvider.get();
        }

        private MetricsClientComponentImpl(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            this.metricsClientComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            this.contextComponentDependencies = contextComponentDependencies;
            this.analyticsComponentApi = analyticsComponentApi;
            this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            initialize(contextComponentDependencies, networkComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi);
        }
    }

    public static MetricsClientComponent.Factory factory() {
        return new Factory(0);
    }
}
