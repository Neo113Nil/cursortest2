package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.messenger.MessengerFeatureActionInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideMessengerFeatureActionInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideMessengerFeatureActionInitializer(ActionInitializeModule actionInitializeModule, a<MessengerFeatureActionInitializer> aVar) {
        NamedActionInitializerProvider provideMessengerFeatureActionInitializer = actionInitializeModule.provideMessengerFeatureActionInitializer(aVar);
        j.d(provideMessengerFeatureActionInitializer);
        return provideMessengerFeatureActionInitializer;
    }
}
