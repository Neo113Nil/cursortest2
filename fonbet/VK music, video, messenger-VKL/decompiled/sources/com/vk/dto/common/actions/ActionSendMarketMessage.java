package com.vk.dto.common.actions;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;

/* compiled from: ActionSendMarketMessage.kt */
/* loaded from: classes18.dex */
public final class ActionSendMarketMessage extends Action {
    public static final Serializer.c<ActionSendMarketMessage> CREATOR = new a();
    public final long c;
    public final String d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionSendMarketMessage> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionSendMarketMessage a(Serializer serializer) {
            return new ActionSendMarketMessage(serializer.w(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionSendMarketMessage[i];
        }
    }

    public ActionSendMarketMessage(long j, String str) {
        this.c = j;
        this.d = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.c);
        serializer.j0(this.d);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("peer_id", this.c);
        jSONObject.put("message", this.d);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionSendMarketMessage)) {
            return false;
        }
        ActionSendMarketMessage actionSendMarketMessage = (ActionSendMarketMessage) obj;
        return this.c == actionSendMarketMessage.c && epx.f(this.d, actionSendMarketMessage.d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.c) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionSendMarketMessage(peerId=");
        sb.append(this.c);
        sb.append(", message=");
        return ho8.a(sb, this.d, ')');
    }
}
