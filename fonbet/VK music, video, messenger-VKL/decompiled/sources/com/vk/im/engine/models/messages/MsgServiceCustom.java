package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: MsgServiceCustom.kt */
/* loaded from: classes2.dex */
public final class MsgServiceCustom extends Msg {
    public static final Serializer.c<MsgServiceCustom> CREATOR = new a();
    public String E;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgServiceCustom> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgServiceCustom a(Serializer serializer) {
            return new MsgServiceCustom(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgServiceCustom[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MsgServiceCustom() {
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
        return (obj instanceof MsgServiceCustom) && epx.f(this.E, ((MsgServiceCustom) obj).E);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final String toString() {
        return ho8.a(new StringBuilder("MsgServiceCustom(msgBody="), this.E, ')');
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgServiceCustom(this.E);
    }

    public MsgServiceCustom(String str) {
        this.E = str;
    }

    public /* synthetic */ MsgServiceCustom(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? "" : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MsgServiceCustom(Msg msg) {
        this(null, 1, 0 == true ? 1 : 0);
        Ab(msg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MsgServiceCustom(Serializer serializer, zcl zclVar) {
        this(null, 1, 0 == true ? 1 : 0);
        Bb(serializer);
    }
}
