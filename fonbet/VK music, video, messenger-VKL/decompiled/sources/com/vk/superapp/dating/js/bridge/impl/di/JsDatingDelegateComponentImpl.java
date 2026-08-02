package com.vk.superapp.dating.js.bridge.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.dating.js.bridge.api.di.JsDatingDelegateComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.pwj0;
import xsna.qcy;
import xsna.qo0;

/* compiled from: JsDatingDelegateComponentImpl.kt */
/* loaded from: classes6.dex */
public final class JsDatingDelegateComponentImpl implements JsDatingDelegateComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new qo0(19));

    /* compiled from: JsDatingDelegateComponentImpl.kt */
    public static final class a implements c8m<JsDatingDelegateComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new JsDatingDelegateComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(JsDatingDelegateComponentImpl.class, "jsDatingDelegateFactory", "getJsDatingDelegateFactory()Lcom/vk/superapp/dating/js/bridge/api/di/JsDatingDelegateFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.superapp.dating.js.bridge.api.di.JsDatingDelegateComponent
    public final com.vk.superapp.dating.js.bridge.api.di.a y2() {
        qcy<Object> qcyVar = b[0];
        return (com.vk.superapp.dating.js.bridge.api.di.a) this.a.c();
    }
}
