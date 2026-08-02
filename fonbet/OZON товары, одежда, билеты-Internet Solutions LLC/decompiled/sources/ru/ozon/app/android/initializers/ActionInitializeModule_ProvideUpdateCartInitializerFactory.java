package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.updatecart.UpdateCartInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideUpdateCartInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideUpdateCartInitializer(ActionInitializeModule actionInitializeModule, a<UpdateCartInitializer> aVar) {
        NamedActionInitializerProvider provideUpdateCartInitializer = actionInitializeModule.provideUpdateCartInitializer(aVar);
        j.d(provideUpdateCartInitializer);
        return provideUpdateCartInitializer;
    }
}
