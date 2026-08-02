package ru.ozon.app.android.fresh.cart.widgets.cartControls.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.cart.widgets.cartControls.data.CartControlsConfig;
import ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation.CartControlsViewMapper;

/* loaded from: classes6.dex */
public final class CartControlsWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(CartControlsConfig cartControlsConfig, CartControlsViewMapper cartControlsViewMapper) {
        Widget2 provideWidget = CartControlsWidgetModule.INSTANCE.provideWidget(cartControlsConfig, cartControlsViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
