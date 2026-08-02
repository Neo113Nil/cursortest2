package com.vk.managed_groups.impl;

import com.vk.di.component.DiScopedComponent;
import com.vk.managed_groups.api.ManagedGroupsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.cty;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.gi00;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.se0;
import xsna.vi00;

/* compiled from: ManagedGroupsComponentImpl.kt */
/* loaded from: classes3.dex */
public final class ManagedGroupsComponentImpl implements ManagedGroupsComponent {
    public static final /* synthetic */ qcy<Object>[] d = {new PropertyReference1Impl(ManagedGroupsComponentImpl.class, "managedGroupsRouter", "getManagedGroupsRouter()Lcom/vk/managed_groups/api/ManagedGroupsRouter;", 0), fp.c(0, ManagedGroupsComponentImpl.class, "managedGroupsCountersObserver", "getManagedGroupsCountersObserver()Lcom/vk/managed_groups/api/events/ManagedGroupsCountersObserver;", fpf0.a)};
    public final ManagedGroupsInnerComponent a;
    public final ewy b = new ewy(new se0(21));
    public final nwy c = new nwy(new cty(this, 3));

    /* compiled from: ManagedGroupsComponentImpl.kt */
    public static final class a implements c8m<ManagedGroupsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ManagedGroupsComponentImpl((ManagedGroupsInnerComponent) g8mVar.a(fpf0.a(ManagedGroupsInnerComponent.class)));
        }
    }

    public ManagedGroupsComponentImpl(ManagedGroupsInnerComponent managedGroupsInnerComponent) {
        this.a = managedGroupsInnerComponent;
    }

    @Override // com.vk.managed_groups.api.ManagedGroupsComponent
    public final gi00 Ge() {
        qcy<Object> qcyVar = d[1];
        return (gi00) this.c.c();
    }

    @Override // com.vk.managed_groups.api.ManagedGroupsComponent
    public final vi00 g1() {
        qcy<Object> qcyVar = d[0];
        return (vi00) this.b.c();
    }
}
