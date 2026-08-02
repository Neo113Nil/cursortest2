package ru.ozon.app.android.seller.di;

import Jb.j;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.FavoriteStateStore;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.di.FavoritesDataComponentApi;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.seller.di.SisBrandFavoriteComponent;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.SisBrandFavoriteButtonDelegateFactory;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.SisBrandFavoriteButtonDelegateFactoryImpl;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.SisBrandFavoriteInteractor;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.v2.ComposeSisBrandFavoriteButtonDelegateFactory;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.v2.ComposeSisBrandFavoriteButtonDelegateFactoryImpl;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

/* loaded from: classes2.dex */
public final class DaggerSisBrandFavoriteComponent {

    private static final class Factory implements SisBrandFavoriteComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.seller.di.SisBrandFavoriteComponent.Factory
        public SisBrandFavoriteComponent create(ActionComponentApi actionComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, FavoritesDataComponentApi favoritesDataComponentApi, AccountComponentApi accountComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi) {
            actionComponentApi.getClass();
            favoriteCoreComponentApi.getClass();
            favoritesDataComponentApi.getClass();
            accountComponentApi.getClass();
            coroutineDispatchersComponentApi.getClass();
            return new SisBrandFavoriteComponentImpl(actionComponentApi, favoriteCoreComponentApi, favoritesDataComponentApi, accountComponentApi, coroutineDispatchersComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class SisBrandFavoriteComponentImpl implements SisBrandFavoriteComponent {
        private final AccountComponentApi accountComponentApi;
        private final ActionComponentApi actionComponentApi;
        private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        private final FavoriteCoreComponentApi favoriteCoreComponentApi;
        private final FavoritesDataComponentApi favoritesDataComponentApi;
        private final SisBrandFavoriteComponentImpl sisBrandFavoriteComponentImpl;

        /* synthetic */ SisBrandFavoriteComponentImpl(ActionComponentApi actionComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, FavoritesDataComponentApi favoritesDataComponentApi, AccountComponentApi accountComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, int i11) {
            this(actionComponentApi, favoriteCoreComponentApi, favoritesDataComponentApi, accountComponentApi, coroutineDispatchersComponentApi);
        }

        private ComposeSisBrandFavoriteButtonDelegateFactoryImpl composeSisBrandFavoriteButtonDelegateFactoryImpl() {
            return new ComposeSisBrandFavoriteButtonDelegateFactoryImpl(sisBrandFavoriteInteractor());
        }

        private SisBrandFavoriteButtonDelegateFactoryImpl sisBrandFavoriteButtonDelegateFactoryImpl() {
            return new SisBrandFavoriteButtonDelegateFactoryImpl(sisBrandFavoriteInteractor());
        }

        private SisBrandFavoriteInteractor sisBrandFavoriteInteractor() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            FavoriteEventManager favEventManager = this.favoriteCoreComponentApi.getFavEventManager();
            j.c(favEventManager);
            FavoriteStateStore favoriteStateStore = this.favoritesDataComponentApi.getFavoriteStateStore();
            j.c(favoriteStateStore);
            SellerFavoriteService sellerFavoriteService = this.accountComponentApi.getSellerFavoriteService();
            j.c(sellerFavoriteService);
            CoroutineDispatcherProvider dispatcherProvider = this.coroutineDispatchersComponentApi.getDispatcherProvider();
            j.c(dispatcherProvider);
            return new SisBrandFavoriteInteractor(actionRepository, favEventManager, favoriteStateStore, sellerFavoriteService, dispatcherProvider);
        }

        @Override // ru.ozon.app.android.seller.di.SisBrandFavoriteComponentApi
        public ComposeSisBrandFavoriteButtonDelegateFactory getComposeSisBrandFavoriteButtonDelegateFactory() {
            return composeSisBrandFavoriteButtonDelegateFactoryImpl();
        }

        @Override // ru.ozon.app.android.seller.di.SisBrandFavoriteComponentApi
        public SisBrandFavoriteButtonDelegateFactory getSisBrandFavoriteButtonDelegateFactory() {
            return sisBrandFavoriteButtonDelegateFactoryImpl();
        }

        private SisBrandFavoriteComponentImpl(ActionComponentApi actionComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, FavoritesDataComponentApi favoritesDataComponentApi, AccountComponentApi accountComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi) {
            this.sisBrandFavoriteComponentImpl = this;
            this.actionComponentApi = actionComponentApi;
            this.favoriteCoreComponentApi = favoriteCoreComponentApi;
            this.favoritesDataComponentApi = favoritesDataComponentApi;
            this.accountComponentApi = accountComponentApi;
            this.coroutineDispatchersComponentApi = coroutineDispatchersComponentApi;
        }
    }

    public static SisBrandFavoriteComponent.Factory factory() {
        return new Factory(0);
    }
}
