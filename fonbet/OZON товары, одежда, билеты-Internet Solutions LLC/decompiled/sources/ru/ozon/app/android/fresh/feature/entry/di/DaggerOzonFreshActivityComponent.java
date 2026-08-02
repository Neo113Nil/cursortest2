package ru.ozon.app.android.fresh.feature.entry.di;

import EZ.h;
import GZ.g;
import Jb.j;
import Pc.a;
import We.E;
import android.content.Context;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.startup.AppLaunchAnalytics;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.fresh.feature.entry.OzonFreshActivity;
import ru.ozon.app.android.fresh.feature.entry.OzonFreshActivity_MembersInjector;
import ru.ozon.app.android.fresh.feature.entry.OzonFreshViewModel;
import ru.ozon.app.android.fresh.feature.entry.di.OzonFreshActivityComponent;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.deeplink.ExternalDeeplinkProcessorDelegate;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.firstLaunch.FirstLaunchStateStorage;
import ru.ozon.app.android.storefront.onboardingscreen.di.OnboardingCheckerComponentApi;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractor;

/* loaded from: classes12.dex */
public final class DaggerOzonFreshActivityComponent {

    private static final class Factory implements OzonFreshActivityComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.feature.entry.di.OzonFreshActivityComponent.Factory
        public OzonFreshActivityComponent create(NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, ContextComponentDependencies contextComponentDependencies, AnalyticsComponentApi analyticsComponentApi) {
            navigationComponentApi.getClass();
            networkComponentApi.getClass();
            storageComponentApi.getClass();
            onboardingCheckerComponentApi.getClass();
            contextComponentDependencies.getClass();
            analyticsComponentApi.getClass();
            return new OzonFreshActivityComponentImpl(navigationComponentApi, networkComponentApi, storageComponentApi, onboardingCheckerComponentApi, contextComponentDependencies, analyticsComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class OzonFreshActivityComponentImpl implements OzonFreshActivityComponent {
        private final AnalyticsComponentApi analyticsComponentApi;
        private final ContextComponentDependencies contextComponentDependencies;
        private final NavigationComponentApi navigationComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private final OnboardingCheckerComponentApi onboardingCheckerComponentApi;
        private final OzonFreshActivityComponentImpl ozonFreshActivityComponentImpl;
        private a<OzonFreshViewModel> ozonFreshViewModelProvider;
        private final StorageComponentApi storageComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92672id;
            private final OzonFreshActivityComponentImpl ozonFreshActivityComponentImpl;

            SwitchingProvider(OzonFreshActivityComponentImpl ozonFreshActivityComponentImpl, int i11) {
                this.ozonFreshActivityComponentImpl = ozonFreshActivityComponentImpl;
                this.f92672id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92672id != 0) {
                    throw new AssertionError(this.f92672id);
                }
                Context context = this.ozonFreshActivityComponentImpl.contextComponentDependencies.getContext();
                j.c(context);
                FirstLaunchStateStorage firstLaunchStateStorage = this.ozonFreshActivityComponentImpl.storageComponentApi.getFirstLaunchStateStorage();
                j.c(firstLaunchStateStorage);
                OnboardingInteractor onboardingCheckerInteractor = this.ozonFreshActivityComponentImpl.onboardingCheckerComponentApi.getOnboardingCheckerInteractor();
                j.c(onboardingCheckerInteractor);
                return (T) new OzonFreshViewModel(context, firstLaunchStateStorage, onboardingCheckerInteractor);
            }
        }

        /* synthetic */ OzonFreshActivityComponentImpl(NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, ContextComponentDependencies contextComponentDependencies, AnalyticsComponentApi analyticsComponentApi, int i11) {
            this(navigationComponentApi, networkComponentApi, storageComponentApi, onboardingCheckerComponentApi, contextComponentDependencies, analyticsComponentApi);
        }

        private ExternalDeeplinkProcessorDelegate externalDeeplinkProcessorDelegate() {
            AppLaunchAnalytics appLaunchAnalytics = this.analyticsComponentApi.getAppLaunchAnalytics();
            j.c(appLaunchAnalytics);
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new ExternalDeeplinkProcessorDelegate(appLaunchAnalytics, ozonRouter);
        }

        private void initialize(NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, ContextComponentDependencies contextComponentDependencies, AnalyticsComponentApi analyticsComponentApi) {
            this.ozonFreshViewModelProvider = new SwitchingProvider(this.ozonFreshActivityComponentImpl, 0);
        }

        private OzonFreshActivity injectOzonFreshActivity(OzonFreshActivity ozonFreshActivity) {
            EnvironmentService environmentService = this.storageComponentApi.getEnvironmentService();
            j.c(environmentService);
            OzonFreshActivity_MembersInjector.injectEnvironmentService(ozonFreshActivity, environmentService);
            OzonFreshActivity_MembersInjector.injectViewModelProvider(ozonFreshActivity, this.ozonFreshViewModelProvider);
            h navigatorHolder = this.navigationComponentApi.getNavigatorHolder();
            j.c(navigatorHolder);
            OzonFreshActivity_MembersInjector.injectNavigatorHolder(ozonFreshActivity, navigatorHolder);
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            OzonFreshActivity_MembersInjector.injectOzonRouter(ozonFreshActivity, ozonRouter);
            E okHttpClient = this.networkComponentApi.getOkHttpClient();
            j.c(okHttpClient);
            OzonFreshActivity_MembersInjector.injectOkHttpClient(ozonFreshActivity, okHttpClient);
            OzonFreshActivity_MembersInjector.injectDeeplinkDelegate(ozonFreshActivity, externalDeeplinkProcessorDelegate());
            return ozonFreshActivity;
        }

        @Override // ru.ozon.app.android.fresh.feature.entry.di.OzonFreshActivityComponent
        public void inject(OzonFreshActivity ozonFreshActivity) {
            injectOzonFreshActivity(ozonFreshActivity);
        }

        private OzonFreshActivityComponentImpl(NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, ContextComponentDependencies contextComponentDependencies, AnalyticsComponentApi analyticsComponentApi) {
            this.ozonFreshActivityComponentImpl = this;
            this.storageComponentApi = storageComponentApi;
            this.contextComponentDependencies = contextComponentDependencies;
            this.onboardingCheckerComponentApi = onboardingCheckerComponentApi;
            this.navigationComponentApi = navigationComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.analyticsComponentApi = analyticsComponentApi;
            initialize(navigationComponentApi, networkComponentApi, storageComponentApi, onboardingCheckerComponentApi, contextComponentDependencies, analyticsComponentApi);
        }
    }

    public static OzonFreshActivityComponent.Factory factory() {
        return new Factory(0);
    }
}
