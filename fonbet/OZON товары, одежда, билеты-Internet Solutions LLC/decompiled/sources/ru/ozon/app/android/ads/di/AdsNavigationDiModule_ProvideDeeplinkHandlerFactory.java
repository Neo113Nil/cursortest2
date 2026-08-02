package ru.ozon.app.android.ads.di;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;

/* loaded from: classes6.dex */
public final class AdsNavigationDiModule_ProvideDeeplinkHandlerFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandler() {
        Set<a> provideDeeplinkHandler = AdsNavigationDiModule.INSTANCE.provideDeeplinkHandler();
        j.d(provideDeeplinkHandler);
        return provideDeeplinkHandler;
    }
}
