package ru.ozon.app.android.composer.widgets.async.di;

import Jb.d;
import Jb.j;
import L00.f;
import O00.b;
import Pc.a;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepositoryImpl;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetsAnalyticDelegate;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponent;
import ru.ozon.app.android.metrics.client.di.MetricsClientComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes6.dex */
public final class DaggerComposerWidgetAsyncComponent {

    private static final class ComposerWidgetAsyncComponentImpl implements ComposerWidgetAsyncComponent {
        private final AnalyticsComponentApi analyticsComponentApi;
        private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
        private a<ComposerAsyncWidgetRepository> bindComposerAsyncWidgetRepositoryProvider;
        private a<ComposerAsyncWidgetRepositoryImpl> composerAsyncWidgetRepositoryImplProvider;
        private final ComposerComponentApi composerComponentApi;
        private final ComposerWidgetAsyncComponentImpl composerWidgetAsyncComponentImpl;

        private static final class SwitchingProvider<T> implements a<T> {
            private final ComposerWidgetAsyncComponentImpl composerWidgetAsyncComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92479id;

            SwitchingProvider(ComposerWidgetAsyncComponentImpl composerWidgetAsyncComponentImpl, int i11) {
                this.composerWidgetAsyncComponentImpl = composerWidgetAsyncComponentImpl;
                this.f92479id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92479id != 0) {
                    throw new AssertionError(this.f92479id);
                }
                b composerAsyncWidgetsDecoder = this.composerWidgetAsyncComponentImpl.composerComponentApi.getComposerAsyncWidgetsDecoder();
                j.c(composerAsyncWidgetsDecoder);
                ComposerAsyncWidgetsAnalyticDelegate composerAsyncWidgetsAnalyticDelegate = this.composerWidgetAsyncComponentImpl.composerAsyncWidgetsAnalyticDelegate();
                f composerBaseUrl = this.composerWidgetAsyncComponentImpl.composerComponentApi.getComposerBaseUrl();
                j.c(composerBaseUrl);
                return (T) new ComposerAsyncWidgetRepositoryImpl(composerAsyncWidgetsDecoder, composerAsyncWidgetsAnalyticDelegate, composerBaseUrl);
            }
        }

        /* synthetic */ ComposerWidgetAsyncComponentImpl(NetworkComponentApi networkComponentApi, ComposerComponentApi composerComponentApi, MetricsClientComponentApi metricsClientComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, int i11) {
            this(networkComponentApi, composerComponentApi, metricsClientComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ComposerAsyncWidgetsAnalyticDelegate composerAsyncWidgetsAnalyticDelegate() {
            PerformanceTrackerDelegate performanceTrackerDelegate = this.analyticsComponentApi.getPerformanceTrackerDelegate();
            j.c(performanceTrackerDelegate);
            Sg.a analyticsScreenStorage = this.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
            j.c(analyticsScreenStorage);
            return new ComposerAsyncWidgetsAnalyticDelegate(performanceTrackerDelegate, analyticsScreenStorage);
        }

        private void initialize(NetworkComponentApi networkComponentApi, ComposerComponentApi composerComponentApi, MetricsClientComponentApi metricsClientComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.composerWidgetAsyncComponentImpl, 0);
            this.composerAsyncWidgetRepositoryImplProvider = switchingProvider;
            this.bindComposerAsyncWidgetRepositoryProvider = d.b(switchingProvider);
        }

        @Override // ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi
        public ComposerAsyncWidgetRepository getComposerAsyncWidgetRepository() {
            return this.bindComposerAsyncWidgetRepositoryProvider.get();
        }

        private ComposerWidgetAsyncComponentImpl(NetworkComponentApi networkComponentApi, ComposerComponentApi composerComponentApi, MetricsClientComponentApi metricsClientComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            this.composerWidgetAsyncComponentImpl = this;
            this.composerComponentApi = composerComponentApi;
            this.analyticsComponentApi = analyticsComponentApi;
            this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            initialize(networkComponentApi, composerComponentApi, metricsClientComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi);
        }
    }

    private static final class Factory implements ComposerWidgetAsyncComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponent.Factory
        public ComposerWidgetAsyncComponent create(NetworkComponentApi networkComponentApi, ComposerComponentApi composerComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, MetricsClientComponentApi metricsClientComponentApi) {
            networkComponentApi.getClass();
            composerComponentApi.getClass();
            analyticsComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            metricsClientComponentApi.getClass();
            return new ComposerWidgetAsyncComponentImpl(networkComponentApi, composerComponentApi, metricsClientComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static ComposerWidgetAsyncComponent.Factory factory() {
        return new Factory(0);
    }
}
