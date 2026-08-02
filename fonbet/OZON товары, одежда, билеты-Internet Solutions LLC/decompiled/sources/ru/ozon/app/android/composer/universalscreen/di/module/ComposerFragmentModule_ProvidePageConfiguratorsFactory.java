package ru.ozon.app.android.composer.universalscreen.di.module;

import Jb.e;
import Jb.j;
import Pc.a;
import java.util.List;
import java.util.Map;
import ru.ozon.app.android.composer.configurator.storage.ComposerConfiguratorStorage;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

/* loaded from: classes6.dex */
public final class ComposerFragmentModule_ProvidePageConfiguratorsFactory implements e<List<ComposerScreenConfig.PageConfigurator>> {
    public static List<ComposerScreenConfig.PageConfigurator> providePageConfigurators(ComposerFragmentModule composerFragmentModule, ComposerScreenConfig composerScreenConfig, Map<Class<?>, a<ComposerScreenConfig.PageConfigurator>> map, ComposerConfiguratorStorage composerConfiguratorStorage) {
        List<ComposerScreenConfig.PageConfigurator> providePageConfigurators = composerFragmentModule.providePageConfigurators(composerScreenConfig, map, composerConfiguratorStorage);
        j.d(providePageConfigurators);
        return providePageConfigurators;
    }
}
