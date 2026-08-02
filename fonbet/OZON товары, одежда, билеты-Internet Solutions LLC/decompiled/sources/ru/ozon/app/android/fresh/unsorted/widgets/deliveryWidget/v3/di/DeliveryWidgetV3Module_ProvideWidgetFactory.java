package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.data.DeliveryWidgetV3Config;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3OverlayViewMapper;

/* loaded from: classes6.dex */
public final class DeliveryWidgetV3Module_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(DeliveryWidgetV3Module deliveryWidgetV3Module, DeliveryWidgetV3Config deliveryWidgetV3Config, DeliveryWidgetV3OverlayViewMapper deliveryWidgetV3OverlayViewMapper) {
        Widget2 provideWidget = deliveryWidgetV3Module.provideWidget(deliveryWidgetV3Config, deliveryWidgetV3OverlayViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
