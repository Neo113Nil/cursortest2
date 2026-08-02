package ru.ozon.app.android.search.widgets.searchbar.di;

import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.search.widgets.searchbar.core.repository.SearchByImageApi;
import ru.ozon.app.android.search.widgets.searchbar.core.repository.SearchByImageRepository;
import ru.ozon.app.android.search.widgets.searchbar.core.repository.SearchByImageRepositoryImpl;
import ru.ozon.app.android.search.widgets.searchbar.di.SearchByImageRepositoryComponent;

/* loaded from: classes7.dex */
public final class DaggerSearchByImageRepositoryComponent {

    private static final class Factory implements SearchByImageRepositoryComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchByImageRepositoryComponent.Factory
        public SearchByImageRepositoryComponent create(NetworkComponentApi networkComponentApi) {
            networkComponentApi.getClass();
            return new SearchByImageRepositoryComponentImpl(networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class SearchByImageRepositoryComponentImpl implements SearchByImageRepositoryComponent {
        private final NetworkComponentApi networkComponentApi;
        private final SearchByImageRepositoryComponentImpl searchByImageRepositoryComponentImpl;

        /* synthetic */ SearchByImageRepositoryComponentImpl(NetworkComponentApi networkComponentApi, int i11) {
            this(networkComponentApi);
        }

        private SearchByImageApi searchByImageApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return SearchByImageRepositoryModule_Companion_ProvideSearchByImageApiFactory.provideSearchByImageApi(retrofit);
        }

        private SearchByImageRepositoryImpl searchByImageRepositoryImpl() {
            return new SearchByImageRepositoryImpl(searchByImageApi());
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchByImageRepositoryComponentApi
        public SearchByImageRepository getSearchByImageRepository() {
            return searchByImageRepositoryImpl();
        }

        private SearchByImageRepositoryComponentImpl(NetworkComponentApi networkComponentApi) {
            this.searchByImageRepositoryComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
        }
    }

    public static SearchByImageRepositoryComponent.Factory factory() {
        return new Factory(0);
    }
}
