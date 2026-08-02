package ru.ozon.app.android.travel.feature.entry.di;

import GZ.g;
import Jb.j;
import Pc.a;
import android.content.Context;
import android.content.SharedPreferences;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.startup.AppLaunchAnalytics;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.deeplink.ExternalDeeplinkProcessorDelegate;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.firstLaunch.FirstLaunchStateStorage;
import ru.ozon.app.android.storefront.onboardingscreen.di.OnboardingCheckerComponentApi;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractor;
import ru.ozon.app.android.travel.feature.entry.OzonTravelActivity;
import ru.ozon.app.android.travel.feature.entry.OzonTravelActivity_MembersInjector;
import ru.ozon.app.android.travel.feature.entry.OzonTravelViewModel;
import ru.ozon.app.android.travel.feature.entry.data.PushOnboardingPrefsRepository;
import ru.ozon.app.android.travel.feature.entry.di.OzonTravelActivityComponent;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.NotificationOnboardingViewModel;
import ru.ozon.app.android.travel.map.di.TravelMapApi;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;

/* loaded from: classes3.dex */
public final class DaggerOzonTravelActivityComponent {

    private static final class Factory implements OzonTravelActivityComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.travel.feature.entry.di.OzonTravelActivityComponent.Factory
        public OzonTravelActivityComponent create(NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, ActionComponentApi actionComponentApi, AccountComponentApi accountComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentApi androidPlatformComponentApi, TravelMapApi travelMapApi, AnalyticsComponentApi analyticsComponentApi) {
            navigationComponentApi.getClass();
            networkComponentApi.getClass();
            storageComponentApi.getClass();
            actionComponentApi.getClass();
            accountComponentApi.getClass();
            onboardingCheckerComponentApi.getClass();
            contextComponentDependencies.getClass();
            androidPlatformComponentApi.getClass();
            travelMapApi.getClass();
            analyticsComponentApi.getClass();
            return new OzonTravelActivityComponentImpl(navigationComponentApi, networkComponentApi, storageComponentApi, actionComponentApi, accountComponentApi, onboardingCheckerComponentApi, contextComponentDependencies, androidPlatformComponentApi, travelMapApi, analyticsComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class OzonTravelActivityComponentImpl implements OzonTravelActivityComponent {
        private final AnalyticsComponentApi analyticsComponentApi;
        private final ContextComponentDependencies contextComponentDependencies;
        private final NavigationComponentApi navigationComponentApi;
        private a<NotificationOnboardingViewModel> notificationOnboardingViewModelProvider;
        private final OnboardingCheckerComponentApi onboardingCheckerComponentApi;
        private final OzonTravelActivityComponentImpl ozonTravelActivityComponentImpl;
        private a<OzonTravelViewModel> ozonTravelViewModelProvider;
        private final StorageComponentApi storageComponentApi;
        private final TravelMapApi travelMapApi;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f93795id;
            private final OzonTravelActivityComponentImpl ozonTravelActivityComponentImpl;

            SwitchingProvider(OzonTravelActivityComponentImpl ozonTravelActivityComponentImpl, int i11) {
                this.ozonTravelActivityComponentImpl = ozonTravelActivityComponentImpl;
                this.f93795id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f93795id;
                if (i11 != 0) {
                    if (i11 == 1) {
                        return (T) new NotificationOnboardingViewModel(this.ozonTravelActivityComponentImpl.pushOnboardingPrefsRepository());
                    }
                    throw new AssertionError(this.f93795id);
                }
                Context context = this.ozonTravelActivityComponentImpl.contextComponentDependencies.getContext();
                j.c(context);
                FirstLaunchStateStorage firstLaunchStateStorage = this.ozonTravelActivityComponentImpl.storageComponentApi.getFirstLaunchStateStorage();
                j.c(firstLaunchStateStorage);
                OnboardingInteractor onboardingCheckerInteractor = this.ozonTravelActivityComponentImpl.onboardingCheckerComponentApi.getOnboardingCheckerInteractor();
                j.c(onboardingCheckerInteractor);
                return (T) new OzonTravelViewModel(context, firstLaunchStateStorage, onboardingCheckerInteractor);
            }
        }

        /* synthetic */ OzonTravelActivityComponentImpl(NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, ActionComponentApi actionComponentApi, AccountComponentApi accountComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentApi androidPlatformComponentApi, TravelMapApi travelMapApi, AnalyticsComponentApi analyticsComponentApi, int i11) {
            this(navigationComponentApi, networkComponentApi, storageComponentApi, actionComponentApi, accountComponentApi, onboardingCheckerComponentApi, contextComponentDependencies, androidPlatformComponentApi, travelMapApi, analyticsComponentApi);
        }

        private ExternalDeeplinkProcessorDelegate externalDeeplinkProcessorDelegate() {
            AppLaunchAnalytics appLaunchAnalytics = this.analyticsComponentApi.getAppLaunchAnalytics();
            j.c(appLaunchAnalytics);
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new ExternalDeeplinkProcessorDelegate(appLaunchAnalytics, ozonRouter);
        }

        private void initialize(NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, ActionComponentApi actionComponentApi, AccountComponentApi accountComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentApi androidPlatformComponentApi, TravelMapApi travelMapApi, AnalyticsComponentApi analyticsComponentApi) {
            this.ozonTravelViewModelProvider = new SwitchingProvider(this.ozonTravelActivityComponentImpl, 0);
            this.notificationOnboardingViewModelProvider = new SwitchingProvider(this.ozonTravelActivityComponentImpl, 1);
        }

        private OzonTravelActivity injectOzonTravelActivity(OzonTravelActivity ozonTravelActivity) {
            EnvironmentService environmentService = this.storageComponentApi.getEnvironmentService();
            j.c(environmentService);
            OzonTravelActivity_MembersInjector.injectEnvironmentService(ozonTravelActivity, environmentService);
            OzonTravelActivity_MembersInjector.injectViewModelProvider(ozonTravelActivity, this.ozonTravelViewModelProvider);
            OzonTravelActivity_MembersInjector.injectNotificationViewModelProvider(ozonTravelActivity, this.notificationOnboardingViewModelProvider);
            TravelGeoProvidersStorage travelGeoProviderStorage = this.travelMapApi.getTravelGeoProviderStorage();
            j.c(travelGeoProviderStorage);
            OzonTravelActivity_MembersInjector.injectTravelGeoProvidersStorage(ozonTravelActivity, travelGeoProviderStorage);
            OzonTravelActivity_MembersInjector.injectDeeplinkDelegate(ozonTravelActivity, externalDeeplinkProcessorDelegate());
            return ozonTravelActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PushOnboardingPrefsRepository pushOnboardingPrefsRepository() {
            SharedPreferences sharedPreferences = this.storageComponentApi.getSharedPreferences();
            j.c(sharedPreferences);
            return new PushOnboardingPrefsRepository(sharedPreferences);
        }

        @Override // ru.ozon.app.android.travel.feature.entry.di.OzonTravelActivityComponent
        public void inject(OzonTravelActivity ozonTravelActivity) {
            injectOzonTravelActivity(ozonTravelActivity);
        }

        private OzonTravelActivityComponentImpl(NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, ActionComponentApi actionComponentApi, AccountComponentApi accountComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentApi androidPlatformComponentApi, TravelMapApi travelMapApi, AnalyticsComponentApi analyticsComponentApi) {
            this.ozonTravelActivityComponentImpl = this;
            this.storageComponentApi = storageComponentApi;
            this.contextComponentDependencies = contextComponentDependencies;
            this.onboardingCheckerComponentApi = onboardingCheckerComponentApi;
            this.travelMapApi = travelMapApi;
            this.analyticsComponentApi = analyticsComponentApi;
            this.navigationComponentApi = navigationComponentApi;
            initialize(navigationComponentApi, networkComponentApi, storageComponentApi, actionComponentApi, accountComponentApi, onboardingCheckerComponentApi, contextComponentDependencies, androidPlatformComponentApi, travelMapApi, analyticsComponentApi);
        }
    }

    public static OzonTravelActivityComponent.Factory factory() {
        return new Factory(0);
    }
}
