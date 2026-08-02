package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.common.header.core.HeaderViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.data.TileGrid3Config;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.TileGrid3ViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.separator.TileGrid3SeparatorMapper;

/* loaded from: classes7.dex */
public final class TileGrid3Module_ProvideTileGrid3Factory implements e<Widget2> {
    public static Widget2 provideTileGrid3(TileGrid3Config tileGrid3Config, HeaderViewMapper2 headerViewMapper2, TileGrid3ViewMapper tileGrid3ViewMapper, TileGrid3SeparatorMapper tileGrid3SeparatorMapper) {
        Widget2 provideTileGrid3 = TileGrid3Module.INSTANCE.provideTileGrid3(tileGrid3Config, headerViewMapper2, tileGrid3ViewMapper, tileGrid3SeparatorMapper);
        j.d(provideTileGrid3);
        return provideTileGrid3;
    }
}
