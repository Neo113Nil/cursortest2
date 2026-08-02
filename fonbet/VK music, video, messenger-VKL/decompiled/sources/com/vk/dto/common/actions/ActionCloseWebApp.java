package com.vk.dto.common.actions;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;

/* compiled from: ActionCloseWebApp.kt */
/* loaded from: classes18.dex */
public final class ActionCloseWebApp extends Action {
    public static final Serializer.c<ActionCloseWebApp> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionCloseWebApp> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionCloseWebApp a(Serializer serializer) {
            return new ActionCloseWebApp();
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionCloseWebApp[i];
        }
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return new JSONObject();
    }

    public final boolean equals(Object obj) {
        return obj instanceof ActionCloseWebApp;
    }

    public final int hashCode() {
        return ActionCloseWebApp.class.hashCode();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
    }
}
