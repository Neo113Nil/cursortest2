package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PhotosPhotoAlbumDto.kt */
/* loaded from: classes15.dex */
public final class PhotosPhotoAlbumDto implements Parcelable {
    public static final Parcelable.Creator<PhotosPhotoAlbumDto> CREATOR = new a();

    @pmi0("created")
    private final int created;

    @pmi0("description")
    private final String description;

    @pmi0("id")
    private final int id;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("size")
    private final int size;

    @pmi0("thumb")
    private final PhotosPhotoDto thumb;

    @pmi0("title")
    private final String title;

    @pmi0("updated")
    private final int updated;

    /* compiled from: PhotosPhotoAlbumDto.kt */
    public static final class a implements Parcelable.Creator<PhotosPhotoAlbumDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosPhotoAlbumDto createFromParcel(Parcel parcel) {
            return new PhotosPhotoAlbumDto(parcel.readInt(), parcel.readInt(), (UserId) parcel.readParcelable(PhotosPhotoAlbumDto.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), (PhotosPhotoDto) parcel.readParcelable(PhotosPhotoAlbumDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosPhotoAlbumDto[] newArray(int i) {
            return new PhotosPhotoAlbumDto[i];
        }
    }

    public PhotosPhotoAlbumDto(int i, int i2, UserId userId, int i3, String str, int i4, String str2, PhotosPhotoDto photosPhotoDto) {
        this.created = i;
        this.id = i2;
        this.ownerId = userId;
        this.size = i3;
        this.title = str;
        this.updated = i4;
        this.description = str2;
        this.thumb = photosPhotoDto;
    }

    public final int d() {
        return this.size;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final PhotosPhotoDto e() {
        return this.thumb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosPhotoAlbumDto)) {
            return false;
        }
        PhotosPhotoAlbumDto photosPhotoAlbumDto = (PhotosPhotoAlbumDto) obj;
        return this.created == photosPhotoAlbumDto.created && this.id == photosPhotoAlbumDto.id && epx.f(this.ownerId, photosPhotoAlbumDto.ownerId) && this.size == photosPhotoAlbumDto.size && epx.f(this.title, photosPhotoAlbumDto.title) && this.updated == photosPhotoAlbumDto.updated && epx.f(this.description, photosPhotoAlbumDto.description) && epx.f(this.thumb, photosPhotoAlbumDto.thumb);
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = shy.a(this.updated, urd0.a(shy.a(this.size, bh10.a(shy.a(this.id, Integer.hashCode(this.created) * 31, 31), 31, this.ownerId.b), 31), 31, this.title), 31);
        String str = this.description;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.thumb;
        return hashCode + (photosPhotoDto != null ? photosPhotoDto.hashCode() : 0);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        return "PhotosPhotoAlbumDto(created=" + this.created + ", id=" + this.id + ", ownerId=" + this.ownerId + ", size=" + this.size + ", title=" + this.title + ", updated=" + this.updated + ", description=" + this.description + ", thumb=" + this.thumb + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.created);
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.size);
        parcel.writeString(this.title);
        parcel.writeInt(this.updated);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.thumb, i);
    }

    public /* synthetic */ PhotosPhotoAlbumDto(int i, int i2, UserId userId, int i3, String str, int i4, String str2, PhotosPhotoDto photosPhotoDto, int i5, zcl zclVar) {
        this(i, i2, userId, i3, str, i4, (i5 & 64) != 0 ? null : str2, (i5 & 128) != 0 ? null : photosPhotoDto);
    }
}
