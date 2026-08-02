package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.debug.OzonDebugMenuSdkInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideOzonDebugMenuSdkInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideOzonDebugMenuSdkInitializer(ActionInitializeModule actionInitializeModule, a<OzonDebugMenuSdkInitializer> aVar) {
        NamedActionInitializerProvider provideOzonDebugMenuSdkInitializer = actionInitializeModule.provideOzonDebugMenuSdkInitializer(aVar);
        j.d(provideOzonDebugMenuSdkInitializer);
        return provideOzonDebugMenuSdkInitializer;
    }
}
