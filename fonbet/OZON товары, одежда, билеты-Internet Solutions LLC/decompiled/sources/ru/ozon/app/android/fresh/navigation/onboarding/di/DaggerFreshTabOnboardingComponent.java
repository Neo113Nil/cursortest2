package ru.ozon.app.android.fresh.navigation.onboarding.di;

import GZ.g;
import Jb.d;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.fresh.navigation.onboarding.FreshTabOnboardingDialog;
import ru.ozon.app.android.fresh.navigation.onboarding.FreshTabOnboardingDialog_MembersInjector;
import ru.ozon.app.android.fresh.navigation.onboarding.FreshTabOnboardingViewModel;
import ru.ozon.app.android.fresh.navigation.onboarding.FreshTabOnboardingViewModelImpl;
import ru.ozon.app.android.fresh.navigation.onboarding.FreshTabOnboardingViewModelImpl_Factory;
import ru.ozon.app.android.fresh.navigation.onboarding.OnBoardingMapper_Factory;
import ru.ozon.app.android.fresh.navigation.onboarding.analytics.FreshTabOnBoardingAnalytics;
import ru.ozon.app.android.fresh.navigation.onboarding.analytics.FreshTabOnBoardingAnalytics_Factory;
import ru.ozon.app.android.fresh.navigation.onboarding.di.FreshTabOnboardingComponent;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;

/* loaded from: classes12.dex */
public final class DaggerFreshTabOnboardingComponent {

    private static final class Factory implements FreshTabOnboardingComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.navigation.onboarding.di.FreshTabOnboardingComponent.Factory
        public FreshTabOnboardingComponent create(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            contextComponentDependencies.getClass();
            navigationComponentApi.getClass();
            analyticsComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            return new FreshTabOnboardingComponentImpl(contextComponentDependencies, navigationComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class FreshTabOnboardingComponentImpl implements FreshTabOnboardingComponent {
        private a<Sg.a> bindAnalyticsScreenStorage$navigation_prodGoogleAllVendorsReleaseProvider;
        private a<FreshTabOnboardingViewModel> bindViewModel$navigation_prodGoogleAllVendorsReleaseProvider;
        private a<FreshTabOnBoardingAnalytics> freshTabOnBoardingAnalyticsProvider;
        private final FreshTabOnboardingComponentImpl freshTabOnboardingComponentImpl;
        private a<FreshTabOnboardingViewModelImpl> freshTabOnboardingViewModelImplProvider;
        private a<AnalyticsDataLayer> getAnalyticsDataLayerProvider;
        private a<Sg.a> getAnalyticsScreenStorageProvider;
        private a<PluginsManager> getPluginsManagerProvider;
        private final NavigationComponentApi navigationComponentApi;

        private static final class GetAnalyticsDataLayerProvider implements a<AnalyticsDataLayer> {
            private final AnalyticsComponentApi analyticsComponentApi;

            GetAnalyticsDataLayerProvider(AnalyticsComponentApi analyticsComponentApi) {
                this.analyticsComponentApi = analyticsComponentApi;
            }

            @Override // Pc.a
            public AnalyticsDataLayer get() {
                AnalyticsDataLayer analyticsDataLayer = this.analyticsComponentApi.getAnalyticsDataLayer();
                j.c(analyticsDataLayer);
                return analyticsDataLayer;
            }
        }

        private static final class GetAnalyticsScreenStorageProvider implements a<Sg.a> {
            private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;

            GetAnalyticsScreenStorageProvider(AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
                this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public Sg.a get() {
                Sg.a analyticsScreenStorage = this.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
                j.c(analyticsScreenStorage);
                return analyticsScreenStorage;
            }
        }

        private static final class GetPluginsManagerProvider implements a<PluginsManager> {
            private final AnalyticsComponentApi analyticsComponentApi;

            GetPluginsManagerProvider(AnalyticsComponentApi analyticsComponentApi) {
                this.analyticsComponentApi = analyticsComponentApi;
            }

            @Override // Pc.a
            public PluginsManager get() {
                PluginsManager pluginsManager = this.analyticsComponentApi.getPluginsManager();
                j.c(pluginsManager);
                return pluginsManager;
            }
        }

        /* synthetic */ FreshTabOnboardingComponentImpl(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, int i11) {
            this(contextComponentDependencies, navigationComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            this.getAnalyticsDataLayerProvider = new GetAnalyticsDataLayerProvider(analyticsComponentApi);
            this.getPluginsManagerProvider = new GetPluginsManagerProvider(analyticsComponentApi);
            GetAnalyticsScreenStorageProvider getAnalyticsScreenStorageProvider = new GetAnalyticsScreenStorageProvider(analyticsScreenStorageComponentApi);
            this.getAnalyticsScreenStorageProvider = getAnalyticsScreenStorageProvider;
            a<Sg.a> b11 = d.b(getAnalyticsScreenStorageProvider);
            this.bindAnalyticsScreenStorage$navigation_prodGoogleAllVendorsReleaseProvider = b11;
            this.freshTabOnBoardingAnalyticsProvider = FreshTabOnBoardingAnalytics_Factory.create(this.getAnalyticsDataLayerProvider, this.getPluginsManagerProvider, b11);
            FreshTabOnboardingViewModelImpl_Factory create = FreshTabOnboardingViewModelImpl_Factory.create(OnBoardingMapper_Factory.create(), this.freshTabOnBoardingAnalyticsProvider);
            this.freshTabOnboardingViewModelImplProvider = create;
            this.bindViewModel$navigation_prodGoogleAllVendorsReleaseProvider = d.b(create);
        }

        private FreshTabOnboardingDialog injectFreshTabOnboardingDialog(FreshTabOnboardingDialog freshTabOnboardingDialog) {
            FreshTabOnboardingDialog_MembersInjector.injectViewmodel(freshTabOnboardingDialog, this.bindViewModel$navigation_prodGoogleAllVendorsReleaseProvider.get());
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            FreshTabOnboardingDialog_MembersInjector.injectOzonRouter(freshTabOnboardingDialog, ozonRouter);
            FreshTabOnboardingDialog_MembersInjector.injectAnalyticsScreenStorage(freshTabOnboardingDialog, this.bindAnalyticsScreenStorage$navigation_prodGoogleAllVendorsReleaseProvider.get());
            return freshTabOnboardingDialog;
        }

        @Override // ru.ozon.app.android.fresh.navigation.onboarding.di.FreshTabOnboardingComponent
        public void inject(FreshTabOnboardingDialog freshTabOnboardingDialog) {
            injectFreshTabOnboardingDialog(freshTabOnboardingDialog);
        }

        private FreshTabOnboardingComponentImpl(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            this.freshTabOnboardingComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
            initialize(contextComponentDependencies, navigationComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi);
        }
    }

    public static FreshTabOnboardingComponent.Factory factory() {
        return new Factory(0);
    }
}
