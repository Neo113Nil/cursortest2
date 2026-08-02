package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSetDeliverySettingsIsBoxberryEnabledDto.kt */
/* loaded from: classes15.dex */
public final class MarketSetDeliverySettingsIsBoxberryEnabledDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSetDeliverySettingsIsBoxberryEnabledDto[] $VALUES;
    public static final Parcelable.Creator<MarketSetDeliverySettingsIsBoxberryEnabledDto> CREATOR;

    @pmi0("0")
    public static final MarketSetDeliverySettingsIsBoxberryEnabledDto TYPE_0;

    @pmi0("1")
    public static final MarketSetDeliverySettingsIsBoxberryEnabledDto TYPE_1;
    private final int value;

    /* compiled from: MarketSetDeliverySettingsIsBoxberryEnabledDto.kt */
    public static final class a implements Parcelable.Creator<MarketSetDeliverySettingsIsBoxberryEnabledDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSetDeliverySettingsIsBoxberryEnabledDto createFromParcel(Parcel parcel) {
            return MarketSetDeliverySettingsIsBoxberryEnabledDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSetDeliverySettingsIsBoxberryEnabledDto[] newArray(int i) {
            return new MarketSetDeliverySettingsIsBoxberryEnabledDto[i];
        }
    }

    static {
        MarketSetDeliverySettingsIsBoxberryEnabledDto marketSetDeliverySettingsIsBoxberryEnabledDto = new MarketSetDeliverySettingsIsBoxberryEnabledDto("TYPE_0", 0, 0);
        TYPE_0 = marketSetDeliverySettingsIsBoxberryEnabledDto;
        MarketSetDeliverySettingsIsBoxberryEnabledDto marketSetDeliverySettingsIsBoxberryEnabledDto2 = new MarketSetDeliverySettingsIsBoxberryEnabledDto("TYPE_1", 1, 1);
        TYPE_1 = marketSetDeliverySettingsIsBoxberryEnabledDto2;
        MarketSetDeliverySettingsIsBoxberryEnabledDto[] marketSetDeliverySettingsIsBoxberryEnabledDtoArr = {marketSetDeliverySettingsIsBoxberryEnabledDto, marketSetDeliverySettingsIsBoxberryEnabledDto2};
        $VALUES = marketSetDeliverySettingsIsBoxberryEnabledDtoArr;
        $ENTRIES = new asp(marketSetDeliverySettingsIsBoxberryEnabledDtoArr);
        CREATOR = new a();
    }

    private MarketSetDeliverySettingsIsBoxberryEnabledDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSetDeliverySettingsIsBoxberryEnabledDto valueOf(String str) {
        return (MarketSetDeliverySettingsIsBoxberryEnabledDto) Enum.valueOf(MarketSetDeliverySettingsIsBoxberryEnabledDto.class, str);
    }

    public static MarketSetDeliverySettingsIsBoxberryEnabledDto[] values() {
        return (MarketSetDeliverySettingsIsBoxberryEnabledDto[]) $VALUES.clone();
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
