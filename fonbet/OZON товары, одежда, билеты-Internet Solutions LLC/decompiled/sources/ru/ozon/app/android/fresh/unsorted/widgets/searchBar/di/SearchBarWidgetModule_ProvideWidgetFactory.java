package ru.ozon.app.android.fresh.unsorted.widgets.searchBar.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.searchBar.data.SearchBarConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.searchBar.presentation.SearchBarViewMapper;

/* loaded from: classes6.dex */
public final class SearchBarWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(SearchBarWidgetModule searchBarWidgetModule, SearchBarConfig searchBarConfig, SearchBarViewMapper searchBarViewMapper) {
        Widget2 provideWidget = searchBarWidgetModule.provideWidget(searchBarConfig, searchBarViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
