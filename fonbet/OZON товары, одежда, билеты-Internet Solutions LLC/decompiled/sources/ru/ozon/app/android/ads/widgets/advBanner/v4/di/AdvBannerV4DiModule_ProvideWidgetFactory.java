package ru.ozon.app.android.ads.widgets.advBanner.v4.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.ads.widgets.advBanner.v4.data.AdvBannerV4Config;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.AdvBannerV4PlainViewMapper;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.single.AdvBannerV4PlainSingleViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class AdvBannerV4DiModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(AdvBannerV4Config advBannerV4Config, AdvBannerV4PlainViewMapper advBannerV4PlainViewMapper, AdvBannerV4PlainSingleViewMapper advBannerV4PlainSingleViewMapper) {
        Widget2 provideWidget = AdvBannerV4DiModule.INSTANCE.provideWidget(advBannerV4Config, advBannerV4PlainViewMapper, advBannerV4PlainSingleViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
