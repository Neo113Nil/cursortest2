package ru.ozon.app.android.search.widgets.searchRequest.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.searchRequest.data.SearchRequestConfig;
import ru.ozon.app.android.search.widgets.searchRequest.presentation.SearchRequestViewMapper;

/* loaded from: classes7.dex */
public final class SearchRequestDiModule_ProvideSearchRequestWidgetFactory implements e<Widget2> {
    public static Widget2 provideSearchRequestWidget(SearchRequestConfig searchRequestConfig, SearchRequestViewMapper searchRequestViewMapper) {
        Widget2 provideSearchRequestWidget = SearchRequestDiModule.INSTANCE.provideSearchRequestWidget(searchRequestConfig, searchRequestViewMapper);
        j.d(provideSearchRequestWidget);
        return provideSearchRequestWidget;
    }
}
