package ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.common.widgets.header.HeaderApi;
import ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.data.FreshTileGridConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.presentation.FreshTileGridBaseViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.presentation.FreshTileGridMediumViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.presentation.FreshTileGridMiniViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.presentation.plug.FreshTileGridPlugViewMapper;

/* loaded from: classes6.dex */
public final class FreshTileGridWidgetModule_ProvideWidgetFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideWidget(FreshTileGridWidgetModule freshTileGridWidgetModule, FreshTileGridConfig freshTileGridConfig, FreshTileGridBaseViewMapper freshTileGridBaseViewMapper, FreshTileGridMediumViewMapper freshTileGridMediumViewMapper, FreshTileGridMiniViewMapper freshTileGridMiniViewMapper, FreshTileGridPlugViewMapper freshTileGridPlugViewMapper, HeaderApi headerApi) {
        Set<Widget2> provideWidget = freshTileGridWidgetModule.provideWidget(freshTileGridConfig, freshTileGridBaseViewMapper, freshTileGridMediumViewMapper, freshTileGridMiniViewMapper, freshTileGridPlugViewMapper, headerApi);
        j.d(provideWidget);
        return provideWidget;
    }
}
