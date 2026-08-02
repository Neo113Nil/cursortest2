package com.vk.clips.upload.vk.ui.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ClipUploadScreenFeature.kt */
/* loaded from: classes17.dex */
public final class ClipUploadScreenFeature$DelayedPublication implements Parcelable {
    public static final ClipUploadScreenFeature$DelayedPublication b = new ClipUploadScreenFeature$DelayedPublication();
    public static final Parcelable.Creator<ClipUploadScreenFeature$DelayedPublication> CREATOR = new a();

    /* compiled from: ClipUploadScreenFeature.kt */
    public static final class a implements Parcelable.Creator<ClipUploadScreenFeature$DelayedPublication> {
        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$DelayedPublication createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ClipUploadScreenFeature$DelayedPublication.b;
        }

        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$DelayedPublication[] newArray(int i) {
            return new ClipUploadScreenFeature$DelayedPublication[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ClipUploadScreenFeature$DelayedPublication);
    }

    public final int hashCode() {
        return -157370442;
    }

    public final String toString() {
        return "DelayedPublication";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
