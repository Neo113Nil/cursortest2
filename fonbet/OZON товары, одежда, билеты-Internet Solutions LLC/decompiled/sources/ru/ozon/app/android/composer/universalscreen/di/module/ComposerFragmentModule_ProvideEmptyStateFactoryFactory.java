package ru.ozon.app.android.composer.universalscreen.di.module;

import E00.a;
import Jb.e;
import Jb.j;
import java.util.Map;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

/* loaded from: classes6.dex */
public final class ComposerFragmentModule_ProvideEmptyStateFactoryFactory implements e<a> {
    public static a provideEmptyStateFactory(ComposerFragmentModule composerFragmentModule, ComposerScreenConfig composerScreenConfig, Map<Class<?>, Pc.a<a>> map) {
        a provideEmptyStateFactory = composerFragmentModule.provideEmptyStateFactory(composerScreenConfig, map);
        j.d(provideEmptyStateFactory);
        return provideEmptyStateFactory;
    }
}
