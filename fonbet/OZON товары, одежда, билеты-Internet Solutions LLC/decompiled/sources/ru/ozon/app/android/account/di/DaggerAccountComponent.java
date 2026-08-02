package ru.ozon.app.android.account.di;

import GZ.g;
import Jb.d;
import Jb.j;
import Pc.a;
import android.content.Context;
import retrofit2.Retrofit;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.presenter.AdultHandlerImpl;
import ru.ozon.app.android.account.auth.biometry.keystore.KeyStoreRepository;
import ru.ozon.app.android.account.auth.biometry.keystore.KeyStoreRepositoryImpl;
import ru.ozon.app.android.account.authEvents.AlreadyAuthEvents;
import ru.ozon.app.android.account.authEvents.AuthEventsCollector;
import ru.ozon.app.android.account.authEvents.AuthEventsCollectorImpl;
import ru.ozon.app.android.account.authEvents.api.OzonIdUserStatusApi;
import ru.ozon.app.android.account.authEvents.data.AuthStatusRepository;
import ru.ozon.app.android.account.authEvents.di.AuthEventsModule_Companion_ProvideUserStatusApi$account_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.account.coupon.ApplyCouponState;
import ru.ozon.app.android.account.coupon.ApplyCouponStateImpl;
import ru.ozon.app.android.account.currency.CurrencyRepository;
import ru.ozon.app.android.account.currency.CurrencyRepositoryImpl;
import ru.ozon.app.android.account.currency.CurrencyState;
import ru.ozon.app.android.account.currency.CurrencyStateImpl;
import ru.ozon.app.android.account.currency.api.CurrencyApi;
import ru.ozon.app.android.account.currency.di.CurrencyModule_Companion_ProvideCurrencyApiFactory;
import ru.ozon.app.android.account.di.AccountComponent;
import ru.ozon.app.android.account.eventBus.EmailActualizedEventBus;
import ru.ozon.app.android.account.eventBus.UserDataChangedEventBus;
import ru.ozon.app.android.account.events.WidgetEventService;
import ru.ozon.app.android.account.favorites.di.FavoriteModule_Companion_ProvideSellerFavoriteApiFactory;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteServiceImpl;
import ru.ozon.app.android.account.favorites.seller.api.SellerFavoriteApi;
import ru.ozon.app.android.account.locale.app.di.AppLocaleComponentApi;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.account.orders.OrderChangePreferencesImpl;
import ru.ozon.app.android.account.orders.OrdersCountStorage;
import ru.ozon.app.android.account.orders.OrdersCountStorageImpl;
import ru.ozon.app.android.account.orders.onorderchangenew.OrderChangeDataSource;
import ru.ozon.app.android.account.orders.onorderchangenew.OrderChangeDataSourceImpl;
import ru.ozon.app.android.account.orders.onorderchangenew.OrderChangeManager;
import ru.ozon.app.android.account.orders.onorderchangenew.OrderChangeManagerImpl;
import ru.ozon.app.android.account.session.SessionListUpdatedEventBus;
import ru.ozon.app.android.account.subscription.SubscriptionApi;
import ru.ozon.app.android.account.subscription.SubscriptionService;
import ru.ozon.app.android.account.subscription.SubscriptionServiceImpl;
import ru.ozon.app.android.account.subscription.di.SubscriptionModule_Companion_ProvideSubscriptionApiFactory;
import ru.ozon.app.android.account.user.NetworkUserDataStore;
import ru.ozon.app.android.account.user.UserApi;
import ru.ozon.app.android.account.user.UserLocalDataStore;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.account.user.UserManagerImpl;
import ru.ozon.app.android.account.user.di.UserModule_Companion_ProvidesUserApiFactory;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.auth.AuthNetworkService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;
import ru.ozon.app.android.storage.adult.AdultState;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.storage.auth.OzonIdCookieEvents;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.entity.sellerfavorites.SellerFavoriteDao;
import ru.ozon.app.android.storage.user.UserStatusStorage;

/* loaded from: classes6.dex */
public final class DaggerAccountComponent {

