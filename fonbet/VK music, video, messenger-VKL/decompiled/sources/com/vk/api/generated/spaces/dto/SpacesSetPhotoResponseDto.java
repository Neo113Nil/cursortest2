package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: SpacesSetPhotoResponseDto.kt */
/* loaded from: classes15.dex */
public final class SpacesSetPhotoResponseDto implements Parcelable {
    public static final Parcelable.Creator<SpacesSetPhotoResponseDto> CREATOR = new a();

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("thumb_hash")
    private final String thumbHash;

    /* compiled from: SpacesSetPhotoResponseDto.kt */
    public static final class a implements Parcelable.Creator<SpacesSetPhotoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesSetPhotoResponseDto createFromParcel(Parcel parcel) {
            return new SpacesSetPhotoResponseDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesSetPhotoResponseDto[] newArray(int i) {
            return new SpacesSetPhotoResponseDto[i];
        }
    }

    public SpacesSetPhotoResponseDto(String str, String str2) {
        this.photoBase = str;
        this.thumbHash = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacesSetPhotoResponseDto)) {
            return false;
        }
        SpacesSetPhotoResponseDto spacesSetPhotoResponseDto = (SpacesSetPhotoResponseDto) obj;
        return epx.f(this.photoBase, spacesSetPhotoResponseDto.photoBase) && epx.f(this.thumbHash, spacesSetPhotoResponseDto.thumbHash);
    }

    public final int hashCode() {
        return this.thumbHash.hashCode() + (this.photoBase.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpacesSetPhotoResponseDto(photoBase=");
        sb.append(this.photoBase);
        sb.append(", thumbHash=");
        return ho8.a(sb, this.thumbHash, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.photoBase);
        parcel.writeString(this.thumbHash);
    }
}
