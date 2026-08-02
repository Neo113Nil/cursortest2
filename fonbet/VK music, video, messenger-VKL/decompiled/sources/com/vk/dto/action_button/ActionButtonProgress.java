package com.vk.dto.action_button;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.vu5;

/* compiled from: ActionButtonProgress.kt */
/* loaded from: classes18.dex */
public final class ActionButtonProgress implements Serializer.StreamParcelable {
    public static final Serializer.c<ActionButtonProgress> CREATOR = new a();
    public final int b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionButtonProgress> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionButtonProgress a(Serializer serializer) {
            return new ActionButtonProgress(serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionButtonProgress[i];
        }
    }

    public ActionButtonProgress(int i) {
        this.b = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActionButtonProgress) && this.b == ((ActionButtonProgress) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("ActionButtonProgress(percent="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
