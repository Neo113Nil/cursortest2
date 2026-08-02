package ru.ozon.app.android.search.widgets.history.search.di;

import AV.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.common.di.SearchPrefetchApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.search.di.searchHistoryRepository.SearchHistoryRepositoryComponentApi;
import ru.ozon.app.android.search.widgets.history.common.data.SearchHistoryRepository;
import ru.ozon.app.android.search.widgets.history.search.data.HistoryMapper;
import ru.ozon.app.android.search.widgets.history.search.presentation.HistoryViewModel;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00182\u00060\u0001j\u0002`\u0002:\u0001\u0018R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0017\u001a\u00060\u0013j\u0002`\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/di/HistoryWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/search/widgets/history/search/data/HistoryMapper;", "getMapper", "()Lru/ozon/app/android/search/widgets/history/search/data/HistoryMapper;", "mapper", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "getSearchUrlPrefetchService", "()Lru/ozon/app/android/common/SearchUrlPrefetchService;", "searchUrlPrefetchService", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "getActiveSearchBarViewModel", "()Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "activeSearchBarViewModel", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryViewModel;", "getHistoryViewModel", "()Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryViewModel;", "historyViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface HistoryWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/di/HistoryWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/search/widgets/history/search/di/HistoryWidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final HistoryWidgetComponent create$lambda$0(final C7475g c7475g) {
            return new HistoryWidgetComponent(c7475g) { // from class: ru.ozon.app.android.search.widgets.history.search.di.HistoryWidgetComponent$Companion$create$1$1
                private final AccountComponentApi accountComponentApi;
                private final ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(HistoryWidgetComponent$Companion$create$1$1$mapper$2.INSTANCE);
                private final NetworkComponentApi networkComponentApi;
                private final RetainComposerComponentApi retainComposerComponentApi;
                private final SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi;
                private final SearchPrefetchApi searchPrefetchApi;
                private final StorageComponentApi storageComponentApi;

                {
                    this.composerWidgetAsyncComponentApi = (ComposerWidgetAsyncComponentApi) c7475g.getComponent(ComposerWidgetAsyncComponentApi.class);
                    this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
                    this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                    this.searchPrefetchApi = (SearchPrefetchApi) c7475g.getComponent(SearchPrefetchApi.class);
                    this.searchHistoryRepositoryComponentApi = (SearchHistoryRepositoryComponentApi) c7475g.getComponent(SearchHistoryRepositoryComponentApi.class);
                    this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
                    this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
                }

                private final SearchHistoryRepository getSearchHistoryRepository() {
                    return this.searchHistoryRepositoryComponentApi.getSearchHistoryRepository();
                }

                @Override // ru.ozon.app.android.search.widgets.history.search.di.HistoryWidgetComponent
                public ActiveSearchBarViewModel getActiveSearchBarViewModel() {
                    return new ActiveSearchBarViewModel(this.networkComponentApi.getFeatureChecker(), getSearchHistoryRepository());
                }

                @Override // ru.ozon.app.android.search.widgets.history.search.di.HistoryWidgetComponent
                public HistoryViewModel getHistoryViewModel() {
                    return new HistoryViewModel(getMapper(), getSearchHistoryRepository(), this.composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository(), this.retainComposerComponentApi.getComposerController(), this.networkComponentApi.getFeatureChecker(), this.storageComponentApi.getSharedPreferences(), this.storageComponentApi.getAuthStateStorage(), this.accountComponentApi.getUserManager());
                }

                @Override // ru.ozon.app.android.search.widgets.history.search.di.HistoryWidgetComponent
                public HistoryMapper getMapper() {
                    return (HistoryMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.search.widgets.history.search.di.HistoryWidgetComponent
                public SearchUrlPrefetchService getSearchUrlPrefetchService() {
                    return this.searchPrefetchApi.getSearchUrlPrefetchService();
                }

                @Override // ru.ozon.app.android.search.widgets.history.search.di.HistoryWidgetComponent
                public l getTokenizedAnalytics() {
                    return this.retainComposerComponentApi.getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<HistoryWidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(HistoryWidgetComponent.class), new a(storage, 1));
        }
    }

    @NotNull
    ActiveSearchBarViewModel getActiveSearchBarViewModel();

    @NotNull
    HistoryViewModel getHistoryViewModel();

    @NotNull
    HistoryMapper getMapper();

    @NotNull
    SearchUrlPrefetchService getSearchUrlPrefetchService();

    @NotNull
    l getTokenizedAnalytics();
}
