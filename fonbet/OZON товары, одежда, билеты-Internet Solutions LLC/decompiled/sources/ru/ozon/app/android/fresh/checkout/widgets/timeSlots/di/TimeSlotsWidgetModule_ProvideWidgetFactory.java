package ru.ozon.app.android.fresh.checkout.widgets.timeSlots.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.checkout.widgets.timeSlots.data.TimeSlotsConfig;
import ru.ozon.app.android.fresh.checkout.widgets.timeSlots.presentation.TimeSlotsViewMapper;

/* loaded from: classes6.dex */
public final class TimeSlotsWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(TimeSlotsConfig timeSlotsConfig, TimeSlotsViewMapper timeSlotsViewMapper) {
        Widget2 provideWidget = TimeSlotsWidgetModule.INSTANCE.provideWidget(timeSlotsConfig, timeSlotsViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
