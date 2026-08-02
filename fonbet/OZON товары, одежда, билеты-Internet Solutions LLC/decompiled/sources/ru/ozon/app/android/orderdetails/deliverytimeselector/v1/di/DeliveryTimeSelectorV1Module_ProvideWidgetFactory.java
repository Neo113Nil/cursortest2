package ru.ozon.app.android.orderdetails.deliverytimeselector.v1.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v1.data.DeliveryTimeConfig;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v1.data.DeliveryTimeSelectorViewMapper;

/* loaded from: classes6.dex */
public final class DeliveryTimeSelectorV1Module_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(DeliveryTimeSelectorV1Module deliveryTimeSelectorV1Module, DeliveryTimeConfig deliveryTimeConfig, DeliveryTimeSelectorViewMapper deliveryTimeSelectorViewMapper) {
        Widget2 provideWidget = deliveryTimeSelectorV1Module.provideWidget(deliveryTimeConfig, deliveryTimeSelectorViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
