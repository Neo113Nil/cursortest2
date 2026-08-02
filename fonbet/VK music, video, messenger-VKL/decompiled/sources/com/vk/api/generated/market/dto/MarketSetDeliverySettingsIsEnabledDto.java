package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSetDeliverySettingsIsEnabledDto.kt */
/* loaded from: classes15.dex */
public final class MarketSetDeliverySettingsIsEnabledDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSetDeliverySettingsIsEnabledDto[] $VALUES;
    public static final Parcelable.Creator<MarketSetDeliverySettingsIsEnabledDto> CREATOR;

    @pmi0("0")
    public static final MarketSetDeliverySettingsIsEnabledDto TYPE_0;

    @pmi0("1")
    public static final MarketSetDeliverySettingsIsEnabledDto TYPE_1;
    private final int value;

    /* compiled from: MarketSetDeliverySettingsIsEnabledDto.kt */
    public static final class a implements Parcelable.Creator<MarketSetDeliverySettingsIsEnabledDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSetDeliverySettingsIsEnabledDto createFromParcel(Parcel parcel) {
            return MarketSetDeliverySettingsIsEnabledDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSetDeliverySettingsIsEnabledDto[] newArray(int i) {
            return new MarketSetDeliverySettingsIsEnabledDto[i];
        }
    }

    static {
        MarketSetDeliverySettingsIsEnabledDto marketSetDeliverySettingsIsEnabledDto = new MarketSetDeliverySettingsIsEnabledDto("TYPE_0", 0, 0);
        TYPE_0 = marketSetDeliverySettingsIsEnabledDto;
        MarketSetDeliverySettingsIsEnabledDto marketSetDeliverySettingsIsEnabledDto2 = new MarketSetDeliverySettingsIsEnabledDto("TYPE_1", 1, 1);
        TYPE_1 = marketSetDeliverySettingsIsEnabledDto2;
        MarketSetDeliverySettingsIsEnabledDto[] marketSetDeliverySettingsIsEnabledDtoArr = {marketSetDeliverySettingsIsEnabledDto, marketSetDeliverySettingsIsEnabledDto2};
        $VALUES = marketSetDeliverySettingsIsEnabledDtoArr;
        $ENTRIES = new asp(marketSetDeliverySettingsIsEnabledDtoArr);
        CREATOR = new a();
    }

    private MarketSetDeliverySettingsIsEnabledDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSetDeliverySettingsIsEnabledDto valueOf(String str) {
        return (MarketSetDeliverySettingsIsEnabledDto) Enum.valueOf(MarketSetDeliverySettingsIsEnabledDto.class, str);
    }

    public static MarketSetDeliverySettingsIsEnabledDto[] values() {
        return (MarketSetDeliverySettingsIsEnabledDto[]) $VALUES.clone();
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
