package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: MsgChatStyleUpdate.kt */
/* loaded from: classes2.dex */
public final class MsgChatStyleUpdate extends Msg {
    public static final Serializer.c<MsgChatStyleUpdate> CREATOR = new a();
    public String E;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgChatStyleUpdate> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgChatStyleUpdate a(Serializer serializer) {
            return new MsgChatStyleUpdate(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgChatStyleUpdate[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MsgChatStyleUpdate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final void Rb(Serializer serializer) {
        this.E = serializer.H();
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final void Sb(Serializer serializer) {
        serializer.j0(this.E);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MsgChatStyleUpdate) && epx.f(this.E, ((MsgChatStyleUpdate) obj).E);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final int hashCode() {
        String str = this.E;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final String toString() {
        return ho8.a(new StringBuilder("MsgChatStyleUpdate(style="), this.E, ')');
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgChatStyleUpdate(this.E);
    }

    public /* synthetic */ MsgChatStyleUpdate(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }

    public MsgChatStyleUpdate(String str) {
        this.E = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MsgChatStyleUpdate(Serializer serializer, zcl zclVar) {
        this(null, 1, 0 == true ? 1 : 0);
        Bb(serializer);
    }
}
