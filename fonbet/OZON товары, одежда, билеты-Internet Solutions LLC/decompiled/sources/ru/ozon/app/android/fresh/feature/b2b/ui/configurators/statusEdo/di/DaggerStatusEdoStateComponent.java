package ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.StatusEdoState;
import ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.StatusEdoStateImpl;
import ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.di.StatusEdoStateComponent;

/* loaded from: classes6.dex */
public final class DaggerStatusEdoStateComponent {

    private static final class Factory implements StatusEdoStateComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.di.StatusEdoStateComponent.Factory
        public StatusEdoStateComponent create() {
            return new StatusEdoStateComponentImpl(0);
        }

        private Factory() {
        }
    }

    private static final class StatusEdoStateComponentImpl implements StatusEdoStateComponent {
        private a<StatusEdoState> bindStatusEdoStateProvider;
        private final StatusEdoStateComponentImpl statusEdoStateComponentImpl;
        private a<StatusEdoStateImpl> statusEdoStateImplProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92613id;
            private final StatusEdoStateComponentImpl statusEdoStateComponentImpl;

            SwitchingProvider(StatusEdoStateComponentImpl statusEdoStateComponentImpl, int i11) {
                this.statusEdoStateComponentImpl = statusEdoStateComponentImpl;
                this.f92613id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92613id == 0) {
                    return (T) new StatusEdoStateImpl();
                }
                throw new AssertionError(this.f92613id);
            }
        }

        /* synthetic */ StatusEdoStateComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.statusEdoStateComponentImpl, 0);
            this.statusEdoStateImplProvider = switchingProvider;
            this.bindStatusEdoStateProvider = d.b(switchingProvider);
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.di.StatusEdoStateComponentApi
        public StatusEdoState getStatusEdoState() {
            return this.bindStatusEdoStateProvider.get();
        }

        private StatusEdoStateComponentImpl() {
            this.statusEdoStateComponentImpl = this;
            initialize();
        }
    }

    public static StatusEdoStateComponent.Factory factory() {
        return new Factory(0);
    }
}
