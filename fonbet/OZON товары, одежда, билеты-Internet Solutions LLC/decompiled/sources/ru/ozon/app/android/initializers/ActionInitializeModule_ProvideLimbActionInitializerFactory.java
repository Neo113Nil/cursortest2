package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.limb.LimbActionInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideLimbActionInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideLimbActionInitializer(ActionInitializeModule actionInitializeModule, a<LimbActionInitializer> aVar) {
        NamedActionInitializerProvider provideLimbActionInitializer = actionInitializeModule.provideLimbActionInitializer(aVar);
        j.d(provideLimbActionInitializer);
        return provideLimbActionInitializer;
    }
}
