package ru.ozon.app.android.fresh.unsorted.widgets.navBar.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.data.ExpressNavBarConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.overlay.ExpressNavBarOverlayMapper;

/* loaded from: classes6.dex */
public final class ExpressNavBarWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ExpressNavBarWidgetModule expressNavBarWidgetModule, ExpressNavBarConfig expressNavBarConfig, ExpressNavBarOverlayMapper expressNavBarOverlayMapper) {
        Widget2 provideWidget = expressNavBarWidgetModule.provideWidget(expressNavBarConfig, expressNavBarOverlayMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
