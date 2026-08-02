package com.vk.superapp.auth.js.bridge.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.auth.js.bridge.api.di.JsAuthDelegateComponent;
import com.vk.superapp.auth.js.bridge.api.di.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c6;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: JsAuthDelegateComponentImpl.kt */
/* loaded from: classes6.dex */
public final class JsAuthDelegateComponentImpl implements JsAuthDelegateComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new c6(14));

    /* compiled from: JsAuthDelegateComponentImpl.kt */
    public static final class a implements c8m<JsAuthDelegateComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new JsAuthDelegateComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(JsAuthDelegateComponentImpl.class, "jsAuthDelegateFactory", "getJsAuthDelegateFactory()Lcom/vk/superapp/auth/js/bridge/api/di/JsAuthDelegateFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.superapp.auth.js.bridge.api.di.JsAuthDelegateComponent
    public final b Hc() {
        qcy<Object> qcyVar = b[0];
        return (b) this.a.c();
    }
}
