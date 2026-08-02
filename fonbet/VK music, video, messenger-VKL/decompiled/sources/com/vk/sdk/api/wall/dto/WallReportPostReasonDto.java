package com.vk.sdk.api.wall.dto;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallReportPostReasonDto.kt */
/* loaded from: classes5.dex */
public final class WallReportPostReasonDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallReportPostReasonDto[] $VALUES;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final WallReportPostReasonDto ADULT_MATERIAL;

    @pmi0("1")
    public static final WallReportPostReasonDto CHILD_PORNOGRAPHY;

    @pmi0("4")
    public static final WallReportPostReasonDto DRUG_PROPAGANDA;

    @pmi0("2")
    public static final WallReportPostReasonDto EXTREMISM;

    @pmi0("6")
    public static final WallReportPostReasonDto INSULT_ABUSE;

    @pmi0("0")
    public static final WallReportPostReasonDto SPAM;

    @pmi0("8")
    public static final WallReportPostReasonDto SUICIDE_CALLS;

    @pmi0("3")
    public static final WallReportPostReasonDto VIOLENCE;

    @pmi0("11")
    public static final WallReportPostReasonDto WEAPONS_SELLING;
    private final int value;

    static {
        WallReportPostReasonDto wallReportPostReasonDto = new WallReportPostReasonDto("SPAM", 0, 0);
        SPAM = wallReportPostReasonDto;
        WallReportPostReasonDto wallReportPostReasonDto2 = new WallReportPostReasonDto("CHILD_PORNOGRAPHY", 1, 1);
        CHILD_PORNOGRAPHY = wallReportPostReasonDto2;
        WallReportPostReasonDto wallReportPostReasonDto3 = new WallReportPostReasonDto("EXTREMISM", 2, 2);
        EXTREMISM = wallReportPostReasonDto3;
        WallReportPostReasonDto wallReportPostReasonDto4 = new WallReportPostReasonDto("VIOLENCE", 3, 3);
        VIOLENCE = wallReportPostReasonDto4;
        WallReportPostReasonDto wallReportPostReasonDto5 = new WallReportPostReasonDto("DRUG_PROPAGANDA", 4, 4);
        DRUG_PROPAGANDA = wallReportPostReasonDto5;
        WallReportPostReasonDto wallReportPostReasonDto6 = new WallReportPostReasonDto("ADULT_MATERIAL", 5, 5);
        ADULT_MATERIAL = wallReportPostReasonDto6;
        WallReportPostReasonDto wallReportPostReasonDto7 = new WallReportPostReasonDto("INSULT_ABUSE", 6, 6);
        INSULT_ABUSE = wallReportPostReasonDto7;
        WallReportPostReasonDto wallReportPostReasonDto8 = new WallReportPostReasonDto("SUICIDE_CALLS", 7, 8);
        SUICIDE_CALLS = wallReportPostReasonDto8;
        WallReportPostReasonDto wallReportPostReasonDto9 = new WallReportPostReasonDto("WEAPONS_SELLING", 8, 11);
        WEAPONS_SELLING = wallReportPostReasonDto9;
        WallReportPostReasonDto[] wallReportPostReasonDtoArr = {wallReportPostReasonDto, wallReportPostReasonDto2, wallReportPostReasonDto3, wallReportPostReasonDto4, wallReportPostReasonDto5, wallReportPostReasonDto6, wallReportPostReasonDto7, wallReportPostReasonDto8, wallReportPostReasonDto9};
        $VALUES = wallReportPostReasonDtoArr;
        $ENTRIES = new asp(wallReportPostReasonDtoArr);
    }

    private WallReportPostReasonDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static WallReportPostReasonDto valueOf(String str) {
        return (WallReportPostReasonDto) Enum.valueOf(WallReportPostReasonDto.class, str);
    }

    public static WallReportPostReasonDto[] values() {
        return (WallReportPostReasonDto[]) $VALUES.clone();
    }
}
