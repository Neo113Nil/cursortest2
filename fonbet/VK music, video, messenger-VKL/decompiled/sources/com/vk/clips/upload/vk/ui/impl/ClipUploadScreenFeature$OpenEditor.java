package com.vk.clips.upload.vk.ui.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ClipUploadScreenFeature.kt */
/* loaded from: classes17.dex */
public final class ClipUploadScreenFeature$OpenEditor implements Parcelable {
    public static final ClipUploadScreenFeature$OpenEditor b = new ClipUploadScreenFeature$OpenEditor();
    public static final Parcelable.Creator<ClipUploadScreenFeature$OpenEditor> CREATOR = new a();

    /* compiled from: ClipUploadScreenFeature.kt */
    public static final class a implements Parcelable.Creator<ClipUploadScreenFeature$OpenEditor> {
        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$OpenEditor createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ClipUploadScreenFeature$OpenEditor.b;
        }

        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$OpenEditor[] newArray(int i) {
            return new ClipUploadScreenFeature$OpenEditor[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ClipUploadScreenFeature$OpenEditor);
    }

    public final int hashCode() {
        return 1586106531;
    }

    public final String toString() {
        return "OpenEditor";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
