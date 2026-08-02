package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import xsna.zcl;

/* compiled from: MsgJoinByLink.kt */
/* loaded from: classes2.dex */
public final class MsgJoinByLink extends Msg {
    public static final Serializer.c<MsgJoinByLink> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgJoinByLink> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgJoinByLink a(Serializer serializer) {
            return new MsgJoinByLink(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgJoinByLink[i];
        }
    }

    public MsgJoinByLink() {
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MsgJoinByLink) && super.equals(obj);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final String toString() {
        return "MsgJoinByLink() " + super.toString();
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgJoinByLink(this);
    }

    public MsgJoinByLink(MsgJoinByLink msgJoinByLink) {
        Ab(msgJoinByLink);
    }

    public MsgJoinByLink(Serializer serializer, zcl zclVar) {
        Bb(serializer);
    }
}
