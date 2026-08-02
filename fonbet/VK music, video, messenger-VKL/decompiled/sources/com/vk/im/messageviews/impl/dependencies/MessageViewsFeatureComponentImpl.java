package com.vk.im.messageviews.impl.dependencies;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.im.messageviews.api.MessageViewsFeatureComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fc;
import xsna.fd20;
import xsna.fp;
import xsna.fpf0;
import xsna.gc;
import xsna.nwy;
import xsna.qcy;
import xsna.tc20;

/* compiled from: MessageViewsFeatureComponentImpl.kt */
/* loaded from: classes2.dex */
public final class MessageViewsFeatureComponentImpl implements MessageViewsFeatureComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(MessageViewsFeatureComponentImpl.class, "msgActionViewHolderDelegateFactory", "getMsgActionViewHolderDelegateFactory()Lcom/vk/im/messageviews/api/MessageViewsViewHolderDelegateFactory;", 0), fp.c(0, MessageViewsFeatureComponentImpl.class, "router", "getRouter()Lcom/vk/im/messageviews/api/MessageViewsRouter;", fpf0.a)};
    public final nwy a = new nwy(new fc(21));
    public final nwy b = new nwy(new gc(17));

    /* compiled from: MessageViewsFeatureComponentImpl.kt */
    public static final class a implements b7m<MessageViewsFeatureComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MessageViewsFeatureComponentImpl();
        }
    }

    @Override // com.vk.im.messageviews.api.MessageViewsFeatureComponent
    public final tc20 a() {
        qcy<Object> qcyVar = c[1];
        return (tc20) this.b.c();
    }

    @Override // com.vk.im.messageviews.api.MessageViewsFeatureComponent
    public final fd20 y4() {
        qcy<Object> qcyVar = c[0];
        return (fd20) this.a.c();
    }
}
