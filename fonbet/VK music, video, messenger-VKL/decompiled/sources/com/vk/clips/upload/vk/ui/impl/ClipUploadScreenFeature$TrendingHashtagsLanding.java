package com.vk.clips.upload.vk.ui.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ClipUploadScreenFeature.kt */
/* loaded from: classes17.dex */
public final class ClipUploadScreenFeature$TrendingHashtagsLanding implements Parcelable {
    public static final ClipUploadScreenFeature$TrendingHashtagsLanding b = new ClipUploadScreenFeature$TrendingHashtagsLanding();
    public static final Parcelable.Creator<ClipUploadScreenFeature$TrendingHashtagsLanding> CREATOR = new a();

    /* compiled from: ClipUploadScreenFeature.kt */
    public static final class a implements Parcelable.Creator<ClipUploadScreenFeature$TrendingHashtagsLanding> {
        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$TrendingHashtagsLanding createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ClipUploadScreenFeature$TrendingHashtagsLanding.b;
        }

        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$TrendingHashtagsLanding[] newArray(int i) {
            return new ClipUploadScreenFeature$TrendingHashtagsLanding[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ClipUploadScreenFeature$TrendingHashtagsLanding);
    }

    public final int hashCode() {
        return 1779440959;
    }

    public final String toString() {
        return "TrendingHashtagsLanding";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
