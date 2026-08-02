package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideMapsActionInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideMapsActionInitializer(ActionInitializeModule actionInitializeModule, a<MapsActionInitializer> aVar) {
        NamedActionInitializerProvider provideMapsActionInitializer = actionInitializeModule.provideMapsActionInitializer(aVar);
        j.d(provideMapsActionInitializer);
        return provideMapsActionInitializer;
    }
}
