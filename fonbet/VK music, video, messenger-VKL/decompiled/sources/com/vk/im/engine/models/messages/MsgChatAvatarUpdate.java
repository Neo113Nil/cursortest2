package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.im.ImageList;
import xsna.epx;
import xsna.zcl;

/* compiled from: MsgChatAvatarUpdate.kt */
/* loaded from: classes2.dex */
public final class MsgChatAvatarUpdate extends Msg {
    public static final Serializer.c<MsgChatAvatarUpdate> CREATOR = new a();
    public ImageList E;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgChatAvatarUpdate> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgChatAvatarUpdate a(Serializer serializer) {
            return new MsgChatAvatarUpdate(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgChatAvatarUpdate[i];
        }
    }

    public MsgChatAvatarUpdate() {
        this.E = new ImageList(null, 1, null);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final void Rb(Serializer serializer) {
        this.E = (ImageList) serializer.G(ImageList.class.getClassLoader());
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final void Sb(Serializer serializer) {
        serializer.i0(this.E);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MsgChatAvatarUpdate) && super.equals(obj) && epx.f(this.E, ((MsgChatAvatarUpdate) obj).E);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final int hashCode() {
        return this.E.b.hashCode() + (super.hashCode() * 31);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final String toString() {
        return "MsgChatAvatarUpdate(avatar=" + this.E + ')';
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgChatAvatarUpdate(this);
    }

    public MsgChatAvatarUpdate(MsgChatAvatarUpdate msgChatAvatarUpdate) {
        this.E = new ImageList(null, 1, null);
        Ab(msgChatAvatarUpdate);
        ImageList imageList = msgChatAvatarUpdate.E;
        imageList.getClass();
        this.E = new ImageList(imageList);
    }

    public MsgChatAvatarUpdate(Serializer serializer, zcl zclVar) {
        this.E = new ImageList(null, 1, null);
        Bb(serializer);
    }
}
