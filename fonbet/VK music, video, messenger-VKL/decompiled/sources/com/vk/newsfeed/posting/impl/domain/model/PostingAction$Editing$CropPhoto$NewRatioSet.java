package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import xsna.xq;

/* compiled from: PostingAction.kt */
/* loaded from: classes4.dex */
public final class PostingAction$Editing$CropPhoto$NewRatioSet implements PostingAction.Editing {
    public static final Parcelable.Creator<PostingAction$Editing$CropPhoto$NewRatioSet> CREATOR = new a();
    public final float b;

    /* compiled from: PostingAction.kt */
    public static final class a implements Parcelable.Creator<PostingAction$Editing$CropPhoto$NewRatioSet> {
        @Override // android.os.Parcelable.Creator
        public final PostingAction$Editing$CropPhoto$NewRatioSet createFromParcel(Parcel parcel) {
            return new PostingAction$Editing$CropPhoto$NewRatioSet(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final PostingAction$Editing$CropPhoto$NewRatioSet[] newArray(int i) {
            return new PostingAction$Editing$CropPhoto$NewRatioSet[i];
        }
    }

    public PostingAction$Editing$CropPhoto$NewRatioSet(float f) {
        this.b = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PostingAction$Editing$CropPhoto$NewRatioSet) && Float.compare(this.b, ((PostingAction$Editing$CropPhoto$NewRatioSet) obj).b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b);
    }

    public final String toString() {
        return xq.c(')', this.b, new StringBuilder("NewRatioSet(ratio="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.b);
    }
}
