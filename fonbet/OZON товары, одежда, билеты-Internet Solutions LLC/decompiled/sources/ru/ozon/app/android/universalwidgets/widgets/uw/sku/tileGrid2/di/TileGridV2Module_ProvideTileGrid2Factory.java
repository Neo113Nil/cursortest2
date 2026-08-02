package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.common.header.core.HeaderViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.data.TileGrid2Config;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.doubleCartButton.TileGrid2DoubleCartButtonViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.emptyCartButton.TileGrid2EmptyCartButtonViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.reservebutton.TileGrid2ReserveButtonViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.singleCartButton.TileGrid2CartButtonViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.singleCartContainer.TileGrid2CartContainerViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.separator.TileGrid2SimpleSeparatorMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2BannerButtonViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2BannerViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2DefaultViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2SimpleRightViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2ThinViewMapper;

/* loaded from: classes7.dex */
public final class TileGridV2Module_ProvideTileGrid2Factory implements e<Widget2> {
    public static Widget2 provideTileGrid2(TileGrid2Config tileGrid2Config, HeaderViewMapper2 headerViewMapper2, TileGrid2DefaultViewMapper tileGrid2DefaultViewMapper, TileGrid2SimpleRightViewMapper tileGrid2SimpleRightViewMapper, TileGrid2SimpleSeparatorMapper tileGrid2SimpleSeparatorMapper, TileGrid2CartButtonViewMapper tileGrid2CartButtonViewMapper, TileGrid2CartContainerViewMapper tileGrid2CartContainerViewMapper, TileGrid2EmptyCartButtonViewMapper tileGrid2EmptyCartButtonViewMapper, TileGrid2DoubleCartButtonViewMapper tileGrid2DoubleCartButtonViewMapper, TileGrid2ThinViewMapper tileGrid2ThinViewMapper, TileGrid2ReserveButtonViewMapper tileGrid2ReserveButtonViewMapper, TileGrid2BannerViewMapper tileGrid2BannerViewMapper, TileGrid2BannerButtonViewMapper tileGrid2BannerButtonViewMapper) {
        Widget2 provideTileGrid2 = TileGridV2Module.INSTANCE.provideTileGrid2(tileGrid2Config, headerViewMapper2, tileGrid2DefaultViewMapper, tileGrid2SimpleRightViewMapper, tileGrid2SimpleSeparatorMapper, tileGrid2CartButtonViewMapper, tileGrid2CartContainerViewMapper, tileGrid2EmptyCartButtonViewMapper, tileGrid2DoubleCartButtonViewMapper, tileGrid2ThinViewMapper, tileGrid2ReserveButtonViewMapper, tileGrid2BannerViewMapper, tileGrid2BannerButtonViewMapper);
        j.d(provideTileGrid2);
        return provideTileGrid2;
    }
}
