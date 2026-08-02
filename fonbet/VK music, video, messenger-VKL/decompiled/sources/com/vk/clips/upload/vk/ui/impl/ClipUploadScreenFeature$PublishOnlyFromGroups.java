package com.vk.clips.upload.vk.ui.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ClipUploadScreenFeature.kt */
/* loaded from: classes17.dex */
public final class ClipUploadScreenFeature$PublishOnlyFromGroups implements Parcelable {
    public static final ClipUploadScreenFeature$PublishOnlyFromGroups b = new ClipUploadScreenFeature$PublishOnlyFromGroups();
    public static final Parcelable.Creator<ClipUploadScreenFeature$PublishOnlyFromGroups> CREATOR = new a();

    /* compiled from: ClipUploadScreenFeature.kt */
    public static final class a implements Parcelable.Creator<ClipUploadScreenFeature$PublishOnlyFromGroups> {
        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$PublishOnlyFromGroups createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ClipUploadScreenFeature$PublishOnlyFromGroups.b;
        }

        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$PublishOnlyFromGroups[] newArray(int i) {
            return new ClipUploadScreenFeature$PublishOnlyFromGroups[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ClipUploadScreenFeature$PublishOnlyFromGroups);
    }

    public final int hashCode() {
        return 1595116045;
    }

    public final String toString() {
        return "PublishOnlyFromGroups";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
