package com.vk.ecomm.orders.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.ecomm.orders.api.di.MarketOrdersComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c13;
import xsna.c8m;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.hy80;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: MarketOrdersComponentImpl.kt */
/* loaded from: classes.dex */
public final class MarketOrdersComponentImpl implements MarketOrdersComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new c13(11));

    /* compiled from: MarketOrdersComponentImpl.kt */
    public static final class a implements c8m<MarketOrdersComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new MarketOrdersComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MarketOrdersComponentImpl.class, "ordersRouter", "getOrdersRouter()Lcom/vk/ecomm/orders/api/router/OrdersRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.ecomm.orders.api.di.MarketOrdersComponent
    public final hy80 S4() {
        qcy<Object> qcyVar = b[0];
        return (hy80) this.a.c();
    }
}
