package ru.ozon.app.android.cml.delivery.widgets.input.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cml.delivery.widgets.input.data.InputWidgetConfig;
import ru.ozon.app.android.cml.delivery.widgets.input.presentation.InputWidgetViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class InputWidgetModule_ProvideInputWidgetFactory implements e<Widget2> {
    public static Widget2 provideInputWidget(InputWidgetConfig inputWidgetConfig, InputWidgetViewMapper inputWidgetViewMapper) {
        Widget2 provideInputWidget = InputWidgetModule.INSTANCE.provideInputWidget(inputWidgetConfig, inputWidgetViewMapper);
        j.d(provideInputWidget);
        return provideInputWidget;
    }
}
