package com.vk.friends.impl.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.friends.api.di.FeedFriendsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.ep;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.gqs;
import xsna.hpf0;
import xsna.nh;
import xsna.q3s;
import xsna.qcy;
import xsna.rns;
import xsna.sje;
import xsna.z3i;

/* compiled from: FeedFriendsComponentImpl.kt */
/* loaded from: classes15.dex */
public final class FeedFriendsComponentImpl implements FeedFriendsComponent {
    public static final /* synthetic */ qcy<Object>[] f;
    public final BridgeComponent a;
    public final AuthBridgeComponent b;
    public final ewy c = new ewy(new sje(this, 27));
    public final ewy d = new ewy(new nh(10));
    public final ewy e = new ewy(new z3i(this, 12));

    /* compiled from: FeedFriendsComponentImpl.kt */
    public static final class a implements b7m<FeedFriendsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new FeedFriendsComponentImpl((BridgeComponent) e7mVar.a(fpf0.a(BridgeComponent.class)), (AuthBridgeComponent) e7mVar.a(fpf0.a(AuthBridgeComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(FeedFriendsComponentImpl.class, "followersListRouter", "getFollowersListRouter()Lcom/vk/friends/api/FollowersListRouter;", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, FeedFriendsComponentImpl.class, "friendsListFragmentFactory", "getFriendsListFragmentFactory()Lcom/vk/friends/api/presentation/FriendsListFragmentFactory;", hpf0Var), ep.a(0, FeedFriendsComponentImpl.class, "friendsCleanupRouter", "getFriendsCleanupRouter()Lcom/vk/friends/api/FriendsCleanupRouter;", hpf0Var)};
    }

    public FeedFriendsComponentImpl(BridgeComponent bridgeComponent, AuthBridgeComponent authBridgeComponent) {
        this.a = bridgeComponent;
        this.b = authBridgeComponent;
    }

    @Override // com.vk.friends.api.di.FeedFriendsComponent
    public final rns A6() {
        qcy<Object> qcyVar = f[2];
        return (rns) this.e.c();
    }

    @Override // com.vk.friends.api.di.FeedFriendsComponent
    public final q3s q7() {
        qcy<Object> qcyVar = f[0];
        return (q3s) this.c.c();
    }

    @Override // com.vk.friends.api.di.FeedFriendsComponent
    public final gqs r6() {
        qcy<Object> qcyVar = f[1];
        return (gqs) this.d.c();
    }
}
