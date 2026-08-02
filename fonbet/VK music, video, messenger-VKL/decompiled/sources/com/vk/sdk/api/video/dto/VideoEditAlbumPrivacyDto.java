package com.vk.sdk.api.video.dto;

import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoEditAlbumPrivacyDto.kt */
/* loaded from: classes5.dex */
public final class VideoEditAlbumPrivacyDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoEditAlbumPrivacyDto[] $VALUES;

    @pmi0("0")
    public static final VideoEditAlbumPrivacyDto ALL;

    @pmi0("1")
    public static final VideoEditAlbumPrivacyDto FRIENDS;

    @pmi0("2")
    public static final VideoEditAlbumPrivacyDto FRIENDS_OF_FRIENDS;

    @pmi0("3")
    public static final VideoEditAlbumPrivacyDto ONLY_ME;
    private final String value;

    static {
        VideoEditAlbumPrivacyDto videoEditAlbumPrivacyDto = new VideoEditAlbumPrivacyDto("ALL", 0, "0");
        ALL = videoEditAlbumPrivacyDto;
        VideoEditAlbumPrivacyDto videoEditAlbumPrivacyDto2 = new VideoEditAlbumPrivacyDto(Privacy.FRIENDS, 1, "1");
        FRIENDS = videoEditAlbumPrivacyDto2;
        VideoEditAlbumPrivacyDto videoEditAlbumPrivacyDto3 = new VideoEditAlbumPrivacyDto("FRIENDS_OF_FRIENDS", 2, "2");
        FRIENDS_OF_FRIENDS = videoEditAlbumPrivacyDto3;
        VideoEditAlbumPrivacyDto videoEditAlbumPrivacyDto4 = new VideoEditAlbumPrivacyDto("ONLY_ME", 3, "3");
        ONLY_ME = videoEditAlbumPrivacyDto4;
        VideoEditAlbumPrivacyDto[] videoEditAlbumPrivacyDtoArr = {videoEditAlbumPrivacyDto, videoEditAlbumPrivacyDto2, videoEditAlbumPrivacyDto3, videoEditAlbumPrivacyDto4};
        $VALUES = videoEditAlbumPrivacyDtoArr;
        $ENTRIES = new asp(videoEditAlbumPrivacyDtoArr);
    }

    private VideoEditAlbumPrivacyDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoEditAlbumPrivacyDto valueOf(String str) {
        return (VideoEditAlbumPrivacyDto) Enum.valueOf(VideoEditAlbumPrivacyDto.class, str);
    }

    public static VideoEditAlbumPrivacyDto[] values() {
        return (VideoEditAlbumPrivacyDto[]) $VALUES.clone();
    }
}
