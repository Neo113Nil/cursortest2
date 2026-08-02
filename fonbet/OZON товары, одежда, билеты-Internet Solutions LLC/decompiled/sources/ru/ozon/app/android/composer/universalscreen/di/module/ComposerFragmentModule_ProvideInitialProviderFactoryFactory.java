package ru.ozon.app.android.composer.universalscreen.di.module;

import C00.a;
import Jb.e;
import Jb.j;
import java.util.Map;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

/* loaded from: classes6.dex */
public final class ComposerFragmentModule_ProvideInitialProviderFactoryFactory implements e<a> {
    public static a provideInitialProviderFactory(ComposerFragmentModule composerFragmentModule, ComposerScreenConfig composerScreenConfig, Map<Class<?>, Pc.a<a>> map) {
        a provideInitialProviderFactory = composerFragmentModule.provideInitialProviderFactory(composerScreenConfig, map);
        j.d(provideInitialProviderFactory);
        return provideInitialProviderFactory;
    }
}
