package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.zcl;

/* compiled from: MsgChatCreate.kt */
/* loaded from: classes2.dex */
public final class MsgChatCreate extends Msg {
    public static final Serializer.c<MsgChatCreate> CREATOR = new a();
    public String E;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgChatCreate> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgChatCreate a(Serializer serializer) {
            return new MsgChatCreate(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgChatCreate[i];
        }
    }

    public MsgChatCreate() {
        this.E = "";
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final void Rb(Serializer serializer) {
        this.E = serializer.H();
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final void Sb(Serializer serializer) {
        serializer.j0(this.E);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MsgChatCreate) && super.equals(obj) && epx.f(this.E, ((MsgChatCreate) obj).E);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final int hashCode() {
        return this.E.hashCode() + (super.hashCode() * 31);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final String toString() {
        return "MsgChatCreate(chatTitle='" + this.E + "') " + super.toString();
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgChatCreate(this);
    }

    public MsgChatCreate(MsgChatCreate msgChatCreate) {
        this.E = "";
        Ab(msgChatCreate);
        this.E = msgChatCreate.E;
    }

    public MsgChatCreate(Serializer serializer, zcl zclVar) {
        this.E = "";
        Bb(serializer);
    }
}
