package ru.ozon.app.android.orderdetails.radiogroup.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.radiogroup.data.RadioGroupWidgetConfig;
import ru.ozon.app.android.orderdetails.radiogroup.presentation.RadioGroupWidgetViewMapper;

/* loaded from: classes6.dex */
public final class RadioGroupWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(RadioGroupWidgetModule radioGroupWidgetModule, RadioGroupWidgetConfig radioGroupWidgetConfig, RadioGroupWidgetViewMapper radioGroupWidgetViewMapper) {
        Widget2 provideWidget = radioGroupWidgetModule.provideWidget(radioGroupWidgetConfig, radioGroupWidgetViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
