package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import xsna.zcl;

/* compiled from: MsgScreenshot.kt */
/* loaded from: classes2.dex */
public final class MsgScreenshot extends Msg {
    public static final Serializer.c<MsgScreenshot> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgScreenshot> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgScreenshot a(Serializer serializer) {
            return new MsgScreenshot(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgScreenshot[i];
        }
    }

    public MsgScreenshot() {
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MsgScreenshot) && super.equals(obj);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final String toString() {
        return "MsgScreenshot() " + super.toString();
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgScreenshot(this);
    }

    public MsgScreenshot(MsgScreenshot msgScreenshot) {
        Ab(msgScreenshot);
    }

    public MsgScreenshot(Serializer serializer, zcl zclVar) {
        Bb(serializer);
    }
}
