package com.vk.dto.action_button;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.vu5;

/* compiled from: ActionButtonDonutGoal.kt */
/* loaded from: classes18.dex */
public final class ActionButtonDonutGoal implements Serializer.StreamParcelable {
    public static final Serializer.c<ActionButtonDonutGoal> CREATOR = new a();
    public final long b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionButtonDonutGoal> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionButtonDonutGoal a(Serializer serializer) {
            return new ActionButtonDonutGoal(serializer.w());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionButtonDonutGoal[i];
        }
    }

    public ActionButtonDonutGoal(long j) {
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
        return (obj instanceof ActionButtonDonutGoal) && this.b == ((ActionButtonDonutGoal) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("ActionButtonDonutGoal(goalId="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
