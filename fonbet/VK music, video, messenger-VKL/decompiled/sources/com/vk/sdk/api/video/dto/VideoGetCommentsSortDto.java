package com.vk.sdk.api.video.dto;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoGetCommentsSortDto.kt */
/* loaded from: classes5.dex */
public final class VideoGetCommentsSortDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoGetCommentsSortDto[] $VALUES;

    @pmi0(CampaignEx.JSON_KEY_DESC)
    public static final VideoGetCommentsSortDto NEWEST_COMMENT_FIRST;

    @pmi0("asc")
    public static final VideoGetCommentsSortDto OLDEST_COMMENT_FIRST;
    private final String value;

    static {
        VideoGetCommentsSortDto videoGetCommentsSortDto = new VideoGetCommentsSortDto("OLDEST_COMMENT_FIRST", 0, "asc");
        OLDEST_COMMENT_FIRST = videoGetCommentsSortDto;
        VideoGetCommentsSortDto videoGetCommentsSortDto2 = new VideoGetCommentsSortDto("NEWEST_COMMENT_FIRST", 1, CampaignEx.JSON_KEY_DESC);
        NEWEST_COMMENT_FIRST = videoGetCommentsSortDto2;
        VideoGetCommentsSortDto[] videoGetCommentsSortDtoArr = {videoGetCommentsSortDto, videoGetCommentsSortDto2};
        $VALUES = videoGetCommentsSortDtoArr;
        $ENTRIES = new asp(videoGetCommentsSortDtoArr);
    }

    private VideoGetCommentsSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoGetCommentsSortDto valueOf(String str) {
        return (VideoGetCommentsSortDto) Enum.valueOf(VideoGetCommentsSortDto.class, str);
    }

    public static VideoGetCommentsSortDto[] values() {
        return (VideoGetCommentsSortDto[]) $VALUES.clone();
    }
}
