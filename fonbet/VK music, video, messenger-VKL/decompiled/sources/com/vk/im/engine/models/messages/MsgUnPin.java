package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import xsna.vu5;
import xsna.zcl;

/* compiled from: MsgUnPin.kt */
/* loaded from: classes2.dex */
public final class MsgUnPin extends Msg {
    public static final Serializer.c<MsgUnPin> CREATOR = new a();
    public int E;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgUnPin> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgUnPin a(Serializer serializer) {
            return new MsgUnPin(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgUnPin[i];
        }
    }

    public MsgUnPin() {
        this(0, 1, null);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final void Rb(Serializer serializer) {
        this.E = serializer.u();
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final void Sb(Serializer serializer) {
        serializer.S(this.E);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MsgUnPin) && this.E == ((MsgUnPin) obj).E;
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final int hashCode() {
        return Integer.hashCode(this.E);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final String toString() {
        return vu5.b(new StringBuilder("MsgUnPin(pinnedMsgConvId="), this.E, ')');
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgUnPin(this.E);
    }

    public MsgUnPin(int i) {
        this.E = i;
    }

    public /* synthetic */ MsgUnPin(int i, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public MsgUnPin(Serializer serializer, zcl zclVar) {
        this(0, 1, null);
        Bb(serializer);
    }
}
