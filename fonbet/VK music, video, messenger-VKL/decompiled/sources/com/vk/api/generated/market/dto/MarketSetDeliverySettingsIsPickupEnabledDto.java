package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSetDeliverySettingsIsPickupEnabledDto.kt */
/* loaded from: classes15.dex */
public final class MarketSetDeliverySettingsIsPickupEnabledDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSetDeliverySettingsIsPickupEnabledDto[] $VALUES;
    public static final Parcelable.Creator<MarketSetDeliverySettingsIsPickupEnabledDto> CREATOR;

    @pmi0("0")
    public static final MarketSetDeliverySettingsIsPickupEnabledDto TYPE_0;

    @pmi0("1")
    public static final MarketSetDeliverySettingsIsPickupEnabledDto TYPE_1;
    private final int value;

    /* compiled from: MarketSetDeliverySettingsIsPickupEnabledDto.kt */
    public static final class a implements Parcelable.Creator<MarketSetDeliverySettingsIsPickupEnabledDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSetDeliverySettingsIsPickupEnabledDto createFromParcel(Parcel parcel) {
            return MarketSetDeliverySettingsIsPickupEnabledDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSetDeliverySettingsIsPickupEnabledDto[] newArray(int i) {
            return new MarketSetDeliverySettingsIsPickupEnabledDto[i];
        }
    }

    static {
        MarketSetDeliverySettingsIsPickupEnabledDto marketSetDeliverySettingsIsPickupEnabledDto = new MarketSetDeliverySettingsIsPickupEnabledDto("TYPE_0", 0, 0);
        TYPE_0 = marketSetDeliverySettingsIsPickupEnabledDto;
        MarketSetDeliverySettingsIsPickupEnabledDto marketSetDeliverySettingsIsPickupEnabledDto2 = new MarketSetDeliverySettingsIsPickupEnabledDto("TYPE_1", 1, 1);
        TYPE_1 = marketSetDeliverySettingsIsPickupEnabledDto2;
        MarketSetDeliverySettingsIsPickupEnabledDto[] marketSetDeliverySettingsIsPickupEnabledDtoArr = {marketSetDeliverySettingsIsPickupEnabledDto, marketSetDeliverySettingsIsPickupEnabledDto2};
        $VALUES = marketSetDeliverySettingsIsPickupEnabledDtoArr;
        $ENTRIES = new asp(marketSetDeliverySettingsIsPickupEnabledDtoArr);
        CREATOR = new a();
    }

    private MarketSetDeliverySettingsIsPickupEnabledDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSetDeliverySettingsIsPickupEnabledDto valueOf(String str) {
        return (MarketSetDeliverySettingsIsPickupEnabledDto) Enum.valueOf(MarketSetDeliverySettingsIsPickupEnabledDto.class, str);
    }

    public static MarketSetDeliverySettingsIsPickupEnabledDto[] values() {
        return (MarketSetDeliverySettingsIsPickupEnabledDto[]) $VALUES.clone();
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
