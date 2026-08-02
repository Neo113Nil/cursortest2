package com.vk.superapp.miniapps.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.superapp.miniapps.api.di.SuperAppMiniAppsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.can0;
import xsna.e7m;
import xsna.ewy;
import xsna.fpf0;
import xsna.o2a0;
import xsna.qcy;

/* compiled from: SuperAppMiniAppsComponentImpl.kt */
/* loaded from: classes6.dex */
public final class SuperAppMiniAppsComponentImpl implements SuperAppMiniAppsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new o2a0(11));

    /* compiled from: SuperAppMiniAppsComponentImpl.kt */
    public static final class a implements b7m<SuperAppMiniAppsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new SuperAppMiniAppsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SuperAppMiniAppsComponentImpl.class, "router", "getRouter()Lcom/vk/superapp/miniapps/api/nav/SuperAppMiniAppsRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.superapp.miniapps.api.di.SuperAppMiniAppsComponent
    public final can0 a() {
        qcy<Object> qcyVar = b[0];
        return (can0) this.a.c();
    }
}
