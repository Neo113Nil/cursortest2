package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.whitelisting.WhitelistingInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideWhitelistingInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideWhitelistingInitializer(ActionInitializeModule actionInitializeModule, a<WhitelistingInitializer> aVar) {
        NamedActionInitializerProvider provideWhitelistingInitializer = actionInitializeModule.provideWhitelistingInitializer(aVar);
        j.d(provideWhitelistingInitializer);
        return provideWhitelistingInitializer;
    }
}
