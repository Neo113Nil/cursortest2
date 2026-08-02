package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.startup.time.StartupTimeTrackerInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideStartupTimeTrackerInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideStartupTimeTrackerInitializer(ActionInitializeModule actionInitializeModule, a<StartupTimeTrackerInitializer> aVar) {
        NamedActionInitializerProvider provideStartupTimeTrackerInitializer = actionInitializeModule.provideStartupTimeTrackerInitializer(aVar);
        j.d(provideStartupTimeTrackerInitializer);
        return provideStartupTimeTrackerInitializer;
    }
}
