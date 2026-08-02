package com.vk.clips.upload.vk.ui.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ClipUploadScreenFeature.kt */
/* loaded from: classes17.dex */
public final class ClipUploadScreenFeature$DraftsSave implements Parcelable {
    public static final ClipUploadScreenFeature$DraftsSave b = new ClipUploadScreenFeature$DraftsSave();
    public static final Parcelable.Creator<ClipUploadScreenFeature$DraftsSave> CREATOR = new a();

    /* compiled from: ClipUploadScreenFeature.kt */
    public static final class a implements Parcelable.Creator<ClipUploadScreenFeature$DraftsSave> {
        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$DraftsSave createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ClipUploadScreenFeature$DraftsSave.b;
        }

        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$DraftsSave[] newArray(int i) {
            return new ClipUploadScreenFeature$DraftsSave[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ClipUploadScreenFeature$DraftsSave);
    }

    public final int hashCode() {
        return 305226715;
    }

    public final String toString() {
        return "DraftsSave";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
