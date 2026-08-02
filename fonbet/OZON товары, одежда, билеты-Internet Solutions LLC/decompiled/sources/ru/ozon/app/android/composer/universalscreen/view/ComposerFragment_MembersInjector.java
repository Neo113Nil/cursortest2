package ru.ozon.app.android.composer.universalscreen.view;

import Ib.b;
import Pc.a;
import QZ.g;
import fk0.c;
import java.util.List;
import java.util.Set;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;

/* loaded from: classes6.dex */
public final class ComposerFragment_MembersInjector implements b<ComposerFragment> {
    public static void injectAtomPoolProvider(ComposerFragment composerFragment, a<RecycledAtomPool> aVar) {
        composerFragment.atomPoolProvider = aVar;
    }

    public static void injectConfigurators(ComposerFragment composerFragment, List<ComposerScreenConfig.PageConfigurator> list) {
        composerFragment.configurators = list;
    }

    public static void injectErrorStateFactory(ComposerFragment composerFragment, E00.a aVar) {
        composerFragment.errorStateFactory = aVar;
    }

    public static void injectFeatureChecker(ComposerFragment composerFragment, FeatureChecker featureChecker) {
        composerFragment.featureChecker = featureChecker;
    }

    public static void injectInitialWidgetsProvider(ComposerFragment composerFragment, C00.a aVar) {
        composerFragment.initialWidgetsProvider = aVar;
    }

    public static void injectInterceptors(ComposerFragment composerFragment, Set<g> set) {
        composerFragment.interceptors = set;
    }

    public static void injectThemeWrapper(ComposerFragment composerFragment, ComposerComposeThemeWrapper composerComposeThemeWrapper) {
        composerFragment.themeWrapper = composerComposeThemeWrapper;
    }

    public static void injectViewPoolProvider(ComposerFragment composerFragment, a<c> aVar) {
        composerFragment.viewPoolProvider = aVar;
    }

    public static void injectWidgets(ComposerFragment composerFragment, Set<Widget> set) {
        composerFragment.widgets = set;
    }
}
