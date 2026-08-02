package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import xsna.epx;
import xsna.eq;
import xsna.zcl;

/* compiled from: MsgSentMessageRequest.kt */
/* loaded from: classes2.dex */
public final class MsgSentMessageRequest extends Msg {
    public static final Serializer.c<MsgSentMessageRequest> CREATOR = new a();
    public Peer E;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgSentMessageRequest> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgSentMessageRequest a(Serializer serializer) {
            return new MsgSentMessageRequest(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgSentMessageRequest[i];
        }
    }

    public MsgSentMessageRequest(Peer peer) {
        this.E = peer;
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
    public final void Vb(Peer peer) {
        this.E = peer;
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MsgSentMessageRequest) && epx.f(this.E, ((MsgSentMessageRequest) obj).E);
    }

    @Override // com.vk.im.engine.models.messages.Msg, xsna.vsx0
    public final Peer getFrom() {
        return this.E;
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final int hashCode() {
        return Long.hashCode(this.E.b);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final String toString() {
        return eq.a(new StringBuilder("MsgSentMessageRequest(from="), this.E, ')');
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgSentMessageRequest(this.E);
    }

    public MsgSentMessageRequest(Serializer serializer, zcl zclVar) {
        this((Peer) serializer.G(Peer.class.getClassLoader()));
    }
}
