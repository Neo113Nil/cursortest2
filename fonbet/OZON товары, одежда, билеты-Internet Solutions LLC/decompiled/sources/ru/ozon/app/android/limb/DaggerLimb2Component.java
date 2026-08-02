package ru.ozon.app.android.limb;

import Jb.j;
import Ld0.c;
import Ld0.d;
import Ld0.e;
import Pc.a;
import java.util.Set;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.limb.Limb2Component;
import ru.ozon.app.android.limb.di.modules.Limb2Module_Companion_ProvideOzonLimbDiStoreFactory;

/* loaded from: classes6.dex */
public final class DaggerLimb2Component {

    private static final class Factory implements Limb2Component.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.limb.Limb2Component.Factory
        public Limb2Component create(ContextComponentDependencies contextComponentDependencies, Limb2ComponentDependencies limb2ComponentDependencies) {
            contextComponentDependencies.getClass();
            limb2ComponentDependencies.getClass();
            return new Limb2ComponentImpl(contextComponentDependencies, limb2ComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class Limb2ComponentImpl implements Limb2Component {
        private final Limb2ComponentDependencies limb2ComponentDependencies;
        private final Limb2ComponentImpl limb2ComponentImpl;
        private a<c> provideOzonLimbDiStoreProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92816id;
            private final Limb2ComponentImpl limb2ComponentImpl;

            SwitchingProvider(Limb2ComponentImpl limb2ComponentImpl, int i11) {
                this.limb2ComponentImpl = limb2ComponentImpl;
                this.f92816id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92816id != 0) {
                    throw new AssertionError(this.f92816id);
                }
                d ozonLimbLibsGlobalConfig = this.limb2ComponentImpl.limb2ComponentDependencies.getOzonLimbLibsGlobalConfig();
                j.c(ozonLimbLibsGlobalConfig);
                Set<Od0.d<e>> pluginProviders = this.limb2ComponentImpl.limb2ComponentDependencies.getPluginProviders();
                j.c(pluginProviders);
                return (T) Limb2Module_Companion_ProvideOzonLimbDiStoreFactory.provideOzonLimbDiStore(ozonLimbLibsGlobalConfig, pluginProviders);
            }
        }

        /* synthetic */ Limb2ComponentImpl(ContextComponentDependencies contextComponentDependencies, Limb2ComponentDependencies limb2ComponentDependencies, int i11) {
            this(contextComponentDependencies, limb2ComponentDependencies);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, Limb2ComponentDependencies limb2ComponentDependencies) {
            this.provideOzonLimbDiStoreProvider = Jb.d.b(new SwitchingProvider(this.limb2ComponentImpl, 0));
        }

        @Override // ru.ozon.app.android.limb.Limb2ComponentApi
        public c getOzonLimbDiStore() {
            return this.provideOzonLimbDiStoreProvider.get();
        }

        private Limb2ComponentImpl(ContextComponentDependencies contextComponentDependencies, Limb2ComponentDependencies limb2ComponentDependencies) {
            this.limb2ComponentImpl = this;
            this.limb2ComponentDependencies = limb2ComponentDependencies;
            initialize(contextComponentDependencies, limb2ComponentDependencies);
        }
    }

    public static Limb2Component.Factory factory() {
        return new Factory(0);
    }
}
