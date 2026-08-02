package ru.ozon.app.android.cml.delivery.widgets.orderCalculator.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cml.delivery.widgets.orderCalculator.data.OrderCalculatorConfig;
import ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation.OrderCalculatorViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class OrderCalculatorModule_ProvideOrderCalculatorWidgetFactory implements e<Widget2> {
    public static Widget2 provideOrderCalculatorWidget(OrderCalculatorConfig orderCalculatorConfig, OrderCalculatorViewMapper orderCalculatorViewMapper) {
        Widget2 provideOrderCalculatorWidget = OrderCalculatorModule.INSTANCE.provideOrderCalculatorWidget(orderCalculatorConfig, orderCalculatorViewMapper);
        j.d(provideOrderCalculatorWidget);
        return provideOrderCalculatorWidget;
    }
}
