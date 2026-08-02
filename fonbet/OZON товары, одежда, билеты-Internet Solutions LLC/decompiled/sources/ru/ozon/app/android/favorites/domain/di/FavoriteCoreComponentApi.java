package ru.ozon.app.android.favorites.domain.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;
import ru.ozon.app.android.favorites.data.family.FamilyAccountRefresher;
import ru.ozon.app.android.favorites.data.service.FavoritesServiceProvider;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import ru.ozon.app.android.favorites.domain.favoriteToggleProductButton.FavoriteToggleProductButtonInteractor;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate.SelectedProcessorProvider;
import ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemsInteractor;
import ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistsInteractor;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEventManager;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H&¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H&¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "getFavoritesListsInteractor", "()Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "getSelectedProductsManager", "()Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "Lru/ozon/app/android/favorites/domain/favoritesv2/selectedstate/SelectedProcessorProvider;", "getSelectedProcessorProvider", "()Lru/ozon/app/android/favorites/domain/favoritesv2/selectedstate/SelectedProcessorProvider;", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "getFavEventManager", "()Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "getFavoriteInteractor", "()Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "Lru/ozon/app/android/favorites/data/service/FavoritesServiceProvider;", "getFavoritesServiceProvider", "()Lru/ozon/app/android/favorites/data/service/FavoritesServiceProvider;", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "getFavoriteManager", "()Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEventManager;", "getWishlistEventManager", "()Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEventManager;", "Lru/ozon/app/android/favorites/domain/favoriteToggleProductButton/FavoriteToggleProductButtonInteractor;", "getFavoriteToggleProductButtonInteractor", "()Lru/ozon/app/android/favorites/domain/favoriteToggleProductButton/FavoriteToggleProductButtonInteractor;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistsInteractor;", "getWishlistsInteractor", "()Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistsInteractor;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemsInteractor;", "getWishlistItemsInteractor", "()Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemsInteractor;", "Lru/ozon/app/android/favorites/data/family/FamilyAccountRefresher;", "getFamilyAccountRefresher", "()Lru/ozon/app/android/favorites/data/family/FamilyAccountRefresher;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FavoriteCoreComponentApi extends InterfaceC6958a {
    @NotNull
    FamilyAccountRefresher getFamilyAccountRefresher();

    @NotNull
    FavoriteEventManager getFavEventManager();

    @NotNull
    FavoriteInteractor getFavoriteInteractor();

    @NotNull
    FavoriteManager getFavoriteManager();

    @NotNull
    FavoriteToggleProductButtonInteractor getFavoriteToggleProductButtonInteractor();

    @NotNull
    FavoritesListsInteractor getFavoritesListsInteractor();

    @NotNull
    FavoritesServiceProvider getFavoritesServiceProvider();

    @NotNull
    SelectedProcessorProvider getSelectedProcessorProvider();

    @NotNull
    SelectedProductsManager getSelectedProductsManager();

    @NotNull
    WishlistEventManager getWishlistEventManager();

    @NotNull
    WishlistItemsInteractor getWishlistItemsInteractor();

    @NotNull
    WishlistsInteractor getWishlistsInteractor();
}
