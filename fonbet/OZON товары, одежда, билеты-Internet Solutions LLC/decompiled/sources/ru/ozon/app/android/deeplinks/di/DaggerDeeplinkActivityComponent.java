package ru.ozon.app.android.deeplinks.di;

import GZ.g;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.ActivityInitializer;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerConversionStorage;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerResolver;
import ru.ozon.app.android.analytics.startup.AppLaunchAnalytics;
import ru.ozon.app.android.app.launch.handlers.di.AppLaunchHandlersComponentApi;
import ru.ozon.app.android.app.launch.handlers.listeners.AppLaunchListener;
import ru.ozon.app.android.core.navigation.deeplink.storefront.home.HomeDestinationFactoryImpl;
import ru.ozon.app.android.deeplinks.DeeplinkActivity;
import ru.ozon.app.android.deeplinks.DeeplinkActivity_MembersInjector;
import ru.ozon.app.android.deeplinks.DeeplinkViewModel;
import ru.ozon.app.android.deeplinks.KeepActivityHandler;
import ru.ozon.app.android.deeplinks.di.DeeplinkActivityComponent;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.platform.deeplink.ExternalDeeplinkProcessorDelegate;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.user.UserStatusStorage;
import ru.ozon.app.android.storefront.onboardingscreen.di.OnboardingCheckerComponentApi;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractor;
import ru.ozon.app.android.storefront.widgets.appOnboarding.di.AppOnboardingComponentApi;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.ui.TabbarDeeplinksResolver;

/* loaded from: classes11.dex */
public final class DaggerDeeplinkActivityComponent {

    private static final class DeeplinkActivityComponentImpl implements DeeplinkActivityComponent {
        private final AnalyticsComponentApi analyticsComponentApi;
        private final AppLaunchHandlersComponentApi appLaunchHandlersComponentApi;
        private final DeeplinkActivityComponentDependencies deeplinkActivityComponentDependencies;
        private final DeeplinkActivityComponentImpl deeplinkActivityComponentImpl;
        private a<DeeplinkViewModel> deeplinkViewModelProvider;
        private final NavigationComponentApi navigationComponentApi;
        private final OnboardingCheckerComponentApi onboardingCheckerComponentApi;
        private final StorageComponentApi storageComponentApi;
        private final TabsComponentApi tabsComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {
            private final DeeplinkActivityComponentImpl deeplinkActivityComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92499id;

            SwitchingProvider(DeeplinkActivityComponentImpl deeplinkActivityComponentImpl, int i11) {
                this.deeplinkActivityComponentImpl = deeplinkActivityComponentImpl;
                this.f92499id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92499id != 0) {
                    throw new AssertionError(this.f92499id);
                }
                ActivityInitializer activityInitializer = this.deeplinkActivityComponentImpl.deeplinkActivityComponentDependencies.getActivityInitializer();
                j.c(activityInitializer);
                OnboardingInteractor onboardingCheckerInteractor = this.deeplinkActivityComponentImpl.onboardingCheckerComponentApi.getOnboardingCheckerInteractor();
                j.c(onboardingCheckerInteractor);
                return (T) new DeeplinkViewModel(activityInitializer, onboardingCheckerInteractor, this.deeplinkActivityComponentImpl.appsFlyerResolver());
            }
        }

