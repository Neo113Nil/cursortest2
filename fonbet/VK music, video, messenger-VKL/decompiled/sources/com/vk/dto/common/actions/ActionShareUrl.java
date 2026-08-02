package com.vk.dto.common.actions;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import org.json.JSONObject;
import xsna.epx;
import xsna.yq;

/* compiled from: ActionShareUrl.kt */
/* loaded from: classes18.dex */
public final class ActionShareUrl extends Action {
    public static final Serializer.c<ActionShareUrl> CREATOR = new a();
    public final String c;
    public final boolean d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionShareUrl> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionShareUrl a(Serializer serializer) {
            return new ActionShareUrl(serializer.H(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionShareUrl[i];
        }
    }

    public ActionShareUrl(String str, boolean z) {
        this.c = str;
        this.d = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject d = yq.d("type", "share");
        d.put("url", this.c);
        d.put("disable_message", this.d);
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionShareUrl)) {
            return false;
        }
        ActionShareUrl actionShareUrl = (ActionShareUrl) obj;
        return epx.f(this.c, actionShareUrl.c) && this.d == actionShareUrl.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionShareUrl(url=");
        sb.append(this.c);
        sb.append(", isDirectMessageActionDisabled=");
        return q0.a(sb, this.d, ')');
    }
}
