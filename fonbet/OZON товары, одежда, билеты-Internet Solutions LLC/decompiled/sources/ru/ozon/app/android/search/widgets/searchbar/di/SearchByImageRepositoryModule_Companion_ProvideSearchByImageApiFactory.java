package ru.ozon.app.android.search.widgets.searchbar.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.search.widgets.searchbar.core.repository.SearchByImageApi;

/* loaded from: classes7.dex */
public final class SearchByImageRepositoryModule_Companion_ProvideSearchByImageApiFactory implements e<SearchByImageApi> {
    public static SearchByImageApi provideSearchByImageApi(Retrofit retrofit) {
        SearchByImageApi provideSearchByImageApi = SearchByImageRepositoryModule.INSTANCE.provideSearchByImageApi(retrofit);
        j.d(provideSearchByImageApi);
        return provideSearchByImageApi;
    }
}
