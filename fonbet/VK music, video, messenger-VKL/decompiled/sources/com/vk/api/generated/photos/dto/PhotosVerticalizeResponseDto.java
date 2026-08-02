package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: PhotosVerticalizeResponseDto.kt */
/* loaded from: classes15.dex */
public final class PhotosVerticalizeResponseDto implements Parcelable {
    public static final Parcelable.Creator<PhotosVerticalizeResponseDto> CREATOR = new a();

    @pmi0("query_id")
    private final String queryId;

    /* compiled from: PhotosVerticalizeResponseDto.kt */
    public static final class a implements Parcelable.Creator<PhotosVerticalizeResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosVerticalizeResponseDto createFromParcel(Parcel parcel) {
            return new PhotosVerticalizeResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosVerticalizeResponseDto[] newArray(int i) {
            return new PhotosVerticalizeResponseDto[i];
        }
    }

    public PhotosVerticalizeResponseDto(String str) {
        this.queryId = str;
    }

    public final String d() {
        return this.queryId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PhotosVerticalizeResponseDto) && epx.f(this.queryId, ((PhotosVerticalizeResponseDto) obj).queryId);
    }

    public final int hashCode() {
        return this.queryId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("PhotosVerticalizeResponseDto(queryId="), this.queryId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.queryId);
    }
}
