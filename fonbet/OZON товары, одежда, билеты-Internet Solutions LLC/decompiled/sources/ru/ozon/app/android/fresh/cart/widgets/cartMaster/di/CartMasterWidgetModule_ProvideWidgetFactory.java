package ru.ozon.app.android.fresh.cart.widgets.cartMaster.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.cart.widgets.cartMaster.data.CartMasterConfig;
import ru.ozon.app.android.fresh.cart.widgets.cartMaster.presentation.CartMasterViewMapper;

/* loaded from: classes6.dex */
public final class CartMasterWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(CartMasterWidgetModule cartMasterWidgetModule, CartMasterConfig cartMasterConfig, CartMasterViewMapper cartMasterViewMapper) {
        Widget2 provideWidget = cartMasterWidgetModule.provideWidget(cartMasterConfig, cartMasterViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
