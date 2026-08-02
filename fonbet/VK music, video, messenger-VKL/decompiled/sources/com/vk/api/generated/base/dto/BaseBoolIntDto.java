package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BaseBoolIntDto.kt */
/* loaded from: classes14.dex */
public final class BaseBoolIntDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BaseBoolIntDto[] $VALUES;
    public static final Parcelable.Creator<BaseBoolIntDto> CREATOR;

    @pmi0("0")
    public static final BaseBoolIntDto NO;

    @pmi0("1")
    public static final BaseBoolIntDto YES;
    private final int value;

    /* compiled from: BaseBoolIntDto.kt */
    public static final class a implements Parcelable.Creator<BaseBoolIntDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseBoolIntDto createFromParcel(Parcel parcel) {
            return BaseBoolIntDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseBoolIntDto[] newArray(int i) {
            return new BaseBoolIntDto[i];
        }
    }

    static {
        BaseBoolIntDto baseBoolIntDto = new BaseBoolIntDto("NO", 0, 0);
        NO = baseBoolIntDto;
        BaseBoolIntDto baseBoolIntDto2 = new BaseBoolIntDto("YES", 1, 1);
        YES = baseBoolIntDto2;
        BaseBoolIntDto[] baseBoolIntDtoArr = {baseBoolIntDto, baseBoolIntDto2};
        $VALUES = baseBoolIntDtoArr;
        $ENTRIES = new asp(baseBoolIntDtoArr);
        CREATOR = new a();
    }

    private BaseBoolIntDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static BaseBoolIntDto valueOf(String str) {
        return (BaseBoolIntDto) Enum.valueOf(BaseBoolIntDto.class, str);
    }

    public static BaseBoolIntDto[] values() {
        return (BaseBoolIntDto[]) $VALUES.clone();
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
