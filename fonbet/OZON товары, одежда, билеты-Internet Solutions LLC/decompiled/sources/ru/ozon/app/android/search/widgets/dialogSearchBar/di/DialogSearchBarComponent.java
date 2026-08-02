package ru.ozon.app.android.search.widgets.dialogSearchBar.di;

import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import k20.InterfaceC7469a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.common.di.SearchPrefetchApi;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.category.FilterSharedViewModel;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.dialogsearchscreen.DialogSearchViewModel;
import ru.ozon.app.android.search.widgets.dialogSearchBar.data.DialogSearchBarMapper;
import ru.ozon.app.android.search.widgets.dialogSearchBar.di.DialogSearchBarComponent;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.ClearSearchTextViewModel;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000  2\u00060\u0001j\u0002`\u0002:\u0001 R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001b\u001a\u00060\u0017j\u0002`\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/di/DialogSearchBarComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/FilterSharedViewModel;", "getFilterSharedViewModel", "()Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/FilterSharedViewModel;", "filterSharedViewModel", "Lru/ozon/app/android/search/dialogsearchscreen/DialogSearchViewModel;", "getViewModel", "()Lru/ozon/app/android/search/dialogsearchscreen/DialogSearchViewModel;", "viewModel", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/ClearSearchTextViewModel;", "getClearSearchTextViewModel", "()Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/ClearSearchTextViewModel;", "clearSearchTextViewModel", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "getSearchUrlPrefetchService", "()Lru/ozon/app/android/common/SearchUrlPrefetchService;", "searchUrlPrefetchService", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarMapper;", "getMapper", "()Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarMapper;", "mapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DialogSearchBarComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/di/DialogSearchBarComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/di/DialogSearchBarComponent;", "create", "(Lk20/g;)Lk20/e;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DialogSearchBarComponent create$lambda$0(C7475g c7475g, SearchPrefetchApi searchPrefetchApi) {
            return new DialogSearchBarComponent$Companion$create$1$1(c7475g, searchPrefetchApi);
        }

        @NotNull
        public final C7473e<DialogSearchBarComponent> create(@NotNull final C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            final SearchPrefetchApi searchPrefetchApi = (SearchPrefetchApi) storage.getComponent(SearchPrefetchApi.class);
            return new C7473e<>(N.b(DialogSearchBarComponent.class), new InterfaceC7469a() { // from class: pI.a
                @Override // k20.InterfaceC7469a
                public final InterfaceC6958a component() {
                    DialogSearchBarComponent create$lambda$0;
                    create$lambda$0 = DialogSearchBarComponent.Companion.create$lambda$0(C7475g.this, searchPrefetchApi);
                    return create$lambda$0;
                }
            });
        }
    }

    @NotNull
    ClearSearchTextViewModel getClearSearchTextViewModel();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    FilterSharedViewModel getFilterSharedViewModel();

    @NotNull
    DialogSearchBarMapper getMapper();

    @NotNull
    SearchUrlPrefetchService getSearchUrlPrefetchService();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    DialogSearchViewModel getViewModel();
}
