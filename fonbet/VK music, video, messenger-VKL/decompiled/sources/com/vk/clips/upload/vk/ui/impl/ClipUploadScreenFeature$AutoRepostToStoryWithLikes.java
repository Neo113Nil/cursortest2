package com.vk.clips.upload.vk.ui.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ClipUploadScreenFeature.kt */
/* loaded from: classes17.dex */
public final class ClipUploadScreenFeature$AutoRepostToStoryWithLikes implements Parcelable {
    public static final ClipUploadScreenFeature$AutoRepostToStoryWithLikes b = new ClipUploadScreenFeature$AutoRepostToStoryWithLikes();
    public static final Parcelable.Creator<ClipUploadScreenFeature$AutoRepostToStoryWithLikes> CREATOR = new a();

    /* compiled from: ClipUploadScreenFeature.kt */
    public static final class a implements Parcelable.Creator<ClipUploadScreenFeature$AutoRepostToStoryWithLikes> {
        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$AutoRepostToStoryWithLikes createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ClipUploadScreenFeature$AutoRepostToStoryWithLikes.b;
        }

        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$AutoRepostToStoryWithLikes[] newArray(int i) {
            return new ClipUploadScreenFeature$AutoRepostToStoryWithLikes[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ClipUploadScreenFeature$AutoRepostToStoryWithLikes);
    }

    public final int hashCode() {
        return -2086255414;
    }

    public final String toString() {
        return "AutoRepostToStoryWithLikes";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
