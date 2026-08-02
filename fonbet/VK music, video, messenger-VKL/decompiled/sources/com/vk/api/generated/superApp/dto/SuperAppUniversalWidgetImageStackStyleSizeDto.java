package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuperAppUniversalWidgetImageStackStyleSizeDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetImageStackStyleSizeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SuperAppUniversalWidgetImageStackStyleSizeDto[] $VALUES;
    public static final Parcelable.Creator<SuperAppUniversalWidgetImageStackStyleSizeDto> CREATOR;

    @pmi0("large")
    public static final SuperAppUniversalWidgetImageStackStyleSizeDto LARGE;

    @pmi0("medium")
    public static final SuperAppUniversalWidgetImageStackStyleSizeDto MEDIUM;

    @pmi0("small")
    public static final SuperAppUniversalWidgetImageStackStyleSizeDto SMALL;
    private final String value;

    /* compiled from: SuperAppUniversalWidgetImageStackStyleSizeDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetImageStackStyleSizeDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetImageStackStyleSizeDto createFromParcel(Parcel parcel) {
            return SuperAppUniversalWidgetImageStackStyleSizeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetImageStackStyleSizeDto[] newArray(int i) {
            return new SuperAppUniversalWidgetImageStackStyleSizeDto[i];
        }
    }

    static {
        SuperAppUniversalWidgetImageStackStyleSizeDto superAppUniversalWidgetImageStackStyleSizeDto = new SuperAppUniversalWidgetImageStackStyleSizeDto("SMALL", 0, "small");
        SMALL = superAppUniversalWidgetImageStackStyleSizeDto;
        SuperAppUniversalWidgetImageStackStyleSizeDto superAppUniversalWidgetImageStackStyleSizeDto2 = new SuperAppUniversalWidgetImageStackStyleSizeDto("MEDIUM", 1, "medium");
        MEDIUM = superAppUniversalWidgetImageStackStyleSizeDto2;
        SuperAppUniversalWidgetImageStackStyleSizeDto superAppUniversalWidgetImageStackStyleSizeDto3 = new SuperAppUniversalWidgetImageStackStyleSizeDto("LARGE", 2, "large");
        LARGE = superAppUniversalWidgetImageStackStyleSizeDto3;
        SuperAppUniversalWidgetImageStackStyleSizeDto[] superAppUniversalWidgetImageStackStyleSizeDtoArr = {superAppUniversalWidgetImageStackStyleSizeDto, superAppUniversalWidgetImageStackStyleSizeDto2, superAppUniversalWidgetImageStackStyleSizeDto3};
        $VALUES = superAppUniversalWidgetImageStackStyleSizeDtoArr;
        $ENTRIES = new asp(superAppUniversalWidgetImageStackStyleSizeDtoArr);
        CREATOR = new a();
    }

    private SuperAppUniversalWidgetImageStackStyleSizeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SuperAppUniversalWidgetImageStackStyleSizeDto valueOf(String str) {
        return (SuperAppUniversalWidgetImageStackStyleSizeDto) Enum.valueOf(SuperAppUniversalWidgetImageStackStyleSizeDto.class, str);
    }

    public static SuperAppUniversalWidgetImageStackStyleSizeDto[] values() {
        return (SuperAppUniversalWidgetImageStackStyleSizeDto[]) $VALUES.clone();
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
