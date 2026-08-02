package ru.ozon.app.android.cart.checkoutPrefetch.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cart.checkoutPrefetch.data.CheckoutPrefetchConfig;
import ru.ozon.app.android.cart.checkoutPrefetch.presentation.CheckoutPrefetchViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class CheckoutPrefetchWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(CheckoutPrefetchWidgetModule checkoutPrefetchWidgetModule, CheckoutPrefetchConfig checkoutPrefetchConfig, CheckoutPrefetchViewMapper checkoutPrefetchViewMapper) {
        Widget2 provideWidget = checkoutPrefetchWidgetModule.provideWidget(checkoutPrefetchConfig, checkoutPrefetchViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
