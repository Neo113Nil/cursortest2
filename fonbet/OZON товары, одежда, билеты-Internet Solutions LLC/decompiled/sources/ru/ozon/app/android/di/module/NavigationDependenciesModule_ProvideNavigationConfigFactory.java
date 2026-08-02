package ru.ozon.app.android.di.module;

import Jb.e;
import Jb.j;
import nZ.C8475a;
import ru.ozon.app.android.navigation.NativePageDomainsInteractor;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes11.dex */
public final class NavigationDependenciesModule_ProvideNavigationConfigFactory implements e<C8475a.c> {
    public static C8475a.c provideNavigationConfig(AppType appType, NativePageDomainsInteractor nativePageDomainsInteractor) {
        C8475a.c provideNavigationConfig = NavigationDependenciesModule.INSTANCE.provideNavigationConfig(appType, nativePageDomainsInteractor);
        j.d(provideNavigationConfig);
        return provideNavigationConfig;
    }
}
