package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import xsna.zcl;

/* compiled from: MsgUnsupported.kt */
/* loaded from: classes2.dex */
public final class MsgUnsupported extends Msg {
    public static final Serializer.c<MsgUnsupported> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgUnsupported> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgUnsupported a(Serializer serializer) {
            return new MsgUnsupported(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgUnsupported[i];
        }
    }

    public MsgUnsupported() {
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final void Ab(Msg msg) {
        throw null;
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MsgUnsupported) && super.equals(obj);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final String toString() {
        return "MsgUnsupported() " + super.toString();
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgUnsupported(this);
    }

    public MsgUnsupported(MsgUnsupported msgUnsupported) {
        super.Ab(msgUnsupported);
    }

    public MsgUnsupported(Msg msg) {
        super.Ab(msg);
    }

    public MsgUnsupported(Serializer serializer, zcl zclVar) {
        Bb(serializer);
    }
}
