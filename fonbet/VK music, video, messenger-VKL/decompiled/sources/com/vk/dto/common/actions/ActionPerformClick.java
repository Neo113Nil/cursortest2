package com.vk.dto.common.actions;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;

/* compiled from: ActionPerformClick.kt */
/* loaded from: classes18.dex */
public final class ActionPerformClick extends Action {
    public static final Serializer.c<ActionPerformClick> CREATOR = new a();
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionPerformClick> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionPerformClick a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new ActionPerformClick(H);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionPerformClick[i];
        }
    }

    public ActionPerformClick(String str) {
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jwt", this.c);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActionPerformClick) && epx.f(this.c, ((ActionPerformClick) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ActionPerformClick(jwt="), this.c, ')');
    }
}
