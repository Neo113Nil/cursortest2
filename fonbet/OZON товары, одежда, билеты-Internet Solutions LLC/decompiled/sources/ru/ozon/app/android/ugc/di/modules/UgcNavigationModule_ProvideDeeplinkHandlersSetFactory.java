package ru.ozon.app.android.ugc.di.modules;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes7.dex */
public final class UgcNavigationModule_ProvideDeeplinkHandlersSetFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlersSet(AuthDestinationInterceptor authDestinationInterceptor, FeatureChecker featureChecker, DomainsInteractor domainsInteractor, AppType appType) {
        Set<a> provideDeeplinkHandlersSet = UgcNavigationModule.INSTANCE.provideDeeplinkHandlersSet(authDestinationInterceptor, featureChecker, domainsInteractor, appType);
        j.d(provideDeeplinkHandlersSet);
        return provideDeeplinkHandlersSet;
    }
}
