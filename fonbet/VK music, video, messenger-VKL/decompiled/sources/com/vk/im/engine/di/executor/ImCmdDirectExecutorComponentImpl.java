package com.vk.im.engine.di.executor;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.di.ImCmdDirectExecutorComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.izv;
import xsna.nwy;
import xsna.pb8;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: ImCmdDirectExecutorComponentImpl.kt */
/* loaded from: classes.dex */
public final class ImCmdDirectExecutorComponentImpl implements ImCmdDirectExecutorComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new pb8(2));

    /* compiled from: ImCmdDirectExecutorComponentImpl.kt */
    public static final class a implements c8m<ImCmdDirectExecutorComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImCmdDirectExecutorComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImCmdDirectExecutorComponentImpl.class, "executor", "getExecutor()Lcom/vk/im/engine/executor/ImCmdDirectExecutor;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.im.engine.di.ImCmdDirectExecutorComponent
    public final izv g() {
        qcy<Object> qcyVar = b[0];
        return (izv) this.a.c();
    }
}
