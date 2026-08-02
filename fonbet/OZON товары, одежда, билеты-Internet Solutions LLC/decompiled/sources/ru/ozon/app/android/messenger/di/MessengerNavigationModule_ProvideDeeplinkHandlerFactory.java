package ru.ozon.app.android.messenger.di;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes6.dex */
public final class MessengerNavigationModule_ProvideDeeplinkHandlerFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandler(AppType appType) {
        Set<a> provideDeeplinkHandler = MessengerNavigationModule.INSTANCE.provideDeeplinkHandler(appType);
        j.d(provideDeeplinkHandler);
        return provideDeeplinkHandler;
    }
}
