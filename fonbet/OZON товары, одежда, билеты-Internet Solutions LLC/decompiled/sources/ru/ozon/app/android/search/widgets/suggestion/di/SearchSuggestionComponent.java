package ru.ozon.app.android.search.widgets.suggestion.di;

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
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.app.android.search.widgets.suggestion.data.SuggestionMapper;
import ru.ozon.app.android.search.widgets.title.core.SuggestionTitleMapper;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0013J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestion/di/SearchSuggestionComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/search/widgets/title/core/SuggestionTitleMapper;", "titleMapper", "()Lru/ozon/app/android/search/widgets/title/core/SuggestionTitleMapper;", "Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionMapper;", "suggestMapper", "()Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionMapper;", "LPc/a;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "viewModel", "()LPc/a;", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "searchUrlPrefetchService", "()Lru/ozon/app/android/common/SearchUrlPrefetchService;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Factory", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SearchSuggestionComponent extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestion/di/SearchSuggestionComponent$Factory;", "", "create", "Lru/ozon/app/android/search/widgets/suggestion/di/SearchSuggestionComponent;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "searchHistoryRepositoryComponentApi", "Lru/ozon/app/android/search/di/searchHistoryRepository/SearchHistoryRepositoryComponentApi;", "searchPrefetchApi", "Lru/ozon/app/android/common/di/SearchPrefetchApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public interface Factory {
        @NotNull
        SearchSuggestionComponent create(@NotNull ComposerComponentApi composerComponentApi, @NotNull SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi, @NotNull SearchPrefetchApi searchPrefetchApi, @NotNull NetworkComponentApi networkComponentApi);
    }

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    SearchUrlPrefetchService searchUrlPrefetchService();

    @NotNull
    SuggestionMapper suggestMapper();

    @NotNull
    SuggestionTitleMapper titleMapper();

    @NotNull
    a<ActiveSearchBarViewModel> viewModel();
}
