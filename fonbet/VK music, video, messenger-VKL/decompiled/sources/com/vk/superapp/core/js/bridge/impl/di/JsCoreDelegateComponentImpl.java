package com.vk.superapp.core.js.bridge.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.core.js.bridge.api.di.JsCoreDelegateComponent;
import com.vk.superapp.core.js.bridge.api.di.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.pr6;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: JsCoreDelegateComponentImpl.kt */
/* loaded from: classes6.dex */
public final class JsCoreDelegateComponentImpl implements JsCoreDelegateComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new pr6(16));

    /* compiled from: JsCoreDelegateComponentImpl.kt */
    public static final class a implements c8m<JsCoreDelegateComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new JsCoreDelegateComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(JsCoreDelegateComponentImpl.class, "jsCoreDelegateFactory", "getJsCoreDelegateFactory()Lcom/vk/superapp/core/js/bridge/api/di/JsCoreDelegateFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.superapp.core.js.bridge.api.di.JsCoreDelegateComponent
    public final b na() {
        qcy<Object> qcyVar = b[0];
        return (b) this.a.c();
    }
}
