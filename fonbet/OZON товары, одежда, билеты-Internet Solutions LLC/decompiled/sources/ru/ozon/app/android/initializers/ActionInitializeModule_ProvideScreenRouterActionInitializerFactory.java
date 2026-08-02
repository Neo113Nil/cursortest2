package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideScreenRouterActionInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideScreenRouterActionInitializer(ActionInitializeModule actionInitializeModule, a<ScreenRouterActionInitializer> aVar) {
        NamedActionInitializerProvider provideScreenRouterActionInitializer = actionInitializeModule.provideScreenRouterActionInitializer(aVar);
        j.d(provideScreenRouterActionInitializer);
        return provideScreenRouterActionInitializer;
    }
}
