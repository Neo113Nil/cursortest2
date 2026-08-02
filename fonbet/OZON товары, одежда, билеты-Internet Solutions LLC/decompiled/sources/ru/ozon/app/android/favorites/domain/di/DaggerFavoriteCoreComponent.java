package ru.ozon.app.android.favorites.domain.di;

import HZ.d;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.subscription.SubscriptionService;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;
import ru.ozon.app.android.favorites.data.api.FavoriteApi;
import ru.ozon.app.android.favorites.data.family.FamilyAccountRefresher;
import ru.ozon.app.android.favorites.data.favoriteslist.FavoritesListsRepositoryImpl;
import ru.ozon.app.android.favorites.data.service.FavoritesServiceProvider;
import ru.ozon.app.android.favorites.data.service.FavoritesServiceProviderImpl;
import ru.ozon.app.android.favorites.data.shoppinglists.FavoritesListsApi;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponent;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractorImpl;
import ru.ozon.app.android.favorites.domain.favoriteToggleProductButton.FavoriteToggleProductButtonInteractor;
import ru.ozon.app.android.favorites.domain.favoriteToggleProductButton.FavoriteToggleProductButtonInteractorImpl;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManagerImpl;
import ru.ozon.app.android.favorites.domain.favoritemanager.eventmap.FavoriteEventMap;
import ru.ozon.app.android.favorites.domain.favoritemanager.eventmap.FavoriteEventMapImpl;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractorImpl;
import ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate.SelectedProcessorProvider;
import ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate.SelectedProcessorProviderImpl;
import ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate.SelectedProductsManagerImpl;
import ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemsInteractor;
import ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemsInteractorImpl;
import ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistsInteractor;
import ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistsInteractorImpl;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEventManager;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEventManagerImpl;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentConfig;

/* loaded from: classes6.dex */
public final class DaggerFavoriteCoreComponent {

