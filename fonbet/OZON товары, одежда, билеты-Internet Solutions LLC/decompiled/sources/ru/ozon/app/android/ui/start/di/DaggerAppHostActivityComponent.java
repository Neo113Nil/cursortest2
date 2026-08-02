package ru.ozon.app.android.ui.start.di;

import GZ.g;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.startup.AppLaunchAnalytics;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.deeplink.ExternalDeeplinkProcessorDelegate;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.firstLaunch.FirstLaunchStateStorage;
import ru.ozon.app.android.storefront.onboardingscreen.di.OnboardingCheckerComponentApi;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractor;
import ru.ozon.app.android.ui.start.AppHostActivity;
import ru.ozon.app.android.ui.start.AppHostActivity_MembersInjector;
import ru.ozon.app.android.ui.start.AppHostViewModel;
import ru.ozon.app.android.ui.start.di.AppHostActivityComponent;

/* loaded from: classes7.dex */
public final class DaggerAppHostActivityComponent {

    private static final class AppHostActivityComponentImpl implements AppHostActivityComponent {
        private final AnalyticsComponentApi analyticsComponentApi;
        private final AppHostActivityComponentImpl appHostActivityComponentImpl;
        private a<AppHostViewModel> appHostViewModelProvider;
        private final NavigationComponentApi navigationComponentApi;
        private final OnboardingCheckerComponentApi onboardingCheckerComponentApi;
        private final StorageComponentApi storageComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {
            private final AppHostActivityComponentImpl appHostActivityComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f94541id;

            SwitchingProvider(AppHostActivityComponentImpl appHostActivityComponentImpl, int i11) {
                this.appHostActivityComponentImpl = appHostActivityComponentImpl;
                this.f94541id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f94541id != 0) {
                    throw new AssertionError(this.f94541id);
                }
                FirstLaunchStateStorage firstLaunchStateStorage = this.appHostActivityComponentImpl.storageComponentApi.getFirstLaunchStateStorage();
                j.c(firstLaunchStateStorage);
                OnboardingInteractor onboardingCheckerInteractor = this.appHostActivityComponentImpl.onboardingCheckerComponentApi.getOnboardingCheckerInteractor();
                j.c(onboardingCheckerInteractor);
                return (T) new AppHostViewModel(firstLaunchStateStorage, onboardingCheckerInteractor);
            }
        }

        /* synthetic */ AppHostActivityComponentImpl(NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, ActionComponentApi actionComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, AnalyticsComponentApi analyticsComponentApi, int i11) {
            this(navigationComponentApi, networkComponentApi, storageComponentApi, actionComponentApi, onboardingCheckerComponentApi, analyticsComponentApi);
        }

        private ExternalDeeplinkProcessorDelegate externalDeeplinkProcessorDelegate() {
            AppLaunchAnalytics appLaunchAnalytics = this.analyticsComponentApi.getAppLaunchAnalytics();
            j.c(appLaunchAnalytics);
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new ExternalDeeplinkProcessorDelegate(appLaunchAnalytics, ozonRouter);
        }

        private void initialize(NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, ActionComponentApi actionComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, AnalyticsComponentApi analyticsComponentApi) {
            this.appHostViewModelProvider = new SwitchingProvider(this.appHostActivityComponentImpl, 0);
        }

        private AppHostActivity injectAppHostActivity(AppHostActivity appHostActivity) {
            AppHostActivity_MembersInjector.injectPViewModel(appHostActivity, this.appHostViewModelProvider);
            AppHostActivity_MembersInjector.injectExternalDeeplinkDelegate(appHostActivity, externalDeeplinkProcessorDelegate());
            return appHostActivity;
        }

        @Override // ru.ozon.app.android.ui.start.di.AppHostActivityComponent
        public void inject(AppHostActivity appHostActivity) {
            injectAppHostActivity(appHostActivity);
        }

        private AppHostActivityComponentImpl(NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, ActionComponentApi actionComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, AnalyticsComponentApi analyticsComponentApi) {
            this.appHostActivityComponentImpl = this;
            this.storageComponentApi = storageComponentApi;
            this.onboardingCheckerComponentApi = onboardingCheckerComponentApi;
            this.analyticsComponentApi = analyticsComponentApi;
            this.navigationComponentApi = navigationComponentApi;
            initialize(navigationComponentApi, networkComponentApi, storageComponentApi, actionComponentApi, onboardingCheckerComponentApi, analyticsComponentApi);
        }
    }

    private static final class Factory implements AppHostActivityComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.ui.start.di.AppHostActivityComponent.Factory
        public AppHostActivityComponent create(NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, ActionComponentApi actionComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, AnalyticsComponentApi analyticsComponentApi) {
            navigationComponentApi.getClass();
            networkComponentApi.getClass();
            storageComponentApi.getClass();
            actionComponentApi.getClass();
            onboardingCheckerComponentApi.getClass();
            analyticsComponentApi.getClass();
            return new AppHostActivityComponentImpl(navigationComponentApi, networkComponentApi, storageComponentApi, actionComponentApi, onboardingCheckerComponentApi, analyticsComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static AppHostActivityComponent.Factory factory() {
        return new Factory(0);
    }
}
