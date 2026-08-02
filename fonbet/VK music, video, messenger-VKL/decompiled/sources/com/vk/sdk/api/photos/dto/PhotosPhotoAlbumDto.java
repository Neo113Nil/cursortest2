package com.vk.sdk.api.photos.dto;

import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.nyh0;
import xsna.odj;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PhotosPhotoAlbumDto.kt */
/* loaded from: classes5.dex */
public final class PhotosPhotoAlbumDto {

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

    public final int hashCode() {
        int a = shy.a(this.updated, urd0.a(shy.a(this.size, bh10.a(shy.a(this.id, Integer.hashCode(this.created) * 31, 31), 31, this.ownerId.b), 31), 31, this.title), 31);
        String str = this.description;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.thumb;
        return hashCode + (photosPhotoDto != null ? photosPhotoDto.hashCode() : 0);
    }

    public final String toString() {
        int i = this.created;
        int i2 = this.id;
        UserId userId = this.ownerId;
        int i3 = this.size;
        String str = this.title;
        int i4 = this.updated;
        String str2 = this.description;
        PhotosPhotoDto photosPhotoDto = this.thumb;
        StringBuilder a = odj.a(i, i2, "PhotosPhotoAlbumDto(created=", ", id=", ", ownerId=");
        a.append(userId);
        a.append(", size=");
        a.append(i3);
        a.append(", title=");
        nyh0.a(i4, str, ", updated=", ", description=", a);
        a.append(str2);
        a.append(", thumb=");
        a.append(photosPhotoDto);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ PhotosPhotoAlbumDto(int i, int i2, UserId userId, int i3, String str, int i4, String str2, PhotosPhotoDto photosPhotoDto, int i5, zcl zclVar) {
        this(i, i2, userId, i3, str, i4, (i5 & 64) != 0 ? null : str2, (i5 & 128) != 0 ? null : photosPhotoDto);
    }
}