    private static final class AccountComponentImpl implements AccountComponent {
        private final AccountComponentImpl accountComponentImpl;
        private a<AdultHandlerImpl> adultHandlerImplProvider;
        private a<AlreadyAuthEvents> alreadyAuthEventsProvider;
        private a<ApplyCouponStateImpl> applyCouponStateImplProvider;
        private a<AuthEventsCollectorImpl> authEventsCollectorImplProvider;
        private a<AdultHandler> bindAdultHandlerProvider;
        private a<CurrencyState> bindCurrencyLocalStoreProvider;
        private a<CurrencyRepository> bindCurrencyRepositoryProvider;
        private a<SubscriptionService> bindFavoritesServiceProvider;
        private a<OrderChangeDataSource> bindOrderChangeDataSourceProvider;
        private a<OrderChangePreferences> bindOrderChangePreferencesProvider;
        private a<OrdersCountStorage> bindOrderCountsStorageProvider;
        private a<SellerFavoriteService> bindSellerFavoriteServiceProvider;
        private a<UserManager> bindUserManagerProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private a<CurrencyRepositoryImpl> currencyRepositoryImplProvider;
        private a<CurrencyStateImpl> currencyStateImplProvider;
        private a<EmailActualizedEventBus> emailActualizedEventBusProvider;
        private final NavigationComponentApi navigationComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private final NetworkOzonIdComponentApi networkOzonIdComponentApi;
        private a<NetworkUserDataStore> networkUserDataStoreProvider;
        private a<OrderChangeDataSourceImpl> orderChangeDataSourceImplProvider;
        private a<OrderChangePreferencesImpl> orderChangePreferencesImplProvider;
        private a<OrdersCountStorageImpl> ordersCountStorageImplProvider;
        private a<AuthEventsCollector> provideAuthEventsCollectorProvider;
        private a<ApplyCouponState> provideCouponUpdateManagerProvider;
        private a<CurrencyApi> provideCurrencyApiProvider;
        private a<OzonIdUserStatusApi> provideUserStatusApi$account_prodGoogleAllVendorsReleaseProvider;
        private a<SellerFavoriteServiceImpl> sellerFavoriteServiceImplProvider;
        private a<SessionListUpdatedEventBus> sessionListUpdatedEventBusProvider;
        private final StorageComponentApi storageComponentApi;
        private a<SubscriptionServiceImpl> subscriptionServiceImplProvider;
        private a<UserDataChangedEventBus> userDataChangedEventBusProvider;
        private a<UserLocalDataStore> userLocalDataStoreProvider;
        private a<UserManagerImpl> userManagerImplProvider;
        private a<WidgetEventService> widgetEventServiceProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final AccountComponentImpl accountComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92083id;

            SwitchingProvider(AccountComponentImpl accountComponentImpl, int i11) {
                this.accountComponentImpl = accountComponentImpl;
                this.f92083id = i11;
            }

