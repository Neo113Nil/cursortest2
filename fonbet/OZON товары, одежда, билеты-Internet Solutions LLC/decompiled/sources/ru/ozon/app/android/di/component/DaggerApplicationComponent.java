package ru.ozon.app.android.di.component;

import Fb0.e;
import Jb.m;
import KZ.c;
import KZ.d;
import Pc.a;
import android.app.Application;
import android.content.Context;
import com.google.common.collect.A;
import java.util.Set;
import nZ.C8475a;
import ru.ozon.android.hardwareinfo.DeviceType;
import ru.ozon.app.android.bank.lifecycle.FintechActivityLifecycleCallback;
import ru.ozon.app.android.bank.navigation.BankGlobalDeeplinkInterceptor;
import ru.ozon.app.android.bank.push.di.module.OzonBankPushHandlerModule_Companion_ProvideOzonBankPushHanlderFactory;
import ru.ozon.app.android.barcodecache.push.BarcodePushHandler;
import ru.ozon.app.android.di.component.ApplicationComponent;
import ru.ozon.app.android.di.module.ApplicationModule;
import ru.ozon.app.android.di.module.ApplicationModule_ProvideAndroidPlatformComponentConfigFactory;
import ru.ozon.app.android.di.module.ApplicationModule_ProvidePushComponentConfigFactory;
import ru.ozon.app.android.di.module.ApplicationModule_ProvideStorageComponentConfigFactory;
import ru.ozon.app.android.di.module.NavigationDependenciesModule_ProvideCommonPageProviderFactory;
import ru.ozon.app.android.di.module.NavigationDependenciesModule_ProvideCustomActivityNavigatorCheckerFactory;
import ru.ozon.app.android.di.module.NavigationDependenciesModule_ProvideDeeplinkInterceptorsFactory;
import ru.ozon.app.android.di.module.NavigationDependenciesModule_ProvideDestinationInterceptorsFactory;
import ru.ozon.app.android.di.module.NavigationDependenciesModule_ProvideNavigationConfigFactory;
import ru.ozon.app.android.environment.di.EnvironmentModule;
import ru.ozon.app.android.environment.di.EnvironmentModule_ProvideApiUrlFactory;
import ru.ozon.app.android.environment.di.EnvironmentModule_ProvideApiUrlSuffixFactory;
import ru.ozon.app.android.environment.di.EnvironmentModule_ProvideAppDomainFactory;
import ru.ozon.app.android.environment.di.EnvironmentModule_ProvideBaseUrlProviderFactory;
import ru.ozon.app.android.environment.di.EnvironmentModule_ProvideCoreHostsFactory;
import ru.ozon.app.android.environment.di.EnvironmentModule_ProvideEnvironmentServiceFactory;
import ru.ozon.app.android.environment.di.EnvironmentModule_ProvideFintechUrlsFactory;
import ru.ozon.app.android.environment.di.EnvironmentModule_ProvideMetricsDomainNameFactory;
import ru.ozon.app.android.environment.di.EnvironmentModule_ProvideNativePageDomainsInteractorFactory;
import ru.ozon.app.android.environment.di.EnvironmentModule_ProvidePDPHostsFactory;
import ru.ozon.app.android.environment.di.EnvironmentModule_ProvideWebSocketLinkFactory;
import ru.ozon.app.android.fintech.FintechDependenciesModule;
import ru.ozon.app.android.fintech.FintechDependenciesModule_ProvideFintechActivityLifecycleCallbackFactory;
import ru.ozon.app.android.limb2.Limb2DeeplinkInterceptor;
import ru.ozon.app.android.mediaupload.hosts.PDPHosts;
import ru.ozon.app.android.navigation.NativePageDomainsInteractor;
import ru.ozon.app.android.navigation.globalinterceptors.deeplink.OzonFreshGlobalDeeplinkInterceptor;
import ru.ozon.app.android.navigation.globalinterceptors.deeplink.OzonSelectGlobalDeeplinkInterceptor;
import ru.ozon.app.android.navigation.globalinterceptors.deeplink.OzonTravelGlobalDeeplinkInterceptor;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;
import ru.ozon.app.android.platform.flavor.FlavorType;
import ru.ozon.app.android.push.di.PushComponentConfig;
import ru.ozon.app.android.push.handlers.teensmode.TeensModePushHandler;
import ru.ozon.app.android.search.deeplink.SourceGlobalDeeplinkInterceptor;
import ru.ozon.app.android.storage.di.StorageComponentConfig;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.hosts.CoreHosts;
import ru.ozon.app.android.storage.hosts.FintechUrls;
import ru.ozon.app.android.storefront.deeplinkhandlers.BrowserToWebViewGlobalDeeplinkInterceptor;
import ru.ozon.app.android.storefront.deeplinkhandlers.CategoryReviewDeeplinkInterceptor;
import ru.ozon.app.android.storefront.deeplinkhandlers.OzonWebViewDeeplinkInterceptor;
import ru.ozon.app.android.switchUser.SwitchUserDestinationInterceptor;
import ru.ozon.app.android.universalwidgets.failedExternalLinkRetry.deeplinkInterceptor.FailedExternalLinkRetryInterceptor;
import ru.ozon.app.android.utils.AppType;
import yZ.InterfaceC10874a;

