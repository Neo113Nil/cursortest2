package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.logger.ComposerLoggingActionsInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideComposerLoggingActionsInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideComposerLoggingActionsInitializer(ActionInitializeModule actionInitializeModule, a<ComposerLoggingActionsInitializer> aVar) {
        NamedActionInitializerProvider provideComposerLoggingActionsInitializer = actionInitializeModule.provideComposerLoggingActionsInitializer(aVar);
        j.d(provideComposerLoggingActionsInitializer);
        return provideComposerLoggingActionsInitializer;
    }
}
