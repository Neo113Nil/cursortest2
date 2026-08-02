package com.vk.api.generated.docs.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesTypeDto;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;

/* compiled from: DocsDocPreviewPhotoSizesDto.kt */
/* loaded from: classes14.dex */
public final class DocsDocPreviewPhotoSizesDto implements Parcelable {
    public static final Parcelable.Creator<DocsDocPreviewPhotoSizesDto> CREATOR = new a();

    @pmi0("height")
    private final int height;

    @pmi0("src")
    private final String src;

    @pmi0("type")
    private final PhotosPhotoSizesTypeDto type;

    @pmi0("width")
    private final int width;

    /* compiled from: DocsDocPreviewPhotoSizesDto.kt */
    public static final class a implements Parcelable.Creator<DocsDocPreviewPhotoSizesDto> {
        @Override // android.os.Parcelable.Creator
        public final DocsDocPreviewPhotoSizesDto createFromParcel(Parcel parcel) {
            return new DocsDocPreviewPhotoSizesDto(parcel.readString(), parcel.readInt(), parcel.readInt(), (PhotosPhotoSizesTypeDto) parcel.readParcelable(DocsDocPreviewPhotoSizesDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DocsDocPreviewPhotoSizesDto[] newArray(int i) {
            return new DocsDocPreviewPhotoSizesDto[i];
        }
    }

    public DocsDocPreviewPhotoSizesDto(String str, int i, int i2, PhotosPhotoSizesTypeDto photosPhotoSizesTypeDto) {
        this.src = str;
        this.width = i;
        this.height = i2;
        this.type = photosPhotoSizesTypeDto;
    }

    public final String d() {
        return this.src;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final PhotosPhotoSizesTypeDto e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsDocPreviewPhotoSizesDto)) {
            return false;
        }
        DocsDocPreviewPhotoSizesDto docsDocPreviewPhotoSizesDto = (DocsDocPreviewPhotoSizesDto) obj;
        return epx.f(this.src, docsDocPreviewPhotoSizesDto.src) && this.width == docsDocPreviewPhotoSizesDto.width && this.height == docsDocPreviewPhotoSizesDto.height && this.type == docsDocPreviewPhotoSizesDto.type;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        return this.type.hashCode() + shy.a(this.height, shy.a(this.width, this.src.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "DocsDocPreviewPhotoSizesDto(src=" + this.src + ", width=" + this.width + ", height=" + this.height + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.src);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeParcelable(this.type, i);
    }
}
