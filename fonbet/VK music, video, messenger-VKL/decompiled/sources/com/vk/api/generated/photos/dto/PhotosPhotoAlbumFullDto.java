package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BasePrivacyDto;
import com.vk.api.generated.media.dto.MediaRestrictionDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.wp;
import xsna.zcl;

/* compiled from: PhotosPhotoAlbumFullDto.kt */
/* loaded from: classes15.dex */
public final class PhotosPhotoAlbumFullDto implements Parcelable {
    public static final Parcelable.Creator<PhotosPhotoAlbumFullDto> CREATOR = new a();

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

    @pmi0("feed_disabled")
    private final BaseBoolIntDto feedDisabled;

    @pmi0("feed_has_pinned")
    private final BaseBoolIntDto feedHasPinned;

    @pmi0("id")
    private final int id;

    @pmi0("is_locked")
    private final Boolean isLocked;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("privacy_comment")
    private final BasePrivacyDto privacyComment;

    @pmi0("privacy_view")
    private final BasePrivacyDto privacyView;

    @pmi0("restrictions")
    private final MediaRestrictionDto restrictions;

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

    /* compiled from: PhotosPhotoAlbumFullDto.kt */
    public static final class a implements Parcelable.Creator<PhotosPhotoAlbumFullDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosPhotoAlbumFullDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            int i;
            ArrayList arrayList;
            int i2;
            String str;
            int readInt = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(PhotosPhotoAlbumFullDto.class.getClassLoader());
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(PhotosPhotoAlbumFullDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto2 = (BaseBoolIntDto) parcel.readParcelable(PhotosPhotoAlbumFullDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(PhotosPhotoAlbumFullDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(PhotosPhotoAlbumFullDto.class.getClassLoader());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BasePrivacyDto basePrivacyDto = (BasePrivacyDto) parcel.readParcelable(PhotosPhotoAlbumFullDto.class.getClassLoader());
            BasePrivacyDto basePrivacyDto2 = (BasePrivacyDto) parcel.readParcelable(PhotosPhotoAlbumFullDto.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                i = readInt;
                arrayList = new ArrayList(readInt3);
                i2 = readInt2;
                int i3 = 0;
                while (true) {
                    str = readString;
                    if (i3 == readInt3) {
                        break;
                    }
                    i3 = bo.b(PhotosPhotoAlbumFullDto.class, parcel, arrayList, i3, 1);
                    readString = str;
                }
            } else {
                i = readInt;
                i2 = readInt2;
                arrayList = null;
                str = readString;
            }
            return new PhotosPhotoAlbumFullDto(i, userId, i2, str, baseBoolIntDto, baseBoolIntDto2, baseBoolIntDto3, baseBoolIntDto4, valueOf4, readString2, valueOf, valueOf2, valueOf3, basePrivacyDto, basePrivacyDto2, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (BaseBoolIntDto) parcel.readParcelable(PhotosPhotoAlbumFullDto.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (BaseBoolIntDto) parcel.readParcelable(PhotosPhotoAlbumFullDto.class.getClassLoader()), (MediaRestrictionDto) parcel.readParcelable(PhotosPhotoAlbumFullDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosPhotoAlbumFullDto[] newArray(int i) {
            return new PhotosPhotoAlbumFullDto[i];
        }
    }

    public PhotosPhotoAlbumFullDto(int i, UserId userId, int i2, String str, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, Integer num, String str2, Boolean bool, Boolean bool2, Boolean bool3, BasePrivacyDto basePrivacyDto, BasePrivacyDto basePrivacyDto2, List<PhotosPhotoSizesDto> list, Integer num2, BaseBoolIntDto baseBoolIntDto5, String str3, Integer num3, BaseBoolIntDto baseBoolIntDto6, MediaRestrictionDto mediaRestrictionDto) {
        this.id = i;
        this.ownerId = userId;
        this.size = i2;
        this.title = str;
        this.feedDisabled = baseBoolIntDto;
        this.feedHasPinned = baseBoolIntDto2;
        this.canUpload = baseBoolIntDto3;
        this.commentsDisabled = baseBoolIntDto4;
        this.created = num;
        this.description = str2;
        this.canDelete = bool;
        this.canIncludeToFeed = bool2;
        this.isLocked = bool3;
        this.privacyComment = basePrivacyDto;
        this.privacyView = basePrivacyDto2;
        this.sizes = list;
        this.thumbId = num2;
        this.thumbIsLast = baseBoolIntDto5;
        this.thumbSrc = str3;
        this.updated = num3;
        this.uploadByAdminsOnly = baseBoolIntDto6;
        this.restrictions = mediaRestrictionDto;
    }

    public final BaseBoolIntDto B() {
        return this.thumbIsLast;
    }

    public final String C() {
        return this.thumbSrc;
    }

    public final Integer D() {
        return this.updated;
    }

    public final BaseBoolIntDto F() {
        return this.uploadByAdminsOnly;
    }

    public final Boolean d() {
        return this.canDelete;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.canIncludeToFeed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosPhotoAlbumFullDto)) {
            return false;
        }
        PhotosPhotoAlbumFullDto photosPhotoAlbumFullDto = (PhotosPhotoAlbumFullDto) obj;
        return this.id == photosPhotoAlbumFullDto.id && epx.f(this.ownerId, photosPhotoAlbumFullDto.ownerId) && this.size == photosPhotoAlbumFullDto.size && epx.f(this.title, photosPhotoAlbumFullDto.title) && this.feedDisabled == photosPhotoAlbumFullDto.feedDisabled && this.feedHasPinned == photosPhotoAlbumFullDto.feedHasPinned && this.canUpload == photosPhotoAlbumFullDto.canUpload && this.commentsDisabled == photosPhotoAlbumFullDto.commentsDisabled && epx.f(this.created, photosPhotoAlbumFullDto.created) && epx.f(this.description, photosPhotoAlbumFullDto.description) && epx.f(this.canDelete, photosPhotoAlbumFullDto.canDelete) && epx.f(this.canIncludeToFeed, photosPhotoAlbumFullDto.canIncludeToFeed) && epx.f(this.isLocked, photosPhotoAlbumFullDto.isLocked) && epx.f(this.privacyComment, photosPhotoAlbumFullDto.privacyComment) && epx.f(this.privacyView, photosPhotoAlbumFullDto.privacyView) && epx.f(this.sizes, photosPhotoAlbumFullDto.sizes) && epx.f(this.thumbId, photosPhotoAlbumFullDto.thumbId) && this.thumbIsLast == photosPhotoAlbumFullDto.thumbIsLast && epx.f(this.thumbSrc, photosPhotoAlbumFullDto.thumbSrc) && epx.f(this.updated, photosPhotoAlbumFullDto.updated) && this.uploadByAdminsOnly == photosPhotoAlbumFullDto.uploadByAdminsOnly && epx.f(this.restrictions, photosPhotoAlbumFullDto.restrictions);
    }

    public final BaseBoolIntDto f() {
        return this.canUpload;
    }

    public final BaseBoolIntDto g() {
        return this.commentsDisabled;
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
        int b = wp.b(this.feedHasPinned, wp.b(this.feedDisabled, urd0.a(shy.a(this.size, bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b), 31), 31, this.title), 31), 31);
        BaseBoolIntDto baseBoolIntDto = this.canUpload;
        int hashCode = (b + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
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
        Boolean bool3 = this.isLocked;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        BasePrivacyDto basePrivacyDto = this.privacyComment;
        int hashCode8 = (hashCode7 + (basePrivacyDto == null ? 0 : basePrivacyDto.hashCode())) * 31;
        BasePrivacyDto basePrivacyDto2 = this.privacyView;
        int hashCode9 = (hashCode8 + (basePrivacyDto2 == null ? 0 : basePrivacyDto2.hashCode())) * 31;
        List<PhotosPhotoSizesDto> list = this.sizes;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.thumbId;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.thumbIsLast;
        int hashCode12 = (hashCode11 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        String str2 = this.thumbSrc;
        int hashCode13 = (hashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.updated;
        int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.uploadByAdminsOnly;
        int hashCode15 = (hashCode14 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        MediaRestrictionDto mediaRestrictionDto = this.restrictions;
        return hashCode15 + (mediaRestrictionDto != null ? mediaRestrictionDto.hashCode() : 0);
    }

    public final Integer i() {
        return this.created;
    }

    public final BaseBoolIntDto j() {
        return this.feedDisabled;
    }

    public final BasePrivacyDto k() {
        return this.privacyComment;
    }

    public final BasePrivacyDto l() {
        return this.privacyView;
    }

    public final MediaRestrictionDto n() {
        return this.restrictions;
    }

    public final int o() {
        return this.size;
    }

    public final List<PhotosPhotoSizesDto> p() {
        return this.sizes;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        return "PhotosPhotoAlbumFullDto(id=" + this.id + ", ownerId=" + this.ownerId + ", size=" + this.size + ", title=" + this.title + ", feedDisabled=" + this.feedDisabled + ", feedHasPinned=" + this.feedHasPinned + ", canUpload=" + this.canUpload + ", commentsDisabled=" + this.commentsDisabled + ", created=" + this.created + ", description=" + this.description + ", canDelete=" + this.canDelete + ", canIncludeToFeed=" + this.canIncludeToFeed + ", isLocked=" + this.isLocked + ", privacyComment=" + this.privacyComment + ", privacyView=" + this.privacyView + ", sizes=" + this.sizes + ", thumbId=" + this.thumbId + ", thumbIsLast=" + this.thumbIsLast + ", thumbSrc=" + this.thumbSrc + ", updated=" + this.updated + ", uploadByAdminsOnly=" + this.uploadByAdminsOnly + ", restrictions=" + this.restrictions + ')';
    }

    public final Integer u() {
        return this.thumbId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.size);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.feedDisabled, i);
        parcel.writeParcelable(this.feedHasPinned, i);
        parcel.writeParcelable(this.canUpload, i);
        parcel.writeParcelable(this.commentsDisabled, i);
        Integer num = this.created;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.description);
        Boolean bool = this.canDelete;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canIncludeToFeed;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isLocked;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeParcelable(this.privacyComment, i);
        parcel.writeParcelable(this.privacyView, i);
        List<PhotosPhotoSizesDto> list = this.sizes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Integer num2 = this.thumbId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeParcelable(this.thumbIsLast, i);
        parcel.writeString(this.thumbSrc);
        Integer num3 = this.updated;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeParcelable(this.uploadByAdminsOnly, i);
        parcel.writeParcelable(this.restrictions, i);
    }

    public /* synthetic */ PhotosPhotoAlbumFullDto(int i, UserId userId, int i2, String str, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, Integer num, String str2, Boolean bool, Boolean bool2, Boolean bool3, BasePrivacyDto basePrivacyDto, BasePrivacyDto basePrivacyDto2, List list, Integer num2, BaseBoolIntDto baseBoolIntDto5, String str3, Integer num3, BaseBoolIntDto baseBoolIntDto6, MediaRestrictionDto mediaRestrictionDto, int i3, zcl zclVar) {
        this(i, userId, i2, str, baseBoolIntDto, baseBoolIntDto2, (i3 & 64) != 0 ? null : baseBoolIntDto3, (i3 & 128) != 0 ? null : baseBoolIntDto4, (i3 & 256) != 0 ? null : num, (i3 & 512) != 0 ? null : str2, (i3 & 1024) != 0 ? null : bool, (i3 & 2048) != 0 ? null : bool2, (i3 & 4096) != 0 ? null : bool3, (i3 & 8192) != 0 ? null : basePrivacyDto, (i3 & 16384) != 0 ? null : basePrivacyDto2, (32768 & i3) != 0 ? null : list, (65536 & i3) != 0 ? null : num2, (131072 & i3) != 0 ? null : baseBoolIntDto5, (262144 & i3) != 0 ? null : str3, (524288 & i3) != 0 ? null : num3, (1048576 & i3) != 0 ? null : baseBoolIntDto6, (i3 & 2097152) != 0 ? null : mediaRestrictionDto);
    }
}
