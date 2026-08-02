package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.fintech.FintechLibActionInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_BindFintechLibActionInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider bindFintechLibActionInitializer(ActionInitializeModule actionInitializeModule, a<FintechLibActionInitializer> aVar) {
        NamedActionInitializerProvider bindFintechLibActionInitializer = actionInitializeModule.bindFintechLibActionInitializer(aVar);
        j.d(bindFintechLibActionInitializer);
        return bindFintechLibActionInitializer;
    }
}
