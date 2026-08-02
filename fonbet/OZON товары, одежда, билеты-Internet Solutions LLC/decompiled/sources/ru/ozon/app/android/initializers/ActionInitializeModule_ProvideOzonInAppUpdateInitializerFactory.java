package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.inappupdate.OzonInAppUpdateInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideOzonInAppUpdateInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideOzonInAppUpdateInitializer(ActionInitializeModule actionInitializeModule, a<OzonInAppUpdateInitializer> aVar) {
        NamedActionInitializerProvider provideOzonInAppUpdateInitializer = actionInitializeModule.provideOzonInAppUpdateInitializer(aVar);
        j.d(provideOzonInAppUpdateInitializer);
        return provideOzonInAppUpdateInitializer;
    }
}
