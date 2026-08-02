package ru.ozon.app.android.search.widgets.suggestions.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.search.di.searchHistoryRepository.SearchHistoryRepositoryComponentApi;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.app.android.search.widgets.suggestions.core.SuggestionWithFilterMapper;
import ru.ozon.app.android.search.widgets.suggestions.data.onboarding.SuggestionShimmerOnboardingRepositoryImpl;
import ru.ozon.app.android.search.widgets.suggestions.data.onboarding.SuggestionsShimmerOnboardingResolver;
import ru.ozon.app.android.search.widgets.suggestions.di.SuggestionsWidgetComponent$Companion$create$1;
import ru.ozon.app.android.search.widgets.suggestions.ui.prefetch.SuggestionsPrefetchViewModel;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter.SuggestionWithFilterSharedViewModel;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000\u0081\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001f\u0010'\u001a\u00060\"j\u0002`#8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010&R(\u0010+\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010)0)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R(\u00100\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010/0/0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.R(\u00103\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u000102020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b4\u0010.R\u0014\u00108\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"ru/ozon/app/android/search/widgets/suggestions/di/SuggestionsWidgetComponent$Companion$create$1", "Lru/ozon/app/android/search/widgets/suggestions/di/SuggestionsWidgetComponent;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/search/di/searchHistoryRepository/SearchHistoryRepositoryComponentApi;", "searchHistoryRepositoryComponentApi", "Lru/ozon/app/android/search/di/searchHistoryRepository/SearchHistoryRepositoryComponentApi;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/search/widgets/suggestions/data/onboarding/SuggestionShimmerOnboardingRepositoryImpl;", "suggestionShimmerOnboardingRepository", "Lru/ozon/app/android/search/widgets/suggestions/data/onboarding/SuggestionShimmerOnboardingRepositoryImpl;", "Lru/ozon/app/android/search/widgets/suggestions/core/SuggestionWithFilterMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/search/widgets/suggestions/core/SuggestionWithFilterMapper;", "mapper", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory$delegate", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LPc/a;", "Lru/ozon/app/android/search/widgets/suggestions/ui/prefetch/SuggestionsPrefetchViewModel;", "kotlin.jvm.PlatformType", "suggestionsPrefetchViewModelProvider", "LPc/a;", "getSuggestionsPrefetchViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterSharedViewModel;", "suggestionWithFilterSharedViewModelProvider", "getSuggestionWithFilterSharedViewModelProvider", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "activeSearchBarViewModelProvider", "getActiveSearchBarViewModelProvider", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionsWidgetComponent$Companion$create$1 implements SuggestionsWidgetComponent {
    private final a<ActiveSearchBarViewModel> activeSearchBarViewModelProvider;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: customActionHandlersStoreFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j customActionHandlersStoreFactory;
    private final FeatureChecker featureChecker;

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper;
    private final NetworkComponentApi networkComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;
    private final SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi;
    private final StorageComponentApi storageComponentApi;
    private final SuggestionShimmerOnboardingRepositoryImpl suggestionShimmerOnboardingRepository;
    private final a<SuggestionWithFilterSharedViewModel> suggestionWithFilterSharedViewModelProvider;
    private final a<SuggestionsPrefetchViewModel> suggestionsPrefetchViewModelProvider;

    SuggestionsWidgetComponent$Companion$create$1(C7475g c7475g) {
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.networkComponentApi = networkComponentApi;
        StorageComponentApi storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
        this.storageComponentApi = storageComponentApi;
        this.searchHistoryRepositoryComponentApi = (SearchHistoryRepositoryComponentApi) c7475g.getComponent(SearchHistoryRepositoryComponentApi.class);
        this.featureChecker = networkComponentApi.getFeatureChecker();
        this.suggestionShimmerOnboardingRepository = new SuggestionShimmerOnboardingRepositoryImpl(storageComponentApi.getSharedPreferences());
        this.mapper = k.b(SuggestionsWidgetComponent$Companion$create$1$mapper$2.INSTANCE);
        this.handlersInhibitor = k.b(SuggestionsWidgetComponent$Companion$create$1$handlersInhibitor$2.INSTANCE);
        this.customActionHandlersStoreFactory = k.b(new SuggestionsWidgetComponent$Companion$create$1$customActionHandlersStoreFactory$2(this));
        this.suggestionsPrefetchViewModelProvider = new UI.a();
        this.suggestionWithFilterSharedViewModelProvider = new a() { // from class: UI.b
            @Override // Pc.a
            public final Object get() {
                SuggestionWithFilterSharedViewModel suggestionWithFilterSharedViewModelProvider$lambda$1;
                suggestionWithFilterSharedViewModelProvider$lambda$1 = SuggestionsWidgetComponent$Companion$create$1.suggestionWithFilterSharedViewModelProvider$lambda$1(SuggestionsWidgetComponent$Companion$create$1.this);
                return suggestionWithFilterSharedViewModelProvider$lambda$1;
            }
        };
        this.activeSearchBarViewModelProvider = new a() { // from class: UI.c
            @Override // Pc.a
            public final Object get() {
                ActiveSearchBarViewModel activeSearchBarViewModelProvider$lambda$2;
                activeSearchBarViewModelProvider$lambda$2 = SuggestionsWidgetComponent$Companion$create$1.activeSearchBarViewModelProvider$lambda$2(SuggestionsWidgetComponent$Companion$create$1.this);
                return activeSearchBarViewModelProvider$lambda$2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActiveSearchBarViewModel activeSearchBarViewModelProvider$lambda$2(SuggestionsWidgetComponent$Companion$create$1 suggestionsWidgetComponent$Companion$create$1) {
        return new ActiveSearchBarViewModel(suggestionsWidgetComponent$Companion$create$1.featureChecker, suggestionsWidgetComponent$Companion$create$1.searchHistoryRepositoryComponentApi.getSearchHistoryRepository());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SuggestionWithFilterSharedViewModel suggestionWithFilterSharedViewModelProvider$lambda$1(SuggestionsWidgetComponent$Companion$create$1 suggestionsWidgetComponent$Companion$create$1) {
        return new SuggestionWithFilterSharedViewModel(new SuggestionsShimmerOnboardingResolver(suggestionsWidgetComponent$Companion$create$1.suggestionShimmerOnboardingRepository, suggestionsWidgetComponent$Companion$create$1.featureChecker));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SuggestionsPrefetchViewModel suggestionsPrefetchViewModelProvider$lambda$0() {
        return new SuggestionsPrefetchViewModel();
    }

    @Override // ru.ozon.app.android.search.widgets.suggestions.di.SuggestionsWidgetComponent
    public a<ActiveSearchBarViewModel> getActiveSearchBarViewModelProvider() {
        return this.activeSearchBarViewModelProvider;
    }

    @Override // ru.ozon.app.android.search.widgets.suggestions.di.SuggestionsWidgetComponent
    public d getCustomActionHandlersStoreFactory() {
        return (d) this.customActionHandlersStoreFactory.getValue();
    }

    @Override // ru.ozon.app.android.search.widgets.suggestions.di.SuggestionsWidgetComponent
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @Override // ru.ozon.app.android.search.widgets.suggestions.di.SuggestionsWidgetComponent
    public SuggestionWithFilterMapper getMapper() {
        return (SuggestionWithFilterMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.search.widgets.suggestions.di.SuggestionsWidgetComponent
    public a<SuggestionWithFilterSharedViewModel> getSuggestionWithFilterSharedViewModelProvider() {
        return this.suggestionWithFilterSharedViewModelProvider;
    }

    @Override // ru.ozon.app.android.search.widgets.suggestions.di.SuggestionsWidgetComponent
    public a<SuggestionsPrefetchViewModel> getSuggestionsPrefetchViewModelProvider() {
        return this.suggestionsPrefetchViewModelProvider;
    }

    @Override // ru.ozon.app.android.search.widgets.suggestions.di.SuggestionsWidgetComponent
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }
}
