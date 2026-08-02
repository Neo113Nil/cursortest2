package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.tracker.TrackerDebugMenuInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideTrackerDebugMenuInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideTrackerDebugMenuInitializer(ActionInitializeModule actionInitializeModule, a<TrackerDebugMenuInitializer> aVar) {
        NamedActionInitializerProvider provideTrackerDebugMenuInitializer = actionInitializeModule.provideTrackerDebugMenuInitializer(aVar);
        j.d(provideTrackerDebugMenuInitializer);
        return provideTrackerDebugMenuInitializer;
    }
}
