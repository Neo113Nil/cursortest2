package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideJetpackComposeInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideJetpackComposeInitializer(ActionInitializeModule actionInitializeModule, a<JetpackComposeInitializer> aVar) {
        NamedActionInitializerProvider provideJetpackComposeInitializer = actionInitializeModule.provideJetpackComposeInitializer(aVar);
        j.d(provideJetpackComposeInitializer);
        return provideJetpackComposeInitializer;
    }
}
