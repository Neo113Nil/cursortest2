package ru.ozon.app.android.orderdetails.timeLeft.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.timeLeft.data.TimeLeftConfig;
import ru.ozon.app.android.orderdetails.timeLeft.presentation.TimeLeftViewMapper;

/* loaded from: classes6.dex */
public final class TimeLeftWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(TimeLeftWidgetModule timeLeftWidgetModule, TimeLeftConfig timeLeftConfig, TimeLeftViewMapper timeLeftViewMapper) {
        Widget2 provideWidget = timeLeftWidgetModule.provideWidget(timeLeftConfig, timeLeftViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
