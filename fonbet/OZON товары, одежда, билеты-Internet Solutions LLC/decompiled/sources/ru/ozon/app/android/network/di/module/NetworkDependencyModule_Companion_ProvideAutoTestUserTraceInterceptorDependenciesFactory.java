package ru.ozon.app.android.network.di.module;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.network.interceptors.dependencies.AutoTestTraceIdInterceptorDependencies;
import ru.ozon.app.android.storage.user.UserStatusStorage;

/* loaded from: classes6.dex */
public final class NetworkDependencyModule_Companion_ProvideAutoTestUserTraceInterceptorDependenciesFactory implements e<AutoTestTraceIdInterceptorDependencies> {
    public static AutoTestTraceIdInterceptorDependencies provideAutoTestUserTraceInterceptorDependencies(UserStatusStorage userStatusStorage) {
        AutoTestTraceIdInterceptorDependencies provideAutoTestUserTraceInterceptorDependencies = NetworkDependencyModule.INSTANCE.provideAutoTestUserTraceInterceptorDependencies(userStatusStorage);
        j.d(provideAutoTestUserTraceInterceptorDependencies);
        return provideAutoTestUserTraceInterceptorDependencies;
    }
}
