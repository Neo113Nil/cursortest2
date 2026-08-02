package com.vk.ecomm.shop_conditions.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.ecomm.shop_conditions.api.di.MarketShopConditionsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.jg0;
import xsna.me10;
import xsna.nwy;
import xsna.qcy;

/* compiled from: MarketShopConditionsComponentImpl.kt */
/* loaded from: classes18.dex */
public final class MarketShopConditionsComponentImpl implements MarketShopConditionsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new jg0(26));

    /* compiled from: MarketShopConditionsComponentImpl.kt */
    public static final class a implements b7m<MarketShopConditionsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MarketShopConditionsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MarketShopConditionsComponentImpl.class, "router", "getRouter()Lcom/vk/ecomm/shop_conditions/api/router/MarketShopConditionsRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.ecomm.shop_conditions.api.di.MarketShopConditionsComponent
    public final me10 a() {
        qcy<Object> qcyVar = b[0];
        return (me10) this.a.c();
    }
}
