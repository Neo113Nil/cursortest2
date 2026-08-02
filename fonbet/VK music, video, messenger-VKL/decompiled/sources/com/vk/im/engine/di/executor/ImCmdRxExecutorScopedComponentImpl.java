package com.vk.im.engine.di.executor;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.di.ImCmdRxExecutorScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.acw;
import xsna.bpn0;
import xsna.c8m;
import xsna.cwg;
import xsna.fpf0;
import xsna.g8m;
import xsna.lzv;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.xis;

/* compiled from: ImCmdRxExecutorScopedComponentImpl.kt */
/* loaded from: classes2.dex */
public final class ImCmdRxExecutorScopedComponentImpl implements ImCmdRxExecutorScopedComponent, DiScopedComponent<acw> {
    public static final /* synthetic */ qcy<Object>[] d;
    public final acw a;
    public final bpn0 b;
    public final nwy c = new nwy(new xis(this, 8));

    /* compiled from: ImCmdRxExecutorScopedComponentImpl.kt */
    public static final class a implements c8m<ImCmdRxExecutorScopedComponent, acw> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImCmdRxExecutorScopedComponentImpl((acw) pwj0Var, new bpn0(new cwg(g8mVar, 26)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImCmdRxExecutorScopedComponentImpl.class, "executor", "getExecutor()Lcom/vk/im/engine/executor/ImCmdRxExecutor;", 0);
        fpf0.a.getClass();
        d = new qcy[]{propertyReference1Impl};
    }

    public ImCmdRxExecutorScopedComponentImpl(acw acwVar, bpn0 bpn0Var) {
        this.a = acwVar;
        this.b = bpn0Var;
    }

    @Override // com.vk.im.engine.di.ImCmdRxExecutorScopedComponent
    public final lzv g() {
        qcy<Object> qcyVar = d[0];
        return (lzv) this.c.c();
    }
}
