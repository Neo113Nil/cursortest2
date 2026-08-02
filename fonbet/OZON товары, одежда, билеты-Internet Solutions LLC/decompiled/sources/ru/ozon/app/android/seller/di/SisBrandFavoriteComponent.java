package ru.ozon.app.android.seller.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.di.FavoritesDataComponentApi;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/seller/di/SisBrandFavoriteComponent;", "Lru/ozon/app/android/seller/di/SisBrandFavoriteComponentApi;", "Factory", "seller_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SisBrandFavoriteComponent extends SisBrandFavoriteComponentApi {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/seller/di/SisBrandFavoriteComponent$Factory;", "", "create", "Lru/ozon/app/android/seller/di/SisBrandFavoriteComponent;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "favoriteCoreComponentApi", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "favoritesDataComponentApi", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/di/FavoritesDataComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "seller_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        SisBrandFavoriteComponent create(@NotNull ActionComponentApi actionComponentApi, @NotNull FavoriteCoreComponentApi favoriteCoreComponentApi, @NotNull FavoritesDataComponentApi favoritesDataComponentApi, @NotNull AccountComponentApi accountComponentApi, @NotNull CoroutineDispatchersComponentApi coroutineDispatchersComponentApi);
    }
}
