package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;

/* compiled from: PostingAction.kt */
/* loaded from: classes4.dex */
public final class PostingAction$MediaPicker$Album$ReloadLocalAlbums implements PostingAction.MediaPicker {
    public static final PostingAction$MediaPicker$Album$ReloadLocalAlbums b = new PostingAction$MediaPicker$Album$ReloadLocalAlbums();
    public static final Parcelable.Creator<PostingAction$MediaPicker$Album$ReloadLocalAlbums> CREATOR = new a();

    /* compiled from: PostingAction.kt */
    public static final class a implements Parcelable.Creator<PostingAction$MediaPicker$Album$ReloadLocalAlbums> {
        @Override // android.os.Parcelable.Creator
        public final PostingAction$MediaPicker$Album$ReloadLocalAlbums createFromParcel(Parcel parcel) {
            parcel.readInt();
            return PostingAction$MediaPicker$Album$ReloadLocalAlbums.b;
        }

        @Override // android.os.Parcelable.Creator
        public final PostingAction$MediaPicker$Album$ReloadLocalAlbums[] newArray(int i) {
            return new PostingAction$MediaPicker$Album$ReloadLocalAlbums[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof PostingAction$MediaPicker$Album$ReloadLocalAlbums);
    }

    public final int hashCode() {
        return 944868679;
    }

    public final String toString() {
        return "ReloadLocalAlbums";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
