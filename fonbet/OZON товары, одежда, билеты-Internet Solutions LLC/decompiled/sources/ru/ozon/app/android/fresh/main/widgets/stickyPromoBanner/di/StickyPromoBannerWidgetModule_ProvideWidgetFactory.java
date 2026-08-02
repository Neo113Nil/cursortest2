package ru.ozon.app.android.fresh.main.widgets.stickyPromoBanner.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.stickyPromoBanner.data.StickyPromoBannerConfig;
import ru.ozon.app.android.fresh.main.widgets.stickyPromoBanner.presentation.StickyPromoBannerViewMapper;

/* loaded from: classes6.dex */
public final class StickyPromoBannerWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(StickyPromoBannerWidgetModule stickyPromoBannerWidgetModule, StickyPromoBannerConfig stickyPromoBannerConfig, StickyPromoBannerViewMapper stickyPromoBannerViewMapper) {
        Widget2 provideWidget = stickyPromoBannerWidgetModule.provideWidget(stickyPromoBannerConfig, stickyPromoBannerViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
