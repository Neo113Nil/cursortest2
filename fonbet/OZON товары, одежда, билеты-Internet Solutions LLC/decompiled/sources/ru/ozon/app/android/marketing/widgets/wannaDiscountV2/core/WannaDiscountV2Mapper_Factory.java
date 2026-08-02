package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.core;

import Jb.e;

/* loaded from: classes12.dex */
public final class WannaDiscountV2Mapper_Factory implements e<WannaDiscountV2Mapper> {

    private static final class InstanceHolder {
        private static final WannaDiscountV2Mapper_Factory INSTANCE = new WannaDiscountV2Mapper_Factory();
    }

    public static WannaDiscountV2Mapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static WannaDiscountV2Mapper newInstance() {
        return new WannaDiscountV2Mapper();
    }

    @Override // Pc.a
    public WannaDiscountV2Mapper get() {
        return newInstance();
    }
}
