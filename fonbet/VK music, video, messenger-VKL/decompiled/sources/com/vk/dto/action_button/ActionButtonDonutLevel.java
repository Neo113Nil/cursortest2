package com.vk.dto.action_button;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.vu5;

/* compiled from: ActionButtonDonutLevel.kt */
/* loaded from: classes18.dex */
public final class ActionButtonDonutLevel implements Serializer.StreamParcelable {
    public static final Serializer.c<ActionButtonDonutLevel> CREATOR = new a();
    public final long b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionButtonDonutLevel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionButtonDonutLevel a(Serializer serializer) {
            return new ActionButtonDonutLevel(serializer.w());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionButtonDonutLevel[i];
        }
    }

    public ActionButtonDonutLevel(long j) {
        this.b = j;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActionButtonDonutLevel) && this.b == ((ActionButtonDonutLevel) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("ActionButtonDonutLevel(levelId="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
