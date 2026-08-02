package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.localization.SetLocaleActionInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideSetLocaleActionInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideSetLocaleActionInitializer(ActionInitializeModule actionInitializeModule, a<SetLocaleActionInitializer> aVar) {
        NamedActionInitializerProvider provideSetLocaleActionInitializer = actionInitializeModule.provideSetLocaleActionInitializer(aVar);
        j.d(provideSetLocaleActionInitializer);
        return provideSetLocaleActionInitializer;
    }
}
