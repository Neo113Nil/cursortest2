package com.vk.superapp.permission.js.bridge.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.permission.js.bridge.api.di.JsPermissionDelegateComponent;
import com.vk.superapp.permission.js.bridge.api.di.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.pwj0;
import xsna.qcy;
import xsna.vv0;

/* compiled from: JsPermissionDelegateComponentImpl.kt */
/* loaded from: classes6.dex */
public final class JsPermissionDelegateComponentImpl implements JsPermissionDelegateComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new vv0(23));

    /* compiled from: JsPermissionDelegateComponentImpl.kt */
    public static final class a implements c8m<JsPermissionDelegateComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new JsPermissionDelegateComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(JsPermissionDelegateComponentImpl.class, "jsPermissionDelegateFactory", "getJsPermissionDelegateFactory()Lcom/vk/superapp/permission/js/bridge/api/di/JsPermissionDelegateFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.superapp.permission.js.bridge.api.di.JsPermissionDelegateComponent
    public final b A0() {
        qcy<Object> qcyVar = b[0];
        return (b) this.a.c();
    }
}
