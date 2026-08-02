package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Gc;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallPostTopicIdDto.kt */
/* loaded from: classes15.dex */
public final class WallPostTopicIdDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallPostTopicIdDto[] $VALUES;

    @pmi0("1")
    public static final WallPostTopicIdDto ART;
    public static final Parcelable.Creator<WallPostTopicIdDto> CREATOR;

    @pmi0("0")
    public static final WallPostTopicIdDto EMPTY_TOPIC;

    @pmi0("43")
    public static final WallPostTopicIdDto FASHION;

    @pmi0("12")
    public static final WallPostTopicIdDto GAMES;

    @pmi0("32")
    public static final WallPostTopicIdDto HUMOR;

    @pmi0(Gc.e)
    public static final WallPostTopicIdDto IT;

    @pmi0("16")
    public static final WallPostTopicIdDto MUSIC;

    @pmi0("19")
    public static final WallPostTopicIdDto PHOTO;

    @pmi0("21")
    public static final WallPostTopicIdDto SCIENCE_AND_TECH;

    @pmi0("23")
    public static final WallPostTopicIdDto SPORT;

    @pmi0("25")
    public static final WallPostTopicIdDto TRAVEL;

    @pmi0("26")
    public static final WallPostTopicIdDto TV_AND_CINEMA;
    private final int value;

    /* compiled from: WallPostTopicIdDto.kt */
    public static final class a implements Parcelable.Creator<WallPostTopicIdDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostTopicIdDto createFromParcel(Parcel parcel) {
            return WallPostTopicIdDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostTopicIdDto[] newArray(int i) {
            return new WallPostTopicIdDto[i];
        }
    }

    static {
        WallPostTopicIdDto wallPostTopicIdDto = new WallPostTopicIdDto("EMPTY_TOPIC", 0, 0);
        EMPTY_TOPIC = wallPostTopicIdDto;
        WallPostTopicIdDto wallPostTopicIdDto2 = new WallPostTopicIdDto("ART", 1, 1);
        ART = wallPostTopicIdDto2;
        WallPostTopicIdDto wallPostTopicIdDto3 = new WallPostTopicIdDto("IT", 2, 7);
        IT = wallPostTopicIdDto3;
        WallPostTopicIdDto wallPostTopicIdDto4 = new WallPostTopicIdDto("GAMES", 3, 12);
        GAMES = wallPostTopicIdDto4;
        WallPostTopicIdDto wallPostTopicIdDto5 = new WallPostTopicIdDto("MUSIC", 4, 16);
        MUSIC = wallPostTopicIdDto5;
        WallPostTopicIdDto wallPostTopicIdDto6 = new WallPostTopicIdDto("PHOTO", 5, 19);
        PHOTO = wallPostTopicIdDto6;
        WallPostTopicIdDto wallPostTopicIdDto7 = new WallPostTopicIdDto("SCIENCE_AND_TECH", 6, 21);
        SCIENCE_AND_TECH = wallPostTopicIdDto7;
        WallPostTopicIdDto wallPostTopicIdDto8 = new WallPostTopicIdDto("SPORT", 7, 23);
        SPORT = wallPostTopicIdDto8;
        WallPostTopicIdDto wallPostTopicIdDto9 = new WallPostTopicIdDto("TRAVEL", 8, 25);
        TRAVEL = wallPostTopicIdDto9;
        WallPostTopicIdDto wallPostTopicIdDto10 = new WallPostTopicIdDto("TV_AND_CINEMA", 9, 26);
        TV_AND_CINEMA = wallPostTopicIdDto10;
        WallPostTopicIdDto wallPostTopicIdDto11 = new WallPostTopicIdDto("HUMOR", 10, 32);
        HUMOR = wallPostTopicIdDto11;
        WallPostTopicIdDto wallPostTopicIdDto12 = new WallPostTopicIdDto("FASHION", 11, 43);
        FASHION = wallPostTopicIdDto12;
        WallPostTopicIdDto[] wallPostTopicIdDtoArr = {wallPostTopicIdDto, wallPostTopicIdDto2, wallPostTopicIdDto3, wallPostTopicIdDto4, wallPostTopicIdDto5, wallPostTopicIdDto6, wallPostTopicIdDto7, wallPostTopicIdDto8, wallPostTopicIdDto9, wallPostTopicIdDto10, wallPostTopicIdDto11, wallPostTopicIdDto12};
        $VALUES = wallPostTopicIdDtoArr;
        $ENTRIES = new asp(wallPostTopicIdDtoArr);
        CREATOR = new a();
    }

    private WallPostTopicIdDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static WallPostTopicIdDto valueOf(String str) {
        return (WallPostTopicIdDto) Enum.valueOf(WallPostTopicIdDto.class, str);
    }

    public static WallPostTopicIdDto[] values() {
        return (WallPostTopicIdDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
