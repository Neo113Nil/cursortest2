package ru.ozon.app.android.composer.universalscreen.di.module;

import Jb.e;
import Jb.j;
import Pc.a;
import QZ.g;
import java.util.Map;
import java.util.Set;
import ru.ozon.app.android.composer.configurator.storage.ComposerConfiguratorStorage;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

/* loaded from: classes6.dex */
public final class ComposerFragmentModule_ProvideComposerStateConfiguratorsFactory implements e<Set<g>> {
    public static Set<g> provideComposerStateConfigurators(ComposerFragmentModule composerFragmentModule, ComposerScreenConfig composerScreenConfig, ComposerConfiguratorStorage composerConfiguratorStorage, Map<Class<?>, a<g>> map) {
        Set<g> provideComposerStateConfigurators = composerFragmentModule.provideComposerStateConfigurators(composerScreenConfig, composerConfiguratorStorage, map);
        j.d(provideComposerStateConfigurators);
        return provideComposerStateConfigurators;
    }
}
