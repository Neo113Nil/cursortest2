package com.vk.im.engine.di.event;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.event.observer.rx.di.ImRxEventObserverComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.wa3;
import xsna.xbw;

/* compiled from: ImRxEventObserverComponentImpl.kt */
/* loaded from: classes.dex */
public final class ImRxEventObserverComponentImpl implements ImRxEventObserverComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new wa3(6));

    /* compiled from: ImRxEventObserverComponentImpl.kt */
    public static final class a implements c8m<ImRxEventObserverComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImRxEventObserverComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImRxEventObserverComponentImpl.class, "observer", "getObserver()Lcom/vk/im/engine/event/observer/rx/ImRxEventObserver;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.im.engine.event.observer.rx.di.ImRxEventObserverComponent
    public final xbw l() {
        qcy<Object> qcyVar = b[0];
        return (xbw) this.a.c();
    }
}
