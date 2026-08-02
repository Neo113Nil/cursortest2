package ru.ozon.app.android.search.widgets.dialogSearchBar.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.common.di.SearchPrefetchApi;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.category.FilterSharedViewModel;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.search.di.searchHistoryRepository.SearchHistoryRepositoryComponentApi;
import ru.ozon.app.android.search.dialogsearchscreen.DialogSearchViewModel;
import ru.ozon.app.android.search.widgets.dialogSearchBar.data.DialogSearchBarMapper;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.ClearSearchTextViewModel;

@Metadata(d1 = {"\u0000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0018\u00101\u001a\u00060-j\u0002`.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"ru/ozon/app/android/search/widgets/dialogSearchBar/di/DialogSearchBarComponent$Companion$create$1$1", "Lru/ozon/app/android/search/widgets/dialogSearchBar/di/DialogSearchBarComponent;", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/search/di/searchHistoryRepository/SearchHistoryRepositoryComponentApi;", "searchHistoryRepositoryComponentApi", "Lru/ozon/app/android/search/di/searchHistoryRepository/SearchHistoryRepositoryComponentApi;", "Lru/ozon/app/android/search/dialogsearchscreen/DialogSearchViewModel;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/search/dialogsearchscreen/DialogSearchViewModel;", "viewModel", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/FilterSharedViewModel;", "kotlin.jvm.PlatformType", "filterSharedViewModel", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/FilterSharedViewModel;", "getFilterSharedViewModel", "()Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/FilterSharedViewModel;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarMapper;", "mapper", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker$delegate", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/ClearSearchTextViewModel;", "getClearSearchTextViewModel", "()Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/ClearSearchTextViewModel;", "clearSearchTextViewModel", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "getSearchUrlPrefetchService", "()Lru/ozon/app/android/common/SearchUrlPrefetchService;", "searchUrlPrefetchService", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "getRepository", "()Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "repository", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DialogSearchBarComponent$Companion$create$1$1 implements DialogSearchBarComponent {
    final /* synthetic */ SearchPrefetchApi $searchPrefetchApi;
    final /* synthetic */ C7475g $storage;
    private final NavigationComponentApi navigationComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModel = k.b(new DialogSearchBarComponent$Companion$create$1$1$viewModel$2(this));
    private final FilterSharedViewModel filterSharedViewModel = filterSharedViewModel$lambda$0();

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(DialogSearchBarComponent$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: featureChecker$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j featureChecker = k.b(new DialogSearchBarComponent$Companion$create$1$1$featureChecker$2(this));

    DialogSearchBarComponent$Companion$create$1$1(C7475g c7475g, SearchPrefetchApi searchPrefetchApi) {
        this.$storage = c7475g;
        this.$searchPrefetchApi = searchPrefetchApi;
        this.navigationComponentApi = (NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.searchHistoryRepositoryComponentApi = (SearchHistoryRepositoryComponentApi) c7475g.getComponent(SearchHistoryRepositoryComponentApi.class);
    }

    private static final FilterSharedViewModel filterSharedViewModel$lambda$0() {
        return new FilterSharedViewModel();
    }

    @Override // ru.ozon.app.android.search.widgets.dialogSearchBar.di.DialogSearchBarComponent
    public ClearSearchTextViewModel getClearSearchTextViewModel() {
        return new ClearSearchTextViewModel();
    }

    @Override // ru.ozon.app.android.search.widgets.dialogSearchBar.di.DialogSearchBarComponent
    public FeatureChecker getFeatureChecker() {
        return (FeatureChecker) this.featureChecker.getValue();
    }

    @Override // ru.ozon.app.android.search.widgets.dialogSearchBar.di.DialogSearchBarComponent
    public FilterSharedViewModel getFilterSharedViewModel() {
        return this.filterSharedViewModel;
    }

    @Override // ru.ozon.app.android.search.widgets.dialogSearchBar.di.DialogSearchBarComponent
    public DialogSearchBarMapper getMapper() {
        return (DialogSearchBarMapper) this.mapper.getValue();
    }

    public ComposerAsyncWidgetRepository getRepository() {
        return ((ComposerWidgetAsyncComponentApi) this.$storage.getComponent(ComposerWidgetAsyncComponentApi.class)).getComposerAsyncWidgetRepository();
    }

    @Override // ru.ozon.app.android.search.widgets.dialogSearchBar.di.DialogSearchBarComponent
    public SearchUrlPrefetchService getSearchUrlPrefetchService() {
        return this.$searchPrefetchApi.getSearchUrlPrefetchService();
    }

    @Override // ru.ozon.app.android.search.widgets.dialogSearchBar.di.DialogSearchBarComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.search.widgets.dialogSearchBar.di.DialogSearchBarComponent
    public DialogSearchViewModel getViewModel() {
        return (DialogSearchViewModel) this.viewModel.getValue();
    }
}
