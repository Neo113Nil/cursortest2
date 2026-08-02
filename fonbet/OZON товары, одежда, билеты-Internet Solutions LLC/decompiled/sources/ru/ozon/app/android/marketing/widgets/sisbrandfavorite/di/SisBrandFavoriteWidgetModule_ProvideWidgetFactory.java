package ru.ozon.app.android.marketing.widgets.sisbrandfavorite.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.marketing.widgets.sisbrandfavorite.core.SisBrandFavoriteConfig;
import ru.ozon.app.android.marketing.widgets.sisbrandfavorite.core.SisBrandFavoriteViewMapper;

/* loaded from: classes6.dex */
public final class SisBrandFavoriteWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(SisBrandFavoriteWidgetModule sisBrandFavoriteWidgetModule, SisBrandFavoriteConfig sisBrandFavoriteConfig, SisBrandFavoriteViewMapper sisBrandFavoriteViewMapper) {
        Widget2 provideWidget = sisBrandFavoriteWidgetModule.provideWidget(sisBrandFavoriteConfig, sisBrandFavoriteViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
