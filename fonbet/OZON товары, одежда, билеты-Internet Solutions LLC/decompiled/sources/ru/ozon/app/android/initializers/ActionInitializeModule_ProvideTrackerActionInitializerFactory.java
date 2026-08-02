package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.tracker.TrackerActionInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideTrackerActionInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideTrackerActionInitializer(ActionInitializeModule actionInitializeModule, a<TrackerActionInitializer> aVar) {
        NamedActionInitializerProvider provideTrackerActionInitializer = actionInitializeModule.provideTrackerActionInitializer(aVar);
        j.d(provideTrackerActionInitializer);
        return provideTrackerActionInitializer;
    }
}
