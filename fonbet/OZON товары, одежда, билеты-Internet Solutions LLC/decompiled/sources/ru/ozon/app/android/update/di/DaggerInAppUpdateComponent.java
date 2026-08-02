package ru.ozon.app.android.update.di;

import Jb.d;
import Jb.j;
import Ld0.c;
import Pc.a;
import We.B;
import We.InterfaceC4875q;
import android.content.Context;
import android.content.SharedPreferences;
import ej.InterfaceC6376e;
import java.util.List;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.update.InAppUpdateController;
import ru.ozon.app.android.update.InAppUpdateControllerImpl;
import ru.ozon.app.android.update.InAppUpdateIntervalStorage;
import ru.ozon.app.android.update.InAppUpdateIntervalStorageImpl;
import ru.ozon.app.android.update.InAppUpdateRepository;
import ru.ozon.app.android.update.InAppUpdateRepositoryImpl;
import ru.ozon.app.android.update.analytics.InAppUpdateAnalyticsDelegate;
import ru.ozon.app.android.update.custom.CustomInAppUpdateRepository;
import ru.ozon.app.android.update.di.InAppUpdateComponent;
import ru.ozon.app.android.update.di.module.InAppUpdateModule_Companion_ProvideOzonInAppUpdateSdkManager$in_app_update_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.update.gp.GpInAppUpdateRepository;
import ru.ozon.app.android.update.rustore.RuStoreInAppUpdateRepository;

/* loaded from: classes7.dex */
public final class DaggerInAppUpdateComponent {

