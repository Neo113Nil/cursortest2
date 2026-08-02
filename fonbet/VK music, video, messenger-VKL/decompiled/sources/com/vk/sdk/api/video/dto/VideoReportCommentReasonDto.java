package com.vk.sdk.api.video.dto;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoReportCommentReasonDto.kt */
/* loaded from: classes5.dex */
public final class VideoReportCommentReasonDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoReportCommentReasonDto[] $VALUES;

    @pmi0("0")
    public static final VideoReportCommentReasonDto TYPE_0;

    @pmi0("1")
    public static final VideoReportCommentReasonDto TYPE_1;

    @pmi0("10")
    public static final VideoReportCommentReasonDto TYPE_10;

    @pmi0("101")
    public static final VideoReportCommentReasonDto TYPE_101;

    @pmi0("11")
    public static final VideoReportCommentReasonDto TYPE_11;

    @pmi0("12")
    public static final VideoReportCommentReasonDto TYPE_12;

    @pmi0("13")
    public static final VideoReportCommentReasonDto TYPE_13;

    @pmi0("15")
    public static final VideoReportCommentReasonDto TYPE_15;

    @pmi0("2")
    public static final VideoReportCommentReasonDto TYPE_2;

    @pmi0("27")
    public static final VideoReportCommentReasonDto TYPE_27;

    @pmi0("4")
    public static final VideoReportCommentReasonDto TYPE_4;

    @pmi0("41")
    public static final VideoReportCommentReasonDto TYPE_41;

    @pmi0("42")
    public static final VideoReportCommentReasonDto TYPE_42;

    @pmi0("43")
    public static final VideoReportCommentReasonDto TYPE_43;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final VideoReportCommentReasonDto TYPE_5;

    @pmi0("6")
    public static final VideoReportCommentReasonDto TYPE_6;

    @pmi0("8")
    public static final VideoReportCommentReasonDto TYPE_8;

    @pmi0("9")
    public static final VideoReportCommentReasonDto TYPE_9;
    private final int value;

    static {
        VideoReportCommentReasonDto videoReportCommentReasonDto = new VideoReportCommentReasonDto("TYPE_0", 0, 0);
        TYPE_0 = videoReportCommentReasonDto;
        VideoReportCommentReasonDto videoReportCommentReasonDto2 = new VideoReportCommentReasonDto("TYPE_1", 1, 1);
        TYPE_1 = videoReportCommentReasonDto2;
        VideoReportCommentReasonDto videoReportCommentReasonDto3 = new VideoReportCommentReasonDto("TYPE_2", 2, 2);
        TYPE_2 = videoReportCommentReasonDto3;
        VideoReportCommentReasonDto videoReportCommentReasonDto4 = new VideoReportCommentReasonDto("TYPE_4", 3, 4);
        TYPE_4 = videoReportCommentReasonDto4;
        VideoReportCommentReasonDto videoReportCommentReasonDto5 = new VideoReportCommentReasonDto("TYPE_5", 4, 5);
        TYPE_5 = videoReportCommentReasonDto5;
        VideoReportCommentReasonDto videoReportCommentReasonDto6 = new VideoReportCommentReasonDto("TYPE_6", 5, 6);
        TYPE_6 = videoReportCommentReasonDto6;
        VideoReportCommentReasonDto videoReportCommentReasonDto7 = new VideoReportCommentReasonDto("TYPE_8", 6, 8);
        TYPE_8 = videoReportCommentReasonDto7;
        VideoReportCommentReasonDto videoReportCommentReasonDto8 = new VideoReportCommentReasonDto("TYPE_9", 7, 9);
        TYPE_9 = videoReportCommentReasonDto8;
        VideoReportCommentReasonDto videoReportCommentReasonDto9 = new VideoReportCommentReasonDto("TYPE_10", 8, 10);
        TYPE_10 = videoReportCommentReasonDto9;
        VideoReportCommentReasonDto videoReportCommentReasonDto10 = new VideoReportCommentReasonDto("TYPE_11", 9, 11);
        TYPE_11 = videoReportCommentReasonDto10;
        VideoReportCommentReasonDto videoReportCommentReasonDto11 = new VideoReportCommentReasonDto("TYPE_12", 10, 12);
        TYPE_12 = videoReportCommentReasonDto11;
        VideoReportCommentReasonDto videoReportCommentReasonDto12 = new VideoReportCommentReasonDto("TYPE_13", 11, 13);
        TYPE_13 = videoReportCommentReasonDto12;
        VideoReportCommentReasonDto videoReportCommentReasonDto13 = new VideoReportCommentReasonDto("TYPE_15", 12, 15);
        TYPE_15 = videoReportCommentReasonDto13;
        VideoReportCommentReasonDto videoReportCommentReasonDto14 = new VideoReportCommentReasonDto("TYPE_27", 13, 27);
        TYPE_27 = videoReportCommentReasonDto14;
        VideoReportCommentReasonDto videoReportCommentReasonDto15 = new VideoReportCommentReasonDto("TYPE_41", 14, 41);
        TYPE_41 = videoReportCommentReasonDto15;
        VideoReportCommentReasonDto videoReportCommentReasonDto16 = new VideoReportCommentReasonDto("TYPE_42", 15, 42);
        TYPE_42 = videoReportCommentReasonDto16;
        VideoReportCommentReasonDto videoReportCommentReasonDto17 = new VideoReportCommentReasonDto("TYPE_43", 16, 43);
        TYPE_43 = videoReportCommentReasonDto17;
        VideoReportCommentReasonDto videoReportCommentReasonDto18 = new VideoReportCommentReasonDto("TYPE_101", 17, 101);
        TYPE_101 = videoReportCommentReasonDto18;
        VideoReportCommentReasonDto[] videoReportCommentReasonDtoArr = {videoReportCommentReasonDto, videoReportCommentReasonDto2, videoReportCommentReasonDto3, videoReportCommentReasonDto4, videoReportCommentReasonDto5, videoReportCommentReasonDto6, videoReportCommentReasonDto7, videoReportCommentReasonDto8, videoReportCommentReasonDto9, videoReportCommentReasonDto10, videoReportCommentReasonDto11, videoReportCommentReasonDto12, videoReportCommentReasonDto13, videoReportCommentReasonDto14, videoReportCommentReasonDto15, videoReportCommentReasonDto16, videoReportCommentReasonDto17, videoReportCommentReasonDto18};
        $VALUES = videoReportCommentReasonDtoArr;
        $ENTRIES = new asp(videoReportCommentReasonDtoArr);
    }

    private VideoReportCommentReasonDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static VideoReportCommentReasonDto valueOf(String str) {
        return (VideoReportCommentReasonDto) Enum.valueOf(VideoReportCommentReasonDto.class, str);
    }

    public static VideoReportCommentReasonDto[] values() {
        return (VideoReportCommentReasonDto[]) $VALUES.clone();
    }
}
