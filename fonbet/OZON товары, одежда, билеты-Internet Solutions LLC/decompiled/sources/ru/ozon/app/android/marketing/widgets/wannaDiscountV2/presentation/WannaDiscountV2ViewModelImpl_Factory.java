package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.WannaDiscountV2Repository;

/* loaded from: classes12.dex */
public final class WannaDiscountV2ViewModelImpl_Factory implements e<WannaDiscountV2ViewModelImpl> {
    private final a<WannaDiscountV2Repository> repositoryProvider;

    public WannaDiscountV2ViewModelImpl_Factory(a<WannaDiscountV2Repository> aVar) {
        this.repositoryProvider = aVar;
    }

    public static WannaDiscountV2ViewModelImpl_Factory create(a<WannaDiscountV2Repository> aVar) {
        return new WannaDiscountV2ViewModelImpl_Factory(aVar);
    }

    public static WannaDiscountV2ViewModelImpl newInstance(WannaDiscountV2Repository wannaDiscountV2Repository) {
        return new WannaDiscountV2ViewModelImpl(wannaDiscountV2Repository);
    }

    @Override // Pc.a
    public WannaDiscountV2ViewModelImpl get() {
        return newInstance(this.repositoryProvider.get());
    }
}
