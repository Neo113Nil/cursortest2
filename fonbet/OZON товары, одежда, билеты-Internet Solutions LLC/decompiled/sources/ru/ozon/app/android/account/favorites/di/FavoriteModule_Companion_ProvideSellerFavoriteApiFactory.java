package ru.ozon.app.android.account.favorites.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.account.favorites.seller.api.SellerFavoriteApi;

/* loaded from: classes6.dex */
public final class FavoriteModule_Companion_ProvideSellerFavoriteApiFactory implements e<SellerFavoriteApi> {
    public static SellerFavoriteApi provideSellerFavoriteApi(Retrofit retrofit) {
        SellerFavoriteApi provideSellerFavoriteApi = FavoriteModule.INSTANCE.provideSellerFavoriteApi(retrofit);
        j.d(provideSellerFavoriteApi);
        return provideSellerFavoriteApi;
    }
}
