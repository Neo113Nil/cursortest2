package com.vk.superapp.vibration.js.bridge.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.vibration.js.bridge.api.di.JsVibrationDelegateComponent;
import com.vk.superapp.vibration.js.bridge.api.di.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.i13;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: JsVibrationDelegateComponentImpl.kt */
/* loaded from: classes6.dex */
public final class JsVibrationDelegateComponentImpl implements JsVibrationDelegateComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new i13(16));

    /* compiled from: JsVibrationDelegateComponentImpl.kt */
    public static final class a implements c8m<JsVibrationDelegateComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new JsVibrationDelegateComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(JsVibrationDelegateComponentImpl.class, "jsVibrationDelegateFactory", "getJsVibrationDelegateFactory()Lcom/vk/superapp/vibration/js/bridge/api/di/JsVibrationDelegateFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.superapp.vibration.js.bridge.api.di.JsVibrationDelegateComponent
    public final b ef() {
        qcy<Object> qcyVar = b[0];
        return (b) this.a.c();
    }
}
