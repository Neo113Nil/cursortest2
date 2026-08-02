package ru.ozon.app.android.favorites.domain.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.favorites.data.api.FavoriteApi;

/* loaded from: classes6.dex */
public final class FavoriteCoreDependenciesModule_Companion_ProvideFavoriteApiFactory implements e<FavoriteApi> {
    public static FavoriteApi provideFavoriteApi(Retrofit retrofit) {
        FavoriteApi provideFavoriteApi = FavoriteCoreDependenciesModule.INSTANCE.provideFavoriteApi(retrofit);
        j.d(provideFavoriteApi);
        return provideFavoriteApi;
    }
}
