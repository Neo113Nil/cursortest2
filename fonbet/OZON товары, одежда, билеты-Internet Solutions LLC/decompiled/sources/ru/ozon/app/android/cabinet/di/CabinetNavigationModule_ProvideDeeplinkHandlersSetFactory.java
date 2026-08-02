package ru.ozon.app.android.cabinet.di;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.domain.session.interactors.AuthInteractor;
import ru.ozon.app.android.domain.session.receiver.AuthDeeplinkReceiver;
import ru.ozon.app.android.domain.session.repository.mappers.AuthFlowMapper;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes6.dex */
public final class CabinetNavigationModule_ProvideDeeplinkHandlersSetFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlersSet(AuthDestinationInterceptor authDestinationInterceptor, UserManager userManager, AuthDeeplinkReceiver authDeeplinkReceiver, AuthInteractor authInteractor, AuthFlowMapper authFlowMapper, AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor, AppType appType) {
        Set<a> provideDeeplinkHandlersSet = CabinetNavigationModule.INSTANCE.provideDeeplinkHandlersSet(authDestinationInterceptor, userManager, authDeeplinkReceiver, authInteractor, authFlowMapper, atMostQaUserDestinationInterceptor, appType);
        j.d(provideDeeplinkHandlersSet);
        return provideDeeplinkHandlersSet;
    }
}
