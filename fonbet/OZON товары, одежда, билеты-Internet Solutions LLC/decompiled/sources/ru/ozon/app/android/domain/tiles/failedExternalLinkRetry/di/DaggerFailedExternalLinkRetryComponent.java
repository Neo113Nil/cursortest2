package ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.di;

import Jb.d;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.FailedExternalLinkRetryInteractor;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.FailedExternalLinkRetryInteractorImpl;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.analytics.FailedExternalLinkRetryAnalytics;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.di.FailedExternalLinkRetryComponent;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.featureChecker.FailedExternalLinkRetryFeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.failedExternalLink.FailedExternalLinkStorage;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes6.dex */
public final class DaggerFailedExternalLinkRetryComponent {

    private static final class Factory implements FailedExternalLinkRetryComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.di.FailedExternalLinkRetryComponent.Factory
        public FailedExternalLinkRetryComponent create(StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            storageComponentApi.getClass();
            networkComponentApi.getClass();
            analyticsComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            androidPlatformComponentDependencies.getClass();
            return new FailedExternalLinkRetryComponentImpl(storageComponentApi, networkComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, androidPlatformComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class FailedExternalLinkRetryComponentImpl implements FailedExternalLinkRetryComponent {
        private final AnalyticsComponentApi analyticsComponentApi;
        private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
        private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
        private a<FailedExternalLinkRetryInteractor> bindFailedExternalLinkRetryInteractorProvider;
        private final FailedExternalLinkRetryComponentImpl failedExternalLinkRetryComponentImpl;
        private a<FailedExternalLinkRetryInteractorImpl> failedExternalLinkRetryInteractorImplProvider;
        private final NetworkComponentApi networkComponentApi;
        private a<FailedExternalLinkRetryFeatureChecker> provideFailedExternalLinkRetryFeatureCheckerProvider;
        private final StorageComponentApi storageComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {
            private final FailedExternalLinkRetryComponentImpl failedExternalLinkRetryComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92523id;

            SwitchingProvider(FailedExternalLinkRetryComponentImpl failedExternalLinkRetryComponentImpl, int i11) {
                this.failedExternalLinkRetryComponentImpl = failedExternalLinkRetryComponentImpl;
                this.f92523id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92523id;
                if (i11 == 0) {
                    FeatureService featureService = this.failedExternalLinkRetryComponentImpl.networkComponentApi.getFeatureService();
                    j.c(featureService);
                    FailedExternalLinkStorage failedExternalPageStorage = this.failedExternalLinkRetryComponentImpl.storageComponentApi.getFailedExternalPageStorage();
                    j.c(failedExternalPageStorage);
                    return (T) new FailedExternalLinkRetryInteractorImpl(featureService, failedExternalPageStorage);
                }
                if (i11 != 1) {
                    throw new AssertionError(this.f92523id);
                }
                FeatureService featureService2 = this.failedExternalLinkRetryComponentImpl.networkComponentApi.getFeatureService();
                j.c(featureService2);
                AppType appType = this.failedExternalLinkRetryComponentImpl.androidPlatformComponentDependencies.getAppType();
                j.c(appType);
                return (T) FailedExternalLinkRetryModule_Companion_ProvideFailedExternalLinkRetryFeatureCheckerFactory.provideFailedExternalLinkRetryFeatureChecker(featureService2, appType);
            }
        }

        /* synthetic */ FailedExternalLinkRetryComponentImpl(StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, int i11) {
            this(storageComponentApi, networkComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, androidPlatformComponentDependencies);
        }

        private void initialize(StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.failedExternalLinkRetryComponentImpl, 0);
            this.failedExternalLinkRetryInteractorImplProvider = switchingProvider;
            this.bindFailedExternalLinkRetryInteractorProvider = d.b(switchingProvider);
            this.provideFailedExternalLinkRetryFeatureCheckerProvider = d.b(new SwitchingProvider(this.failedExternalLinkRetryComponentImpl, 1));
        }

        @Override // ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.di.FailedExternalLinkRetryComponentApi
        public FailedExternalLinkRetryAnalytics getFailedExternalLinkRetryAnalytics() {
            AnalyticsDataLayer analyticsDataLayer = this.analyticsComponentApi.getAnalyticsDataLayer();
            j.c(analyticsDataLayer);
            PluginsManager pluginsManager = this.analyticsComponentApi.getPluginsManager();
            j.c(pluginsManager);
            Sg.a analyticsScreenStorage = this.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
            j.c(analyticsScreenStorage);
            return new FailedExternalLinkRetryAnalytics(analyticsDataLayer, pluginsManager, analyticsScreenStorage);
        }

        @Override // ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.di.FailedExternalLinkRetryComponentApi
        public FailedExternalLinkRetryFeatureChecker getFailedExternalLinkRetryFeatureChecker() {
            return this.provideFailedExternalLinkRetryFeatureCheckerProvider.get();
        }

        @Override // ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.di.FailedExternalLinkRetryComponentApi
        public FailedExternalLinkRetryInteractor getFailedExternalLinkRetryInteractor() {
            return this.bindFailedExternalLinkRetryInteractorProvider.get();
        }

        private FailedExternalLinkRetryComponentImpl(StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.failedExternalLinkRetryComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            this.storageComponentApi = storageComponentApi;
            this.androidPlatformComponentDependencies = androidPlatformComponentDependencies;
            this.analyticsComponentApi = analyticsComponentApi;
            this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            initialize(storageComponentApi, networkComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, androidPlatformComponentDependencies);
        }
    }

    public static FailedExternalLinkRetryComponent.Factory factory() {
        return new Factory(0);
    }
}
