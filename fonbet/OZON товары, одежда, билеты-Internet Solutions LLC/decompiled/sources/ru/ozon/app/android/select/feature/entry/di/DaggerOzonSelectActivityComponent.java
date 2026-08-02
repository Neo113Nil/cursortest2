package ru.ozon.app.android.select.feature.entry.di;

import GZ.g;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.startup.AppLaunchAnalytics;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.platform.deeplink.ExternalDeeplinkProcessorDelegate;
import ru.ozon.app.android.select.feature.entry.OzonSelectActivity;
import ru.ozon.app.android.select.feature.entry.OzonSelectActivity_MembersInjector;
import ru.ozon.app.android.select.feature.entry.OzonSelectViewModel;
import ru.ozon.app.android.select.feature.entry.di.OzonSelectActivityComponent;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storefront.widgets.appOnboarding.di.AppOnboardingComponentApi;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingViewModel;

/* loaded from: classes13.dex */
public final class DaggerOzonSelectActivityComponent {

    private static final class Factory implements OzonSelectActivityComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.select.feature.entry.di.OzonSelectActivityComponent.Factory
        public OzonSelectActivityComponent create(NavigationComponentApi navigationComponentApi, StorageComponentApi storageComponentApi, ActionComponentApi actionComponentApi, AppOnboardingComponentApi appOnboardingComponentApi, AnalyticsComponentApi analyticsComponentApi) {
            navigationComponentApi.getClass();
            storageComponentApi.getClass();
            actionComponentApi.getClass();
            appOnboardingComponentApi.getClass();
            analyticsComponentApi.getClass();
            return new OzonSelectActivityComponentImpl(navigationComponentApi, storageComponentApi, actionComponentApi, appOnboardingComponentApi, analyticsComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class OzonSelectActivityComponentImpl implements OzonSelectActivityComponent {
        private final AnalyticsComponentApi analyticsComponentApi;
        private final AppOnboardingComponentApi appOnboardingComponentApi;
        private a<AppOnboardingViewModel> appOnboardingViewModelProvider;
        private final NavigationComponentApi navigationComponentApi;
        private final OzonSelectActivityComponentImpl ozonSelectActivityComponentImpl;
        private a<OzonSelectViewModel> ozonSelectViewModelProvider;
        private final StorageComponentApi storageComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f93457id;
            private final OzonSelectActivityComponentImpl ozonSelectActivityComponentImpl;

            SwitchingProvider(OzonSelectActivityComponentImpl ozonSelectActivityComponentImpl, int i11) {
                this.ozonSelectActivityComponentImpl = ozonSelectActivityComponentImpl;
                this.f93457id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f93457id;
                if (i11 == 0) {
                    return (T) new OzonSelectViewModel();
                }
                if (i11 != 1) {
                    throw new AssertionError(this.f93457id);
                }
                T t2 = (T) this.ozonSelectActivityComponentImpl.appOnboardingComponentApi.appOnboardingViewModel();
                j.c(t2);
                return t2;
            }
        }

        /* synthetic */ OzonSelectActivityComponentImpl(NavigationComponentApi navigationComponentApi, StorageComponentApi storageComponentApi, ActionComponentApi actionComponentApi, AppOnboardingComponentApi appOnboardingComponentApi, AnalyticsComponentApi analyticsComponentApi, int i11) {
            this(navigationComponentApi, storageComponentApi, actionComponentApi, appOnboardingComponentApi, analyticsComponentApi);
        }

        private ExternalDeeplinkProcessorDelegate externalDeeplinkProcessorDelegate() {
            AppLaunchAnalytics appLaunchAnalytics = this.analyticsComponentApi.getAppLaunchAnalytics();
            j.c(appLaunchAnalytics);
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new ExternalDeeplinkProcessorDelegate(appLaunchAnalytics, ozonRouter);
        }

        private void initialize(NavigationComponentApi navigationComponentApi, StorageComponentApi storageComponentApi, ActionComponentApi actionComponentApi, AppOnboardingComponentApi appOnboardingComponentApi, AnalyticsComponentApi analyticsComponentApi) {
            this.ozonSelectViewModelProvider = new SwitchingProvider(this.ozonSelectActivityComponentImpl, 0);
            this.appOnboardingViewModelProvider = new SwitchingProvider(this.ozonSelectActivityComponentImpl, 1);
        }

        private OzonSelectActivity injectOzonSelectActivity(OzonSelectActivity ozonSelectActivity) {
            OzonSelectActivity_MembersInjector.injectPViewModel(ozonSelectActivity, this.ozonSelectViewModelProvider);
            OzonSelectActivity_MembersInjector.injectPAppOnboardingViewModel(ozonSelectActivity, this.appOnboardingViewModelProvider);
            EnvironmentService environmentService = this.storageComponentApi.getEnvironmentService();
            j.c(environmentService);
            OzonSelectActivity_MembersInjector.injectEnvironmentService(ozonSelectActivity, environmentService);
            OzonSelectActivity_MembersInjector.injectExternalDeeplinkDelegate(ozonSelectActivity, externalDeeplinkProcessorDelegate());
            return ozonSelectActivity;
        }

        @Override // ru.ozon.app.android.select.feature.entry.di.OzonSelectActivityComponent
        public void inject(OzonSelectActivity ozonSelectActivity) {
            injectOzonSelectActivity(ozonSelectActivity);
        }

        private OzonSelectActivityComponentImpl(NavigationComponentApi navigationComponentApi, StorageComponentApi storageComponentApi, ActionComponentApi actionComponentApi, AppOnboardingComponentApi appOnboardingComponentApi, AnalyticsComponentApi analyticsComponentApi) {
            this.ozonSelectActivityComponentImpl = this;
            this.appOnboardingComponentApi = appOnboardingComponentApi;
            this.storageComponentApi = storageComponentApi;
            this.analyticsComponentApi = analyticsComponentApi;
            this.navigationComponentApi = navigationComponentApi;
            initialize(navigationComponentApi, storageComponentApi, actionComponentApi, appOnboardingComponentApi, analyticsComponentApi);
        }
    }

    public static OzonSelectActivityComponent.Factory factory() {
        return new Factory(0);
    }
}
