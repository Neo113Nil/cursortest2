package ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.presentation.FreshCheckoutProgressBarViewMapper;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.data.CheckoutStickyTotalConfig;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.presentation.CheckoutStickyTotalOverlayViewMapper;

/* loaded from: classes6.dex */
public final class CheckoutStickyTotalWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(CheckoutStickyTotalConfig checkoutStickyTotalConfig, CheckoutStickyTotalOverlayViewMapper checkoutStickyTotalOverlayViewMapper, FreshCheckoutProgressBarViewMapper freshCheckoutProgressBarViewMapper) {
        Widget2 provideWidget = CheckoutStickyTotalWidgetModule.INSTANCE.provideWidget(checkoutStickyTotalConfig, checkoutStickyTotalOverlayViewMapper, freshCheckoutProgressBarViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
