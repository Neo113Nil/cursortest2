package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BaseSexDto.kt */
/* loaded from: classes14.dex */
public final class BaseSexDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BaseSexDto[] $VALUES;
    public static final Parcelable.Creator<BaseSexDto> CREATOR;

    @pmi0("1")
    public static final BaseSexDto FEMALE;

    @pmi0("2")
    public static final BaseSexDto MALE;

    @pmi0("0")
    public static final BaseSexDto UNKNOWN;
    private final int value;

    /* compiled from: BaseSexDto.kt */
    public static final class a implements Parcelable.Creator<BaseSexDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseSexDto createFromParcel(Parcel parcel) {
            return BaseSexDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseSexDto[] newArray(int i) {
            return new BaseSexDto[i];
        }
    }

    static {
        BaseSexDto baseSexDto = new BaseSexDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
        UNKNOWN = baseSexDto;
        BaseSexDto baseSexDto2 = new BaseSexDto("FEMALE", 1, 1);
        FEMALE = baseSexDto2;
        BaseSexDto baseSexDto3 = new BaseSexDto("MALE", 2, 2);
        MALE = baseSexDto3;
        BaseSexDto[] baseSexDtoArr = {baseSexDto, baseSexDto2, baseSexDto3};
        $VALUES = baseSexDtoArr;
        $ENTRIES = new asp(baseSexDtoArr);
        CREATOR = new a();
    }

    private BaseSexDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static BaseSexDto valueOf(String str) {
        return (BaseSexDto) Enum.valueOf(BaseSexDto.class, str);
    }

    public static BaseSexDto[] values() {
        return (BaseSexDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
