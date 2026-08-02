package com.vk.superapp.dating.sdk.js.bridge.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.dating.sdk.js.bridge.api.di.JsDatingSdkDelegateComponent;
import com.vk.superapp.dating.sdk.js.bridge.api.di.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.pwj0;
import xsna.qcy;
import xsna.te0;

/* compiled from: JsDatingSdkDelegateComponentImpl.kt */
/* loaded from: classes6.dex */
public final class JsDatingSdkDelegateComponentImpl implements JsDatingSdkDelegateComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new te0(24));

    /* compiled from: JsDatingSdkDelegateComponentImpl.kt */
    public static final class a implements c8m<JsDatingSdkDelegateComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new JsDatingSdkDelegateComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(JsDatingSdkDelegateComponentImpl.class, "jsDatingSdkDelegateFactory", "getJsDatingSdkDelegateFactory()Lcom/vk/superapp/dating/sdk/js/bridge/api/di/JsDatingSdkDelegateFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.superapp.dating.sdk.js.bridge.api.di.JsDatingSdkDelegateComponent
    public final b f9() {
        qcy<Object> qcyVar = b[0];
        return (b) this.a.c();
    }
}
