package com.vk.profile.community.subscription.impl.di;

import com.vk.bridges.di.BridgeComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.profile.community.subscription.api.di.CommunitySubscriptionComponent;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.c3i;
import xsna.c7h;
import xsna.e7m;
import xsna.eg1;
import xsna.ep;
import xsna.fg1;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.nwy;
import xsna.o6h;
import xsna.q34;
import xsna.qcy;
import xsna.s2b;
import xsna.uz;
import xsna.x0;
import xsna.y2i;

/* compiled from: CommunitySubscriptionComponentImpl.kt */
/* loaded from: classes5.dex */
public final class CommunitySubscriptionComponentImpl implements CommunitySubscriptionComponent {
    public static final /* synthetic */ qcy<Object>[] e;
    public final nwy a;
    public final nwy b;
    public final nwy c;
    public final nwy d;

    /* compiled from: CommunitySubscriptionComponentImpl.kt */
    public static final class a implements b7m<CommunitySubscriptionComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new CommunitySubscriptionComponentImpl((AppContextDiComponent) e7mVar.a(fpf0.a(AppContextDiComponent.class)), (BridgeComponent) e7mVar.a(fpf0.a(BridgeComponent.class)), (DataRepositoryComponent) e7mVar.a(fpf0.a(DataRepositoryComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CommunitySubscriptionComponentImpl.class, "joinDelegate", "getJoinDelegate()Lcom/vk/profile/community/subscription/api/delegates/CommunityJoinDelegate;", 0);
        hpf0 hpf0Var = fpf0.a;
        e = new qcy[]{propertyReference1Impl, fp.c(0, CommunitySubscriptionComponentImpl.class, "leaveDelegate", "getLeaveDelegate()Lcom/vk/profile/community/subscription/api/delegates/CommunityLeaveDelegate;", hpf0Var), ep.a(0, CommunitySubscriptionComponentImpl.class, "joinDelegateFactory", "getJoinDelegateFactory()Lcom/vk/profile/community/subscription/api/delegates/CommunityJoinDelegateFactory;", hpf0Var), ep.a(0, CommunitySubscriptionComponentImpl.class, "leaveDelegateFactory", "getLeaveDelegateFactory()Lcom/vk/profile/community/subscription/api/delegates/CommunityLeaveDelegateFactory;", hpf0Var), ep.a(0, CommunitySubscriptionComponentImpl.class, "subscriptionTrackerFactory", "getSubscriptionTrackerFactory()Lcom/vk/profile/community/subscription/api/tracker/CommunitySubscriptionTrackerFactory;", hpf0Var), ep.a(0, CommunitySubscriptionComponentImpl.class, "router", "getRouter()Lcom/vk/profile/community/subscription/api/router/CommunitySubscriptionRouter;", hpf0Var)};
    }

    public CommunitySubscriptionComponentImpl(AppContextDiComponent appContextDiComponent, BridgeComponent bridgeComponent, DataRepositoryComponent dataRepositoryComponent) {
        new nwy(new s2b(appContextDiComponent, bridgeComponent, dataRepositoryComponent, 3));
        new nwy(new q34(appContextDiComponent, bridgeComponent, dataRepositoryComponent, 3));
        this.a = new nwy(new eg1(5, bridgeComponent, dataRepositoryComponent));
        this.b = new nwy(new fg1(7, bridgeComponent, dataRepositoryComponent));
        this.c = new nwy(new x0(8));
        this.d = new nwy(new uz(9));
    }

    @Override // com.vk.profile.community.subscription.api.di.CommunitySubscriptionComponent
    public final c7h D6() {
        qcy<Object> qcyVar = e[3];
        return (c7h) this.b.c();
    }

    @Override // com.vk.profile.community.subscription.api.di.CommunitySubscriptionComponent
    public final o6h E5() {
        qcy<Object> qcyVar = e[2];
        return (o6h) this.a.c();
    }

    @Override // com.vk.profile.community.subscription.api.di.CommunitySubscriptionComponent
    public final y2i a() {
        qcy<Object> qcyVar = e[5];
        return (y2i) this.d.c();
    }

    @Override // com.vk.profile.community.subscription.api.di.CommunitySubscriptionComponent
    public final c3i c7() {
        qcy<Object> qcyVar = e[4];
        return (c3i) this.c.c();
    }
}
