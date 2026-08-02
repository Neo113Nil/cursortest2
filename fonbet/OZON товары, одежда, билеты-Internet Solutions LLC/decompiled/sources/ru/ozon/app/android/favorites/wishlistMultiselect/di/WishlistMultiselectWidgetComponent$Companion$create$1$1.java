package ru.ozon.app.android.favorites.wishlistMultiselect.di;

import At.b;
import GZ.g;
import Pc.a;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate.SelectedProductsManagerVmWrapper;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEventManager;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;

@Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"ru/ozon/app/android/favorites/wishlistMultiselect/di/WishlistMultiselectWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/favorites/wishlistMultiselect/di/WishlistMultiselectWidgetComponent;", "LPc/a;", "Lru/ozon/app/android/favorites/domain/favoritesv2/selectedstate/SelectedProductsManagerVmWrapper;", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "getSelectedProductsManager", "()Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "selectedProductsManager", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "getFavListInteractor", "()Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "favListInteractor", "LGZ/g;", "getRouter", "()LGZ/g;", "router", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "getFavoriteEventManager", "()Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "favoriteEventManager", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEventManager;", "getWishlistEventManager", "()Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEventManager;", "wishlistEventManager", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WishlistMultiselectWidgetComponent$Companion$create$1$1 implements WishlistMultiselectWidgetComponent {
    final /* synthetic */ C7475g $storage;
    private final a<SelectedProductsManagerVmWrapper> viewModelProvider = new b(this, 0);

    WishlistMultiselectWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelectedProductsManagerVmWrapper viewModelProvider$lambda$0(WishlistMultiselectWidgetComponent$Companion$create$1$1 wishlistMultiselectWidgetComponent$Companion$create$1$1) {
        return new SelectedProductsManagerVmWrapper(wishlistMultiselectWidgetComponent$Companion$create$1$1.getSelectedProductsManager());
    }

    @Override // ru.ozon.app.android.favorites.wishlistMultiselect.di.WishlistMultiselectWidgetComponent
    public FavoritesListsInteractor getFavListInteractor() {
        return ((FavoriteCoreComponentApi) this.$storage.getComponent(FavoriteCoreComponentApi.class)).getFavoritesListsInteractor();
    }

    @Override // ru.ozon.app.android.favorites.wishlistMultiselect.di.WishlistMultiselectWidgetComponent
    public FavoriteEventManager getFavoriteEventManager() {
        return ((FavoriteCoreComponentApi) this.$storage.getComponent(FavoriteCoreComponentApi.class)).getFavEventManager();
    }

    @Override // ru.ozon.app.android.favorites.wishlistMultiselect.di.WishlistMultiselectWidgetComponent
    public g getRouter() {
        return ((NavigationComponentApi) this.$storage.getComponent(NavigationComponentApi.class)).getOzonRouter();
    }

    @Override // ru.ozon.app.android.favorites.wishlistMultiselect.di.WishlistMultiselectWidgetComponent
    public SelectedProductsManager getSelectedProductsManager() {
        return ((FavoriteCoreComponentApi) this.$storage.getComponent(FavoriteCoreComponentApi.class)).getSelectedProductsManager();
    }

    @Override // ru.ozon.app.android.favorites.wishlistMultiselect.di.WishlistMultiselectWidgetComponent
    public a<SelectedProductsManagerVmWrapper> getViewModelProvider() {
        return this.viewModelProvider;
    }

    @Override // ru.ozon.app.android.favorites.wishlistMultiselect.di.WishlistMultiselectWidgetComponent
    public WishlistEventManager getWishlistEventManager() {
        return ((FavoriteCoreComponentApi) this.$storage.getComponent(FavoriteCoreComponentApi.class)).getWishlistEventManager();
    }
}
