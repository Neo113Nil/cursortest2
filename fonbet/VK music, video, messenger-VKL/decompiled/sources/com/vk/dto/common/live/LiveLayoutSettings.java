package com.vk.dto.common.live;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import org.json.JSONObject;

/* compiled from: LiveLayoutSettings.kt */
/* loaded from: classes18.dex */
public final class LiveLayoutSettings extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<LiveLayoutSettings> CREATOR = new a();
    public final boolean b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<LiveLayoutSettings> {
        @Override // com.vk.core.serialize.Serializer.c
        public final LiveLayoutSettings a(Serializer serializer) {
            return new LiveLayoutSettings(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LiveLayoutSettings[i];
        }
    }

    public LiveLayoutSettings(boolean z) {
        this.b = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiveLayoutSettings) && this.b == ((LiveLayoutSettings) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return q0.a(new StringBuilder("LiveLayoutSettings(showChat="), this.b, ')');
    }

    public final boolean zb() {
        return this.b;
    }

    public LiveLayoutSettings(Serializer serializer) {
        this(serializer.m());
    }

    public LiveLayoutSettings(JSONObject jSONObject) {
        this(jSONObject.optBoolean("show_chat", true));
    }
}
