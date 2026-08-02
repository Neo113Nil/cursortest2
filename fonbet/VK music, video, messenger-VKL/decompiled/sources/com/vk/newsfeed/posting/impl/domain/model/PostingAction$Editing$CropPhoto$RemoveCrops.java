package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vkontakte.android.attachments.PhotoAttachment;
import xsna.epx;

/* compiled from: PostingAction.kt */
/* loaded from: classes4.dex */
public final class PostingAction$Editing$CropPhoto$RemoveCrops implements PostingAction.Editing {
    public static final Parcelable.Creator<PostingAction$Editing$CropPhoto$RemoveCrops> CREATOR = new a();
    public final PhotoAttachment b;

    /* compiled from: PostingAction.kt */
    public static final class a implements Parcelable.Creator<PostingAction$Editing$CropPhoto$RemoveCrops> {
        @Override // android.os.Parcelable.Creator
        public final PostingAction$Editing$CropPhoto$RemoveCrops createFromParcel(Parcel parcel) {
            return new PostingAction$Editing$CropPhoto$RemoveCrops((PhotoAttachment) parcel.readParcelable(PostingAction$Editing$CropPhoto$RemoveCrops.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PostingAction$Editing$CropPhoto$RemoveCrops[] newArray(int i) {
            return new PostingAction$Editing$CropPhoto$RemoveCrops[i];
        }
    }

    public PostingAction$Editing$CropPhoto$RemoveCrops(PhotoAttachment photoAttachment) {
        this.b = photoAttachment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PostingAction$Editing$CropPhoto$RemoveCrops) && epx.f(this.b, ((PostingAction$Editing$CropPhoto$RemoveCrops) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "RemoveCrops(attachment=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
