package ru.ozon.app.android.storage.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.storage.OzonDatabase;
import ru.ozon.app.android.storage.adult.AdultState;
import ru.ozon.app.android.storage.adult.AdultStateImpl;
import ru.ozon.app.android.storage.adult.AdultStateStore;
import ru.ozon.app.android.storage.adult.AdultStateStoreImpl;
import ru.ozon.app.android.storage.analytics.WidgetLayoutTimeMetricsStorage;
import ru.ozon.app.android.storage.analytics.WidgetLayoutTimeMetricsStorageImpl;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.appversion.AppVersionStorageImpl;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.storage.auth.AuthStateStorageImpl;
import ru.ozon.app.android.storage.auth.AuthTokenDataSource;
import ru.ozon.app.android.storage.auth.AuthTokenDataSourceImpl;
import ru.ozon.app.android.storage.auth.OzonIdCookieEvents;
import ru.ozon.app.android.storage.bugReport.BugReportCookieState;
import ru.ozon.app.android.storage.cookiePreference.ExtraCookieStorage;
import ru.ozon.app.android.storage.cookiePreference.ExtraCookieStorageImpl;
import ru.ozon.app.android.storage.cookiePreference.RefreshByGenderCookieEvents;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import ru.ozon.app.android.storage.debug.DebugToolsServiceImpl;
import ru.ozon.app.android.storage.debug.DebugToolsStorage;
import ru.ozon.app.android.storage.debug.DebugToolsStorageImpl;
import ru.ozon.app.android.storage.device.ApplicationInfoDataSource;
import ru.ozon.app.android.storage.device.ApplicationInfoDataSourceImpl;
import ru.ozon.app.android.storage.di.StorageComponent;
import ru.ozon.app.android.storage.di.module.StorageModule;
import ru.ozon.app.android.storage.di.module.StorageModule_ProvideBundleStateDaoFactory;
import ru.ozon.app.android.storage.di.module.StorageModule_ProvideEncryptedSharedPreferencesFactory;
import ru.ozon.app.android.storage.di.module.StorageModule_ProvideNetworkHistoryDaoFactory;
import ru.ozon.app.android.storage.di.module.StorageModule_ProvideOzonDatabaseFactory;
import ru.ozon.app.android.storage.di.module.StorageModule_ProvideSellerFavoriteDaoFactory;
import ru.ozon.app.android.storage.di.module.StorageModule_ProvideSharedPreferencesFactory;
import ru.ozon.app.android.storage.entity.bundle.BundleStateDao;
import ru.ozon.app.android.storage.entity.network.NetworkHistoryDao;
import ru.ozon.app.android.storage.entity.sellerfavorites.SellerFavoriteDao;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.extraHeaders.ExtraHeadersDataSource;
import ru.ozon.app.android.storage.extraHeaders.ExtraHeadersDataSourceImpl;
import ru.ozon.app.android.storage.failedExternalLink.FailedExternalLinkStorage;
import ru.ozon.app.android.storage.failedExternalLink.FailedExternalLinkStorageImpl;
import ru.ozon.app.android.storage.firstLaunch.FirstLaunchStateStorage;
import ru.ozon.app.android.storage.firstLaunch.FirstLaunchStateStorageImpl;
import ru.ozon.app.android.storage.logging.HttpLoggingLevelStorage;
import ru.ozon.app.android.storage.logging.HttpLoggingLevelStorageImpl;
import ru.ozon.app.android.storage.railwaymock.RailwayMockStorage;
import ru.ozon.app.android.storage.railwaymock.RailwayMockStorageImpl;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.storage.startupArgs.StartupArgsServiceImpl;
import ru.ozon.app.android.storage.subscribeAuthor.SubscribeAuthorsIdStorage;
import ru.ozon.app.android.storage.subscribeAuthor.SubscribeAuthorsIdStorageImpl;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;
import ru.ozon.app.android.storage.teensMode.TeensModeStorageImpl;
import ru.ozon.app.android.storage.user.UserStatusStorage;
import ru.ozon.app.android.storage.user.UserStatusStorageImpl;

/* loaded from: classes7.dex */
public final class DaggerStorageComponent {

