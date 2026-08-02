package ru.ozon.app.android.fresh.cart.widgets.checkoutMaster.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.cart.widgets.cartMaster.presentation.CartMasterViewMapper;
import ru.ozon.app.android.fresh.cart.widgets.checkoutMaster.data.CheckoutMasterConfig;

/* loaded from: classes6.dex */
public final class CheckoutMasterWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(CheckoutMasterConfig checkoutMasterConfig, CartMasterViewMapper cartMasterViewMapper) {
        Widget2 provideWidget = CheckoutMasterWidgetModule.INSTANCE.provideWidget(checkoutMasterConfig, cartMasterViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
