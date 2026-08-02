package com.vk.im.engine.di.event;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.event.observer.coroutines.di.ImCoroutinesEventObserverScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.acw;
import xsna.akh;
import xsna.bpn0;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.odm;
import xsna.pwj0;
import xsna.qcy;
import xsna.xzv;

/* compiled from: ImCoroutinesEventObserverScopedComponentImpl.kt */
/* loaded from: classes2.dex */
public final class ImCoroutinesEventObserverScopedComponentImpl implements ImCoroutinesEventObserverScopedComponent, DiScopedComponent<acw> {
    public static final /* synthetic */ qcy<Object>[] d;
    public final acw a;
    public final bpn0 b;
    public final nwy c = new nwy(new odm(this, 17));

    /* compiled from: ImCoroutinesEventObserverScopedComponentImpl.kt */
    public static final class a implements c8m<ImCoroutinesEventObserverScopedComponent, acw> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImCoroutinesEventObserverScopedComponentImpl((acw) pwj0Var, new bpn0(new akh(g8mVar, 25)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImCoroutinesEventObserverScopedComponentImpl.class, "observer", "getObserver()Lcom/vk/im/engine/event/observer/coroutines/ImCoroutinesEventObserver;", 0);
        fpf0.a.getClass();
        d = new qcy[]{propertyReference1Impl};
    }

    public ImCoroutinesEventObserverScopedComponentImpl(acw acwVar, bpn0 bpn0Var) {
        this.a = acwVar;
        this.b = bpn0Var;
    }

    @Override // com.vk.im.engine.event.observer.coroutines.di.ImCoroutinesEventObserverScopedComponent
    public final xzv l() {
        qcy<Object> qcyVar = d[0];
        return (xzv) this.c.c();
    }
}
