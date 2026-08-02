package ru.ozon.app.android.search.widgets.searchbar.di;

import Jb.d;
import Jb.j;
import Pc.a;
import WZ.l;
import android.content.Context;
import android.content.SharedPreferences;
import ei0.InterfaceC6369b;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.common.actionHandlers.ModifySearchUrlViewModel;
import ru.ozon.app.android.common.actionHandlers.ModifySearchUrlViewModel_Factory;
import ru.ozon.app.android.common.di.SearchPrefetchApi;
import ru.ozon.app.android.common.filterWidgets.common.KeyboardVisibilityHelper;
import ru.ozon.app.android.commonvertical.sharedCarouselViewModel.SharedCarouselViewModel;
import ru.ozon.app.android.commonvertical.sharedCarouselViewModel.SharedCarouselViewModel_Factory;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayDisableRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository_Default_Factory;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingModule_Companion_ProvideDefaultOnBoardingDisplayOnPageRepositoryFactory;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.search.di.searchHistoryRepository.SearchHistoryRepositoryComponentApi;
import ru.ozon.app.android.search.widgets.history.common.data.SearchHistoryRepository;
import ru.ozon.app.android.search.widgets.searchOnboarding.data.SearchOnboardingRepository;
import ru.ozon.app.android.search.widgets.searchOnboarding.di.repository.SearchOnboardingRepositoryComponentApi;
import ru.ozon.app.android.search.widgets.searchbar.core.ActiveSearchBarMapper;
import ru.ozon.app.android.search.widgets.searchbar.core.ActiveSearchBarMapper_Factory;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchBarMapper;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchBarMapper_Factory;
import ru.ozon.app.android.search.widgets.searchbar.core.repository.SearchByImageRepository;
import ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel_Factory;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.ClearSearchTextViewModel;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.ClearSearchTextViewModel_Factory;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageRouter;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageViewModel;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageViewModel_Factory;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchImageResizer;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchImageResizer_Factory;
import ru.ozon.app.android.search.widgets.tapTags.v2.presentation.TapTagsV2ViewModel;
import ru.ozon.app.android.search.widgets.tapTags.v2.presentation.TapTagsV2ViewModel_Factory;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3ViewModel;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3ViewModel_Factory;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;
import ru.ozon.app.android.storefront.domain.onboarding.di.OnboardingComponentApi;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes7.dex */
public final class DaggerSearchBarComponent {

