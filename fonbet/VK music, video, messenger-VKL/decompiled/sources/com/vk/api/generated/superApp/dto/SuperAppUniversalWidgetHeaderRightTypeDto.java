package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuperAppUniversalWidgetHeaderRightTypeDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetHeaderRightTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SuperAppUniversalWidgetHeaderRightTypeDto[] $VALUES;

    @pmi0("chevron")
    public static final SuperAppUniversalWidgetHeaderRightTypeDto CHEVRON;
    public static final Parcelable.Creator<SuperAppUniversalWidgetHeaderRightTypeDto> CREATOR;

    @pmi0("more")
    public static final SuperAppUniversalWidgetHeaderRightTypeDto MORE;

    @pmi0("none")
    public static final SuperAppUniversalWidgetHeaderRightTypeDto NONE;
    private final String value;

    /* compiled from: SuperAppUniversalWidgetHeaderRightTypeDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetHeaderRightTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetHeaderRightTypeDto createFromParcel(Parcel parcel) {
            return SuperAppUniversalWidgetHeaderRightTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetHeaderRightTypeDto[] newArray(int i) {
            return new SuperAppUniversalWidgetHeaderRightTypeDto[i];
        }
    }

    static {
        SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = new SuperAppUniversalWidgetHeaderRightTypeDto("MORE", 0, "more");
        MORE = superAppUniversalWidgetHeaderRightTypeDto;
        SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto2 = new SuperAppUniversalWidgetHeaderRightTypeDto("CHEVRON", 1, "chevron");
        CHEVRON = superAppUniversalWidgetHeaderRightTypeDto2;
        SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto3 = new SuperAppUniversalWidgetHeaderRightTypeDto("NONE", 2, "none");
        NONE = superAppUniversalWidgetHeaderRightTypeDto3;
        SuperAppUniversalWidgetHeaderRightTypeDto[] superAppUniversalWidgetHeaderRightTypeDtoArr = {superAppUniversalWidgetHeaderRightTypeDto, superAppUniversalWidgetHeaderRightTypeDto2, superAppUniversalWidgetHeaderRightTypeDto3};
        $VALUES = superAppUniversalWidgetHeaderRightTypeDtoArr;
        $ENTRIES = new asp(superAppUniversalWidgetHeaderRightTypeDtoArr);
        CREATOR = new a();
    }

    private SuperAppUniversalWidgetHeaderRightTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SuperAppUniversalWidgetHeaderRightTypeDto valueOf(String str) {
        return (SuperAppUniversalWidgetHeaderRightTypeDto) Enum.valueOf(SuperAppUniversalWidgetHeaderRightTypeDto.class, str);
    }

    public static SuperAppUniversalWidgetHeaderRightTypeDto[] values() {
        return (SuperAppUniversalWidgetHeaderRightTypeDto[]) $VALUES.clone();
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
