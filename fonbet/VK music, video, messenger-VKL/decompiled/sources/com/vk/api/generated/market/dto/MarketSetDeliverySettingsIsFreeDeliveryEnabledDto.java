package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSetDeliverySettingsIsFreeDeliveryEnabledDto.kt */
/* loaded from: classes15.dex */
public final class MarketSetDeliverySettingsIsFreeDeliveryEnabledDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSetDeliverySettingsIsFreeDeliveryEnabledDto[] $VALUES;
    public static final Parcelable.Creator<MarketSetDeliverySettingsIsFreeDeliveryEnabledDto> CREATOR;

    @pmi0("0")
    public static final MarketSetDeliverySettingsIsFreeDeliveryEnabledDto TYPE_0;

    @pmi0("1")
    public static final MarketSetDeliverySettingsIsFreeDeliveryEnabledDto TYPE_1;
    private final int value;

    /* compiled from: MarketSetDeliverySettingsIsFreeDeliveryEnabledDto.kt */
    public static final class a implements Parcelable.Creator<MarketSetDeliverySettingsIsFreeDeliveryEnabledDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSetDeliverySettingsIsFreeDeliveryEnabledDto createFromParcel(Parcel parcel) {
            return MarketSetDeliverySettingsIsFreeDeliveryEnabledDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSetDeliverySettingsIsFreeDeliveryEnabledDto[] newArray(int i) {
            return new MarketSetDeliverySettingsIsFreeDeliveryEnabledDto[i];
        }
    }

    static {
        MarketSetDeliverySettingsIsFreeDeliveryEnabledDto marketSetDeliverySettingsIsFreeDeliveryEnabledDto = new MarketSetDeliverySettingsIsFreeDeliveryEnabledDto("TYPE_0", 0, 0);
        TYPE_0 = marketSetDeliverySettingsIsFreeDeliveryEnabledDto;
        MarketSetDeliverySettingsIsFreeDeliveryEnabledDto marketSetDeliverySettingsIsFreeDeliveryEnabledDto2 = new MarketSetDeliverySettingsIsFreeDeliveryEnabledDto("TYPE_1", 1, 1);
        TYPE_1 = marketSetDeliverySettingsIsFreeDeliveryEnabledDto2;
        MarketSetDeliverySettingsIsFreeDeliveryEnabledDto[] marketSetDeliverySettingsIsFreeDeliveryEnabledDtoArr = {marketSetDeliverySettingsIsFreeDeliveryEnabledDto, marketSetDeliverySettingsIsFreeDeliveryEnabledDto2};
        $VALUES = marketSetDeliverySettingsIsFreeDeliveryEnabledDtoArr;
        $ENTRIES = new asp(marketSetDeliverySettingsIsFreeDeliveryEnabledDtoArr);
        CREATOR = new a();
    }

    private MarketSetDeliverySettingsIsFreeDeliveryEnabledDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSetDeliverySettingsIsFreeDeliveryEnabledDto valueOf(String str) {
        return (MarketSetDeliverySettingsIsFreeDeliveryEnabledDto) Enum.valueOf(MarketSetDeliverySettingsIsFreeDeliveryEnabledDto.class, str);
    }

    public static MarketSetDeliverySettingsIsFreeDeliveryEnabledDto[] values() {
        return (MarketSetDeliverySettingsIsFreeDeliveryEnabledDto[]) $VALUES.clone();
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
