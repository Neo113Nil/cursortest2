package com.vk.sdk.api.wall.dto;

import com.ironsource.Gc;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallEditTopicIdDto.kt */
/* loaded from: classes5.dex */
public final class WallEditTopicIdDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallEditTopicIdDto[] $VALUES;

    @pmi0("1")
    public static final WallEditTopicIdDto ART;

    @pmi0("0")
    public static final WallEditTopicIdDto EMPTY_TOPIC;

    @pmi0("43")
    public static final WallEditTopicIdDto FASHION;

    @pmi0("12")
    public static final WallEditTopicIdDto GAMES;

    @pmi0("32")
    public static final WallEditTopicIdDto HUMOR;

    @pmi0(Gc.e)
    public static final WallEditTopicIdDto IT;

    @pmi0("16")
    public static final WallEditTopicIdDto MUSIC;

    @pmi0("19")
    public static final WallEditTopicIdDto PHOTO;

    @pmi0("21")
    public static final WallEditTopicIdDto SCIENCE_AND_TECH;

    @pmi0("23")
    public static final WallEditTopicIdDto SPORT;

    @pmi0("25")
    public static final WallEditTopicIdDto TRAVEL;

    @pmi0("26")
    public static final WallEditTopicIdDto TV_AND_CINEMA;
    private final int value;

    static {
        WallEditTopicIdDto wallEditTopicIdDto = new WallEditTopicIdDto("EMPTY_TOPIC", 0, 0);
        EMPTY_TOPIC = wallEditTopicIdDto;
        WallEditTopicIdDto wallEditTopicIdDto2 = new WallEditTopicIdDto("ART", 1, 1);
        ART = wallEditTopicIdDto2;
        WallEditTopicIdDto wallEditTopicIdDto3 = new WallEditTopicIdDto("IT", 2, 7);
        IT = wallEditTopicIdDto3;
        WallEditTopicIdDto wallEditTopicIdDto4 = new WallEditTopicIdDto("GAMES", 3, 12);
        GAMES = wallEditTopicIdDto4;
        WallEditTopicIdDto wallEditTopicIdDto5 = new WallEditTopicIdDto("MUSIC", 4, 16);
        MUSIC = wallEditTopicIdDto5;
        WallEditTopicIdDto wallEditTopicIdDto6 = new WallEditTopicIdDto("PHOTO", 5, 19);
        PHOTO = wallEditTopicIdDto6;
        WallEditTopicIdDto wallEditTopicIdDto7 = new WallEditTopicIdDto("SCIENCE_AND_TECH", 6, 21);
        SCIENCE_AND_TECH = wallEditTopicIdDto7;
        WallEditTopicIdDto wallEditTopicIdDto8 = new WallEditTopicIdDto("SPORT", 7, 23);
        SPORT = wallEditTopicIdDto8;
        WallEditTopicIdDto wallEditTopicIdDto9 = new WallEditTopicIdDto("TRAVEL", 8, 25);
        TRAVEL = wallEditTopicIdDto9;
        WallEditTopicIdDto wallEditTopicIdDto10 = new WallEditTopicIdDto("TV_AND_CINEMA", 9, 26);
        TV_AND_CINEMA = wallEditTopicIdDto10;
        WallEditTopicIdDto wallEditTopicIdDto11 = new WallEditTopicIdDto("HUMOR", 10, 32);
        HUMOR = wallEditTopicIdDto11;
        WallEditTopicIdDto wallEditTopicIdDto12 = new WallEditTopicIdDto("FASHION", 11, 43);
        FASHION = wallEditTopicIdDto12;
        WallEditTopicIdDto[] wallEditTopicIdDtoArr = {wallEditTopicIdDto, wallEditTopicIdDto2, wallEditTopicIdDto3, wallEditTopicIdDto4, wallEditTopicIdDto5, wallEditTopicIdDto6, wallEditTopicIdDto7, wallEditTopicIdDto8, wallEditTopicIdDto9, wallEditTopicIdDto10, wallEditTopicIdDto11, wallEditTopicIdDto12};
        $VALUES = wallEditTopicIdDtoArr;
        $ENTRIES = new asp(wallEditTopicIdDtoArr);
    }

    private WallEditTopicIdDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static WallEditTopicIdDto valueOf(String str) {
        return (WallEditTopicIdDto) Enum.valueOf(WallEditTopicIdDto.class, str);
    }

    public static WallEditTopicIdDto[] values() {
        return (WallEditTopicIdDto[]) $VALUES.clone();
    }
}
