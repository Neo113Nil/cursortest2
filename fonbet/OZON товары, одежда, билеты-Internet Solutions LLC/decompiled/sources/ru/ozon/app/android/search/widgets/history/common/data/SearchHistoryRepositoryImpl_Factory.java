package ru.ozon.app.android.search.widgets.history.common.data;

import Jb.e;
import Pc.a;

/* loaded from: classes7.dex */
public final class SearchHistoryRepositoryImpl_Factory implements e<SearchHistoryRepositoryImpl> {
    private final a<SearchHistoryApi> searchHistoryApiProvider;

    public SearchHistoryRepositoryImpl_Factory(a<SearchHistoryApi> aVar) {
        this.searchHistoryApiProvider = aVar;
    }

    public static SearchHistoryRepositoryImpl_Factory create(a<SearchHistoryApi> aVar) {
        return new SearchHistoryRepositoryImpl_Factory(aVar);
    }

    public static SearchHistoryRepositoryImpl newInstance(SearchHistoryApi searchHistoryApi) {
        return new SearchHistoryRepositoryImpl(searchHistoryApi);
    }

    @Override // Pc.a
    public SearchHistoryRepositoryImpl get() {
        return newInstance(this.searchHistoryApiProvider.get());
    }
}
