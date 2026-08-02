package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.abtool.AbToolActionInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideAbToolActionInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideAbToolActionInitializer(ActionInitializeModule actionInitializeModule, a<AbToolActionInitializer> aVar) {
        NamedActionInitializerProvider provideAbToolActionInitializer = actionInitializeModule.provideAbToolActionInitializer(aVar);
        j.d(provideAbToolActionInitializer);
        return provideAbToolActionInitializer;
    }
}
