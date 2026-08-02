package com.vk.sdk.api.video.dto;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoReportReasonDto.kt */
/* loaded from: classes5.dex */
public final class VideoReportReasonDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoReportReasonDto[] $VALUES;

    @pmi0("0")
    public static final VideoReportReasonDto TYPE_0;

    @pmi0("1")
    public static final VideoReportReasonDto TYPE_1;

    @pmi0("10")
    public static final VideoReportReasonDto TYPE_10;

    @pmi0("101")
    public static final VideoReportReasonDto TYPE_101;

    @pmi0("11")
    public static final VideoReportReasonDto TYPE_11;

    @pmi0("12")
    public static final VideoReportReasonDto TYPE_12;

    @pmi0("13")
    public static final VideoReportReasonDto TYPE_13;

    @pmi0("15")
    public static final VideoReportReasonDto TYPE_15;

    @pmi0("2")
    public static final VideoReportReasonDto TYPE_2;

    @pmi0("27")
    public static final VideoReportReasonDto TYPE_27;

    @pmi0("4")
    public static final VideoReportReasonDto TYPE_4;

    @pmi0("41")
    public static final VideoReportReasonDto TYPE_41;

    @pmi0("42")
    public static final VideoReportReasonDto TYPE_42;

    @pmi0("43")
    public static final VideoReportReasonDto TYPE_43;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final VideoReportReasonDto TYPE_5;

    @pmi0("6")
    public static final VideoReportReasonDto TYPE_6;

    @pmi0("8")
    public static final VideoReportReasonDto TYPE_8;

    @pmi0("9")
    public static final VideoReportReasonDto TYPE_9;
    private final int value;

    static {
        VideoReportReasonDto videoReportReasonDto = new VideoReportReasonDto("TYPE_0", 0, 0);
        TYPE_0 = videoReportReasonDto;
        VideoReportReasonDto videoReportReasonDto2 = new VideoReportReasonDto("TYPE_1", 1, 1);
        TYPE_1 = videoReportReasonDto2;
        VideoReportReasonDto videoReportReasonDto3 = new VideoReportReasonDto("TYPE_2", 2, 2);
        TYPE_2 = videoReportReasonDto3;
        VideoReportReasonDto videoReportReasonDto4 = new VideoReportReasonDto("TYPE_4", 3, 4);
        TYPE_4 = videoReportReasonDto4;
        VideoReportReasonDto videoReportReasonDto5 = new VideoReportReasonDto("TYPE_5", 4, 5);
        TYPE_5 = videoReportReasonDto5;
        VideoReportReasonDto videoReportReasonDto6 = new VideoReportReasonDto("TYPE_6", 5, 6);
        TYPE_6 = videoReportReasonDto6;
        VideoReportReasonDto videoReportReasonDto7 = new VideoReportReasonDto("TYPE_8", 6, 8);
        TYPE_8 = videoReportReasonDto7;
        VideoReportReasonDto videoReportReasonDto8 = new VideoReportReasonDto("TYPE_9", 7, 9);
        TYPE_9 = videoReportReasonDto8;
        VideoReportReasonDto videoReportReasonDto9 = new VideoReportReasonDto("TYPE_10", 8, 10);
        TYPE_10 = videoReportReasonDto9;
        VideoReportReasonDto videoReportReasonDto10 = new VideoReportReasonDto("TYPE_11", 9, 11);
        TYPE_11 = videoReportReasonDto10;
        VideoReportReasonDto videoReportReasonDto11 = new VideoReportReasonDto("TYPE_12", 10, 12);
        TYPE_12 = videoReportReasonDto11;
        VideoReportReasonDto videoReportReasonDto12 = new VideoReportReasonDto("TYPE_13", 11, 13);
        TYPE_13 = videoReportReasonDto12;
        VideoReportReasonDto videoReportReasonDto13 = new VideoReportReasonDto("TYPE_15", 12, 15);
        TYPE_15 = videoReportReasonDto13;
        VideoReportReasonDto videoReportReasonDto14 = new VideoReportReasonDto("TYPE_27", 13, 27);
        TYPE_27 = videoReportReasonDto14;
        VideoReportReasonDto videoReportReasonDto15 = new VideoReportReasonDto("TYPE_41", 14, 41);
        TYPE_41 = videoReportReasonDto15;
        VideoReportReasonDto videoReportReasonDto16 = new VideoReportReasonDto("TYPE_42", 15, 42);
        TYPE_42 = videoReportReasonDto16;
        VideoReportReasonDto videoReportReasonDto17 = new VideoReportReasonDto("TYPE_43", 16, 43);
        TYPE_43 = videoReportReasonDto17;
        VideoReportReasonDto videoReportReasonDto18 = new VideoReportReasonDto("TYPE_101", 17, 101);
        TYPE_101 = videoReportReasonDto18;
        VideoReportReasonDto[] videoReportReasonDtoArr = {videoReportReasonDto, videoReportReasonDto2, videoReportReasonDto3, videoReportReasonDto4, videoReportReasonDto5, videoReportReasonDto6, videoReportReasonDto7, videoReportReasonDto8, videoReportReasonDto9, videoReportReasonDto10, videoReportReasonDto11, videoReportReasonDto12, videoReportReasonDto13, videoReportReasonDto14, videoReportReasonDto15, videoReportReasonDto16, videoReportReasonDto17, videoReportReasonDto18};
        $VALUES = videoReportReasonDtoArr;
        $ENTRIES = new asp(videoReportReasonDtoArr);
    }

    private VideoReportReasonDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static VideoReportReasonDto valueOf(String str) {
        return (VideoReportReasonDto) Enum.valueOf(VideoReportReasonDto.class, str);
    }

    public static VideoReportReasonDto[] values() {
        return (VideoReportReasonDto[]) $VALUES.clone();
    }
}
