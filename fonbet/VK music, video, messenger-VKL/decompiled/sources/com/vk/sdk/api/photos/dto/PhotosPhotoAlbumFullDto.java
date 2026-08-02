package com.vk.sdk.api.photos.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.jax0;
import xsna.mq;
import xsna.pmi0;
import xsna.shy;
import xsna.to;
import xsna.tq;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PhotosPhotoAlbumFullDto.kt */
/* loaded from: classes5.dex */
public final class PhotosPhotoAlbumFullDto {

    @pmi0("can_delete")
    private final Boolean canDelete;

    @pmi0("can_include_to_feed")
    private final Boolean canIncludeToFeed;

    @pmi0("can_upload")
    private final BaseBoolIntDto canUpload;

    @pmi0("comments_disabled")
    private final BaseBoolIntDto commentsDisabled;

    @pmi0("created")
    private final Integer created;

    @pmi0("description")
    private final String description;

    @pmi0("id")
    private final int id;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("size")
    private final int size;

    @pmi0("sizes")
    private final List<PhotosPhotoSizesDto> sizes;

    @pmi0("thumb_id")
    private final Integer thumbId;

    @pmi0("thumb_is_last")
    private final BaseBoolIntDto thumbIsLast;

    @pmi0("thumb_src")
    private final String thumbSrc;

    @pmi0("title")
    private final String title;

    @pmi0("updated")
    private final Integer updated;

    @pmi0("upload_by_admins_only")
    private final BaseBoolIntDto uploadByAdminsOnly;

    public PhotosPhotoAlbumFullDto(int i, UserId userId, int i2, String str, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, Integer num, String str2, Boolean bool, Boolean bool2, List<PhotosPhotoSizesDto> list, Integer num2, BaseBoolIntDto baseBoolIntDto3, String str3, Integer num3, BaseBoolIntDto baseBoolIntDto4) {
        this.id = i;
        this.ownerId = userId;
        this.size = i2;
        this.title = str;
        this.canUpload = baseBoolIntDto;
        this.commentsDisabled = baseBoolIntDto2;
        this.created = num;
        this.description = str2;
        this.canDelete = bool;
        this.canIncludeToFeed = bool2;
        this.sizes = list;
        this.thumbId = num2;
        this.thumbIsLast = baseBoolIntDto3;
        this.thumbSrc = str3;
        this.updated = num3;
        this.uploadByAdminsOnly = baseBoolIntDto4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosPhotoAlbumFullDto)) {
            return false;
        }
        PhotosPhotoAlbumFullDto photosPhotoAlbumFullDto = (PhotosPhotoAlbumFullDto) obj;
        return this.id == photosPhotoAlbumFullDto.id && epx.f(this.ownerId, photosPhotoAlbumFullDto.ownerId) && this.size == photosPhotoAlbumFullDto.size && epx.f(this.title, photosPhotoAlbumFullDto.title) && this.canUpload == photosPhotoAlbumFullDto.canUpload && this.commentsDisabled == photosPhotoAlbumFullDto.commentsDisabled && epx.f(this.created, photosPhotoAlbumFullDto.created) && epx.f(this.description, photosPhotoAlbumFullDto.description) && epx.f(this.canDelete, photosPhotoAlbumFullDto.canDelete) && epx.f(this.canIncludeToFeed, photosPhotoAlbumFullDto.canIncludeToFeed) && epx.f(this.sizes, photosPhotoAlbumFullDto.sizes) && epx.f(this.thumbId, photosPhotoAlbumFullDto.thumbId) && this.thumbIsLast == photosPhotoAlbumFullDto.thumbIsLast && epx.f(this.thumbSrc, photosPhotoAlbumFullDto.thumbSrc) && epx.f(this.updated, photosPhotoAlbumFullDto.updated) && this.uploadByAdminsOnly == photosPhotoAlbumFullDto.uploadByAdminsOnly;
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.size, bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b), 31), 31, this.title);
        BaseBoolIntDto baseBoolIntDto = this.canUpload;
        int hashCode = (a + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.commentsDisabled;
        int hashCode2 = (hashCode + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        Integer num = this.created;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.description;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.canDelete;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canIncludeToFeed;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<PhotosPhotoSizesDto> list = this.sizes;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.thumbId;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.thumbIsLast;
        int hashCode9 = (hashCode8 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        String str2 = this.thumbSrc;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.updated;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.uploadByAdminsOnly;
        return hashCode11 + (baseBoolIntDto4 != null ? baseBoolIntDto4.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        UserId userId = this.ownerId;
        int i2 = this.size;
        String str = this.title;
        BaseBoolIntDto baseBoolIntDto = this.canUpload;
        BaseBoolIntDto baseBoolIntDto2 = this.commentsDisabled;
        Integer num = this.created;
        String str2 = this.description;
        Boolean bool = this.canDelete;
        Boolean bool2 = this.canIncludeToFeed;
        List<PhotosPhotoSizesDto> list = this.sizes;
        Integer num2 = this.thumbId;
        BaseBoolIntDto baseBoolIntDto3 = this.thumbIsLast;
        String str3 = this.thumbSrc;
        Integer num3 = this.updated;
        BaseBoolIntDto baseBoolIntDto4 = this.uploadByAdminsOnly;
        StringBuilder sb = new StringBuilder("PhotosPhotoAlbumFullDto(id=");
        sb.append(i);
        sb.append(", ownerId=");
        sb.append(userId);
        sb.append(", size=");
        jax0.a(i2, ", title=", str, ", canUpload=", sb);
        to.b(sb, baseBoolIntDto, ", commentsDisabled=", baseBoolIntDto2, ", created=");
        mq.b(num, ", description=", str2, ", canDelete=", sb);
        tq.i(sb, bool, ", canIncludeToFeed=", bool2, ", sizes=");
        sb.append(list);
        sb.append(", thumbId=");
        sb.append(num2);
        sb.append(", thumbIsLast=");
        sb.append(baseBoolIntDto3);
        sb.append(", thumbSrc=");
        sb.append(str3);
        sb.append(", updated=");
        sb.append(num3);
        sb.append(", uploadByAdminsOnly=");
        sb.append(baseBoolIntDto4);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ PhotosPhotoAlbumFullDto(int i, UserId userId, int i2, String str, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, Integer num, String str2, Boolean bool, Boolean bool2, List list, Integer num2, BaseBoolIntDto baseBoolIntDto3, String str3, Integer num3, BaseBoolIntDto baseBoolIntDto4, int i3, zcl zclVar) {
        this(i, userId, i2, str, (i3 & 16) != 0 ? null : baseBoolIntDto, (i3 & 32) != 0 ? null : baseBoolIntDto2, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? null : str2, (i3 & 256) != 0 ? null : bool, (i3 & 512) != 0 ? null : bool2, (i3 & 1024) != 0 ? null : list, (i3 & 2048) != 0 ? null : num2, (i3 & 4096) != 0 ? null : baseBoolIntDto3, (i3 & 8192) != 0 ? null : str3, (i3 & 16384) != 0 ? null : num3, (i3 & 32768) != 0 ? null : baseBoolIntDto4);
    }
}
