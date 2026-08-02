package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.api.WannaDiscountV2Api;

/* loaded from: classes12.dex */
public final class WannaDiscountV2Repository_Factory implements e<WannaDiscountV2Repository> {
    private final a<WannaDiscountV2Api> apiProvider;

    public WannaDiscountV2Repository_Factory(a<WannaDiscountV2Api> aVar) {
        this.apiProvider = aVar;
    }

    public static WannaDiscountV2Repository_Factory create(a<WannaDiscountV2Api> aVar) {
        return new WannaDiscountV2Repository_Factory(aVar);
    }

    public static WannaDiscountV2Repository newInstance(WannaDiscountV2Api wannaDiscountV2Api) {
        return new WannaDiscountV2Repository(wannaDiscountV2Api);
    }

    @Override // Pc.a
    public WannaDiscountV2Repository get() {
        return newInstance(this.apiProvider.get());
    }
}
