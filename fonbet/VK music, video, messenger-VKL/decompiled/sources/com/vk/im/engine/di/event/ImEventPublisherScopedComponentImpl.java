package com.vk.im.engine.di.event;

import com.ironsource.Hb;
import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.event.publisher.di.ImEventPublisherScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.acw;
import xsna.bpn0;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.s3w;
import xsna.x3i;
import xsna.y3i;

/* compiled from: ImEventPublisherScopedComponentImpl.kt */
/* loaded from: classes2.dex */
public final class ImEventPublisherScopedComponentImpl implements ImEventPublisherScopedComponent, DiScopedComponent<acw> {
    public static final /* synthetic */ qcy<Object>[] d;
    public final acw a;
    public final bpn0 b;
    public final nwy c = new nwy(new x3i(this, 17));

    /* compiled from: ImEventPublisherScopedComponentImpl.kt */
    public static final class a implements c8m<ImEventPublisherScopedComponent, acw> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImEventPublisherScopedComponentImpl((acw) pwj0Var, new bpn0(new y3i(g8mVar, 16)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImEventPublisherScopedComponentImpl.class, Hb.b, "getPublisher()Lcom/vk/im/engine/event/publisher/ImEventPublisher;", 0);
        fpf0.a.getClass();
        d = new qcy[]{propertyReference1Impl};
    }

    public ImEventPublisherScopedComponentImpl(acw acwVar, bpn0 bpn0Var) {
        this.a = acwVar;
        this.b = bpn0Var;
    }

    @Override // com.vk.im.engine.event.publisher.di.ImEventPublisherScopedComponent
    public final s3w G() {
        qcy<Object> qcyVar = d[0];
        return (s3w) this.c.c();
    }
}
