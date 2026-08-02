package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import xsna.epx;
import xsna.eq;
import xsna.ltx0;
import xsna.zcl;

/* compiled from: MsgChatMemberInviteByMr.kt */
/* loaded from: classes2.dex */
public final class MsgChatMemberInviteByMr extends Msg implements ltx0 {
    public static final Serializer.c<MsgChatMemberInviteByMr> CREATOR = new a();
    public Peer E;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgChatMemberInviteByMr> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgChatMemberInviteByMr a(Serializer serializer) {
            return new MsgChatMemberInviteByMr(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgChatMemberInviteByMr[i];
        }
    }

    public MsgChatMemberInviteByMr(Peer peer) {
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
        return (obj instanceof MsgChatMemberInviteByMr) && epx.f(this.E, ((MsgChatMemberInviteByMr) obj).E);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final int hashCode() {
        return Long.hashCode(this.E.b);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final String toString() {
        return eq.a(new StringBuilder("MsgChatMemberInviteByMr(member="), this.E, ')');
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgChatMemberInviteByMr(this.E);
    }

    public MsgChatMemberInviteByMr(Serializer serializer, zcl zclVar) {
        this((Peer) serializer.G(Peer.class.getClassLoader()));
    }
}
