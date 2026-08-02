package ru.ozon.app.android.inappupdate.di;

import Jb.j;
import Ld0.c;
import ru.ozon.app.android.inappupdate.di.InAppUpdateDependencyComponent;
import ru.ozon.app.android.limb.Limb2ComponentApi;

/* loaded from: classes6.dex */
public final class DaggerInAppUpdateDependencyComponent {

    private static final class Factory implements InAppUpdateDependencyComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.inappupdate.di.InAppUpdateDependencyComponent.Factory
        public InAppUpdateDependencyComponent create(Limb2ComponentApi limb2ComponentApi) {
            limb2ComponentApi.getClass();
            return new InAppUpdateDependencyComponentImpl(limb2ComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class InAppUpdateDependencyComponentImpl implements InAppUpdateDependencyComponent {
        private final InAppUpdateDependencyComponentImpl inAppUpdateDependencyComponentImpl;
        private final Limb2ComponentApi limb2ComponentApi;

        /* synthetic */ InAppUpdateDependencyComponentImpl(Limb2ComponentApi limb2ComponentApi, int i11) {
            this(limb2ComponentApi);
        }

        @Override // ru.ozon.app.android.update.di.InAppUpdateComponentDependencies
        public c ozonLimbDiStore() {
            c ozonLimbDiStore = this.limb2ComponentApi.getOzonLimbDiStore();
            j.c(ozonLimbDiStore);
            return ozonLimbDiStore;
        }

        private InAppUpdateDependencyComponentImpl(Limb2ComponentApi limb2ComponentApi) {
            this.inAppUpdateDependencyComponentImpl = this;
            this.limb2ComponentApi = limb2ComponentApi;
        }
    }

    public static InAppUpdateDependencyComponent.Factory factory() {
        return new Factory(0);
    }
}
