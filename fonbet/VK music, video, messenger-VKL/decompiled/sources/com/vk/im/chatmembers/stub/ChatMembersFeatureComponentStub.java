package com.vk.im.chatmembers.stub;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.im.chatmembers.api.ChatMembersFeatureComponent;
import xsna.b7m;
import xsna.e7m;
import xsna.s101;

/* compiled from: ChatMembersFeatureComponentStub.kt */
/* loaded from: classes2.dex */
public final class ChatMembersFeatureComponentStub implements ChatMembersFeatureComponent {
    public final s101 a = new s101();

    /* compiled from: ChatMembersFeatureComponentStub.kt */
    public static final class a implements b7m<ChatMembersFeatureComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ChatMembersFeatureComponentStub();
        }
    }

    @Override // com.vk.im.chatmembers.api.ChatMembersFeatureComponent
    public final s101 S1() {
        return this.a;
    }
}
