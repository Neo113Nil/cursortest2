package ru.ozon.app.android.seller.di;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.di.FavoritesDataComponentApi;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.seller.di.SisBrandFavoriteComponent;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/seller/di/SisBrandFavoriteComponentFactory;", "Lii/a;", "Lru/ozon/app/android/seller/di/SisBrandFavoriteComponentApi;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "<init>", "()V", "Lgi/b;", "Lru/ozon/app/android/di/provider/factory/ComponentStorage;", "componentStorage", "create", "(Lgi/b;)Lru/ozon/app/android/seller/di/SisBrandFavoriteComponentApi;", "seller_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SisBrandFavoriteComponentFactory implements InterfaceC7081a<SisBrandFavoriteComponentApi> {
    @Override // ii.InterfaceC7081a
    @NotNull
    public SisBrandFavoriteComponentApi create(@NotNull C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        SisBrandFavoriteComponent.Factory factory = DaggerSisBrandFavoriteComponent.factory();
        if (ActionComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ActionComponentApi is not DiComponent");
        }
        ActionComponentApi actionComponentApi = (ActionComponentApi) componentStorage.b(ActionComponentApi.class);
        if (FavoriteCoreComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FavoriteCoreComponentApi is not DiComponent");
        }
        FavoriteCoreComponentApi favoriteCoreComponentApi = (FavoriteCoreComponentApi) componentStorage.b(FavoriteCoreComponentApi.class);
        if (FavoritesDataComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FavoritesDataComponentApi is not DiComponent");
        }
        FavoritesDataComponentApi favoritesDataComponentApi = (FavoritesDataComponentApi) componentStorage.b(FavoritesDataComponentApi.class);
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        AccountComponentApi accountComponentApi = (AccountComponentApi) componentStorage.b(AccountComponentApi.class);
        if (CoroutineDispatchersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CoroutineDispatchersComponentApi is not DiComponent");
        }
        return factory.create(actionComponentApi, favoriteCoreComponentApi, favoritesDataComponentApi, accountComponentApi, (CoroutineDispatchersComponentApi) componentStorage.b(CoroutineDispatchersComponentApi.class));
    }
}
