package com.vk.sdk.api.video.dto;

import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoAddAlbumPrivacyDto.kt */
/* loaded from: classes5.dex */
public final class VideoAddAlbumPrivacyDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoAddAlbumPrivacyDto[] $VALUES;

    @pmi0("0")
    public static final VideoAddAlbumPrivacyDto ALL;

    @pmi0("1")
    public static final VideoAddAlbumPrivacyDto FRIENDS;

    @pmi0("2")
    public static final VideoAddAlbumPrivacyDto FRIENDS_OF_FRIENDS;

    @pmi0("3")
    public static final VideoAddAlbumPrivacyDto ONLY_ME;
    private final String value;

    static {
        VideoAddAlbumPrivacyDto videoAddAlbumPrivacyDto = new VideoAddAlbumPrivacyDto("ALL", 0, "0");
        ALL = videoAddAlbumPrivacyDto;
        VideoAddAlbumPrivacyDto videoAddAlbumPrivacyDto2 = new VideoAddAlbumPrivacyDto(Privacy.FRIENDS, 1, "1");
        FRIENDS = videoAddAlbumPrivacyDto2;
        VideoAddAlbumPrivacyDto videoAddAlbumPrivacyDto3 = new VideoAddAlbumPrivacyDto("FRIENDS_OF_FRIENDS", 2, "2");
        FRIENDS_OF_FRIENDS = videoAddAlbumPrivacyDto3;
        VideoAddAlbumPrivacyDto videoAddAlbumPrivacyDto4 = new VideoAddAlbumPrivacyDto("ONLY_ME", 3, "3");
        ONLY_ME = videoAddAlbumPrivacyDto4;
        VideoAddAlbumPrivacyDto[] videoAddAlbumPrivacyDtoArr = {videoAddAlbumPrivacyDto, videoAddAlbumPrivacyDto2, videoAddAlbumPrivacyDto3, videoAddAlbumPrivacyDto4};
        $VALUES = videoAddAlbumPrivacyDtoArr;
        $ENTRIES = new asp(videoAddAlbumPrivacyDtoArr);
    }

    private VideoAddAlbumPrivacyDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoAddAlbumPrivacyDto valueOf(String str) {
        return (VideoAddAlbumPrivacyDto) Enum.valueOf(VideoAddAlbumPrivacyDto.class, str);
    }

    public static VideoAddAlbumPrivacyDto[] values() {
        return (VideoAddAlbumPrivacyDto[]) $VALUES.clone();
    }
}
