package ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.di;

import GZ.g;
import Jb.j;
import Pc.a;
import Vg.d;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.auth.biometry.keystore.KeyStoreRepository;
import ru.ozon.app.android.account.authEvents.AlreadyAuthEvents;
import ru.ozon.app.android.account.authEvents.AuthEventsCollector;
import ru.ozon.app.android.account.authEvents.data.AuthStatusRepository;
import ru.ozon.app.android.account.coupon.ApplyCouponState;
import ru.ozon.app.android.account.currency.CurrencyRepository;
import ru.ozon.app.android.account.currency.CurrencyState;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.eventBus.EmailActualizedEventBus;
import ru.ozon.app.android.account.eventBus.UserDataChangedEventBus;
import ru.ozon.app.android.account.events.WidgetEventService;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.account.orders.OrdersCountStorage;
import ru.ozon.app.android.account.orders.onorderchangenew.OrderChangeManager;
import ru.ozon.app.android.account.session.SessionListUpdatedEventBus;
import ru.ozon.app.android.account.subscription.SubscriptionService;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.di.SellerTransparencyProfileComponent;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.SellerHeaderViewModel;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.SellerHeaderViewModel_Factory;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.ui.switchingbutton.di.SwitchingButtonComponentApi;

/* loaded from: classes12.dex */
public final class DaggerSellerTransparencyProfileComponent {

