package com.vk.queue.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import kotlin.Lazy;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bky;
import xsna.bpn0;
import xsna.c8m;
import xsna.ep;
import xsna.ese0;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hpf0;
import xsna.iw00;
import xsna.ns;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.uy2;
import xsna.vre0;
import xsna.yre0;

/* compiled from: QueueSyncComponentImpl.kt */
/* loaded from: classes.dex */
public final class QueueSyncComponentImpl implements QueueSyncComponent {
    public static final /* synthetic */ qcy<Object>[] f;
    public final Lazy<ese0> a;
    public final SessionManagementComponent b;
    public final nwy c = new nwy(new bky(this, 5));
    public final nwy d = new nwy(new iw00(this, 4));
    public final nwy e = new nwy(new uy2(this, 7));

    /* compiled from: QueueSyncComponentImpl.kt */
    public static final class a implements c8m<QueueSyncComponent, pwj0> {
        public final Lazy<ese0> a;

        public a(bpn0 bpn0Var) {
            this.a = bpn0Var;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new QueueSyncComponentImpl(this.a, (SessionManagementComponent) g8mVar.a(fpf0.a(SessionManagementComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(QueueSyncComponentImpl.class, "queueSyncManager", "getQueueSyncManager()Lcom/vk/queue/QueueSyncManager;", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, QueueSyncComponentImpl.class, "accountSettingsQueue", "getAccountSettingsQueue()Lcom/vk/queue/AccountSettingsQueue;", hpf0Var), ep.a(0, QueueSyncComponentImpl.class, "queueSyncHolder", "getQueueSyncHolder()Lcom/vk/queue/holder/QueueSyncManagerHolder;", hpf0Var)};
    }

    public QueueSyncComponentImpl(Lazy<ese0> lazy, SessionManagementComponent sessionManagementComponent) {
        this.a = lazy;
        this.b = sessionManagementComponent;
    }

    @Override // com.vk.queue.di.QueueSyncComponent
    public final yre0 H4() {
        qcy<Object> qcyVar = f[2];
        return (yre0) this.e.c();
    }

    @Override // com.vk.queue.di.QueueSyncComponent
    public final vre0 i0() {
        qcy<Object> qcyVar = f[0];
        return (vre0) this.c.c();
    }

    @Override // com.vk.queue.di.QueueSyncComponent
    public final ns o1() {
        qcy<Object> qcyVar = f[1];
        return (ns) this.d.c();
    }
}
