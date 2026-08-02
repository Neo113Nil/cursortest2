package ru.ozon.app.android.fintech;

import Jb.j;
import ru.ozon.app.android.di.component.ApplicationComponent;
import ru.ozon.app.android.fintech.FintechDependencyComponent;
import ru.ozon.app.android.storage.hosts.FintechUrls;

/* loaded from: classes6.dex */
public final class DaggerFintechDependencyComponent {

    private static final class Factory implements FintechDependencyComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fintech.FintechDependencyComponent.Factory
        public FintechDependencyComponent create(ApplicationComponent applicationComponent) {
            applicationComponent.getClass();
            return new FintechDependencyComponentImpl(applicationComponent, 0);
        }

        private Factory() {
        }
    }

    private static final class FintechDependencyComponentImpl implements FintechDependencyComponent {
        private final ApplicationComponent applicationComponent;
        private final FintechDependencyComponentImpl fintechDependencyComponentImpl;

        /* synthetic */ FintechDependencyComponentImpl(ApplicationComponent applicationComponent, int i11) {
            this(applicationComponent);
        }

        @Override // ru.ozon.app.android.bank.di.FintechComponentDependencies
        public FintechUrls getFintechUrls() {
            FintechUrls fintechUrls = this.applicationComponent.getFintechUrls();
            j.c(fintechUrls);
            return fintechUrls;
        }

        private FintechDependencyComponentImpl(ApplicationComponent applicationComponent) {
            this.fintechDependencyComponentImpl = this;
            this.applicationComponent = applicationComponent;
        }
    }

    public static FintechDependencyComponent.Factory factory() {
        return new Factory(0);
    }
}
