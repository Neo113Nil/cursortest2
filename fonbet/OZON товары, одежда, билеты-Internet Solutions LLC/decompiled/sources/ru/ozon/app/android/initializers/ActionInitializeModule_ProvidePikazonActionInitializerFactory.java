package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.pikazon.PikazonActionInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvidePikazonActionInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider providePikazonActionInitializer(ActionInitializeModule actionInitializeModule, a<PikazonActionInitializer> aVar) {
        NamedActionInitializerProvider providePikazonActionInitializer = actionInitializeModule.providePikazonActionInitializer(aVar);
        j.d(providePikazonActionInitializer);
        return providePikazonActionInitializer;
    }
}
