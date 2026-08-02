package com.vk.im.engine.models.messages;

import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.vu5;
import xsna.zcl;

/* compiled from: MsgPin.kt */
/* loaded from: classes2.dex */
public final class MsgPin extends Msg {
    public static final Serializer.c<MsgPin> CREATOR = new a();
    public String E;
    public int F;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgPin> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgPin a(Serializer serializer) {
            return new MsgPin(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgPin[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MsgPin() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final void Rb(Serializer serializer) {
        this.E = serializer.H();
        this.F = serializer.u();
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final void Sb(Serializer serializer) {
        serializer.j0(this.E);
        serializer.S(this.F);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MsgPin)) {
            return false;
        }
        MsgPin msgPin = (MsgPin) obj;
        return epx.f(this.E, msgPin.E) && this.F == msgPin.F;
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final int hashCode() {
        return Integer.hashCode(this.F) + (this.E.hashCode() * 31);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPin(pinnedMsgBody='");
        BuildInfo.Client client = BuildInfo.a;
        sb.append(BuildInfo.d(this.E));
        sb.append("', pinnedMsgConvId=");
        return vu5.b(sb, this.F, ')');
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgPin(this.E, this.F);
    }

    public /* synthetic */ MsgPin(String str, int i, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }

    public MsgPin(String str, int i) {
        this.E = str;
        this.F = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MsgPin(Serializer serializer, zcl zclVar) {
        this(null, 0, 3, 0 == true ? 1 : 0);
        Bb(serializer);
    }
}
