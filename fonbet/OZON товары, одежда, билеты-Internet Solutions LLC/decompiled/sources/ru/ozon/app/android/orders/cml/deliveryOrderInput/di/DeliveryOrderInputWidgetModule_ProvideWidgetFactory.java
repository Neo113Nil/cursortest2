package ru.ozon.app.android.orders.cml.deliveryOrderInput.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orders.cml.deliveryOrderInput.core.DeliveryOrderInputConfig;
import ru.ozon.app.android.orders.cml.deliveryOrderInput.presentation.viewMapper.DeliveryOrderInputViewMapper;

/* loaded from: classes6.dex */
public final class DeliveryOrderInputWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(DeliveryOrderInputWidgetModule deliveryOrderInputWidgetModule, DeliveryOrderInputConfig deliveryOrderInputConfig, DeliveryOrderInputViewMapper deliveryOrderInputViewMapper) {
        Widget2 provideWidget = deliveryOrderInputWidgetModule.provideWidget(deliveryOrderInputConfig, deliveryOrderInputViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
