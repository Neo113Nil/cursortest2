package com.vk.im.engine.di.lifecycle;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.lifecycle.di.ImEngineLifecycleComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nb8;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.r1w;

/* compiled from: ImEngineLifecycleComponentImpl.kt */
/* loaded from: classes.dex */
public final class ImEngineLifecycleComponentImpl implements ImEngineLifecycleComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new nb8(5));

    /* compiled from: ImEngineLifecycleComponentImpl.kt */
    public static final class a implements c8m<ImEngineLifecycleComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImEngineLifecycleComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImEngineLifecycleComponentImpl.class, "lifecycleController", "getLifecycleController()Lcom/vk/im/engine/lifecycle/ImEngineLifecycleController;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.im.engine.lifecycle.di.ImEngineLifecycleComponent
    public final r1w N() {
        qcy<Object> qcyVar = b[0];
        return (r1w) this.a.c();
    }
}
