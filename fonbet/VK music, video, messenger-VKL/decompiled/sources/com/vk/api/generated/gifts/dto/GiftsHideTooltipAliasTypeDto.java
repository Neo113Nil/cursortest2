package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.sdk.api.login.LoginRequest;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GiftsHideTooltipAliasTypeDto.kt */
/* loaded from: classes14.dex */
public final class GiftsHideTooltipAliasTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GiftsHideTooltipAliasTypeDto[] $VALUES;

    @pmi0("april1")
    public static final GiftsHideTooltipAliasTypeDto APRIL1;

    @pmi0("april12")
    public static final GiftsHideTooltipAliasTypeDto APRIL12;

    @pmi0("birthday")
    public static final GiftsHideTooltipAliasTypeDto BIRTHDAY;
    public static final Parcelable.Creator<GiftsHideTooltipAliasTypeDto> CREATOR;

    @pmi0("easter")
    public static final GiftsHideTooltipAliasTypeDto EASTER;

    @pmi0("february14")
    public static final GiftsHideTooltipAliasTypeDto FEBRUARY14;

    @pmi0("february23")
    public static final GiftsHideTooltipAliasTypeDto FEBRUARY23;

    @pmi0("halloween")
    public static final GiftsHideTooltipAliasTypeDto HALLOWEEN;

    @pmi0("june12")
    public static final GiftsHideTooltipAliasTypeDto JUNE12;

    @pmi0("march8")
    public static final GiftsHideTooltipAliasTypeDto MARCH8;

    @pmi0("may1")
    public static final GiftsHideTooltipAliasTypeDto MAY1;

    @pmi0("may8")
    public static final GiftsHideTooltipAliasTypeDto MAY8;

    @pmi0("may9")
    public static final GiftsHideTooltipAliasTypeDto MAY9;

    @pmi0("newyear")
    public static final GiftsHideTooltipAliasTypeDto NEWYEAR;

    @pmi0("november4")
    public static final GiftsHideTooltipAliasTypeDto NOVEMBER4;

    @pmi0("september1")
    public static final GiftsHideTooltipAliasTypeDto SEPTEMBER1;

    @pmi0(LoginRequest.CLIENT_NAME)
    public static final GiftsHideTooltipAliasTypeDto TEST;
    private final String value;

    /* compiled from: GiftsHideTooltipAliasTypeDto.kt */
    public static final class a implements Parcelable.Creator<GiftsHideTooltipAliasTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsHideTooltipAliasTypeDto createFromParcel(Parcel parcel) {
            return GiftsHideTooltipAliasTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsHideTooltipAliasTypeDto[] newArray(int i) {
            return new GiftsHideTooltipAliasTypeDto[i];
        }
    }

    static {
        GiftsHideTooltipAliasTypeDto giftsHideTooltipAliasTypeDto = new GiftsHideTooltipAliasTypeDto("APRIL1", 0, "april1");
        APRIL1 = giftsHideTooltipAliasTypeDto;
        GiftsHideTooltipAliasTypeDto giftsHideTooltipAliasTypeDto2 = new GiftsHideTooltipAliasTypeDto("APRIL12", 1, "april12");
        APRIL12 = giftsHideTooltipAliasTypeDto2;
        GiftsHideTooltipAliasTypeDto giftsHideTooltipAliasTypeDto3 = new GiftsHideTooltipAliasTypeDto("BIRTHDAY", 2, "birthday");
        BIRTHDAY = giftsHideTooltipAliasTypeDto3;
        GiftsHideTooltipAliasTypeDto giftsHideTooltipAliasTypeDto4 = new GiftsHideTooltipAliasTypeDto("EASTER", 3, "easter");
        EASTER = giftsHideTooltipAliasTypeDto4;
        GiftsHideTooltipAliasTypeDto giftsHideTooltipAliasTypeDto5 = new GiftsHideTooltipAliasTypeDto("FEBRUARY14", 4, "february14");
        FEBRUARY14 = giftsHideTooltipAliasTypeDto5;
        GiftsHideTooltipAliasTypeDto giftsHideTooltipAliasTypeDto6 = new GiftsHideTooltipAliasTypeDto("FEBRUARY23", 5, "february23");
        FEBRUARY23 = giftsHideTooltipAliasTypeDto6;
        GiftsHideTooltipAliasTypeDto giftsHideTooltipAliasTypeDto7 = new GiftsHideTooltipAliasTypeDto("HALLOWEEN", 6, "halloween");
        HALLOWEEN = giftsHideTooltipAliasTypeDto7;
        GiftsHideTooltipAliasTypeDto giftsHideTooltipAliasTypeDto8 = new GiftsHideTooltipAliasTypeDto("JUNE12", 7, "june12");
        JUNE12 = giftsHideTooltipAliasTypeDto8;
        GiftsHideTooltipAliasTypeDto giftsHideTooltipAliasTypeDto9 = new GiftsHideTooltipAliasTypeDto("MARCH8", 8, "march8");
        MARCH8 = giftsHideTooltipAliasTypeDto9;
        GiftsHideTooltipAliasTypeDto giftsHideTooltipAliasTypeDto10 = new GiftsHideTooltipAliasTypeDto("MAY1", 9, "may1");
        MAY1 = giftsHideTooltipAliasTypeDto10;
        GiftsHideTooltipAliasTypeDto giftsHideTooltipAliasTypeDto11 = new GiftsHideTooltipAliasTypeDto("MAY8", 10, "may8");
        MAY8 = giftsHideTooltipAliasTypeDto11;
        GiftsHideTooltipAliasTypeDto giftsHideTooltipAliasTypeDto12 = new GiftsHideTooltipAliasTypeDto("MAY9", 11, "may9");
        MAY9 = giftsHideTooltipAliasTypeDto12;
        GiftsHideTooltipAliasTypeDto giftsHideTooltipAliasTypeDto13 = new GiftsHideTooltipAliasTypeDto("NEWYEAR", 12, "newyear");
        NEWYEAR = giftsHideTooltipAliasTypeDto13;
        GiftsHideTooltipAliasTypeDto giftsHideTooltipAliasTypeDto14 = new GiftsHideTooltipAliasTypeDto("NOVEMBER4", 13, "november4");
        NOVEMBER4 = giftsHideTooltipAliasTypeDto14;
        GiftsHideTooltipAliasTypeDto giftsHideTooltipAliasTypeDto15 = new GiftsHideTooltipAliasTypeDto("SEPTEMBER1", 14, "september1");
        SEPTEMBER1 = giftsHideTooltipAliasTypeDto15;
        GiftsHideTooltipAliasTypeDto giftsHideTooltipAliasTypeDto16 = new GiftsHideTooltipAliasTypeDto("TEST", 15, LoginRequest.CLIENT_NAME);
        TEST = giftsHideTooltipAliasTypeDto16;
        GiftsHideTooltipAliasTypeDto[] giftsHideTooltipAliasTypeDtoArr = {giftsHideTooltipAliasTypeDto, giftsHideTooltipAliasTypeDto2, giftsHideTooltipAliasTypeDto3, giftsHideTooltipAliasTypeDto4, giftsHideTooltipAliasTypeDto5, giftsHideTooltipAliasTypeDto6, giftsHideTooltipAliasTypeDto7, giftsHideTooltipAliasTypeDto8, giftsHideTooltipAliasTypeDto9, giftsHideTooltipAliasTypeDto10, giftsHideTooltipAliasTypeDto11, giftsHideTooltipAliasTypeDto12, giftsHideTooltipAliasTypeDto13, giftsHideTooltipAliasTypeDto14, giftsHideTooltipAliasTypeDto15, giftsHideTooltipAliasTypeDto16};
        $VALUES = giftsHideTooltipAliasTypeDtoArr;
        $ENTRIES = new asp(giftsHideTooltipAliasTypeDtoArr);
        CREATOR = new a();
    }

    private GiftsHideTooltipAliasTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GiftsHideTooltipAliasTypeDto valueOf(String str) {
        return (GiftsHideTooltipAliasTypeDto) Enum.valueOf(GiftsHideTooltipAliasTypeDto.class, str);
    }

    public static GiftsHideTooltipAliasTypeDto[] values() {
        return (GiftsHideTooltipAliasTypeDto[]) $VALUES.clone();
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
