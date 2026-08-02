package ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.data.CatalogTileScrollConfig;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.CatalogTileScrollViewMapper;

/* loaded from: classes6.dex */
public final class CatalogTileScrollWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(CatalogTileScrollWidgetModule catalogTileScrollWidgetModule, CatalogTileScrollViewMapper catalogTileScrollViewMapper, CatalogTileScrollConfig catalogTileScrollConfig) {
        Widget2 provideWidget = catalogTileScrollWidgetModule.provideWidget(catalogTileScrollViewMapper, catalogTileScrollConfig);
        j.d(provideWidget);
        return provideWidget;
    }
}