    private static final class Factory implements StorageComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponent.Factory
        public StorageComponent create(ContextComponentDependencies contextComponentDependencies, StorageComponentDependencies storageComponentDependencies, Limb2ComponentApi limb2ComponentApi) {
            contextComponentDependencies.getClass();
            storageComponentDependencies.getClass();
            limb2ComponentApi.getClass();
            return new StorageComponentImpl(new StorageModule(), contextComponentDependencies, storageComponentDependencies, limb2ComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class StorageComponentImpl implements StorageComponent {
        private a<AdultStateImpl> adultStateImplProvider;
        private a<AdultStateStoreImpl> adultStateStoreImplProvider;
        private a<AppVersionStorageImpl> appVersionStorageImplProvider;
        private a<ApplicationInfoDataSourceImpl> applicationInfoDataSourceImplProvider;
        private a<AuthStateStorageImpl> authStateStorageImplProvider;
        private a<AuthTokenDataSourceImpl> authTokenDataSourceImplProvider;
        private a<AdultState> bindAdultStateProvider;
        private a<AdultStateStore> bindAdultStoreProvider;
        private a<AppVersionStorage> bindAppVersionProvider;
        private a<ApplicationInfoDataSource> bindApplicationInfoDataSourceProvider;
        private a<WidgetLayoutTimeMetricsStorage> bindAsyncWidgetLayoutMetricsStorageProvider;
        private a<AuthStateStorage> bindAuthManagerProvider;
        private a<AuthTokenDataSource> bindAuthTokenDataSourceProvider;
        private a<DebugToolsService> bindDebugToolsServiceProvider;
        private a<DebugToolsStorage> bindDebugToolsStorageProvider;
        private a<EnvironmentService> bindEnvironmentServiceProvider;
        private a<ExtraCookieStorage> bindExtraCookieStorageProvider;
        private a<ExtraHeadersDataSource> bindExtraHeadersDataSourceProvider;
        private a<FailedExternalLinkStorage> bindFailedExternalPageStorageProvider;
        private a<FirstLaunchStateStorage> bindFirstLaunchStateStorageProvider;
        private a<HttpLoggingLevelStorage> bindHttpLoggingLevelStorageProvider;
        private a<RailwayMockStorage> bindRailwayMockStorageProvider;
        private a<StartupArgsService> bindStartupArgsServiceProvider;
        private a<SubscribeAuthorsIdStorage> bindSubscribeAuthorsIdStorageProvider;
        private a<TeensModeStorage> bindTeensModeStorageProvider;
        private a<UserStatusStorage> bindUserStatusAccessHelperProvider;
        private a<BugReportCookieState> bugReportCookieStateProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private a<DebugToolsServiceImpl> debugToolsServiceImplProvider;
        private a<DebugToolsStorageImpl> debugToolsStorageImplProvider;
        private a<ExtraCookieStorageImpl> extraCookieStorageImplProvider;
        private a<ExtraHeadersDataSourceImpl> extraHeadersDataSourceImplProvider;
        private a<FailedExternalLinkStorageImpl> failedExternalLinkStorageImplProvider;
        private a<FirstLaunchStateStorageImpl> firstLaunchStateStorageImplProvider;
        private a<EnvironmentService> getEnvironmentServiceProvider;
        private a<HttpLoggingLevelStorageImpl> httpLoggingLevelStorageImplProvider;
        private a<OzonIdCookieEvents> ozonIdCookieEventsProvider;
        private a<BundleStateDao> provideBundleStateDaoProvider;
        private a<SharedPreferences> provideEncryptedSharedPreferencesProvider;
        private a<NetworkHistoryDao> provideNetworkHistoryDaoProvider;
        private a<OzonDatabase> provideOzonDatabaseProvider;
        private a<SellerFavoriteDao> provideSellerFavoriteDaoProvider;
        private a<SharedPreferences> provideSharedPreferencesProvider;
        private a<RailwayMockStorageImpl> railwayMockStorageImplProvider;
        private a<RefreshByGenderCookieEvents> refreshByGenderCookieEventsProvider;
        private a<StartupArgsServiceImpl> startupArgsServiceImplProvider;
        private final StorageComponentDependencies storageComponentDependencies;
        private final StorageComponentImpl storageComponentImpl;
        private final StorageModule storageModule;
        private a<SubscribeAuthorsIdStorageImpl> subscribeAuthorsIdStorageImplProvider;
        private a<TeensModeStorageImpl> teensModeStorageImplProvider;
        private a<UserStatusStorageImpl> userStatusStorageImplProvider;
        private a<WidgetLayoutTimeMetricsStorageImpl> widgetLayoutTimeMetricsStorageImplProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f93500id;
            private final StorageComponentImpl storageComponentImpl;

            SwitchingProvider(StorageComponentImpl storageComponentImpl, int i11) {
                this.storageComponentImpl = storageComponentImpl;
                this.f93500id = i11;
            }

            @Override // Pc.a
            public T get() {
                switch (this.f93500id) {
                    case 0:
                        StorageModule storageModule = this.storageComponentImpl.storageModule;
                        Context context = this.storageComponentImpl.contextComponentDependencies.getContext();
                        j.c(context);
                        return (T) StorageModule_ProvideSharedPreferencesFactory.provideSharedPreferences(storageModule, context);
                    case 1:
                        StorageModule storageModule2 = this.storageComponentImpl.storageModule;
                        Context context2 = this.storageComponentImpl.contextComponentDependencies.getContext();
                        j.c(context2);
                        return (T) StorageModule_ProvideEncryptedSharedPreferencesFactory.provideEncryptedSharedPreferences(storageModule2, context2);
                    case 2:
                        Context context3 = this.storageComponentImpl.contextComponentDependencies.getContext();
                        j.c(context3);
                        StorageComponentConfig storageComponentConfig = this.storageComponentImpl.storageComponentDependencies.getStorageComponentConfig();
                        j.c(storageComponentConfig);
                        return (T) new AppVersionStorageImpl(context3, storageComponentConfig);
                    case 3:
                        Context context4 = this.storageComponentImpl.contextComponentDependencies.getContext();
                        j.c(context4);
                        StorageComponentConfig storageComponentConfig2 = this.storageComponentImpl.storageComponentDependencies.getStorageComponentConfig();
                        j.c(storageComponentConfig2);
                        return (T) new DebugToolsServiceImpl(context4, storageComponentConfig2);
                    case 4:
                        return (T) new UserStatusStorageImpl((SharedPreferences) this.storageComponentImpl.provideSharedPreferencesProvider.get());
                    case 5:
                        OzonIdCookieEvents ozonIdCookieEvents = (OzonIdCookieEvents) this.storageComponentImpl.ozonIdCookieEventsProvider.get();
                        Context context5 = this.storageComponentImpl.contextComponentDependencies.getContext();
                        j.c(context5);
                        return (T) new AuthStateStorageImpl(ozonIdCookieEvents, context5);
                    case 6:
                        return (T) new OzonIdCookieEvents();
                    case 7:
                        OzonIdCookieEvents ozonIdCookieEvents2 = (OzonIdCookieEvents) this.storageComponentImpl.ozonIdCookieEventsProvider.get();
                        Context context6 = this.storageComponentImpl.contextComponentDependencies.getContext();
                        j.c(context6);
                        return (T) new AuthTokenDataSourceImpl(ozonIdCookieEvents2, context6);
                    case 8:
                        return (T) new FirstLaunchStateStorageImpl((SharedPreferences) this.storageComponentImpl.provideSharedPreferencesProvider.get());
                    case 9:
                        return (T) new ApplicationInfoDataSourceImpl((SharedPreferences) this.storageComponentImpl.provideEncryptedSharedPreferencesProvider.get());
                    case 10:
                        Context context7 = this.storageComponentImpl.contextComponentDependencies.getContext();
                        j.c(context7);
                        return (T) new AdultStateImpl(context7);
                    case 11:
                        return (T) new AdultStateStoreImpl((SharedPreferences) this.storageComponentImpl.provideSharedPreferencesProvider.get());
                    case 12:
                        return (T) new TeensModeStorageImpl((SharedPreferences) this.storageComponentImpl.provideSharedPreferencesProvider.get());
                    case 13:
                        return (T) new ExtraCookieStorageImpl();
                    case 14:
                        return (T) new DebugToolsStorageImpl((SharedPreferences) this.storageComponentImpl.provideSharedPreferencesProvider.get());
                    case 15:
                        Context context8 = this.storageComponentImpl.contextComponentDependencies.getContext();
                        j.c(context8);
                        return (T) new ExtraHeadersDataSourceImpl(context8);
                    case 16:
                        return (T) StorageModule_ProvideNetworkHistoryDaoFactory.provideNetworkHistoryDao(this.storageComponentImpl.storageModule, (OzonDatabase) this.storageComponentImpl.provideOzonDatabaseProvider.get());
                    case 17:
                        StorageModule storageModule3 = this.storageComponentImpl.storageModule;
                        Context context9 = this.storageComponentImpl.contextComponentDependencies.getContext();
                        j.c(context9);
                        return (T) StorageModule_ProvideOzonDatabaseFactory.provideOzonDatabase(storageModule3, context9);
                    case 18:
                        return (T) StorageModule_ProvideSellerFavoriteDaoFactory.provideSellerFavoriteDao(this.storageComponentImpl.storageModule, (OzonDatabase) this.storageComponentImpl.provideOzonDatabaseProvider.get());
                    case 19:
                        return (T) StorageModule_ProvideBundleStateDaoFactory.provideBundleStateDao(this.storageComponentImpl.storageModule, (OzonDatabase) this.storageComponentImpl.provideOzonDatabaseProvider.get());
                    case 20:
                        return (T) new HttpLoggingLevelStorageImpl((SharedPreferences) this.storageComponentImpl.provideSharedPreferencesProvider.get());
                    case 21:
                        T t2 = (T) this.storageComponentImpl.storageComponentDependencies.getEnvironmentService();
                        j.c(t2);
                        return t2;
                    case 22:
                        Context context10 = this.storageComponentImpl.contextComponentDependencies.getContext();
                        j.c(context10);
                        return (T) new RailwayMockStorageImpl(context10);
                    case 23:
                        return (T) new RefreshByGenderCookieEvents();
                    case 24:
                        return (T) new SubscribeAuthorsIdStorageImpl();
                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                        Context context11 = this.storageComponentImpl.contextComponentDependencies.getContext();
                        j.c(context11);
                        return (T) new StartupArgsServiceImpl(context11);
                    case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                        return (T) new WidgetLayoutTimeMetricsStorageImpl();
                    case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        return (T) new BugReportCookieState((AuthStateStorage) this.storageComponentImpl.bindAuthManagerProvider.get());
                    case 28:
                        return (T) new FailedExternalLinkStorageImpl((SharedPreferences) this.storageComponentImpl.provideSharedPreferencesProvider.get());
                    default:
                        throw new AssertionError(this.f93500id);
                }
            }
        }

        /* synthetic */ StorageComponentImpl(StorageModule storageModule, ContextComponentDependencies contextComponentDependencies, StorageComponentDependencies storageComponentDependencies, Limb2ComponentApi limb2ComponentApi, int i11) {
            this(storageModule, contextComponentDependencies, storageComponentDependencies, limb2ComponentApi);
        }

        private void initialize(StorageModule storageModule, ContextComponentDependencies contextComponentDependencies, StorageComponentDependencies storageComponentDependencies, Limb2ComponentApi limb2ComponentApi) {
            this.provideSharedPreferencesProvider = d.b(new SwitchingProvider(this.storageComponentImpl, 0));
            this.provideEncryptedSharedPreferencesProvider = d.b(new SwitchingProvider(this.storageComponentImpl, 1));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.storageComponentImpl, 2);
            this.appVersionStorageImplProvider = switchingProvider;
            this.bindAppVersionProvider = d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.storageComponentImpl, 3);
            this.debugToolsServiceImplProvider = switchingProvider2;
            this.bindDebugToolsServiceProvider = d.b(switchingProvider2);
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.storageComponentImpl, 4);
            this.userStatusStorageImplProvider = switchingProvider3;
            this.bindUserStatusAccessHelperProvider = d.b(switchingProvider3);
            this.ozonIdCookieEventsProvider = d.b(new SwitchingProvider(this.storageComponentImpl, 6));
            SwitchingProvider switchingProvider4 = new SwitchingProvider(this.storageComponentImpl, 5);
            this.authStateStorageImplProvider = switchingProvider4;
            this.bindAuthManagerProvider = d.b(switchingProvider4);
            SwitchingProvider switchingProvider5 = new SwitchingProvider(this.storageComponentImpl, 7);
            this.authTokenDataSourceImplProvider = switchingProvider5;
            this.bindAuthTokenDataSourceProvider = d.b(switchingProvider5);
            SwitchingProvider switchingProvider6 = new SwitchingProvider(this.storageComponentImpl, 8);
            this.firstLaunchStateStorageImplProvider = switchingProvider6;
            this.bindFirstLaunchStateStorageProvider = d.b(switchingProvider6);
            SwitchingProvider switchingProvider7 = new SwitchingProvider(this.storageComponentImpl, 9);
            this.applicationInfoDataSourceImplProvider = switchingProvider7;
            this.bindApplicationInfoDataSourceProvider = d.b(switchingProvider7);
            SwitchingProvider switchingProvider8 = new SwitchingProvider(this.storageComponentImpl, 10);
            this.adultStateImplProvider = switchingProvider8;
            this.bindAdultStateProvider = d.b(switchingProvider8);
            SwitchingProvider switchingProvider9 = new SwitchingProvider(this.storageComponentImpl, 11);
            this.adultStateStoreImplProvider = switchingProvider9;
            this.bindAdultStoreProvider = d.b(switchingProvider9);
            SwitchingProvider switchingProvider10 = new SwitchingProvider(this.storageComponentImpl, 12);
            this.teensModeStorageImplProvider = switchingProvider10;
            this.bindTeensModeStorageProvider = d.b(switchingProvider10);
            SwitchingProvider switchingProvider11 = new SwitchingProvider(this.storageComponentImpl, 13);
            this.extraCookieStorageImplProvider = switchingProvider11;
            this.bindExtraCookieStorageProvider = d.b(switchingProvider11);
            SwitchingProvider switchingProvider12 = new SwitchingProvider(this.storageComponentImpl, 14);
            this.debugToolsStorageImplProvider = switchingProvider12;
            this.bindDebugToolsStorageProvider = d.b(switchingProvider12);
            SwitchingProvider switchingProvider13 = new SwitchingProvider(this.storageComponentImpl, 15);
            this.extraHeadersDataSourceImplProvider = switchingProvider13;
            this.bindExtraHeadersDataSourceProvider = d.b(switchingProvider13);
            this.provideOzonDatabaseProvider = d.b(new SwitchingProvider(this.storageComponentImpl, 17));
            this.provideNetworkHistoryDaoProvider = d.b(new SwitchingProvider(this.storageComponentImpl, 16));
            this.provideSellerFavoriteDaoProvider = d.b(new SwitchingProvider(this.storageComponentImpl, 18));
            this.provideBundleStateDaoProvider = d.b(new SwitchingProvider(this.storageComponentImpl, 19));
            SwitchingProvider switchingProvider14 = new SwitchingProvider(this.storageComponentImpl, 20);
            this.httpLoggingLevelStorageImplProvider = switchingProvider14;
            this.bindHttpLoggingLevelStorageProvider = d.b(switchingProvider14);
            SwitchingProvider switchingProvider15 = new SwitchingProvider(this.storageComponentImpl, 21);
            this.getEnvironmentServiceProvider = switchingProvider15;
            this.bindEnvironmentServiceProvider = d.b(switchingProvider15);
            SwitchingProvider switchingProvider16 = new SwitchingProvider(this.storageComponentImpl, 22);
            this.railwayMockStorageImplProvider = switchingProvider16;
            this.bindRailwayMockStorageProvider = d.b(switchingProvider16);
            this.refreshByGenderCookieEventsProvider = d.b(new SwitchingProvider(this.storageComponentImpl, 23));
            SwitchingProvider switchingProvider17 = new SwitchingProvider(this.storageComponentImpl, 24);
            this.subscribeAuthorsIdStorageImplProvider = switchingProvider17;
            this.bindSubscribeAuthorsIdStorageProvider = d.b(switchingProvider17);
            SwitchingProvider switchingProvider18 = new SwitchingProvider(this.storageComponentImpl, 25);
            this.startupArgsServiceImplProvider = switchingProvider18;
            this.bindStartupArgsServiceProvider = d.b(switchingProvider18);
            SwitchingProvider switchingProvider19 = new SwitchingProvider(this.storageComponentImpl, 26);
            this.widgetLayoutTimeMetricsStorageImplProvider = switchingProvider19;
            this.bindAsyncWidgetLayoutMetricsStorageProvider = d.b(switchingProvider19);
            this.bugReportCookieStateProvider = d.b(new SwitchingProvider(this.storageComponentImpl, 27));
            SwitchingProvider switchingProvider20 = new SwitchingProvider(this.storageComponentImpl, 28);
            this.failedExternalLinkStorageImplProvider = switchingProvider20;
            this.bindFailedExternalPageStorageProvider = d.b(switchingProvider20);
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public AdultState getAdultState() {
            return this.bindAdultStateProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public AdultStateStore getAdultStore() {
            return this.bindAdultStoreProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public AppVersionStorage getAppVersionStorage() {
            return this.bindAppVersionProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public ApplicationInfoDataSource getApplicationInfoStorage() {
            return this.bindApplicationInfoDataSourceProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public AuthStateStorage getAuthStateStorage() {
            return this.bindAuthManagerProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public AuthTokenDataSource getAuthTokenDataSource() {
            return this.bindAuthTokenDataSourceProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public BugReportCookieState getBugReportCookieState() {
            return this.bugReportCookieStateProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public BundleStateDao getBundleStateDao() {
            return this.provideBundleStateDaoProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public DebugToolsService getDebugToolService() {
            return this.bindDebugToolsServiceProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public DebugToolsStorage getDebugToolsStorage() {
            return this.bindDebugToolsStorageProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public SharedPreferences getEncryptedSharedPreferences() {
            return this.provideEncryptedSharedPreferencesProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public EnvironmentService getEnvironmentService() {
            return this.bindEnvironmentServiceProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public ExtraCookieStorage getExtraCookieStorage() {
            return this.bindExtraCookieStorageProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public ExtraHeadersDataSource getExtraHeadersDataSource() {
            return this.bindExtraHeadersDataSourceProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public FailedExternalLinkStorage getFailedExternalPageStorage() {
            return this.bindFailedExternalPageStorageProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public FirstLaunchStateStorage getFirstLaunchStateStorage() {
            return this.bindFirstLaunchStateStorageProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public HttpLoggingLevelStorage getHttpLoggingLevelStorage() {
            return this.bindHttpLoggingLevelStorageProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public NetworkHistoryDao getNetworkHistoryDao() {
            return this.provideNetworkHistoryDaoProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public OzonIdCookieEvents getOzonIdCookieEvents() {
            return this.ozonIdCookieEventsProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public RailwayMockStorage getRailwayMockStorage() {
            return this.bindRailwayMockStorageProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public RefreshByGenderCookieEvents getRefreshByGenderCookieEvents() {
            return this.refreshByGenderCookieEventsProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public SellerFavoriteDao getSellerFavoriteDao() {
            return this.provideSellerFavoriteDaoProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public SharedPreferences getSharedPreferences() {
            return this.provideSharedPreferencesProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public StartupArgsService getStartupArgsService() {
            return this.bindStartupArgsServiceProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public SubscribeAuthorsIdStorage getSubscribeAuthorsIdStorage() {
            return this.bindSubscribeAuthorsIdStorageProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public TeensModeStorage getTeensModeStorage() {
            return this.bindTeensModeStorageProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public UserStatusStorage getUserStatusStorage() {
            return this.bindUserStatusAccessHelperProvider.get();
        }

        @Override // ru.ozon.app.android.storage.di.StorageComponentApi
        public WidgetLayoutTimeMetricsStorage getWidgetLayoutMetricsStorage() {
            return this.bindAsyncWidgetLayoutMetricsStorageProvider.get();
        }

        private StorageComponentImpl(StorageModule storageModule, ContextComponentDependencies contextComponentDependencies, StorageComponentDependencies storageComponentDependencies, Limb2ComponentApi limb2ComponentApi) {
            this.storageComponentImpl = this;
            this.storageModule = storageModule;
            this.contextComponentDependencies = contextComponentDependencies;
            this.storageComponentDependencies = storageComponentDependencies;
            initialize(storageModule, contextComponentDependencies, storageComponentDependencies, limb2ComponentApi);
        }
    }

    public static StorageComponent.Factory factory() {
        return new Factory(0);
    }
}
