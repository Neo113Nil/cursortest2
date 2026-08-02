package ru.ozon.app.android.fresh.cart.widgets.reorderTile.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.data.ReorderTileConfig;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.ReorderTileViewMapper;
import ru.ozon.app.android.fresh.common.widgets.header.HeaderApi;

/* loaded from: classes6.dex */
public final class ReorderTileWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ReorderTileConfig reorderTileConfig, ReorderTileViewMapper reorderTileViewMapper, HeaderApi headerApi) {
        Widget2 provideWidget = ReorderTileWidgetModule.INSTANCE.provideWidget(reorderTileConfig, reorderTileViewMapper, headerApi);
        j.d(provideWidget);
        return provideWidget;
    }
}
