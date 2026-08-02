package com.vk.network.eventhub.impl.di;

import com.vk.di.component.DiScopedWithParamsComponent;
import com.vk.network.eventhub.api.di.EventHubComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hzp;
import xsna.izp;
import xsna.jcg;
import xsna.l9i;
import xsna.nwy;
import xsna.o8m;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: EventHubApiComponent.kt */
/* loaded from: classes3.dex */
public final class EventHubApiComponent implements DiScopedWithParamsComponent<pwj0, hzp> {
    public static final /* synthetic */ qcy<Object>[] e = {new PropertyReference1Impl(EventHubApiComponent.class, "pendingRequestsRegistry", "getPendingRequestsRegistry()Lcom/vk/network/eventhub/impl/PendingRequestsRegistry;", 0), fp.c(0, EventHubApiComponent.class, "eventHubApiService", "getEventHubApiService()Lcom/vk/network/eventhub/apicalls/EventHubApiService;", fpf0.a)};
    public final EventHubComponent a;
    public final hzp b;
    public final nwy c = new nwy(new com.vk.movika.sdk.base.model.props.a(7));
    public final nwy d = new nwy(new jcg(this, 16));

    /* compiled from: EventHubApiComponent.kt */
    public static final class a implements o8m<EventHubApiComponent, pwj0, hzp> {
        @Override // xsna.o8m
        public final DiScopedWithParamsComponent a(l9i l9iVar, g8m g8mVar, pwj0 pwj0Var) {
            return new EventHubApiComponent((EventHubComponent) g8mVar.a(fpf0.a(EventHubComponent.class)), (hzp) l9iVar);
        }
    }

    public EventHubApiComponent(EventHubComponent eventHubComponent, hzp hzpVar) {
        this.a = eventHubComponent;
        this.b = hzpVar;
    }

    public final izp Df() {
        qcy<Object> qcyVar = e[1];
        return (izp) this.d.c();
    }
}
