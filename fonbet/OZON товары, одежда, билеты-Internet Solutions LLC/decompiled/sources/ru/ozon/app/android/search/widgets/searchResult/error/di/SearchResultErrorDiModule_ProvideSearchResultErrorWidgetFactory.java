package ru.ozon.app.android.search.widgets.searchResult.error.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.searchResult.error.data.SearchResultErrorConfig;
import ru.ozon.app.android.search.widgets.searchResult.error.presentation.SearchResultErrorViewMapper;

/* loaded from: classes7.dex */
public final class SearchResultErrorDiModule_ProvideSearchResultErrorWidgetFactory implements e<Widget2> {
    public static Widget2 provideSearchResultErrorWidget(SearchResultErrorConfig searchResultErrorConfig, SearchResultErrorViewMapper searchResultErrorViewMapper) {
        Widget2 provideSearchResultErrorWidget = SearchResultErrorDiModule.INSTANCE.provideSearchResultErrorWidget(searchResultErrorConfig, searchResultErrorViewMapper);
        j.d(provideSearchResultErrorWidget);
        return provideSearchResultErrorWidget;
    }
}
