package com.vk.com.vk.donut.popup.impl.di;

import com.vk.com.vk.donut.popup.api.di.DonutPopupComponent;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.aq0;
import xsna.c8m;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.h1o;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: DonutPopupComponentImpl.kt */
/* loaded from: classes.dex */
public final class DonutPopupComponentImpl implements DonutPopupComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new aq0(2));

    /* compiled from: DonutPopupComponentImpl.kt */
    public static final class a implements c8m<DonutPopupComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new DonutPopupComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(DonutPopupComponentImpl.class, "router", "getRouter()Lcom/vk/com/vk/donut/popup/api/router/DonutPopupRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.com.vk.donut.popup.api.di.DonutPopupComponent
    public final h1o a() {
        qcy<Object> qcyVar = b[0];
        return (h1o) this.a.c();
    }
}
