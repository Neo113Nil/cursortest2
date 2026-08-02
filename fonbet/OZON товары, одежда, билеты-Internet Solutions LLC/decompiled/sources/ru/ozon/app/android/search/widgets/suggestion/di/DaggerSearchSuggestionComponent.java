package ru.ozon.app.android.search.widgets.suggestion.di;

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
import ru.ozon.app.android.search.widgets.history.common.data.SearchHistoryRepository;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel_Factory;
import ru.ozon.app.android.search.widgets.suggestion.data.SuggestionMapper;
import ru.ozon.app.android.search.widgets.suggestion.data.SuggestionMapper_Factory;
import ru.ozon.app.android.search.widgets.suggestion.di.SearchSuggestionComponent;
import ru.ozon.app.android.search.widgets.title.core.SuggestionTitleMapper;
import ru.ozon.app.android.search.widgets.title.core.SuggestionTitleMapper_Factory;

/* loaded from: classes13.dex */
public final class DaggerSearchSuggestionComponent {

    private static final class Factory implements SearchSuggestionComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.search.widgets.suggestion.di.SearchSuggestionComponent.Factory
        public SearchSuggestionComponent create(ComposerComponentApi composerComponentApi, SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi, SearchPrefetchApi searchPrefetchApi, NetworkComponentApi networkComponentApi) {
            composerComponentApi.getClass();
            searchHistoryRepositoryComponentApi.getClass();
            searchPrefetchApi.getClass();
            networkComponentApi.getClass();
            return new SearchSuggestionComponentImpl(0, searchPrefetchApi, composerComponentApi, networkComponentApi, searchHistoryRepositoryComponentApi);
        }

        private Factory() {
        }
    }

    private static final class SearchSuggestionComponentImpl implements SearchSuggestionComponent {
        private a<ActiveSearchBarViewModel> activeSearchBarViewModelProvider;
        private a<FeatureChecker> getFeatureCheckerProvider;
        private a<SearchHistoryRepository> getSearchHistoryRepositoryProvider;
        private a<HandlersInhibitor> handlersInhibitorProvider;
        private final SearchPrefetchApi searchPrefetchApi;
        private final SearchSuggestionComponentImpl searchSuggestionComponentImpl;
        private a<SuggestionMapper> suggestionMapperProvider;
        private a<SuggestionTitleMapper> suggestionTitleMapperProvider;

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

        /* synthetic */ SearchSuggestionComponentImpl(int i11, SearchPrefetchApi searchPrefetchApi, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi) {
            this(composerComponentApi, searchHistoryRepositoryComponentApi, searchPrefetchApi, networkComponentApi);
        }

        private void initialize(ComposerComponentApi composerComponentApi, SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi, SearchPrefetchApi searchPrefetchApi, NetworkComponentApi networkComponentApi) {
            this.suggestionTitleMapperProvider = d.b(SuggestionTitleMapper_Factory.create());
            this.suggestionMapperProvider = d.b(SuggestionMapper_Factory.create());
            this.getFeatureCheckerProvider = new GetFeatureCheckerProvider(networkComponentApi);
            GetSearchHistoryRepositoryProvider getSearchHistoryRepositoryProvider = new GetSearchHistoryRepositoryProvider(searchHistoryRepositoryComponentApi);
            this.getSearchHistoryRepositoryProvider = getSearchHistoryRepositoryProvider;
            this.activeSearchBarViewModelProvider = ActiveSearchBarViewModel_Factory.create(this.getFeatureCheckerProvider, getSearchHistoryRepositoryProvider);
            this.handlersInhibitorProvider = m.a(HandlersInhibitor_Factory.create());
        }

        @Override // ru.ozon.app.android.search.widgets.suggestion.di.SearchSuggestionComponent
        public HandlersInhibitor getHandlersInhibitor() {
            return this.handlersInhibitorProvider.get();
        }

        @Override // ru.ozon.app.android.search.widgets.suggestion.di.SearchSuggestionComponent
        public SearchUrlPrefetchService searchUrlPrefetchService() {
            SearchUrlPrefetchService searchUrlPrefetchService = this.searchPrefetchApi.getSearchUrlPrefetchService();
            j.c(searchUrlPrefetchService);
            return searchUrlPrefetchService;
        }

        @Override // ru.ozon.app.android.search.widgets.suggestion.di.SearchSuggestionComponent
        public SuggestionMapper suggestMapper() {
            return this.suggestionMapperProvider.get();
        }

        @Override // ru.ozon.app.android.search.widgets.suggestion.di.SearchSuggestionComponent
        public SuggestionTitleMapper titleMapper() {
            return this.suggestionTitleMapperProvider.get();
        }

        @Override // ru.ozon.app.android.search.widgets.suggestion.di.SearchSuggestionComponent
        public a<ActiveSearchBarViewModel> viewModel() {
            return this.activeSearchBarViewModelProvider;
        }

        private SearchSuggestionComponentImpl(ComposerComponentApi composerComponentApi, SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi, SearchPrefetchApi searchPrefetchApi, NetworkComponentApi networkComponentApi) {
            this.searchSuggestionComponentImpl = this;
            this.searchPrefetchApi = searchPrefetchApi;
            initialize(composerComponentApi, searchHistoryRepositoryComponentApi, searchPrefetchApi, networkComponentApi);
        }
    }

    public static SearchSuggestionComponent.Factory factory() {
        return new Factory(0);
    }
}
