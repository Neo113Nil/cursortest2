package ru.ozon.app.android.storefront.widgets.fashionOnboarding.di;

import GZ.g;
import Jb.d;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.storefront.widgets.fashionOnboarding.FashionTabOnboardingDialog;
import ru.ozon.app.android.storefront.widgets.fashionOnboarding.FashionTabOnboardingDialog_MembersInjector;
import ru.ozon.app.android.storefront.widgets.fashionOnboarding.FashionTabOnboardingViewModel;
import ru.ozon.app.android.storefront.widgets.fashionOnboarding.FashionTabOnboardingViewModelImpl;
import ru.ozon.app.android.storefront.widgets.fashionOnboarding.FashionTabOnboardingViewModelImpl_Factory;
import ru.ozon.app.android.storefront.widgets.fashionOnboarding.OnBoardingMapper_Factory;
import ru.ozon.app.android.storefront.widgets.fashionOnboarding.analytics.FashionTabOnBoardingAnalytics;
import ru.ozon.app.android.storefront.widgets.fashionOnboarding.analytics.FashionTabOnBoardingAnalytics_Factory;
import ru.ozon.app.android.storefront.widgets.fashionOnboarding.di.FashionTabOnboardingComponent;

/* loaded from: classes2.dex */
public final class DaggerFashionTabOnboardingComponent {

    private static final class Factory implements FashionTabOnboardingComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.storefront.widgets.fashionOnboarding.di.FashionTabOnboardingComponent.Factory
        public FashionTabOnboardingComponent create(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            contextComponentDependencies.getClass();
            navigationComponentApi.getClass();
            analyticsComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            return new FashionTabOnboardingComponentImpl(contextComponentDependencies, navigationComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class FashionTabOnboardingComponentImpl implements FashionTabOnboardingComponent {
        private a<Sg.a> bindAnalyticsScreenStorage$storefront_prodGoogleAllVendorsReleaseProvider;
        private a<FashionTabOnboardingViewModel> bindViewModel$storefront_prodGoogleAllVendorsReleaseProvider;
        private a<FashionTabOnBoardingAnalytics> fashionTabOnBoardingAnalyticsProvider;
        private final FashionTabOnboardingComponentImpl fashionTabOnboardingComponentImpl;
        private a<FashionTabOnboardingViewModelImpl> fashionTabOnboardingViewModelImplProvider;
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

        /* synthetic */ FashionTabOnboardingComponentImpl(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, int i11) {
            this(contextComponentDependencies, navigationComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            this.getAnalyticsDataLayerProvider = new GetAnalyticsDataLayerProvider(analyticsComponentApi);
            this.getPluginsManagerProvider = new GetPluginsManagerProvider(analyticsComponentApi);
            GetAnalyticsScreenStorageProvider getAnalyticsScreenStorageProvider = new GetAnalyticsScreenStorageProvider(analyticsScreenStorageComponentApi);
            this.getAnalyticsScreenStorageProvider = getAnalyticsScreenStorageProvider;
            a<Sg.a> b11 = d.b(getAnalyticsScreenStorageProvider);
            this.bindAnalyticsScreenStorage$storefront_prodGoogleAllVendorsReleaseProvider = b11;
            this.fashionTabOnBoardingAnalyticsProvider = FashionTabOnBoardingAnalytics_Factory.create(this.getAnalyticsDataLayerProvider, this.getPluginsManagerProvider, b11);
            FashionTabOnboardingViewModelImpl_Factory create = FashionTabOnboardingViewModelImpl_Factory.create(OnBoardingMapper_Factory.create(), this.fashionTabOnBoardingAnalyticsProvider);
            this.fashionTabOnboardingViewModelImplProvider = create;
            this.bindViewModel$storefront_prodGoogleAllVendorsReleaseProvider = d.b(create);
        }

        private FashionTabOnboardingDialog injectFashionTabOnboardingDialog(FashionTabOnboardingDialog fashionTabOnboardingDialog) {
            FashionTabOnboardingDialog_MembersInjector.injectViewmodel(fashionTabOnboardingDialog, this.bindViewModel$storefront_prodGoogleAllVendorsReleaseProvider.get());
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            FashionTabOnboardingDialog_MembersInjector.injectOzonRouter(fashionTabOnboardingDialog, ozonRouter);
            FashionTabOnboardingDialog_MembersInjector.injectAnalyticsScreenStorage(fashionTabOnboardingDialog, this.bindAnalyticsScreenStorage$storefront_prodGoogleAllVendorsReleaseProvider.get());
            return fashionTabOnboardingDialog;
        }

        @Override // ru.ozon.app.android.storefront.widgets.fashionOnboarding.di.FashionTabOnboardingComponent
        public void inject(FashionTabOnboardingDialog fashionTabOnboardingDialog) {
            injectFashionTabOnboardingDialog(fashionTabOnboardingDialog);
        }

        private FashionTabOnboardingComponentImpl(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            this.fashionTabOnboardingComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
            initialize(contextComponentDependencies, navigationComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi);
        }
    }

    public static FashionTabOnboardingComponent.Factory factory() {
        return new Factory(0);
    }
}
