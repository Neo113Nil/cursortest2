package com.vk.im.engine.di.event;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.event.observer.rx.di.ImRxEventObserverScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.acw;
import xsna.bpn0;
import xsna.c8m;
import xsna.cvs;
import xsna.fpf0;
import xsna.g8m;
import xsna.gbh;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.xbw;

/* compiled from: ImRxEventObserverScopedComponentImpl.kt */
/* loaded from: classes2.dex */
public final class ImRxEventObserverScopedComponentImpl implements ImRxEventObserverScopedComponent, DiScopedComponent<acw> {
    public static final /* synthetic */ qcy<Object>[] d;
    public final acw a;
    public final bpn0 b;
    public final nwy c = new nwy(new cvs(this, 8));

    /* compiled from: ImRxEventObserverScopedComponentImpl.kt */
    public static final class a implements c8m<ImRxEventObserverScopedComponent, acw> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImRxEventObserverScopedComponentImpl((acw) pwj0Var, new bpn0(new gbh(g8mVar, 26)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImRxEventObserverScopedComponentImpl.class, "observer", "getObserver()Lcom/vk/im/engine/event/observer/rx/ImRxEventObserver;", 0);
        fpf0.a.getClass();
        d = new qcy[]{propertyReference1Impl};
    }

    public ImRxEventObserverScopedComponentImpl(acw acwVar, bpn0 bpn0Var) {
        this.a = acwVar;
        this.b = bpn0Var;
    }

    @Override // com.vk.im.engine.event.observer.rx.di.ImRxEventObserverScopedComponent
    public final xbw l() {
        qcy<Object> qcyVar = d[0];
        return (xbw) this.c.c();
    }
}
