package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PhotosSaveOwnerPhotoResponseDto.kt */
/* loaded from: classes15.dex */
public final class PhotosSaveOwnerPhotoResponseDto implements Parcelable {
    public static final Parcelable.Creator<PhotosSaveOwnerPhotoResponseDto> CREATOR = new a();

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("photo_hash")
    private final String photoHash;

    @pmi0("photo_src")
    private final String photoSrc;

    @pmi0("photo_src_big")
    private final String photoSrcBig;

    @pmi0("photo_src_small")
    private final String photoSrcSmall;

    @pmi0("post_id")
    private final Integer postId;

    @pmi0("saved")
    private final Integer saved;

    /* compiled from: PhotosSaveOwnerPhotoResponseDto.kt */
    public static final class a implements Parcelable.Creator<PhotosSaveOwnerPhotoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosSaveOwnerPhotoResponseDto createFromParcel(Parcel parcel) {
            return new PhotosSaveOwnerPhotoResponseDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (PhotosPhotoDto) parcel.readParcelable(PhotosSaveOwnerPhotoResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosSaveOwnerPhotoResponseDto[] newArray(int i) {
            return new PhotosSaveOwnerPhotoResponseDto[i];
        }
    }

    public PhotosSaveOwnerPhotoResponseDto(String str, String str2, String str3, String str4, Integer num, Integer num2, PhotosPhotoDto photosPhotoDto) {
        this.photoHash = str;
        this.photoSrc = str2;
        this.photoSrcBig = str3;
        this.photoSrcSmall = str4;
        this.saved = num;
        this.postId = num2;
        this.photo = photosPhotoDto;
    }

    public final PhotosPhotoDto d() {
        return this.photo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosSaveOwnerPhotoResponseDto)) {
            return false;
        }
        PhotosSaveOwnerPhotoResponseDto photosSaveOwnerPhotoResponseDto = (PhotosSaveOwnerPhotoResponseDto) obj;
        return epx.f(this.photoHash, photosSaveOwnerPhotoResponseDto.photoHash) && epx.f(this.photoSrc, photosSaveOwnerPhotoResponseDto.photoSrc) && epx.f(this.photoSrcBig, photosSaveOwnerPhotoResponseDto.photoSrcBig) && epx.f(this.photoSrcSmall, photosSaveOwnerPhotoResponseDto.photoSrcSmall) && epx.f(this.saved, photosSaveOwnerPhotoResponseDto.saved) && epx.f(this.postId, photosSaveOwnerPhotoResponseDto.postId) && epx.f(this.photo, photosSaveOwnerPhotoResponseDto.photo);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.photoHash.hashCode() * 31, 31, this.photoSrc);
        String str = this.photoSrcBig;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photoSrcSmall;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.saved;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.postId;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        return hashCode4 + (photosPhotoDto != null ? photosPhotoDto.hashCode() : 0);
    }

    public final String toString() {
        return "PhotosSaveOwnerPhotoResponseDto(photoHash=" + this.photoHash + ", photoSrc=" + this.photoSrc + ", photoSrcBig=" + this.photoSrcBig + ", photoSrcSmall=" + this.photoSrcSmall + ", saved=" + this.saved + ", postId=" + this.postId + ", photo=" + this.photo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.photoHash);
        parcel.writeString(this.photoSrc);
        parcel.writeString(this.photoSrcBig);
        parcel.writeString(this.photoSrcSmall);
        Integer num = this.saved;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.postId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeParcelable(this.photo, i);
    }

    public /* synthetic */ PhotosSaveOwnerPhotoResponseDto(String str, String str2, String str3, String str4, Integer num, Integer num2, PhotosPhotoDto photosPhotoDto, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : photosPhotoDto);
    }
}
