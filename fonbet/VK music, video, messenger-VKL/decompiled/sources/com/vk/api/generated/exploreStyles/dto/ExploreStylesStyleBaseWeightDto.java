package com.vk.api.generated.exploreStyles.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExploreStylesStyleBaseWeightDto.kt */
/* loaded from: classes14.dex */
public final class ExploreStylesStyleBaseWeightDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ExploreStylesStyleBaseWeightDto[] $VALUES;
    public static final Parcelable.Creator<ExploreStylesStyleBaseWeightDto> CREATOR;

    @pmi0("light")
    public static final ExploreStylesStyleBaseWeightDto LIGHT;

    @pmi0("medium")
    public static final ExploreStylesStyleBaseWeightDto MEDIUM;

    @pmi0("regular")
    public static final ExploreStylesStyleBaseWeightDto REGULAR;
    private final String value;

    /* compiled from: ExploreStylesStyleBaseWeightDto.kt */
    public static final class a implements Parcelable.Creator<ExploreStylesStyleBaseWeightDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreStylesStyleBaseWeightDto createFromParcel(Parcel parcel) {
            return ExploreStylesStyleBaseWeightDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreStylesStyleBaseWeightDto[] newArray(int i) {
            return new ExploreStylesStyleBaseWeightDto[i];
        }
    }

    static {
        ExploreStylesStyleBaseWeightDto exploreStylesStyleBaseWeightDto = new ExploreStylesStyleBaseWeightDto("LIGHT", 0, "light");
        LIGHT = exploreStylesStyleBaseWeightDto;
        ExploreStylesStyleBaseWeightDto exploreStylesStyleBaseWeightDto2 = new ExploreStylesStyleBaseWeightDto("REGULAR", 1, "regular");
        REGULAR = exploreStylesStyleBaseWeightDto2;
        ExploreStylesStyleBaseWeightDto exploreStylesStyleBaseWeightDto3 = new ExploreStylesStyleBaseWeightDto("MEDIUM", 2, "medium");
        MEDIUM = exploreStylesStyleBaseWeightDto3;
        ExploreStylesStyleBaseWeightDto[] exploreStylesStyleBaseWeightDtoArr = {exploreStylesStyleBaseWeightDto, exploreStylesStyleBaseWeightDto2, exploreStylesStyleBaseWeightDto3};
        $VALUES = exploreStylesStyleBaseWeightDtoArr;
        $ENTRIES = new asp(exploreStylesStyleBaseWeightDtoArr);
        CREATOR = new a();
    }

    private ExploreStylesStyleBaseWeightDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ExploreStylesStyleBaseWeightDto valueOf(String str) {
        return (ExploreStylesStyleBaseWeightDto) Enum.valueOf(ExploreStylesStyleBaseWeightDto.class, str);
    }

    public static ExploreStylesStyleBaseWeightDto[] values() {
        return (ExploreStylesStyleBaseWeightDto[]) $VALUES.clone();
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
