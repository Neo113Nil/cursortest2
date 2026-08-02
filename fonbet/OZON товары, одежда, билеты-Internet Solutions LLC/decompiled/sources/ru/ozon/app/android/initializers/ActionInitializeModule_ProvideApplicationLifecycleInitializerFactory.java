package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.lifecycle.ApplicationLifecycleInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideApplicationLifecycleInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideApplicationLifecycleInitializer(ActionInitializeModule actionInitializeModule, a<ApplicationLifecycleInitializer> aVar) {
        NamedActionInitializerProvider provideApplicationLifecycleInitializer = actionInitializeModule.provideApplicationLifecycleInitializer(aVar);
        j.d(provideApplicationLifecycleInitializer);
        return provideApplicationLifecycleInitializer;
    }
}
