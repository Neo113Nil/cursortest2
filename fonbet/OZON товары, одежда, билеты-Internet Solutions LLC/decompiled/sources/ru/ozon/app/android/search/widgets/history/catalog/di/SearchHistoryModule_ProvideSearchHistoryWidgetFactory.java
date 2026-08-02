package ru.ozon.app.android.search.widgets.history.catalog.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.history.catalog.data.SearchHistoryConfig;
import ru.ozon.app.android.search.widgets.history.catalog.presentation.SearchHistoryViewMapper;
import ru.ozon.app.android.search.widgets.title.core.SearchHistoryTitleViewMapper;

/* loaded from: classes7.dex */
public final class SearchHistoryModule_ProvideSearchHistoryWidgetFactory implements e<Widget2> {
    public static Widget2 provideSearchHistoryWidget(SearchHistoryConfig searchHistoryConfig, SearchHistoryViewMapper searchHistoryViewMapper, SearchHistoryTitleViewMapper searchHistoryTitleViewMapper) {
        Widget2 provideSearchHistoryWidget = SearchHistoryModule.INSTANCE.provideSearchHistoryWidget(searchHistoryConfig, searchHistoryViewMapper, searchHistoryTitleViewMapper);
        j.d(provideSearchHistoryWidget);
        return provideSearchHistoryWidget;
    }
}
