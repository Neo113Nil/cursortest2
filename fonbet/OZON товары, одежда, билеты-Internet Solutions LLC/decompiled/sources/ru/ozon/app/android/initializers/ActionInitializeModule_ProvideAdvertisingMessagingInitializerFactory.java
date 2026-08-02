package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideAdvertisingMessagingInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideAdvertisingMessagingInitializer(ActionInitializeModule actionInitializeModule, a<AdvertisingMessagingInitializer> aVar) {
        NamedActionInitializerProvider provideAdvertisingMessagingInitializer = actionInitializeModule.provideAdvertisingMessagingInitializer(aVar);
        j.d(provideAdvertisingMessagingInitializer);
        return provideAdvertisingMessagingInitializer;
    }
}
