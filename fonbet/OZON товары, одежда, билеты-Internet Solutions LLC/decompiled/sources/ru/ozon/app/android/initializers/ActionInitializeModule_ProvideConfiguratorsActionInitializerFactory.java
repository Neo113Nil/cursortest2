package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.configurators.ConfiguratorsActionInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideConfiguratorsActionInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideConfiguratorsActionInitializer(ActionInitializeModule actionInitializeModule, a<ConfiguratorsActionInitializer> aVar) {
        NamedActionInitializerProvider provideConfiguratorsActionInitializer = actionInitializeModule.provideConfiguratorsActionInitializer(aVar);
        j.d(provideConfiguratorsActionInitializer);
        return provideConfiguratorsActionInitializer;
    }
}
