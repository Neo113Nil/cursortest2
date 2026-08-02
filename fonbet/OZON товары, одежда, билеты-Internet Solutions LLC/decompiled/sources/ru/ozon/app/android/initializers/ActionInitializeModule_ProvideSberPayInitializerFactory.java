package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideSberPayInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideSberPayInitializer(ActionInitializeModule actionInitializeModule, a<SberPayInitializer> aVar) {
        NamedActionInitializerProvider provideSberPayInitializer = actionInitializeModule.provideSberPayInitializer(aVar);
        j.d(provideSberPayInitializer);
        return provideSberPayInitializer;
    }
}
