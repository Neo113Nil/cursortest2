package ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.data.StickyPromoBadgeConfig;
import ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.presentation.StickyPromoBadgeViewMapper;

/* loaded from: classes6.dex */
public final class StickyPromoBadgeWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(StickyPromoBadgeConfig stickyPromoBadgeConfig, StickyPromoBadgeViewMapper stickyPromoBadgeViewMapper) {
        Widget2 provideWidget = StickyPromoBadgeWidgetModule.INSTANCE.provideWidget(stickyPromoBadgeConfig, stickyPromoBadgeViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