/* loaded from: classes6.dex */
public final class DaggerApplicationComponent {

    private static final class ApplicationComponentImpl implements ApplicationComponent {
        private final AppType appType;
        private final Application application;
        private final ApplicationComponentImpl applicationComponentImpl;
        private final ApplicationModule applicationModule;
        private final Context context;
        private final Boolean debugFlag;
        private final DeviceType deviceType;
        private final EnvironmentModule environmentModule;
        private final FintechDependenciesModule fintechDependenciesModule;
        private final FlavorType flavorType;
        private final Boolean isShakerEnabled;
        private final Integer notificationIcon;
        private a<AndroidPlatformComponentConfig> provideAndroidPlatformComponentConfigProvider;
        private a<String> provideApiUrlProvider;
        private a<String> provideApiUrlSuffixProvider;
        private a<e> provideAppDomainProvider;
        private a<BaseApiUrlProvider> provideBaseUrlProvider;
        private a<GZ.a> provideCommonPageProvider;
        private a<CoreHosts> provideCoreHostsProvider;
        private a<InterfaceC10874a> provideCustomActivityNavigatorCheckerProvider;
        private a<c[]> provideDeeplinkInterceptorsProvider;
        private a<d[]> provideDestinationInterceptorsProvider;
        private a<EnvironmentService> provideEnvironmentServiceProvider;
        private a<FintechActivityLifecycleCallback> provideFintechActivityLifecycleCallbackProvider;
        private a<FintechUrls> provideFintechUrlsProvider;
        private a<String> provideMetricsDomainNameProvider;
        private a<NativePageDomainsInteractor> provideNativePageDomainsInteractorProvider;
        private a<C8475a.c> provideNavigationConfigProvider;
        private a<PDPHosts> providePDPHostsProvider;
        private a<PushComponentConfig> providePushComponentConfigProvider;
        private a<StorageComponentConfig> provideStorageComponentConfigProvider;
        private a<String> provideWebSocketLinkProvider;
        private final String pushNotificationsAppBuildType;
        private final String pushNotificationsAppName;

        private static final class SwitchingProvider<T> implements a<T> {
            private final ApplicationComponentImpl applicationComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92520id;

