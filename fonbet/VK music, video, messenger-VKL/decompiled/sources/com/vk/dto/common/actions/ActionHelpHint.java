package com.vk.dto.common.actions;

import com.vk.core.serialize.Serializer;
import com.vk.dto.hints.Hint;
import org.json.JSONObject;
import xsna.epx;
import xsna.yq;

/* compiled from: ActionHelpHint.kt */
/* loaded from: classes18.dex */
public final class ActionHelpHint extends Action {
    public static final Serializer.c<ActionHelpHint> CREATOR = new a();
    public final Hint c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionHelpHint> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionHelpHint a(Serializer serializer) {
            return new ActionHelpHint((Hint) serializer.G(Hint.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionHelpHint[i];
        }
    }

    public ActionHelpHint(Hint hint) {
        this.c = hint;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject d = yq.d("type", "help_hint");
        d.put("help_hint", this.c.Ab());
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActionHelpHint) && epx.f(this.c, ((ActionHelpHint) obj).c);
    }

    public final int hashCode() {
        return this.c.b.hashCode();
    }

    public final String toString() {
        return "ActionHelpHint(hint=" + this.c + ')';
    }
}
