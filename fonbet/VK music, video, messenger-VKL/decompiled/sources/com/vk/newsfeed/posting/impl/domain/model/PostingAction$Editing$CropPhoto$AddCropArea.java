package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.Attachment;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import defpackage.q0;
import xsna.epx;

/* compiled from: PostingAction.kt */
/* loaded from: classes4.dex */
public final class PostingAction$Editing$CropPhoto$AddCropArea implements PostingAction.Editing {
    public static final Parcelable.Creator<PostingAction$Editing$CropPhoto$AddCropArea> CREATOR = new a();
    public final ImageCropArea b;
    public final Attachment c;
    public final boolean d;

    /* compiled from: PostingAction.kt */
    public static final class a implements Parcelable.Creator<PostingAction$Editing$CropPhoto$AddCropArea> {
        @Override // android.os.Parcelable.Creator
        public final PostingAction$Editing$CropPhoto$AddCropArea createFromParcel(Parcel parcel) {
            return new PostingAction$Editing$CropPhoto$AddCropArea(ImageCropArea.CREATOR.createFromParcel(parcel), (Attachment) parcel.readParcelable(PostingAction$Editing$CropPhoto$AddCropArea.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PostingAction$Editing$CropPhoto$AddCropArea[] newArray(int i) {
            return new PostingAction$Editing$CropPhoto$AddCropArea[i];
        }
    }

    public PostingAction$Editing$CropPhoto$AddCropArea(ImageCropArea imageCropArea, Attachment attachment, boolean z) {
        this.b = imageCropArea;
        this.c = attachment;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingAction$Editing$CropPhoto$AddCropArea)) {
            return false;
        }
        PostingAction$Editing$CropPhoto$AddCropArea postingAction$Editing$CropPhoto$AddCropArea = (PostingAction$Editing$CropPhoto$AddCropArea) obj;
        return epx.f(this.b, postingAction$Editing$CropPhoto$AddCropArea.b) && epx.f(this.c, postingAction$Editing$CropPhoto$AddCropArea.c) && this.d == postingAction$Editing$CropPhoto$AddCropArea.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Attachment attachment = this.c;
        return Boolean.hashCode(this.d) + ((hashCode + (attachment == null ? 0 : attachment.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddCropArea(cropArea=");
        sb.append(this.b);
        sb.append(", attachment=");
        sb.append(this.c);
        sb.append(", shouldRewrite=");
        return q0.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
