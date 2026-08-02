package ru.ozon.app.android.storage.di;

import Jb.d;
import Jb.j;
import Ld0.c;
import Pc.a;
import g00.InterfaceC6608a;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.storage.di.ComposerDebugMenuHostApiComponentImpl;
import ru.ozon.app.android.storage.di.module.ComposerDebugHostApiModule;
import ru.ozon.app.android.storage.di.module.ComposerDebugHostApiModule_ProvideComposerDebugMenuHostApiFactory;

/* loaded from: classes7.dex */
public final class DaggerComposerDebugMenuHostApiComponentImpl {

    private static final class ComposerDebugMenuHostApiComponentImplImpl implements ComposerDebugMenuHostApiComponentImpl {
        private final ComposerDebugHostApiModule composerDebugHostApiModule;
        private final ComposerDebugMenuHostApiComponentImplImpl composerDebugMenuHostApiComponentImplImpl;
        private final Limb2ComponentApi limb2ComponentApi;
        private a<InterfaceC6608a> provideComposerDebugMenuHostApiProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final ComposerDebugMenuHostApiComponentImplImpl composerDebugMenuHostApiComponentImplImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f93499id;

            SwitchingProvider(ComposerDebugMenuHostApiComponentImplImpl composerDebugMenuHostApiComponentImplImpl, int i11) {
                this.composerDebugMenuHostApiComponentImplImpl = composerDebugMenuHostApiComponentImplImpl;
                this.f93499id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f93499id != 0) {
                    throw new AssertionError(this.f93499id);
                }
                ComposerDebugHostApiModule composerDebugHostApiModule = this.composerDebugMenuHostApiComponentImplImpl.composerDebugHostApiModule;
                c ozonLimbDiStore = this.composerDebugMenuHostApiComponentImplImpl.limb2ComponentApi.getOzonLimbDiStore();
                j.c(ozonLimbDiStore);
                return (T) ComposerDebugHostApiModule_ProvideComposerDebugMenuHostApiFactory.provideComposerDebugMenuHostApi(composerDebugHostApiModule, ozonLimbDiStore);
            }
        }

        /* synthetic */ ComposerDebugMenuHostApiComponentImplImpl(ComposerDebugHostApiModule composerDebugHostApiModule, Limb2ComponentApi limb2ComponentApi, int i11) {
            this(composerDebugHostApiModule, limb2ComponentApi);
        }

        private void initialize(ComposerDebugHostApiModule composerDebugHostApiModule, Limb2ComponentApi limb2ComponentApi) {
            this.provideComposerDebugMenuHostApiProvider = d.b(new SwitchingProvider(this.composerDebugMenuHostApiComponentImplImpl, 0));
        }

        @Override // ru.ozon.app.android.storage.di.ComposerDebugMenuHostApiComponent
        public InterfaceC6608a provideComposerDebugMenuHostApi() {
            return this.provideComposerDebugMenuHostApiProvider.get();
        }

        private ComposerDebugMenuHostApiComponentImplImpl(ComposerDebugHostApiModule composerDebugHostApiModule, Limb2ComponentApi limb2ComponentApi) {
            this.composerDebugMenuHostApiComponentImplImpl = this;
            this.composerDebugHostApiModule = composerDebugHostApiModule;
            this.limb2ComponentApi = limb2ComponentApi;
            initialize(composerDebugHostApiModule, limb2ComponentApi);
        }
    }

    private static final class Factory implements ComposerDebugMenuHostApiComponentImpl.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.storage.di.ComposerDebugMenuHostApiComponentImpl.Factory
        public ComposerDebugMenuHostApiComponentImpl create(Limb2ComponentApi limb2ComponentApi) {
            limb2ComponentApi.getClass();
            return new ComposerDebugMenuHostApiComponentImplImpl(new ComposerDebugHostApiModule(), limb2ComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static ComposerDebugMenuHostApiComponentImpl.Factory factory() {
        return new Factory(0);
    }
}
