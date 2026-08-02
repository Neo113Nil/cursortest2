package ru.ozon.app.android.search.di;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes7.dex */
public final class SearchNavigationModule_ProvideDeeplinkHandlersSetFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlersSet(FeatureChecker featureChecker, AppType appType, AuthDestinationInterceptor authDestinationInterceptor) {
        Set<a> provideDeeplinkHandlersSet = SearchNavigationModule.provideDeeplinkHandlersSet(featureChecker, appType, authDestinationInterceptor);
        j.d(provideDeeplinkHandlersSet);
        return provideDeeplinkHandlersSet;
    }
}
