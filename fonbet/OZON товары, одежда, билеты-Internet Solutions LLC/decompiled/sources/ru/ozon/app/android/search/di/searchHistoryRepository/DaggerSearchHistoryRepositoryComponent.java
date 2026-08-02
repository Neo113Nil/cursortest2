package ru.ozon.app.android.search.di.searchHistoryRepository;

import Jb.d;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.search.di.searchHistoryRepository.SearchHistoryRepositoryComponent;
import ru.ozon.app.android.search.widgets.history.common.data.SearchHistoryApi;
import ru.ozon.app.android.search.widgets.history.common.data.SearchHistoryRepository;
import ru.ozon.app.android.search.widgets.history.common.data.SearchHistoryRepositoryImpl;
import ru.ozon.app.android.search.widgets.history.common.data.SearchHistoryRepositoryImpl_Factory;

/* loaded from: classes7.dex */
public final class DaggerSearchHistoryRepositoryComponent {

    private static final class Factory implements SearchHistoryRepositoryComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.search.di.searchHistoryRepository.SearchHistoryRepositoryComponent.Factory
        public SearchHistoryRepositoryComponent create(NetworkComponentApi networkComponentApi) {
            networkComponentApi.getClass();
            return new SearchHistoryRepositoryComponentImpl(networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class SearchHistoryRepositoryComponentImpl implements SearchHistoryRepositoryComponent {
        private a<SearchHistoryRepository> bindSearchHistoryRepositoryProvider;
        private a<Retrofit> getRetrofitProvider;
        private a<SearchHistoryApi> provideSearchHistoryApiProvider;
        private final SearchHistoryRepositoryComponentImpl searchHistoryRepositoryComponentImpl;
        private a<SearchHistoryRepositoryImpl> searchHistoryRepositoryImplProvider;

        private static final class GetRetrofitProvider implements a<Retrofit> {
            private final NetworkComponentApi networkComponentApi;

            GetRetrofitProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            @Override // Pc.a
            public Retrofit get() {
                Retrofit retrofit = this.networkComponentApi.getRetrofit();
                j.c(retrofit);
                return retrofit;
            }
        }

        /* synthetic */ SearchHistoryRepositoryComponentImpl(NetworkComponentApi networkComponentApi, int i11) {
            this(networkComponentApi);
        }

        private void initialize(NetworkComponentApi networkComponentApi) {
            GetRetrofitProvider getRetrofitProvider = new GetRetrofitProvider(networkComponentApi);
            this.getRetrofitProvider = getRetrofitProvider;
            a<SearchHistoryApi> b11 = d.b(SearchHistoryRepositoryModule_Companion_ProvideSearchHistoryApiFactory.create(getRetrofitProvider));
            this.provideSearchHistoryApiProvider = b11;
            SearchHistoryRepositoryImpl_Factory create = SearchHistoryRepositoryImpl_Factory.create(b11);
            this.searchHistoryRepositoryImplProvider = create;
            this.bindSearchHistoryRepositoryProvider = d.b(create);
        }

        @Override // ru.ozon.app.android.search.di.searchHistoryRepository.SearchHistoryRepositoryComponentApi
        public SearchHistoryRepository getSearchHistoryRepository() {
            return this.bindSearchHistoryRepositoryProvider.get();
        }

        private SearchHistoryRepositoryComponentImpl(NetworkComponentApi networkComponentApi) {
            this.searchHistoryRepositoryComponentImpl = this;
            initialize(networkComponentApi);
        }
    }

    public static SearchHistoryRepositoryComponent.Factory factory() {
        return new Factory(0);
    }
}
