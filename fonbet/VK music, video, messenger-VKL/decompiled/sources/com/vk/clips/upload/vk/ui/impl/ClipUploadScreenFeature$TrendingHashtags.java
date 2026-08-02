package com.vk.clips.upload.vk.ui.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ClipUploadScreenFeature.kt */
/* loaded from: classes17.dex */
public final class ClipUploadScreenFeature$TrendingHashtags implements Parcelable {
    public static final ClipUploadScreenFeature$TrendingHashtags b = new ClipUploadScreenFeature$TrendingHashtags();
    public static final Parcelable.Creator<ClipUploadScreenFeature$TrendingHashtags> CREATOR = new a();

    /* compiled from: ClipUploadScreenFeature.kt */
    public static final class a implements Parcelable.Creator<ClipUploadScreenFeature$TrendingHashtags> {
        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$TrendingHashtags createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ClipUploadScreenFeature$TrendingHashtags.b;
        }

        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$TrendingHashtags[] newArray(int i) {
            return new ClipUploadScreenFeature$TrendingHashtags[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ClipUploadScreenFeature$TrendingHashtags);
    }

    public final int hashCode() {
        return -2056563272;
    }

    public final String toString() {
        return "TrendingHashtags";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
