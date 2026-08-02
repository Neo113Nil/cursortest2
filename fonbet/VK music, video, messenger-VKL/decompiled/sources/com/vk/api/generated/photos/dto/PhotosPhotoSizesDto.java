package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: PhotosPhotoSizesDto.kt */
/* loaded from: classes15.dex */
public final class PhotosPhotoSizesDto implements Parcelable {
    public static final Parcelable.Creator<PhotosPhotoSizesDto> CREATOR = new a();

    @pmi0("height")
    private final int height;

    @pmi0("src")
    private final String src;

    @pmi0("type")
    private final PhotosPhotoSizesTypeDto type;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final int width;

    /* compiled from: PhotosPhotoSizesDto.kt */
    public static final class a implements Parcelable.Creator<PhotosPhotoSizesDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosPhotoSizesDto createFromParcel(Parcel parcel) {
            return new PhotosPhotoSizesDto(parcel.readInt(), PhotosPhotoSizesTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosPhotoSizesDto[] newArray(int i) {
            return new PhotosPhotoSizesDto[i];
        }
    }

    public PhotosPhotoSizesDto(int i, PhotosPhotoSizesTypeDto photosPhotoSizesTypeDto, int i2, String str, String str2) {
        this.height = i;
        this.type = photosPhotoSizesTypeDto;
        this.width = i2;
        this.url = str;
        this.src = str2;
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
        if (!(obj instanceof PhotosPhotoSizesDto)) {
            return false;
        }
        PhotosPhotoSizesDto photosPhotoSizesDto = (PhotosPhotoSizesDto) obj;
        return this.height == photosPhotoSizesDto.height && this.type == photosPhotoSizesDto.type && this.width == photosPhotoSizesDto.width && epx.f(this.url, photosPhotoSizesDto.url) && epx.f(this.src, photosPhotoSizesDto.src);
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        int a2 = shy.a(this.width, (this.type.hashCode() + (Integer.hashCode(this.height) * 31)) * 31, 31);
        String str = this.url;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.src;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosPhotoSizesDto(height=");
        sb.append(this.height);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", src=");
        return ho8.a(sb, this.src, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.height);
        this.type.writeToParcel(parcel, i);
        parcel.writeInt(this.width);
        parcel.writeString(this.url);
        parcel.writeString(this.src);
    }

    public /* synthetic */ PhotosPhotoSizesDto(int i, PhotosPhotoSizesTypeDto photosPhotoSizesTypeDto, int i2, String str, String str2, int i3, zcl zclVar) {
        this(i, photosPhotoSizesTypeDto, i2, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? null : str2);
    }
}
