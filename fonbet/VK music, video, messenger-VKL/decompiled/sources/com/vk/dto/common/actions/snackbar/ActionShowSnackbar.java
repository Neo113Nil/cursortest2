package com.vk.dto.common.actions.snackbar;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.actions.Action;
import org.json.JSONObject;
import xsna.epx;
import xsna.f8k0;
import xsna.yq;

/* compiled from: ActionShowSnackbar.kt */
/* loaded from: classes18.dex */
public final class ActionShowSnackbar extends Action {
    public static final Serializer.c<ActionShowSnackbar> CREATOR = new a();
    public final String c;
    public final f8k0 d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionShowSnackbar> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionShowSnackbar a(Serializer serializer) {
            return new ActionShowSnackbar(serializer.H(), new f8k0(serializer.H(), serializer.H()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionShowSnackbar[i];
        }
    }

    public ActionShowSnackbar(String str, f8k0 f8k0Var) {
        this.c = str;
        this.d = f8k0Var;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        f8k0 f8k0Var = this.d;
        serializer.j0(f8k0Var.a);
        serializer.j0(f8k0Var.b);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject d = yq.d("type", "show_snackbar");
        d.put("message", this.c);
        JSONObject jSONObject = new JSONObject();
        f8k0 f8k0Var = this.d;
        jSONObject.put("type", f8k0Var.a);
        jSONObject.put("color", f8k0Var.b);
        d.put("icon", jSONObject);
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionShowSnackbar)) {
            return false;
        }
        ActionShowSnackbar actionShowSnackbar = (ActionShowSnackbar) obj;
        return epx.f(this.c, actionShowSnackbar.c) && epx.f(this.d, actionShowSnackbar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "ActionShowSnackbar(message=" + this.c + ", icon=" + this.d + ')';
    }
}
