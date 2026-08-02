package com.vk.clips.upload.vk.ui.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ClipUploadScreenFeature.kt */
/* loaded from: classes17.dex */
public final class ClipUploadScreenFeature$OpenChannelFromClip implements Parcelable {
    public static final ClipUploadScreenFeature$OpenChannelFromClip b = new ClipUploadScreenFeature$OpenChannelFromClip();
    public static final Parcelable.Creator<ClipUploadScreenFeature$OpenChannelFromClip> CREATOR = new a();

    /* compiled from: ClipUploadScreenFeature.kt */
    public static final class a implements Parcelable.Creator<ClipUploadScreenFeature$OpenChannelFromClip> {
        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$OpenChannelFromClip createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ClipUploadScreenFeature$OpenChannelFromClip.b;
        }

        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$OpenChannelFromClip[] newArray(int i) {
            return new ClipUploadScreenFeature$OpenChannelFromClip[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ClipUploadScreenFeature$OpenChannelFromClip);
    }

    public final int hashCode() {
        return -102021689;
    }

    public final String toString() {
        return "OpenChannelFromClip";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
