package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: MsgIncomingCallPrivacy.kt */
/* loaded from: classes2.dex */
public final class MsgIncomingCallPrivacy extends Msg {
    public static final Serializer.c<MsgIncomingCallPrivacy> CREATOR = new a();
    public String E;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgIncomingCallPrivacy> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgIncomingCallPrivacy a(Serializer serializer) {
            return new MsgIncomingCallPrivacy(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgIncomingCallPrivacy[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MsgIncomingCallPrivacy() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final void Rb(Serializer serializer) {
        String H = serializer.H();
        if (H == null) {
            H = "";
        }
        this.E = H;
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
        return (obj instanceof MsgIncomingCallPrivacy) && epx.f(this.E, ((MsgIncomingCallPrivacy) obj).E);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final String toString() {
        return ho8.a(new StringBuilder("MsgIncomingCallPrivacy(compatMessage="), this.E, ')');
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgIncomingCallPrivacy(this.E);
    }

    public MsgIncomingCallPrivacy(String str) {
        this.E = str;
    }

    public /* synthetic */ MsgIncomingCallPrivacy(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? "" : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MsgIncomingCallPrivacy(Serializer serializer, zcl zclVar) {
        this(null, 1, 0 == true ? 1 : 0);
        Bb(serializer);
    }
}
