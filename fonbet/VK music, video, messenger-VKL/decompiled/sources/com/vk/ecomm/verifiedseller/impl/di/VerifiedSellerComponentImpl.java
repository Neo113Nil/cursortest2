package com.vk.ecomm.verifiedseller.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.ecomm.verifiedseller.api.di.VerifiedSellerComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c24;
import xsna.c8m;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.s65;
import xsna.unr0;
import xsna.wnr0;

/* compiled from: VerifiedSellerComponentImpl.kt */
/* loaded from: classes.dex */
public final class VerifiedSellerComponentImpl implements VerifiedSellerComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(VerifiedSellerComponentImpl.class, "router", "getRouter()Lcom/vk/ecomm/verifiedseller/api/router/VerifiedSellerRouter;", 0), fp.c(0, VerifiedSellerComponentImpl.class, "analytics", "getAnalytics()Lcom/vk/ecomm/verifiedseller/api/analytics/VerifiedSellerAnalytics;", fpf0.a)};
    public final nwy a = new nwy(new s65(13));
    public final ewy b = new ewy(new c24(18));

    /* compiled from: VerifiedSellerComponentImpl.kt */
    public static final class a implements c8m<VerifiedSellerComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VerifiedSellerComponentImpl();
        }
    }

    @Override // com.vk.ecomm.verifiedseller.api.di.VerifiedSellerComponent
    public final wnr0 a() {
        qcy<Object> qcyVar = c[0];
        return (wnr0) this.a.c();
    }

    @Override // com.vk.ecomm.verifiedseller.api.di.VerifiedSellerComponent
    public final unr0 d() {
        qcy<Object> qcyVar = c[1];
        return (unr0) this.b.c();
    }
}