        /* synthetic */ DeeplinkActivityComponentImpl(NavigationComponentApi navigationComponentApi, AnalyticsComponentApi analyticsComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, StorageComponentApi storageComponentApi, AppLaunchHandlersComponentApi appLaunchHandlersComponentApi, DeeplinkActivityComponentDependencies deeplinkActivityComponentDependencies, TabsComponentApi tabsComponentApi, AppOnboardingComponentApi appOnboardingComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, int i11) {
            this(navigationComponentApi, analyticsComponentApi, onboardingCheckerComponentApi, storageComponentApi, appLaunchHandlersComponentApi, deeplinkActivityComponentDependencies, tabsComponentApi, appOnboardingComponentApi, androidPlatformComponentApi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AppsFlyerResolver appsFlyerResolver() {
            AppsFlyerConversionStorage appsFlyerConversionStorage = this.analyticsComponentApi.getAppsFlyerConversionStorage();
            j.c(appsFlyerConversionStorage);
            return new AppsFlyerResolver(appsFlyerConversionStorage);
        }

        private ExternalDeeplinkProcessorDelegate externalDeeplinkProcessorDelegate() {
            AppLaunchAnalytics appLaunchAnalytics = this.analyticsComponentApi.getAppLaunchAnalytics();
            j.c(appLaunchAnalytics);
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new ExternalDeeplinkProcessorDelegate(appLaunchAnalytics, ozonRouter);
        }

        private void initialize(NavigationComponentApi navigationComponentApi, AnalyticsComponentApi analyticsComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, StorageComponentApi storageComponentApi, AppLaunchHandlersComponentApi appLaunchHandlersComponentApi, DeeplinkActivityComponentDependencies deeplinkActivityComponentDependencies, TabsComponentApi tabsComponentApi, AppOnboardingComponentApi appOnboardingComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi) {
            this.deeplinkViewModelProvider = new SwitchingProvider(this.deeplinkActivityComponentImpl, 0);
        }

        private DeeplinkActivity injectDeeplinkActivity(DeeplinkActivity deeplinkActivity) {
            DeeplinkActivity_MembersInjector.injectHomeDestinationFactory(deeplinkActivity, new HomeDestinationFactoryImpl());
            TabbarDeeplinksResolver tabbarDeeplinksResolver = this.tabsComponentApi.getTabbarDeeplinksResolver();
            j.c(tabbarDeeplinksResolver);
            DeeplinkActivity_MembersInjector.injectTabbarDeeplinksResolver(deeplinkActivity, tabbarDeeplinksResolver);
            DeeplinkActivity_MembersInjector.injectViewModelProvider(deeplinkActivity, this.deeplinkViewModelProvider);
            AppLaunchListener appLaunchListener = this.appLaunchHandlersComponentApi.getAppLaunchListener();
            j.c(appLaunchListener);
            DeeplinkActivity_MembersInjector.injectAppLaunchListener(deeplinkActivity, appLaunchListener);
            UserStatusStorage userStatusStorage = this.storageComponentApi.getUserStatusStorage();
            j.c(userStatusStorage);
            DeeplinkActivity_MembersInjector.injectUserStatusStorage(deeplinkActivity, userStatusStorage);
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            DeeplinkActivity_MembersInjector.injectOzonRouter(deeplinkActivity, ozonRouter);
            KeepActivityHandler keepActivityHandler = this.deeplinkActivityComponentDependencies.keepActivityHandler();
            j.c(keepActivityHandler);
            DeeplinkActivity_MembersInjector.injectKeepActivityHandler(deeplinkActivity, keepActivityHandler);
            DeeplinkActivity_MembersInjector.injectExternalDeeplinkProcessorDelegate(deeplinkActivity, externalDeeplinkProcessorDelegate());
            return deeplinkActivity;
        }

        @Override // ru.ozon.app.android.deeplinks.di.DeeplinkActivityComponent
        public void inject(DeeplinkActivity deeplinkActivity) {
            injectDeeplinkActivity(deeplinkActivity);
        }

        private DeeplinkActivityComponentImpl(NavigationComponentApi navigationComponentApi, AnalyticsComponentApi analyticsComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, StorageComponentApi storageComponentApi, AppLaunchHandlersComponentApi appLaunchHandlersComponentApi, DeeplinkActivityComponentDependencies deeplinkActivityComponentDependencies, TabsComponentApi tabsComponentApi, AppOnboardingComponentApi appOnboardingComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi) {
            this.deeplinkActivityComponentImpl = this;
            this.tabsComponentApi = tabsComponentApi;
            this.deeplinkActivityComponentDependencies = deeplinkActivityComponentDependencies;
            this.onboardingCheckerComponentApi = onboardingCheckerComponentApi;
            this.analyticsComponentApi = analyticsComponentApi;
            this.appLaunchHandlersComponentApi = appLaunchHandlersComponentApi;
            this.storageComponentApi = storageComponentApi;
            this.navigationComponentApi = navigationComponentApi;
            initialize(navigationComponentApi, analyticsComponentApi, onboardingCheckerComponentApi, storageComponentApi, appLaunchHandlersComponentApi, deeplinkActivityComponentDependencies, tabsComponentApi, appOnboardingComponentApi, androidPlatformComponentApi);
        }
    }

    private static final class Factory implements DeeplinkActivityComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.deeplinks.di.DeeplinkActivityComponent.Factory
        public DeeplinkActivityComponent create(NavigationComponentApi navigationComponentApi, AnalyticsComponentApi analyticsComponentApi, AppLaunchHandlersComponentApi appLaunchHandlersComponentApi, DeeplinkActivityComponentDependencies deeplinkActivityComponentDependencies, OnboardingCheckerComponentApi onboardingCheckerComponentApi, StorageComponentApi storageComponentApi, TabsComponentApi tabsComponentApi, AppOnboardingComponentApi appOnboardingComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi) {
            navigationComponentApi.getClass();
            analyticsComponentApi.getClass();
            appLaunchHandlersComponentApi.getClass();
            deeplinkActivityComponentDependencies.getClass();
            onboardingCheckerComponentApi.getClass();
            storageComponentApi.getClass();
            tabsComponentApi.getClass();
            appOnboardingComponentApi.getClass();
            androidPlatformComponentApi.getClass();
            return new DeeplinkActivityComponentImpl(navigationComponentApi, analyticsComponentApi, onboardingCheckerComponentApi, storageComponentApi, appLaunchHandlersComponentApi, deeplinkActivityComponentDependencies, tabsComponentApi, appOnboardingComponentApi, androidPlatformComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static DeeplinkActivityComponent.Factory factory() {
        return new Factory(0);
    }
}
