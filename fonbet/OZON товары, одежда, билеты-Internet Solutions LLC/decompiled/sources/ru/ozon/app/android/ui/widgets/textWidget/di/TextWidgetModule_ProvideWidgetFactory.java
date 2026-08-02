package ru.ozon.app.android.ui.widgets.textWidget.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.ui.widgets.textWidget.data.TextWidgetConfig;
import ru.ozon.app.android.ui.widgets.textWidget.presentation.TextWidgetViewMapper;

/* loaded from: classes7.dex */
public final class TextWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(TextWidgetModule textWidgetModule, TextWidgetConfig textWidgetConfig, TextWidgetViewMapper textWidgetViewMapper) {
        Widget2 provideWidget = textWidgetModule.provideWidget(textWidgetConfig, textWidgetViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
