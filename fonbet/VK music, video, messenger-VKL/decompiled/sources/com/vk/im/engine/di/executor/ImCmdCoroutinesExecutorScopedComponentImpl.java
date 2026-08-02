package com.vk.im.engine.di.executor;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.di.ImCmdCoroutinesExecutorScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.acw;
import xsna.bpn0;
import xsna.c8m;
import xsna.ezv;
import xsna.fpf0;
import xsna.g8m;
import xsna.gzv;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.x4u;

/* compiled from: ImCmdCoroutinesExecutorScopedComponentImpl.kt */
/* loaded from: classes2.dex */
public final class ImCmdCoroutinesExecutorScopedComponentImpl implements ImCmdCoroutinesExecutorScopedComponent, DiScopedComponent<acw> {
    public static final /* synthetic */ qcy<Object>[] d;
    public final acw a;
    public final bpn0 b;
    public final nwy c = new nwy(new gzv(this, 0));

    /* compiled from: ImCmdCoroutinesExecutorScopedComponentImpl.kt */
    public static final class a implements c8m<ImCmdCoroutinesExecutorScopedComponent, acw> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImCmdCoroutinesExecutorScopedComponentImpl((acw) pwj0Var, new bpn0(new x4u(g8mVar, 3)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImCmdCoroutinesExecutorScopedComponentImpl.class, "executor", "getExecutor()Lcom/vk/im/engine/executor/ImCmdCoroutinesExecutor;", 0);
        fpf0.a.getClass();
        d = new qcy[]{propertyReference1Impl};
    }

    public ImCmdCoroutinesExecutorScopedComponentImpl(acw acwVar, bpn0 bpn0Var) {
        this.a = acwVar;
        this.b = bpn0Var;
    }

    @Override // com.vk.im.engine.di.ImCmdCoroutinesExecutorScopedComponent
    public final ezv g() {
        qcy<Object> qcyVar = d[0];
        return (ezv) this.c.c();
    }
}
