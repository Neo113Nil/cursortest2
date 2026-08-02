package com.vk.sdk.api.wall.dto;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallReportCommentReasonDto.kt */
/* loaded from: classes5.dex */
public final class WallReportCommentReasonDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallReportCommentReasonDto[] $VALUES;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final WallReportCommentReasonDto ADULT_MATERIAL;

    @pmi0("1")
    public static final WallReportCommentReasonDto CHILD_PORNOGRAPHY;

    @pmi0("4")
    public static final WallReportCommentReasonDto DRUG_PROPAGANDA;

    @pmi0("2")
    public static final WallReportCommentReasonDto EXTREMISM;

    @pmi0("6")
    public static final WallReportCommentReasonDto INSULT_ABUSE;

    @pmi0("0")
    public static final WallReportCommentReasonDto SPAM;

    @pmi0("8")
    public static final WallReportCommentReasonDto SUICIDE_CALLS;

    @pmi0("3")
    public static final WallReportCommentReasonDto VIOLENCE;

    @pmi0("11")
    public static final WallReportCommentReasonDto WEAPONS_SELLING;
    private final int value;

    static {
        WallReportCommentReasonDto wallReportCommentReasonDto = new WallReportCommentReasonDto("SPAM", 0, 0);
        SPAM = wallReportCommentReasonDto;
        WallReportCommentReasonDto wallReportCommentReasonDto2 = new WallReportCommentReasonDto("CHILD_PORNOGRAPHY", 1, 1);
        CHILD_PORNOGRAPHY = wallReportCommentReasonDto2;
        WallReportCommentReasonDto wallReportCommentReasonDto3 = new WallReportCommentReasonDto("EXTREMISM", 2, 2);
        EXTREMISM = wallReportCommentReasonDto3;
        WallReportCommentReasonDto wallReportCommentReasonDto4 = new WallReportCommentReasonDto("VIOLENCE", 3, 3);
        VIOLENCE = wallReportCommentReasonDto4;
        WallReportCommentReasonDto wallReportCommentReasonDto5 = new WallReportCommentReasonDto("DRUG_PROPAGANDA", 4, 4);
        DRUG_PROPAGANDA = wallReportCommentReasonDto5;
        WallReportCommentReasonDto wallReportCommentReasonDto6 = new WallReportCommentReasonDto("ADULT_MATERIAL", 5, 5);
        ADULT_MATERIAL = wallReportCommentReasonDto6;
        WallReportCommentReasonDto wallReportCommentReasonDto7 = new WallReportCommentReasonDto("INSULT_ABUSE", 6, 6);
        INSULT_ABUSE = wallReportCommentReasonDto7;
        WallReportCommentReasonDto wallReportCommentReasonDto8 = new WallReportCommentReasonDto("SUICIDE_CALLS", 7, 8);
        SUICIDE_CALLS = wallReportCommentReasonDto8;
        WallReportCommentReasonDto wallReportCommentReasonDto9 = new WallReportCommentReasonDto("WEAPONS_SELLING", 8, 11);
        WEAPONS_SELLING = wallReportCommentReasonDto9;
        WallReportCommentReasonDto[] wallReportCommentReasonDtoArr = {wallReportCommentReasonDto, wallReportCommentReasonDto2, wallReportCommentReasonDto3, wallReportCommentReasonDto4, wallReportCommentReasonDto5, wallReportCommentReasonDto6, wallReportCommentReasonDto7, wallReportCommentReasonDto8, wallReportCommentReasonDto9};
        $VALUES = wallReportCommentReasonDtoArr;
        $ENTRIES = new asp(wallReportCommentReasonDtoArr);
    }

    private WallReportCommentReasonDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static WallReportCommentReasonDto valueOf(String str) {
        return (WallReportCommentReasonDto) Enum.valueOf(WallReportCommentReasonDto.class, str);
    }

    public static WallReportCommentReasonDto[] values() {
        return (WallReportCommentReasonDto[]) $VALUES.clone();
    }
}
