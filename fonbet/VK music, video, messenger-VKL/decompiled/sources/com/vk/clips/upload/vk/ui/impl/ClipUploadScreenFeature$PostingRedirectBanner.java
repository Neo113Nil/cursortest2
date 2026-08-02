package com.vk.clips.upload.vk.ui.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ClipUploadScreenFeature.kt */
/* loaded from: classes17.dex */
public final class ClipUploadScreenFeature$PostingRedirectBanner implements Parcelable {
    public static final ClipUploadScreenFeature$PostingRedirectBanner b = new ClipUploadScreenFeature$PostingRedirectBanner();
    public static final Parcelable.Creator<ClipUploadScreenFeature$PostingRedirectBanner> CREATOR = new a();

    /* compiled from: ClipUploadScreenFeature.kt */
    public static final class a implements Parcelable.Creator<ClipUploadScreenFeature$PostingRedirectBanner> {
        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$PostingRedirectBanner createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ClipUploadScreenFeature$PostingRedirectBanner.b;
        }

        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$PostingRedirectBanner[] newArray(int i) {
            return new ClipUploadScreenFeature$PostingRedirectBanner[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ClipUploadScreenFeature$PostingRedirectBanner);
    }

    public final int hashCode() {
        return -1291577794;
    }

    public final String toString() {
        return "PostingRedirectBanner";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
