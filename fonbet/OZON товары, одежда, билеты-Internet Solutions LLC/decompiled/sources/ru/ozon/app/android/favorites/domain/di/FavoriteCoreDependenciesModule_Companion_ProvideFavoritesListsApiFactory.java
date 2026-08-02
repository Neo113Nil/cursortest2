package ru.ozon.app.android.favorites.domain.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.favorites.data.shoppinglists.FavoritesListsApi;

/* loaded from: classes6.dex */
public final class FavoriteCoreDependenciesModule_Companion_ProvideFavoritesListsApiFactory implements e<FavoritesListsApi> {
    public static FavoritesListsApi provideFavoritesListsApi(Retrofit retrofit) {
        FavoritesListsApi provideFavoritesListsApi = FavoriteCoreDependenciesModule.INSTANCE.provideFavoritesListsApi(retrofit);
        j.d(provideFavoritesListsApi);
        return provideFavoritesListsApi;
    }
}
