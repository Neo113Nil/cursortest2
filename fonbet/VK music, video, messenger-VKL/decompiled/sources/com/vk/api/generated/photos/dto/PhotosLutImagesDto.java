package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: PhotosLutImagesDto.kt */
/* loaded from: classes15.dex */
public final class PhotosLutImagesDto implements Parcelable {
    public static final Parcelable.Creator<PhotosLutImagesDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    @pmi0("url")
    private final String url;

    /* compiled from: PhotosLutImagesDto.kt */
    public static final class a implements Parcelable.Creator<PhotosLutImagesDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosLutImagesDto createFromParcel(Parcel parcel) {
            return new PhotosLutImagesDto(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosLutImagesDto[] newArray(int i) {
            return new PhotosLutImagesDto[i];
        }
    }

    public PhotosLutImagesDto(int i, String str, String str2) {
        this.id = i;
        this.name = str;
        this.url = str2;
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosLutImagesDto)) {
            return false;
        }
        PhotosLutImagesDto photosLutImagesDto = (PhotosLutImagesDto) obj;
        return this.id == photosLutImagesDto.id && epx.f(this.name, photosLutImagesDto.name) && epx.f(this.url, photosLutImagesDto.url);
    }

    public final int getId() {
        return this.id;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        return this.url.hashCode() + urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosLutImagesDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.url);
    }
}
