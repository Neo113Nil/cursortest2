package ru.ozon.app.android.fresh.main.widgets.header.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.header.data.HeaderConfig;
import ru.ozon.app.android.fresh.main.widgets.header.presentation.HeaderViewMapper;

/* loaded from: classes6.dex */
public final class HeaderWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(HeaderWidgetModule headerWidgetModule, HeaderConfig headerConfig, HeaderViewMapper headerViewMapper) {
        Widget2 provideWidget = headerWidgetModule.provideWidget(headerConfig, headerViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
