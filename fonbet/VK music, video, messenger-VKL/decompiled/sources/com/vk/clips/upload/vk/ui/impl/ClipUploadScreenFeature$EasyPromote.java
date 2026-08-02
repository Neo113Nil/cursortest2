package com.vk.clips.upload.vk.ui.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ClipUploadScreenFeature.kt */
/* loaded from: classes17.dex */
public final class ClipUploadScreenFeature$EasyPromote implements Parcelable {
    public static final ClipUploadScreenFeature$EasyPromote b = new ClipUploadScreenFeature$EasyPromote();
    public static final Parcelable.Creator<ClipUploadScreenFeature$EasyPromote> CREATOR = new a();

    /* compiled from: ClipUploadScreenFeature.kt */
    public static final class a implements Parcelable.Creator<ClipUploadScreenFeature$EasyPromote> {
        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$EasyPromote createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ClipUploadScreenFeature$EasyPromote.b;
        }

        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$EasyPromote[] newArray(int i) {
            return new ClipUploadScreenFeature$EasyPromote[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ClipUploadScreenFeature$EasyPromote);
    }

    public final int hashCode() {
        return 1107307154;
    }

    public final String toString() {
        return "EasyPromote";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