    private static final class Factory implements FavoriteCoreComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponent.Factory
        public FavoriteCoreComponent create(AccountComponentApi accountComponentApi, NetworkComponentApi networkComponentApi, ActionComponentApi actionComponentApi, NavigationComponentApi navigationComponentApi) {
            accountComponentApi.getClass();
            networkComponentApi.getClass();
            actionComponentApi.getClass();
            navigationComponentApi.getClass();
            return new FavoriteCoreComponentImpl(accountComponentApi, networkComponentApi, actionComponentApi, navigationComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class FavoriteCoreComponentImpl implements FavoriteCoreComponent {
        private final AccountComponentApi accountComponentApi;
        private final ActionComponentApi actionComponentApi;
        private a<FavoriteEventMap> bindFavoriteEventMapProvider;
        private a<FavoriteInteractor> bindFavoriteInteractorProvider;
        private a<FavoriteManager> bindFavoriteManagerProvider;
        private a<FavoriteToggleProductButtonInteractor> bindFavoriteToggleProductButtonInteractorProvider;
        private a<FavoritesServiceProvider> bindFavoritesServiceProvider;
        private a<SelectedProductsManager> bindSelectManagerProvider;
        private a<SelectedProcessorProvider> bindSelectProcessorProvider;
        private a<WishlistEventManager> bindWishlistEventManagerProvider;
        private a<WishlistItemsInteractor> bindWishlistItemsInteractorProvider;
        private a<WishlistsInteractor> bindWishlistsInteractorProvider;
        private a<FamilyAccountRefresher> familyAccountRefresherProvider;
        private final FavoriteCoreComponentImpl favoriteCoreComponentImpl;
        private a<FavoriteEventManager> favoriteEventManagerProvider;
        private a<FavoriteEventMapImpl> favoriteEventMapImplProvider;
        private a<FavoriteInteractorImpl> favoriteInteractorImplProvider;
        private a<FavoriteManagerImpl> favoriteManagerImplProvider;
        private a<FavoriteToggleProductButtonInteractorImpl> favoriteToggleProductButtonInteractorImplProvider;
        private a<FavoritesServiceProviderImpl> favoritesServiceProviderImplProvider;
        private final NavigationComponentApi navigationComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private a<FavoriteApi> provideFavoriteApiProvider;
        private a<SelectedProcessorProviderImpl> selectedProcessorProviderImplProvider;
        private a<SelectedProductsManagerImpl> selectedProductsManagerImplProvider;
        private a<WishlistEventManagerImpl> wishlistEventManagerImplProvider;
        private a<WishlistItemsInteractorImpl> wishlistItemsInteractorImplProvider;
        private a<WishlistsInteractorImpl> wishlistsInteractorImplProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final FavoriteCoreComponentImpl favoriteCoreComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92549id;

            SwitchingProvider(FavoriteCoreComponentImpl favoriteCoreComponentImpl, int i11) {
                this.favoriteCoreComponentImpl = favoriteCoreComponentImpl;
                this.f92549id = i11;
            }

            @Override // Pc.a
            public T get() {
                switch (this.f92549id) {
                    case 0:
                        return (T) new SelectedProductsManagerImpl();
                    case 1:
                        return (T) new SelectedProcessorProviderImpl();
                    case 2:
                        return (T) new FavoriteEventManager();
                    case 3:
                        FavoritesServiceProvider favoritesServiceProvider = (FavoritesServiceProvider) this.favoriteCoreComponentImpl.bindFavoritesServiceProvider.get();
                        FavoriteManager favoriteManager = (FavoriteManager) this.favoriteCoreComponentImpl.bindFavoriteManagerProvider.get();
                        SubscriptionService subscriptionServiceProvider = this.favoriteCoreComponentImpl.accountComponentApi.getSubscriptionServiceProvider();
                        j.c(subscriptionServiceProvider);
                        return (T) new FavoriteInteractorImpl(favoritesServiceProvider, favoriteManager, subscriptionServiceProvider);
                    case 4:
                        FavoriteApi favoriteApi = (FavoriteApi) this.favoriteCoreComponentImpl.provideFavoriteApiProvider.get();
                        d deeplinkMiniAppMapper = this.favoriteCoreComponentImpl.navigationComponentApi.getDeeplinkMiniAppMapper();
                        j.c(deeplinkMiniAppMapper);
                        return (T) new FavoritesServiceProviderImpl(favoriteApi, deeplinkMiniAppMapper);
                    case 5:
                        Retrofit retrofit = this.favoriteCoreComponentImpl.networkComponentApi.getRetrofit();
                        j.c(retrofit);
                        return (T) FavoriteCoreDependenciesModule_Companion_ProvideFavoriteApiFactory.provideFavoriteApi(retrofit);
                    case 6:
                        return (T) new FavoriteManagerImpl((FavoriteEventMap) this.favoriteCoreComponentImpl.bindFavoriteEventMapProvider.get());
                    case 7:
                        return (T) new FavoriteEventMapImpl();
                    case 8:
                        return (T) new WishlistEventManagerImpl();
                    case 9:
                        return (T) new FavoriteToggleProductButtonInteractorImpl((WishlistItemsInteractor) this.favoriteCoreComponentImpl.bindWishlistItemsInteractorProvider.get());
                    case 10:
                        ActionV2Repository actionRepository = this.favoriteCoreComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository);
                        return (T) new WishlistItemsInteractorImpl(actionRepository, (WishlistEventManager) this.favoriteCoreComponentImpl.bindWishlistEventManagerProvider.get(), (FavoriteEventManager) this.favoriteCoreComponentImpl.favoriteEventManagerProvider.get(), (FavoriteManager) this.favoriteCoreComponentImpl.bindFavoriteManagerProvider.get());
                    case 11:
                        ActionV2Repository actionRepository2 = this.favoriteCoreComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository2);
                        return (T) new WishlistsInteractorImpl(actionRepository2);
                    case 12:
                        return (T) new FamilyAccountRefresher();
                    default:
                        throw new AssertionError(this.f92549id);
                }
            }
        }

        /* synthetic */ FavoriteCoreComponentImpl(AccountComponentApi accountComponentApi, NetworkComponentApi networkComponentApi, ActionComponentApi actionComponentApi, NavigationComponentApi navigationComponentApi, int i11) {
            this(accountComponentApi, networkComponentApi, actionComponentApi, navigationComponentApi);
        }

