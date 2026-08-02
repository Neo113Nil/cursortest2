package com.vk.superapp.common.js.bridge.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.common.js.bridge.api.di.JsCommonDelegateComponent;
import com.vk.superapp.common.js.bridge.api.di.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.pwj0;
import xsna.qcy;
import xsna.x84;

/* compiled from: JsCommonDelegateComponentImpl.kt */
/* loaded from: classes6.dex */
public final class JsCommonDelegateComponentImpl implements JsCommonDelegateComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new x84(16));

    /* compiled from: JsCommonDelegateComponentImpl.kt */
    public static final class a implements c8m<JsCommonDelegateComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new JsCommonDelegateComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(JsCommonDelegateComponentImpl.class, "jsCommonDelegateFactory", "getJsCommonDelegateFactory()Lcom/vk/superapp/common/js/bridge/api/di/JsCommonDelegateFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.superapp.common.js.bridge.api.di.JsCommonDelegateComponent
    public final b s9() {
        qcy<Object> qcyVar = b[0];
        return (b) this.a.c();
    }
}
