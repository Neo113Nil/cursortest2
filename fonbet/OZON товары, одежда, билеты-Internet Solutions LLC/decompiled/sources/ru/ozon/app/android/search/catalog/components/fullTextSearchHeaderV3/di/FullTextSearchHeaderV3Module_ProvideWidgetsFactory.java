package ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.core.FullTextSearchHeaderV3ViewMapper;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.data.FullTextSearchHeaderV3Config;

/* loaded from: classes7.dex */
public final class FullTextSearchHeaderV3Module_ProvideWidgetsFactory implements e<Widget2> {
    public static Widget2 provideWidgets(FullTextSearchHeaderV3Config fullTextSearchHeaderV3Config, FullTextSearchHeaderV3ViewMapper fullTextSearchHeaderV3ViewMapper) {
        Widget2 provideWidgets = FullTextSearchHeaderV3Module.INSTANCE.provideWidgets(fullTextSearchHeaderV3Config, fullTextSearchHeaderV3ViewMapper);
        j.d(provideWidgets);
        return provideWidgets;
    }
}
