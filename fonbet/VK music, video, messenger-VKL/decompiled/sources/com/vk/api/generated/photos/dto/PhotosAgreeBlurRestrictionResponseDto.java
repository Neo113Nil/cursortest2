package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: PhotosAgreeBlurRestrictionResponseDto.kt */
/* loaded from: classes15.dex */
public final class PhotosAgreeBlurRestrictionResponseDto implements Parcelable {
    public static final Parcelable.Creator<PhotosAgreeBlurRestrictionResponseDto> CREATOR = new a();

    @pmi0("owner_fully_available")
    private final boolean ownerFullyAvailable;

    /* compiled from: PhotosAgreeBlurRestrictionResponseDto.kt */
    public static final class a implements Parcelable.Creator<PhotosAgreeBlurRestrictionResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosAgreeBlurRestrictionResponseDto createFromParcel(Parcel parcel) {
            return new PhotosAgreeBlurRestrictionResponseDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosAgreeBlurRestrictionResponseDto[] newArray(int i) {
            return new PhotosAgreeBlurRestrictionResponseDto[i];
        }
    }

    public PhotosAgreeBlurRestrictionResponseDto(boolean z) {
        this.ownerFullyAvailable = z;
    }

    public final boolean d() {
        return this.ownerFullyAvailable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PhotosAgreeBlurRestrictionResponseDto) && this.ownerFullyAvailable == ((PhotosAgreeBlurRestrictionResponseDto) obj).ownerFullyAvailable;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.ownerFullyAvailable);
    }

    public final String toString() {
        return q0.a(new StringBuilder("PhotosAgreeBlurRestrictionResponseDto(ownerFullyAvailable="), this.ownerFullyAvailable, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.ownerFullyAvailable ? 1 : 0);
    }
}
