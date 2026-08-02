package com.vk.dto.messages;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MsgTextFormat.kt */
/* loaded from: classes18.dex */
public final class MsgTextFormatItem extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<MsgTextFormatItem> CREATOR = new a();
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgTextFormatItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgTextFormatItem a(Serializer serializer) {
            return new MsgTextFormatItem(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgTextFormatItem[i];
        }
    }

    public /* synthetic */ MsgTextFormatItem(int i, int i2, String str, String str2, int i3, zcl zclVar) {
        this(i, i2, str, (i3 & 8) != 0 ? null : str2);
    }

    public static MsgTextFormatItem zb(MsgTextFormatItem msgTextFormatItem, int i, int i2, String str, int i3) {
        if ((i3 & 1) != 0) {
            i = msgTextFormatItem.b;
        }
        if ((i3 & 2) != 0) {
            i2 = msgTextFormatItem.c;
        }
        String str2 = msgTextFormatItem.d;
        if ((i3 & 8) != 0) {
            str = msgTextFormatItem.e;
        }
        msgTextFormatItem.getClass();
        return new MsgTextFormatItem(i, i2, str2, str);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.j0(this.d);
        serializer.m0(this.e);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SignalingProtocol.KEY_OFFSET, this.b);
        jSONObject.put("length", this.c);
        jSONObject.put("type", this.d);
        jSONObject.put("url", this.e);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MsgTextFormatItem)) {
            return false;
        }
        MsgTextFormatItem msgTextFormatItem = (MsgTextFormatItem) obj;
        return this.b == msgTextFormatItem.b && this.c == msgTextFormatItem.c && epx.f(this.d, msgTextFormatItem.d) && epx.f(this.e, msgTextFormatItem.e);
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d);
        String str = this.e;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgTextFormatItem(offset=");
        sb.append(this.b);
        sb.append(", length=");
        sb.append(this.c);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", url=");
        return ho8.a(sb, this.e, ')');
    }

    public MsgTextFormatItem(int i, int i2, String str, String str2) {
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
    }

    public MsgTextFormatItem(Serializer serializer, zcl zclVar) {
        this(serializer.u(), serializer.u(), serializer.H(), serializer.I());
    }
}
