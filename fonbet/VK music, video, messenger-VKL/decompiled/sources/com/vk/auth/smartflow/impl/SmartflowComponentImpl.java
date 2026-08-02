package com.vk.auth.smartflow.impl;

import com.vk.auth.smartflow.api.SmartflowComponent;
import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a8j0;
import xsna.ak20;
import xsna.b6k0;
import xsna.b7m;
import xsna.e7m;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.nwy;
import xsna.qcy;
import xsna.w5k0;

/* compiled from: SmartflowComponentImpl.kt */
/* loaded from: classes15.dex */
public final class SmartflowComponentImpl implements SmartflowComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(SmartflowComponentImpl.class, "smartflowRouter", "getSmartflowRouter()Lcom/vk/auth/smartflow/api/SmartflowRouter;", 0), fp.c(0, SmartflowComponentImpl.class, "repository", "getRepository()Lcom/vk/auth/smartflow/api/MethodSelectorRepository;", fpf0.a)};
    public final ewy a = new ewy(new w5k0(0));
    public final nwy b = new nwy(new a8j0(1));

    /* compiled from: SmartflowComponentImpl.kt */
    public static final class a implements b7m<SmartflowComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new SmartflowComponentImpl();
        }
    }

    @Override // com.vk.auth.smartflow.api.SmartflowComponent
    public final b6k0 Vd() {
        qcy<Object> qcyVar = c[0];
        return (b6k0) this.a.c();
    }

    @Override // com.vk.auth.smartflow.api.SmartflowComponent
    public final ak20 c() {
        qcy<Object> qcyVar = c[1];
        return (ak20) this.b.c();
    }
}
