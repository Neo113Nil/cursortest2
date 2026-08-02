package com.vk.im.engine.di.event;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.event.observer.coroutines.di.ImCoroutinesEventObserverComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.xzv;
import xsna.y0f;

/* compiled from: ImCoroutinesEventObserverComponentImpl.kt */
/* loaded from: classes.dex */
public final class ImCoroutinesEventObserverComponentImpl implements ImCoroutinesEventObserverComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new y0f(2));

    /* compiled from: ImCoroutinesEventObserverComponentImpl.kt */
    public static final class a implements c8m<ImCoroutinesEventObserverComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImCoroutinesEventObserverComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImCoroutinesEventObserverComponentImpl.class, "observer", "getObserver()Lcom/vk/im/engine/event/observer/coroutines/ImCoroutinesEventObserver;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.im.engine.event.observer.coroutines.di.ImCoroutinesEventObserverComponent
    public final xzv l() {
        qcy<Object> qcyVar = b[0];
        return (xzv) this.a.c();
    }
}
