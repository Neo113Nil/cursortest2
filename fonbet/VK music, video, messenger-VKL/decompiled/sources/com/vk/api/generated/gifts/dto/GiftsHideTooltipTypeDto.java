package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.sdk.api.login.LoginRequest;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GiftsHideTooltipTypeDto.kt */
/* loaded from: classes14.dex */
public final class GiftsHideTooltipTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GiftsHideTooltipTypeDto[] $VALUES;

    @pmi0("april1")
    public static final GiftsHideTooltipTypeDto APRIL1;

    @pmi0("april12")
    public static final GiftsHideTooltipTypeDto APRIL12;

    @pmi0("birthday")
    public static final GiftsHideTooltipTypeDto BIRTHDAY;
    public static final Parcelable.Creator<GiftsHideTooltipTypeDto> CREATOR;

    @pmi0("easter")
    public static final GiftsHideTooltipTypeDto EASTER;

    @pmi0("february14")
    public static final GiftsHideTooltipTypeDto FEBRUARY14;

    @pmi0("february23")
    public static final GiftsHideTooltipTypeDto FEBRUARY23;

    @pmi0("halloween")
    public static final GiftsHideTooltipTypeDto HALLOWEEN;

    @pmi0("june12")
    public static final GiftsHideTooltipTypeDto JUNE12;

    @pmi0("march8")
    public static final GiftsHideTooltipTypeDto MARCH8;

    @pmi0("may1")
    public static final GiftsHideTooltipTypeDto MAY1;

    @pmi0("may8")
    public static final GiftsHideTooltipTypeDto MAY8;

    @pmi0("may9")
    public static final GiftsHideTooltipTypeDto MAY9;

    @pmi0("newyear")
    public static final GiftsHideTooltipTypeDto NEWYEAR;

    @pmi0("november4")
    public static final GiftsHideTooltipTypeDto NOVEMBER4;

    @pmi0("september1")
    public static final GiftsHideTooltipTypeDto SEPTEMBER1;

    @pmi0(LoginRequest.CLIENT_NAME)
    public static final GiftsHideTooltipTypeDto TEST;
    private final String value;

    /* compiled from: GiftsHideTooltipTypeDto.kt */
    public static final class a implements Parcelable.Creator<GiftsHideTooltipTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsHideTooltipTypeDto createFromParcel(Parcel parcel) {
            return GiftsHideTooltipTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsHideTooltipTypeDto[] newArray(int i) {
            return new GiftsHideTooltipTypeDto[i];
        }
    }

    static {
        GiftsHideTooltipTypeDto giftsHideTooltipTypeDto = new GiftsHideTooltipTypeDto("APRIL1", 0, "april1");
        APRIL1 = giftsHideTooltipTypeDto;
        GiftsHideTooltipTypeDto giftsHideTooltipTypeDto2 = new GiftsHideTooltipTypeDto("APRIL12", 1, "april12");
        APRIL12 = giftsHideTooltipTypeDto2;
        GiftsHideTooltipTypeDto giftsHideTooltipTypeDto3 = new GiftsHideTooltipTypeDto("BIRTHDAY", 2, "birthday");
        BIRTHDAY = giftsHideTooltipTypeDto3;
        GiftsHideTooltipTypeDto giftsHideTooltipTypeDto4 = new GiftsHideTooltipTypeDto("EASTER", 3, "easter");
        EASTER = giftsHideTooltipTypeDto4;
        GiftsHideTooltipTypeDto giftsHideTooltipTypeDto5 = new GiftsHideTooltipTypeDto("FEBRUARY14", 4, "february14");
        FEBRUARY14 = giftsHideTooltipTypeDto5;
        GiftsHideTooltipTypeDto giftsHideTooltipTypeDto6 = new GiftsHideTooltipTypeDto("FEBRUARY23", 5, "february23");
        FEBRUARY23 = giftsHideTooltipTypeDto6;
        GiftsHideTooltipTypeDto giftsHideTooltipTypeDto7 = new GiftsHideTooltipTypeDto("HALLOWEEN", 6, "halloween");
        HALLOWEEN = giftsHideTooltipTypeDto7;
        GiftsHideTooltipTypeDto giftsHideTooltipTypeDto8 = new GiftsHideTooltipTypeDto("JUNE12", 7, "june12");
        JUNE12 = giftsHideTooltipTypeDto8;
        GiftsHideTooltipTypeDto giftsHideTooltipTypeDto9 = new GiftsHideTooltipTypeDto("MARCH8", 8, "march8");
        MARCH8 = giftsHideTooltipTypeDto9;
        GiftsHideTooltipTypeDto giftsHideTooltipTypeDto10 = new GiftsHideTooltipTypeDto("MAY1", 9, "may1");
        MAY1 = giftsHideTooltipTypeDto10;
        GiftsHideTooltipTypeDto giftsHideTooltipTypeDto11 = new GiftsHideTooltipTypeDto("MAY8", 10, "may8");
        MAY8 = giftsHideTooltipTypeDto11;
        GiftsHideTooltipTypeDto giftsHideTooltipTypeDto12 = new GiftsHideTooltipTypeDto("MAY9", 11, "may9");
        MAY9 = giftsHideTooltipTypeDto12;
        GiftsHideTooltipTypeDto giftsHideTooltipTypeDto13 = new GiftsHideTooltipTypeDto("NEWYEAR", 12, "newyear");
        NEWYEAR = giftsHideTooltipTypeDto13;
        GiftsHideTooltipTypeDto giftsHideTooltipTypeDto14 = new GiftsHideTooltipTypeDto("NOVEMBER4", 13, "november4");
        NOVEMBER4 = giftsHideTooltipTypeDto14;
        GiftsHideTooltipTypeDto giftsHideTooltipTypeDto15 = new GiftsHideTooltipTypeDto("SEPTEMBER1", 14, "september1");
        SEPTEMBER1 = giftsHideTooltipTypeDto15;
        GiftsHideTooltipTypeDto giftsHideTooltipTypeDto16 = new GiftsHideTooltipTypeDto("TEST", 15, LoginRequest.CLIENT_NAME);
        TEST = giftsHideTooltipTypeDto16;
        GiftsHideTooltipTypeDto[] giftsHideTooltipTypeDtoArr = {giftsHideTooltipTypeDto, giftsHideTooltipTypeDto2, giftsHideTooltipTypeDto3, giftsHideTooltipTypeDto4, giftsHideTooltipTypeDto5, giftsHideTooltipTypeDto6, giftsHideTooltipTypeDto7, giftsHideTooltipTypeDto8, giftsHideTooltipTypeDto9, giftsHideTooltipTypeDto10, giftsHideTooltipTypeDto11, giftsHideTooltipTypeDto12, giftsHideTooltipTypeDto13, giftsHideTooltipTypeDto14, giftsHideTooltipTypeDto15, giftsHideTooltipTypeDto16};
        $VALUES = giftsHideTooltipTypeDtoArr;
        $ENTRIES = new asp(giftsHideTooltipTypeDtoArr);
        CREATOR = new a();
    }

    private GiftsHideTooltipTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GiftsHideTooltipTypeDto valueOf(String str) {
        return (GiftsHideTooltipTypeDto) Enum.valueOf(GiftsHideTooltipTypeDto.class, str);
    }

    public static GiftsHideTooltipTypeDto[] values() {
        return (GiftsHideTooltipTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
