package ru.ozon.app.android.favorites.di;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.favorites.ui.deeplink.FavoritesDeeplinkHandlerDelegate;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes6.dex */
public final class FavoritesNavigationModule_ProvideDeeplinkHandlersSetFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlersSet(FavoritesDeeplinkHandlerDelegate favoritesDeeplinkHandlerDelegate, FeatureChecker featureChecker, AppType appType) {
        Set<a> provideDeeplinkHandlersSet = FavoritesNavigationModule.provideDeeplinkHandlersSet(favoritesDeeplinkHandlerDelegate, featureChecker, appType);
        j.d(provideDeeplinkHandlersSet);
        return provideDeeplinkHandlersSet;
    }
}
