package ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.core.FullTextSearchHeaderV4ViewMapper;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.data.FullTextSearchHeaderV4Config;

/* loaded from: classes7.dex */
public final class FullTextSearchHeaderV4Module_ProvideWidgetsFactory implements e<Widget2> {
    public static Widget2 provideWidgets(FullTextSearchHeaderV4Config fullTextSearchHeaderV4Config, FullTextSearchHeaderV4ViewMapper fullTextSearchHeaderV4ViewMapper) {
        Widget2 provideWidgets = FullTextSearchHeaderV4Module.INSTANCE.provideWidgets(fullTextSearchHeaderV4Config, fullTextSearchHeaderV4ViewMapper);
        j.d(provideWidgets);
        return provideWidgets;
    }
}
