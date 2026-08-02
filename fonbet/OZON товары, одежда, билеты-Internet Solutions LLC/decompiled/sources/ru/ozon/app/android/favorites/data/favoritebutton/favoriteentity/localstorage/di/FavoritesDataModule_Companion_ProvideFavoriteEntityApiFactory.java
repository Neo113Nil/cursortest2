package ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.FavoriteEntityApi;

/* loaded from: classes6.dex */
public final class FavoritesDataModule_Companion_ProvideFavoriteEntityApiFactory implements e<FavoriteEntityApi> {
    public static FavoriteEntityApi provideFavoriteEntityApi(Retrofit retrofit) {
        FavoriteEntityApi provideFavoriteEntityApi = FavoritesDataModule.INSTANCE.provideFavoriteEntityApi(retrofit);
        j.d(provideFavoriteEntityApi);
        return provideFavoriteEntityApi;
    }
}
