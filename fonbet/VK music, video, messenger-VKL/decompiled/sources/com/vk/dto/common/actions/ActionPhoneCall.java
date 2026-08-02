package com.vk.dto.common.actions;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;

/* compiled from: ActionPhoneCall.kt */
/* loaded from: classes18.dex */
public final class ActionPhoneCall extends Action {
    public static final Serializer.c<ActionPhoneCall> CREATOR = new a();
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionPhoneCall> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionPhoneCall a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new ActionPhoneCall(H);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionPhoneCall[i];
        }
    }

    public ActionPhoneCall(String str) {
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phone", this.c);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActionPhoneCall) && epx.f(this.c, ((ActionPhoneCall) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ActionPhoneCall(phone="), this.c, ')');
    }
}
