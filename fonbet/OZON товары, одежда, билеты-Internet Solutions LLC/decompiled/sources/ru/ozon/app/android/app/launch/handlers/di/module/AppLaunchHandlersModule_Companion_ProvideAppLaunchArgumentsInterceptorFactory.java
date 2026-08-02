package ru.ozon.app.android.app.launch.handlers.di.module;

import GZ.g;
import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.app.launch.handlers.interceptors.AppLaunchArgumentResolver;
import ru.ozon.app.android.app.launch.handlers.interceptors.AppLaunchArgumentsInterceptor;

/* loaded from: classes6.dex */
public final class AppLaunchHandlersModule_Companion_ProvideAppLaunchArgumentsInterceptorFactory implements e<AppLaunchArgumentsInterceptor> {
    public static AppLaunchArgumentsInterceptor provideAppLaunchArgumentsInterceptor(g gVar, Set<AppLaunchArgumentResolver> set) {
        AppLaunchArgumentsInterceptor provideAppLaunchArgumentsInterceptor = AppLaunchHandlersModule.INSTANCE.provideAppLaunchArgumentsInterceptor(gVar, set);
        j.d(provideAppLaunchArgumentsInterceptor);
        return provideAppLaunchArgumentsInterceptor;
    }
}
