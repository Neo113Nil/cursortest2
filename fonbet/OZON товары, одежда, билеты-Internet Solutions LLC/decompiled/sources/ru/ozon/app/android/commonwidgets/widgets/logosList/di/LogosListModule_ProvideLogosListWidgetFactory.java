package ru.ozon.app.android.commonwidgets.widgets.logosList.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.commonwidgets.widgets.logosList.data.LogosListConfig;
import ru.ozon.app.android.commonwidgets.widgets.logosList.presentation.LogosListViewMapper;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class LogosListModule_ProvideLogosListWidgetFactory implements e<Widget> {
    public static Widget provideLogosListWidget(LogosListConfig logosListConfig, LogosListViewMapper logosListViewMapper) {
        Widget provideLogosListWidget = LogosListModule.provideLogosListWidget(logosListConfig, logosListViewMapper);
        j.d(provideLogosListWidget);
        return provideLogosListWidget;
    }
}
