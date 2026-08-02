package com.vk.clips.upload.vk.ui.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ClipUploadScreenFeature.kt */
/* loaded from: classes17.dex */
public final class ClipUploadScreenFeature$Playlists implements Parcelable {
    public static final ClipUploadScreenFeature$Playlists b = new ClipUploadScreenFeature$Playlists();
    public static final Parcelable.Creator<ClipUploadScreenFeature$Playlists> CREATOR = new a();

    /* compiled from: ClipUploadScreenFeature.kt */
    public static final class a implements Parcelable.Creator<ClipUploadScreenFeature$Playlists> {
        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$Playlists createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ClipUploadScreenFeature$Playlists.b;
        }

        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$Playlists[] newArray(int i) {
            return new ClipUploadScreenFeature$Playlists[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ClipUploadScreenFeature$Playlists);
    }

    public final int hashCode() {
        return 819905301;
    }

    public final String toString() {
        return "Playlists";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
