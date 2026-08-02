package ru.ozon.app.android.favorites.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.favorites.favoriteproduct.v1.data.FavoriteProductConfig;
import ru.ozon.app.android.favorites.favoriteproduct.v1.ui.FavoriteProductWidgetViewMapper;

/* loaded from: classes6.dex */
public final class FavoritesWidgetModule_Companion_ProvideWidgetsFactory implements e<Set<Widget>> {
    public static Set<Widget> provideWidgets(FavoriteProductConfig favoriteProductConfig, FavoriteProductWidgetViewMapper favoriteProductWidgetViewMapper) {
        Set<Widget> provideWidgets = FavoritesWidgetModule.INSTANCE.provideWidgets(favoriteProductConfig, favoriteProductWidgetViewMapper);
        j.d(provideWidgets);
        return provideWidgets;
    }
}
