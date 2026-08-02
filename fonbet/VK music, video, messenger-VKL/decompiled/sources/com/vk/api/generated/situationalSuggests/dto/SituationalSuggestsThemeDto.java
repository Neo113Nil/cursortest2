package com.vk.api.generated.situationalSuggests.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: SituationalSuggestsThemeDto.kt */
/* loaded from: classes15.dex */
public final class SituationalSuggestsThemeDto implements Parcelable {
    public static final Parcelable.Creator<SituationalSuggestsThemeDto> CREATOR = new a();

    @pmi0("can_delete")
    private final Boolean canDelete;

    @pmi0("can_edit")
    private final Boolean canEdit;

    @pmi0("category")
    private final SituationalSuggestsThemeCategoryDto category;

    @pmi0("cover_photo")
    private final PhotosPhotoDto coverPhoto;

    @pmi0("date")
    private final Integer date;

    @pmi0("date_end")
    private final Integer dateEnd;

    @pmi0("date_start")
    private final Integer dateStart;

    @pmi0("description")
    private final String description;

    @pmi0("detailed_description")
    private final String detailedDescription;

    @pmi0("friends_posted")
    private final List<UserId> friendsPosted;

    @pmi0("friends_posted_count")
    private final Integer friendsPostedCount;

    @pmi0("id")
    private final int id;

    @pmi0("interface_variant")
    private final SituationalSuggestsInterfaceVariantDto interfaceVariant;

    @pmi0("is_anonymous")
    private final Boolean isAnonymous;

    @pmi0("is_deleted")
    private final Boolean isDeleted;

    @pmi0("link")
    private final String link;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("playlist")
    private final AudioPlaylistDto playlist;

    @pmi0("post_photos")
    private final List<PhotosPhotoDto> postPhotos;

    @pmi0("post_text")
    private final String postText;

    @pmi0("publications_count")
    private final Integer publicationsCount;

    @pmi0("squared_cover_photo")
    private final PhotosPhotoDto squaredCoverPhoto;

    @pmi0("story_box")
    private final String storyBox;

    @pmi0("story_photos")
    private final List<PhotosPhotoDto> storyPhotos;

    @pmi0("title")
    private final String title;

    @pmi0("views_count")
    private final Integer viewsCount;

