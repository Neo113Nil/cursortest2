package ru.ozon.app.android.composer.universalscreen.di;

import Jb.d;
import Jb.j;
import Pc.a;
import QZ.g;
import fk0.c;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.composer.configurator.storage.ComposerConfiguratorStorage;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.composer.universalscreen.di.ComposerFragmentComponent;
import ru.ozon.app.android.composer.universalscreen.di.module.ComposerFragmentModule;
import ru.ozon.app.android.composer.universalscreen.di.module.ComposerFragmentModule_ProvideAtomPoolFactory;
import ru.ozon.app.android.composer.universalscreen.di.module.ComposerFragmentModule_ProvideComposerStateConfiguratorsFactory;
import ru.ozon.app.android.composer.universalscreen.di.module.ComposerFragmentModule_ProvideEmptyStateFactoryFactory;
import ru.ozon.app.android.composer.universalscreen.di.module.ComposerFragmentModule_ProvideInitialProviderFactoryFactory;
import ru.ozon.app.android.composer.universalscreen.di.module.ComposerFragmentModule_ProvidePageConfiguratorsFactory;
import ru.ozon.app.android.composer.universalscreen.di.module.ComposerFragmentModule_ProvideViewPoolFactory;
import ru.ozon.app.android.composer.universalscreen.view.ComposerComposeThemeWrapper;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment_MembersInjector;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;

/* loaded from: classes6.dex */
public final class DaggerComposerFragmentComponent {

    private static final class ComposerFragmentComponentImpl implements ComposerFragmentComponent {
        private final ComposerComponentApi composerComponentApi;
        private final ComposerFragmentComponentDependencies composerFragmentComponentDependencies;
        private final ComposerFragmentComponentImpl composerFragmentComponentImpl;
        private final ComposerFragmentModule composerFragmentModule;
        private final ComposerScreenConfig config;
        private final NetworkComponentApi networkComponentApi;
        private a<RecycledAtomPool> provideAtomPoolProvider;
        private a<Set<g>> provideComposerStateConfiguratorsProvider;
        private a<E00.a> provideEmptyStateFactoryProvider;
        private a<C00.a> provideInitialProviderFactoryProvider;
        private a<List<ComposerScreenConfig.PageConfigurator>> providePageConfiguratorsProvider;
        private a<c> provideViewPoolProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final ComposerFragmentComponentImpl composerFragmentComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92478id;

            SwitchingProvider(ComposerFragmentComponentImpl composerFragmentComponentImpl, int i11) {
                this.composerFragmentComponentImpl = composerFragmentComponentImpl;
                this.f92478id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92478id;
                if (i11 == 0) {
                    ComposerFragmentModule composerFragmentModule = this.composerFragmentComponentImpl.composerFragmentModule;
                    ComposerScreenConfig composerScreenConfig = this.composerFragmentComponentImpl.config;
                    Map<Class<?>, a<ComposerScreenConfig.PageConfigurator>> configuratorProviders = this.composerFragmentComponentImpl.composerFragmentComponentDependencies.getConfiguratorProviders();
                    j.c(configuratorProviders);
                    ComposerConfiguratorStorage composerConfiguratorStorage = this.composerFragmentComponentImpl.composerComponentApi.getComposerConfiguratorStorage();
                    j.c(composerConfiguratorStorage);
                    return (T) ComposerFragmentModule_ProvidePageConfiguratorsFactory.providePageConfigurators(composerFragmentModule, composerScreenConfig, configuratorProviders, composerConfiguratorStorage);
                }
                if (i11 == 1) {
                    ComposerFragmentModule composerFragmentModule2 = this.composerFragmentComponentImpl.composerFragmentModule;
                    ComposerScreenConfig composerScreenConfig2 = this.composerFragmentComponentImpl.config;
                    Map<Class<?>, a<E00.a>> emptyStateInterceptors = this.composerFragmentComponentImpl.composerFragmentComponentDependencies.getEmptyStateInterceptors();
                    j.c(emptyStateInterceptors);
                    return (T) ComposerFragmentModule_ProvideEmptyStateFactoryFactory.provideEmptyStateFactory(composerFragmentModule2, composerScreenConfig2, emptyStateInterceptors);
                }
                if (i11 == 2) {
                    ComposerFragmentModule composerFragmentModule3 = this.composerFragmentComponentImpl.composerFragmentModule;
                    ComposerScreenConfig composerScreenConfig3 = this.composerFragmentComponentImpl.config;
                    Map<Class<?>, a<C00.a>> initialWidgetsProviders = this.composerFragmentComponentImpl.composerFragmentComponentDependencies.getInitialWidgetsProviders();
                    j.c(initialWidgetsProviders);
                    return (T) ComposerFragmentModule_ProvideInitialProviderFactoryFactory.provideInitialProviderFactory(composerFragmentModule3, composerScreenConfig3, initialWidgetsProviders);
                }
                if (i11 != 3) {
                    if (i11 == 4) {
                        return (T) ComposerFragmentModule_ProvideAtomPoolFactory.provideAtomPool(this.composerFragmentComponentImpl.composerFragmentModule);
                    }
                    if (i11 == 5) {
                        return (T) ComposerFragmentModule_ProvideViewPoolFactory.provideViewPool(this.composerFragmentComponentImpl.composerFragmentModule);
                    }
                    throw new AssertionError(this.f92478id);
                }
                ComposerFragmentModule composerFragmentModule4 = this.composerFragmentComponentImpl.composerFragmentModule;
                ComposerScreenConfig composerScreenConfig4 = this.composerFragmentComponentImpl.config;
                ComposerConfiguratorStorage composerConfiguratorStorage2 = this.composerFragmentComponentImpl.composerComponentApi.getComposerConfiguratorStorage();
                j.c(composerConfiguratorStorage2);
                Map<Class<?>, a<g>> composerStateConfiguratorProviders = this.composerFragmentComponentImpl.composerFragmentComponentDependencies.getComposerStateConfiguratorProviders();
                j.c(composerStateConfiguratorProviders);
                return (T) ComposerFragmentModule_ProvideComposerStateConfiguratorsFactory.provideComposerStateConfigurators(composerFragmentModule4, composerScreenConfig4, composerConfiguratorStorage2, composerStateConfiguratorProviders);
            }
        }

