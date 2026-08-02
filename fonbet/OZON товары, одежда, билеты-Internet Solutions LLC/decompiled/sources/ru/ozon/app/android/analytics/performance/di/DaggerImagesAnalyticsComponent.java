package ru.ozon.app.android.analytics.performance.di;

import Eg0.b;
import Gg0.c;
import Gg0.f;
import Jb.d;
import Jb.j;
import Pc.a;
import ei0.InterfaceC6369b;
import qj.C9067a;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.analytics.performance.WidgetsNamesProvider;
import ru.ozon.app.android.analytics.performance.di.ImagesAnalyticsComponent;
import ru.ozon.app.android.analytics.performance.di.module.ImagesAnalyticsModule_ProvideOzonLoggerErrorsLoggerFactory;
import ru.ozon.app.android.analytics.performance.di.module.ImagesAnalyticsModule_ProvideOzonTrackerErrorsLoggerFactory;
import ru.ozon.app.android.analytics.performance.di.module.ImagesAnalyticsModule_ProvidePikazonPerformanceAvailabilityCheckerFactory;
import ru.ozon.app.android.analytics.performance.di.module.ImagesAnalyticsModule_ProvidePlaceholderTimeHandlerFactory;
import ru.ozon.app.android.analytics.performance.di.module.ImagesAnalyticsModule_ProvideWidgetsNamesHolderFactory;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker;

/* loaded from: classes6.dex */
public final class DaggerImagesAnalyticsComponent {

