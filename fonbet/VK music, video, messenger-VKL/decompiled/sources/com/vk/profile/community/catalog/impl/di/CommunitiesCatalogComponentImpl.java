package com.vk.profile.community.catalog.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.profile.community.catalog.api.di.CommunitiesCatalogComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.gog;
import xsna.i13;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: CommunitiesCatalogComponentImpl.kt */
/* loaded from: classes5.dex */
public final class CommunitiesCatalogComponentImpl implements CommunitiesCatalogComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new i13(9));

    /* compiled from: CommunitiesCatalogComponentImpl.kt */
    public static final class a implements c8m<CommunitiesCatalogComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new CommunitiesCatalogComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CommunitiesCatalogComponentImpl.class, "router", "getRouter()Lcom/vk/profile/community/catalog/api/router/CommunitiesCatalogRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.profile.community.catalog.api.di.CommunitiesCatalogComponent
    public final gog a() {
        qcy<Object> qcyVar = b[0];
        return (gog) this.a.c();
    }
}
