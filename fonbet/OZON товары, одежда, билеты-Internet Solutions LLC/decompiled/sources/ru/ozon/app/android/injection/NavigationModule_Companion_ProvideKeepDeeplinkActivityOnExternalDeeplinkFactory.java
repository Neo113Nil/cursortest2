package ru.ozon.app.android.injection;

import GZ.k;
import Jb.e;
import Jb.j;
import ru.ozon.app.android.bank.navigation.BankGlobalDeeplinkInterceptor;
import ru.ozon.app.android.deeplinks.KeepActivityHandler;

/* loaded from: classes12.dex */
public final class NavigationModule_Companion_ProvideKeepDeeplinkActivityOnExternalDeeplinkFactory implements e<KeepActivityHandler> {
    public static KeepActivityHandler provideKeepDeeplinkActivityOnExternalDeeplink(k kVar, BankGlobalDeeplinkInterceptor bankGlobalDeeplinkInterceptor) {
        KeepActivityHandler provideKeepDeeplinkActivityOnExternalDeeplink = NavigationModule.INSTANCE.provideKeepDeeplinkActivityOnExternalDeeplink(kVar, bankGlobalDeeplinkInterceptor);
        j.d(provideKeepDeeplinkActivityOnExternalDeeplink);
        return provideKeepDeeplinkActivityOnExternalDeeplink;
    }
}
