package com.vk.superapp.analytics.js.bridge.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.analytics.js.bridge.api.di.JsAnalyticsDelegateComponent;
import com.vk.superapp.analytics.js.bridge.api.di.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.pwj0;
import xsna.qcy;
import xsna.vv0;

/* compiled from: JsAnalyticsDelegateComponentImpl.kt */
/* loaded from: classes6.dex */
public final class JsAnalyticsDelegateComponentImpl implements JsAnalyticsDelegateComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new vv0(22));

    /* compiled from: JsAnalyticsDelegateComponentImpl.kt */
    public static final class a implements c8m<JsAnalyticsDelegateComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new JsAnalyticsDelegateComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(JsAnalyticsDelegateComponentImpl.class, "jsAnalyticsDelegateFactory", "getJsAnalyticsDelegateFactory()Lcom/vk/superapp/analytics/js/bridge/api/di/JsAnalyticsDelegateFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.superapp.analytics.js.bridge.api.di.JsAnalyticsDelegateComponent
    public final b x4() {
        qcy<Object> qcyVar = b[0];
        return (b) this.a.c();
    }
}
