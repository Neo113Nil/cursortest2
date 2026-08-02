package ru.ozon.app.android.fresh.unsorted.widgets.installmentPaymentSchedule.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.installmentPaymentSchedule.core.FreshPaymentScheduleConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.installmentPaymentSchedule.core.FreshPaymentScheduleViewMapper;

/* loaded from: classes6.dex */
public final class FreshPaymentScheduleWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(FreshPaymentScheduleConfig freshPaymentScheduleConfig, FreshPaymentScheduleViewMapper freshPaymentScheduleViewMapper) {
        Widget2 provideWidget = FreshPaymentScheduleWidgetModule.INSTANCE.provideWidget(freshPaymentScheduleConfig, freshPaymentScheduleViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
