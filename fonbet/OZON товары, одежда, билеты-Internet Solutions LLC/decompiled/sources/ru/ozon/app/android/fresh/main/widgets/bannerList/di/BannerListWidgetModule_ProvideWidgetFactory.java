package ru.ozon.app.android.fresh.main.widgets.bannerList.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.bannerList.data.BannerListConfig;
import ru.ozon.app.android.fresh.main.widgets.bannerList.presentation.BannerRowViewMapper;

/* loaded from: classes6.dex */
public final class BannerListWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(BannerListWidgetModule bannerListWidgetModule, BannerListConfig bannerListConfig, BannerRowViewMapper bannerRowViewMapper) {
        Widget2 provideWidget = bannerListWidgetModule.provideWidget(bannerListConfig, bannerRowViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
