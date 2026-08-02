package ru.ozon.app.android.fresh.unsorted.widgets.deliveryProblems.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryProblems.data.DeliveryProblemsConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryProblems.presentation.DeliveryProblemsViewMapper;

/* loaded from: classes6.dex */
public final class DeliveryProblemsWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(DeliveryProblemsWidgetModule deliveryProblemsWidgetModule, DeliveryProblemsConfig deliveryProblemsConfig, DeliveryProblemsViewMapper deliveryProblemsViewMapper) {
        Widget2 provideWidget = deliveryProblemsWidgetModule.provideWidget(deliveryProblemsConfig, deliveryProblemsViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
