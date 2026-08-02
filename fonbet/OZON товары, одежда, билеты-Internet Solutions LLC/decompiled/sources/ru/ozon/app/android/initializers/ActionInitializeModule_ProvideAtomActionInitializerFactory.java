package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.atoms.AtomActionInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideAtomActionInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideAtomActionInitializer(ActionInitializeModule actionInitializeModule, a<AtomActionInitializer> aVar) {
        NamedActionInitializerProvider provideAtomActionInitializer = actionInitializeModule.provideAtomActionInitializer(aVar);
        j.d(provideAtomActionInitializer);
        return provideAtomActionInitializer;
    }
}
