package com.vk.profile.community.api.component;

import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.d0i;
import xsna.d14;
import xsna.d2;
import xsna.f0i;
import xsna.fp;
import xsna.fpf0;
import xsna.nwy;
import xsna.qcy;
import xsna.u4h;
import xsna.w4h;

/* compiled from: CommunityComponentStub.kt */
/* loaded from: classes5.dex */
public final class CommunityComponentStub implements CommunityComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(CommunityComponentStub.class, "communityRouter", "getCommunityRouter()Lcom/vk/profile/community/api/router/CommunityRouterStub;", 0), fp.c(0, CommunityComponentStub.class, "communityInteractor", "getCommunityInteractor()Lcom/vk/profile/community/api/interactor/CommunityInteractorStub;", fpf0.a)};
    public final nwy a = new nwy(new d14(10));
    public final nwy b = new nwy(new d2(11));

    @Override // com.vk.profile.community.api.component.CommunityComponent
    public final Class<?> G0() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.profile.community.api.component.CommunityComponent
    public final u4h df() {
        qcy<Object> qcyVar = c[1];
        return (w4h) this.b.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.profile.community.api.component.CommunityComponent
    public final d0i ke() {
        qcy<Object> qcyVar = c[0];
        return (f0i) this.a.c();
    }
}
