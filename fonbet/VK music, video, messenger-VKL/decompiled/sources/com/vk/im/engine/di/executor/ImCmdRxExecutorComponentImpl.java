package com.vk.im.engine.di.executor;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.di.ImCmdRxExecutorComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.lzv;
import xsna.m03;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: ImCmdRxExecutorComponentImpl.kt */
/* loaded from: classes.dex */
public final class ImCmdRxExecutorComponentImpl implements ImCmdRxExecutorComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new m03(2));

    /* compiled from: ImCmdRxExecutorComponentImpl.kt */
    public static final class a implements c8m<ImCmdRxExecutorComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImCmdRxExecutorComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImCmdRxExecutorComponentImpl.class, "executor", "getExecutor()Lcom/vk/im/engine/executor/ImCmdRxExecutor;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.im.engine.di.ImCmdRxExecutorComponent
    public final lzv g() {
        qcy<Object> qcyVar = b[0];
        return (lzv) this.a.c();
    }
}
