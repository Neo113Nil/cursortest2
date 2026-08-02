package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuperAppUniversalWidgetWeightDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetWeightDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SuperAppUniversalWidgetWeightDto[] $VALUES;
    public static final Parcelable.Creator<SuperAppUniversalWidgetWeightDto> CREATOR;

    @pmi0("light")
    public static final SuperAppUniversalWidgetWeightDto LIGHT;

    @pmi0("medium")
    public static final SuperAppUniversalWidgetWeightDto MEDIUM;

    @pmi0("regular")
    public static final SuperAppUniversalWidgetWeightDto REGULAR;
    private final String value;

    /* compiled from: SuperAppUniversalWidgetWeightDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetWeightDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetWeightDto createFromParcel(Parcel parcel) {
            return SuperAppUniversalWidgetWeightDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetWeightDto[] newArray(int i) {
            return new SuperAppUniversalWidgetWeightDto[i];
        }
    }

    static {
        SuperAppUniversalWidgetWeightDto superAppUniversalWidgetWeightDto = new SuperAppUniversalWidgetWeightDto("LIGHT", 0, "light");
        LIGHT = superAppUniversalWidgetWeightDto;
        SuperAppUniversalWidgetWeightDto superAppUniversalWidgetWeightDto2 = new SuperAppUniversalWidgetWeightDto("REGULAR", 1, "regular");
        REGULAR = superAppUniversalWidgetWeightDto2;
        SuperAppUniversalWidgetWeightDto superAppUniversalWidgetWeightDto3 = new SuperAppUniversalWidgetWeightDto("MEDIUM", 2, "medium");
        MEDIUM = superAppUniversalWidgetWeightDto3;
        SuperAppUniversalWidgetWeightDto[] superAppUniversalWidgetWeightDtoArr = {superAppUniversalWidgetWeightDto, superAppUniversalWidgetWeightDto2, superAppUniversalWidgetWeightDto3};
        $VALUES = superAppUniversalWidgetWeightDtoArr;
        $ENTRIES = new asp(superAppUniversalWidgetWeightDtoArr);
        CREATOR = new a();
    }

    private SuperAppUniversalWidgetWeightDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SuperAppUniversalWidgetWeightDto valueOf(String str) {
        return (SuperAppUniversalWidgetWeightDto) Enum.valueOf(SuperAppUniversalWidgetWeightDto.class, str);
    }

    public static SuperAppUniversalWidgetWeightDto[] values() {
        return (SuperAppUniversalWidgetWeightDto[]) $VALUES.clone();
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
