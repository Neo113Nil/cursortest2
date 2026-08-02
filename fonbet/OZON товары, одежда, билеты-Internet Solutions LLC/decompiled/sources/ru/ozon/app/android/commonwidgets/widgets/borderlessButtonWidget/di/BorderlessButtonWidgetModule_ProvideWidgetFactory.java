package ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.data.BorderlessButtonConfig;
import ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.mapper.BorderlessButtonViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class BorderlessButtonWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(BorderlessButtonWidgetModule borderlessButtonWidgetModule, BorderlessButtonConfig borderlessButtonConfig, BorderlessButtonViewMapper borderlessButtonViewMapper) {
        Widget2 provideWidget = borderlessButtonWidgetModule.provideWidget(borderlessButtonConfig, borderlessButtonViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
