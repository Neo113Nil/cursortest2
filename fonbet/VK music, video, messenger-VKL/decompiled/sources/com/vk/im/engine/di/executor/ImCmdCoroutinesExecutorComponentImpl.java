package com.vk.im.engine.di.executor;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.di.ImCmdCoroutinesExecutorComponent;
import com.vk.movika.tools.controls.seekbar.n;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ezv;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: ImCmdCoroutinesExecutorComponentImpl.kt */
/* loaded from: classes2.dex */
public final class ImCmdCoroutinesExecutorComponentImpl implements ImCmdCoroutinesExecutorComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new n(22));

    /* compiled from: ImCmdCoroutinesExecutorComponentImpl.kt */
    public static final class a implements c8m<ImCmdCoroutinesExecutorComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImCmdCoroutinesExecutorComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImCmdCoroutinesExecutorComponentImpl.class, "executor", "getExecutor()Lcom/vk/im/engine/executor/ImCmdCoroutinesExecutor;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.im.engine.di.ImCmdCoroutinesExecutorComponent
    public final ezv g() {
        qcy<Object> qcyVar = b[0];
        return (ezv) this.a.c();
    }
}
