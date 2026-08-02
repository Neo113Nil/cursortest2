package com.vk.api.generated.situationalSuggests.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SituationalSuggestsThemeCategoryDto.kt */
/* loaded from: classes15.dex */
public final class SituationalSuggestsThemeCategoryDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SituationalSuggestsThemeCategoryDto[] $VALUES;

    @pmi0("birthdays")
    public static final SituationalSuggestsThemeCategoryDto BIRTHDAYS;

    @pmi0("cinema")
    public static final SituationalSuggestsThemeCategoryDto CINEMA;
    public static final Parcelable.Creator<SituationalSuggestsThemeCategoryDto> CREATOR;

    @pmi0("culture")
    public static final SituationalSuggestsThemeCategoryDto CULTURE;

    @pmi0("flashmobs")
    public static final SituationalSuggestsThemeCategoryDto FLASHMOBS;

    @pmi0("holidays")
    public static final SituationalSuggestsThemeCategoryDto HOLIDAYS;

    @pmi0("unspecified")
    public static final SituationalSuggestsThemeCategoryDto UNSPECIFIED;
    private final String value;

    /* compiled from: SituationalSuggestsThemeCategoryDto.kt */
    public static final class a implements Parcelable.Creator<SituationalSuggestsThemeCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final SituationalSuggestsThemeCategoryDto createFromParcel(Parcel parcel) {
            return SituationalSuggestsThemeCategoryDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SituationalSuggestsThemeCategoryDto[] newArray(int i) {
            return new SituationalSuggestsThemeCategoryDto[i];
        }
    }

    static {
        SituationalSuggestsThemeCategoryDto situationalSuggestsThemeCategoryDto = new SituationalSuggestsThemeCategoryDto("UNSPECIFIED", 0, "unspecified");
        UNSPECIFIED = situationalSuggestsThemeCategoryDto;
        SituationalSuggestsThemeCategoryDto situationalSuggestsThemeCategoryDto2 = new SituationalSuggestsThemeCategoryDto("FLASHMOBS", 1, "flashmobs");
        FLASHMOBS = situationalSuggestsThemeCategoryDto2;
        SituationalSuggestsThemeCategoryDto situationalSuggestsThemeCategoryDto3 = new SituationalSuggestsThemeCategoryDto("HOLIDAYS", 2, "holidays");
        HOLIDAYS = situationalSuggestsThemeCategoryDto3;
        SituationalSuggestsThemeCategoryDto situationalSuggestsThemeCategoryDto4 = new SituationalSuggestsThemeCategoryDto("BIRTHDAYS", 3, "birthdays");
        BIRTHDAYS = situationalSuggestsThemeCategoryDto4;
        SituationalSuggestsThemeCategoryDto situationalSuggestsThemeCategoryDto5 = new SituationalSuggestsThemeCategoryDto("CULTURE", 4, "culture");
        CULTURE = situationalSuggestsThemeCategoryDto5;
        SituationalSuggestsThemeCategoryDto situationalSuggestsThemeCategoryDto6 = new SituationalSuggestsThemeCategoryDto("CINEMA", 5, "cinema");
        CINEMA = situationalSuggestsThemeCategoryDto6;
        SituationalSuggestsThemeCategoryDto[] situationalSuggestsThemeCategoryDtoArr = {situationalSuggestsThemeCategoryDto, situationalSuggestsThemeCategoryDto2, situationalSuggestsThemeCategoryDto3, situationalSuggestsThemeCategoryDto4, situationalSuggestsThemeCategoryDto5, situationalSuggestsThemeCategoryDto6};
        $VALUES = situationalSuggestsThemeCategoryDtoArr;
        $ENTRIES = new asp(situationalSuggestsThemeCategoryDtoArr);
        CREATOR = new a();
    }

    private SituationalSuggestsThemeCategoryDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SituationalSuggestsThemeCategoryDto valueOf(String str) {
        return (SituationalSuggestsThemeCategoryDto) Enum.valueOf(SituationalSuggestsThemeCategoryDto.class, str);
    }

    public static SituationalSuggestsThemeCategoryDto[] values() {
        return (SituationalSuggestsThemeCategoryDto[]) $VALUES.clone();
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
