package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: PhotosVerticalizeErrorDto.kt */
/* loaded from: classes15.dex */
public final class PhotosVerticalizeErrorDto implements Parcelable {
    public static final Parcelable.Creator<PhotosVerticalizeErrorDto> CREATOR = new a();

    @pmi0("code")
    private final String code;

    @pmi0("error")
    private final String error;

    /* compiled from: PhotosVerticalizeErrorDto.kt */
    public static final class a implements Parcelable.Creator<PhotosVerticalizeErrorDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosVerticalizeErrorDto createFromParcel(Parcel parcel) {
            return new PhotosVerticalizeErrorDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosVerticalizeErrorDto[] newArray(int i) {
            return new PhotosVerticalizeErrorDto[i];
        }
    }

    public PhotosVerticalizeErrorDto(String str, String str2) {
        this.code = str;
        this.error = str2;
    }

    public final String d() {
        return this.error;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosVerticalizeErrorDto)) {
            return false;
        }
        PhotosVerticalizeErrorDto photosVerticalizeErrorDto = (PhotosVerticalizeErrorDto) obj;
        return epx.f(this.code, photosVerticalizeErrorDto.code) && epx.f(this.error, photosVerticalizeErrorDto.error);
    }

    public final int hashCode() {
        return this.error.hashCode() + (this.code.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosVerticalizeErrorDto(code=");
        sb.append(this.code);
        sb.append(", error=");
        return ho8.a(sb, this.error, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.code);
        parcel.writeString(this.error);
    }
}
