package com.vk.clips.upload.vk.ui.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ClipUploadScreenFeature.kt */
/* loaded from: classes17.dex */
public final class ClipUploadScreenFeature$BroadcastEventOnDraftSavedByUser implements Parcelable {
    public static final ClipUploadScreenFeature$BroadcastEventOnDraftSavedByUser b = new ClipUploadScreenFeature$BroadcastEventOnDraftSavedByUser();
    public static final Parcelable.Creator<ClipUploadScreenFeature$BroadcastEventOnDraftSavedByUser> CREATOR = new a();

    /* compiled from: ClipUploadScreenFeature.kt */
    public static final class a implements Parcelable.Creator<ClipUploadScreenFeature$BroadcastEventOnDraftSavedByUser> {
        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$BroadcastEventOnDraftSavedByUser createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ClipUploadScreenFeature$BroadcastEventOnDraftSavedByUser.b;
        }

        @Override // android.os.Parcelable.Creator
        public final ClipUploadScreenFeature$BroadcastEventOnDraftSavedByUser[] newArray(int i) {
            return new ClipUploadScreenFeature$BroadcastEventOnDraftSavedByUser[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ClipUploadScreenFeature$BroadcastEventOnDraftSavedByUser);
    }

    public final int hashCode() {
        return -1790991540;
    }

    public final String toString() {
        return "BroadcastEventOnDraftSavedByUser";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
