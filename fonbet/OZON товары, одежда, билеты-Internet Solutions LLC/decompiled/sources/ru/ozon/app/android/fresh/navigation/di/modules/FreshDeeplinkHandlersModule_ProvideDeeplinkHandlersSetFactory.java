package ru.ozon.app.android.fresh.navigation.di.modules;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;

/* loaded from: classes6.dex */
public final class FreshDeeplinkHandlersModule_ProvideDeeplinkHandlersSetFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlersSet(DomainsInteractor domainsInteractor) {
        Set<a> provideDeeplinkHandlersSet = FreshDeeplinkHandlersModule.provideDeeplinkHandlersSet(domainsInteractor);
        j.d(provideDeeplinkHandlersSet);
        return provideDeeplinkHandlersSet;
    }
}
