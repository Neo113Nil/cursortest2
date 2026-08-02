package com.vk.im.chat.impl;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.chat.api.ChatComponent;
import xsna.c8m;
import xsna.g8m;
import xsna.pwj0;
import xsna.pyb;
import xsna.qyb;

/* compiled from: ChatComponentImpl.kt */
/* loaded from: classes.dex */
public final class ChatComponentImpl implements ChatComponent {

    /* compiled from: ChatComponentImpl.kt */
    public static final class a implements c8m<ChatComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ChatComponentImpl();
        }
    }

    @Override // com.vk.im.chat.api.ChatComponent
    public final pyb Cf() {
        return new qyb();
    }
}
