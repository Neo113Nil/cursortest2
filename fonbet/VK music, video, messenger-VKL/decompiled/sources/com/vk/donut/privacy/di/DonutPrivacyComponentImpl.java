package com.vk.donut.privacy.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.donut.privacy.api.di.DonutPrivacyComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bv0;
import xsna.c8m;
import xsna.d2o;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: DonutPrivacyComponentImpl.kt */
/* loaded from: classes18.dex */
public final class DonutPrivacyComponentImpl implements DonutPrivacyComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new bv0(16));

    /* compiled from: DonutPrivacyComponentImpl.kt */
    public static final class a implements c8m<DonutPrivacyComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new DonutPrivacyComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(DonutPrivacyComponentImpl.class, "router", "getRouter()Lcom/vk/donut/privacy/api/router/DonutPrivacyRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.donut.privacy.api.di.DonutPrivacyComponent
    public final d2o a() {
        qcy<Object> qcyVar = b[0];
        return (d2o) this.a.c();
    }
}
