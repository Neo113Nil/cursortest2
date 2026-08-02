package ru.ozon.app.android.cml.domain.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.cml.domain.di.CmlDomainComponent;
import ru.ozon.app.android.cml.domain.refresh.CmlEventsController;

/* loaded from: classes6.dex */
public final class DaggerCmlDomainComponent {

    private static final class CmlDomainComponentImpl implements CmlDomainComponent {
        private final CmlDomainComponentImpl cmlDomainComponentImpl;
        private a<CmlEventsController> cmlEventsControllerProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final CmlDomainComponentImpl cmlDomainComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92378id;

            SwitchingProvider(CmlDomainComponentImpl cmlDomainComponentImpl, int i11) {
                this.cmlDomainComponentImpl = cmlDomainComponentImpl;
                this.f92378id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92378id == 0) {
                    return (T) new CmlEventsController();
                }
                throw new AssertionError(this.f92378id);
            }
        }

        /* synthetic */ CmlDomainComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            this.cmlEventsControllerProvider = d.b(new SwitchingProvider(this.cmlDomainComponentImpl, 0));
        }

        @Override // ru.ozon.app.android.cml.domain.di.CmlDomainComponentApi
        public CmlEventsController getCmlEventsController() {
            return this.cmlEventsControllerProvider.get();
        }

        private CmlDomainComponentImpl() {
            this.cmlDomainComponentImpl = this;
            initialize();
        }
    }

    private static final class Factory implements CmlDomainComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        private Factory() {
        }

        @Override // ru.ozon.app.android.cml.domain.di.CmlDomainComponent.Factory
        public CmlDomainComponent create() {
            return new CmlDomainComponentImpl(0);
        }
    }

    public static CmlDomainComponent.Factory factory() {
        return new Factory(0);
    }
}
