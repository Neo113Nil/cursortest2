package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSetDeliverySettingsIsCourierEnabledDto.kt */
/* loaded from: classes15.dex */
public final class MarketSetDeliverySettingsIsCourierEnabledDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSetDeliverySettingsIsCourierEnabledDto[] $VALUES;
    public static final Parcelable.Creator<MarketSetDeliverySettingsIsCourierEnabledDto> CREATOR;

    @pmi0("0")
    public static final MarketSetDeliverySettingsIsCourierEnabledDto TYPE_0;

    @pmi0("1")
    public static final MarketSetDeliverySettingsIsCourierEnabledDto TYPE_1;
    private final int value;

    /* compiled from: MarketSetDeliverySettingsIsCourierEnabledDto.kt */
    public static final class a implements Parcelable.Creator<MarketSetDeliverySettingsIsCourierEnabledDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSetDeliverySettingsIsCourierEnabledDto createFromParcel(Parcel parcel) {
            return MarketSetDeliverySettingsIsCourierEnabledDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSetDeliverySettingsIsCourierEnabledDto[] newArray(int i) {
            return new MarketSetDeliverySettingsIsCourierEnabledDto[i];
        }
    }

    static {
        MarketSetDeliverySettingsIsCourierEnabledDto marketSetDeliverySettingsIsCourierEnabledDto = new MarketSetDeliverySettingsIsCourierEnabledDto("TYPE_0", 0, 0);
        TYPE_0 = marketSetDeliverySettingsIsCourierEnabledDto;
        MarketSetDeliverySettingsIsCourierEnabledDto marketSetDeliverySettingsIsCourierEnabledDto2 = new MarketSetDeliverySettingsIsCourierEnabledDto("TYPE_1", 1, 1);
        TYPE_1 = marketSetDeliverySettingsIsCourierEnabledDto2;
        MarketSetDeliverySettingsIsCourierEnabledDto[] marketSetDeliverySettingsIsCourierEnabledDtoArr = {marketSetDeliverySettingsIsCourierEnabledDto, marketSetDeliverySettingsIsCourierEnabledDto2};
        $VALUES = marketSetDeliverySettingsIsCourierEnabledDtoArr;
        $ENTRIES = new asp(marketSetDeliverySettingsIsCourierEnabledDtoArr);
        CREATOR = new a();
    }

    private MarketSetDeliverySettingsIsCourierEnabledDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSetDeliverySettingsIsCourierEnabledDto valueOf(String str) {
        return (MarketSetDeliverySettingsIsCourierEnabledDto) Enum.valueOf(MarketSetDeliverySettingsIsCourierEnabledDto.class, str);
    }

    public static MarketSetDeliverySettingsIsCourierEnabledDto[] values() {
        return (MarketSetDeliverySettingsIsCourierEnabledDto[]) $VALUES.clone();
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
