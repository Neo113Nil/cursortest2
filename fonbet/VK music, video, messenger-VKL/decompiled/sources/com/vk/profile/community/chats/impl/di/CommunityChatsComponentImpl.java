package com.vk.profile.community.chats.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.profile.community.chats.api.di.CommunityChatsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bb3;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.ivg;
import xsna.kvg;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: CommunityChatsComponentImpl.kt */
/* loaded from: classes.dex */
public final class CommunityChatsComponentImpl implements CommunityChatsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new bb3(2));

    /* compiled from: CommunityChatsComponentImpl.kt */
    public static final class a implements c8m<CommunityChatsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new CommunityChatsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CommunityChatsComponentImpl.class, "router", "getRouter()Lcom/vk/profile/community/chats/impl/router/CommunityChatsRouterImpl;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.profile.community.chats.api.di.CommunityChatsComponent
    public final ivg a() {
        qcy<Object> qcyVar = b[0];
        return (kvg) this.a.c();
    }
}
