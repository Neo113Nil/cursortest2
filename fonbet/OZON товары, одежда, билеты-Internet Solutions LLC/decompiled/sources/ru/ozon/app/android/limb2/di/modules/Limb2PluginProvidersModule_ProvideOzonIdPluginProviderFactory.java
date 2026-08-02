package ru.ozon.app.android.limb2.di.modules;

import Jb.e;
import Jb.j;
import Od0.d;
import android.app.Application;
import ru.ozon.app.android.account.orders.emptyscreen.antibot.OpenBarcodeButtonConfig;

/* loaded from: classes6.dex */
public final class Limb2PluginProvidersModule_ProvideOzonIdPluginProviderFactory implements e<d<Ld0.e>> {
    public static d<Ld0.e> provideOzonIdPluginProvider(Limb2PluginProvidersModule limb2PluginProvidersModule, Ld0.d dVar, Application application, OpenBarcodeButtonConfig openBarcodeButtonConfig) {
        d<Ld0.e> provideOzonIdPluginProvider = limb2PluginProvidersModule.provideOzonIdPluginProvider(dVar, application, openBarcodeButtonConfig);
        j.d(provideOzonIdPluginProvider);
        return provideOzonIdPluginProvider;
    }
}
