package ru.ozon.app.android.ads.widgets.advVideoBannerV2.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.data.AdvVideoBannerV2Config;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.data.AdvVideoBannerV2NewViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class AdvVideoBannerV2WidgetDiModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(AdvVideoBannerV2Config advVideoBannerV2Config, AdvVideoBannerV2NewViewMapper advVideoBannerV2NewViewMapper) {
        Widget2 provideWidget = AdvVideoBannerV2WidgetDiModule.INSTANCE.provideWidget(advVideoBannerV2Config, advVideoBannerV2NewViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
