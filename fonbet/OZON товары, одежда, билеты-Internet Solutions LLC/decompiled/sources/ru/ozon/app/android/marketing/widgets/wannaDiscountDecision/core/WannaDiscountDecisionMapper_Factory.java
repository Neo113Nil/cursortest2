package ru.ozon.app.android.marketing.widgets.wannaDiscountDecision.core;

import Jb.e;

/* loaded from: classes12.dex */
public final class WannaDiscountDecisionMapper_Factory implements e<WannaDiscountDecisionMapper> {

    private static final class InstanceHolder {
        private static final WannaDiscountDecisionMapper_Factory INSTANCE = new WannaDiscountDecisionMapper_Factory();
    }

    public static WannaDiscountDecisionMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static WannaDiscountDecisionMapper newInstance() {
        return new WannaDiscountDecisionMapper();
    }

    @Override // Pc.a
    public WannaDiscountDecisionMapper get() {
        return newInstance();
    }
}
