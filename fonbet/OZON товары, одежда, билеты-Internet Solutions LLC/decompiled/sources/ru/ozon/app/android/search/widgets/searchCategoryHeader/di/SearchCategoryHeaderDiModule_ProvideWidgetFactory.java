package ru.ozon.app.android.search.widgets.searchCategoryHeader.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.searchCategoryHeader.data.SearchCategoryHeaderConfig;
import ru.ozon.app.android.search.widgets.searchCategoryHeader.data.SearchCategoryHeaderViewMapper;

/* loaded from: classes7.dex */
public final class SearchCategoryHeaderDiModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(SearchCategoryHeaderConfig searchCategoryHeaderConfig, SearchCategoryHeaderViewMapper searchCategoryHeaderViewMapper) {
        Widget2 provideWidget = SearchCategoryHeaderDiModule.INSTANCE.provideWidget(searchCategoryHeaderConfig, searchCategoryHeaderViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
