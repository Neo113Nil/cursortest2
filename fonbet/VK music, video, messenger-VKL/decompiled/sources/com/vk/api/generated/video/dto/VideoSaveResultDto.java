package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: VideoSaveResultDto.kt */
/* loaded from: classes15.dex */
public final class VideoSaveResultDto implements Parcelable {
    public static final Parcelable.Creator<VideoSaveResultDto> CREATOR = new a();

    @pmi0("access_by_link_key")
    private final String accessByLinkKey;

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("can_start_cover_ab_test")
    private final Boolean canStartCoverAbTest;

    @pmi0("description")
    private final String description;

    @pmi0("fallback_upload_url")
    private final String fallbackUploadUrl;

    @pmi0("generated_title")
    private final String generatedTitle;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("owner_toggles")
    private final Object ownerToggles;

    @pmi0("thumb_upload_url")
    private final String thumbUploadUrl;

    @pmi0("title")
    private final String title;

    @pmi0("upload_config")
    private final VideoSaveUploadConfigDto uploadConfig;

    @pmi0(ApiProtocol.KEY_UPLOAD_URL)
    private final String uploadUrl;

    @pmi0("video_id")
    private final Integer videoId;

    /* compiled from: VideoSaveResultDto.kt */
    public static final class a implements Parcelable.Creator<VideoSaveResultDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoSaveResultDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(VideoSaveResultDto.class.getClassLoader());
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            Boolean bool = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString7 = parcel.readString();
            Integer num = valueOf;
            String readString8 = parcel.readString();
            Object readValue = parcel.readValue(VideoSaveResultDto.class.getClassLoader());
            VideoSaveUploadConfigDto createFromParcel = parcel.readInt() == 0 ? null : VideoSaveUploadConfigDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoSaveResultDto(readString, readString2, readString3, userId, readString4, readString5, readString6, num, readString7, readString8, readValue, createFromParcel, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSaveResultDto[] newArray(int i) {
            return new VideoSaveResultDto[i];
        }
    }

    public VideoSaveResultDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public final String d() {
        return this.accessKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.fallbackUploadUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSaveResultDto)) {
            return false;
        }
        VideoSaveResultDto videoSaveResultDto = (VideoSaveResultDto) obj;
        return epx.f(this.accessKey, videoSaveResultDto.accessKey) && epx.f(this.accessByLinkKey, videoSaveResultDto.accessByLinkKey) && epx.f(this.description, videoSaveResultDto.description) && epx.f(this.ownerId, videoSaveResultDto.ownerId) && epx.f(this.title, videoSaveResultDto.title) && epx.f(this.generatedTitle, videoSaveResultDto.generatedTitle) && epx.f(this.uploadUrl, videoSaveResultDto.uploadUrl) && epx.f(this.videoId, videoSaveResultDto.videoId) && epx.f(this.thumbUploadUrl, videoSaveResultDto.thumbUploadUrl) && epx.f(this.fallbackUploadUrl, videoSaveResultDto.fallbackUploadUrl) && epx.f(this.ownerToggles, videoSaveResultDto.ownerToggles) && epx.f(this.uploadConfig, videoSaveResultDto.uploadConfig) && epx.f(this.canStartCoverAbTest, videoSaveResultDto.canStartCoverAbTest);
    }

    public final String f() {
        return this.uploadUrl;
    }

    public final Integer g() {
        return this.videoId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.accessKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accessByLinkKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode4 = (hashCode3 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str4 = this.title;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.generatedTitle;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.uploadUrl;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.videoId;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.thumbUploadUrl;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.fallbackUploadUrl;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Object obj = this.ownerToggles;
        int hashCode11 = (hashCode10 + (obj == null ? 0 : obj.hashCode())) * 31;
        VideoSaveUploadConfigDto videoSaveUploadConfigDto = this.uploadConfig;
        int hashCode12 = (hashCode11 + (videoSaveUploadConfigDto == null ? 0 : videoSaveUploadConfigDto.hashCode())) * 31;
        Boolean bool = this.canStartCoverAbTest;
        return hashCode12 + (bool != null ? bool.hashCode() : 0);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSaveResultDto(accessKey=");
        sb.append(this.accessKey);
        sb.append(", accessByLinkKey=");
        sb.append(this.accessByLinkKey);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", generatedTitle=");
        sb.append(this.generatedTitle);
        sb.append(", uploadUrl=");
        sb.append(this.uploadUrl);
        sb.append(", videoId=");
        sb.append(this.videoId);
        sb.append(", thumbUploadUrl=");
        sb.append(this.thumbUploadUrl);
        sb.append(", fallbackUploadUrl=");
        sb.append(this.fallbackUploadUrl);
        sb.append(", ownerToggles=");
        sb.append(this.ownerToggles);
        sb.append(", uploadConfig=");
        sb.append(this.uploadConfig);
        sb.append(", canStartCoverAbTest=");
        return tn.a(sb, this.canStartCoverAbTest, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.accessKey);
        parcel.writeString(this.accessByLinkKey);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.title);
        parcel.writeString(this.generatedTitle);
        parcel.writeString(this.uploadUrl);
        Integer num = this.videoId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.thumbUploadUrl);
        parcel.writeString(this.fallbackUploadUrl);
        parcel.writeValue(this.ownerToggles);
        VideoSaveUploadConfigDto videoSaveUploadConfigDto = this.uploadConfig;
        if (videoSaveUploadConfigDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoSaveUploadConfigDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.canStartCoverAbTest;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public VideoSaveResultDto(String str, String str2, String str3, UserId userId, String str4, String str5, String str6, Integer num, String str7, String str8, Object obj, VideoSaveUploadConfigDto videoSaveUploadConfigDto, Boolean bool) {
        this.accessKey = str;
        this.accessByLinkKey = str2;
        this.description = str3;
        this.ownerId = userId;
        this.title = str4;
        this.generatedTitle = str5;
        this.uploadUrl = str6;
        this.videoId = num;
        this.thumbUploadUrl = str7;
        this.fallbackUploadUrl = str8;
        this.ownerToggles = obj;
        this.uploadConfig = videoSaveUploadConfigDto;
        this.canStartCoverAbTest = bool;
    }

    public /* synthetic */ VideoSaveResultDto(String str, String str2, String str3, UserId userId, String str4, String str5, String str6, Integer num, String str7, String str8, Object obj, VideoSaveUploadConfigDto videoSaveUploadConfigDto, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : userId, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : obj, (i & 2048) != 0 ? null : videoSaveUploadConfigDto, (i & 4096) != 0 ? null : bool);
    }
}