    private static final class Factory implements InAppUpdateComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.update.di.InAppUpdateComponent.Factory
        public InAppUpdateComponent create(NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, NavigationComponentApi navigationComponentApi, ContextComponentDependencies contextComponentDependencies, StorageComponentApi storageComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, InAppUpdateComponentDependencies inAppUpdateComponentDependencies) {
            networkComponentApi.getClass();
            networkOzonIdComponentApi.getClass();
            navigationComponentApi.getClass();
            contextComponentDependencies.getClass();
            storageComponentApi.getClass();
            analyticsComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            inAppUpdateComponentDependencies.getClass();
            return new InAppUpdateComponentImpl(networkComponentApi, networkOzonIdComponentApi, navigationComponentApi, contextComponentDependencies, storageComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, inAppUpdateComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class InAppUpdateComponentImpl implements InAppUpdateComponent {
        private final AnalyticsComponentApi analyticsComponentApi;
        private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
        private a<InAppUpdateRepository> bindInAppUpdateRepository$in_app_update_prodGoogleAllVendorsReleaseProvider;
        private a<InAppUpdateController> bindUpdateInstallHandler$in_app_update_prodGoogleAllVendorsReleaseProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private a<CustomInAppUpdateRepository> customInAppUpdateRepositoryProvider;
        private a<GpInAppUpdateRepository> gpInAppUpdateRepositoryProvider;
        private a<InAppUpdateAnalyticsDelegate> inAppUpdateAnalyticsDelegateProvider;
        private final InAppUpdateComponentDependencies inAppUpdateComponentDependencies;
        private final InAppUpdateComponentImpl inAppUpdateComponentImpl;
        private a<InAppUpdateControllerImpl> inAppUpdateControllerImplProvider;
        private a<InAppUpdateIntervalStorageImpl> inAppUpdateIntervalStorageImplProvider;
        private a<InAppUpdateRepositoryImpl> inAppUpdateRepositoryImplProvider;
        private final NetworkComponentApi networkComponentApi;
        private final NetworkOzonIdComponentApi networkOzonIdComponentApi;
        private a<InterfaceC6376e> provideOzonInAppUpdateSdkManager$in_app_update_prodGoogleAllVendorsReleaseProvider;
        private a<RuStoreInAppUpdateRepository> ruStoreInAppUpdateRepositoryProvider;
        private final StorageComponentApi storageComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f94577id;
            private final InAppUpdateComponentImpl inAppUpdateComponentImpl;

            SwitchingProvider(InAppUpdateComponentImpl inAppUpdateComponentImpl, int i11) {
                this.inAppUpdateComponentImpl = inAppUpdateComponentImpl;
                this.f94577id = i11;
            }

            @Override // Pc.a
            public T get() {
                switch (this.f94577id) {
                    case 0:
                        SharedPreferences sharedPreferences = this.inAppUpdateComponentImpl.storageComponentApi.getSharedPreferences();
                        j.c(sharedPreferences);
                        return (T) new InAppUpdateIntervalStorageImpl(sharedPreferences);
                    case 1:
                        return (T) new InAppUpdateControllerImpl((InAppUpdateIntervalStorage) this.inAppUpdateComponentImpl.inAppUpdateIntervalStorageImplProvider.get(), (InAppUpdateRepository) this.inAppUpdateComponentImpl.bindInAppUpdateRepository$in_app_update_prodGoogleAllVendorsReleaseProvider.get(), (InAppUpdateAnalyticsDelegate) this.inAppUpdateComponentImpl.inAppUpdateAnalyticsDelegateProvider.get());
                    case 2:
                        return (T) new InAppUpdateRepositoryImpl((RuStoreInAppUpdateRepository) this.inAppUpdateComponentImpl.ruStoreInAppUpdateRepositoryProvider.get());
                    case 3:
                        Context context = this.inAppUpdateComponentImpl.contextComponentDependencies.getContext();
                        j.c(context);
                        CustomInAppUpdateRepository customInAppUpdateRepository = (CustomInAppUpdateRepository) this.inAppUpdateComponentImpl.customInAppUpdateRepositoryProvider.get();
                        InAppUpdateIntervalStorage inAppUpdateIntervalStorage = (InAppUpdateIntervalStorage) this.inAppUpdateComponentImpl.inAppUpdateIntervalStorageImplProvider.get();
                        FeatureChecker featureChecker = this.inAppUpdateComponentImpl.networkComponentApi.getFeatureChecker();
                        j.c(featureChecker);
                        return (T) new RuStoreInAppUpdateRepository(context, customInAppUpdateRepository, inAppUpdateIntervalStorage, featureChecker, (InAppUpdateAnalyticsDelegate) this.inAppUpdateComponentImpl.inAppUpdateAnalyticsDelegateProvider.get());
                    case 4:
                        GpInAppUpdateRepository gpInAppUpdateRepository = (GpInAppUpdateRepository) this.inAppUpdateComponentImpl.gpInAppUpdateRepositoryProvider.get();
                        InAppUpdateIntervalStorage inAppUpdateIntervalStorage2 = (InAppUpdateIntervalStorage) this.inAppUpdateComponentImpl.inAppUpdateIntervalStorageImplProvider.get();
                        EnvironmentService environmentService = this.inAppUpdateComponentImpl.storageComponentApi.getEnvironmentService();
                        j.c(environmentService);
                        AppVersionService appVersionService = this.inAppUpdateComponentImpl.networkComponentApi.getAppVersionService();
                        j.c(appVersionService);
                        InterfaceC6376e interfaceC6376e = (InterfaceC6376e) this.inAppUpdateComponentImpl.provideOzonInAppUpdateSdkManager$in_app_update_prodGoogleAllVendorsReleaseProvider.get();
                        FeatureChecker featureChecker2 = this.inAppUpdateComponentImpl.networkComponentApi.getFeatureChecker();
                        j.c(featureChecker2);
                        InterfaceC4875q cookieJar = this.inAppUpdateComponentImpl.networkComponentApi.getCookieJar();
                        j.c(cookieJar);
                        List<B> ozonIdInterceptors = this.inAppUpdateComponentImpl.networkOzonIdComponentApi.getOzonIdInterceptors();
                        j.c(ozonIdInterceptors);
                        return (T) new CustomInAppUpdateRepository(gpInAppUpdateRepository, inAppUpdateIntervalStorage2, environmentService, appVersionService, interfaceC6376e, featureChecker2, cookieJar, ozonIdInterceptors);
                    case 5:
                        Context context2 = this.inAppUpdateComponentImpl.contextComponentDependencies.getContext();
                        j.c(context2);
                        return (T) new GpInAppUpdateRepository(context2, (InAppUpdateIntervalStorage) this.inAppUpdateComponentImpl.inAppUpdateIntervalStorageImplProvider.get(), (InAppUpdateAnalyticsDelegate) this.inAppUpdateComponentImpl.inAppUpdateAnalyticsDelegateProvider.get());
                    case 6:
                        AnalyticsDataLayer analyticsDataLayer = this.inAppUpdateComponentImpl.analyticsComponentApi.getAnalyticsDataLayer();
                        j.c(analyticsDataLayer);
                        PluginsManager pluginsManager = this.inAppUpdateComponentImpl.analyticsComponentApi.getPluginsManager();
                        j.c(pluginsManager);
                        Sg.a analyticsScreenStorage = this.inAppUpdateComponentImpl.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
                        j.c(analyticsScreenStorage);
                        return (T) new InAppUpdateAnalyticsDelegate(analyticsDataLayer, pluginsManager, analyticsScreenStorage);
                    case 7:
                        c ozonLimbDiStore = this.inAppUpdateComponentImpl.inAppUpdateComponentDependencies.ozonLimbDiStore();
                        j.c(ozonLimbDiStore);
                        return (T) InAppUpdateModule_Companion_ProvideOzonInAppUpdateSdkManager$in_app_update_prodGoogleAllVendorsReleaseFactory.provideOzonInAppUpdateSdkManager$in_app_update_prodGoogleAllVendorsRelease(ozonLimbDiStore);
                    default:
                        throw new AssertionError(this.f94577id);
                }
            }
        }

        /* synthetic */ InAppUpdateComponentImpl(NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, NavigationComponentApi navigationComponentApi, ContextComponentDependencies contextComponentDependencies, StorageComponentApi storageComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, InAppUpdateComponentDependencies inAppUpdateComponentDependencies, int i11) {
            this(networkComponentApi, networkOzonIdComponentApi, navigationComponentApi, contextComponentDependencies, storageComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, inAppUpdateComponentDependencies);
        }

        private void initialize(NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, NavigationComponentApi navigationComponentApi, ContextComponentDependencies contextComponentDependencies, StorageComponentApi storageComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, InAppUpdateComponentDependencies inAppUpdateComponentDependencies) {
            this.inAppUpdateIntervalStorageImplProvider = d.b(new SwitchingProvider(this.inAppUpdateComponentImpl, 0));
            this.inAppUpdateAnalyticsDelegateProvider = d.b(new SwitchingProvider(this.inAppUpdateComponentImpl, 6));
            this.gpInAppUpdateRepositoryProvider = d.b(new SwitchingProvider(this.inAppUpdateComponentImpl, 5));
            this.provideOzonInAppUpdateSdkManager$in_app_update_prodGoogleAllVendorsReleaseProvider = d.b(new SwitchingProvider(this.inAppUpdateComponentImpl, 7));
            this.customInAppUpdateRepositoryProvider = d.b(new SwitchingProvider(this.inAppUpdateComponentImpl, 4));
            this.ruStoreInAppUpdateRepositoryProvider = d.b(new SwitchingProvider(this.inAppUpdateComponentImpl, 3));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.inAppUpdateComponentImpl, 2);
            this.inAppUpdateRepositoryImplProvider = switchingProvider;
            this.bindInAppUpdateRepository$in_app_update_prodGoogleAllVendorsReleaseProvider = d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.inAppUpdateComponentImpl, 1);
            this.inAppUpdateControllerImplProvider = switchingProvider2;
            this.bindUpdateInstallHandler$in_app_update_prodGoogleAllVendorsReleaseProvider = d.b(switchingProvider2);
        }

