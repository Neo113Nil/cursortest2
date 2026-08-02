package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuperAppShowcaseHalfTileAlignDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppShowcaseHalfTileAlignDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SuperAppShowcaseHalfTileAlignDto[] $VALUES;

    @pmi0("bottom")
    public static final SuperAppShowcaseHalfTileAlignDto BOTTOM;
    public static final Parcelable.Creator<SuperAppShowcaseHalfTileAlignDto> CREATOR;

    @pmi0("top")
    public static final SuperAppShowcaseHalfTileAlignDto TOP;
    private final String value;

    /* compiled from: SuperAppShowcaseHalfTileAlignDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppShowcaseHalfTileAlignDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseHalfTileAlignDto createFromParcel(Parcel parcel) {
            return SuperAppShowcaseHalfTileAlignDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseHalfTileAlignDto[] newArray(int i) {
            return new SuperAppShowcaseHalfTileAlignDto[i];
        }
    }

    static {
        SuperAppShowcaseHalfTileAlignDto superAppShowcaseHalfTileAlignDto = new SuperAppShowcaseHalfTileAlignDto("TOP", 0, "top");
        TOP = superAppShowcaseHalfTileAlignDto;
        SuperAppShowcaseHalfTileAlignDto superAppShowcaseHalfTileAlignDto2 = new SuperAppShowcaseHalfTileAlignDto("BOTTOM", 1, "bottom");
        BOTTOM = superAppShowcaseHalfTileAlignDto2;
        SuperAppShowcaseHalfTileAlignDto[] superAppShowcaseHalfTileAlignDtoArr = {superAppShowcaseHalfTileAlignDto, superAppShowcaseHalfTileAlignDto2};
        $VALUES = superAppShowcaseHalfTileAlignDtoArr;
        $ENTRIES = new asp(superAppShowcaseHalfTileAlignDtoArr);
        CREATOR = new a();
    }

    private SuperAppShowcaseHalfTileAlignDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SuperAppShowcaseHalfTileAlignDto valueOf(String str) {
        return (SuperAppShowcaseHalfTileAlignDto) Enum.valueOf(SuperAppShowcaseHalfTileAlignDto.class, str);
    }

    public static SuperAppShowcaseHalfTileAlignDto[] values() {
        return (SuperAppShowcaseHalfTileAlignDto[]) $VALUES.clone();
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
