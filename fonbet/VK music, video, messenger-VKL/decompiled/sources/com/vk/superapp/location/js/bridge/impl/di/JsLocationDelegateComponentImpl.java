package com.vk.superapp.location.js.bridge.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.location.js.bridge.api.di.JsLocationDelegateComponent;
import com.vk.superapp.location.js.bridge.api.di.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.cu1;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: JsLocationDelegateComponentImpl.kt */
/* loaded from: classes6.dex */
public final class JsLocationDelegateComponentImpl implements JsLocationDelegateComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new cu1(17));

    /* compiled from: JsLocationDelegateComponentImpl.kt */
    public static final class a implements c8m<JsLocationDelegateComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new JsLocationDelegateComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(JsLocationDelegateComponentImpl.class, "jsLocationDelegateFactory", "getJsLocationDelegateFactory()Lcom/vk/superapp/location/js/bridge/api/di/JsLocationDelegateFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.superapp.location.js.bridge.api.di.JsLocationDelegateComponent
    public final b k2() {
        qcy<Object> qcyVar = b[0];
        return (b) this.a.c();
    }
}
