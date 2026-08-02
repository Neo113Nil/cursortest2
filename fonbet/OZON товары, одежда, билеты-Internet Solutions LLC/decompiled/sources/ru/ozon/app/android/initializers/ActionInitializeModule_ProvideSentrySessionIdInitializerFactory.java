package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.sentry.SentrySessionIdInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideSentrySessionIdInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideSentrySessionIdInitializer(ActionInitializeModule actionInitializeModule, a<SentrySessionIdInitializer> aVar) {
        NamedActionInitializerProvider provideSentrySessionIdInitializer = actionInitializeModule.provideSentrySessionIdInitializer(aVar);
        j.d(provideSentrySessionIdInitializer);
        return provideSentrySessionIdInitializer;
    }
}
