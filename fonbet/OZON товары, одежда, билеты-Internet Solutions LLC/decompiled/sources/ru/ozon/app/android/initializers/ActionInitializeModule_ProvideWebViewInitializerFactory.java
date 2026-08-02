package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideWebViewInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideWebViewInitializer(ActionInitializeModule actionInitializeModule, a<WebViewInitializer> aVar) {
        NamedActionInitializerProvider provideWebViewInitializer = actionInitializeModule.provideWebViewInitializer(aVar);
        j.d(provideWebViewInitializer);
        return provideWebViewInitializer;
    }
}
