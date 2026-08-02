package com.vk.sdk.api.video.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoSearchExtendedSortDto.kt */
/* loaded from: classes5.dex */
public final class VideoSearchExtendedSortDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoSearchExtendedSortDto[] $VALUES;

    @pmi0("0")
    public static final VideoSearchExtendedSortDto DATE_ADDED;

    @pmi0("1")
    public static final VideoSearchExtendedSortDto DURATION;

    @pmi0("2")
    public static final VideoSearchExtendedSortDto RELEVANCE;
    private final int value;

    static {
        VideoSearchExtendedSortDto videoSearchExtendedSortDto = new VideoSearchExtendedSortDto("DURATION", 0, 1);
        DURATION = videoSearchExtendedSortDto;
        VideoSearchExtendedSortDto videoSearchExtendedSortDto2 = new VideoSearchExtendedSortDto("RELEVANCE", 1, 2);
        RELEVANCE = videoSearchExtendedSortDto2;
        VideoSearchExtendedSortDto videoSearchExtendedSortDto3 = new VideoSearchExtendedSortDto("DATE_ADDED", 2, 0);
        DATE_ADDED = videoSearchExtendedSortDto3;
        VideoSearchExtendedSortDto[] videoSearchExtendedSortDtoArr = {videoSearchExtendedSortDto, videoSearchExtendedSortDto2, videoSearchExtendedSortDto3};
        $VALUES = videoSearchExtendedSortDtoArr;
        $ENTRIES = new asp(videoSearchExtendedSortDtoArr);
    }

    private VideoSearchExtendedSortDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static VideoSearchExtendedSortDto valueOf(String str) {
        return (VideoSearchExtendedSortDto) Enum.valueOf(VideoSearchExtendedSortDto.class, str);
    }

    public static VideoSearchExtendedSortDto[] values() {
        return (VideoSearchExtendedSortDto[]) $VALUES.clone();
    }
}
