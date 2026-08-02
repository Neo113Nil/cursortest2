package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.auth.AuthActionInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideAuthActionInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideAuthActionInitializer(ActionInitializeModule actionInitializeModule, a<AuthActionInitializer> aVar) {
        NamedActionInitializerProvider provideAuthActionInitializer = actionInitializeModule.provideAuthActionInitializer(aVar);
        j.d(provideAuthActionInitializer);
        return provideAuthActionInitializer;
    }
}
