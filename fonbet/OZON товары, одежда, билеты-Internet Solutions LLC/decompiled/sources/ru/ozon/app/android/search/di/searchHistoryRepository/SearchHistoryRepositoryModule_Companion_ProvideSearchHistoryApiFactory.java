package ru.ozon.app.android.search.di.searchHistoryRepository;

import Jb.e;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.search.widgets.history.common.data.SearchHistoryApi;

/* loaded from: classes7.dex */
public final class SearchHistoryRepositoryModule_Companion_ProvideSearchHistoryApiFactory implements e<SearchHistoryApi> {
    private final a<Retrofit> retrofitProvider;

    public SearchHistoryRepositoryModule_Companion_ProvideSearchHistoryApiFactory(a<Retrofit> aVar) {
        this.retrofitProvider = aVar;
    }

    public static SearchHistoryRepositoryModule_Companion_ProvideSearchHistoryApiFactory create(a<Retrofit> aVar) {
        return new SearchHistoryRepositoryModule_Companion_ProvideSearchHistoryApiFactory(aVar);
    }

    public static SearchHistoryApi provideSearchHistoryApi(Retrofit retrofit) {
        SearchHistoryApi provideSearchHistoryApi = SearchHistoryRepositoryModule.INSTANCE.provideSearchHistoryApi(retrofit);
        j.d(provideSearchHistoryApi);
        return provideSearchHistoryApi;
    }

    @Override // Pc.a
    public SearchHistoryApi get() {
        return provideSearchHistoryApi(this.retrofitProvider.get());
    }
}
