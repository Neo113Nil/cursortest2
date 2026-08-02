package com.vk.music.subscription.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.music.subscription.api.di.MusicSubscriptionComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bpn0;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.g950;
import xsna.jb3;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.rxv;
import xsna.t350;

/* compiled from: MusicSubscriptionComponentImpl.kt */
/* loaded from: classes.dex */
public final class MusicSubscriptionComponentImpl implements MusicSubscriptionComponent {
    public static final /* synthetic */ qcy<Object>[] e;
    public final bpn0 a;
    public final t350 b;
    public final bpn0 c;
    public final nwy d = new nwy(new rxv(this, 2));

    /* compiled from: MusicSubscriptionComponentImpl.kt */
    public static final class a implements c8m<MusicSubscriptionComponent, pwj0> {
        public final bpn0 a;
        public final t350 b;

        public a(bpn0 bpn0Var, t350 t350Var) {
            this.a = bpn0Var;
            this.b = t350Var;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new MusicSubscriptionComponentImpl(this.a, this.b, new bpn0(new jb3(g8mVar, 3)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MusicSubscriptionComponentImpl.class, "subscriptionProvider", "getSubscriptionProvider()Lcom/vk/music/subscription/api/MusicSubscriptionProvider;", 0);
        fpf0.a.getClass();
        e = new qcy[]{propertyReference1Impl};
    }

    public MusicSubscriptionComponentImpl(bpn0 bpn0Var, t350 t350Var, bpn0 bpn0Var2) {
        this.a = bpn0Var;
        this.b = t350Var;
        this.c = bpn0Var2;
    }

    @Override // com.vk.music.subscription.api.di.MusicSubscriptionComponent
    public final g950 q1() {
        qcy<Object> qcyVar = e[0];
        return (g950) this.d.c();
    }
}
