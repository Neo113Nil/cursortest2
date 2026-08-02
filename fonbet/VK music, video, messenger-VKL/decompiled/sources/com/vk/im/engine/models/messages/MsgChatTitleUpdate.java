package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MsgChatTitleUpdate.kt */
/* loaded from: classes2.dex */
public final class MsgChatTitleUpdate extends Msg {
    public static final Serializer.c<MsgChatTitleUpdate> CREATOR = new a();
    public String E;
    public String F;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgChatTitleUpdate> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgChatTitleUpdate a(Serializer serializer) {
            return new MsgChatTitleUpdate(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgChatTitleUpdate[i];
        }
    }

    public MsgChatTitleUpdate(String str, String str2) {
        this.E = str;
        this.F = str2;
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final void Rb(Serializer serializer) {
        this.E = serializer.H();
        this.F = serializer.H();
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final void Sb(Serializer serializer) {
        serializer.j0(this.E);
        serializer.j0(this.F);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MsgChatTitleUpdate) || !super.equals(obj)) {
            return false;
        }
        MsgChatTitleUpdate msgChatTitleUpdate = (MsgChatTitleUpdate) obj;
        return epx.f(this.E, msgChatTitleUpdate.E) && epx.f(this.F, msgChatTitleUpdate.F);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final int hashCode() {
        int a2 = urd0.a(super.hashCode() * 31, 31, this.E);
        String str = this.F;
        return a2 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final String toString() {
        return "MsgChatTitleUpdate(chatTitle='" + this.E + "', oldTitle='" + this.F + "') " + super.toString();
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgChatTitleUpdate(this);
    }

    public MsgChatTitleUpdate() {
        this.E = "";
    }

    public MsgChatTitleUpdate(MsgChatTitleUpdate msgChatTitleUpdate) {
        this.E = "";
        Ab(msgChatTitleUpdate);
        this.E = msgChatTitleUpdate.E;
        this.F = msgChatTitleUpdate.F;
    }

    public MsgChatTitleUpdate(Serializer serializer, zcl zclVar) {
        this.E = "";
        Bb(serializer);
    }
}
