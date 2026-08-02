package com.vk.im.ui.components.msg_list;

import com.vk.core.serialize.Serializer;
import com.vk.dto.messages.MsgIdType;
import xsna.lhg;
import xsna.vu5;
import xsna.zcl;

/* compiled from: MsgListOpenMode.kt */
/* loaded from: classes2.dex */
public final class MsgListOpenAtMsgMode extends MsgListOpenMode {
    public static final Serializer.c<MsgListOpenAtMsgMode> CREATOR = new a();
    public final MsgIdType b;
    public final int c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgListOpenAtMsgMode> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgListOpenAtMsgMode a(Serializer serializer) {
            return new MsgListOpenAtMsgMode(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgListOpenAtMsgMode[i];
        }
    }

    public MsgListOpenAtMsgMode(MsgIdType msgIdType, int i) {
        super(null);
        this.b = msgIdType;
        this.c = i;
    }

    public final MsgIdType Ab() {
        return this.b;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b.h());
        serializer.S(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MsgListOpenAtMsgMode)) {
            return false;
        }
        MsgListOpenAtMsgMode msgListOpenAtMsgMode = (MsgListOpenAtMsgMode) obj;
        return this.b == msgListOpenAtMsgMode.b && this.c == msgListOpenAtMsgMode.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgListOpenAtMsgMode(msgIdType=");
        sb.append(this.b);
        sb.append(", msgId=");
        return vu5.b(sb, this.c, ')');
    }

    public final int zb() {
        return this.c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MsgListOpenAtMsgMode(Serializer serializer, zcl zclVar) {
        this(r3, serializer.u());
        MsgIdType msgIdType;
        MsgIdType.a aVar = MsgIdType.Companion;
        int u = serializer.u();
        aVar.getClass();
        MsgIdType[] values = MsgIdType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                msgIdType = null;
                break;
            }
            msgIdType = values[i];
            if (msgIdType.h() == u) {
                break;
            } else {
                i++;
            }
        }
        if (msgIdType == null) {
            throw new IllegalArgumentException(lhg.a(u, "Illegal id: "));
        }
    }
}
