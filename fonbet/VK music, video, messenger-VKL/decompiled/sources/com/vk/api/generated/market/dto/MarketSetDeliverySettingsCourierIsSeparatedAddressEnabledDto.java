package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto.kt */
/* loaded from: classes15.dex */
public final class MarketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto[] $VALUES;
    public static final Parcelable.Creator<MarketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto> CREATOR;

    @pmi0("0")
    public static final MarketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto TYPE_0;

    @pmi0("1")
    public static final MarketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto TYPE_1;
    private final int value;

    /* compiled from: MarketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto.kt */
    public static final class a implements Parcelable.Creator<MarketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto createFromParcel(Parcel parcel) {
            return MarketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto[] newArray(int i) {
            return new MarketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto[i];
        }
    }

    static {
        MarketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto marketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto = new MarketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto("TYPE_0", 0, 0);
        TYPE_0 = marketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto;
        MarketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto marketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto2 = new MarketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto("TYPE_1", 1, 1);
        TYPE_1 = marketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto2;
        MarketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto[] marketSetDeliverySettingsCourierIsSeparatedAddressEnabledDtoArr = {marketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto, marketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto2};
        $VALUES = marketSetDeliverySettingsCourierIsSeparatedAddressEnabledDtoArr;
        $ENTRIES = new asp(marketSetDeliverySettingsCourierIsSeparatedAddressEnabledDtoArr);
        CREATOR = new a();
    }

    private MarketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto valueOf(String str) {
        return (MarketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto) Enum.valueOf(MarketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto.class, str);
    }

    public static MarketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto[] values() {
        return (MarketSetDeliverySettingsCourierIsSeparatedAddressEnabledDto[]) $VALUES.clone();
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
