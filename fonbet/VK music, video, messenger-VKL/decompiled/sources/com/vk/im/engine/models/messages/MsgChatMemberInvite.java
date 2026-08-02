package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import xsna.epx;
import xsna.ltx0;
import xsna.zcl;

/* compiled from: MsgChatMemberInvite.kt */
/* loaded from: classes2.dex */
public final class MsgChatMemberInvite extends Msg implements ltx0 {
    public static final Serializer.c<MsgChatMemberInvite> CREATOR = new a();
    public Peer E;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgChatMemberInvite> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgChatMemberInvite a(Serializer serializer) {
            return new MsgChatMemberInvite(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgChatMemberInvite[i];
        }
    }

    public MsgChatMemberInvite(Peer peer) {
        Peer.Unknown unknown = Peer.Unknown.e;
        this.E = peer;
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
        return (obj instanceof MsgChatMemberInvite) && super.equals(obj) && epx.f(this.E, ((MsgChatMemberInvite) obj).E);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final int hashCode() {
        return Long.hashCode(this.E.b) + (super.hashCode() * 31);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final String toString() {
        return "MsgChatMemberInvite(member=" + this.E + ") " + super.toString();
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgChatMemberInvite(this);
    }

    public MsgChatMemberInvite() {
        this.E = Peer.Unknown.e;
    }

    public MsgChatMemberInvite(MsgChatMemberInvite msgChatMemberInvite) {
        this.E = Peer.Unknown.e;
        Ab(msgChatMemberInvite);
        this.E = msgChatMemberInvite.E;
    }

    public MsgChatMemberInvite(Serializer serializer, zcl zclVar) {
        this.E = Peer.Unknown.e;
        Bb(serializer);
    }
}
