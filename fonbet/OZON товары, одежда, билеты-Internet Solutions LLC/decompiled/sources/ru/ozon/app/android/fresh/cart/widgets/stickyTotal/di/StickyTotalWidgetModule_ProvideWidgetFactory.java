package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.data.StickyTotalConfig;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalOverlayViewMapper;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.pdp.StickyTotalPDPViewMapper;

/* loaded from: classes6.dex */
public final class StickyTotalWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(StickyTotalWidgetModule stickyTotalWidgetModule, StickyTotalConfig stickyTotalConfig, StickyTotalOverlayViewMapper stickyTotalOverlayViewMapper, StickyTotalPDPViewMapper stickyTotalPDPViewMapper) {
        Widget2 provideWidget = stickyTotalWidgetModule.provideWidget(stickyTotalConfig, stickyTotalOverlayViewMapper, stickyTotalPDPViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
