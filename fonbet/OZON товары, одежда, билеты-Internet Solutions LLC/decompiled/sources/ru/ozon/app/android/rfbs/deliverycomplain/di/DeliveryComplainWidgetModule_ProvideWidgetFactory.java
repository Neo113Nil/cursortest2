package ru.ozon.app.android.rfbs.deliverycomplain.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.rfbs.deliverycomplain.data.DeliveryComplainWidgetConfig;
import ru.ozon.app.android.rfbs.deliverycomplain.presentation.DeliveryComplainOverlayViewMapper;

/* loaded from: classes7.dex */
public final class DeliveryComplainWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(DeliveryComplainWidgetModule deliveryComplainWidgetModule, DeliveryComplainWidgetConfig deliveryComplainWidgetConfig, DeliveryComplainOverlayViewMapper deliveryComplainOverlayViewMapper) {
        Widget2 provideWidget = deliveryComplainWidgetModule.provideWidget(deliveryComplainWidgetConfig, deliveryComplainOverlayViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
