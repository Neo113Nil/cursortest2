package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import xsna.epx;
import xsna.ltx0;
import xsna.zcl;

/* compiled from: MsgChatMemberInviteByCall.kt */
/* loaded from: classes2.dex */
public final class MsgChatMemberInviteByCall extends Msg implements ltx0 {
    public static final Serializer.c<MsgChatMemberInviteByCall> CREATOR = new a();
    public Peer E;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgChatMemberInviteByCall> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgChatMemberInviteByCall a(Serializer serializer) {
            return new MsgChatMemberInviteByCall(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgChatMemberInviteByCall[i];
        }
    }

    public MsgChatMemberInviteByCall(Serializer serializer, zcl zclVar) {
        this.E = Peer.Unknown.e;
        Bb(serializer);
    }

    @Override // xsna.ltx0
    public final Peer H0() {
        return this.E;
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final void Rb(Serializer serializer) {
        this.E = (Peer) serializer.G(Peer.class.getClassLoader());
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
        return (obj instanceof MsgChatMemberInviteByCall) && super.equals(obj) && epx.f(this.E, ((MsgChatMemberInviteByCall) obj).E);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final int hashCode() {
        return Long.hashCode(this.E.b) + (super.hashCode() * 31);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final String toString() {
        return "MsgChatMemberInviteByCall(member=" + this.E + ") " + super.toString();
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgChatMemberInviteByCall(this);
    }

    public MsgChatMemberInviteByCall(Peer peer) {
        Peer.Unknown unknown = Peer.Unknown.e;
        this.E = peer;
    }

    public MsgChatMemberInviteByCall() {
        this.E = Peer.Unknown.e;
    }

    public MsgChatMemberInviteByCall(MsgChatMemberInviteByCall msgChatMemberInviteByCall) {
        this.E = Peer.Unknown.e;
        Ab(msgChatMemberInviteByCall);
        this.E = msgChatMemberInviteByCall.E;
    }
}
