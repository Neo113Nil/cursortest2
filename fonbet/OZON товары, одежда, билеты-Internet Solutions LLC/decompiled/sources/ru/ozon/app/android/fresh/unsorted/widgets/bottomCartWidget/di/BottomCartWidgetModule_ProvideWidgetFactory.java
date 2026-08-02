package ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.data.BottomCartWidgetConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.BottomCartWidgetViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.overlay.BottomCartOverlayMapper;

/* loaded from: classes6.dex */
public final class BottomCartWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(BottomCartWidgetModule bottomCartWidgetModule, BottomCartWidgetConfig bottomCartWidgetConfig, BottomCartWidgetViewMapper bottomCartWidgetViewMapper, BottomCartOverlayMapper bottomCartOverlayMapper) {
        Widget2 provideWidget = bottomCartWidgetModule.provideWidget(bottomCartWidgetConfig, bottomCartWidgetViewMapper, bottomCartOverlayMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
