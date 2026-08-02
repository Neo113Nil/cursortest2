package com.vk.network.eventhub.impl.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.network.eventhub.api.di.EventHubComponent;
import kotlin.Lazy;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bpn0;
import xsna.c8m;
import xsna.drg;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.gu0;
import xsna.h4;
import xsna.hpf0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.qzp;
import xsna.vzp;
import xsna.wqf;
import xsna.wzp;
import xsna.yzp;

/* compiled from: EventHubComponentImpl.kt */
/* loaded from: classes3.dex */
public final class EventHubComponentImpl implements EventHubComponent {
    public static final /* synthetic */ qcy<Object>[] e;
    public final nwy a;
    public final bpn0 c;
    public final nwy b = new nwy(new drg(this, 12));
    public final nwy d = new nwy(new gu0(14));

    /* compiled from: EventHubComponentImpl.kt */
    public static final class a implements c8m<EventHubComponent, pwj0> {
        public final Lazy<vzp> a;

        public a(bpn0 bpn0Var) {
            this.a = bpn0Var;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new EventHubComponentImpl(this.a, (AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(EventHubComponentImpl.class, "eventHubService", "getEventHubService()Lcom/vk/network/eventhub/api/EventHubService;", 0);
        hpf0 hpf0Var = fpf0.a;
        e = new qcy[]{propertyReference1Impl, fp.c(0, EventHubComponentImpl.class, "eventHubServiceRegistry", "getEventHubServiceRegistry()Lcom/vk/network/eventhub/api/EventHubServiceRegistry;", hpf0Var), ep.a(0, EventHubComponentImpl.class, "reporter", "getReporter()Lcom/vk/network/eventhub/api/EventHubServiceReporterUserSession;", hpf0Var)};
    }

    public EventHubComponentImpl(Lazy<vzp> lazy, AuthBridgeComponent authBridgeComponent) {
        this.a = new nwy(new h4(8, lazy, this));
        this.c = new bpn0(new wqf(authBridgeComponent, 17));
    }

    @Override // com.vk.network.eventhub.api.di.EventHubComponent
    public final wzp A5() {
        qcy<Object> qcyVar = e[1];
        return (wzp) this.b.c();
    }

    @Override // com.vk.network.eventhub.api.di.EventHubComponent
    public final qzp c9() {
        qcy<Object> qcyVar = e[0];
        return (qzp) this.a.c();
    }

    @Override // com.vk.network.eventhub.api.di.EventHubComponent
    public final yzp getReporter() {
        qcy<Object> qcyVar = e[2];
        return (yzp) this.d.c();
    }
}
