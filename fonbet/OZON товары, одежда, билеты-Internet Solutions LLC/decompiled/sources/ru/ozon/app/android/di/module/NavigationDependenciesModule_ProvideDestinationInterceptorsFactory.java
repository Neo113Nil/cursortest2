package ru.ozon.app.android.di.module;

import Jb.e;
import Jb.j;
import KZ.d;
import ru.ozon.app.android.switchUser.SwitchUserDestinationInterceptor;

/* loaded from: classes11.dex */
public final class NavigationDependenciesModule_ProvideDestinationInterceptorsFactory implements e<d[]> {
    public static d[] provideDestinationInterceptors(SwitchUserDestinationInterceptor switchUserDestinationInterceptor) {
        d[] provideDestinationInterceptors = NavigationDependenciesModule.INSTANCE.provideDestinationInterceptors(switchUserDestinationInterceptor);
        j.d(provideDestinationInterceptors);
        return provideDestinationInterceptors;
    }
}
