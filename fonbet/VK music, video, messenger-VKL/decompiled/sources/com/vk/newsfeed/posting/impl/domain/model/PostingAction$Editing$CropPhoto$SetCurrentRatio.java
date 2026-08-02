package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;

/* compiled from: PostingAction.kt */
/* loaded from: classes4.dex */
public final class PostingAction$Editing$CropPhoto$SetCurrentRatio implements PostingAction.Editing {
    public static final Parcelable.Creator<PostingAction$Editing$CropPhoto$SetCurrentRatio> CREATOR = new a();
    public final CropCarouselType b;

    /* compiled from: PostingAction.kt */
    public static final class a implements Parcelable.Creator<PostingAction$Editing$CropPhoto$SetCurrentRatio> {
        @Override // android.os.Parcelable.Creator
        public final PostingAction$Editing$CropPhoto$SetCurrentRatio createFromParcel(Parcel parcel) {
            return new PostingAction$Editing$CropPhoto$SetCurrentRatio(CropCarouselType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final PostingAction$Editing$CropPhoto$SetCurrentRatio[] newArray(int i) {
            return new PostingAction$Editing$CropPhoto$SetCurrentRatio[i];
        }
    }

    public PostingAction$Editing$CropPhoto$SetCurrentRatio(CropCarouselType cropCarouselType) {
        this.b = cropCarouselType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PostingAction$Editing$CropPhoto$SetCurrentRatio) && this.b == ((PostingAction$Editing$CropPhoto$SetCurrentRatio) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SetCurrentRatio(carouselCropType=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
    }
}
