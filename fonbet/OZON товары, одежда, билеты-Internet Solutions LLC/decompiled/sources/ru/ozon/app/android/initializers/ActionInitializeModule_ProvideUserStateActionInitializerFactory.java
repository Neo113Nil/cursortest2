package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.user.UserStateActionInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideUserStateActionInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideUserStateActionInitializer(ActionInitializeModule actionInitializeModule, a<UserStateActionInitializer> aVar) {
        NamedActionInitializerProvider provideUserStateActionInitializer = actionInitializeModule.provideUserStateActionInitializer(aVar);
        j.d(provideUserStateActionInitializer);
        return provideUserStateActionInitializer;
    }
}
