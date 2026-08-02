package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSetDeliverySettingsIsInternationalPostEnabledDto.kt */
/* loaded from: classes15.dex */
public final class MarketSetDeliverySettingsIsInternationalPostEnabledDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSetDeliverySettingsIsInternationalPostEnabledDto[] $VALUES;
    public static final Parcelable.Creator<MarketSetDeliverySettingsIsInternationalPostEnabledDto> CREATOR;

    @pmi0("0")
    public static final MarketSetDeliverySettingsIsInternationalPostEnabledDto TYPE_0;

    @pmi0("1")
    public static final MarketSetDeliverySettingsIsInternationalPostEnabledDto TYPE_1;
    private final int value;

    /* compiled from: MarketSetDeliverySettingsIsInternationalPostEnabledDto.kt */
    public static final class a implements Parcelable.Creator<MarketSetDeliverySettingsIsInternationalPostEnabledDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSetDeliverySettingsIsInternationalPostEnabledDto createFromParcel(Parcel parcel) {
            return MarketSetDeliverySettingsIsInternationalPostEnabledDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSetDeliverySettingsIsInternationalPostEnabledDto[] newArray(int i) {
            return new MarketSetDeliverySettingsIsInternationalPostEnabledDto[i];
        }
    }

    static {
        MarketSetDeliverySettingsIsInternationalPostEnabledDto marketSetDeliverySettingsIsInternationalPostEnabledDto = new MarketSetDeliverySettingsIsInternationalPostEnabledDto("TYPE_0", 0, 0);
        TYPE_0 = marketSetDeliverySettingsIsInternationalPostEnabledDto;
        MarketSetDeliverySettingsIsInternationalPostEnabledDto marketSetDeliverySettingsIsInternationalPostEnabledDto2 = new MarketSetDeliverySettingsIsInternationalPostEnabledDto("TYPE_1", 1, 1);
        TYPE_1 = marketSetDeliverySettingsIsInternationalPostEnabledDto2;
        MarketSetDeliverySettingsIsInternationalPostEnabledDto[] marketSetDeliverySettingsIsInternationalPostEnabledDtoArr = {marketSetDeliverySettingsIsInternationalPostEnabledDto, marketSetDeliverySettingsIsInternationalPostEnabledDto2};
        $VALUES = marketSetDeliverySettingsIsInternationalPostEnabledDtoArr;
        $ENTRIES = new asp(marketSetDeliverySettingsIsInternationalPostEnabledDtoArr);
        CREATOR = new a();
    }

    private MarketSetDeliverySettingsIsInternationalPostEnabledDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSetDeliverySettingsIsInternationalPostEnabledDto valueOf(String str) {
        return (MarketSetDeliverySettingsIsInternationalPostEnabledDto) Enum.valueOf(MarketSetDeliverySettingsIsInternationalPostEnabledDto.class, str);
    }

    public static MarketSetDeliverySettingsIsInternationalPostEnabledDto[] values() {
        return (MarketSetDeliverySettingsIsInternationalPostEnabledDto[]) $VALUES.clone();
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
