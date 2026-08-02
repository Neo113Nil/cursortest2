package ru.ozon.app.android.payment.feature.di;

import GZ.g;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.locale.app.di.AppLocaleComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.common.NetworkHeadersProvider;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.logs.WebViewErrorLogger;
import ru.ozon.app.android.network.whitelist.di.WhitelistComponentApi;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.payment.feature.di.PaymentComponent;
import ru.ozon.app.android.payment.feature.webpage.PaymentActivity;
import ru.ozon.app.android.payment.feature.webpage.PaymentActivity_MembersInjector;
import ru.ozon.app.android.payment.feature.webpage.PaymentViewModelImpl;
import ru.ozon.app.android.payment.feature.webpage.PaymentWebViewClient;
import ru.ozon.app.android.payment.feature.webpage.PaymentWebViewUrlInterceptor;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.web.di.WebComponentApi;
import ru.ozon.app.android.web.webview.cache.WebViewResourcesManager;
import ru.ozon.app.android.web.webview.cache.service.ResourcesCacheInterceptor;
import ru.ozon.app.android.web.webview.client.WebViewRendererProcessCrashHandler;

/* loaded from: classes13.dex */
public final class DaggerPaymentComponent {

    private static final class Factory implements PaymentComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.payment.feature.di.PaymentComponent.Factory
        public PaymentComponent create(NetworkComponentApi networkComponentApi, WhitelistComponentApi whitelistComponentApi, NavigationComponentApi navigationComponentApi, AppLocaleComponentApi appLocaleComponentApi, StorageComponentApi storageComponentApi, AnalyticsComponentApi analyticsComponentApi, AccountComponentApi accountComponentApi, WebComponentApi webComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies) {
            networkComponentApi.getClass();
            whitelistComponentApi.getClass();
            navigationComponentApi.getClass();
            appLocaleComponentApi.getClass();
            storageComponentApi.getClass();
            analyticsComponentApi.getClass();
            accountComponentApi.getClass();
            webComponentApi.getClass();
            composerComponentApi.getClass();
            actionComponentApi.getClass();
            contextComponentDependencies.getClass();
            return new PaymentComponentImpl(networkComponentApi, whitelistComponentApi, navigationComponentApi, accountComponentApi, analyticsComponentApi, webComponentApi, appLocaleComponentApi, composerComponentApi, storageComponentApi, actionComponentApi, contextComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class PaymentComponentImpl implements PaymentComponent {
        private final AnalyticsComponentApi analyticsComponentApi;
        private final NavigationComponentApi navigationComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private final PaymentComponentImpl paymentComponentImpl;
        private a<PaymentViewModelImpl> paymentViewModelImplProvider;
        private final WebComponentApi webComponentApi;
        private final WhitelistComponentApi whitelistComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f93011id;
            private final PaymentComponentImpl paymentComponentImpl;

            SwitchingProvider(PaymentComponentImpl paymentComponentImpl, int i11) {
                this.paymentComponentImpl = paymentComponentImpl;
                this.f93011id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f93011id == 0) {
                    return (T) new PaymentViewModelImpl();
                }
                throw new AssertionError(this.f93011id);
            }
        }

        /* synthetic */ PaymentComponentImpl(NetworkComponentApi networkComponentApi, WhitelistComponentApi whitelistComponentApi, NavigationComponentApi navigationComponentApi, AccountComponentApi accountComponentApi, AnalyticsComponentApi analyticsComponentApi, WebComponentApi webComponentApi, AppLocaleComponentApi appLocaleComponentApi, ComposerComponentApi composerComponentApi, StorageComponentApi storageComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies, int i11) {
            this(networkComponentApi, whitelistComponentApi, navigationComponentApi, accountComponentApi, analyticsComponentApi, webComponentApi, appLocaleComponentApi, composerComponentApi, storageComponentApi, actionComponentApi, contextComponentDependencies);
        }

        private void initialize(NetworkComponentApi networkComponentApi, WhitelistComponentApi whitelistComponentApi, NavigationComponentApi navigationComponentApi, AccountComponentApi accountComponentApi, AnalyticsComponentApi analyticsComponentApi, WebComponentApi webComponentApi, AppLocaleComponentApi appLocaleComponentApi, ComposerComponentApi composerComponentApi, StorageComponentApi storageComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies) {
            this.paymentViewModelImplProvider = new SwitchingProvider(this.paymentComponentImpl, 0);
        }

        private PaymentActivity injectPaymentActivity(PaymentActivity paymentActivity) {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            PaymentActivity_MembersInjector.injectOzonRouter(paymentActivity, ozonRouter);
            PaymentActivity_MembersInjector.injectPViewModel(paymentActivity, this.paymentViewModelImplProvider);
            FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
            j.c(featureChecker);
            PaymentActivity_MembersInjector.injectFeatureChecker(paymentActivity, featureChecker);
            FeatureService featureService = this.networkComponentApi.getFeatureService();
            j.c(featureService);
            PaymentActivity_MembersInjector.injectFeatureService(paymentActivity, featureService);
            WebViewResourcesManager webViewResourcesManager = this.webComponentApi.getWebViewResourcesManager();
            j.c(webViewResourcesManager);
            PaymentActivity_MembersInjector.injectWebViewCacheManager(paymentActivity, webViewResourcesManager);
            PaymentActivity_MembersInjector.injectPaymentWebViewClient(paymentActivity, paymentWebViewClient());
            return paymentActivity;
        }

        private PaymentWebViewClient paymentWebViewClient() {
            ResourcesCacheInterceptor resourcesCacheInterceptor = this.webComponentApi.getResourcesCacheInterceptor();
            j.c(resourcesCacheInterceptor);
            PerformanceTrackerDelegate performanceTrackerDelegate = this.analyticsComponentApi.getPerformanceTrackerDelegate();
            j.c(performanceTrackerDelegate);
            WebViewRendererProcessCrashHandler webViewRendererProcessCrashHandler = this.webComponentApi.getWebViewRendererProcessCrashHandler();
            j.c(webViewRendererProcessCrashHandler);
            PaymentWebViewUrlInterceptor paymentWebViewUrlInterceptor = paymentWebViewUrlInterceptor();
            FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
            j.c(featureChecker);
            WebViewErrorLogger webViewErrorLogger = this.networkComponentApi.getWebViewErrorLogger();
            j.c(webViewErrorLogger);
            return new PaymentWebViewClient(resourcesCacheInterceptor, performanceTrackerDelegate, webViewRendererProcessCrashHandler, paymentWebViewUrlInterceptor, featureChecker, webViewErrorLogger);
        }

        private PaymentWebViewUrlInterceptor paymentWebViewUrlInterceptor() {
            DomainsInteractor domainsInteractor = this.whitelistComponentApi.getDomainsInteractor();
            j.c(domainsInteractor);
            NetworkHeadersProvider networkHeadersProvider = this.networkComponentApi.getNetworkHeadersProvider();
            j.c(networkHeadersProvider);
            return new PaymentWebViewUrlInterceptor(domainsInteractor, networkHeadersProvider);
        }

        @Override // ru.ozon.app.android.payment.feature.di.PaymentComponent
        public void inject(PaymentActivity paymentActivity) {
            injectPaymentActivity(paymentActivity);
        }

        private PaymentComponentImpl(NetworkComponentApi networkComponentApi, WhitelistComponentApi whitelistComponentApi, NavigationComponentApi navigationComponentApi, AccountComponentApi accountComponentApi, AnalyticsComponentApi analyticsComponentApi, WebComponentApi webComponentApi, AppLocaleComponentApi appLocaleComponentApi, ComposerComponentApi composerComponentApi, StorageComponentApi storageComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies) {
            this.paymentComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.webComponentApi = webComponentApi;
            this.analyticsComponentApi = analyticsComponentApi;
            this.whitelistComponentApi = whitelistComponentApi;
            initialize(networkComponentApi, whitelistComponentApi, navigationComponentApi, accountComponentApi, analyticsComponentApi, webComponentApi, appLocaleComponentApi, composerComponentApi, storageComponentApi, actionComponentApi, contextComponentDependencies);
        }
    }

    public static PaymentComponent.Factory factory() {
        return new Factory(0);
    }
}
