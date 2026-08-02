package ru.ozon.app.android.search.widgets.history.catalog.di;

import Jb.d;
import Jb.j;
import Jb.m;
import Pc.a;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.common.di.SearchPrefetchApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor_Factory;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.search.di.searchHistoryRepository.SearchHistoryRepositoryComponentApi;
import ru.ozon.app.android.search.widgets.history.catalog.data.SearchHistoryMapper;
import ru.ozon.app.android.search.widgets.history.catalog.data.SearchHistoryMapper_Factory;
import ru.ozon.app.android.search.widgets.history.catalog.di.SearchHistoryWidgetComponent;
import ru.ozon.app.android.search.widgets.history.common.data.SearchHistoryRepository;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel_Factory;
import ru.ozon.app.android.search.widgets.title.core.SearchHistoryTitleMapper;
import ru.ozon.app.android.search.widgets.title.core.SearchHistoryTitleMapper_Factory;

/* loaded from: classes13.dex */
public final class DaggerSearchHistoryWidgetComponent {

    private static final class Factory implements SearchHistoryWidgetComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.search.widgets.history.catalog.di.SearchHistoryWidgetComponent.Factory
        public SearchHistoryWidgetComponent create(NetworkComponentApi networkComponentApi, ComposerComponentApi composerComponentApi, SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi, SearchPrefetchApi searchPrefetchApi) {
            networkComponentApi.getClass();
            composerComponentApi.getClass();
            searchHistoryRepositoryComponentApi.getClass();
            searchPrefetchApi.getClass();
            return new SearchHistoryWidgetComponentImpl(0, searchPrefetchApi, composerComponentApi, networkComponentApi, searchHistoryRepositoryComponentApi);
        }

        private Factory() {
        }
    }

    private static final class SearchHistoryWidgetComponentImpl implements SearchHistoryWidgetComponent {
        private a<ActiveSearchBarViewModel> activeSearchBarViewModelProvider;
        private a<FeatureChecker> getFeatureCheckerProvider;
        private a<SearchHistoryRepository> getSearchHistoryRepositoryProvider;
        private a<HandlersInhibitor> handlersInhibitorProvider;
        private a<SearchHistoryMapper> searchHistoryMapperProvider;
        private a<SearchHistoryTitleMapper> searchHistoryTitleMapperProvider;
        private final SearchHistoryWidgetComponentImpl searchHistoryWidgetComponentImpl;
        private final SearchPrefetchApi searchPrefetchApi;

        private static final class GetFeatureCheckerProvider implements a<FeatureChecker> {
            private final NetworkComponentApi networkComponentApi;

            GetFeatureCheckerProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            @Override // Pc.a
            public FeatureChecker get() {
                FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
                j.c(featureChecker);
                return featureChecker;
            }
        }

        private static final class GetSearchHistoryRepositoryProvider implements a<SearchHistoryRepository> {
            private final SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi;

            GetSearchHistoryRepositoryProvider(SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi) {
                this.searchHistoryRepositoryComponentApi = searchHistoryRepositoryComponentApi;
            }

            @Override // Pc.a
            public SearchHistoryRepository get() {
                SearchHistoryRepository searchHistoryRepository = this.searchHistoryRepositoryComponentApi.getSearchHistoryRepository();
                j.c(searchHistoryRepository);
                return searchHistoryRepository;
            }
        }

        /* synthetic */ SearchHistoryWidgetComponentImpl(int i11, SearchPrefetchApi searchPrefetchApi, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi) {
            this(networkComponentApi, composerComponentApi, searchHistoryRepositoryComponentApi, searchPrefetchApi);
        }

        private void initialize(NetworkComponentApi networkComponentApi, ComposerComponentApi composerComponentApi, SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi, SearchPrefetchApi searchPrefetchApi) {
            this.searchHistoryMapperProvider = d.b(SearchHistoryMapper_Factory.create());
            this.searchHistoryTitleMapperProvider = d.b(SearchHistoryTitleMapper_Factory.create());
            this.getFeatureCheckerProvider = new GetFeatureCheckerProvider(networkComponentApi);
            GetSearchHistoryRepositoryProvider getSearchHistoryRepositoryProvider = new GetSearchHistoryRepositoryProvider(searchHistoryRepositoryComponentApi);
            this.getSearchHistoryRepositoryProvider = getSearchHistoryRepositoryProvider;
            this.activeSearchBarViewModelProvider = ActiveSearchBarViewModel_Factory.create(this.getFeatureCheckerProvider, getSearchHistoryRepositoryProvider);
            this.handlersInhibitorProvider = m.a(HandlersInhibitor_Factory.create());
        }

        @Override // ru.ozon.app.android.search.widgets.history.catalog.di.SearchHistoryWidgetComponent
        public a<ActiveSearchBarViewModel> activeSearchBarViewModel() {
            return this.activeSearchBarViewModelProvider;
        }

        @Override // ru.ozon.app.android.search.widgets.history.catalog.di.SearchHistoryWidgetComponent
        public HandlersInhibitor getHandlersInhibitor() {
            return this.handlersInhibitorProvider.get();
        }

        @Override // ru.ozon.app.android.search.widgets.history.catalog.di.SearchHistoryWidgetComponent
        public SearchHistoryMapper mapper() {
            return this.searchHistoryMapperProvider.get();
        }

        @Override // ru.ozon.app.android.search.widgets.history.catalog.di.SearchHistoryWidgetComponent
        public SearchUrlPrefetchService searchUrlPrefetchService() {
            SearchUrlPrefetchService searchUrlPrefetchService = this.searchPrefetchApi.getSearchUrlPrefetchService();
            j.c(searchUrlPrefetchService);
            return searchUrlPrefetchService;
        }

        @Override // ru.ozon.app.android.search.widgets.history.catalog.di.SearchHistoryWidgetComponent
        public SearchHistoryTitleMapper titleMapper() {
            return this.searchHistoryTitleMapperProvider.get();
        }

        private SearchHistoryWidgetComponentImpl(NetworkComponentApi networkComponentApi, ComposerComponentApi composerComponentApi, SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi, SearchPrefetchApi searchPrefetchApi) {
            this.searchHistoryWidgetComponentImpl = this;
            this.searchPrefetchApi = searchPrefetchApi;
            initialize(networkComponentApi, composerComponentApi, searchHistoryRepositoryComponentApi, searchPrefetchApi);
        }
    }

    public static SearchHistoryWidgetComponent.Factory factory() {
        return new Factory(0);
    }
}
