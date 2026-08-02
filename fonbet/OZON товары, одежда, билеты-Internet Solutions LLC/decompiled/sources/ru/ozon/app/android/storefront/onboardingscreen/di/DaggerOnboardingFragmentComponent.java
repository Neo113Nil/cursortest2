package ru.ozon.app.android.storefront.onboardingscreen.di;

import Jb.j;
import Jb.m;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.account.authEvents.AuthEventsCollector;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.startup.AppLaunchAnalytics;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefront.onboardingscreen.closeFlowWatcher.OnboardingCloseFlowWatcher;
import ru.ozon.app.android.storefront.onboardingscreen.di.OnboardingFragmentComponent;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingEnablePushInteractor;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingEnablePushInteractor_Factory;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractor;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingPushApi;
import ru.ozon.app.android.storefront.onboardingscreen.screen.OnboardingFlowFragment;
import ru.ozon.app.android.storefront.onboardingscreen.screen.OnboardingFlowFragmentViewModel;
import ru.ozon.app.android.storefront.onboardingscreen.screen.OnboardingFlowFragmentViewModel_Factory;
import ru.ozon.app.android.storefront.onboardingscreen.screen.OnboardingFlowFragment_MembersInjector;

/* loaded from: classes2.dex */
public final class DaggerOnboardingFragmentComponent {

