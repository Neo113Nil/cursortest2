package com.vk.superapp.subscriptions.js.bridge.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.subscriptions.js.bridge.api.di.JsSubscriptionsDelegateComponent;
import com.vk.superapp.subscriptions.js.bridge.api.di.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.pwj0;
import xsna.qcy;
import xsna.xv0;

/* compiled from: JsSubscriptionsDelegateComponentImpl.kt */
/* loaded from: classes6.dex */
public final class JsSubscriptionsDelegateComponentImpl implements JsSubscriptionsDelegateComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new xv0(12));

    /* compiled from: JsSubscriptionsDelegateComponentImpl.kt */
    public static final class a implements c8m<JsSubscriptionsDelegateComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new JsSubscriptionsDelegateComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(JsSubscriptionsDelegateComponentImpl.class, "jsSubscriptionsDelegateFactory", "getJsSubscriptionsDelegateFactory()Lcom/vk/superapp/subscriptions/js/bridge/api/di/JsSubscriptionsDelegateFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.superapp.subscriptions.js.bridge.api.di.JsSubscriptionsDelegateComponent
    public final b H7() {
        qcy<Object> qcyVar = b[0];
        return (b) this.a.c();
    }
}
