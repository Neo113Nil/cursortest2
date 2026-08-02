package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import xsna.zcl;

/* compiled from: MsgCallAsrFailed.kt */
/* loaded from: classes2.dex */
public final class MsgCallAsrFailed extends Msg {
    public static final Serializer.c<MsgCallAsrFailed> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgCallAsrFailed> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgCallAsrFailed a(Serializer serializer) {
            return new MsgCallAsrFailed(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgCallAsrFailed[i];
        }
    }

    public MsgCallAsrFailed() {
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MsgCallAsrFailed) && super.equals(obj);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final String toString() {
        return "MsgCallAsrFailed() " + super.toString();
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgCallAsrFailed(this);
    }

    public MsgCallAsrFailed(MsgCallAsrFailed msgCallAsrFailed) {
        Ab(msgCallAsrFailed);
    }

    public MsgCallAsrFailed(Serializer serializer, zcl zclVar) {
        Bb(serializer);
    }
}