    private static final class Factory implements OnboardingFragmentComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.storefront.onboardingscreen.di.OnboardingFragmentComponent.Factory
        public OnboardingFragmentComponent create(NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, StorageComponentApi storageComponentApi, ActionComponentApi actionComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, AnalyticsComponentApi analyticsComponentApi, CloseFlowWatcherComponentApi closeFlowWatcherComponentApi, AccountComponentApi accountComponentApi) {
            navigationComponentApi.getClass();
            networkComponentApi.getClass();
            networkOzonIdComponentApi.getClass();
            storageComponentApi.getClass();
            actionComponentApi.getClass();
            onboardingCheckerComponentApi.getClass();
            analyticsComponentApi.getClass();
            closeFlowWatcherComponentApi.getClass();
            accountComponentApi.getClass();
            return new OnboardingFragmentComponentImpl(navigationComponentApi, networkComponentApi, networkOzonIdComponentApi, storageComponentApi, actionComponentApi, onboardingCheckerComponentApi, analyticsComponentApi, closeFlowWatcherComponentApi, accountComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class OnboardingFragmentComponentImpl implements OnboardingFragmentComponent {
        private final AnalyticsComponentApi analyticsComponentApi;
        private final CloseFlowWatcherComponentApi closeFlowWatcherComponentApi;
        private a<AuthEventsCollector> getAuthEventsCollectorProvider;
        private a<OnboardingInteractor> getOnboardingCheckerInteractorProvider;
        private a<Ob0.a> getOzonIdAppApiProvider;
        private a<Retrofit> getRetrofitProvider;
        private a<OnboardingEnablePushInteractor> onboardingEnablePushInteractorProvider;
        private a<OnboardingFlowFragmentViewModel> onboardingFlowFragmentViewModelProvider;
        private final OnboardingFragmentComponentImpl onboardingFragmentComponentImpl;
        private a<OnboardingPushApi> provideAllowPushApisProvider;

        private static final class GetAuthEventsCollectorProvider implements a<AuthEventsCollector> {
            private final AccountComponentApi accountComponentApi;

            GetAuthEventsCollectorProvider(AccountComponentApi accountComponentApi) {
                this.accountComponentApi = accountComponentApi;
            }

            @Override // Pc.a
            public AuthEventsCollector get() {
                AuthEventsCollector authEventsCollector = this.accountComponentApi.getAuthEventsCollector();
                j.c(authEventsCollector);
                return authEventsCollector;
            }
        }

        private static final class GetOnboardingCheckerInteractorProvider implements a<OnboardingInteractor> {
            private final OnboardingCheckerComponentApi onboardingCheckerComponentApi;

            GetOnboardingCheckerInteractorProvider(OnboardingCheckerComponentApi onboardingCheckerComponentApi) {
                this.onboardingCheckerComponentApi = onboardingCheckerComponentApi;
            }

            @Override // Pc.a
            public OnboardingInteractor get() {
                OnboardingInteractor onboardingCheckerInteractor = this.onboardingCheckerComponentApi.getOnboardingCheckerInteractor();
                j.c(onboardingCheckerInteractor);
                return onboardingCheckerInteractor;
            }
        }

        private static final class GetOzonIdAppApiProvider implements a<Ob0.a> {
            private final NetworkOzonIdComponentApi networkOzonIdComponentApi;

            GetOzonIdAppApiProvider(NetworkOzonIdComponentApi networkOzonIdComponentApi) {
                this.networkOzonIdComponentApi = networkOzonIdComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public Ob0.a get() {
                Ob0.a ozonIdAppApi = this.networkOzonIdComponentApi.getOzonIdAppApi();
                j.c(ozonIdAppApi);
                return ozonIdAppApi;
            }
        }

        private static final class GetRetrofitProvider implements a<Retrofit> {
            private final NetworkComponentApi networkComponentApi;

            GetRetrofitProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            @Override // Pc.a
            public Retrofit get() {
                Retrofit retrofit = this.networkComponentApi.getRetrofit();
                j.c(retrofit);
                return retrofit;
            }
        }

        /* synthetic */ OnboardingFragmentComponentImpl(NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, StorageComponentApi storageComponentApi, ActionComponentApi actionComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, AnalyticsComponentApi analyticsComponentApi, CloseFlowWatcherComponentApi closeFlowWatcherComponentApi, AccountComponentApi accountComponentApi, int i11) {
            this(navigationComponentApi, networkComponentApi, networkOzonIdComponentApi, storageComponentApi, actionComponentApi, onboardingCheckerComponentApi, analyticsComponentApi, closeFlowWatcherComponentApi, accountComponentApi);
        }

        private void initialize(NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, StorageComponentApi storageComponentApi, ActionComponentApi actionComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, AnalyticsComponentApi analyticsComponentApi, CloseFlowWatcherComponentApi closeFlowWatcherComponentApi, AccountComponentApi accountComponentApi) {
            this.getOnboardingCheckerInteractorProvider = new GetOnboardingCheckerInteractorProvider(onboardingCheckerComponentApi);
            this.getOzonIdAppApiProvider = new GetOzonIdAppApiProvider(networkOzonIdComponentApi);
            GetRetrofitProvider getRetrofitProvider = new GetRetrofitProvider(networkComponentApi);
            this.getRetrofitProvider = getRetrofitProvider;
            a<OnboardingPushApi> a11 = m.a(OnboardingPushModule_Companion_ProvideAllowPushApisFactory.create(getRetrofitProvider));
            this.provideAllowPushApisProvider = a11;
            this.onboardingEnablePushInteractorProvider = OnboardingEnablePushInteractor_Factory.create(a11);
            GetAuthEventsCollectorProvider getAuthEventsCollectorProvider = new GetAuthEventsCollectorProvider(accountComponentApi);
            this.getAuthEventsCollectorProvider = getAuthEventsCollectorProvider;
            this.onboardingFlowFragmentViewModelProvider = OnboardingFlowFragmentViewModel_Factory.create(this.getOnboardingCheckerInteractorProvider, this.getOzonIdAppApiProvider, this.onboardingEnablePushInteractorProvider, getAuthEventsCollectorProvider);
        }

        private OnboardingFlowFragment injectOnboardingFlowFragment(OnboardingFlowFragment onboardingFlowFragment) {
            AppLaunchAnalytics appLaunchAnalytics = this.analyticsComponentApi.getAppLaunchAnalytics();
            j.c(appLaunchAnalytics);
            OnboardingFlowFragment_MembersInjector.injectAppLaunchAnalytics(onboardingFlowFragment, appLaunchAnalytics);
            OnboardingCloseFlowWatcher closeFlowWatcher = this.closeFlowWatcherComponentApi.getCloseFlowWatcher();
            j.c(closeFlowWatcher);
            OnboardingFlowFragment_MembersInjector.injectCloseFlowWatcher(onboardingFlowFragment, closeFlowWatcher);
            OnboardingFlowFragment_MembersInjector.injectPViewModel(onboardingFlowFragment, this.onboardingFlowFragmentViewModelProvider);
            return onboardingFlowFragment;
        }

        @Override // ru.ozon.app.android.storefront.onboardingscreen.di.OnboardingFragmentComponent
        public void inject(OnboardingFlowFragment onboardingFlowFragment) {
            injectOnboardingFlowFragment(onboardingFlowFragment);
        }

        private OnboardingFragmentComponentImpl(NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, StorageComponentApi storageComponentApi, ActionComponentApi actionComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, AnalyticsComponentApi analyticsComponentApi, CloseFlowWatcherComponentApi closeFlowWatcherComponentApi, AccountComponentApi accountComponentApi) {
            this.onboardingFragmentComponentImpl = this;
            this.analyticsComponentApi = analyticsComponentApi;
            this.closeFlowWatcherComponentApi = closeFlowWatcherComponentApi;
            initialize(navigationComponentApi, networkComponentApi, networkOzonIdComponentApi, storageComponentApi, actionComponentApi, onboardingCheckerComponentApi, analyticsComponentApi, closeFlowWatcherComponentApi, accountComponentApi);
        }
    }

    public static OnboardingFragmentComponent.Factory factory() {
        return new Factory(0);
    }
}
