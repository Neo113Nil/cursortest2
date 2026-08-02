package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.logger.LoggerInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideLoggerInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideLoggerInitializer(ActionInitializeModule actionInitializeModule, a<LoggerInitializer> aVar) {
        NamedActionInitializerProvider provideLoggerInitializer = actionInitializeModule.provideLoggerInitializer(aVar);
        j.d(provideLoggerInitializer);
        return provideLoggerInitializer;
    }
}
