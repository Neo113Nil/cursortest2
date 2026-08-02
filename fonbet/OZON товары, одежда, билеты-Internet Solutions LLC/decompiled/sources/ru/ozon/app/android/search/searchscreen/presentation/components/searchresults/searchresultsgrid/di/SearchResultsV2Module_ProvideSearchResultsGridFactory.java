package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridConfig;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridViewMapper;
import ru.ozon.app.android.search.searchscreen.presentation.components.separator.SearchResultsSeparatorMapper;

/* loaded from: classes7.dex */
public final class SearchResultsV2Module_ProvideSearchResultsGridFactory implements e<Widget2> {
    public static Widget2 provideSearchResultsGrid(SearchResultsGridConfig searchResultsGridConfig, SearchResultsGridViewMapper searchResultsGridViewMapper, SearchResultsSeparatorMapper searchResultsSeparatorMapper) {
        Widget2 provideSearchResultsGrid = SearchResultsV2Module.INSTANCE.provideSearchResultsGrid(searchResultsGridConfig, searchResultsGridViewMapper, searchResultsSeparatorMapper);
        j.d(provideSearchResultsGrid);
        return provideSearchResultsGrid;
    }
}
