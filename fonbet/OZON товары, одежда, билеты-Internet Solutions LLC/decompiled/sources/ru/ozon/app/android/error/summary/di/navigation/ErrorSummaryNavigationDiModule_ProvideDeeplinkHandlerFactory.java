package ru.ozon.app.android.error.summary.di.navigation;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;

/* loaded from: classes6.dex */
public final class ErrorSummaryNavigationDiModule_ProvideDeeplinkHandlerFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandler(AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor) {
        Set<a> provideDeeplinkHandler = ErrorSummaryNavigationDiModule.INSTANCE.provideDeeplinkHandler(atMostQaUserDestinationInterceptor);
        j.d(provideDeeplinkHandler);
        return provideDeeplinkHandler;
    }
}
