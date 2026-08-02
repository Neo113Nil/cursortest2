package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideHapticsInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideHapticsInitializer(ActionInitializeModule actionInitializeModule, a<HapticsInitializer> aVar) {
        NamedActionInitializerProvider provideHapticsInitializer = actionInitializeModule.provideHapticsInitializer(aVar);
        j.d(provideHapticsInitializer);
        return provideHapticsInitializer;
    }
}
