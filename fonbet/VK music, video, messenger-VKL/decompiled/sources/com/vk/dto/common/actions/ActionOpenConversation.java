package com.vk.dto.common.actions;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.vu5;
import xsna.yq;

/* compiled from: ActionOpenConversation.kt */
/* loaded from: classes18.dex */
public final class ActionOpenConversation extends Action {
    public static final Serializer.c<ActionOpenConversation> CREATOR = new a();
    public final long c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionOpenConversation> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionOpenConversation a(Serializer serializer) {
            return new ActionOpenConversation(serializer.w());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionOpenConversation[i];
        }
    }

    public ActionOpenConversation(long j) {
        this.c = j;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject d = yq.d("type", "open_conversation");
        d.put("peer_id", this.c);
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActionOpenConversation) && this.c == ((ActionOpenConversation) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return vu5.a(')', this.c, new StringBuilder("ActionOpenConversation(peerId="));
    }
}
