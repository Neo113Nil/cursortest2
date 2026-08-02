package com.vk.managed_groups.impl;

import com.vk.di.component.DiScopedComponent;
import com.vk.queue.di.QueueSyncComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.hvz;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: ManagedGroupsInnerComponent.kt */
/* loaded from: classes3.dex */
public final class ManagedGroupsInnerComponent implements DiScopedComponent<pwj0> {
    public static final /* synthetic */ qcy<Object>[] c;
    public final QueueSyncComponent a;
    public final nwy b = new nwy(new hvz(this, 1));

    /* compiled from: ManagedGroupsInnerComponent.kt */
    public static final class a implements c8m<ManagedGroupsInnerComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ManagedGroupsInnerComponent((QueueSyncComponent) g8mVar.a(fpf0.a(QueueSyncComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ManagedGroupsInnerComponent.class, "eventsObserver", "getEventsObserver$impl_release()Lcom/vk/managed_groups/impl/events/ManagedGroupsEventsProvider;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public ManagedGroupsInnerComponent(QueueSyncComponent queueSyncComponent) {
        this.a = queueSyncComponent;
    }
}
