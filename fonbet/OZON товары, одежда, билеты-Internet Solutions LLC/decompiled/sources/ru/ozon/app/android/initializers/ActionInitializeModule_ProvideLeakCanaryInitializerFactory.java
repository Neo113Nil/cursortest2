package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.leakcanary.LeakCanaryInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideLeakCanaryInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideLeakCanaryInitializer(ActionInitializeModule actionInitializeModule, a<LeakCanaryInitializer> aVar) {
        NamedActionInitializerProvider provideLeakCanaryInitializer = actionInitializeModule.provideLeakCanaryInitializer(aVar);
        j.d(provideLeakCanaryInitializer);
        return provideLeakCanaryInitializer;
    }
}
