package com.vk.ecomm.storefront.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.ecomm.storefront.api.di.StorefrontComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.rml0;
import xsna.via;

/* compiled from: StorefrontComponentImpl.kt */
/* loaded from: classes.dex */
public final class StorefrontComponentImpl implements StorefrontComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new via(9));

    /* compiled from: StorefrontComponentImpl.kt */
    public static final class a implements c8m<StorefrontComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new StorefrontComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(StorefrontComponentImpl.class, "router", "getRouter()Lcom/vk/ecomm/storefront/api/router/StorefrontRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.ecomm.storefront.api.di.StorefrontComponent
    public final rml0 a() {
        qcy<Object> qcyVar = b[0];
        return (rml0) this.a.c();
    }
}
