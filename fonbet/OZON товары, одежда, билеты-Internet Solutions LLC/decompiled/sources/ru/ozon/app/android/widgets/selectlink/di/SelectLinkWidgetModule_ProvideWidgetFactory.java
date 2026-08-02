package ru.ozon.app.android.widgets.selectlink.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.widgets.selectlink.data.SelectLinkConfig;
import ru.ozon.app.android.widgets.selectlink.presentation.SelectLinkViewMapper;

/* loaded from: classes7.dex */
public final class SelectLinkWidgetModule_ProvideWidgetFactory implements e<Widget> {
    public static Widget provideWidget(SelectLinkWidgetModule selectLinkWidgetModule, SelectLinkConfig selectLinkConfig, SelectLinkViewMapper selectLinkViewMapper) {
        Widget provideWidget = selectLinkWidgetModule.provideWidget(selectLinkConfig, selectLinkViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
