package ru.ozon.app.android.storefront.widgets.navbarApparel.di;

import Jb.j;
import Vg.d;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.common.di.SearchPrefetchApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storefront.widgets.navbarApparel.di.NavBarApparelComponent;

/* loaded from: classes2.dex */
public final class DaggerNavBarApparelComponent {

    private static final class Factory implements NavBarApparelComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.storefront.widgets.navbarApparel.di.NavBarApparelComponent.Factory
        public NavBarApparelComponent create(RetainComposerComponentApi retainComposerComponentApi, FavoriteComponentApi favoriteComponentApi, NetworkComponentApi networkComponentApi, SearchPrefetchApi searchPrefetchApi, CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            retainComposerComponentApi.getClass();
            favoriteComponentApi.getClass();
            networkComponentApi.getClass();
            searchPrefetchApi.getClass();
            customActionHandlersComponentApi.getClass();
            return new NavBarApparelComponentImpl(retainComposerComponentApi, favoriteComponentApi, networkComponentApi, searchPrefetchApi, customActionHandlersComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class NavBarApparelComponentImpl implements NavBarApparelComponent {
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
        private final FavoriteComponentApi favoriteComponentApi;
        private final NavBarApparelComponentImpl navBarApparelComponentImpl;
        private final NetworkComponentApi networkComponentApi;
        private final RetainComposerComponentApi retainComposerComponentApi;
        private final SearchPrefetchApi searchPrefetchApi;

        /* synthetic */ NavBarApparelComponentImpl(RetainComposerComponentApi retainComposerComponentApi, FavoriteComponentApi favoriteComponentApi, NetworkComponentApi networkComponentApi, SearchPrefetchApi searchPrefetchApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, int i11) {
            this(retainComposerComponentApi, favoriteComponentApi, networkComponentApi, searchPrefetchApi, customActionHandlersComponentApi);
        }

        @Override // ru.ozon.app.android.storefront.widgets.navbarApparel.di.NavBarApparelComponent
        public d customActionHandlersStoreFactory() {
            d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return customActionHandlersStoreFactory;
        }

        @Override // ru.ozon.app.android.storefront.widgets.navbarApparel.di.NavBarApparelComponent
        public ProductFavoriteDelegateProvider getFavDelegateProvider() {
            ProductFavoriteDelegateProvider favoriteProductDelegate = this.favoriteComponentApi.getFavoriteProductDelegate();
            j.c(favoriteProductDelegate);
            return favoriteProductDelegate;
        }

        @Override // ru.ozon.app.android.storefront.widgets.navbarApparel.di.NavBarApparelComponent
        public SearchUrlPrefetchService searchUrlPrefetchService() {
            SearchUrlPrefetchService searchUrlPrefetchService = this.searchPrefetchApi.getSearchUrlPrefetchService();
            j.c(searchUrlPrefetchService);
            return searchUrlPrefetchService;
        }

        private NavBarApparelComponentImpl(RetainComposerComponentApi retainComposerComponentApi, FavoriteComponentApi favoriteComponentApi, NetworkComponentApi networkComponentApi, SearchPrefetchApi searchPrefetchApi, CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            this.navBarApparelComponentImpl = this;
            this.favoriteComponentApi = favoriteComponentApi;
            this.retainComposerComponentApi = retainComposerComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.searchPrefetchApi = searchPrefetchApi;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
        }
    }

    public static NavBarApparelComponent.Factory factory() {
        return new Factory(0);
    }
}
