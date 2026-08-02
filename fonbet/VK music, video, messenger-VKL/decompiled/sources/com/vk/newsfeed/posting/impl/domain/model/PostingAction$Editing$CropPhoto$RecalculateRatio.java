package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;

/* compiled from: PostingAction.kt */
/* loaded from: classes4.dex */
public final class PostingAction$Editing$CropPhoto$RecalculateRatio implements PostingAction.Editing {
    public static final PostingAction$Editing$CropPhoto$RecalculateRatio b = new PostingAction$Editing$CropPhoto$RecalculateRatio();
    public static final Parcelable.Creator<PostingAction$Editing$CropPhoto$RecalculateRatio> CREATOR = new a();

    /* compiled from: PostingAction.kt */
    public static final class a implements Parcelable.Creator<PostingAction$Editing$CropPhoto$RecalculateRatio> {
        @Override // android.os.Parcelable.Creator
        public final PostingAction$Editing$CropPhoto$RecalculateRatio createFromParcel(Parcel parcel) {
            parcel.readInt();
            return PostingAction$Editing$CropPhoto$RecalculateRatio.b;
        }

        @Override // android.os.Parcelable.Creator
        public final PostingAction$Editing$CropPhoto$RecalculateRatio[] newArray(int i) {
            return new PostingAction$Editing$CropPhoto$RecalculateRatio[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof PostingAction$Editing$CropPhoto$RecalculateRatio);
    }

    public final int hashCode() {
        return -2122056402;
    }

    public final String toString() {
        return "RecalculateRatio";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
