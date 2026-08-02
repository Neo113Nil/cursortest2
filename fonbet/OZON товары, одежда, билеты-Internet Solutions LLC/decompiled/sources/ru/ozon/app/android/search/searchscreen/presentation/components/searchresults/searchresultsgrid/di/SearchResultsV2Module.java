package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridConfig;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridViewMapper;
import ru.ozon.app.android.search.searchscreen.presentation.components.separator.SearchResultsSeparatorMapper;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/di/SearchResultsV2Module;", "", "<init>", "()V", "provideSearchResultsGrid", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridConfig;", "srV2viewMapper", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridViewMapper;", "searchResultsSeparatorViewMapper", "Lru/ozon/app/android/search/searchscreen/presentation/components/separator/SearchResultsSeparatorMapper;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchResultsV2Module {

    @NotNull
    public static final SearchResultsV2Module INSTANCE = new SearchResultsV2Module();

    private SearchResultsV2Module() {
    }

    @NotNull
    public final Widget2 provideSearchResultsGrid(@NotNull SearchResultsGridConfig config, @NotNull SearchResultsGridViewMapper srV2viewMapper, @NotNull SearchResultsSeparatorMapper searchResultsSeparatorViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(srV2viewMapper, "srV2viewMapper");
        Intrinsics.checkNotNullParameter(searchResultsSeparatorViewMapper, "searchResultsSeparatorViewMapper");
        return new Widget2("catalog", "searchResultsV2", config, new ViewMapper2[]{srV2viewMapper, searchResultsSeparatorViewMapper});
    }
}