        private FavoritesListsInteractorImpl favoritesListsInteractorImpl() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new FavoritesListsInteractorImpl(jsonDeserializer, actionRepository, favoritesListsRepositoryImpl());
        }

        private FavoritesListsRepositoryImpl favoritesListsRepositoryImpl() {
            FavoritesListsApi favoritesListsApi = getFavoritesListsApi();
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            NetworkComponentConfig networkComponentConfig = this.networkComponentApi.getNetworkComponentConfig();
            j.c(networkComponentConfig);
            return new FavoritesListsRepositoryImpl(favoritesListsApi, jsonDeserializer, networkComponentConfig);
        }

        private void initialize(AccountComponentApi accountComponentApi, NetworkComponentApi networkComponentApi, ActionComponentApi actionComponentApi, NavigationComponentApi navigationComponentApi) {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.favoriteCoreComponentImpl, 0);
            this.selectedProductsManagerImplProvider = switchingProvider;
            this.bindSelectManagerProvider = Jb.d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.favoriteCoreComponentImpl, 1);
            this.selectedProcessorProviderImplProvider = switchingProvider2;
            this.bindSelectProcessorProvider = Jb.d.b(switchingProvider2);
            this.favoriteEventManagerProvider = Jb.d.b(new SwitchingProvider(this.favoriteCoreComponentImpl, 2));
            this.provideFavoriteApiProvider = Jb.d.b(new SwitchingProvider(this.favoriteCoreComponentImpl, 5));
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.favoriteCoreComponentImpl, 4);
            this.favoritesServiceProviderImplProvider = switchingProvider3;
            this.bindFavoritesServiceProvider = Jb.d.b(switchingProvider3);
            SwitchingProvider switchingProvider4 = new SwitchingProvider(this.favoriteCoreComponentImpl, 7);
            this.favoriteEventMapImplProvider = switchingProvider4;
            this.bindFavoriteEventMapProvider = Jb.d.b(switchingProvider4);
            SwitchingProvider switchingProvider5 = new SwitchingProvider(this.favoriteCoreComponentImpl, 6);
            this.favoriteManagerImplProvider = switchingProvider5;
            this.bindFavoriteManagerProvider = Jb.d.b(switchingProvider5);
            SwitchingProvider switchingProvider6 = new SwitchingProvider(this.favoriteCoreComponentImpl, 3);
            this.favoriteInteractorImplProvider = switchingProvider6;
            this.bindFavoriteInteractorProvider = Jb.d.b(switchingProvider6);
            SwitchingProvider switchingProvider7 = new SwitchingProvider(this.favoriteCoreComponentImpl, 8);
            this.wishlistEventManagerImplProvider = switchingProvider7;
            this.bindWishlistEventManagerProvider = Jb.d.b(switchingProvider7);
            SwitchingProvider switchingProvider8 = new SwitchingProvider(this.favoriteCoreComponentImpl, 10);
            this.wishlistItemsInteractorImplProvider = switchingProvider8;
            this.bindWishlistItemsInteractorProvider = Jb.d.b(switchingProvider8);
            SwitchingProvider switchingProvider9 = new SwitchingProvider(this.favoriteCoreComponentImpl, 9);
            this.favoriteToggleProductButtonInteractorImplProvider = switchingProvider9;
            this.bindFavoriteToggleProductButtonInteractorProvider = Jb.d.b(switchingProvider9);
            SwitchingProvider switchingProvider10 = new SwitchingProvider(this.favoriteCoreComponentImpl, 11);
            this.wishlistsInteractorImplProvider = switchingProvider10;
            this.bindWishlistsInteractorProvider = Jb.d.b(switchingProvider10);
            this.familyAccountRefresherProvider = Jb.d.b(new SwitchingProvider(this.favoriteCoreComponentImpl, 12));
        }

        @Override // ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi
        public FamilyAccountRefresher getFamilyAccountRefresher() {
            return this.familyAccountRefresherProvider.get();
        }

        @Override // ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi
        public FavoriteEventManager getFavEventManager() {
            return this.favoriteEventManagerProvider.get();
        }

        @Override // ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi
        public FavoriteInteractor getFavoriteInteractor() {
            return this.bindFavoriteInteractorProvider.get();
        }

        @Override // ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi
        public FavoriteManager getFavoriteManager() {
            return this.bindFavoriteManagerProvider.get();
        }

        @Override // ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi
        public FavoriteToggleProductButtonInteractor getFavoriteToggleProductButtonInteractor() {
            return this.bindFavoriteToggleProductButtonInteractorProvider.get();
        }

        public FavoritesListsApi getFavoritesListsApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return FavoriteCoreDependenciesModule_Companion_ProvideFavoritesListsApiFactory.provideFavoritesListsApi(retrofit);
        }

        @Override // ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi
        public FavoritesListsInteractor getFavoritesListsInteractor() {
            return favoritesListsInteractorImpl();
        }

        @Override // ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi
        public FavoritesServiceProvider getFavoritesServiceProvider() {
            return this.bindFavoritesServiceProvider.get();
        }

        @Override // ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi
        public SelectedProcessorProvider getSelectedProcessorProvider() {
            return this.bindSelectProcessorProvider.get();
        }

        @Override // ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi
        public SelectedProductsManager getSelectedProductsManager() {
            return this.bindSelectManagerProvider.get();
        }

        @Override // ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi
        public WishlistEventManager getWishlistEventManager() {
            return this.bindWishlistEventManagerProvider.get();
        }

        @Override // ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi
        public WishlistItemsInteractor getWishlistItemsInteractor() {
            return this.bindWishlistItemsInteractorProvider.get();
        }

        @Override // ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi
        public WishlistsInteractor getWishlistsInteractor() {
            return this.bindWishlistsInteractorProvider.get();
        }

        private FavoriteCoreComponentImpl(AccountComponentApi accountComponentApi, NetworkComponentApi networkComponentApi, ActionComponentApi actionComponentApi, NavigationComponentApi navigationComponentApi) {
            this.favoriteCoreComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            this.actionComponentApi = actionComponentApi;
            this.navigationComponentApi = navigationComponentApi;
            this.accountComponentApi = accountComponentApi;
            initialize(accountComponentApi, networkComponentApi, actionComponentApi, navigationComponentApi);
        }
    }

    public static FavoriteCoreComponent.Factory factory() {
        return new Factory(0);
    }
}
