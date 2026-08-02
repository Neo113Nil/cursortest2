package com.vk.profile.community.impl.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.profile.community.api.component.CommunityComponent;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ca;
import xsna.d0i;
import xsna.e0i;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.o6;
import xsna.pwj0;
import xsna.qcy;
import xsna.u4h;
import xsna.v4h;

/* compiled from: CommunityComponentImpl.kt */
/* loaded from: classes5.dex */
public final class CommunityComponentImpl implements CommunityComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(CommunityComponentImpl.class, "communityRouter", "getCommunityRouter()Lcom/vk/profile/community/impl/router/CommunityRouterImpl;", 0), fp.c(0, CommunityComponentImpl.class, "communityInteractor", "getCommunityInteractor()Lcom/vk/profile/community/impl/interactor/CommunityInteractorImpl;", fpf0.a)};
    public final nwy a = new nwy(new o6(10));
    public final nwy b;

    /* compiled from: CommunityComponentImpl.kt */
    public static final class a implements c8m<CommunityComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new CommunityComponentImpl((AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class)));
        }
    }

    public CommunityComponentImpl(AuthBridgeComponent authBridgeComponent) {
        this.b = new nwy(new ca(authBridgeComponent, 28));
    }

    @Override // com.vk.profile.community.api.component.CommunityComponent
    public final Class<?> G0() {
        return CommunityProfileFragment.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.profile.community.api.component.CommunityComponent
    public final u4h df() {
        qcy<Object> qcyVar = c[1];
        return (v4h) this.b.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.profile.community.api.component.CommunityComponent
    public final d0i ke() {
        qcy<Object> qcyVar = c[0];
        return (e0i) this.a.c();
    }
}
