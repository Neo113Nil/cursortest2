package ru.ozon.app.android.search.widgets.history.catalog.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.history.catalog.data.SearchHistoryConfig;
import ru.ozon.app.android.search.widgets.history.catalog.presentation.SearchHistoryViewMapper;
import ru.ozon.app.android.search.widgets.title.core.SearchHistoryTitleViewMapper;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/search/widgets/history/catalog/di/SearchHistoryModule;", "", "<init>", "()V", "provideSearchHistoryWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "searchHistoryConfig", "Lru/ozon/app/android/search/widgets/history/catalog/data/SearchHistoryConfig;", "searchHistoryViewMapper", "Lru/ozon/app/android/search/widgets/history/catalog/presentation/SearchHistoryViewMapper;", "searchHistoryTitleViewMapper", "Lru/ozon/app/android/search/widgets/title/core/SearchHistoryTitleViewMapper;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchHistoryModule {

    @NotNull
    public static final SearchHistoryModule INSTANCE = new SearchHistoryModule();

    private SearchHistoryModule() {
    }

    @NotNull
    public final Widget2 provideSearchHistoryWidget(@NotNull SearchHistoryConfig searchHistoryConfig, @NotNull SearchHistoryViewMapper searchHistoryViewMapper, @NotNull SearchHistoryTitleViewMapper searchHistoryTitleViewMapper) {
        Intrinsics.checkNotNullParameter(searchHistoryConfig, "searchHistoryConfig");
        Intrinsics.checkNotNullParameter(searchHistoryViewMapper, "searchHistoryViewMapper");
        Intrinsics.checkNotNullParameter(searchHistoryTitleViewMapper, "searchHistoryTitleViewMapper");
        return new Widget2("catalog", "searchHistory", searchHistoryConfig, new ViewMapper2[]{searchHistoryTitleViewMapper, searchHistoryViewMapper});
    }
}
