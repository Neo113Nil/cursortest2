package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidgetBigOzon.v1;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2OverlayViewMapper;

/* loaded from: classes6.dex */
public final class DeliveryWidgetBigOzonModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(DeliveryWidgetBigOzonModule deliveryWidgetBigOzonModule, DeliveryWidgetBigOzonConfig deliveryWidgetBigOzonConfig, DeliveryWidgetV2OverlayViewMapper deliveryWidgetV2OverlayViewMapper) {
        Widget2 provideWidget = deliveryWidgetBigOzonModule.provideWidget(deliveryWidgetBigOzonConfig, deliveryWidgetV2OverlayViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
