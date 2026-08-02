package com.vk.subscription.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.subscription.api.di.SubscriptionComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a8j0;
import xsna.b7m;
import xsna.cwg0;
import xsna.e4h;
import xsna.e7m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.nwy;
import xsna.qcy;
import xsna.sqf0;
import xsna.w5k0;
import xsna.zvm0;

/* compiled from: SubscriptionComponentImpl.kt */
/* loaded from: classes6.dex */
public final class SubscriptionComponentImpl implements SubscriptionComponent {
    public static final /* synthetic */ qcy<Object>[] d;
    public final nwy a;
    public final nwy b;
    public final nwy c;

    /* compiled from: SubscriptionComponentImpl.kt */
    public static final class a implements b7m<SubscriptionComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new SubscriptionComponentImpl(0);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SubscriptionComponentImpl.class, "friendsEventsBus", "getFriendsEventsBus()Lcom/vk/subscription/api/RxUserFriendsEventsBus;", 0);
        hpf0 hpf0Var = fpf0.a;
        d = new qcy[]{propertyReference1Impl, fp.c(0, SubscriptionComponentImpl.class, "subscribeHelper", "getSubscribeHelper()Lcom/vk/subscription/api/SubscribeHelper;", hpf0Var), ep.a(0, SubscriptionComponentImpl.class, "communityHelper", "getCommunityHelper()Lcom/vk/subscription/api/CommunityHelper;", hpf0Var)};
    }

    public /* synthetic */ SubscriptionComponentImpl(int i) {
        this();
    }

    @Override // com.vk.subscription.api.di.SubscriptionComponent
    public final zvm0 T() {
        qcy<Object> qcyVar = d[1];
        return (zvm0) this.b.c();
    }

    @Override // com.vk.subscription.api.di.SubscriptionComponent
    public final cwg0 X1() {
        qcy<Object> qcyVar = d[0];
        return (cwg0) this.a.c();
    }

    @Override // com.vk.subscription.api.di.SubscriptionComponent
    public final e4h h0() {
        qcy<Object> qcyVar = d[2];
        return (e4h) this.c.c();
    }

    private SubscriptionComponentImpl() {
        this.a = new nwy(new w5k0(2));
        this.b = new nwy(new a8j0(4));
        this.c = new nwy(new sqf0(5));
    }
}
