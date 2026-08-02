package com.vk.clips.upload.vk.ui.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ClipUploadScreenFeature.kt */
/* loaded from: classes17.dex */
public final class ClipUploadScreenFeature$Products implements Parcelable {
    public static final ClipUploadScreenFeature$Products b = new ClipUploadScreenFeature$Products();
    public static final Parcelable.Creator<ClipUploadScreenFeature$Products> CREATOR = new a();

    /* compiled from: ClipUploadScreenFeature.kt */
    public static final class a implements Parcelable.Creator<ClipUploadScreenFeature$Products> {
        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$Products createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ClipUploadScreenFeature$Products.b;
        }

        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$Products[] newArray(int i) {
            return new ClipUploadScreenFeature$Products[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ClipUploadScreenFeature$Products);
    }

    public final int hashCode() {
        return 1022537904;
    }

    public final String toString() {
        return "Products";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