    private static final class Factory implements ImagesAnalyticsComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.analytics.performance.di.ImagesAnalyticsComponent.Factory
        public ImagesAnalyticsComponent create(AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, NetworkComponentApi networkComponentApi) {
            analyticsComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            networkComponentApi.getClass();
            return new ImagesAnalyticsComponentImpl(analyticsComponentApi, analyticsScreenStorageComponentApi, networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class ImagesAnalyticsComponentImpl implements ImagesAnalyticsComponent {
        private final AnalyticsComponentApi analyticsComponentApi;
        private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
        private final ImagesAnalyticsComponentImpl imagesAnalyticsComponentImpl;
        private final NetworkComponentApi networkComponentApi;
        private a<b> provideOzonLoggerErrorsLoggerProvider;
        private a<Fg0.a> provideOzonTrackerErrorsLoggerProvider;
        private a<PikazonPerformanceAvailabilityChecker> providePikazonPerformanceAvailabilityCheckerProvider;
        private a<f> providePlaceholderTimeHandlerProvider;
        private a<c> provideWidgetsNamesHolderProvider;
        private a<WidgetsNamesProvider> widgetsNamesProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92161id;
            private final ImagesAnalyticsComponentImpl imagesAnalyticsComponentImpl;

            SwitchingProvider(ImagesAnalyticsComponentImpl imagesAnalyticsComponentImpl, int i11) {
                this.imagesAnalyticsComponentImpl = imagesAnalyticsComponentImpl;
                this.f92161id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92161id;
                if (i11 == 0) {
                    PikazonPerformanceAvailabilityChecker pikazonPerformanceAvailabilityChecker = (PikazonPerformanceAvailabilityChecker) this.imagesAnalyticsComponentImpl.providePikazonPerformanceAvailabilityCheckerProvider.get();
                    PerformanceTrackerDelegate performanceTrackerDelegate = this.imagesAnalyticsComponentImpl.analyticsComponentApi.getPerformanceTrackerDelegate();
                    j.c(performanceTrackerDelegate);
                    c cVar = (c) this.imagesAnalyticsComponentImpl.provideWidgetsNamesHolderProvider.get();
                    Fg0.a aVar = (Fg0.a) this.imagesAnalyticsComponentImpl.provideOzonTrackerErrorsLoggerProvider.get();
                    Sg.a applicationAnalyticsScreenStorage = this.imagesAnalyticsComponentImpl.analyticsScreenStorageComponentApi.getApplicationAnalyticsScreenStorage();
                    j.c(applicationAnalyticsScreenStorage);
                    C9067a networkInfoProvider = this.imagesAnalyticsComponentImpl.networkComponentApi.getNetworkInfoProvider();
                    j.c(networkInfoProvider);
                    return (T) ImagesAnalyticsModule_ProvidePlaceholderTimeHandlerFactory.providePlaceholderTimeHandler(pikazonPerformanceAvailabilityChecker, performanceTrackerDelegate, cVar, aVar, applicationAnalyticsScreenStorage, networkInfoProvider);
                }
                if (i11 == 1) {
                    PerformanceTrackerDelegate performanceTrackerDelegate2 = this.imagesAnalyticsComponentImpl.analyticsComponentApi.getPerformanceTrackerDelegate();
                    j.c(performanceTrackerDelegate2);
                    FeatureChecker featureChecker = this.imagesAnalyticsComponentImpl.networkComponentApi.getFeatureChecker();
                    j.c(featureChecker);
                    Sg.a applicationAnalyticsScreenStorage2 = this.imagesAnalyticsComponentImpl.analyticsScreenStorageComponentApi.getApplicationAnalyticsScreenStorage();
                    j.c(applicationAnalyticsScreenStorage2);
                    return (T) ImagesAnalyticsModule_ProvidePikazonPerformanceAvailabilityCheckerFactory.providePikazonPerformanceAvailabilityChecker(performanceTrackerDelegate2, featureChecker, applicationAnalyticsScreenStorage2);
                }
                if (i11 == 2) {
                    return (T) ImagesAnalyticsModule_ProvideWidgetsNamesHolderFactory.provideWidgetsNamesHolder();
                }
                if (i11 == 3) {
                    InterfaceC6369b ozonTracker = this.imagesAnalyticsComponentImpl.analyticsComponentApi.getOzonTracker();
                    j.c(ozonTracker);
                    return (T) ImagesAnalyticsModule_ProvideOzonTrackerErrorsLoggerFactory.provideOzonTrackerErrorsLogger(ozonTracker);
                }
                if (i11 == 4) {
                    return (T) ImagesAnalyticsModule_ProvideOzonLoggerErrorsLoggerFactory.provideOzonLoggerErrorsLogger((WidgetsNamesProvider) this.imagesAnalyticsComponentImpl.widgetsNamesProvider.get());
                }
                if (i11 == 5) {
                    return (T) new WidgetsNamesProvider((c) this.imagesAnalyticsComponentImpl.provideWidgetsNamesHolderProvider.get());
                }
                throw new AssertionError(this.f92161id);
            }
        }

        /* synthetic */ ImagesAnalyticsComponentImpl(AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, NetworkComponentApi networkComponentApi, int i11) {
            this(analyticsComponentApi, analyticsScreenStorageComponentApi, networkComponentApi);
        }

        private void initialize(AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, NetworkComponentApi networkComponentApi) {
            this.providePikazonPerformanceAvailabilityCheckerProvider = d.b(new SwitchingProvider(this.imagesAnalyticsComponentImpl, 1));
            this.provideWidgetsNamesHolderProvider = d.b(new SwitchingProvider(this.imagesAnalyticsComponentImpl, 2));
            this.provideOzonTrackerErrorsLoggerProvider = d.b(new SwitchingProvider(this.imagesAnalyticsComponentImpl, 3));
            this.providePlaceholderTimeHandlerProvider = d.b(new SwitchingProvider(this.imagesAnalyticsComponentImpl, 0));
            this.widgetsNamesProvider = d.b(new SwitchingProvider(this.imagesAnalyticsComponentImpl, 5));
            this.provideOzonLoggerErrorsLoggerProvider = d.b(new SwitchingProvider(this.imagesAnalyticsComponentImpl, 4));
        }

        @Override // ru.ozon.app.android.video.di.ImagesAnalyticsComponentApi
        public b getOzonLoggerErrorsLogger() {
            return this.provideOzonLoggerErrorsLoggerProvider.get();
        }

        @Override // ru.ozon.app.android.video.di.ImagesAnalyticsComponentApi
        public Fg0.a getOzonTrackerErrorsLogger() {
            return this.provideOzonTrackerErrorsLoggerProvider.get();
        }

        @Override // ru.ozon.app.android.video.di.ImagesAnalyticsComponentApi
        public PikazonPerformanceAvailabilityChecker getPikazonPerformanceAvailabilityChecker() {
            return this.providePikazonPerformanceAvailabilityCheckerProvider.get();
        }

        @Override // ru.ozon.app.android.video.di.ImagesAnalyticsComponentApi
        public f getPlaceholderTimeHandler() {
            return this.providePlaceholderTimeHandlerProvider.get();
        }

        private ImagesAnalyticsComponentImpl(AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, NetworkComponentApi networkComponentApi) {
            this.imagesAnalyticsComponentImpl = this;
            this.analyticsComponentApi = analyticsComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            initialize(analyticsComponentApi, analyticsScreenStorageComponentApi, networkComponentApi);
        }
    }

    public static ImagesAnalyticsComponent.Factory factory() {
        return new Factory(0);
    }
}
