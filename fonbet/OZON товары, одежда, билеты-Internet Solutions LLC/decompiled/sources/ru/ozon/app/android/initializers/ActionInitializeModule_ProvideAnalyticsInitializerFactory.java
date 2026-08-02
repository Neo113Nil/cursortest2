package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.analytics.AnalyticsInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideAnalyticsInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideAnalyticsInitializer(ActionInitializeModule actionInitializeModule, a<AnalyticsInitializer> aVar) {
        NamedActionInitializerProvider provideAnalyticsInitializer = actionInitializeModule.provideAnalyticsInitializer(aVar);
        j.d(provideAnalyticsInitializer);
        return provideAnalyticsInitializer;
    }
}
