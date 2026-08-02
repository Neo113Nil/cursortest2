package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.shortcuts.DynamicShortcutsInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideShortcutsInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideShortcutsInitializer(ActionInitializeModule actionInitializeModule, a<DynamicShortcutsInitializer> aVar) {
        NamedActionInitializerProvider provideShortcutsInitializer = actionInitializeModule.provideShortcutsInitializer(aVar);
        j.d(provideShortcutsInitializer);
        return provideShortcutsInitializer;
    }
}
