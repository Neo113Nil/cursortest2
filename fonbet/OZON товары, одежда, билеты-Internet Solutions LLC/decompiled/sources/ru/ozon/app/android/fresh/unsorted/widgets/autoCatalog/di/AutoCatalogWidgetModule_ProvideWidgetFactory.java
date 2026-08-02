package ru.ozon.app.android.fresh.unsorted.widgets.autoCatalog.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.common.widgets.header.HeaderApi;
import ru.ozon.app.android.fresh.unsorted.widgets.autoCatalog.data.AutoCatalogConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.autoCatalog.presentation.AutoCatalogTileGridMediumViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.autoCatalog.presentation.AutoCatalogTileGridMiniViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.presentation.plug.FreshTileGridPlugViewMapper;

/* loaded from: classes6.dex */
public final class AutoCatalogWidgetModule_ProvideWidgetFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideWidget(AutoCatalogWidgetModule autoCatalogWidgetModule, AutoCatalogConfig autoCatalogConfig, AutoCatalogTileGridMediumViewMapper autoCatalogTileGridMediumViewMapper, AutoCatalogTileGridMiniViewMapper autoCatalogTileGridMiniViewMapper, FreshTileGridPlugViewMapper freshTileGridPlugViewMapper, HeaderApi headerApi) {
        Set<Widget2> provideWidget = autoCatalogWidgetModule.provideWidget(autoCatalogConfig, autoCatalogTileGridMediumViewMapper, autoCatalogTileGridMiniViewMapper, freshTileGridPlugViewMapper, headerApi);
        j.d(provideWidget);
        return provideWidget;
    }
}
