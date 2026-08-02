package com.vk.superapp.vkclient.js.bridge.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.vkclient.js.bridge.api.di.JsVkclientDelegateComponent;
import com.vk.superapp.vkclient.js.bridge.api.di.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.iy2;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: JsVkclientDelegateComponentImpl.kt */
/* loaded from: classes6.dex */
public final class JsVkclientDelegateComponentImpl implements JsVkclientDelegateComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new iy2(24));

    /* compiled from: JsVkclientDelegateComponentImpl.kt */
    public static final class a implements c8m<JsVkclientDelegateComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new JsVkclientDelegateComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(JsVkclientDelegateComponentImpl.class, "jsVkclientDelegateFactory", "getJsVkclientDelegateFactory()Lcom/vk/superapp/vkclient/js/bridge/api/di/JsVkclientDelegateFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.superapp.vkclient.js.bridge.api.di.JsVkclientDelegateComponent
    public final b v4() {
        qcy<Object> qcyVar = b[0];
        return (b) this.a.c();
    }
}
