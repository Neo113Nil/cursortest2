package com.vk.im.engine.di.event;

import com.ironsource.Hb;
import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.event.publisher.di.ImEventPublisherComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.s3w;
import xsna.xu0;

/* compiled from: ImEventPublisherComponentImpl.kt */
/* loaded from: classes2.dex */
public final class ImEventPublisherComponentImpl implements ImEventPublisherComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new xu0(18));

    /* compiled from: ImEventPublisherComponentImpl.kt */
    public static final class a implements c8m<ImEventPublisherComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImEventPublisherComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImEventPublisherComponentImpl.class, Hb.b, "getPublisher()Lcom/vk/im/engine/event/publisher/ImEventPublisher;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.im.engine.event.publisher.di.ImEventPublisherComponent
    public final s3w G() {
        qcy<Object> qcyVar = b[0];
        return (s3w) this.a.c();
    }
}