        @Override // ru.ozon.app.android.update.di.InAppUpdateComponentApi
        public InAppUpdateController getInAppUpdateController() {
            return this.bindUpdateInstallHandler$in_app_update_prodGoogleAllVendorsReleaseProvider.get();
        }

        @Override // ru.ozon.app.android.update.di.InAppUpdateComponentApi
        public InAppUpdateIntervalStorage getIntervalStorage() {
            return this.inAppUpdateIntervalStorageImplProvider.get();
        }

        private InAppUpdateComponentImpl(NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, NavigationComponentApi navigationComponentApi, ContextComponentDependencies contextComponentDependencies, StorageComponentApi storageComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, InAppUpdateComponentDependencies inAppUpdateComponentDependencies) {
            this.inAppUpdateComponentImpl = this;
            this.storageComponentApi = storageComponentApi;
            this.contextComponentDependencies = contextComponentDependencies;
            this.analyticsComponentApi = analyticsComponentApi;
            this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.inAppUpdateComponentDependencies = inAppUpdateComponentDependencies;
            this.networkOzonIdComponentApi = networkOzonIdComponentApi;
            initialize(networkComponentApi, networkOzonIdComponentApi, navigationComponentApi, contextComponentDependencies, storageComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, inAppUpdateComponentDependencies);
        }
    }

    public static InAppUpdateComponent.Factory factory() {
        return new Factory(0);
    }
}
