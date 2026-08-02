package ru.ozon.app.android.search.catalog.components.searchresultssortv2.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.search.catalog.components.searchresultssortv2.core.SearchResultsSortV2Config;
import ru.ozon.app.android.search.catalog.components.searchresultssortv2.core.SearchResultsSortV2ViewMapper;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/catalog/components/searchresultssortv2/di/SearchResultsSortV2Module;", "", "<init>", "()V", "provideSearchResultsSortV2Widget", "Lru/ozon/app/android/composer/di/Widget;", "searchResultsSortV2Config", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/core/SearchResultsSortV2Config;", "searchResultsSortV2ViewMapper", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/core/SearchResultsSortV2ViewMapper;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchResultsSortV2Module {

    @NotNull
    public static final SearchResultsSortV2Module INSTANCE = new SearchResultsSortV2Module();

    private SearchResultsSortV2Module() {
    }

    @NotNull
    public static final Widget provideSearchResultsSortV2Widget(@NotNull SearchResultsSortV2Config searchResultsSortV2Config, @NotNull SearchResultsSortV2ViewMapper searchResultsSortV2ViewMapper) {
        Intrinsics.checkNotNullParameter(searchResultsSortV2Config, "searchResultsSortV2Config");
        Intrinsics.checkNotNullParameter(searchResultsSortV2ViewMapper, "searchResultsSortV2ViewMapper");
        return new Widget("catalog", "searchResultsSort", searchResultsSortV2Config, new SearchResultsSortV2ViewMapper[]{searchResultsSortV2ViewMapper});
    }
}
