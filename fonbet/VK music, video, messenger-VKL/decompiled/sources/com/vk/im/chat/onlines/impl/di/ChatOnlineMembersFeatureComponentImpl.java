package com.vk.im.chat.onlines.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.im.chat.onlines.api.ChatOnlineMembersFeatureComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.ee4;
import xsna.fpf0;
import xsna.nwy;
import xsna.qcy;

/* compiled from: ChatOnlineMembersFeatureComponentImpl.kt */
/* loaded from: classes2.dex */
public final class ChatOnlineMembersFeatureComponentImpl implements ChatOnlineMembersFeatureComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new ee4(2));

    /* compiled from: ChatOnlineMembersFeatureComponentImpl.kt */
    public static final class a implements b7m<ChatOnlineMembersFeatureComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ChatOnlineMembersFeatureComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ChatOnlineMembersFeatureComponentImpl.class, "loader", "getLoader()Lcom/vk/im/chat/onlines/api/ChatOnlineMembersLoader;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.im.chat.onlines.api.ChatOnlineMembersFeatureComponent
    public final com.vk.im.chat.onlines.api.a m() {
        qcy<Object> qcyVar = b[0];
        return (com.vk.im.chat.onlines.api.a) this.a.c();
    }
}
