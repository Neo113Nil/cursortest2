package ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.presentation.FreshCheckoutProgressBarViewMapper;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.data.CheckoutTotalConfig;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation.CheckoutTotalViewMapper;

/* loaded from: classes6.dex */
public final class CheckoutTotalWidgetModule_ProvideTotalWidgetFactory implements e<Widget2> {
    public static Widget2 provideTotalWidget(CheckoutTotalConfig checkoutTotalConfig, CheckoutTotalViewMapper checkoutTotalViewMapper, FreshCheckoutProgressBarViewMapper freshCheckoutProgressBarViewMapper) {
        Widget2 provideTotalWidget = CheckoutTotalWidgetModule.INSTANCE.provideTotalWidget(checkoutTotalConfig, checkoutTotalViewMapper, freshCheckoutProgressBarViewMapper);
        j.d(provideTotalWidget);
        return provideTotalWidget;
    }
}