            SwitchingProvider(ApplicationComponentImpl applicationComponentImpl, int i11) {
                this.applicationComponentImpl = applicationComponentImpl;
                this.f92520id = i11;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Pc.a
            public T get() {
                switch (this.f92520id) {
                    case 0:
                        return (T) NavigationDependenciesModule_ProvideNavigationConfigFactory.provideNavigationConfig(this.applicationComponentImpl.appType, (NativePageDomainsInteractor) this.applicationComponentImpl.provideNativePageDomainsInteractorProvider.get());
                    case 1:
                        return (T) EnvironmentModule_ProvideNativePageDomainsInteractorFactory.provideNativePageDomainsInteractor(this.applicationComponentImpl.environmentModule, this.applicationComponentImpl.context);
                    case 2:
                        return (T) NavigationDependenciesModule_ProvideCommonPageProviderFactory.provideCommonPageProvider();
                    case 3:
                        return (T) NavigationDependenciesModule_ProvideCustomActivityNavigatorCheckerFactory.provideCustomActivityNavigatorChecker();
                    case 4:
                        return (T) NavigationDependenciesModule_ProvideDeeplinkInterceptorsFactory.provideDeeplinkInterceptors(this.applicationComponentImpl.limb2DeeplinkInterceptor(), this.applicationComponentImpl.bankGlobalDeeplinkInterceptor(), this.applicationComponentImpl.sourceGlobalDeeplinkInterceptor(), this.applicationComponentImpl.ozonTravelGlobalDeeplinkInterceptor(), new CategoryReviewDeeplinkInterceptor(), this.applicationComponentImpl.ozonFreshGlobalDeeplinkInterceptor(), this.applicationComponentImpl.ozonSelectGlobalDeeplinkInterceptor(), this.applicationComponentImpl.ozonWebViewDeeplinkInterceptor(), this.applicationComponentImpl.browserToWebViewGlobalDeeplinkInterceptor(), this.applicationComponentImpl.failedExternalLinkRetryInterceptor());
                    case 5:
                        return (T) FintechDependenciesModule_ProvideFintechActivityLifecycleCallbackFactory.provideFintechActivityLifecycleCallback(this.applicationComponentImpl.fintechDependenciesModule);
                    case 6:
                        return (T) NavigationDependenciesModule_ProvideDestinationInterceptorsFactory.provideDestinationInterceptors(this.applicationComponentImpl.switchUserDestinationInterceptor());
                    case 7:
                        return (T) ApplicationModule_ProvideStorageComponentConfigFactory.provideStorageComponentConfig(this.applicationComponentImpl.applicationModule);
                    case 8:
                        return (T) EnvironmentModule_ProvideEnvironmentServiceFactory.provideEnvironmentService(this.applicationComponentImpl.environmentModule, this.applicationComponentImpl.application, this.applicationComponentImpl.flavorType);
                    case 9:
                        return (T) ApplicationModule_ProvidePushComponentConfigFactory.providePushComponentConfig(this.applicationComponentImpl.applicationModule, this.applicationComponentImpl.pushNotificationsAppName, this.applicationComponentImpl.pushNotificationsAppBuildType, this.applicationComponentImpl.notificationIcon.intValue(), (e) this.applicationComponentImpl.provideAppDomainProvider.get(), this.applicationComponentImpl.appType);
                    case 10:
                        return (T) EnvironmentModule_ProvideAppDomainFactory.provideAppDomain(this.applicationComponentImpl.environmentModule, (CoreHosts) this.applicationComponentImpl.provideCoreHostsProvider.get());
                    case 11:
                        return (T) EnvironmentModule_ProvideCoreHostsFactory.provideCoreHosts(this.applicationComponentImpl.environmentModule, Jb.d.a(this.applicationComponentImpl.provideEnvironmentServiceProvider), this.applicationComponentImpl.appType);
                    case 12:
                        return (T) ApplicationModule_ProvideAndroidPlatformComponentConfigFactory.provideAndroidPlatformComponentConfig(this.applicationComponentImpl.applicationModule, this.applicationComponentImpl.debugFlag.booleanValue(), this.applicationComponentImpl.deviceType, this.applicationComponentImpl.flavorType);
                    case 13:
                        return (T) EnvironmentModule_ProvideWebSocketLinkFactory.provideWebSocketLink(this.applicationComponentImpl.environmentModule, (PDPHosts) this.applicationComponentImpl.providePDPHostsProvider.get());
                    case 14:
                        return (T) EnvironmentModule_ProvidePDPHostsFactory.providePDPHosts(this.applicationComponentImpl.environmentModule, (CoreHosts) this.applicationComponentImpl.provideCoreHostsProvider.get());
                    case 15:
                        return (T) EnvironmentModule_ProvideApiUrlSuffixFactory.provideApiUrlSuffix(this.applicationComponentImpl.environmentModule, (CoreHosts) this.applicationComponentImpl.provideCoreHostsProvider.get());
                    case 16:
                        return (T) EnvironmentModule_ProvideApiUrlFactory.provideApiUrl(this.applicationComponentImpl.environmentModule, (BaseApiUrlProvider) this.applicationComponentImpl.provideBaseUrlProvider.get());
                    case 17:
                        return (T) EnvironmentModule_ProvideBaseUrlProviderFactory.provideBaseUrlProvider(this.applicationComponentImpl.environmentModule, (CoreHosts) this.applicationComponentImpl.provideCoreHostsProvider.get());
                    case 18:
                        return (T) EnvironmentModule_ProvideMetricsDomainNameFactory.provideMetricsDomainName(this.applicationComponentImpl.environmentModule, (CoreHosts) this.applicationComponentImpl.provideCoreHostsProvider.get());
                    case 19:
                        return (T) EnvironmentModule_ProvideFintechUrlsFactory.provideFintechUrls(this.applicationComponentImpl.environmentModule, (CoreHosts) this.applicationComponentImpl.provideCoreHostsProvider.get());
                    default:
                        throw new AssertionError(this.f92520id);
                }
            }
        }

