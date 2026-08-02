package ru.ozon.app.android.fresh.cart.widgets.cartClickTile.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.cart.widgets.cartClickTile.data.CartClickTileConfig;
import ru.ozon.app.android.fresh.cart.widgets.cartClickTile.presentation.CartClickTileViewMapper;

/* loaded from: classes6.dex */
public final class CartClickTileWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(CartClickTileWidgetModule cartClickTileWidgetModule, CartClickTileConfig cartClickTileConfig, CartClickTileViewMapper cartClickTileViewMapper) {
        Widget2 provideWidget = cartClickTileWidgetModule.provideWidget(cartClickTileConfig, cartClickTileViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
