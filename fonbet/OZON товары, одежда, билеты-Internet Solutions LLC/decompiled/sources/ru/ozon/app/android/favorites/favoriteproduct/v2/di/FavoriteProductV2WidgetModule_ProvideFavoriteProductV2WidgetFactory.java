package ru.ozon.app.android.favorites.favoriteproduct.v2.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.favorites.favoriteproduct.v2.data.FavoriteProductV2Config;
import ru.ozon.app.android.favorites.favoriteproduct.v2.ui.FavoriteProductV2WidgetViewMapper;

/* loaded from: classes6.dex */
public final class FavoriteProductV2WidgetModule_ProvideFavoriteProductV2WidgetFactory implements e<Widget2> {
    public static Widget2 provideFavoriteProductV2Widget(FavoriteProductV2WidgetModule favoriteProductV2WidgetModule, FavoriteProductV2Config favoriteProductV2Config, FavoriteProductV2WidgetViewMapper favoriteProductV2WidgetViewMapper) {
        Widget2 provideFavoriteProductV2Widget = favoriteProductV2WidgetModule.provideFavoriteProductV2Widget(favoriteProductV2Config, favoriteProductV2WidgetViewMapper);
        j.d(provideFavoriteProductV2Widget);
        return provideFavoriteProductV2Widget;
    }
}
