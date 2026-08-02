package ru.ozon.app.android.storefront.stories.playstories.di;

import EZ.h;
import GZ.g;
import Jb.j;
import K00.i;
import Pc.a;
import android.app.Application;
import java.util.Set;
import ru.ozon.app.android.composer.ComposerDependenciesProvider;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.composer.references.ComposerReferencesFactory;
import ru.ozon.app.android.composer.universalscreen.di.ComposerFragmentComponentDependencies;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.storefront.stories.playstories.di.PlayStoriesComponent;
import ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesActivity;
import ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesActivity_MembersInjector;
import ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesViewModelImpl;
import ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesViewModelImpl_Factory;
import ru.ozon.composer.ui.widget.l;

/* loaded from: classes2.dex */
public final class DaggerPlayStoriesComponent {

    private static final class Factory implements PlayStoriesComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.storefront.stories.playstories.di.PlayStoriesComponent.Factory
        public PlayStoriesComponent create(NavigationComponentApi navigationComponentApi, ComposerFragmentComponentDependencies composerFragmentComponentDependencies, ContextComponentDependencies contextComponentDependencies) {
            navigationComponentApi.getClass();
            composerFragmentComponentDependencies.getClass();
            contextComponentDependencies.getClass();
            return new PlayStoriesComponentImpl(navigationComponentApi, composerFragmentComponentDependencies, contextComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class PlayStoriesComponentImpl implements PlayStoriesComponent {
        private a<Application> getApplicationProvider;
        private a<Set<Widget>> getWidgetsProvider;
        private final NavigationComponentApi navigationComponentApi;
        private final PlayStoriesComponentImpl playStoriesComponentImpl;
        private a<PlayStoriesViewModelImpl> playStoriesViewModelImplProvider;
        private a<ComposerReferencesFactory> provideComposerReferencesProvider;
        private a<i<l>> provideComposerRepositoryProvider;
        private a<ComposerDependenciesProvider> provideRetainComposerDependenciesProvider;

        private static final class GetApplicationProvider implements a<Application> {
            private final ContextComponentDependencies contextComponentDependencies;

            GetApplicationProvider(ContextComponentDependencies contextComponentDependencies) {
                this.contextComponentDependencies = contextComponentDependencies;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public Application get() {
                Application application = this.contextComponentDependencies.getApplication();
                j.c(application);
                return application;
            }
        }

        private static final class GetWidgetsProvider implements a<Set<Widget>> {
            private final ComposerFragmentComponentDependencies composerFragmentComponentDependencies;

            GetWidgetsProvider(ComposerFragmentComponentDependencies composerFragmentComponentDependencies) {
                this.composerFragmentComponentDependencies = composerFragmentComponentDependencies;
            }

            @Override // Pc.a
            public Set<Widget> get() {
                Set<Widget> widgets = this.composerFragmentComponentDependencies.getWidgets();
                j.c(widgets);
                return widgets;
            }
        }

        /* synthetic */ PlayStoriesComponentImpl(NavigationComponentApi navigationComponentApi, ComposerFragmentComponentDependencies composerFragmentComponentDependencies, ContextComponentDependencies contextComponentDependencies, int i11) {
            this(navigationComponentApi, composerFragmentComponentDependencies, contextComponentDependencies);
        }

        private void initialize(NavigationComponentApi navigationComponentApi, ComposerFragmentComponentDependencies composerFragmentComponentDependencies, ContextComponentDependencies contextComponentDependencies) {
            this.getApplicationProvider = new GetApplicationProvider(contextComponentDependencies);
            GetWidgetsProvider getWidgetsProvider = new GetWidgetsProvider(composerFragmentComponentDependencies);
            this.getWidgetsProvider = getWidgetsProvider;
            StoriesActivityModule_Companion_ProvideRetainComposerDependenciesProviderFactory create = StoriesActivityModule_Companion_ProvideRetainComposerDependenciesProviderFactory.create(this.getApplicationProvider, getWidgetsProvider);
            this.provideRetainComposerDependenciesProvider = create;
            this.provideComposerRepositoryProvider = StoriesActivityModule_Companion_ProvideComposerRepositoryFactory.create(create);
            StoriesActivityModule_Companion_ProvideComposerReferencesProviderFactory create2 = StoriesActivityModule_Companion_ProvideComposerReferencesProviderFactory.create(this.provideRetainComposerDependenciesProvider);
            this.provideComposerReferencesProvider = create2;
            this.playStoriesViewModelImplProvider = PlayStoriesViewModelImpl_Factory.create(this.provideComposerRepositoryProvider, create2);
        }

        private PlayStoriesActivity injectPlayStoriesActivity(PlayStoriesActivity playStoriesActivity) {
            PlayStoriesActivity_MembersInjector.injectViewModelProvider(playStoriesActivity, this.playStoriesViewModelImplProvider);
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            PlayStoriesActivity_MembersInjector.injectOzonRouter(playStoriesActivity, ozonRouter);
            h navigatorHolder = this.navigationComponentApi.getNavigatorHolder();
            j.c(navigatorHolder);
            PlayStoriesActivity_MembersInjector.injectNavigatorHolder(playStoriesActivity, navigatorHolder);
            return playStoriesActivity;
        }

        @Override // ru.ozon.app.android.storefront.stories.playstories.di.PlayStoriesComponent
        public void inject(PlayStoriesActivity playStoriesActivity) {
            injectPlayStoriesActivity(playStoriesActivity);
        }

        private PlayStoriesComponentImpl(NavigationComponentApi navigationComponentApi, ComposerFragmentComponentDependencies composerFragmentComponentDependencies, ContextComponentDependencies contextComponentDependencies) {
            this.playStoriesComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
            initialize(navigationComponentApi, composerFragmentComponentDependencies, contextComponentDependencies);
        }
    }

    public static PlayStoriesComponent.Factory factory() {
        return new Factory(0);
    }
}
