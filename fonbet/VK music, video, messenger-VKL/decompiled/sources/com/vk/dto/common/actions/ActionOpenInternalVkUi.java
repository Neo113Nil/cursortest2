package com.vk.dto.common.actions;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;
import xsna.yq;

/* compiled from: ActionOpenInternalVkUi.kt */
/* loaded from: classes18.dex */
public final class ActionOpenInternalVkUi extends Action {
    public static final Serializer.c<ActionOpenInternalVkUi> CREATOR = new a();
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionOpenInternalVkUi> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionOpenInternalVkUi a(Serializer serializer) {
            return new ActionOpenInternalVkUi(serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionOpenInternalVkUi[i];
        }
    }

    public ActionOpenInternalVkUi(String str) {
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject d = yq.d("type", "open_internal_vkui");
        d.put("url", this.c);
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActionOpenInternalVkUi) && epx.f(this.c, ((ActionOpenInternalVkUi) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ActionOpenInternalVkUi(url="), this.c, ')');
    }
}
