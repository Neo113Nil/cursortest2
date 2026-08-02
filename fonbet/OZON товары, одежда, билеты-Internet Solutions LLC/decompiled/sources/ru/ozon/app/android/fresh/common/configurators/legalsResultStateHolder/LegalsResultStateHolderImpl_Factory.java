package ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.LegalsResultStateHolderImpl;

/* loaded from: classes6.dex */
public final class LegalsResultStateHolderImpl_Factory implements e<LegalsResultStateHolderImpl> {
    private final a<LegalsResultStateHolderImpl.MainThreadChecker> mainThreadCheckerProvider;

    public LegalsResultStateHolderImpl_Factory(a<LegalsResultStateHolderImpl.MainThreadChecker> aVar) {
        this.mainThreadCheckerProvider = aVar;
    }

    public static LegalsResultStateHolderImpl_Factory create(a<LegalsResultStateHolderImpl.MainThreadChecker> aVar) {
        return new LegalsResultStateHolderImpl_Factory(aVar);
    }

    public static LegalsResultStateHolderImpl newInstance(LegalsResultStateHolderImpl.MainThreadChecker mainThreadChecker) {
        return new LegalsResultStateHolderImpl(mainThreadChecker);
    }

    @Override // Pc.a
    public LegalsResultStateHolderImpl get() {
        return newInstance(this.mainThreadCheckerProvider.get());
    }
}
