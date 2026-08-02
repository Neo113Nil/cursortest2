package com.vk.api.generated.yoga.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: YogaUnitDto.kt */
/* loaded from: classes15.dex */
public final class YogaUnitDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ YogaUnitDto[] $VALUES;

    @pmi0("3")
    public static final YogaUnitDto AUTO;
    public static final Parcelable.Creator<YogaUnitDto> CREATOR;

    @pmi0("2")
    public static final YogaUnitDto PERCENT;

    @pmi0("1")
    public static final YogaUnitDto POINT;

    @pmi0("0")
    public static final YogaUnitDto UNDEFINED;
    private final int value;

    /* compiled from: YogaUnitDto.kt */
    public static final class a implements Parcelable.Creator<YogaUnitDto> {
        @Override // android.os.Parcelable.Creator
        public final YogaUnitDto createFromParcel(Parcel parcel) {
            return YogaUnitDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final YogaUnitDto[] newArray(int i) {
            return new YogaUnitDto[i];
        }
    }

    static {
        YogaUnitDto yogaUnitDto = new YogaUnitDto("UNDEFINED", 0, 0);
        UNDEFINED = yogaUnitDto;
        YogaUnitDto yogaUnitDto2 = new YogaUnitDto("POINT", 1, 1);
        POINT = yogaUnitDto2;
        YogaUnitDto yogaUnitDto3 = new YogaUnitDto("PERCENT", 2, 2);
        PERCENT = yogaUnitDto3;
        YogaUnitDto yogaUnitDto4 = new YogaUnitDto("AUTO", 3, 3);
        AUTO = yogaUnitDto4;
        YogaUnitDto[] yogaUnitDtoArr = {yogaUnitDto, yogaUnitDto2, yogaUnitDto3, yogaUnitDto4};
        $VALUES = yogaUnitDtoArr;
        $ENTRIES = new asp(yogaUnitDtoArr);
        CREATOR = new a();
    }

    private YogaUnitDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static YogaUnitDto valueOf(String str) {
        return (YogaUnitDto) Enum.valueOf(YogaUnitDto.class, str);
    }

    public static YogaUnitDto[] values() {
        return (YogaUnitDto[]) $VALUES.clone();
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
