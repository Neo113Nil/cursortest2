package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.configurators.ComposerActionInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideComposerActionInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideComposerActionInitializer(ActionInitializeModule actionInitializeModule, a<ComposerActionInitializer> aVar) {
        NamedActionInitializerProvider provideComposerActionInitializer = actionInitializeModule.provideComposerActionInitializer(aVar);
        j.d(provideComposerActionInitializer);
        return provideComposerActionInitializer;
    }
}
