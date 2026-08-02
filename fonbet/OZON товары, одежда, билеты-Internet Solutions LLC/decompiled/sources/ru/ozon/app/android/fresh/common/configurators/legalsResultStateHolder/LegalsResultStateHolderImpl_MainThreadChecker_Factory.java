package ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder;

import Jb.e;
import ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.LegalsResultStateHolderImpl;

/* loaded from: classes6.dex */
public final class LegalsResultStateHolderImpl_MainThreadChecker_Factory implements e<LegalsResultStateHolderImpl.MainThreadChecker> {

    private static final class InstanceHolder {
        private static final LegalsResultStateHolderImpl_MainThreadChecker_Factory INSTANCE = new LegalsResultStateHolderImpl_MainThreadChecker_Factory();
    }

    public static LegalsResultStateHolderImpl_MainThreadChecker_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LegalsResultStateHolderImpl.MainThreadChecker newInstance() {
        return new LegalsResultStateHolderImpl.MainThreadChecker();
    }

    @Override // Pc.a
    public LegalsResultStateHolderImpl.MainThreadChecker get() {
        return newInstance();
    }
}
