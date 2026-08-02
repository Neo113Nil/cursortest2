package com.vk.voip.calls.join.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.voip.calls.join.api.di.VoipCallsJoinRouterComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.eul0;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.tkw0;

/* compiled from: VoipCallsJoinRouterComponentImpl.kt */
/* loaded from: classes7.dex */
public final class VoipCallsJoinRouterComponentImpl implements VoipCallsJoinRouterComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new eul0(11));

    /* compiled from: VoipCallsJoinRouterComponentImpl.kt */
    public static final class a implements c8m<VoipCallsJoinRouterComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VoipCallsJoinRouterComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VoipCallsJoinRouterComponentImpl.class, "router", "getRouter()Lcom/vk/voip/calls/join/api/presentation/router/VoipCallsJoinRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.voip.calls.join.api.di.VoipCallsJoinRouterComponent
    public final tkw0 a() {
        qcy<Object> qcyVar = b[0];
        return (tkw0) this.a.c();
    }
}
