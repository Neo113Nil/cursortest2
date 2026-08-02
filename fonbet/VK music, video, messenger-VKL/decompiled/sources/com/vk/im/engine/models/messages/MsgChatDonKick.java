package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import xsna.zcl;

/* compiled from: MsgChatDonKick.kt */
/* loaded from: classes2.dex */
public final class MsgChatDonKick extends Msg {
    public static final Serializer.c<MsgChatDonKick> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgChatDonKick> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgChatDonKick a(Serializer serializer) {
            return new MsgChatDonKick(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgChatDonKick[i];
        }
    }

    public MsgChatDonKick() {
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final String toString() {
        return "MsgChatDonKick " + super.toString();
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgChatDonKick(this);
    }

    public MsgChatDonKick(MsgChatDonKick msgChatDonKick) {
        Ab(msgChatDonKick);
    }

    public MsgChatDonKick(Serializer serializer, zcl zclVar) {
        Bb(serializer);
    }
}
