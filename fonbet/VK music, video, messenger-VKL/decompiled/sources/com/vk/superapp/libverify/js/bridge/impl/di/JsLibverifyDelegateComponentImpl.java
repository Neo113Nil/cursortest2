package com.vk.superapp.libverify.js.bridge.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.libverify.js.bridge.api.di.JsLibverifyDelegateComponent;
import com.vk.superapp.libverify.js.bridge.api.di.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.i21;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: JsLibverifyDelegateComponentImpl.kt */
/* loaded from: classes6.dex */
public final class JsLibverifyDelegateComponentImpl implements JsLibverifyDelegateComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new i21(14));

    /* compiled from: JsLibverifyDelegateComponentImpl.kt */
    public static final class a implements c8m<JsLibverifyDelegateComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new JsLibverifyDelegateComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(JsLibverifyDelegateComponentImpl.class, "jsLibverifyBridgeFactory", "getJsLibverifyBridgeFactory()Lcom/vk/superapp/libverify/js/bridge/api/di/JsLibverifyDelegateFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.superapp.libverify.js.bridge.api.di.JsLibverifyDelegateComponent
    public final b g6() {
        qcy<Object> qcyVar = b[0];
        return (b) this.a.c();
    }
}
