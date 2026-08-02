package com.vk.im.engine.di.lifecycle;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.lifecycle.di.ImEngineLifecycleScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.acw;
import xsna.b1h;
import xsna.bpn0;
import xsna.c8m;
import xsna.dof;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.r1w;

/* compiled from: ImEngineLifecycleScopedComponentImpl.kt */
/* loaded from: classes2.dex */
public final class ImEngineLifecycleScopedComponentImpl implements ImEngineLifecycleScopedComponent, DiScopedComponent<acw> {
    public static final /* synthetic */ qcy<Object>[] d;
    public final acw a;
    public final bpn0 b;
    public final nwy c = new nwy(new dof(this, 29));

    /* compiled from: ImEngineLifecycleScopedComponentImpl.kt */
    public static final class a implements c8m<ImEngineLifecycleScopedComponent, acw> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImEngineLifecycleScopedComponentImpl((acw) pwj0Var, new bpn0(new b1h(g8mVar, 21)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImEngineLifecycleScopedComponentImpl.class, "lifecycleController", "getLifecycleController()Lcom/vk/im/engine/lifecycle/ImEngineLifecycleController;", 0);
        fpf0.a.getClass();
        d = new qcy[]{propertyReference1Impl};
    }

    public ImEngineLifecycleScopedComponentImpl(acw acwVar, bpn0 bpn0Var) {
        this.a = acwVar;
        this.b = bpn0Var;
    }

    @Override // com.vk.im.engine.lifecycle.di.ImEngineLifecycleScopedComponent
    public final r1w N() {
        qcy<Object> qcyVar = d[0];
        return (r1w) this.c.c();
    }
}
