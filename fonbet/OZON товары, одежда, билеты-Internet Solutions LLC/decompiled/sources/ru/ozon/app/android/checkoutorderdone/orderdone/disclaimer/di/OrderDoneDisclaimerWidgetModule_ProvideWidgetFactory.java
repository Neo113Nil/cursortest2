package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.core.OrderDoneDisclaimerConfig;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.core.OrderDoneDisclaimerWidgetViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class OrderDoneDisclaimerWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(OrderDoneDisclaimerWidgetModule orderDoneDisclaimerWidgetModule, OrderDoneDisclaimerConfig orderDoneDisclaimerConfig, OrderDoneDisclaimerWidgetViewMapper orderDoneDisclaimerWidgetViewMapper) {
        Widget2 provideWidget = orderDoneDisclaimerWidgetModule.provideWidget(orderDoneDisclaimerConfig, orderDoneDisclaimerWidgetViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
