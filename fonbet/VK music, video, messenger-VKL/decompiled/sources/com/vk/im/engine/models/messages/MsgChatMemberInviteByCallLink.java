package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import xsna.zcl;

/* compiled from: MsgChatMemberInviteByCallLink.kt */
/* loaded from: classes2.dex */
public final class MsgChatMemberInviteByCallLink extends Msg {
    public static final Serializer.c<MsgChatMemberInviteByCallLink> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgChatMemberInviteByCallLink> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgChatMemberInviteByCallLink a(Serializer serializer) {
            return new MsgChatMemberInviteByCallLink(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgChatMemberInviteByCallLink[i];
        }
    }

    public MsgChatMemberInviteByCallLink() {
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MsgChatMemberInviteByCallLink) && super.equals(obj);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final String toString() {
        return "MsgChatMemberInviteByCallLink() " + super.toString();
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgChatMemberInviteByCallLink(this);
    }

    public MsgChatMemberInviteByCallLink(MsgChatMemberInviteByCallLink msgChatMemberInviteByCallLink) {
        Ab(msgChatMemberInviteByCallLink);
    }

    public MsgChatMemberInviteByCallLink(Serializer serializer, zcl zclVar) {
        Bb(serializer);
    }
}
