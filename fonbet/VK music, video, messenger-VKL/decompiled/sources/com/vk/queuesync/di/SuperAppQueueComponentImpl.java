package com.vk.queuesync.di;

import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.tan0;
import xsna.u3c0;
import xsna.uan0;

/* compiled from: SuperAppQueueComponentImpl.kt */
/* loaded from: classes5.dex */
public final class SuperAppQueueComponentImpl implements SuperAppQueueComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new u3c0(2));

    /* compiled from: SuperAppQueueComponentImpl.kt */
    public static final class a implements c8m<SuperAppQueueComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new SuperAppQueueComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SuperAppQueueComponentImpl.class, "superAppQueueManager", "getSuperAppQueueManager()Lcom/vk/queuesync/sync/SuperAppQueueManagerImpl;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.queuesync.di.SuperAppQueueComponent
    public final tan0 X4() {
        qcy<Object> qcyVar = b[0];
        return (uan0) this.a.c();
    }
}