    /* compiled from: SituationalSuggestsThemeDto.kt */
    public static final class a implements Parcelable.Creator<SituationalSuggestsThemeDto> {
        @Override // android.os.Parcelable.Creator
        public final SituationalSuggestsThemeDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int i;
            ArrayList arrayList;
            Boolean bool;
            UserId userId;
            int i2;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Boolean valueOf2;
            Boolean bool2;
            Integer num;
            ArrayList arrayList4;
            Integer num2;
            Boolean valueOf3;
            Boolean valueOf4;
            int readInt = parcel.readInt();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            UserId userId2 = (UserId) parcel.readParcelable(SituationalSuggestsThemeDto.class.getClassLoader());
            String readString = parcel.readString();
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            UserId userId3 = userId2;
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            SituationalSuggestsThemeCategoryDto createFromParcel = parcel.readInt() == 0 ? null : SituationalSuggestsThemeCategoryDto.CREATOR.createFromParcel(parcel);
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) parcel.readParcelable(SituationalSuggestsThemeDto.class.getClassLoader());
            PhotosPhotoDto photosPhotoDto2 = (PhotosPhotoDto) parcel.readParcelable(SituationalSuggestsThemeDto.class.getClassLoader());
            Integer num3 = valueOf6;
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                i = readInt;
                arrayList = new ArrayList(readInt2);
                bool = valueOf;
                int i3 = 0;
                while (true) {
                    userId = userId3;
                    i2 = 1;
                    if (i3 == readInt2) {
                        break;
                    }
                    i3 = bo.b(SituationalSuggestsThemeDto.class, parcel, arrayList, i3, 1);
                    userId3 = userId;
                }
            } else {
                i = readInt;
                bool = valueOf;
                arrayList = null;
                userId = userId3;
                i2 = 1;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList;
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                arrayList3 = arrayList;
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(SituationalSuggestsThemeDto.class, parcel, arrayList2, i4, i2);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                bool2 = valueOf2;
                num = valueOf8;
                num2 = valueOf9;
                arrayList4 = null;
            } else {
                bool2 = valueOf2;
                int readInt4 = parcel.readInt();
                num = valueOf8;
                arrayList4 = new ArrayList(readInt4);
                num2 = valueOf9;
                int i5 = 0;
                while (i5 != readInt4) {
                    i5 = bo.b(SituationalSuggestsThemeDto.class, parcel, arrayList4, i5, 1);
                    readInt4 = readInt4;
                }
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SituationalSuggestsThemeDto(i, bool, userId, readString, valueOf5, readString2, readString3, readString4, createFromParcel, num3, valueOf7, photosPhotoDto, photosPhotoDto2, readString5, arrayList3, arrayList2, bool2, num, num2, valueOf10, arrayList4, valueOf3, valueOf4, parcel.readInt() == 0 ? null : SituationalSuggestsInterfaceVariantDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AudioPlaylistDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SituationalSuggestsThemeDto[] newArray(int i) {
            return new SituationalSuggestsThemeDto[i];
        }
    }

    public SituationalSuggestsThemeDto(int i, Boolean bool, UserId userId, String str, Integer num, String str2, String str3, String str4, SituationalSuggestsThemeCategoryDto situationalSuggestsThemeCategoryDto, Integer num2, Integer num3, PhotosPhotoDto photosPhotoDto, PhotosPhotoDto photosPhotoDto2, String str5, List<PhotosPhotoDto> list, List<PhotosPhotoDto> list2, Boolean bool2, Integer num4, Integer num5, Integer num6, List<UserId> list3, Boolean bool3, Boolean bool4, SituationalSuggestsInterfaceVariantDto situationalSuggestsInterfaceVariantDto, AudioPlaylistDto audioPlaylistDto, String str6) {
        this.id = i;
        this.isDeleted = bool;
        this.ownerId = userId;
        this.link = str;
        this.date = num;
        this.title = str2;
        this.description = str3;
        this.detailedDescription = str4;
        this.category = situationalSuggestsThemeCategoryDto;
        this.dateStart = num2;
        this.dateEnd = num3;
        this.coverPhoto = photosPhotoDto;
        this.squaredCoverPhoto = photosPhotoDto2;
        this.postText = str5;
        this.postPhotos = list;
        this.storyPhotos = list2;
        this.isAnonymous = bool2;
        this.publicationsCount = num4;
        this.viewsCount = num5;
        this.friendsPostedCount = num6;
        this.friendsPosted = list3;
        this.canEdit = bool3;
        this.canDelete = bool4;
        this.interfaceVariant = situationalSuggestsInterfaceVariantDto;
        this.playlist = audioPlaylistDto;
        this.storyBox = str6;
    }

    public final String d() {
        return this.link;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.storyBox;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SituationalSuggestsThemeDto)) {
            return false;
        }
        SituationalSuggestsThemeDto situationalSuggestsThemeDto = (SituationalSuggestsThemeDto) obj;
        return this.id == situationalSuggestsThemeDto.id && epx.f(this.isDeleted, situationalSuggestsThemeDto.isDeleted) && epx.f(this.ownerId, situationalSuggestsThemeDto.ownerId) && epx.f(this.link, situationalSuggestsThemeDto.link) && epx.f(this.date, situationalSuggestsThemeDto.date) && epx.f(this.title, situationalSuggestsThemeDto.title) && epx.f(this.description, situationalSuggestsThemeDto.description) && epx.f(this.detailedDescription, situationalSuggestsThemeDto.detailedDescription) && this.category == situationalSuggestsThemeDto.category && epx.f(this.dateStart, situationalSuggestsThemeDto.dateStart) && epx.f(this.dateEnd, situationalSuggestsThemeDto.dateEnd) && epx.f(this.coverPhoto, situationalSuggestsThemeDto.coverPhoto) && epx.f(this.squaredCoverPhoto, situationalSuggestsThemeDto.squaredCoverPhoto) && epx.f(this.postText, situationalSuggestsThemeDto.postText) && epx.f(this.postPhotos, situationalSuggestsThemeDto.postPhotos) && epx.f(this.storyPhotos, situationalSuggestsThemeDto.storyPhotos) && epx.f(this.isAnonymous, situationalSuggestsThemeDto.isAnonymous) && epx.f(this.publicationsCount, situationalSuggestsThemeDto.publicationsCount) && epx.f(this.viewsCount, situationalSuggestsThemeDto.viewsCount) && epx.f(this.friendsPostedCount, situationalSuggestsThemeDto.friendsPostedCount) && epx.f(this.friendsPosted, situationalSuggestsThemeDto.friendsPosted) && epx.f(this.canEdit, situationalSuggestsThemeDto.canEdit) && epx.f(this.canDelete, situationalSuggestsThemeDto.canDelete) && this.interfaceVariant == situationalSuggestsThemeDto.interfaceVariant && epx.f(this.playlist, situationalSuggestsThemeDto.playlist) && epx.f(this.storyBox, situationalSuggestsThemeDto.storyBox);
    }

    public final Boolean f() {
        return this.isDeleted;
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
        int hashCode = Integer.hashCode(this.id) * 31;
        Boolean bool = this.isDeleted;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.link;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.date;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.title;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.detailedDescription;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SituationalSuggestsThemeCategoryDto situationalSuggestsThemeCategoryDto = this.category;
        int hashCode9 = (hashCode8 + (situationalSuggestsThemeCategoryDto == null ? 0 : situationalSuggestsThemeCategoryDto.hashCode())) * 31;
        Integer num2 = this.dateStart;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.dateEnd;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.coverPhoto;
        int hashCode12 = (hashCode11 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto2 = this.squaredCoverPhoto;
        int hashCode13 = (hashCode12 + (photosPhotoDto2 == null ? 0 : photosPhotoDto2.hashCode())) * 31;
        String str5 = this.postText;
        int hashCode14 = (hashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<PhotosPhotoDto> list = this.postPhotos;
        int hashCode15 = (hashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        List<PhotosPhotoDto> list2 = this.storyPhotos;
        int hashCode16 = (hashCode15 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool2 = this.isAnonymous;
        int hashCode17 = (hashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num4 = this.publicationsCount;
        int hashCode18 = (hashCode17 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.viewsCount;
        int hashCode19 = (hashCode18 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.friendsPostedCount;
        int hashCode20 = (hashCode19 + (num6 == null ? 0 : num6.hashCode())) * 31;
        List<UserId> list3 = this.friendsPosted;
        int hashCode21 = (hashCode20 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool3 = this.canEdit;
        int hashCode22 = (hashCode21 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canDelete;
        int hashCode23 = (hashCode22 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        SituationalSuggestsInterfaceVariantDto situationalSuggestsInterfaceVariantDto = this.interfaceVariant;
        int hashCode24 = (hashCode23 + (situationalSuggestsInterfaceVariantDto == null ? 0 : situationalSuggestsInterfaceVariantDto.hashCode())) * 31;
        AudioPlaylistDto audioPlaylistDto = this.playlist;
        int hashCode25 = (hashCode24 + (audioPlaylistDto == null ? 0 : audioPlaylistDto.hashCode())) * 31;
        String str6 = this.storyBox;
        return hashCode25 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SituationalSuggestsThemeDto(id=");
        sb.append(this.id);
        sb.append(", isDeleted=");
        sb.append(this.isDeleted);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", detailedDescription=");
        sb.append(this.detailedDescription);
        sb.append(", category=");
        sb.append(this.category);
        sb.append(", dateStart=");
        sb.append(this.dateStart);
        sb.append(", dateEnd=");
        sb.append(this.dateEnd);
        sb.append(", coverPhoto=");
        sb.append(this.coverPhoto);
        sb.append(", squaredCoverPhoto=");
        sb.append(this.squaredCoverPhoto);
        sb.append(", postText=");
        sb.append(this.postText);
        sb.append(", postPhotos=");
        sb.append(this.postPhotos);
        sb.append(", storyPhotos=");
        sb.append(this.storyPhotos);
        sb.append(", isAnonymous=");
        sb.append(this.isAnonymous);
        sb.append(", publicationsCount=");
        sb.append(this.publicationsCount);
        sb.append(", viewsCount=");
        sb.append(this.viewsCount);
        sb.append(", friendsPostedCount=");
        sb.append(this.friendsPostedCount);
        sb.append(", friendsPosted=");
        sb.append(this.friendsPosted);
        sb.append(", canEdit=");
        sb.append(this.canEdit);
        sb.append(", canDelete=");
        sb.append(this.canDelete);
        sb.append(", interfaceVariant=");
        sb.append(this.interfaceVariant);
        sb.append(", playlist=");
        sb.append(this.playlist);
        sb.append(", storyBox=");
        return ho8.a(sb, this.storyBox, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        Boolean bool = this.isDeleted;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.link);
        Integer num = this.date;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.detailedDescription);
        SituationalSuggestsThemeCategoryDto situationalSuggestsThemeCategoryDto = this.category;
        if (situationalSuggestsThemeCategoryDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            situationalSuggestsThemeCategoryDto.writeToParcel(parcel, i);
        }
        Integer num2 = this.dateStart;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.dateEnd;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeParcelable(this.coverPhoto, i);
        parcel.writeParcelable(this.squaredCoverPhoto, i);
        parcel.writeString(this.postText);
        List<PhotosPhotoDto> list = this.postPhotos;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<PhotosPhotoDto> list2 = this.storyPhotos;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        Boolean bool2 = this.isAnonymous;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num4 = this.publicationsCount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.viewsCount;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Integer num6 = this.friendsPostedCount;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        List<UserId> list3 = this.friendsPosted;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        Boolean bool3 = this.canEdit;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.canDelete;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        SituationalSuggestsInterfaceVariantDto situationalSuggestsInterfaceVariantDto = this.interfaceVariant;
        if (situationalSuggestsInterfaceVariantDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            situationalSuggestsInterfaceVariantDto.writeToParcel(parcel, i);
        }
        AudioPlaylistDto audioPlaylistDto = this.playlist;
        if (audioPlaylistDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioPlaylistDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.storyBox);
    }

    public /* synthetic */ SituationalSuggestsThemeDto(int i, Boolean bool, UserId userId, String str, Integer num, String str2, String str3, String str4, SituationalSuggestsThemeCategoryDto situationalSuggestsThemeCategoryDto, Integer num2, Integer num3, PhotosPhotoDto photosPhotoDto, PhotosPhotoDto photosPhotoDto2, String str5, List list, List list2, Boolean bool2, Integer num4, Integer num5, Integer num6, List list3, Boolean bool3, Boolean bool4, SituationalSuggestsInterfaceVariantDto situationalSuggestsInterfaceVariantDto, AudioPlaylistDto audioPlaylistDto, String str6, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? null : userId, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? null : situationalSuggestsThemeCategoryDto, (i2 & 512) != 0 ? null : num2, (i2 & 1024) != 0 ? null : num3, (i2 & 2048) != 0 ? null : photosPhotoDto, (i2 & 4096) != 0 ? null : photosPhotoDto2, (i2 & 8192) != 0 ? null : str5, (i2 & 16384) != 0 ? null : list, (i2 & 32768) != 0 ? null : list2, (i2 & 65536) != 0 ? null : bool2, (i2 & 131072) != 0 ? null : num4, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num5, (i2 & 524288) != 0 ? null : num6, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list3, (i2 & 2097152) != 0 ? null : bool3, (i2 & 4194304) != 0 ? null : bool4, (i2 & 8388608) != 0 ? null : situationalSuggestsInterfaceVariantDto, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : audioPlaylistDto, (i2 & 33554432) != 0 ? null : str6);
    }
}
