package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.logger.HttpLoggingActionIntializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideHttpLoggingActionIntializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideHttpLoggingActionIntializer(ActionInitializeModule actionInitializeModule, a<HttpLoggingActionIntializer> aVar) {
        NamedActionInitializerProvider provideHttpLoggingActionIntializer = actionInitializeModule.provideHttpLoggingActionIntializer(aVar);
        j.d(provideHttpLoggingActionIntializer);
        return provideHttpLoggingActionIntializer;
    }
}
