package com.vk.ecomm.orders.impl;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.ewy;
import xsna.fpf0;
import xsna.fz5;
import xsna.g13;
import xsna.qcy;
import xsna.sw80;

/* compiled from: MarketOrdersInternalComponent.kt */
/* loaded from: classes18.dex */
public final class MarketOrdersInternalComponent implements DiUnscopedComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new g13(this));

    /* compiled from: MarketOrdersInternalComponent.kt */
    public static final class a implements b7m<MarketOrdersInternalComponent> {
        public final fz5 a;

        public a(fz5 fz5Var) {
            this.a = fz5Var;
        }

        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MarketOrdersInternalComponent(this.a);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MarketOrdersInternalComponent.class, "orderPaymentHandler", "getOrderPaymentHandler()Lcom/vk/ecomm/orders/impl/OrderPaymentHandler;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    public MarketOrdersInternalComponent(fz5 fz5Var) {
    }

    public final sw80 Df() {
        qcy<Object> qcyVar = b[0];
        return (sw80) this.a.c();
    }
}
