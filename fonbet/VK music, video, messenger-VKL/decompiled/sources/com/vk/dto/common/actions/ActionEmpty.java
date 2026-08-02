package com.vk.dto.common.actions;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;

/* compiled from: ActionEmpty.kt */
/* loaded from: classes18.dex */
public final class ActionEmpty extends Action {
    public static final Serializer.c<ActionEmpty> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionEmpty> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionEmpty a(Serializer serializer) {
            return new ActionEmpty();
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionEmpty[i];
        }
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return new JSONObject();
    }

    public final boolean equals(Object obj) {
        return obj instanceof ActionEmpty;
    }

    public final int hashCode() {
        return ActionEmpty.class.hashCode();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
    }
}
