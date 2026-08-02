package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.lastlocation.LastLocationInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideLastLocationInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideLastLocationInitializer(ActionInitializeModule actionInitializeModule, a<LastLocationInitializer> aVar) {
        NamedActionInitializerProvider provideLastLocationInitializer = actionInitializeModule.provideLastLocationInitializer(aVar);
        j.d(provideLastLocationInitializer);
        return provideLastLocationInitializer;
    }
}
