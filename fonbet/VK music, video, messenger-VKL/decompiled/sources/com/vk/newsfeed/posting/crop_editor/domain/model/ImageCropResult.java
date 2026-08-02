package com.vk.newsfeed.posting.crop_editor.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;

/* compiled from: ImageCropResult.kt */
/* loaded from: classes4.dex */
public final class ImageCropResult implements Parcelable {
    public static final Parcelable.Creator<ImageCropResult> CREATOR = new a();
    public final ImageLink b;
    public final PostingPreviewRatio c;
    public final ImageCropArea d;
    public final MediaStoreEntry e;
    public final boolean f;
    public final boolean g;

    /* compiled from: ImageCropResult.kt */
    public static final class a implements Parcelable.Creator<ImageCropResult> {
        @Override // android.os.Parcelable.Creator
        public final ImageCropResult createFromParcel(Parcel parcel) {
            MediaStoreEntry mediaStoreEntry;
            ImageLink imageLink;
            PostingPreviewRatio postingPreviewRatio;
            ImageCropArea imageCropArea;
            ImageLink imageLink2 = (ImageLink) parcel.readParcelable(ImageCropResult.class.getClassLoader());
            PostingPreviewRatio createFromParcel = PostingPreviewRatio.CREATOR.createFromParcel(parcel);
            ImageCropArea createFromParcel2 = parcel.readInt() == 0 ? null : ImageCropArea.CREATOR.createFromParcel(parcel);
            MediaStoreEntry mediaStoreEntry2 = (MediaStoreEntry) parcel.readParcelable(ImageCropResult.class.getClassLoader());
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                mediaStoreEntry = mediaStoreEntry2;
                imageLink = imageLink2;
                postingPreviewRatio = createFromParcel;
                imageCropArea = createFromParcel2;
                z = true;
            } else {
                mediaStoreEntry = mediaStoreEntry2;
                imageLink = imageLink2;
                postingPreviewRatio = createFromParcel;
                imageCropArea = createFromParcel2;
            }
            return new ImageCropResult(imageLink, postingPreviewRatio, imageCropArea, mediaStoreEntry, z2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageCropResult[] newArray(int i) {
            return new ImageCropResult[i];
        }
    }

    public ImageCropResult(ImageLink imageLink, PostingPreviewRatio postingPreviewRatio, ImageCropArea imageCropArea, MediaStoreEntry mediaStoreEntry, boolean z, boolean z2) {
        this.b = imageLink;
        this.c = postingPreviewRatio;
        this.d = imageCropArea;
        this.e = mediaStoreEntry;
        this.f = z;
        this.g = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        this.c.writeToParcel(parcel, i);
        ImageCropArea imageCropArea = this.d;
        if (imageCropArea == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageCropArea.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
