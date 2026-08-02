package com.vk.sdk.api.video.dto;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoGetCommentsExtendedSortDto.kt */
/* loaded from: classes5.dex */
public final class VideoGetCommentsExtendedSortDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoGetCommentsExtendedSortDto[] $VALUES;

    @pmi0(CampaignEx.JSON_KEY_DESC)
    public static final VideoGetCommentsExtendedSortDto NEWEST_COMMENT_FIRST;

    @pmi0("asc")
    public static final VideoGetCommentsExtendedSortDto OLDEST_COMMENT_FIRST;
    private final String value;

    static {
        VideoGetCommentsExtendedSortDto videoGetCommentsExtendedSortDto = new VideoGetCommentsExtendedSortDto("OLDEST_COMMENT_FIRST", 0, "asc");
        OLDEST_COMMENT_FIRST = videoGetCommentsExtendedSortDto;
        VideoGetCommentsExtendedSortDto videoGetCommentsExtendedSortDto2 = new VideoGetCommentsExtendedSortDto("NEWEST_COMMENT_FIRST", 1, CampaignEx.JSON_KEY_DESC);
        NEWEST_COMMENT_FIRST = videoGetCommentsExtendedSortDto2;
        VideoGetCommentsExtendedSortDto[] videoGetCommentsExtendedSortDtoArr = {videoGetCommentsExtendedSortDto, videoGetCommentsExtendedSortDto2};
        $VALUES = videoGetCommentsExtendedSortDtoArr;
        $ENTRIES = new asp(videoGetCommentsExtendedSortDtoArr);
    }

    private VideoGetCommentsExtendedSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoGetCommentsExtendedSortDto valueOf(String str) {
        return (VideoGetCommentsExtendedSortDto) Enum.valueOf(VideoGetCommentsExtendedSortDto.class, str);
    }

    public static VideoGetCommentsExtendedSortDto[] values() {
        return (VideoGetCommentsExtendedSortDto[]) $VALUES.clone();
    }
}
