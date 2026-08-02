package com.vk.uxpolls.presentation.js.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: UxPollsSetHeight.kt */
/* loaded from: classes6.dex */
public final class UxPollsSetHeight implements Parcelable {
    public static final Parcelable.Creator<UxPollsSetHeight> CREATOR = new a();

    @pmi0("height")
    private final int height;

    /* compiled from: UxPollsSetHeight.kt */
    public static final class a implements Parcelable.Creator<UxPollsSetHeight> {
        @Override // android.os.Parcelable.Creator
        public final UxPollsSetHeight createFromParcel(Parcel parcel) {
            return new UxPollsSetHeight(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final UxPollsSetHeight[] newArray(int i) {
            return new UxPollsSetHeight[i];
        }
    }

    public UxPollsSetHeight(int i) {
        this.height = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UxPollsSetHeight) && this.height == ((UxPollsSetHeight) obj).height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int hashCode() {
        return Integer.hashCode(this.height);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("UxPollsSetHeight(height="), this.height, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.height);
    }
}
