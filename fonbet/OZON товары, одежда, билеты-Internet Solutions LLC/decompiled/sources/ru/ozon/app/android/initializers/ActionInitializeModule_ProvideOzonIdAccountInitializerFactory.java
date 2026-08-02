package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.user.OzonIdAccountInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideOzonIdAccountInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideOzonIdAccountInitializer(ActionInitializeModule actionInitializeModule, a<OzonIdAccountInitializer> aVar) {
        NamedActionInitializerProvider provideOzonIdAccountInitializer = actionInitializeModule.provideOzonIdAccountInitializer(aVar);
        j.d(provideOzonIdAccountInitializer);
        return provideOzonIdAccountInitializer;
    }
}
