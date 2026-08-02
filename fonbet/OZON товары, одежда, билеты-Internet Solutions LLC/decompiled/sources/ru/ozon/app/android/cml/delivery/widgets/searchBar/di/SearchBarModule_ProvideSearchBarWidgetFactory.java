package ru.ozon.app.android.cml.delivery.widgets.searchBar.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cml.delivery.widgets.searchBar.data.SearchBarConfig;
import ru.ozon.app.android.cml.delivery.widgets.searchBar.presentation.SearchBarViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class SearchBarModule_ProvideSearchBarWidgetFactory implements e<Widget2> {
    public static Widget2 provideSearchBarWidget(SearchBarConfig searchBarConfig, SearchBarViewMapper searchBarViewMapper) {
        Widget2 provideSearchBarWidget = SearchBarModule.INSTANCE.provideSearchBarWidget(searchBarConfig, searchBarViewMapper);
        j.d(provideSearchBarWidget);
        return provideSearchBarWidget;
    }
}
