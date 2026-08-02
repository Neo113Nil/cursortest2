package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PhotosWallListAttachDto.kt */
/* loaded from: classes15.dex */
public final class PhotosWallListAttachDto implements Parcelable {
    public static final Parcelable.Creator<PhotosWallListAttachDto> CREATOR = new a();

    @pmi0("cover_photo")
    private final PhotosPhotoDto coverPhoto;

    @pmi0("photo_ids")
    private final List<String> photoIds;

    /* compiled from: PhotosWallListAttachDto.kt */
    public static final class a implements Parcelable.Creator<PhotosWallListAttachDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosWallListAttachDto createFromParcel(Parcel parcel) {
            return new PhotosWallListAttachDto(parcel.createStringArrayList(), (PhotosPhotoDto) parcel.readParcelable(PhotosWallListAttachDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosWallListAttachDto[] newArray(int i) {
            return new PhotosWallListAttachDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PhotosWallListAttachDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosWallListAttachDto)) {
            return false;
        }
        PhotosWallListAttachDto photosWallListAttachDto = (PhotosWallListAttachDto) obj;
        return epx.f(this.photoIds, photosWallListAttachDto.photoIds) && epx.f(this.coverPhoto, photosWallListAttachDto.coverPhoto);
    }

    public final int hashCode() {
        List<String> list = this.photoIds;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        PhotosPhotoDto photosPhotoDto = this.coverPhoto;
        return hashCode + (photosPhotoDto != null ? photosPhotoDto.hashCode() : 0);
    }

    public final String toString() {
        return "PhotosWallListAttachDto(photoIds=" + this.photoIds + ", coverPhoto=" + this.coverPhoto + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.photoIds);
        parcel.writeParcelable(this.coverPhoto, i);
    }

    public PhotosWallListAttachDto(List<String> list, PhotosPhotoDto photosPhotoDto) {
        this.photoIds = list;
        this.coverPhoto = photosPhotoDto;
    }

    public /* synthetic */ PhotosWallListAttachDto(List list, PhotosPhotoDto photosPhotoDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : photosPhotoDto);
    }
}
