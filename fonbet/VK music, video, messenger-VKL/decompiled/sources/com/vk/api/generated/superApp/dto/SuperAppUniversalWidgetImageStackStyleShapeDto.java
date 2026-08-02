package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuperAppUniversalWidgetImageStackStyleShapeDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetImageStackStyleShapeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SuperAppUniversalWidgetImageStackStyleShapeDto[] $VALUES;

    @pmi0("circle")
    public static final SuperAppUniversalWidgetImageStackStyleShapeDto CIRCLE;
    public static final Parcelable.Creator<SuperAppUniversalWidgetImageStackStyleShapeDto> CREATOR;

    @pmi0("square")
    public static final SuperAppUniversalWidgetImageStackStyleShapeDto SQUARE;
    private final String value;

    /* compiled from: SuperAppUniversalWidgetImageStackStyleShapeDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetImageStackStyleShapeDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetImageStackStyleShapeDto createFromParcel(Parcel parcel) {
            return SuperAppUniversalWidgetImageStackStyleShapeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetImageStackStyleShapeDto[] newArray(int i) {
            return new SuperAppUniversalWidgetImageStackStyleShapeDto[i];
        }
    }

    static {
        SuperAppUniversalWidgetImageStackStyleShapeDto superAppUniversalWidgetImageStackStyleShapeDto = new SuperAppUniversalWidgetImageStackStyleShapeDto("SQUARE", 0, "square");
        SQUARE = superAppUniversalWidgetImageStackStyleShapeDto;
        SuperAppUniversalWidgetImageStackStyleShapeDto superAppUniversalWidgetImageStackStyleShapeDto2 = new SuperAppUniversalWidgetImageStackStyleShapeDto("CIRCLE", 1, "circle");
        CIRCLE = superAppUniversalWidgetImageStackStyleShapeDto2;
        SuperAppUniversalWidgetImageStackStyleShapeDto[] superAppUniversalWidgetImageStackStyleShapeDtoArr = {superAppUniversalWidgetImageStackStyleShapeDto, superAppUniversalWidgetImageStackStyleShapeDto2};
        $VALUES = superAppUniversalWidgetImageStackStyleShapeDtoArr;
        $ENTRIES = new asp(superAppUniversalWidgetImageStackStyleShapeDtoArr);
        CREATOR = new a();
    }

    private SuperAppUniversalWidgetImageStackStyleShapeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SuperAppUniversalWidgetImageStackStyleShapeDto valueOf(String str) {
        return (SuperAppUniversalWidgetImageStackStyleShapeDto) Enum.valueOf(SuperAppUniversalWidgetImageStackStyleShapeDto.class, str);
    }

    public static SuperAppUniversalWidgetImageStackStyleShapeDto[] values() {
        return (SuperAppUniversalWidgetImageStackStyleShapeDto[]) $VALUES.clone();
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
