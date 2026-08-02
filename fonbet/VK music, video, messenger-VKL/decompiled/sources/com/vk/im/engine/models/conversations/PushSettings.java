package com.vk.im.engine.models.conversations;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.vu5;
import xsna.zcl;

/* compiled from: PushSettings.kt */
/* loaded from: classes2.dex */
public final class PushSettings implements Serializer.StreamParcelable {
    public static final Serializer.c<PushSettings> CREATOR = new a();
    public final boolean b;
    public final long c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PushSettings> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PushSettings a(Serializer serializer) {
            return new PushSettings(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PushSettings[i];
        }
    }

    public PushSettings() {
        this.b = true;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.Y(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushSettings)) {
            return false;
        }
        PushSettings pushSettings = (PushSettings) obj;
        return this.b == pushSettings.b && this.c == pushSettings.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushSettings(isUseSound=");
        sb.append(this.b);
        sb.append(", disabledUntil=");
        return vu5.a(')', this.c, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public PushSettings(boolean z, long j) {
        this.b = z;
        this.c = j;
    }

    public PushSettings(Serializer serializer, zcl zclVar) {
        this();
        this.b = serializer.m();
        this.c = serializer.w();
    }
}
