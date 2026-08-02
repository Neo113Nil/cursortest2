package ru.ozon.app.android.search.widgets.searchbar.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.searchbar.core.ActiveSearchBarViewMapper;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchBarConfig;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchBarViewMapper;

/* loaded from: classes7.dex */
public final class SearchBarMobileModule_ProvideSearchBarMobileWidgetFactory implements e<Widget2> {
    public static Widget2 provideSearchBarMobileWidget(SearchBarConfig searchBarConfig, SearchBarViewMapper searchBarViewMapper, ActiveSearchBarViewMapper activeSearchBarViewMapper) {
        Widget2 provideSearchBarMobileWidget = SearchBarMobileModule.INSTANCE.provideSearchBarMobileWidget(searchBarConfig, searchBarViewMapper, activeSearchBarViewMapper);
        j.d(provideSearchBarMobileWidget);
        return provideSearchBarMobileWidget;
    }
}
