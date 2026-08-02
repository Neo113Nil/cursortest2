package ru.ozon.app.android.limb2.di.modules;

import Jb.e;
import Jb.j;
import Od0.d;
import android.app.Application;
import ru.ozon.app.android.network.abtool.AbNamespaceProvider;

/* loaded from: classes6.dex */
public final class Limb2PluginProvidersModule_ProvideAbToolPluginProviderFactory implements e<d<Ld0.e>> {
    public static d<Ld0.e> provideAbToolPluginProvider(Limb2PluginProvidersModule limb2PluginProvidersModule, Application application, AbNamespaceProvider abNamespaceProvider) {
        d<Ld0.e> provideAbToolPluginProvider = limb2PluginProvidersModule.provideAbToolPluginProvider(application, abNamespaceProvider);
        j.d(provideAbToolPluginProvider);
        return provideAbToolPluginProvider;
    }
}
