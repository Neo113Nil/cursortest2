package com.vk.sdk.api.video.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoSearchExtendedFiltersDto.kt */
/* loaded from: classes5.dex */
public final class VideoSearchExtendedFiltersDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoSearchExtendedFiltersDto[] $VALUES;

    @pmi0("long")
    public static final VideoSearchExtendedFiltersDto LONG;

    @pmi0("short")
    public static final VideoSearchExtendedFiltersDto SHORT;

    @pmi0("vimeo")
    public static final VideoSearchExtendedFiltersDto VIMEO;

    @pmi0("youtube")
    public static final VideoSearchExtendedFiltersDto YOUTUBE;
    private final String value;

    static {
        VideoSearchExtendedFiltersDto videoSearchExtendedFiltersDto = new VideoSearchExtendedFiltersDto("LONG", 0, "long");
        LONG = videoSearchExtendedFiltersDto;
        VideoSearchExtendedFiltersDto videoSearchExtendedFiltersDto2 = new VideoSearchExtendedFiltersDto("SHORT", 1, "short");
        SHORT = videoSearchExtendedFiltersDto2;
        VideoSearchExtendedFiltersDto videoSearchExtendedFiltersDto3 = new VideoSearchExtendedFiltersDto("VIMEO", 2, "vimeo");
        VIMEO = videoSearchExtendedFiltersDto3;
        VideoSearchExtendedFiltersDto videoSearchExtendedFiltersDto4 = new VideoSearchExtendedFiltersDto("YOUTUBE", 3, "youtube");
        YOUTUBE = videoSearchExtendedFiltersDto4;
        VideoSearchExtendedFiltersDto[] videoSearchExtendedFiltersDtoArr = {videoSearchExtendedFiltersDto, videoSearchExtendedFiltersDto2, videoSearchExtendedFiltersDto3, videoSearchExtendedFiltersDto4};
        $VALUES = videoSearchExtendedFiltersDtoArr;
        $ENTRIES = new asp(videoSearchExtendedFiltersDtoArr);
    }

    private VideoSearchExtendedFiltersDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoSearchExtendedFiltersDto valueOf(String str) {
        return (VideoSearchExtendedFiltersDto) Enum.valueOf(VideoSearchExtendedFiltersDto.class, str);
    }

    public static VideoSearchExtendedFiltersDto[] values() {
        return (VideoSearchExtendedFiltersDto[]) $VALUES.clone();
    }
}
