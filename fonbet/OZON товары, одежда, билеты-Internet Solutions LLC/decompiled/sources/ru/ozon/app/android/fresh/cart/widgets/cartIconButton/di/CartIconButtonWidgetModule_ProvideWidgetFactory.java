package ru.ozon.app.android.fresh.cart.widgets.cartIconButton.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.cart.widgets.cartIconButton.data.CartIconButtonConfig;
import ru.ozon.app.android.fresh.cart.widgets.cartIconButton.presentation.CartIconButtonViewMapper;

/* loaded from: classes6.dex */
public final class CartIconButtonWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(CartIconButtonWidgetModule cartIconButtonWidgetModule, CartIconButtonConfig cartIconButtonConfig, CartIconButtonViewMapper cartIconButtonViewMapper) {
        Widget2 provideWidget = cartIconButtonWidgetModule.provideWidget(cartIconButtonConfig, cartIconButtonViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
