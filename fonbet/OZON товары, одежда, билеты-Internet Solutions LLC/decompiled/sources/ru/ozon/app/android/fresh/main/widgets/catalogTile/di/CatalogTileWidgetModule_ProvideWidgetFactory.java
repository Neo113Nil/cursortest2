package ru.ozon.app.android.fresh.main.widgets.catalogTile.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.data.CatalogTileConfig;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.CatalogTileViewMapper;

/* loaded from: classes6.dex */
public final class CatalogTileWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(CatalogTileWidgetModule catalogTileWidgetModule, CatalogTileConfig catalogTileConfig, CatalogTileViewMapper catalogTileViewMapper) {
        Widget2 provideWidget = catalogTileWidgetModule.provideWidget(catalogTileConfig, catalogTileViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
