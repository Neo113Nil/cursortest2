package ru.ozon.app.android.search.catalog.components.searchresultssortv2.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.search.catalog.components.searchresultssortv2.core.SearchResultsSortV2Config;
import ru.ozon.app.android.search.catalog.components.searchresultssortv2.core.SearchResultsSortV2ViewMapper;

/* loaded from: classes7.dex */
public final class SearchResultsSortV2Module_ProvideSearchResultsSortV2WidgetFactory implements e<Widget> {
    public static Widget provideSearchResultsSortV2Widget(SearchResultsSortV2Config searchResultsSortV2Config, SearchResultsSortV2ViewMapper searchResultsSortV2ViewMapper) {
        Widget provideSearchResultsSortV2Widget = SearchResultsSortV2Module.provideSearchResultsSortV2Widget(searchResultsSortV2Config, searchResultsSortV2ViewMapper);
        j.d(provideSearchResultsSortV2Widget);
        return provideSearchResultsSortV2Widget;
    }
}
