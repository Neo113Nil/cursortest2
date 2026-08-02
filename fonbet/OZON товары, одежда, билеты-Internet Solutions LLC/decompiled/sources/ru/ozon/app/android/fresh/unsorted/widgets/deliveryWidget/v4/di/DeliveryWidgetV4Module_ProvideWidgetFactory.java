package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import n20.i;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.data.DeliveryWidgetV4Config;

/* loaded from: classes6.dex */
public final class DeliveryWidgetV4Module_ProvideWidgetFactory implements e<Set<i>> {
    public static Set<i> provideWidget(DeliveryWidgetV4Config deliveryWidgetV4Config) {
        Set<i> provideWidget = DeliveryWidgetV4Module.INSTANCE.provideWidget(deliveryWidgetV4Config);
        j.d(provideWidget);
        return provideWidget;
    }
}
