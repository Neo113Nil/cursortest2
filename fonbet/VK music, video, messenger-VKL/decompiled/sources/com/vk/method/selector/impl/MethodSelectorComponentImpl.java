package com.vk.method.selector.impl;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.method.selector.api.MethodSelectorComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.ek20;
import xsna.ewy;
import xsna.fpf0;
import xsna.qcy;
import xsna.wb1;

/* compiled from: MethodSelectorComponentImpl.kt */
/* loaded from: classes3.dex */
public final class MethodSelectorComponentImpl implements MethodSelectorComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new wb1(19));

    /* compiled from: MethodSelectorComponentImpl.kt */
    public static final class a implements b7m<MethodSelectorComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MethodSelectorComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MethodSelectorComponentImpl.class, "router", "getRouter()Lcom/vk/method/selector/api/MethodSelectorRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.method.selector.api.MethodSelectorComponent
    public final ek20 a() {
        qcy<Object> qcyVar = b[0];
        return (ek20) this.a.c();
    }
}
