package com.vk.clips.upload.vk.ui.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ClipUploadScreenFeature.kt */
/* loaded from: classes17.dex */
public final class ClipUploadScreenFeature$DraftsUi implements Parcelable {
    public static final ClipUploadScreenFeature$DraftsUi b = new ClipUploadScreenFeature$DraftsUi();
    public static final Parcelable.Creator<ClipUploadScreenFeature$DraftsUi> CREATOR = new a();

    /* compiled from: ClipUploadScreenFeature.kt */
    public static final class a implements Parcelable.Creator<ClipUploadScreenFeature$DraftsUi> {
        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$DraftsUi createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ClipUploadScreenFeature$DraftsUi.b;
        }

        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$DraftsUi[] newArray(int i) {
            return new ClipUploadScreenFeature$DraftsUi[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ClipUploadScreenFeature$DraftsUi);
    }

    public final int hashCode() {
        return 1184673906;
    }

    public final String toString() {
        return "DraftsUi";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
