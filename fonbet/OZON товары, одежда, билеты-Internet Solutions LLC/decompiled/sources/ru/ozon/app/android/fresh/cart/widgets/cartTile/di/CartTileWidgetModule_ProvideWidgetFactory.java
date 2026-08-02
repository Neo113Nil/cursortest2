package ru.ozon.app.android.fresh.cart.widgets.cartTile.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.data.CartTileConfig;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileViewMapper;

/* loaded from: classes6.dex */
public final class CartTileWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(CartTileWidgetModule cartTileWidgetModule, CartTileConfig cartTileConfig, CartTileViewMapper cartTileViewMapper) {
        Widget2 provideWidget = cartTileWidgetModule.provideWidget(cartTileConfig, cartTileViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
