package com.vk.ecomm.onlinebooking.impl.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.ecomm.onlinebooking.api.router.di.OnlineBookingComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.cp80;
import xsna.daz;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.pwj0;
import xsna.qcy;
import xsna.to80;
import xsna.xrj;

/* compiled from: OnlineBookingComponentImpl.kt */
/* loaded from: classes18.dex */
public final class OnlineBookingComponentImpl implements OnlineBookingComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(OnlineBookingComponentImpl.class, "onlineBookingRouter", "getOnlineBookingRouter()Lcom/vk/ecomm/onlinebooking/api/router/OnlineBookingRouter;", 0), fp.c(0, OnlineBookingComponentImpl.class, "analytics", "getAnalytics()Lcom/vk/ecomm/onlinebooking/api/router/OnlineBookingAnalytics;", fpf0.a)};
    public final ewy a = new ewy(new daz(7));
    public final ewy b;

    /* compiled from: OnlineBookingComponentImpl.kt */
    public static final class a implements c8m<OnlineBookingComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new OnlineBookingComponentImpl(new OnlineBookingInternalComponent((AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class))));
        }
    }

    public OnlineBookingComponentImpl(OnlineBookingInternalComponent onlineBookingInternalComponent) {
        this.b = new ewy(new xrj(onlineBookingInternalComponent, 27));
    }

    @Override // com.vk.ecomm.onlinebooking.api.router.di.OnlineBookingComponent
    public final cp80 M4() {
        qcy<Object> qcyVar = c[0];
        return (cp80) this.a.c();
    }

    @Override // com.vk.ecomm.onlinebooking.api.router.di.OnlineBookingComponent
    public final to80 d() {
        qcy<Object> qcyVar = c[1];
        return (to80) this.b.c();
    }
}
