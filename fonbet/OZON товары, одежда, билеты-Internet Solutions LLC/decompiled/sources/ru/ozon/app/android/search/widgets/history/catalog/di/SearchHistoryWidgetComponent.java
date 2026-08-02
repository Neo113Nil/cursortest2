package ru.ozon.app.android.search.widgets.history.catalog.di;

import Pc.a;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.common.di.SearchPrefetchApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.search.di.searchHistoryRepository.SearchHistoryRepositoryComponentApi;
import ru.ozon.app.android.search.widgets.history.catalog.data.SearchHistoryMapper;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.app.android.search.widgets.title.core.SearchHistoryTitleMapper;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0013J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/search/widgets/history/catalog/di/SearchHistoryWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/search/widgets/history/catalog/data/SearchHistoryMapper;", "mapper", "()Lru/ozon/app/android/search/widgets/history/catalog/data/SearchHistoryMapper;", "Lru/ozon/app/android/search/widgets/title/core/SearchHistoryTitleMapper;", "titleMapper", "()Lru/ozon/app/android/search/widgets/title/core/SearchHistoryTitleMapper;", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "searchUrlPrefetchService", "()Lru/ozon/app/android/common/SearchUrlPrefetchService;", "LPc/a;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "activeSearchBarViewModel", "()LPc/a;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Factory", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SearchHistoryWidgetComponent extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lru/ozon/app/android/search/widgets/history/catalog/di/SearchHistoryWidgetComponent$Factory;", "", "create", "Lru/ozon/app/android/search/widgets/history/catalog/di/SearchHistoryWidgetComponent;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "searchRepositoryComponent", "Lru/ozon/app/android/search/di/searchHistoryRepository/SearchHistoryRepositoryComponentApi;", "searchPrefetchApi", "Lru/ozon/app/android/common/di/SearchPrefetchApi;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public interface Factory {
        @NotNull
        SearchHistoryWidgetComponent create(@NotNull NetworkComponentApi networkComponentApi, @NotNull ComposerComponentApi composerComponentApi, @NotNull SearchHistoryRepositoryComponentApi searchRepositoryComponent, @NotNull SearchPrefetchApi searchPrefetchApi);
    }

    @NotNull
    a<ActiveSearchBarViewModel> activeSearchBarViewModel();

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    SearchHistoryMapper mapper();

    @NotNull
    SearchUrlPrefetchService searchUrlPrefetchService();

    @NotNull
    SearchHistoryTitleMapper titleMapper();
}
