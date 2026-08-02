package ru.ozon.app.android.fresh.main.widgets.scrollActionList.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.scrollActionList.data.ScrollActionListConfig;
import ru.ozon.app.android.fresh.main.widgets.scrollActionList.presentation.ScrollActionListViewMapper;

/* loaded from: classes6.dex */
public final class ScrollActionListModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ScrollActionListModule scrollActionListModule, ScrollActionListConfig scrollActionListConfig, ScrollActionListViewMapper scrollActionListViewMapper) {
        Widget2 provideWidget = scrollActionListModule.provideWidget(scrollActionListConfig, scrollActionListViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
