package com.vk.api.generated.videoChannels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoChannelsGetFieldsDto.kt */
/* loaded from: classes15.dex */
public final class VideoChannelsGetFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoChannelsGetFieldsDto[] $VALUES;

    @pmi0("access_type")
    public static final VideoChannelsGetFieldsDto ACCESS_TYPE;

    @pmi0("admin_level")
    public static final VideoChannelsGetFieldsDto ADMIN_LEVEL;

    @pmi0("age_mark")
    public static final VideoChannelsGetFieldsDto AGE_MARK;

    @pmi0("a_plus_mark")
    public static final VideoChannelsGetFieldsDto A_PLUS_MARK;

    @pmi0("counters")
    public static final VideoChannelsGetFieldsDto COUNTERS;

    @pmi0("created_at")
    public static final VideoChannelsGetFieldsDto CREATED_AT;
    public static final Parcelable.Creator<VideoChannelsGetFieldsDto> CREATOR;

    @pmi0("description")
    public static final VideoChannelsGetFieldsDto DESCRIPTION;

    @pmi0("is_advertiser")
    public static final VideoChannelsGetFieldsDto IS_ADVERTISER;

    @pmi0("member_status")
    public static final VideoChannelsGetFieldsDto MEMBER_STATUS;

    @pmi0("name")
    public static final VideoChannelsGetFieldsDto NAME;

    @pmi0("onboarding")
    public static final VideoChannelsGetFieldsDto ONBOARDING;

    @pmi0("photos")
    public static final VideoChannelsGetFieldsDto PHOTOS;

    @pmi0("screen_name")
    public static final VideoChannelsGetFieldsDto SCREEN_NAME;

    @pmi0("trending")
    public static final VideoChannelsGetFieldsDto TRENDING;

    @pmi0("verified")
    public static final VideoChannelsGetFieldsDto VERIFIED;

    @pmi0("video_cover")
    public static final VideoChannelsGetFieldsDto VIDEO_COVER;

    @pmi0("video_notifications_status")
    public static final VideoChannelsGetFieldsDto VIDEO_NOTIFICATIONS_STATUS;

    @pmi0("warning_notification")
    public static final VideoChannelsGetFieldsDto WARNING_NOTIFICATION;
    private final String value;

    /* compiled from: VideoChannelsGetFieldsDto.kt */
    public static final class a implements Parcelable.Creator<VideoChannelsGetFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoChannelsGetFieldsDto createFromParcel(Parcel parcel) {
            return VideoChannelsGetFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoChannelsGetFieldsDto[] newArray(int i) {
            return new VideoChannelsGetFieldsDto[i];
        }
    }

    static {
        VideoChannelsGetFieldsDto videoChannelsGetFieldsDto = new VideoChannelsGetFieldsDto("NAME", 0, "name");
        NAME = videoChannelsGetFieldsDto;
        VideoChannelsGetFieldsDto videoChannelsGetFieldsDto2 = new VideoChannelsGetFieldsDto(NativeAdContent.ViewTag.AD_DESCRIPTION, 1, "description");
        DESCRIPTION = videoChannelsGetFieldsDto2;
        VideoChannelsGetFieldsDto videoChannelsGetFieldsDto3 = new VideoChannelsGetFieldsDto("SCREEN_NAME", 2, "screen_name");
        SCREEN_NAME = videoChannelsGetFieldsDto3;
        VideoChannelsGetFieldsDto videoChannelsGetFieldsDto4 = new VideoChannelsGetFieldsDto("IS_ADVERTISER", 3, "is_advertiser");
        IS_ADVERTISER = videoChannelsGetFieldsDto4;
        VideoChannelsGetFieldsDto videoChannelsGetFieldsDto5 = new VideoChannelsGetFieldsDto("TRENDING", 4, "trending");
        TRENDING = videoChannelsGetFieldsDto5;
        VideoChannelsGetFieldsDto videoChannelsGetFieldsDto6 = new VideoChannelsGetFieldsDto("VERIFIED", 5, "verified");
        VERIFIED = videoChannelsGetFieldsDto6;
        VideoChannelsGetFieldsDto videoChannelsGetFieldsDto7 = new VideoChannelsGetFieldsDto("CREATED_AT", 6, "created_at");
        CREATED_AT = videoChannelsGetFieldsDto7;
        VideoChannelsGetFieldsDto videoChannelsGetFieldsDto8 = new VideoChannelsGetFieldsDto("ACCESS_TYPE", 7, "access_type");
        ACCESS_TYPE = videoChannelsGetFieldsDto8;
        VideoChannelsGetFieldsDto videoChannelsGetFieldsDto9 = new VideoChannelsGetFieldsDto("ADMIN_LEVEL", 8, "admin_level");
        ADMIN_LEVEL = videoChannelsGetFieldsDto9;
        VideoChannelsGetFieldsDto videoChannelsGetFieldsDto10 = new VideoChannelsGetFieldsDto("AGE_MARK", 9, "age_mark");
        AGE_MARK = videoChannelsGetFieldsDto10;
        VideoChannelsGetFieldsDto videoChannelsGetFieldsDto11 = new VideoChannelsGetFieldsDto("MEMBER_STATUS", 10, "member_status");
        MEMBER_STATUS = videoChannelsGetFieldsDto11;
        VideoChannelsGetFieldsDto videoChannelsGetFieldsDto12 = new VideoChannelsGetFieldsDto("VIDEO_NOTIFICATIONS_STATUS", 11, "video_notifications_status");
        VIDEO_NOTIFICATIONS_STATUS = videoChannelsGetFieldsDto12;
        VideoChannelsGetFieldsDto videoChannelsGetFieldsDto13 = new VideoChannelsGetFieldsDto("PHOTOS", 12, "photos");
        PHOTOS = videoChannelsGetFieldsDto13;
        VideoChannelsGetFieldsDto videoChannelsGetFieldsDto14 = new VideoChannelsGetFieldsDto("COUNTERS", 13, "counters");
        COUNTERS = videoChannelsGetFieldsDto14;
        VideoChannelsGetFieldsDto videoChannelsGetFieldsDto15 = new VideoChannelsGetFieldsDto("ONBOARDING", 14, "onboarding");
        ONBOARDING = videoChannelsGetFieldsDto15;
        VideoChannelsGetFieldsDto videoChannelsGetFieldsDto16 = new VideoChannelsGetFieldsDto("A_PLUS_MARK", 15, "a_plus_mark");
        A_PLUS_MARK = videoChannelsGetFieldsDto16;
        VideoChannelsGetFieldsDto videoChannelsGetFieldsDto17 = new VideoChannelsGetFieldsDto("VIDEO_COVER", 16, "video_cover");
        VIDEO_COVER = videoChannelsGetFieldsDto17;
        VideoChannelsGetFieldsDto videoChannelsGetFieldsDto18 = new VideoChannelsGetFieldsDto("WARNING_NOTIFICATION", 17, "warning_notification");
        WARNING_NOTIFICATION = videoChannelsGetFieldsDto18;
        VideoChannelsGetFieldsDto[] videoChannelsGetFieldsDtoArr = {videoChannelsGetFieldsDto, videoChannelsGetFieldsDto2, videoChannelsGetFieldsDto3, videoChannelsGetFieldsDto4, videoChannelsGetFieldsDto5, videoChannelsGetFieldsDto6, videoChannelsGetFieldsDto7, videoChannelsGetFieldsDto8, videoChannelsGetFieldsDto9, videoChannelsGetFieldsDto10, videoChannelsGetFieldsDto11, videoChannelsGetFieldsDto12, videoChannelsGetFieldsDto13, videoChannelsGetFieldsDto14, videoChannelsGetFieldsDto15, videoChannelsGetFieldsDto16, videoChannelsGetFieldsDto17, videoChannelsGetFieldsDto18};
        $VALUES = videoChannelsGetFieldsDtoArr;
        $ENTRIES = new asp(videoChannelsGetFieldsDtoArr);
        CREATOR = new a();
    }

    private VideoChannelsGetFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoChannelsGetFieldsDto valueOf(String str) {
        return (VideoChannelsGetFieldsDto) Enum.valueOf(VideoChannelsGetFieldsDto.class, str);
    }

    public static VideoChannelsGetFieldsDto[] values() {
        return (VideoChannelsGetFieldsDto[]) $VALUES.clone();
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
