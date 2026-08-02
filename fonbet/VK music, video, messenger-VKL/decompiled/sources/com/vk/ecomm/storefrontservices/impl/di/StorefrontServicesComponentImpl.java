package com.vk.ecomm.storefrontservices.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.ecomm.storefrontservices.api.StorefrontServicesComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.la0;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: StorefrontServicesComponentImpl.kt */
/* loaded from: classes18.dex */
public final class StorefrontServicesComponentImpl implements StorefrontServicesComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new la0(22));

    /* compiled from: StorefrontServicesComponentImpl.kt */
    public static final class a implements c8m<StorefrontServicesComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new StorefrontServicesComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(StorefrontServicesComponentImpl.class, "router", "getRouter()Lcom/vk/ecomm/storefrontservices/api/StorefrontServicesRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.ecomm.storefrontservices.api.StorefrontServicesComponent
    public final com.vk.ecomm.storefrontservices.api.a a() {
        qcy<Object> qcyVar = b[0];
        return (com.vk.ecomm.storefrontservices.api.a) this.a.c();
    }
}
