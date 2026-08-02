package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuperAppUniversalWidgetButtonStyleTypeDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetButtonStyleTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SuperAppUniversalWidgetButtonStyleTypeDto[] $VALUES;
    public static final Parcelable.Creator<SuperAppUniversalWidgetButtonStyleTypeDto> CREATOR;

    @pmi0("outline")
    public static final SuperAppUniversalWidgetButtonStyleTypeDto OUTLINE;

    @pmi0("primary")
    public static final SuperAppUniversalWidgetButtonStyleTypeDto PRIMARY;

    @pmi0(X3.i.Y)
    public static final SuperAppUniversalWidgetButtonStyleTypeDto SECONDARY;

    @pmi0("tertiary")
    public static final SuperAppUniversalWidgetButtonStyleTypeDto TERTIARY;
    private final String value;

    /* compiled from: SuperAppUniversalWidgetButtonStyleTypeDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetButtonStyleTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetButtonStyleTypeDto createFromParcel(Parcel parcel) {
            return SuperAppUniversalWidgetButtonStyleTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetButtonStyleTypeDto[] newArray(int i) {
            return new SuperAppUniversalWidgetButtonStyleTypeDto[i];
        }
    }

    static {
        SuperAppUniversalWidgetButtonStyleTypeDto superAppUniversalWidgetButtonStyleTypeDto = new SuperAppUniversalWidgetButtonStyleTypeDto("OUTLINE", 0, "outline");
        OUTLINE = superAppUniversalWidgetButtonStyleTypeDto;
        SuperAppUniversalWidgetButtonStyleTypeDto superAppUniversalWidgetButtonStyleTypeDto2 = new SuperAppUniversalWidgetButtonStyleTypeDto("TERTIARY", 1, "tertiary");
        TERTIARY = superAppUniversalWidgetButtonStyleTypeDto2;
        SuperAppUniversalWidgetButtonStyleTypeDto superAppUniversalWidgetButtonStyleTypeDto3 = new SuperAppUniversalWidgetButtonStyleTypeDto("PRIMARY", 2, "primary");
        PRIMARY = superAppUniversalWidgetButtonStyleTypeDto3;
        SuperAppUniversalWidgetButtonStyleTypeDto superAppUniversalWidgetButtonStyleTypeDto4 = new SuperAppUniversalWidgetButtonStyleTypeDto("SECONDARY", 3, X3.i.Y);
        SECONDARY = superAppUniversalWidgetButtonStyleTypeDto4;
        SuperAppUniversalWidgetButtonStyleTypeDto[] superAppUniversalWidgetButtonStyleTypeDtoArr = {superAppUniversalWidgetButtonStyleTypeDto, superAppUniversalWidgetButtonStyleTypeDto2, superAppUniversalWidgetButtonStyleTypeDto3, superAppUniversalWidgetButtonStyleTypeDto4};
        $VALUES = superAppUniversalWidgetButtonStyleTypeDtoArr;
        $ENTRIES = new asp(superAppUniversalWidgetButtonStyleTypeDtoArr);
        CREATOR = new a();
    }

    private SuperAppUniversalWidgetButtonStyleTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SuperAppUniversalWidgetButtonStyleTypeDto valueOf(String str) {
        return (SuperAppUniversalWidgetButtonStyleTypeDto) Enum.valueOf(SuperAppUniversalWidgetButtonStyleTypeDto.class, str);
    }

    public static SuperAppUniversalWidgetButtonStyleTypeDto[] values() {
        return (SuperAppUniversalWidgetButtonStyleTypeDto[]) $VALUES.clone();
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