    private static final class Factory implements SellerTransparencyProfileComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.di.SellerTransparencyProfileComponent.Factory
        public SellerTransparencyProfileComponent create(SwitchingButtonComponentApi switchingButtonComponentApi, AccountComponentApi accountComponentApi, ActionComponentApi actionComponentApi, NetworkComponentApi networkComponentApi, FavoriteComponentApi favoriteComponentApi, StorageComponentApi storageComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, NavigationComponentApi navigationComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi) {
            switchingButtonComponentApi.getClass();
            accountComponentApi.getClass();
            actionComponentApi.getClass();
            networkComponentApi.getClass();
            favoriteComponentApi.getClass();
            storageComponentApi.getClass();
            customActionHandlersComponentApi.getClass();
            navigationComponentApi.getClass();
            favoriteCoreComponentApi.getClass();
            return new SellerTransparencyProfileComponentImpl(switchingButtonComponentApi, accountComponentApi, actionComponentApi, networkComponentApi, favoriteComponentApi, storageComponentApi, customActionHandlersComponentApi, navigationComponentApi, favoriteCoreComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class SellerTransparencyProfileComponentImpl implements SellerTransparencyProfileComponent {
        private final AccountComponentApi accountComponentApi;
        private final ActionComponentApi actionComponentApi;
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
        private final FavoriteCoreComponentApi favoriteCoreComponentApi;
        private a<ActionV2Repository> getActionRepositoryProvider;
        private a<AuthStateStorage> getAuthStateStorageProvider;
        private a<g> getOzonRouterProvider;
        private a<SellerFavoriteService> getSellerFavoriteServiceProvider;
        private a<SellerHeaderViewModel> sellerHeaderViewModelProvider;
        private final SellerTransparencyProfileComponentImpl sellerTransparencyProfileComponentImpl;
        private final SwitchingButtonComponentApi switchingButtonComponentApi;

        private static final class GetActionRepositoryProvider implements a<ActionV2Repository> {
            private final ActionComponentApi actionComponentApi;

            GetActionRepositoryProvider(ActionComponentApi actionComponentApi) {
                this.actionComponentApi = actionComponentApi;
            }

            @Override // Pc.a
            public ActionV2Repository get() {
                ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
                j.c(actionRepository);
                return actionRepository;
            }
        }

        private static final class GetAuthStateStorageProvider implements a<AuthStateStorage> {
            private final StorageComponentApi storageComponentApi;

            GetAuthStateStorageProvider(StorageComponentApi storageComponentApi) {
                this.storageComponentApi = storageComponentApi;
            }

            @Override // Pc.a
            public AuthStateStorage get() {
                AuthStateStorage authStateStorage = this.storageComponentApi.getAuthStateStorage();
                j.c(authStateStorage);
                return authStateStorage;
            }
        }

        private static final class GetOzonRouterProvider implements a<g> {
            private final NavigationComponentApi navigationComponentApi;

            GetOzonRouterProvider(NavigationComponentApi navigationComponentApi) {
                this.navigationComponentApi = navigationComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public g get() {
                g ozonRouter = this.navigationComponentApi.getOzonRouter();
                j.c(ozonRouter);
                return ozonRouter;
            }
        }

        private static final class GetSellerFavoriteServiceProvider implements a<SellerFavoriteService> {
            private final AccountComponentApi accountComponentApi;

            GetSellerFavoriteServiceProvider(AccountComponentApi accountComponentApi) {
                this.accountComponentApi = accountComponentApi;
            }

            @Override // Pc.a
            public SellerFavoriteService get() {
                SellerFavoriteService sellerFavoriteService = this.accountComponentApi.getSellerFavoriteService();
                j.c(sellerFavoriteService);
                return sellerFavoriteService;
            }
        }

        /* synthetic */ SellerTransparencyProfileComponentImpl(SwitchingButtonComponentApi switchingButtonComponentApi, AccountComponentApi accountComponentApi, ActionComponentApi actionComponentApi, NetworkComponentApi networkComponentApi, FavoriteComponentApi favoriteComponentApi, StorageComponentApi storageComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, NavigationComponentApi navigationComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, int i11) {
            this(switchingButtonComponentApi, accountComponentApi, actionComponentApi, networkComponentApi, favoriteComponentApi, storageComponentApi, customActionHandlersComponentApi, navigationComponentApi, favoriteCoreComponentApi);
        }

        private void initialize(SwitchingButtonComponentApi switchingButtonComponentApi, AccountComponentApi accountComponentApi, ActionComponentApi actionComponentApi, NetworkComponentApi networkComponentApi, FavoriteComponentApi favoriteComponentApi, StorageComponentApi storageComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, NavigationComponentApi navigationComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi) {
            this.getActionRepositoryProvider = new GetActionRepositoryProvider(actionComponentApi);
            this.getAuthStateStorageProvider = new GetAuthStateStorageProvider(storageComponentApi);
            this.getSellerFavoriteServiceProvider = new GetSellerFavoriteServiceProvider(accountComponentApi);
            GetOzonRouterProvider getOzonRouterProvider = new GetOzonRouterProvider(navigationComponentApi);
            this.getOzonRouterProvider = getOzonRouterProvider;
            this.sellerHeaderViewModelProvider = SellerHeaderViewModel_Factory.create(this.getActionRepositoryProvider, this.getAuthStateStorageProvider, this.getSellerFavoriteServiceProvider, getOzonRouterProvider);
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public AdultHandler getAdultHandler() {
            AdultHandler adultHandler = this.accountComponentApi.getAdultHandler();
            j.c(adultHandler);
            return adultHandler;
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public AlreadyAuthEvents getAlreadyAuthEvents() {
            AlreadyAuthEvents alreadyAuthEvents = this.accountComponentApi.getAlreadyAuthEvents();
            j.c(alreadyAuthEvents);
            return alreadyAuthEvents;
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public AuthEventsCollector getAuthEventsCollector() {
            AuthEventsCollector authEventsCollector = this.accountComponentApi.getAuthEventsCollector();
            j.c(authEventsCollector);
            return authEventsCollector;
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public ApplyCouponState getCouponUpdateState() {
            ApplyCouponState couponUpdateState = this.accountComponentApi.getCouponUpdateState();
            j.c(couponUpdateState);
            return couponUpdateState;
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public CurrencyState getCurrencyLocalStore() {
            CurrencyState currencyLocalStore = this.accountComponentApi.getCurrencyLocalStore();
            j.c(currencyLocalStore);
            return currencyLocalStore;
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public CurrencyRepository getCurrencyRepository() {
            CurrencyRepository currencyRepository = this.accountComponentApi.getCurrencyRepository();
            j.c(currencyRepository);
            return currencyRepository;
        }

        @Override // ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.di.SellerTransparencyProfileComponent
        public d getCustomActionHandlersStoreFactory() {
            d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return customActionHandlersStoreFactory;
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public EmailActualizedEventBus getEmailActualizedEventBus() {
            EmailActualizedEventBus emailActualizedEventBus = this.accountComponentApi.getEmailActualizedEventBus();
            j.c(emailActualizedEventBus);
            return emailActualizedEventBus;
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public KeyStoreRepository getKeyStoreRepository() {
            KeyStoreRepository keyStoreRepository = this.accountComponentApi.getKeyStoreRepository();
            j.c(keyStoreRepository);
            return keyStoreRepository;
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public OrderChangeManager getOrderChangeManager() {
            OrderChangeManager orderChangeManager = this.accountComponentApi.getOrderChangeManager();
            j.c(orderChangeManager);
            return orderChangeManager;
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public OrderChangePreferences getOrderChangePreferences() {
            OrderChangePreferences orderChangePreferences = this.accountComponentApi.getOrderChangePreferences();
            j.c(orderChangePreferences);
            return orderChangePreferences;
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public OrdersCountStorage getOrderCountsStorage() {
            OrdersCountStorage orderCountsStorage = this.accountComponentApi.getOrderCountsStorage();
            j.c(orderCountsStorage);
            return orderCountsStorage;
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public SellerFavoriteService getSellerFavoriteService() {
            SellerFavoriteService sellerFavoriteService = this.accountComponentApi.getSellerFavoriteService();
            j.c(sellerFavoriteService);
            return sellerFavoriteService;
        }

        @Override // ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.di.SellerTransparencyProfileComponent
        public a<SellerHeaderViewModel> getSellerHeaderViewModel() {
            return this.sellerHeaderViewModelProvider;
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public SessionListUpdatedEventBus getSessionListUpdatedEventBus() {
            SessionListUpdatedEventBus sessionListUpdatedEventBus = this.accountComponentApi.getSessionListUpdatedEventBus();
            j.c(sessionListUpdatedEventBus);
            return sessionListUpdatedEventBus;
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public SubscriptionService getSubscriptionServiceProvider() {
            SubscriptionService subscriptionServiceProvider = this.accountComponentApi.getSubscriptionServiceProvider();
            j.c(subscriptionServiceProvider);
            return subscriptionServiceProvider;
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public AuthStatusRepository getUserAuthStatusRepository() {
            AuthStatusRepository userAuthStatusRepository = this.accountComponentApi.getUserAuthStatusRepository();
            j.c(userAuthStatusRepository);
            return userAuthStatusRepository;
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public UserDataChangedEventBus getUserDataChangedEventBus() {
            UserDataChangedEventBus userDataChangedEventBus = this.accountComponentApi.getUserDataChangedEventBus();
            j.c(userDataChangedEventBus);
            return userDataChangedEventBus;
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public UserManager getUserManager() {
            UserManager userManager = this.accountComponentApi.getUserManager();
            j.c(userManager);
            return userManager;
        }

        @Override // ru.ozon.app.android.account.di.AccountComponentApi
        public WidgetEventService getWidgetEventService() {
            WidgetEventService widgetEventService = this.accountComponentApi.getWidgetEventService();
            j.c(widgetEventService);
            return widgetEventService;
        }

        private SellerTransparencyProfileComponentImpl(SwitchingButtonComponentApi switchingButtonComponentApi, AccountComponentApi accountComponentApi, ActionComponentApi actionComponentApi, NetworkComponentApi networkComponentApi, FavoriteComponentApi favoriteComponentApi, StorageComponentApi storageComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, NavigationComponentApi navigationComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi) {
            this.sellerTransparencyProfileComponentImpl = this;
            this.accountComponentApi = accountComponentApi;
            this.switchingButtonComponentApi = switchingButtonComponentApi;
            this.favoriteCoreComponentApi = favoriteCoreComponentApi;
            this.actionComponentApi = actionComponentApi;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
            initialize(switchingButtonComponentApi, accountComponentApi, actionComponentApi, networkComponentApi, favoriteComponentApi, storageComponentApi, customActionHandlersComponentApi, navigationComponentApi, favoriteCoreComponentApi);
        }
    }

    public static SellerTransparencyProfileComponent.Factory factory() {
        return new Factory(0);
    }
}
