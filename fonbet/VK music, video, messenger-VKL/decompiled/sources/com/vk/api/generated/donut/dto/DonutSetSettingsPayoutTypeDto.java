package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutSetSettingsPayoutTypeDto.kt */
/* loaded from: classes14.dex */
public final class DonutSetSettingsPayoutTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutSetSettingsPayoutTypeDto[] $VALUES;

    @pmi0("bankcard")
    public static final DonutSetSettingsPayoutTypeDto BANKCARD;
    public static final Parcelable.Creator<DonutSetSettingsPayoutTypeDto> CREATOR;

    @pmi0("vk_pay")
    public static final DonutSetSettingsPayoutTypeDto VK_PAY;
    private final String value;

    /* compiled from: DonutSetSettingsPayoutTypeDto.kt */
    public static final class a implements Parcelable.Creator<DonutSetSettingsPayoutTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutSetSettingsPayoutTypeDto createFromParcel(Parcel parcel) {
            return DonutSetSettingsPayoutTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutSetSettingsPayoutTypeDto[] newArray(int i) {
            return new DonutSetSettingsPayoutTypeDto[i];
        }
    }

    static {
        DonutSetSettingsPayoutTypeDto donutSetSettingsPayoutTypeDto = new DonutSetSettingsPayoutTypeDto("BANKCARD", 0, "bankcard");
        BANKCARD = donutSetSettingsPayoutTypeDto;
        DonutSetSettingsPayoutTypeDto donutSetSettingsPayoutTypeDto2 = new DonutSetSettingsPayoutTypeDto("VK_PAY", 1, "vk_pay");
        VK_PAY = donutSetSettingsPayoutTypeDto2;
        DonutSetSettingsPayoutTypeDto[] donutSetSettingsPayoutTypeDtoArr = {donutSetSettingsPayoutTypeDto, donutSetSettingsPayoutTypeDto2};
        $VALUES = donutSetSettingsPayoutTypeDtoArr;
        $ENTRIES = new asp(donutSetSettingsPayoutTypeDtoArr);
        CREATOR = new a();
    }

    private DonutSetSettingsPayoutTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DonutSetSettingsPayoutTypeDto valueOf(String str) {
        return (DonutSetSettingsPayoutTypeDto) Enum.valueOf(DonutSetSettingsPayoutTypeDto.class, str);
    }

    public static DonutSetSettingsPayoutTypeDto[] values() {
        return (DonutSetSettingsPayoutTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
