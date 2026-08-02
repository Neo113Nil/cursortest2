package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvidePushInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider providePushInitializer(ActionInitializeModule actionInitializeModule, a<PushInitializer> aVar) {
        NamedActionInitializerProvider providePushInitializer = actionInitializeModule.providePushInitializer(aVar);
        j.d(providePushInitializer);
        return providePushInitializer;
    }
}
