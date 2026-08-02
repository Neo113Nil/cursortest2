package com.vk.profile.community.address.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.profile.community.address.api.di.CommunityAddressComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.wa3;
import xsna.xqg;
import xsna.yqg;

/* compiled from: CommunityAddressComponentImpl.kt */
/* loaded from: classes.dex */
public final class CommunityAddressComponentImpl implements CommunityAddressComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a;

    /* compiled from: CommunityAddressComponentImpl.kt */
    public static final class a implements c8m<CommunityAddressComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new CommunityAddressComponentImpl(0);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CommunityAddressComponentImpl.class, "router", "getRouter()Lcom/vk/profile/community/address/impl/router/CommunityAddressRouterImpl;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    public /* synthetic */ CommunityAddressComponentImpl(int i) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.profile.community.address.api.di.CommunityAddressComponent
    public final xqg a() {
        qcy<Object> qcyVar = b[0];
        return (yqg) this.a.c();
    }

    private CommunityAddressComponentImpl() {
        this.a = new nwy(new wa3(3));
    }
}
