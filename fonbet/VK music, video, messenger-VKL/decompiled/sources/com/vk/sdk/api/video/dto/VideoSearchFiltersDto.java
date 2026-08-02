package com.vk.sdk.api.video.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoSearchFiltersDto.kt */
/* loaded from: classes5.dex */
public final class VideoSearchFiltersDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoSearchFiltersDto[] $VALUES;

    @pmi0("long")
    public static final VideoSearchFiltersDto LONG;

    @pmi0("short")
    public static final VideoSearchFiltersDto SHORT;

    @pmi0("vimeo")
    public static final VideoSearchFiltersDto VIMEO;

    @pmi0("youtube")
    public static final VideoSearchFiltersDto YOUTUBE;
    private final String value;

    static {
        VideoSearchFiltersDto videoSearchFiltersDto = new VideoSearchFiltersDto("LONG", 0, "long");
        LONG = videoSearchFiltersDto;
        VideoSearchFiltersDto videoSearchFiltersDto2 = new VideoSearchFiltersDto("SHORT", 1, "short");
        SHORT = videoSearchFiltersDto2;
        VideoSearchFiltersDto videoSearchFiltersDto3 = new VideoSearchFiltersDto("VIMEO", 2, "vimeo");
        VIMEO = videoSearchFiltersDto3;
        VideoSearchFiltersDto videoSearchFiltersDto4 = new VideoSearchFiltersDto("YOUTUBE", 3, "youtube");
        YOUTUBE = videoSearchFiltersDto4;
        VideoSearchFiltersDto[] videoSearchFiltersDtoArr = {videoSearchFiltersDto, videoSearchFiltersDto2, videoSearchFiltersDto3, videoSearchFiltersDto4};
        $VALUES = videoSearchFiltersDtoArr;
        $ENTRIES = new asp(videoSearchFiltersDtoArr);
    }

    private VideoSearchFiltersDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoSearchFiltersDto valueOf(String str) {
        return (VideoSearchFiltersDto) Enum.valueOf(VideoSearchFiltersDto.class, str);
    }

    public static VideoSearchFiltersDto[] values() {
        return (VideoSearchFiltersDto[]) $VALUES.clone();
    }
}