        /* synthetic */ ApplicationComponentImpl(ApplicationModule applicationModule, EnvironmentModule environmentModule, FintechDependenciesModule fintechDependenciesModule, Application application, Context context, FlavorType flavorType, Boolean bool, DeviceType deviceType, Boolean bool2, String str, String str2, Integer num, AppType appType, int i11) {
            this(applicationModule, environmentModule, fintechDependenciesModule, application, context, flavorType, bool, deviceType, bool2, str, str2, num, appType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BankGlobalDeeplinkInterceptor bankGlobalDeeplinkInterceptor() {
            return new BankGlobalDeeplinkInterceptor(this.application, this.provideFintechActivityLifecycleCallbackProvider.get());
        }

        private BarcodePushHandler barcodePushHandler() {
            return new BarcodePushHandler(this.application);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BrowserToWebViewGlobalDeeplinkInterceptor browserToWebViewGlobalDeeplinkInterceptor() {
            return new BrowserToWebViewGlobalDeeplinkInterceptor(this.application);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FailedExternalLinkRetryInterceptor failedExternalLinkRetryInterceptor() {
            return new FailedExternalLinkRetryInterceptor(this.application);
        }

        private void initialize(ApplicationModule applicationModule, EnvironmentModule environmentModule, FintechDependenciesModule fintechDependenciesModule, Application application, Context context, FlavorType flavorType, Boolean bool, DeviceType deviceType, Boolean bool2, String str, String str2, Integer num, AppType appType) {
            this.provideNativePageDomainsInteractorProvider = m.a(new SwitchingProvider(this.applicationComponentImpl, 1));
            this.provideNavigationConfigProvider = Jb.d.b(new SwitchingProvider(this.applicationComponentImpl, 0));
            this.provideCommonPageProvider = Jb.d.b(new SwitchingProvider(this.applicationComponentImpl, 2));
            this.provideCustomActivityNavigatorCheckerProvider = Jb.d.b(new SwitchingProvider(this.applicationComponentImpl, 3));
            this.provideFintechActivityLifecycleCallbackProvider = Jb.d.b(new SwitchingProvider(this.applicationComponentImpl, 5));
            this.provideDeeplinkInterceptorsProvider = Jb.d.b(new SwitchingProvider(this.applicationComponentImpl, 4));
            this.provideDestinationInterceptorsProvider = Jb.d.b(new SwitchingProvider(this.applicationComponentImpl, 6));
            this.provideStorageComponentConfigProvider = Jb.d.b(new SwitchingProvider(this.applicationComponentImpl, 7));
            this.provideEnvironmentServiceProvider = Jb.d.b(new SwitchingProvider(this.applicationComponentImpl, 8));
            this.provideCoreHostsProvider = Jb.d.b(new SwitchingProvider(this.applicationComponentImpl, 11));
            this.provideAppDomainProvider = Jb.d.b(new SwitchingProvider(this.applicationComponentImpl, 10));
            this.providePushComponentConfigProvider = Jb.d.b(new SwitchingProvider(this.applicationComponentImpl, 9));
            this.provideAndroidPlatformComponentConfigProvider = Jb.d.b(new SwitchingProvider(this.applicationComponentImpl, 12));
            this.providePDPHostsProvider = Jb.d.b(new SwitchingProvider(this.applicationComponentImpl, 14));
            this.provideWebSocketLinkProvider = Jb.d.b(new SwitchingProvider(this.applicationComponentImpl, 13));
            this.provideApiUrlSuffixProvider = Jb.d.b(new SwitchingProvider(this.applicationComponentImpl, 15));
            this.provideBaseUrlProvider = Jb.d.b(new SwitchingProvider(this.applicationComponentImpl, 17));
            this.provideApiUrlProvider = Jb.d.b(new SwitchingProvider(this.applicationComponentImpl, 16));
            this.provideMetricsDomainNameProvider = Jb.d.b(new SwitchingProvider(this.applicationComponentImpl, 18));
            this.provideFintechUrlsProvider = Jb.d.b(new SwitchingProvider(this.applicationComponentImpl, 19));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Limb2DeeplinkInterceptor limb2DeeplinkInterceptor() {
            return new Limb2DeeplinkInterceptor(this.context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public OzonFreshGlobalDeeplinkInterceptor ozonFreshGlobalDeeplinkInterceptor() {
            return new OzonFreshGlobalDeeplinkInterceptor(this.context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public OzonSelectGlobalDeeplinkInterceptor ozonSelectGlobalDeeplinkInterceptor() {
            return new OzonSelectGlobalDeeplinkInterceptor(this.context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public OzonTravelGlobalDeeplinkInterceptor ozonTravelGlobalDeeplinkInterceptor() {
            return new OzonTravelGlobalDeeplinkInterceptor(this.context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public OzonWebViewDeeplinkInterceptor ozonWebViewDeeplinkInterceptor() {
            return new OzonWebViewDeeplinkInterceptor(this.application);
        }

        private eh0.d provideOzonBankPushHanlder() {
            return OzonBankPushHandlerModule_Companion_ProvideOzonBankPushHanlderFactory.provideOzonBankPushHanlder(this.application);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SourceGlobalDeeplinkInterceptor sourceGlobalDeeplinkInterceptor() {
            return new SourceGlobalDeeplinkInterceptor(this.context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SwitchUserDestinationInterceptor switchUserDestinationInterceptor() {
            return new SwitchUserDestinationInterceptor(this.context);
        }

        private TeensModePushHandler teensModePushHandler() {
            return new TeensModePushHandler(this.application);
        }

        @Override // ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies
        public AndroidPlatformComponentConfig getAndroidPlatformComponentConfig() {
            return this.provideAndroidPlatformComponentConfigProvider.get();
        }

        @Override // ru.ozon.app.android.di.component.ApplicationComponent
        public String getApiUrlSuffix() {
            return this.provideApiUrlSuffixProvider.get();
        }

        @Override // ru.ozon.app.android.di.component.ApplicationComponent
        public e getAppDomain() {
            return this.provideAppDomainProvider.get();
        }

        @Override // ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies
        public AppType getAppType() {
            return this.appType;
        }

        @Override // ru.ozon.app.android.di.provider.component.ContextComponentDependencies
        public Application getApplication() {
            return this.application;
        }

        @Override // ru.ozon.app.android.navigation.di.NavigationComponentDependencies
        public GZ.a getCommonPageProvider() {
            return this.provideCommonPageProvider.get();
        }

        @Override // ru.ozon.app.android.di.provider.component.ContextComponentDependencies
        public Context getContext() {
            return this.context;
        }

        @Override // ru.ozon.app.android.navigation.di.NavigationComponentDependencies
        public InterfaceC10874a getCustomActivityNavigatorChecker() {
            return this.provideCustomActivityNavigatorCheckerProvider.get();
        }

        @Override // ru.ozon.app.android.di.component.ApplicationComponent
        public boolean getDebugFlag() {
            return this.debugFlag.booleanValue();
        }

        @Override // ru.ozon.app.android.di.component.ApplicationComponent
        public DeviceType getDeviceType() {
            return this.deviceType;
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentDependencies
        public EnvironmentService getEnvironmentService() {
            return this.provideEnvironmentServiceProvider.get();
        }

        @Override // ru.ozon.app.android.injection.IDaggerComponentDependencies
        public FintechActivityLifecycleCallback getFintechActivityLifecycleCallback() {
            return this.provideFintechActivityLifecycleCallbackProvider.get();
        }

        @Override // ru.ozon.app.android.di.component.ApplicationComponent
        public FintechUrls getFintechUrls() {
            return this.provideFintechUrlsProvider.get();
        }

        @Override // ru.ozon.app.android.injection.IDaggerComponentDependencies
        public FlavorType getFlavorType() {
            return this.flavorType;
        }

        @Override // ru.ozon.app.android.navigation.di.NavigationComponentDependencies
        public c[] getGlobalDeeplinkInterceptors() {
            return this.provideDeeplinkInterceptorsProvider.get();
        }

        @Override // ru.ozon.app.android.navigation.di.NavigationComponentDependencies
        public d[] getGlobalDestinationInterceptors() {
            return this.provideDestinationInterceptorsProvider.get();
        }

        @Override // ru.ozon.app.android.di.component.ApplicationComponent
        public String getMetricsDomainName() {
            return this.provideMetricsDomainNameProvider.get();
        }

        @Override // ru.ozon.app.android.navigation.di.NavigationComponentDependencies
        public NativePageDomainsInteractor getNativePageDomainsInteractor() {
            return this.provideNativePageDomainsInteractorProvider.get();
        }

        @Override // ru.ozon.app.android.navigation.di.NavigationComponentDependencies
        public C8475a.c getNavigationConfig() {
            return this.provideNavigationConfigProvider.get();
        }

        @Override // ru.ozon.app.android.push.di.PushComponentDependencies
        public Set<eh0.d> getPreShowNotificationsHandler() {
            return A.E(provideOzonBankPushHanlder(), barcodePushHandler(), teensModePushHandler());
        }

        @Override // ru.ozon.app.android.push.di.PushComponentDependencies
        public PushComponentConfig getPushComponentConfig() {
            return this.providePushComponentConfigProvider.get();
        }

        @Override // ru.ozon.app.android.di.component.ApplicationComponent
        public boolean getShaker() {
            return this.isShakerEnabled.booleanValue();
        }

        @Override // ru.ozon.app.android.di.component.ApplicationComponent
        public String getStaticApiUrl() {
            return this.provideApiUrlProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentDependencies
        public StorageComponentConfig getStorageComponentConfig() {
            return this.provideStorageComponentConfigProvider.get();
        }

        @Override // ru.ozon.app.android.injection.IDaggerComponentDependencies
        public String getWebSocketLink() {
            return this.provideWebSocketLinkProvider.get();
        }

        private ApplicationComponentImpl(ApplicationModule applicationModule, EnvironmentModule environmentModule, FintechDependenciesModule fintechDependenciesModule, Application application, Context context, FlavorType flavorType, Boolean bool, DeviceType deviceType, Boolean bool2, String str, String str2, Integer num, AppType appType) {
            this.applicationComponentImpl = this;
            this.context = context;
            this.application = application;
            this.appType = appType;
            this.environmentModule = environmentModule;
            this.fintechDependenciesModule = fintechDependenciesModule;
            this.applicationModule = applicationModule;
            this.flavorType = flavorType;
            this.pushNotificationsAppName = str;
            this.pushNotificationsAppBuildType = str2;
            this.notificationIcon = num;
            this.debugFlag = bool;
            this.deviceType = deviceType;
            this.isShakerEnabled = bool2;
            initialize(applicationModule, environmentModule, fintechDependenciesModule, application, context, flavorType, bool, deviceType, bool2, str, str2, num, appType);
        }
    }

    private static final class Factory implements ApplicationComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.di.component.ApplicationComponent.Factory
        public ApplicationComponent create(Application application, Context context, FlavorType flavorType, boolean z11, DeviceType deviceType, boolean z12, String str, String str2, int i11, AppType appType) {
            application.getClass();
            context.getClass();
            flavorType.getClass();
            deviceType.getClass();
            str.getClass();
            str2.getClass();
            appType.getClass();
            return new ApplicationComponentImpl(new ApplicationModule(), new EnvironmentModule(), new FintechDependenciesModule(), application, context, flavorType, Boolean.valueOf(z11), deviceType, Boolean.valueOf(z12), str, str2, Integer.valueOf(i11), appType, 0);
        }

        private Factory() {
        }
    }

    public static ApplicationComponent.Factory factory() {
        return new Factory(0);
    }
}
