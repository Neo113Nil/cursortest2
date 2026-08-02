package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import xsna.zcl;

/* compiled from: MsgChatAvatarRemove.kt */
/* loaded from: classes2.dex */
public final class MsgChatAvatarRemove extends Msg {
    public static final Serializer.c<MsgChatAvatarRemove> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgChatAvatarRemove> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgChatAvatarRemove a(Serializer serializer) {
            return new MsgChatAvatarRemove(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgChatAvatarRemove[i];
        }
    }

    public MsgChatAvatarRemove() {
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MsgChatAvatarRemove) && super.equals(obj);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final String toString() {
        return "MsgChatAvatarRemove() " + super.toString();
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgChatAvatarRemove(this);
    }

    public MsgChatAvatarRemove(MsgChatAvatarRemove msgChatAvatarRemove) {
        Ab(msgChatAvatarRemove);
    }

    public MsgChatAvatarRemove(Serializer serializer, zcl zclVar) {
        Bb(serializer);
    }
}
