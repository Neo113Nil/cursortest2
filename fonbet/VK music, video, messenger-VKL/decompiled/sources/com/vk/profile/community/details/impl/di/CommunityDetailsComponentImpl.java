package com.vk.profile.community.details.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.profile.community.details.api.di.CommunityDetailsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.m03;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.w1h;
import xsna.x1h;

/* compiled from: CommunityDetailsComponentImpl.kt */
/* loaded from: classes.dex */
public final class CommunityDetailsComponentImpl implements CommunityDetailsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new m03(1));

    /* compiled from: CommunityDetailsComponentImpl.kt */
    public static final class a implements c8m<CommunityDetailsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new CommunityDetailsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CommunityDetailsComponentImpl.class, "router", "getRouter()Lcom/vk/profile/community/details/impl/router/CommunityDetailsRouterImpl;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.profile.community.details.api.di.CommunityDetailsComponent
    public final w1h a() {
        qcy<Object> qcyVar = b[0];
        return (x1h) this.a.c();
    }
}
