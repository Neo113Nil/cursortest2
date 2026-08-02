package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import xsna.zcl;

/* compiled from: MsgGroupCallStarted.kt */
/* loaded from: classes2.dex */
public final class MsgGroupCallStarted extends Msg {
    public static final Serializer.c<MsgGroupCallStarted> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgGroupCallStarted> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgGroupCallStarted a(Serializer serializer) {
            return new MsgGroupCallStarted(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgGroupCallStarted[i];
        }
    }

    public MsgGroupCallStarted() {
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MsgGroupCallStarted) && super.equals(obj);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final String toString() {
        return "MsgGroupCallStarted() " + super.toString();
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgGroupCallStarted(this);
    }

    public MsgGroupCallStarted(MsgGroupCallStarted msgGroupCallStarted) {
        Ab(msgGroupCallStarted);
    }

    public MsgGroupCallStarted(Serializer serializer, zcl zclVar) {
        Bb(serializer);
    }
}
