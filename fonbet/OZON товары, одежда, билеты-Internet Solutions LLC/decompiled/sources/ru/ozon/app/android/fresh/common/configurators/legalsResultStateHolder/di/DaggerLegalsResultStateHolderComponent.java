package ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.LegalsResultStateHolder;
import ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.LegalsResultStateHolderImpl;
import ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.LegalsResultStateHolderImpl_Factory;
import ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.LegalsResultStateHolderImpl_MainThreadChecker_Factory;
import ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.di.LegalsResultStateHolderComponent;

/* loaded from: classes6.dex */
public final class DaggerLegalsResultStateHolderComponent {

    private static final class Factory implements LegalsResultStateHolderComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.di.LegalsResultStateHolderComponent.Factory
        public LegalsResultStateHolderComponent create() {
            return new LegalsResultStateHolderComponentImpl(0);
        }

        private Factory() {
        }
    }

    private static final class LegalsResultStateHolderComponentImpl implements LegalsResultStateHolderComponent {
        private a<LegalsResultStateHolder> bindLegalsResultStateHolderProvider;
        private final LegalsResultStateHolderComponentImpl legalsResultStateHolderComponentImpl;
        private a<LegalsResultStateHolderImpl> legalsResultStateHolderImplProvider;

        /* synthetic */ LegalsResultStateHolderComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            LegalsResultStateHolderImpl_Factory create = LegalsResultStateHolderImpl_Factory.create(LegalsResultStateHolderImpl_MainThreadChecker_Factory.create());
            this.legalsResultStateHolderImplProvider = create;
            this.bindLegalsResultStateHolderProvider = d.b(create);
        }

        @Override // ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.di.LegalsResultStateHolderComponentApi
        public LegalsResultStateHolder getLegalsResultStateHolder() {
            return this.bindLegalsResultStateHolderProvider.get();
        }

        private LegalsResultStateHolderComponentImpl() {
            this.legalsResultStateHolderComponentImpl = this;
            initialize();
        }
    }

    public static LegalsResultStateHolderComponent.Factory factory() {
        return new Factory(0);
    }
}
