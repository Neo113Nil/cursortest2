package ru.ozon.app.android.search.widgets.history.search.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.history.search.data.HistoryConfig;
import ru.ozon.app.android.search.widgets.history.search.presentation.HistoryViewMapper;

/* loaded from: classes7.dex */
public final class HistoryModule_ProvideHistoryWidgetFactory implements e<Widget2> {
    public static Widget2 provideHistoryWidget(HistoryConfig historyConfig, HistoryViewMapper historyViewMapper) {
        Widget2 provideHistoryWidget = HistoryModule.INSTANCE.provideHistoryWidget(historyConfig, historyViewMapper);
        j.d(provideHistoryWidget);
        return provideHistoryWidget;
    }
}
