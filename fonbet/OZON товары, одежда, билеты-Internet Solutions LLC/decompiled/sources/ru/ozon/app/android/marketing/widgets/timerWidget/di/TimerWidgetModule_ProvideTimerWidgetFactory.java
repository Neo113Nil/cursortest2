package ru.ozon.app.android.marketing.widgets.timerWidget.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.marketing.widgets.timerWidget.core.TimerWidgetConfig;
import ru.ozon.app.android.marketing.widgets.timerWidget.core.TimerWidgetViewMapper;

/* loaded from: classes6.dex */
public final class TimerWidgetModule_ProvideTimerWidgetFactory implements e<Widget2> {
    public static Widget2 provideTimerWidget(TimerWidgetConfig timerWidgetConfig, TimerWidgetViewMapper timerWidgetViewMapper) {
        Widget2 provideTimerWidget = TimerWidgetModule.INSTANCE.provideTimerWidget(timerWidgetConfig, timerWidgetViewMapper);
        j.d(provideTimerWidget);
        return provideTimerWidget;
    }
}
