package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideDarkThemeInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideDarkThemeInitializer(ActionInitializeModule actionInitializeModule, a<DarkThemeInitializer> aVar) {
        NamedActionInitializerProvider provideDarkThemeInitializer = actionInitializeModule.provideDarkThemeInitializer(aVar);
        j.d(provideDarkThemeInitializer);
        return provideDarkThemeInitializer;
    }
}
