package com.vk.im.engine.di.executor;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.di.ImCmdDirectExecutorScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.acw;
import xsna.bpn0;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.izv;
import xsna.nwy;
import xsna.ocg;
import xsna.pwj0;
import xsna.qcy;
import xsna.x3i;

/* compiled from: ImCmdDirectExecutorScopedComponentImpl.kt */
/* loaded from: classes2.dex */
public final class ImCmdDirectExecutorScopedComponentImpl implements ImCmdDirectExecutorScopedComponent, DiScopedComponent<acw> {
    public static final /* synthetic */ qcy<Object>[] d;
    public final acw a;
    public final bpn0 b;
    public final nwy c = new nwy(new ocg(this, 27));

    /* compiled from: ImCmdDirectExecutorScopedComponentImpl.kt */
    public static final class a implements c8m<ImCmdDirectExecutorScopedComponent, acw> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImCmdDirectExecutorScopedComponentImpl((acw) pwj0Var, new bpn0(new x3i(g8mVar, 16)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImCmdDirectExecutorScopedComponentImpl.class, "executor", "getExecutor()Lcom/vk/im/engine/executor/ImCmdDirectExecutor;", 0);
        fpf0.a.getClass();
        d = new qcy[]{propertyReference1Impl};
    }

    public ImCmdDirectExecutorScopedComponentImpl(acw acwVar, bpn0 bpn0Var) {
        this.a = acwVar;
        this.b = bpn0Var;
    }

    @Override // com.vk.im.engine.di.ImCmdDirectExecutorScopedComponent
    public final izv g() {
        qcy<Object> qcyVar = d[0];
        return (izv) this.c.c();
    }
}
