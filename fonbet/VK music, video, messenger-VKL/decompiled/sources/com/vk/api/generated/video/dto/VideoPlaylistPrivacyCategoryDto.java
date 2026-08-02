package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoPlaylistPrivacyCategoryDto.kt */
/* loaded from: classes15.dex */
public final class VideoPlaylistPrivacyCategoryDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoPlaylistPrivacyCategoryDto[] $VALUES;

    @pmi0("all")
    public static final VideoPlaylistPrivacyCategoryDto ALL;
    public static final Parcelable.Creator<VideoPlaylistPrivacyCategoryDto> CREATOR;

    @pmi0("friends")
    public static final VideoPlaylistPrivacyCategoryDto FRIENDS;

    @pmi0("friends_of_friends")
    public static final VideoPlaylistPrivacyCategoryDto FRIENDS_OF_FRIENDS;

    @pmi0("friends_of_friends_only")
    public static final VideoPlaylistPrivacyCategoryDto FRIENDS_OF_FRIENDS_ONLY;

    @pmi0("only_me")
    public static final VideoPlaylistPrivacyCategoryDto ONLY_ME;
    private final String value;

    /* compiled from: VideoPlaylistPrivacyCategoryDto.kt */
    public static final class a implements Parcelable.Creator<VideoPlaylistPrivacyCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoPlaylistPrivacyCategoryDto createFromParcel(Parcel parcel) {
            return VideoPlaylistPrivacyCategoryDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoPlaylistPrivacyCategoryDto[] newArray(int i) {
            return new VideoPlaylistPrivacyCategoryDto[i];
        }
    }

    static {
        VideoPlaylistPrivacyCategoryDto videoPlaylistPrivacyCategoryDto = new VideoPlaylistPrivacyCategoryDto("ALL", 0, "all");
        ALL = videoPlaylistPrivacyCategoryDto;
        VideoPlaylistPrivacyCategoryDto videoPlaylistPrivacyCategoryDto2 = new VideoPlaylistPrivacyCategoryDto(Privacy.FRIENDS, 1, "friends");
        FRIENDS = videoPlaylistPrivacyCategoryDto2;
        VideoPlaylistPrivacyCategoryDto videoPlaylistPrivacyCategoryDto3 = new VideoPlaylistPrivacyCategoryDto("FRIENDS_OF_FRIENDS", 2, "friends_of_friends");
        FRIENDS_OF_FRIENDS = videoPlaylistPrivacyCategoryDto3;
        VideoPlaylistPrivacyCategoryDto videoPlaylistPrivacyCategoryDto4 = new VideoPlaylistPrivacyCategoryDto("FRIENDS_OF_FRIENDS_ONLY", 3, "friends_of_friends_only");
        FRIENDS_OF_FRIENDS_ONLY = videoPlaylistPrivacyCategoryDto4;
        VideoPlaylistPrivacyCategoryDto videoPlaylistPrivacyCategoryDto5 = new VideoPlaylistPrivacyCategoryDto("ONLY_ME", 4, "only_me");
        ONLY_ME = videoPlaylistPrivacyCategoryDto5;
        VideoPlaylistPrivacyCategoryDto[] videoPlaylistPrivacyCategoryDtoArr = {videoPlaylistPrivacyCategoryDto, videoPlaylistPrivacyCategoryDto2, videoPlaylistPrivacyCategoryDto3, videoPlaylistPrivacyCategoryDto4, videoPlaylistPrivacyCategoryDto5};
        $VALUES = videoPlaylistPrivacyCategoryDtoArr;
        $ENTRIES = new asp(videoPlaylistPrivacyCategoryDtoArr);
        CREATOR = new a();
    }

    private VideoPlaylistPrivacyCategoryDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoPlaylistPrivacyCategoryDto valueOf(String str) {
        return (VideoPlaylistPrivacyCategoryDto) Enum.valueOf(VideoPlaylistPrivacyCategoryDto.class, str);
    }

    public static VideoPlaylistPrivacyCategoryDto[] values() {
        return (VideoPlaylistPrivacyCategoryDto[]) $VALUES.clone();
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
