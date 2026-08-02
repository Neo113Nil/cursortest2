package ru.ozon.app.android.session.di;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.network.abtool.FeatureChecker;

/* loaded from: classes7.dex */
public final class OzonIdSessionNavigationModule_ProvideDeeplinkHandlersSetFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlersSet(AuthDestinationInterceptor authDestinationInterceptor, FeatureChecker featureChecker) {
        Set<a> provideDeeplinkHandlersSet = OzonIdSessionNavigationModule.INSTANCE.provideDeeplinkHandlersSet(authDestinationInterceptor, featureChecker);
        j.d(provideDeeplinkHandlersSet);
        return provideDeeplinkHandlersSet;
    }
}