            @Override // Pc.a
            public T get() {
                switch (this.f92083id) {
                    case 0:
                        AdultState adultState = this.accountComponentImpl.storageComponentApi.getAdultState();
                        j.c(adultState);
                        return (T) new AdultHandlerImpl(adultState);
                    case 1:
                        return (T) new SubscriptionServiceImpl(this.accountComponentImpl.subscriptionApi());
                    case 2:
                        AuthStateStorage authStateStorage = this.accountComponentImpl.storageComponentApi.getAuthStateStorage();
                        j.c(authStateStorage);
                        SellerFavoriteApi sellerFavoriteApi = this.accountComponentImpl.sellerFavoriteApi();
                        SellerFavoriteDao sellerFavoriteDao = this.accountComponentImpl.storageComponentApi.getSellerFavoriteDao();
                        j.c(sellerFavoriteDao);
                        return (T) new SellerFavoriteServiceImpl(authStateStorage, sellerFavoriteApi, sellerFavoriteDao);
                    case 3:
                        NetworkUserDataStore networkUserDataStore = (NetworkUserDataStore) this.accountComponentImpl.networkUserDataStoreProvider.get();
                        UserLocalDataStore userLocalDataStore = (UserLocalDataStore) this.accountComponentImpl.userLocalDataStoreProvider.get();
                        AuthStateStorage authStateStorage2 = this.accountComponentImpl.storageComponentApi.getAuthStateStorage();
                        j.c(authStateStorage2);
                        UserStatusStorage userStatusStorage = this.accountComponentImpl.storageComponentApi.getUserStatusStorage();
                        j.c(userStatusStorage);
                        OzonIdCookieEvents ozonIdCookieEvents = this.accountComponentImpl.storageComponentApi.getOzonIdCookieEvents();
                        j.c(ozonIdCookieEvents);
                        Ob0.a ozonIdAppApi = this.accountComponentImpl.networkOzonIdComponentApi.getOzonIdAppApi();
                        j.c(ozonIdAppApi);
                        return (T) new UserManagerImpl(networkUserDataStore, userLocalDataStore, authStateStorage2, userStatusStorage, ozonIdCookieEvents, ozonIdAppApi);
                    case 4:
                        return (T) new NetworkUserDataStore(this.accountComponentImpl.userApi());
                    case 5:
                        return (T) new UserLocalDataStore();
                    case 6:
                        return (T) new OrderChangePreferencesImpl();
                    case 7:
                        return (T) new OrderChangeDataSourceImpl();
                    case 8:
                        Context context = this.accountComponentImpl.contextComponentDependencies.getContext();
                        j.c(context);
                        return (T) new OrdersCountStorageImpl(context);
                    case 9:
                        return (T) new CurrencyRepositoryImpl((CurrencyApi) this.accountComponentImpl.provideCurrencyApiProvider.get(), (CurrencyState) this.accountComponentImpl.bindCurrencyLocalStoreProvider.get());
                    case 10:
                        Retrofit retrofit = this.accountComponentImpl.networkComponentApi.getRetrofit();
                        j.c(retrofit);
                        return (T) CurrencyModule_Companion_ProvideCurrencyApiFactory.provideCurrencyApi(retrofit);
                    case 11:
                        return (T) new CurrencyStateImpl();
                    case 12:
                        return (T) new ApplyCouponStateImpl();
                    case 13:
                        return (T) new SessionListUpdatedEventBus();
                    case 14:
                        return (T) new EmailActualizedEventBus();
                    case 15:
                        return (T) new UserDataChangedEventBus();
                    case 16:
                        g ozonRouter = this.accountComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter);
                        AlreadyAuthEvents alreadyAuthEvents = (AlreadyAuthEvents) this.accountComponentImpl.alreadyAuthEventsProvider.get();
                        AuthNetworkService authNetworkService = this.accountComponentImpl.networkComponentApi.getAuthNetworkService();
                        j.c(authNetworkService);
                        Ob0.a ozonIdAppApi2 = this.accountComponentImpl.networkOzonIdComponentApi.getOzonIdAppApi();
                        j.c(ozonIdAppApi2);
                        return (T) new AuthEventsCollectorImpl(ozonRouter, alreadyAuthEvents, authNetworkService, ozonIdAppApi2, this.accountComponentImpl.getUserAuthStatusRepository());
                    case 17:
                        FeatureChecker featureChecker = this.accountComponentImpl.networkComponentApi.getFeatureChecker();
                        j.c(featureChecker);
                        return (T) new AlreadyAuthEvents(featureChecker);
                    case 18:
                        return (T) new WidgetEventService((AdultHandler) this.accountComponentImpl.bindAdultHandlerProvider.get());
                    case 19:
                        Retrofit retrofit3 = this.accountComponentImpl.networkComponentApi.getRetrofit();
                        j.c(retrofit3);
                        return (T) AuthEventsModule_Companion_ProvideUserStatusApi$account_prodGoogleAllVendorsReleaseFactory.provideUserStatusApi$account_prodGoogleAllVendorsRelease(retrofit3);
                    default:
                        throw new AssertionError(this.f92083id);
                }
            }
        }

        /* synthetic */ AccountComponentImpl(ContextComponentDependencies contextComponentDependencies, AppLocaleComponentApi appLocaleComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, StorageComponentApi storageComponentApi, AnalyticsComponentApi analyticsComponentApi, NavigationComponentApi navigationComponentApi, int i11) {
            this(contextComponentDependencies, appLocaleComponentApi, networkComponentApi, networkOzonIdComponentApi, storageComponentApi, analyticsComponentApi, navigationComponentApi);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, AppLocaleComponentApi appLocaleComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, StorageComponentApi storageComponentApi, AnalyticsComponentApi analyticsComponentApi, NavigationComponentApi navigationComponentApi) {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.accountComponentImpl, 0);
            this.adultHandlerImplProvider = switchingProvider;
            this.bindAdultHandlerProvider = d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.accountComponentImpl, 1);
            this.subscriptionServiceImplProvider = switchingProvider2;
            this.bindFavoritesServiceProvider = d.b(switchingProvider2);
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.accountComponentImpl, 2);
            this.sellerFavoriteServiceImplProvider = switchingProvider3;
            this.bindSellerFavoriteServiceProvider = d.b(switchingProvider3);
            this.networkUserDataStoreProvider = d.b(new SwitchingProvider(this.accountComponentImpl, 4));
            this.userLocalDataStoreProvider = d.b(new SwitchingProvider(this.accountComponentImpl, 5));
            SwitchingProvider switchingProvider4 = new SwitchingProvider(this.accountComponentImpl, 3);
            this.userManagerImplProvider = switchingProvider4;
            this.bindUserManagerProvider = d.b(switchingProvider4);
            SwitchingProvider switchingProvider5 = new SwitchingProvider(this.accountComponentImpl, 6);
            this.orderChangePreferencesImplProvider = switchingProvider5;
            this.bindOrderChangePreferencesProvider = d.b(switchingProvider5);
            SwitchingProvider switchingProvider6 = new SwitchingProvider(this.accountComponentImpl, 7);
            this.orderChangeDataSourceImplProvider = switchingProvider6;
            this.bindOrderChangeDataSourceProvider = d.b(switchingProvider6);
            SwitchingProvider switchingProvider7 = new SwitchingProvider(this.accountComponentImpl, 8);
            this.ordersCountStorageImplProvider = switchingProvider7;
            this.bindOrderCountsStorageProvider = d.b(switchingProvider7);
            this.provideCurrencyApiProvider = d.b(new SwitchingProvider(this.accountComponentImpl, 10));
            SwitchingProvider switchingProvider8 = new SwitchingProvider(this.accountComponentImpl, 11);
            this.currencyStateImplProvider = switchingProvider8;
            this.bindCurrencyLocalStoreProvider = d.b(switchingProvider8);
            SwitchingProvider switchingProvider9 = new SwitchingProvider(this.accountComponentImpl, 9);
            this.currencyRepositoryImplProvider = switchingProvider9;
            this.bindCurrencyRepositoryProvider = d.b(switchingProvider9);
            SwitchingProvider switchingProvider10 = new SwitchingProvider(this.accountComponentImpl, 12);
            this.applyCouponStateImplProvider = switchingProvider10;
            this.provideCouponUpdateManagerProvider = d.b(switchingProvider10);
            this.sessionListUpdatedEventBusProvider = d.b(new SwitchingProvider(this.accountComponentImpl, 13));
            this.emailActualizedEventBusProvider = d.b(new SwitchingProvider(this.accountComponentImpl, 14));
            this.userDataChangedEventBusProvider = d.b(new SwitchingProvider(this.accountComponentImpl, 15));
            this.alreadyAuthEventsProvider = d.b(new SwitchingProvider(this.accountComponentImpl, 17));
            SwitchingProvider switchingProvider11 = new SwitchingProvider(this.accountComponentImpl, 16);
            this.authEventsCollectorImplProvider = switchingProvider11;
            this.provideAuthEventsCollectorProvider = d.b(switchingProvider11);
            this.widgetEventServiceProvider = d.b(new SwitchingProvider(this.accountComponentImpl, 18));
            this.provideUserStatusApi$account_prodGoogleAllVendorsReleaseProvider = d.b(new SwitchingProvider(this.accountComponentImpl, 19));
        }

        private KeyStoreRepositoryImpl keyStoreRepositoryImpl() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            return new KeyStoreRepositoryImpl(context);
        }

        private OrderChangeManagerImpl orderChangeManagerImpl() {
            return new OrderChangeManagerImpl(this.bindOrderChangeDataSourceProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SellerFavoriteApi sellerFavoriteApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return FavoriteModule_Companion_ProvideSellerFavoriteApiFactory.provideSellerFavoriteApi(retrofit);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SubscriptionApi subscriptionApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return SubscriptionModule_Companion_ProvideSubscriptionApiFactory.provideSubscriptionApi(retrofit);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public UserApi userApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return UserModule_Companion_ProvidesUserApiFactory.providesUserApi(retrofit);
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public AdultHandler getAdultHandler() {
            return this.bindAdultHandlerProvider.get();
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public AlreadyAuthEvents getAlreadyAuthEvents() {
            return this.alreadyAuthEventsProvider.get();
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public AuthEventsCollector getAuthEventsCollector() {
            return this.provideAuthEventsCollectorProvider.get();
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public ApplyCouponState getCouponUpdateState() {
            return this.provideCouponUpdateManagerProvider.get();
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public CurrencyState getCurrencyLocalStore() {
            return this.bindCurrencyLocalStoreProvider.get();
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public CurrencyRepository getCurrencyRepository() {
            return this.bindCurrencyRepositoryProvider.get();
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public EmailActualizedEventBus getEmailActualizedEventBus() {
            return this.emailActualizedEventBusProvider.get();
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public KeyStoreRepository getKeyStoreRepository() {
            return keyStoreRepositoryImpl();
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public OrderChangeManager getOrderChangeManager() {
            return orderChangeManagerImpl();
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public OrderChangePreferences getOrderChangePreferences() {
            return this.bindOrderChangePreferencesProvider.get();
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public OrdersCountStorage getOrderCountsStorage() {
            return this.bindOrderCountsStorageProvider.get();
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public SellerFavoriteService getSellerFavoriteService() {
            return this.bindSellerFavoriteServiceProvider.get();
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public SessionListUpdatedEventBus getSessionListUpdatedEventBus() {
            return this.sessionListUpdatedEventBusProvider.get();
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public SubscriptionService getSubscriptionServiceProvider() {
            return this.bindFavoritesServiceProvider.get();
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public AuthStatusRepository getUserAuthStatusRepository() {
            return new AuthStatusRepository(this.provideUserStatusApi$account_prodGoogleAllVendorsReleaseProvider.get());
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public UserDataChangedEventBus getUserDataChangedEventBus() {
            return this.userDataChangedEventBusProvider.get();
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public UserManager getUserManager() {
            return this.bindUserManagerProvider.get();
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public WidgetEventService getWidgetEventService() {
            return this.widgetEventServiceProvider.get();
        }

        private AccountComponentImpl(ContextComponentDependencies contextComponentDependencies, AppLocaleComponentApi appLocaleComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, StorageComponentApi storageComponentApi, AnalyticsComponentApi analyticsComponentApi, NavigationComponentApi navigationComponentApi) {
            this.accountComponentImpl = this;
            this.storageComponentApi = storageComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.networkOzonIdComponentApi = networkOzonIdComponentApi;
            this.contextComponentDependencies = contextComponentDependencies;
            this.navigationComponentApi = navigationComponentApi;
            initialize(contextComponentDependencies, appLocaleComponentApi, networkComponentApi, networkOzonIdComponentApi, storageComponentApi, analyticsComponentApi, navigationComponentApi);
        }
    }

    private static final class Factory implements AccountComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.account.di.AccountComponent.Factory
        public AccountComponent create(ContextComponentDependencies contextComponentDependencies, AppLocaleComponentApi appLocaleComponentApi, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, AnalyticsComponentApi analyticsComponentApi, NavigationComponentApi navigationComponentApi) {
            contextComponentDependencies.getClass();
            appLocaleComponentApi.getClass();
            networkComponentApi.getClass();
            storageComponentApi.getClass();
            networkOzonIdComponentApi.getClass();
            analyticsComponentApi.getClass();
            navigationComponentApi.getClass();
            return new AccountComponentImpl(contextComponentDependencies, appLocaleComponentApi, networkComponentApi, networkOzonIdComponentApi, storageComponentApi, analyticsComponentApi, navigationComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static AccountComponent.Factory factory() {
        return new Factory(0);
    }
}
