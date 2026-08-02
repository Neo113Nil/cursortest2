package ru.ozon.app.android.fresh.unsorted.widgets.navTitle.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.navTitle.data.ExpressNavTitleConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.navTitle.presentation.ExpressNavTitleViewMapper;

/* loaded from: classes6.dex */
public final class ExpressNavTitleWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ExpressNavTitleWidgetModule expressNavTitleWidgetModule, ExpressNavTitleConfig expressNavTitleConfig, ExpressNavTitleViewMapper expressNavTitleViewMapper) {
        Widget2 provideWidget = expressNavTitleWidgetModule.provideWidget(expressNavTitleConfig, expressNavTitleViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
