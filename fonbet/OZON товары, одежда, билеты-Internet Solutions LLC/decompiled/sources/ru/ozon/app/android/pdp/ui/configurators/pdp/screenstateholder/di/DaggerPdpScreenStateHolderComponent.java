package ru.ozon.app.android.pdp.ui.configurators.pdp.screenstateholder.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.pdp.ui.configurators.pdp.screenstateholder.DefaultPdpScreenStateHolder;
import ru.ozon.app.android.pdp.ui.configurators.pdp.screenstateholder.PdpScreenStateHolder$CacheState;
import ru.ozon.app.android.pdp.ui.configurators.pdp.screenstateholder.PdpScreenStateHolder$State;
import ru.ozon.app.android.pdp.ui.configurators.pdp.screenstateholder.di.PdpScreenStateHolderComponent;

/* loaded from: classes6.dex */
public final class DaggerPdpScreenStateHolderComponent {

    private static final class Factory implements PdpScreenStateHolderComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        private Factory() {
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.screenstateholder.di.PdpScreenStateHolderComponent.Factory
        public PdpScreenStateHolderComponent create() {
            return new PdpScreenStateHolderComponentImpl(0);
        }
    }

    private static final class PdpScreenStateHolderComponentImpl implements PdpScreenStateHolderComponent {
        private a<DefaultPdpScreenStateHolder> defaultPdpScreenStateHolderProvider;
        private final PdpScreenStateHolderComponentImpl pdpScreenStateHolderComponentImpl;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f93028id;
            private final PdpScreenStateHolderComponentImpl pdpScreenStateHolderComponentImpl;

            SwitchingProvider(PdpScreenStateHolderComponentImpl pdpScreenStateHolderComponentImpl, int i11) {
                this.pdpScreenStateHolderComponentImpl = pdpScreenStateHolderComponentImpl;
                this.f93028id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f93028id == 0) {
                    return (T) new DefaultPdpScreenStateHolder();
                }
                throw new AssertionError(this.f93028id);
            }
        }

        /* synthetic */ PdpScreenStateHolderComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            this.defaultPdpScreenStateHolderProvider = d.b(new SwitchingProvider(this.pdpScreenStateHolderComponentImpl, 0));
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.screenstateholder.di.PdpScreenStateHolderComponentApi
        public PdpScreenStateHolder$CacheState pdpScreenStateHolderCacheState() {
            return this.defaultPdpScreenStateHolderProvider.get();
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.screenstateholder.di.PdpScreenStateHolderComponentApi
        public PdpScreenStateHolder$State pdpScreenStateHolderCurrentState() {
            return this.defaultPdpScreenStateHolderProvider.get();
        }

        private PdpScreenStateHolderComponentImpl() {
            this.pdpScreenStateHolderComponentImpl = this;
            initialize();
        }
    }

    public static PdpScreenStateHolderComponent.Factory factory() {
        return new Factory(0);
    }
}