        /* synthetic */ ComposerFragmentComponentImpl(ComposerFragmentModule composerFragmentModule, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, ComposerFragmentComponentDependencies composerFragmentComponentDependencies, ComposerScreenConfig composerScreenConfig, int i11) {
            this(composerFragmentModule, analyticsScreenStorageComponentApi, composerComponentApi, networkComponentApi, composerFragmentComponentDependencies, composerScreenConfig);
        }

        private void initialize(ComposerFragmentModule composerFragmentModule, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, ComposerFragmentComponentDependencies composerFragmentComponentDependencies, ComposerScreenConfig composerScreenConfig) {
            this.providePageConfiguratorsProvider = d.b(new SwitchingProvider(this.composerFragmentComponentImpl, 0));
            this.provideEmptyStateFactoryProvider = d.b(new SwitchingProvider(this.composerFragmentComponentImpl, 1));
            this.provideInitialProviderFactoryProvider = d.b(new SwitchingProvider(this.composerFragmentComponentImpl, 2));
            this.provideComposerStateConfiguratorsProvider = d.b(new SwitchingProvider(this.composerFragmentComponentImpl, 3));
            this.provideAtomPoolProvider = new SwitchingProvider(this.composerFragmentComponentImpl, 4);
            this.provideViewPoolProvider = new SwitchingProvider(this.composerFragmentComponentImpl, 5);
        }

        private ComposerFragment injectComposerFragment(ComposerFragment composerFragment) {
            Set<Widget> widgets = this.composerFragmentComponentDependencies.getWidgets();
            j.c(widgets);
            ComposerFragment_MembersInjector.injectWidgets(composerFragment, widgets);
            ComposerFragment_MembersInjector.injectConfigurators(composerFragment, this.providePageConfiguratorsProvider.get());
            ComposerFragment_MembersInjector.injectErrorStateFactory(composerFragment, this.provideEmptyStateFactoryProvider.get());
            ComposerFragment_MembersInjector.injectInitialWidgetsProvider(composerFragment, this.provideInitialProviderFactoryProvider.get());
            ComposerFragment_MembersInjector.injectInterceptors(composerFragment, this.provideComposerStateConfiguratorsProvider.get());
            ComposerFragment_MembersInjector.injectAtomPoolProvider(composerFragment, this.provideAtomPoolProvider);
            ComposerFragment_MembersInjector.injectViewPoolProvider(composerFragment, this.provideViewPoolProvider);
            FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
            j.c(featureChecker);
            ComposerFragment_MembersInjector.injectFeatureChecker(composerFragment, featureChecker);
            ComposerComposeThemeWrapper composeThemeWrapper = this.composerFragmentComponentDependencies.getComposeThemeWrapper();
            j.c(composeThemeWrapper);
            ComposerFragment_MembersInjector.injectThemeWrapper(composerFragment, composeThemeWrapper);
            return composerFragment;
        }

        @Override // ru.ozon.app.android.composer.universalscreen.di.ComposerFragmentComponent
        public void inject(ComposerFragment composerFragment) {
            injectComposerFragment(composerFragment);
        }

        private ComposerFragmentComponentImpl(ComposerFragmentModule composerFragmentModule, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, ComposerFragmentComponentDependencies composerFragmentComponentDependencies, ComposerScreenConfig composerScreenConfig) {
            this.composerFragmentComponentImpl = this;
            this.composerFragmentComponentDependencies = composerFragmentComponentDependencies;
            this.composerFragmentModule = composerFragmentModule;
            this.config = composerScreenConfig;
            this.composerComponentApi = composerComponentApi;
            this.networkComponentApi = networkComponentApi;
            initialize(composerFragmentModule, analyticsScreenStorageComponentApi, composerComponentApi, networkComponentApi, composerFragmentComponentDependencies, composerScreenConfig);
        }
    }

    private static final class Factory implements ComposerFragmentComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.composer.universalscreen.di.ComposerFragmentComponent.Factory
        public ComposerFragmentComponent create(ComposerScreenConfig composerScreenConfig, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, ComposerFragmentComponentDependencies composerFragmentComponentDependencies) {
            composerScreenConfig.getClass();
            analyticsScreenStorageComponentApi.getClass();
            composerComponentApi.getClass();
            networkComponentApi.getClass();
            composerFragmentComponentDependencies.getClass();
            return new ComposerFragmentComponentImpl(new ComposerFragmentModule(), analyticsScreenStorageComponentApi, composerComponentApi, networkComponentApi, composerFragmentComponentDependencies, composerScreenConfig, 0);
        }

        private Factory() {
        }
    }

    public static ComposerFragmentComponent.Factory factory() {
        return new Factory(0);
    }
}