    private static final class Factory implements SearchBarComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent.Factory
        public SearchBarComponent create(NetworkComponentApi networkComponentApi, ActionComponentApi actionComponentApi, SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi, SearchByImageRepositoryComponentApi searchByImageRepositoryComponentApi, SearchPrefetchApi searchPrefetchApi, ComposerComponentApi composerComponentApi, SearchOnboardingRepositoryComponentApi searchOnboardingRepositoryComponentApi, OnboardingComponentApi onboardingComponentApi, StorageComponentApi storageComponentApi, ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentApi androidPlatformComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, AccountComponentApi accountComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            networkComponentApi.getClass();
            actionComponentApi.getClass();
            searchHistoryRepositoryComponentApi.getClass();
            searchByImageRepositoryComponentApi.getClass();
            searchPrefetchApi.getClass();
            composerComponentApi.getClass();
            searchOnboardingRepositoryComponentApi.getClass();
            onboardingComponentApi.getClass();
            storageComponentApi.getClass();
            contextComponentDependencies.getClass();
            androidPlatformComponentApi.getClass();
            analyticsComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            accountComponentApi.getClass();
            customActionHandlersComponentApi.getClass();
            return new SearchBarComponentImpl(networkComponentApi, actionComponentApi, searchHistoryRepositoryComponentApi, searchByImageRepositoryComponentApi, searchOnboardingRepositoryComponentApi, searchPrefetchApi, composerComponentApi, onboardingComponentApi, storageComponentApi, contextComponentDependencies, androidPlatformComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, accountComponentApi, customActionHandlersComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class SearchBarComponentImpl implements SearchBarComponent {
        private final AccountComponentApi accountComponentApi;
        private a<ActiveSearchBarMapper> activeSearchBarMapperProvider;
        private a<ActiveSearchBarViewModel> activeSearchBarViewModelProvider;
        private final AnalyticsComponentApi analyticsComponentApi;
        private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
        private final AndroidPlatformComponentApi androidPlatformComponentApi;
        private final ComposerComponentApi composerComponentApi;
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
        private a<OnBoardingDisplayRepository.Default> defaultProvider;
        private a<ActionV2Repository> getActionRepositoryProvider;
        private a<AppType> getAppTypeProvider;
        private a<Context> getContextProvider;
        private a<FeatureChecker> getFeatureCheckerProvider;
        private a<FeatureService> getFeatureServiceProvider;
        private a<SearchByImageRepository> getSearchByImageRepositoryProvider;
        private a<SearchHistoryRepository> getSearchHistoryRepositoryProvider;
        private a<SearchOnboardingRepository> getSearchOnboardingRepositoryProvider;
        private a<SharedPreferences> getSharedPreferencesProvider;
        private a<ModifySearchUrlViewModel> modifySearchUrlViewModelProvider;
        private final NetworkComponentApi networkComponentApi;
        private final OnboardingComponentApi onboardingComponentApi;
        private final SearchBarComponentImpl searchBarComponentImpl;
        private a<SearchBarMapper> searchBarMapperProvider;
        private a<SearchByImageViewModel> searchByImageViewModelProvider;
        private a<SearchImageResizer> searchImageResizerProvider;
        private final SearchPrefetchApi searchPrefetchApi;
        private final StorageComponentApi storageComponentApi;
        private a<TapTagsV2ViewModel> tapTagsV2ViewModelProvider;
        private a<TapTagsV3ViewModel> tapTagsV3ViewModelProvider;

        private static final class GetActionRepositoryProvider implements a<ActionV2Repository> {
            private final ActionComponentApi actionComponentApi;

            GetActionRepositoryProvider(ActionComponentApi actionComponentApi) {
                this.actionComponentApi = actionComponentApi;
            }

            @Override // Pc.a
            public ActionV2Repository get() {
                ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
                j.c(actionRepository);
                return actionRepository;
            }
        }

        private static final class GetAppTypeProvider implements a<AppType> {
            private final AndroidPlatformComponentApi androidPlatformComponentApi;

            GetAppTypeProvider(AndroidPlatformComponentApi androidPlatformComponentApi) {
                this.androidPlatformComponentApi = androidPlatformComponentApi;
            }

            @Override // Pc.a
            public AppType get() {
                AppType appType = this.androidPlatformComponentApi.getAppType();
                j.c(appType);
                return appType;
            }
        }

        private static final class GetContextProvider implements a<Context> {
            private final ContextComponentDependencies contextComponentDependencies;

            GetContextProvider(ContextComponentDependencies contextComponentDependencies) {
                this.contextComponentDependencies = contextComponentDependencies;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public Context get() {
                Context context = this.contextComponentDependencies.getContext();
                j.c(context);
                return context;
            }
        }

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

        private static final class GetFeatureServiceProvider implements a<FeatureService> {
            private final NetworkComponentApi networkComponentApi;

            GetFeatureServiceProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            @Override // Pc.a
            public FeatureService get() {
                FeatureService featureService = this.networkComponentApi.getFeatureService();
                j.c(featureService);
                return featureService;
            }
        }

        private static final class GetSearchByImageRepositoryProvider implements a<SearchByImageRepository> {
            private final SearchByImageRepositoryComponentApi searchByImageRepositoryComponentApi;

            GetSearchByImageRepositoryProvider(SearchByImageRepositoryComponentApi searchByImageRepositoryComponentApi) {
                this.searchByImageRepositoryComponentApi = searchByImageRepositoryComponentApi;
            }

            @Override // Pc.a
            public SearchByImageRepository get() {
                SearchByImageRepository searchByImageRepository = this.searchByImageRepositoryComponentApi.getSearchByImageRepository();
                j.c(searchByImageRepository);
                return searchByImageRepository;
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

        private static final class GetSearchOnboardingRepositoryProvider implements a<SearchOnboardingRepository> {
            private final SearchOnboardingRepositoryComponentApi searchOnboardingRepositoryComponentApi;

            GetSearchOnboardingRepositoryProvider(SearchOnboardingRepositoryComponentApi searchOnboardingRepositoryComponentApi) {
                this.searchOnboardingRepositoryComponentApi = searchOnboardingRepositoryComponentApi;
            }

            @Override // Pc.a
            public SearchOnboardingRepository get() {
                SearchOnboardingRepository searchOnboardingRepository = this.searchOnboardingRepositoryComponentApi.getSearchOnboardingRepository();
                j.c(searchOnboardingRepository);
                return searchOnboardingRepository;
            }
        }

        private static final class GetSharedPreferencesProvider implements a<SharedPreferences> {
            private final StorageComponentApi storageComponentApi;

            GetSharedPreferencesProvider(StorageComponentApi storageComponentApi) {
                this.storageComponentApi = storageComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public SharedPreferences get() {
                SharedPreferences sharedPreferences = this.storageComponentApi.getSharedPreferences();
                j.c(sharedPreferences);
                return sharedPreferences;
            }
        }

        /* synthetic */ SearchBarComponentImpl(NetworkComponentApi networkComponentApi, ActionComponentApi actionComponentApi, SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi, SearchByImageRepositoryComponentApi searchByImageRepositoryComponentApi, SearchOnboardingRepositoryComponentApi searchOnboardingRepositoryComponentApi, SearchPrefetchApi searchPrefetchApi, ComposerComponentApi composerComponentApi, OnboardingComponentApi onboardingComponentApi, StorageComponentApi storageComponentApi, ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentApi androidPlatformComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, AccountComponentApi accountComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, int i11) {
            this(networkComponentApi, actionComponentApi, searchHistoryRepositoryComponentApi, searchByImageRepositoryComponentApi, searchOnboardingRepositoryComponentApi, searchPrefetchApi, composerComponentApi, onboardingComponentApi, storageComponentApi, contextComponentDependencies, androidPlatformComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, accountComponentApi, customActionHandlersComponentApi);
        }

        private OnBoardingDisplayDisableRepository.Default default_() {
            SharedPreferences sharedPreferences = this.storageComponentApi.getSharedPreferences();
            j.c(sharedPreferences);
            FeatureService featureService = this.networkComponentApi.getFeatureService();
            j.c(featureService);
            AppVersionService appVersionService = this.networkComponentApi.getAppVersionService();
            j.c(appVersionService);
            return new OnBoardingDisplayDisableRepository.Default(sharedPreferences, featureService, appVersionService);
        }

        private void initialize(NetworkComponentApi networkComponentApi, ActionComponentApi actionComponentApi, SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi, SearchByImageRepositoryComponentApi searchByImageRepositoryComponentApi, SearchOnboardingRepositoryComponentApi searchOnboardingRepositoryComponentApi, SearchPrefetchApi searchPrefetchApi, ComposerComponentApi composerComponentApi, OnboardingComponentApi onboardingComponentApi, StorageComponentApi storageComponentApi, ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentApi androidPlatformComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, AccountComponentApi accountComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            this.getAppTypeProvider = new GetAppTypeProvider(androidPlatformComponentApi);
            GetFeatureCheckerProvider getFeatureCheckerProvider = new GetFeatureCheckerProvider(networkComponentApi);
            this.getFeatureCheckerProvider = getFeatureCheckerProvider;
            this.searchBarMapperProvider = d.b(SearchBarMapper_Factory.create(this.getAppTypeProvider, getFeatureCheckerProvider));
            this.activeSearchBarMapperProvider = d.b(ActiveSearchBarMapper_Factory.create(this.getAppTypeProvider, this.getFeatureCheckerProvider));
            GetSearchHistoryRepositoryProvider getSearchHistoryRepositoryProvider = new GetSearchHistoryRepositoryProvider(searchHistoryRepositoryComponentApi);
            this.getSearchHistoryRepositoryProvider = getSearchHistoryRepositoryProvider;
            this.activeSearchBarViewModelProvider = ActiveSearchBarViewModel_Factory.create(this.getFeatureCheckerProvider, getSearchHistoryRepositoryProvider);
            this.getSearchByImageRepositoryProvider = new GetSearchByImageRepositoryProvider(searchByImageRepositoryComponentApi);
            this.getSearchOnboardingRepositoryProvider = new GetSearchOnboardingRepositoryProvider(searchOnboardingRepositoryComponentApi);
            GetContextProvider getContextProvider = new GetContextProvider(contextComponentDependencies);
            this.getContextProvider = getContextProvider;
            SearchImageResizer_Factory create = SearchImageResizer_Factory.create(getContextProvider, this.getFeatureCheckerProvider);
            this.searchImageResizerProvider = create;
            this.searchByImageViewModelProvider = SearchByImageViewModel_Factory.create(this.getSearchByImageRepositoryProvider, this.getSearchOnboardingRepositoryProvider, create);
            GetActionRepositoryProvider getActionRepositoryProvider = new GetActionRepositoryProvider(actionComponentApi);
            this.getActionRepositoryProvider = getActionRepositoryProvider;
            this.tapTagsV2ViewModelProvider = TapTagsV2ViewModel_Factory.create(getActionRepositoryProvider);
            this.tapTagsV3ViewModelProvider = TapTagsV3ViewModel_Factory.create(this.getFeatureCheckerProvider, this.getActionRepositoryProvider);
            GetSharedPreferencesProvider getSharedPreferencesProvider = new GetSharedPreferencesProvider(storageComponentApi);
            this.getSharedPreferencesProvider = getSharedPreferencesProvider;
            this.defaultProvider = d.b(OnBoardingDisplayRepository_Default_Factory.create(getSharedPreferencesProvider));
            GetFeatureServiceProvider getFeatureServiceProvider = new GetFeatureServiceProvider(networkComponentApi);
            this.getFeatureServiceProvider = getFeatureServiceProvider;
            this.modifySearchUrlViewModelProvider = ModifySearchUrlViewModel_Factory.create(getFeatureServiceProvider);
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public ActiveSearchBarMapper activeSearchBarMapper() {
            return this.activeSearchBarMapperProvider.get();
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public Sg.a analyticsScreenStorage() {
            Sg.a analyticsScreenStorage = this.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
            j.c(analyticsScreenStorage);
            return analyticsScreenStorage;
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public AuthStateStorage authStateStorage() {
            AuthStateStorage authStateStorage = this.storageComponentApi.getAuthStateStorage();
            j.c(authStateStorage);
            return authStateStorage;
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public a<ClearSearchTextViewModel> clearSearchTextViewModel() {
            return ClearSearchTextViewModel_Factory.create();
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public Vg.d customActionHandlersStoreFactory() {
            Vg.d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return customActionHandlersStoreFactory;
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public FeatureChecker featureChecker() {
            FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
            j.c(featureChecker);
            return featureChecker;
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public FeatureService featureService() {
            FeatureService featureService = this.networkComponentApi.getFeatureService();
            j.c(featureService);
            return featureService;
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public CommonOnboardingRepository getOnboardingRepository() {
            CommonOnboardingRepository onboardingRepository = this.onboardingComponentApi.getOnboardingRepository();
            j.c(onboardingRepository);
            return onboardingRepository;
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public l getTokenizedAnalytics() {
            l tokenizedAnalytics = this.composerComponentApi.getTokenizedAnalytics();
            j.c(tokenizedAnalytics);
            return tokenizedAnalytics;
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public KeyboardVisibilityHelper keyboardVisibilityHelper() {
            return new KeyboardVisibilityHelper();
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public a<ModifySearchUrlViewModel> modifySearchUrlViewModel() {
            return this.modifySearchUrlViewModelProvider;
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public ComposerNavigator navigator() {
            ComposerNavigator composerNavigator = this.composerComponentApi.getComposerNavigator();
            j.c(composerNavigator);
            return composerNavigator;
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public BaseOnBoardingViewModel.Default onBoardingViewModel() {
            return new BaseOnBoardingViewModel.Default(this.defaultProvider.get(), OnBoardingModule_Companion_ProvideDefaultOnBoardingDisplayOnPageRepositoryFactory.provideDefaultOnBoardingDisplayOnPageRepository(), default_());
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public InterfaceC6369b ozonTracker() {
            InterfaceC6369b ozonTracker = this.analyticsComponentApi.getOzonTracker();
            j.c(ozonTracker);
            return ozonTracker;
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public SearchByImageRouter searchByImageRouter() {
            return new SearchByImageRouter(this.androidPlatformComponentApi);
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public a<SearchByImageViewModel> searchPhotoViewModel() {
            return this.searchByImageViewModelProvider;
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public SearchUrlPrefetchService searchUrlPrefetchService() {
            SearchUrlPrefetchService searchUrlPrefetchService = this.searchPrefetchApi.getSearchUrlPrefetchService();
            j.c(searchUrlPrefetchService);
            return searchUrlPrefetchService;
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public a<SharedCarouselViewModel> sharedCarouselViewModel() {
            return SharedCarouselViewModel_Factory.create();
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public SharedPreferences sharedPreferences() {
            SharedPreferences sharedPreferences = this.storageComponentApi.getSharedPreferences();
            j.c(sharedPreferences);
            return sharedPreferences;
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public SearchBarMapper staticSearchBarMapper() {
            return this.searchBarMapperProvider.get();
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public a<TapTagsV2ViewModel> tapTagsV2ViewModel() {
            return this.tapTagsV2ViewModelProvider;
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public a<TapTagsV3ViewModel> tapTagsV3ViewModel() {
            return this.tapTagsV3ViewModelProvider;
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public UserManager userManager() {
            UserManager userManager = this.accountComponentApi.getUserManager();
            j.c(userManager);
            return userManager;
        }

        @Override // ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent
        public a<ActiveSearchBarViewModel> viewModel() {
            return this.activeSearchBarViewModelProvider;
        }

        private SearchBarComponentImpl(NetworkComponentApi networkComponentApi, ActionComponentApi actionComponentApi, SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi, SearchByImageRepositoryComponentApi searchByImageRepositoryComponentApi, SearchOnboardingRepositoryComponentApi searchOnboardingRepositoryComponentApi, SearchPrefetchApi searchPrefetchApi, ComposerComponentApi composerComponentApi, OnboardingComponentApi onboardingComponentApi, StorageComponentApi storageComponentApi, ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentApi androidPlatformComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, AccountComponentApi accountComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            this.searchBarComponentImpl = this;
            this.composerComponentApi = composerComponentApi;
            this.searchPrefetchApi = searchPrefetchApi;
            this.networkComponentApi = networkComponentApi;
            this.androidPlatformComponentApi = androidPlatformComponentApi;
            this.onboardingComponentApi = onboardingComponentApi;
            this.storageComponentApi = storageComponentApi;
            this.analyticsComponentApi = analyticsComponentApi;
            this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            this.accountComponentApi = accountComponentApi;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
            initialize(networkComponentApi, actionComponentApi, searchHistoryRepositoryComponentApi, searchByImageRepositoryComponentApi, searchOnboardingRepositoryComponentApi, searchPrefetchApi, composerComponentApi, onboardingComponentApi, storageComponentApi, contextComponentDependencies, androidPlatformComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, accountComponentApi, customActionHandlersComponentApi);
        }
    }

    public static SearchBarComponent.Factory factory() {
        return new Factory(0);
    }
}
