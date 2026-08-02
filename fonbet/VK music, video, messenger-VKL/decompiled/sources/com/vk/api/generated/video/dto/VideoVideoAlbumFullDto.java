package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BasePrivacyDto;
import com.vk.api.generated.base.dto.BasePropertyExistsDto;
import com.vk.api.generated.media.dto.MediaRestrictionDto;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.asp;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoVideoAlbumFullDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoAlbumFullDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoAlbumFullDto> CREATOR = new a();

    @pmi0("can_delete")
    private final BaseBoolIntDto canDelete;

    @pmi0("can_edit")
    private final BaseBoolIntDto canEdit;

    @pmi0("can_remove_videos")
    private final BaseBoolIntDto canRemoveVideos;

    @pmi0("can_share")
    private final BaseBoolIntDto canShare;

    @pmi0("can_subscribe")
    private final BaseBoolIntDto canSubscribe;

    @pmi0("can_upload")
    private final BaseBoolIntDto canUpload;

    @pmi0("can_view")
    private final BaseBoolIntDto canView;

    @pmi0("count")
    private final int count;

    @pmi0("cover_video_restriction")
    private final MediaRestrictionDto coverVideoRestriction;

    @pmi0("first_video_id")
    private final String firstVideoId;

    @pmi0("first_video_url")
    private final String firstVideoUrl;

    @pmi0("followers_count")
    private final Integer followersCount;

    @pmi0("formatted_duration")
    private final String formattedDuration;

    @pmi0("id")
    private final int id;

    @pmi0("image")
    private final List<VideoVideoImageDto> image;

    @pmi0("image_blur")
    private final BasePropertyExistsDto imageBlur;

    @pmi0("is_subscribed")
    private final Boolean isSubscribed;

    @pmi0("is_system")
    private final BasePropertyExistsDto isSystem;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("parent_id")
    private final Integer parentId;

    @pmi0("privacy")
    private final BasePrivacyDto privacy;

    @pmi0(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE)
    private final ResponseTypeDto responseType;

    @pmi0("series_object")
    private final VideoVideoSeriesObjectDto seriesObject;

    @pmi0("share_url")
    private final String shareUrl;

    @pmi0("temporary_object")
    private final VideoAiAssistantTemporaryPlaylistDto temporaryObject;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final Integer type;

    @pmi0("updated_time")
    private final int updatedTime;

    @pmi0("vertical_image")
    private final List<VideoVideoImageDto> verticalImage;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoVideoAlbumFullDto.kt */
    public static final class ResponseTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ResponseTypeDto[] $VALUES;
        public static final Parcelable.Creator<ResponseTypeDto> CREATOR;

        @pmi0("full")
        public static final ResponseTypeDto FULL;

        @pmi0(UcumUtils.UCUM_MINUTES)
        public static final ResponseTypeDto MIN;
        private final String value;

        /* compiled from: VideoVideoAlbumFullDto.kt */
        public static final class a implements Parcelable.Creator<ResponseTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final ResponseTypeDto createFromParcel(Parcel parcel) {
                return ResponseTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ResponseTypeDto[] newArray(int i) {
                return new ResponseTypeDto[i];
            }
        }

        static {
            ResponseTypeDto responseTypeDto = new ResponseTypeDto("MIN", 0, UcumUtils.UCUM_MINUTES);
            MIN = responseTypeDto;
            ResponseTypeDto responseTypeDto2 = new ResponseTypeDto("FULL", 1, "full");
            FULL = responseTypeDto2;
            ResponseTypeDto[] responseTypeDtoArr = {responseTypeDto, responseTypeDto2};
            $VALUES = responseTypeDtoArr;
            $ENTRIES = new asp(responseTypeDtoArr);
            CREATOR = new a();
        }

        private ResponseTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ResponseTypeDto valueOf(String str) {
            return (ResponseTypeDto) Enum.valueOf(ResponseTypeDto.class, str);
        }

        public static ResponseTypeDto[] values() {
            return (ResponseTypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: VideoVideoAlbumFullDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoAlbumFullDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoAlbumFullDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean valueOf;
            VideoVideoSeriesObjectDto videoVideoSeriesObjectDto;
            VideoAiAssistantTemporaryPlaylistDto createFromParcel;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(VideoVideoAlbumFullDto.class.getClassLoader());
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList = new ArrayList(readInt4);
                int i = 0;
                while (i != readInt4) {
                    i = bo.b(VideoVideoAlbumFullDto.class, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt5);
                int i2 = 0;
                while (i2 != readInt5) {
                    i2 = bo.b(VideoVideoAlbumFullDto.class, parcel, arrayList3, i2, 1);
                }
                arrayList2 = arrayList3;
            }
            BasePropertyExistsDto basePropertyExistsDto = (BasePropertyExistsDto) parcel.readParcelable(VideoVideoAlbumFullDto.class.getClassLoader());
            MediaRestrictionDto mediaRestrictionDto = (MediaRestrictionDto) parcel.readParcelable(VideoVideoAlbumFullDto.class.getClassLoader());
            BasePropertyExistsDto basePropertyExistsDto2 = (BasePropertyExistsDto) parcel.readParcelable(VideoVideoAlbumFullDto.class.getClassLoader());
            BasePrivacyDto basePrivacyDto = (BasePrivacyDto) parcel.readParcelable(VideoVideoAlbumFullDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(VideoVideoAlbumFullDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto2 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoAlbumFullDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoAlbumFullDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoAlbumFullDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoAlbumFullDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoAlbumFullDto.class.getClassLoader());
            String readString2 = parcel.readString();
            ArrayList arrayList4 = arrayList;
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto7 = (BaseBoolIntDto) parcel.readParcelable(VideoVideoAlbumFullDto.class.getClassLoader());
            VideoVideoSeriesObjectDto videoVideoSeriesObjectDto2 = null;
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                videoVideoSeriesObjectDto2 = VideoVideoSeriesObjectDto.CREATOR.createFromParcel(parcel);
            }
            VideoVideoSeriesObjectDto videoVideoSeriesObjectDto3 = videoVideoSeriesObjectDto2;
            if (parcel.readInt() == 0) {
                videoVideoSeriesObjectDto = videoVideoSeriesObjectDto3;
                createFromParcel = null;
            } else {
                videoVideoSeriesObjectDto = videoVideoSeriesObjectDto3;
                createFromParcel = VideoAiAssistantTemporaryPlaylistDto.CREATOR.createFromParcel(parcel);
            }
            return new VideoVideoAlbumFullDto(readInt, readInt2, readInt3, userId, readString, arrayList4, arrayList2, basePropertyExistsDto, mediaRestrictionDto, basePropertyExistsDto2, basePrivacyDto, valueOf, valueOf2, baseBoolIntDto, baseBoolIntDto2, baseBoolIntDto3, baseBoolIntDto4, baseBoolIntDto5, baseBoolIntDto6, readString2, readString3, readString4, baseBoolIntDto7, readString5, videoVideoSeriesObjectDto, createFromParcel, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : ResponseTypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoAlbumFullDto[] newArray(int i) {
            return new VideoVideoAlbumFullDto[i];
        }
    }

    public VideoVideoAlbumFullDto(int i, int i2, int i3, UserId userId, String str, List<VideoVideoImageDto> list, List<VideoVideoImageDto> list2, BasePropertyExistsDto basePropertyExistsDto, MediaRestrictionDto mediaRestrictionDto, BasePropertyExistsDto basePropertyExistsDto2, BasePrivacyDto basePrivacyDto, Boolean bool, Integer num, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, String str2, String str3, String str4, BaseBoolIntDto baseBoolIntDto7, String str5, VideoVideoSeriesObjectDto videoVideoSeriesObjectDto, VideoAiAssistantTemporaryPlaylistDto videoAiAssistantTemporaryPlaylistDto, Integer num2, Integer num3, String str6, ResponseTypeDto responseTypeDto) {
        this.count = i;
        this.updatedTime = i2;
        this.id = i3;
        this.ownerId = userId;
        this.title = str;
        this.image = list;
        this.verticalImage = list2;
        this.imageBlur = basePropertyExistsDto;
        this.coverVideoRestriction = mediaRestrictionDto;
        this.isSystem = basePropertyExistsDto2;
        this.privacy = basePrivacyDto;
        this.isSubscribed = bool;
        this.followersCount = num;
        this.canEdit = baseBoolIntDto;
        this.canDelete = baseBoolIntDto2;
        this.canUpload = baseBoolIntDto3;
        this.canView = baseBoolIntDto4;
        this.canShare = baseBoolIntDto5;
        this.canRemoveVideos = baseBoolIntDto6;
        this.firstVideoId = str2;
        this.firstVideoUrl = str3;
        this.formattedDuration = str4;
        this.canSubscribe = baseBoolIntDto7;
        this.shareUrl = str5;
        this.seriesObject = videoVideoSeriesObjectDto;
        this.temporaryObject = videoAiAssistantTemporaryPlaylistDto;
        this.type = num2;
        this.parentId = num3;
        this.trackCode = str6;
        this.responseType = responseTypeDto;
    }

    public final BaseBoolIntDto d() {
        return this.canView;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MediaRestrictionDto e() {
        return this.coverVideoRestriction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoAlbumFullDto)) {
            return false;
        }
        VideoVideoAlbumFullDto videoVideoAlbumFullDto = (VideoVideoAlbumFullDto) obj;
        return this.count == videoVideoAlbumFullDto.count && this.updatedTime == videoVideoAlbumFullDto.updatedTime && this.id == videoVideoAlbumFullDto.id && epx.f(this.ownerId, videoVideoAlbumFullDto.ownerId) && epx.f(this.title, videoVideoAlbumFullDto.title) && epx.f(this.image, videoVideoAlbumFullDto.image) && epx.f(this.verticalImage, videoVideoAlbumFullDto.verticalImage) && this.imageBlur == videoVideoAlbumFullDto.imageBlur && epx.f(this.coverVideoRestriction, videoVideoAlbumFullDto.coverVideoRestriction) && this.isSystem == videoVideoAlbumFullDto.isSystem && epx.f(this.privacy, videoVideoAlbumFullDto.privacy) && epx.f(this.isSubscribed, videoVideoAlbumFullDto.isSubscribed) && epx.f(this.followersCount, videoVideoAlbumFullDto.followersCount) && this.canEdit == videoVideoAlbumFullDto.canEdit && this.canDelete == videoVideoAlbumFullDto.canDelete && this.canUpload == videoVideoAlbumFullDto.canUpload && this.canView == videoVideoAlbumFullDto.canView && this.canShare == videoVideoAlbumFullDto.canShare && this.canRemoveVideos == videoVideoAlbumFullDto.canRemoveVideos && epx.f(this.firstVideoId, videoVideoAlbumFullDto.firstVideoId) && epx.f(this.firstVideoUrl, videoVideoAlbumFullDto.firstVideoUrl) && epx.f(this.formattedDuration, videoVideoAlbumFullDto.formattedDuration) && this.canSubscribe == videoVideoAlbumFullDto.canSubscribe && epx.f(this.shareUrl, videoVideoAlbumFullDto.shareUrl) && epx.f(this.seriesObject, videoVideoAlbumFullDto.seriesObject) && epx.f(this.temporaryObject, videoVideoAlbumFullDto.temporaryObject) && epx.f(this.type, videoVideoAlbumFullDto.type) && epx.f(this.parentId, videoVideoAlbumFullDto.parentId) && epx.f(this.trackCode, videoVideoAlbumFullDto.trackCode) && this.responseType == videoVideoAlbumFullDto.responseType;
    }

    public final Integer f() {
        return this.followersCount;
    }

    public final List<VideoVideoImageDto> g() {
        return this.image;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(bh10.a(shy.a(this.id, shy.a(this.updatedTime, Integer.hashCode(this.count) * 31, 31), 31), 31, this.ownerId.b), 31, this.title);
        List<VideoVideoImageDto> list = this.image;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<VideoVideoImageDto> list2 = this.verticalImage;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        BasePropertyExistsDto basePropertyExistsDto = this.imageBlur;
        int hashCode3 = (hashCode2 + (basePropertyExistsDto == null ? 0 : basePropertyExistsDto.hashCode())) * 31;
        MediaRestrictionDto mediaRestrictionDto = this.coverVideoRestriction;
        int hashCode4 = (hashCode3 + (mediaRestrictionDto == null ? 0 : mediaRestrictionDto.hashCode())) * 31;
        BasePropertyExistsDto basePropertyExistsDto2 = this.isSystem;
        int hashCode5 = (hashCode4 + (basePropertyExistsDto2 == null ? 0 : basePropertyExistsDto2.hashCode())) * 31;
        BasePrivacyDto basePrivacyDto = this.privacy;
        int hashCode6 = (hashCode5 + (basePrivacyDto == null ? 0 : basePrivacyDto.hashCode())) * 31;
        Boolean bool = this.isSubscribed;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.followersCount;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.canEdit;
        int hashCode9 = (hashCode8 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.canDelete;
        int hashCode10 = (hashCode9 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.canUpload;
        int hashCode11 = (hashCode10 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.canView;
        int hashCode12 = (hashCode11 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.canShare;
        int hashCode13 = (hashCode12 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto6 = this.canRemoveVideos;
        int hashCode14 = (hashCode13 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
        String str = this.firstVideoId;
        int hashCode15 = (hashCode14 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstVideoUrl;
        int hashCode16 = (hashCode15 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.formattedDuration;
        int hashCode17 = (hashCode16 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto7 = this.canSubscribe;
        int hashCode18 = (hashCode17 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
        String str4 = this.shareUrl;
        int hashCode19 = (hashCode18 + (str4 == null ? 0 : str4.hashCode())) * 31;
        VideoVideoSeriesObjectDto videoVideoSeriesObjectDto = this.seriesObject;
        int hashCode20 = (hashCode19 + (videoVideoSeriesObjectDto == null ? 0 : videoVideoSeriesObjectDto.hashCode())) * 31;
        VideoAiAssistantTemporaryPlaylistDto videoAiAssistantTemporaryPlaylistDto = this.temporaryObject;
        int hashCode21 = (hashCode20 + (videoAiAssistantTemporaryPlaylistDto == null ? 0 : videoAiAssistantTemporaryPlaylistDto.hashCode())) * 31;
        Integer num2 = this.type;
        int hashCode22 = (hashCode21 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.parentId;
        int hashCode23 = (hashCode22 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.trackCode;
        int hashCode24 = (hashCode23 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ResponseTypeDto responseTypeDto = this.responseType;
        return hashCode24 + (responseTypeDto != null ? responseTypeDto.hashCode() : 0);
    }

    public final BasePropertyExistsDto i() {
        return this.imageBlur;
    }

    public final BasePrivacyDto j() {
        return this.privacy;
    }

    public final VideoVideoSeriesObjectDto k() {
        return this.seriesObject;
    }

    public final int l() {
        return this.updatedTime;
    }

    public final Boolean n() {
        return this.isSubscribed;
    }

    public final BasePropertyExistsDto o() {
        return this.isSystem;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        return "VideoVideoAlbumFullDto(count=" + this.count + ", updatedTime=" + this.updatedTime + ", id=" + this.id + ", ownerId=" + this.ownerId + ", title=" + this.title + ", image=" + this.image + ", verticalImage=" + this.verticalImage + ", imageBlur=" + this.imageBlur + ", coverVideoRestriction=" + this.coverVideoRestriction + ", isSystem=" + this.isSystem + ", privacy=" + this.privacy + ", isSubscribed=" + this.isSubscribed + ", followersCount=" + this.followersCount + ", canEdit=" + this.canEdit + ", canDelete=" + this.canDelete + ", canUpload=" + this.canUpload + ", canView=" + this.canView + ", canShare=" + this.canShare + ", canRemoveVideos=" + this.canRemoveVideos + ", firstVideoId=" + this.firstVideoId + ", firstVideoUrl=" + this.firstVideoUrl + ", formattedDuration=" + this.formattedDuration + ", canSubscribe=" + this.canSubscribe + ", shareUrl=" + this.shareUrl + ", seriesObject=" + this.seriesObject + ", temporaryObject=" + this.temporaryObject + ", type=" + this.type + ", parentId=" + this.parentId + ", trackCode=" + this.trackCode + ", responseType=" + this.responseType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        parcel.writeInt(this.updatedTime);
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.title);
        List<VideoVideoImageDto> list = this.image;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<VideoVideoImageDto> list2 = this.verticalImage;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeParcelable(this.imageBlur, i);
        parcel.writeParcelable(this.coverVideoRestriction, i);
        parcel.writeParcelable(this.isSystem, i);
        parcel.writeParcelable(this.privacy, i);
        Boolean bool = this.isSubscribed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num = this.followersCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.canEdit, i);
        parcel.writeParcelable(this.canDelete, i);
        parcel.writeParcelable(this.canUpload, i);
        parcel.writeParcelable(this.canView, i);
        parcel.writeParcelable(this.canShare, i);
        parcel.writeParcelable(this.canRemoveVideos, i);
        parcel.writeString(this.firstVideoId);
        parcel.writeString(this.firstVideoUrl);
        parcel.writeString(this.formattedDuration);
        parcel.writeParcelable(this.canSubscribe, i);
        parcel.writeString(this.shareUrl);
        VideoVideoSeriesObjectDto videoVideoSeriesObjectDto = this.seriesObject;
        if (videoVideoSeriesObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoVideoSeriesObjectDto.writeToParcel(parcel, i);
        }
        VideoAiAssistantTemporaryPlaylistDto videoAiAssistantTemporaryPlaylistDto = this.temporaryObject;
        if (videoAiAssistantTemporaryPlaylistDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoAiAssistantTemporaryPlaylistDto.writeToParcel(parcel, i);
        }
        Integer num2 = this.type;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.parentId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.trackCode);
        ResponseTypeDto responseTypeDto = this.responseType;
        if (responseTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            responseTypeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoVideoAlbumFullDto(int i, int i2, int i3, UserId userId, String str, List list, List list2, BasePropertyExistsDto basePropertyExistsDto, MediaRestrictionDto mediaRestrictionDto, BasePropertyExistsDto basePropertyExistsDto2, BasePrivacyDto basePrivacyDto, Boolean bool, Integer num, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, String str2, String str3, String str4, BaseBoolIntDto baseBoolIntDto7, String str5, VideoVideoSeriesObjectDto videoVideoSeriesObjectDto, VideoAiAssistantTemporaryPlaylistDto videoAiAssistantTemporaryPlaylistDto, Integer num2, Integer num3, String str6, ResponseTypeDto responseTypeDto, int i4, zcl zclVar) {
        this(i, i2, i3, userId, str, (i4 & 32) != 0 ? null : list, (i4 & 64) != 0 ? null : list2, (i4 & 128) != 0 ? null : basePropertyExistsDto, (i4 & 256) != 0 ? null : mediaRestrictionDto, (i4 & 512) != 0 ? null : basePropertyExistsDto2, (i4 & 1024) != 0 ? null : basePrivacyDto, (i4 & 2048) != 0 ? null : bool, (i4 & 4096) != 0 ? null : num, (i4 & 8192) != 0 ? null : baseBoolIntDto, (i4 & 16384) != 0 ? null : baseBoolIntDto2, (32768 & i4) != 0 ? null : baseBoolIntDto3, (65536 & i4) != 0 ? null : baseBoolIntDto4, (131072 & i4) != 0 ? null : baseBoolIntDto5, (262144 & i4) != 0 ? null : baseBoolIntDto6, (524288 & i4) != 0 ? null : str2, (1048576 & i4) != 0 ? null : str3, (2097152 & i4) != 0 ? null : str4, (4194304 & i4) != 0 ? null : baseBoolIntDto7, (8388608 & i4) != 0 ? null : str5, (16777216 & i4) != 0 ? null : videoVideoSeriesObjectDto, (33554432 & i4) != 0 ? null : videoAiAssistantTemporaryPlaylistDto, (67108864 & i4) != 0 ? null : num2, (134217728 & i4) != 0 ? null : num3, (268435456 & i4) != 0 ? null : str6, (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : responseTypeDto);
    }
}
