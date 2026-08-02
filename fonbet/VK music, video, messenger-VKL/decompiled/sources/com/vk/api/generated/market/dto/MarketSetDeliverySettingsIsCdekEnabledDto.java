package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSetDeliverySettingsIsCdekEnabledDto.kt */
/* loaded from: classes15.dex */
public final class MarketSetDeliverySettingsIsCdekEnabledDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSetDeliverySettingsIsCdekEnabledDto[] $VALUES;
    public static final Parcelable.Creator<MarketSetDeliverySettingsIsCdekEnabledDto> CREATOR;

    @pmi0("0")
    public static final MarketSetDeliverySettingsIsCdekEnabledDto TYPE_0;

    @pmi0("1")
    public static final MarketSetDeliverySettingsIsCdekEnabledDto TYPE_1;
    private final int value;

    /* compiled from: MarketSetDeliverySettingsIsCdekEnabledDto.kt */
    public static final class a implements Parcelable.Creator<MarketSetDeliverySettingsIsCdekEnabledDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSetDeliverySettingsIsCdekEnabledDto createFromParcel(Parcel parcel) {
            return MarketSetDeliverySettingsIsCdekEnabledDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSetDeliverySettingsIsCdekEnabledDto[] newArray(int i) {
            return new MarketSetDeliverySettingsIsCdekEnabledDto[i];
        }
    }

    static {
        MarketSetDeliverySettingsIsCdekEnabledDto marketSetDeliverySettingsIsCdekEnabledDto = new MarketSetDeliverySettingsIsCdekEnabledDto("TYPE_0", 0, 0);
        TYPE_0 = marketSetDeliverySettingsIsCdekEnabledDto;
        MarketSetDeliverySettingsIsCdekEnabledDto marketSetDeliverySettingsIsCdekEnabledDto2 = new MarketSetDeliverySettingsIsCdekEnabledDto("TYPE_1", 1, 1);
        TYPE_1 = marketSetDeliverySettingsIsCdekEnabledDto2;
        MarketSetDeliverySettingsIsCdekEnabledDto[] marketSetDeliverySettingsIsCdekEnabledDtoArr = {marketSetDeliverySettingsIsCdekEnabledDto, marketSetDeliverySettingsIsCdekEnabledDto2};
        $VALUES = marketSetDeliverySettingsIsCdekEnabledDtoArr;
        $ENTRIES = new asp(marketSetDeliverySettingsIsCdekEnabledDtoArr);
        CREATOR = new a();
    }

    private MarketSetDeliverySettingsIsCdekEnabledDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSetDeliverySettingsIsCdekEnabledDto valueOf(String str) {
        return (MarketSetDeliverySettingsIsCdekEnabledDto) Enum.valueOf(MarketSetDeliverySettingsIsCdekEnabledDto.class, str);
    }

    public static MarketSetDeliverySettingsIsCdekEnabledDto[] values() {
        return (MarketSetDeliverySettingsIsCdekEnabledDto[]) $VALUES.clone();
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
