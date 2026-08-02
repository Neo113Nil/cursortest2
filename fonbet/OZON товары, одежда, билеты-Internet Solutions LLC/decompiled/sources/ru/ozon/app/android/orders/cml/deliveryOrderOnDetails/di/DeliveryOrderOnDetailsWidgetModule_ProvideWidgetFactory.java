package ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.core.DeliveryOrderOnDetailsConfig;
import ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.presentation.viewMappers.DeliveryOrderOnDetailsViewMapper;

/* loaded from: classes6.dex */
public final class DeliveryOrderOnDetailsWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(DeliveryOrderOnDetailsWidgetModule deliveryOrderOnDetailsWidgetModule, DeliveryOrderOnDetailsConfig deliveryOrderOnDetailsConfig, DeliveryOrderOnDetailsViewMapper deliveryOrderOnDetailsViewMapper) {
        Widget2 provideWidget = deliveryOrderOnDetailsWidgetModule.provideWidget(deliveryOrderOnDetailsConfig, deliveryOrderOnDetailsViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
