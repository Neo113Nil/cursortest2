package com.vk.donut.video.subscription.impl.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.donut.video.subscription.api.di.DonutSubscriptionVideoComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b3o;
import xsna.c8m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.g3o;
import xsna.g8m;
import xsna.gb3;
import xsna.hpf0;
import xsna.mu2;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: DonutSubscriptionVideoComponentImpl.kt */
/* loaded from: classes.dex */
public final class DonutSubscriptionVideoComponentImpl implements DonutSubscriptionVideoComponent {
    public static final /* synthetic */ qcy<Object>[] f;
    public final AppContextDiComponent a;
    public final AuthBridgeComponent b;
    public final nwy c = new nwy(new mu2(this, 1));
    public final nwy d = new nwy(new gb3(this, 1));
    public final nwy e = new nwy(new g3o(this, 0));

    /* compiled from: DonutSubscriptionVideoComponentImpl.kt */
    public static final class a implements c8m<DonutSubscriptionVideoComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new DonutSubscriptionVideoComponentImpl((AppContextDiComponent) g8mVar.a(fpf0.a(AppContextDiComponent.class)), (AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(DonutSubscriptionVideoComponentImpl.class, "subscriptionManager", "getSubscriptionManager()Lcom/vk/donut/video/subscription/api/DonutSubscriptionManager;", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, DonutSubscriptionVideoComponentImpl.class, "db", "getDb()Lcom/vk/donut/video/subscription/impl/data/db/CachedSubscriptionsDb;", hpf0Var), ep.a(0, DonutSubscriptionVideoComponentImpl.class, "subscriptionDao", "getSubscriptionDao()Lcom/vk/donut/video/subscription/impl/data/db/SubscriptionDao;", hpf0Var)};
    }

    public DonutSubscriptionVideoComponentImpl(AppContextDiComponent appContextDiComponent, AuthBridgeComponent authBridgeComponent) {
        this.a = appContextDiComponent;
        this.b = authBridgeComponent;
    }

    @Override // com.vk.donut.video.subscription.api.di.DonutSubscriptionVideoComponent
    public final b3o c5() {
        qcy<Object> qcyVar = f[0];
        return (b3o) this.c.c();
    }
}
