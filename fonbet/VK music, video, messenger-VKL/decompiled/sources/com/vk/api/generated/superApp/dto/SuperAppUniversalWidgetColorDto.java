package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuperAppUniversalWidgetColorDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetColorDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SuperAppUniversalWidgetColorDto[] $VALUES;

    @pmi0("accent")
    public static final SuperAppUniversalWidgetColorDto ACCENT;
    public static final Parcelable.Creator<SuperAppUniversalWidgetColorDto> CREATOR;

    @pmi0("dynamic_blue")
    public static final SuperAppUniversalWidgetColorDto DYNAMIC_BLUE;

    @pmi0("dynamic_gray")
    public static final SuperAppUniversalWidgetColorDto DYNAMIC_GRAY;

    @pmi0("dynamic_green")
    public static final SuperAppUniversalWidgetColorDto DYNAMIC_GREEN;

    @pmi0("dynamic_orange")
    public static final SuperAppUniversalWidgetColorDto DYNAMIC_ORANGE;

    @pmi0("dynamic_red")
    public static final SuperAppUniversalWidgetColorDto DYNAMIC_RED;

    @pmi0("dynamic_violet")
    public static final SuperAppUniversalWidgetColorDto DYNAMIC_VIOLET;

    @pmi0("icon_tertiary")
    public static final SuperAppUniversalWidgetColorDto ICON_TERTIARY;

    @pmi0("text_primary")
    public static final SuperAppUniversalWidgetColorDto TEXT_PRIMARY;

    @pmi0("text_secondary")
    public static final SuperAppUniversalWidgetColorDto TEXT_SECONDARY;
    private final String value;

    /* compiled from: SuperAppUniversalWidgetColorDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetColorDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetColorDto createFromParcel(Parcel parcel) {
            return SuperAppUniversalWidgetColorDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetColorDto[] newArray(int i) {
            return new SuperAppUniversalWidgetColorDto[i];
        }
    }

    static {
        SuperAppUniversalWidgetColorDto superAppUniversalWidgetColorDto = new SuperAppUniversalWidgetColorDto("DYNAMIC_BLUE", 0, "dynamic_blue");
        DYNAMIC_BLUE = superAppUniversalWidgetColorDto;
        SuperAppUniversalWidgetColorDto superAppUniversalWidgetColorDto2 = new SuperAppUniversalWidgetColorDto("DYNAMIC_GRAY", 1, "dynamic_gray");
        DYNAMIC_GRAY = superAppUniversalWidgetColorDto2;
        SuperAppUniversalWidgetColorDto superAppUniversalWidgetColorDto3 = new SuperAppUniversalWidgetColorDto("DYNAMIC_RED", 2, "dynamic_red");
        DYNAMIC_RED = superAppUniversalWidgetColorDto3;
        SuperAppUniversalWidgetColorDto superAppUniversalWidgetColorDto4 = new SuperAppUniversalWidgetColorDto("DYNAMIC_GREEN", 3, "dynamic_green");
        DYNAMIC_GREEN = superAppUniversalWidgetColorDto4;
        SuperAppUniversalWidgetColorDto superAppUniversalWidgetColorDto5 = new SuperAppUniversalWidgetColorDto("DYNAMIC_ORANGE", 4, "dynamic_orange");
        DYNAMIC_ORANGE = superAppUniversalWidgetColorDto5;
        SuperAppUniversalWidgetColorDto superAppUniversalWidgetColorDto6 = new SuperAppUniversalWidgetColorDto("DYNAMIC_VIOLET", 5, "dynamic_violet");
        DYNAMIC_VIOLET = superAppUniversalWidgetColorDto6;
        SuperAppUniversalWidgetColorDto superAppUniversalWidgetColorDto7 = new SuperAppUniversalWidgetColorDto("ACCENT", 6, "accent");
        ACCENT = superAppUniversalWidgetColorDto7;
        SuperAppUniversalWidgetColorDto superAppUniversalWidgetColorDto8 = new SuperAppUniversalWidgetColorDto("ICON_TERTIARY", 7, "icon_tertiary");
        ICON_TERTIARY = superAppUniversalWidgetColorDto8;
        SuperAppUniversalWidgetColorDto superAppUniversalWidgetColorDto9 = new SuperAppUniversalWidgetColorDto("TEXT_PRIMARY", 8, "text_primary");
        TEXT_PRIMARY = superAppUniversalWidgetColorDto9;
        SuperAppUniversalWidgetColorDto superAppUniversalWidgetColorDto10 = new SuperAppUniversalWidgetColorDto("TEXT_SECONDARY", 9, "text_secondary");
        TEXT_SECONDARY = superAppUniversalWidgetColorDto10;
        SuperAppUniversalWidgetColorDto[] superAppUniversalWidgetColorDtoArr = {superAppUniversalWidgetColorDto, superAppUniversalWidgetColorDto2, superAppUniversalWidgetColorDto3, superAppUniversalWidgetColorDto4, superAppUniversalWidgetColorDto5, superAppUniversalWidgetColorDto6, superAppUniversalWidgetColorDto7, superAppUniversalWidgetColorDto8, superAppUniversalWidgetColorDto9, superAppUniversalWidgetColorDto10};
        $VALUES = superAppUniversalWidgetColorDtoArr;
        $ENTRIES = new asp(superAppUniversalWidgetColorDtoArr);
        CREATOR = new a();
    }

    private SuperAppUniversalWidgetColorDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SuperAppUniversalWidgetColorDto valueOf(String str) {
        return (SuperAppUniversalWidgetColorDto) Enum.valueOf(SuperAppUniversalWidgetColorDto.class, str);
    }

    public static SuperAppUniversalWidgetColorDto[] values() {
        return (SuperAppUniversalWidgetColorDto[]) $VALUES.clone();
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
