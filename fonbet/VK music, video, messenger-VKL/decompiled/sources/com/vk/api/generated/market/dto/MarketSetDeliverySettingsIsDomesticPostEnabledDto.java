package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSetDeliverySettingsIsDomesticPostEnabledDto.kt */
/* loaded from: classes15.dex */
public final class MarketSetDeliverySettingsIsDomesticPostEnabledDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSetDeliverySettingsIsDomesticPostEnabledDto[] $VALUES;
    public static final Parcelable.Creator<MarketSetDeliverySettingsIsDomesticPostEnabledDto> CREATOR;

    @pmi0("0")
    public static final MarketSetDeliverySettingsIsDomesticPostEnabledDto TYPE_0;

    @pmi0("1")
    public static final MarketSetDeliverySettingsIsDomesticPostEnabledDto TYPE_1;
    private final int value;

    /* compiled from: MarketSetDeliverySettingsIsDomesticPostEnabledDto.kt */
    public static final class a implements Parcelable.Creator<MarketSetDeliverySettingsIsDomesticPostEnabledDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSetDeliverySettingsIsDomesticPostEnabledDto createFromParcel(Parcel parcel) {
            return MarketSetDeliverySettingsIsDomesticPostEnabledDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSetDeliverySettingsIsDomesticPostEnabledDto[] newArray(int i) {
            return new MarketSetDeliverySettingsIsDomesticPostEnabledDto[i];
        }
    }

    static {
        MarketSetDeliverySettingsIsDomesticPostEnabledDto marketSetDeliverySettingsIsDomesticPostEnabledDto = new MarketSetDeliverySettingsIsDomesticPostEnabledDto("TYPE_0", 0, 0);
        TYPE_0 = marketSetDeliverySettingsIsDomesticPostEnabledDto;
        MarketSetDeliverySettingsIsDomesticPostEnabledDto marketSetDeliverySettingsIsDomesticPostEnabledDto2 = new MarketSetDeliverySettingsIsDomesticPostEnabledDto("TYPE_1", 1, 1);
        TYPE_1 = marketSetDeliverySettingsIsDomesticPostEnabledDto2;
        MarketSetDeliverySettingsIsDomesticPostEnabledDto[] marketSetDeliverySettingsIsDomesticPostEnabledDtoArr = {marketSetDeliverySettingsIsDomesticPostEnabledDto, marketSetDeliverySettingsIsDomesticPostEnabledDto2};
        $VALUES = marketSetDeliverySettingsIsDomesticPostEnabledDtoArr;
        $ENTRIES = new asp(marketSetDeliverySettingsIsDomesticPostEnabledDtoArr);
        CREATOR = new a();
    }

    private MarketSetDeliverySettingsIsDomesticPostEnabledDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSetDeliverySettingsIsDomesticPostEnabledDto valueOf(String str) {
        return (MarketSetDeliverySettingsIsDomesticPostEnabledDto) Enum.valueOf(MarketSetDeliverySettingsIsDomesticPostEnabledDto.class, str);
    }

    public static MarketSetDeliverySettingsIsDomesticPostEnabledDto[] values() {
        return (MarketSetDeliverySettingsIsDomesticPostEnabledDto[]) $VALUES.clone();
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
