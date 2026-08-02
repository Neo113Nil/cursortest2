package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideFreshLiveActivityInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideFreshLiveActivityInitializer(ActionInitializeModule actionInitializeModule, a<FreshLiveActivityInitializer> aVar) {
        NamedActionInitializerProvider provideFreshLiveActivityInitializer = actionInitializeModule.provideFreshLiveActivityInitializer(aVar);
        j.d(provideFreshLiveActivityInitializer);
        return provideFreshLiveActivityInitializer;
    }
}
