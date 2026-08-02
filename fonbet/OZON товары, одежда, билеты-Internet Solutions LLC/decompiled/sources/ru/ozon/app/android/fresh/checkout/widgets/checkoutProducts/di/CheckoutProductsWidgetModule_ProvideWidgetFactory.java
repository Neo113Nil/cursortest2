package ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.data.CheckoutProductsConfig;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.presentation.CheckoutProductsViewMapper;

/* loaded from: classes6.dex */
public final class CheckoutProductsWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(CheckoutProductsConfig checkoutProductsConfig, CheckoutProductsViewMapper checkoutProductsViewMapper) {
        Widget2 provideWidget = CheckoutProductsWidgetModule.INSTANCE.provideWidget(checkoutProductsConfig, checkoutProductsViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
