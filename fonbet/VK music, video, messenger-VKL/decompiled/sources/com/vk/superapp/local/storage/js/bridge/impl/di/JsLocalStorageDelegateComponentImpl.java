package com.vk.superapp.local.storage.js.bridge.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.local.storage.js.bridge.api.di.JsLocalStorageDelegateComponent;
import com.vk.superapp.local.storage.js.bridge.api.di.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.lg;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: JsLocalStorageDelegateComponentImpl.kt */
/* loaded from: classes6.dex */
public final class JsLocalStorageDelegateComponentImpl implements JsLocalStorageDelegateComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new lg(18));

    /* compiled from: JsLocalStorageDelegateComponentImpl.kt */
    public static final class a implements c8m<JsLocalStorageDelegateComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new JsLocalStorageDelegateComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(JsLocalStorageDelegateComponentImpl.class, "jsLocalStorageDelegateFactory", "getJsLocalStorageDelegateFactory()Lcom/vk/superapp/local/storage/js/bridge/api/di/JsLocalStorageDelegateFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.superapp.local.storage.js.bridge.api.di.JsLocalStorageDelegateComponent
    public final b ab() {
        qcy<Object> qcyVar = b[0];
        return (b) this.a.c();
    }
}
