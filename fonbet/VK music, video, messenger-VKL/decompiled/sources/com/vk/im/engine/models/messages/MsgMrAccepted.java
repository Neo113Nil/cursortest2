package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import xsna.epx;
import xsna.eq;
import xsna.ltx0;
import xsna.zcl;

/* compiled from: MsgMrAccepted.kt */
/* loaded from: classes2.dex */
public final class MsgMrAccepted extends Msg implements ltx0 {
    public static final Serializer.c<MsgMrAccepted> CREATOR = new a();
    public Peer E;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgMrAccepted> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgMrAccepted a(Serializer serializer) {
            return new MsgMrAccepted(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgMrAccepted[i];
        }
    }

    public MsgMrAccepted(Peer peer) {
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
        return (obj instanceof MsgMrAccepted) && epx.f(this.E, ((MsgMrAccepted) obj).E);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final int hashCode() {
        return Long.hashCode(this.E.b);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final String toString() {
        return eq.a(new StringBuilder("MsgMrAccepted(member="), this.E, ')');
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgMrAccepted(this.E);
    }

    public MsgMrAccepted(Serializer serializer, zcl zclVar) {
        this((Peer) serializer.G(Peer.class.getClassLoader()));
    }
}
