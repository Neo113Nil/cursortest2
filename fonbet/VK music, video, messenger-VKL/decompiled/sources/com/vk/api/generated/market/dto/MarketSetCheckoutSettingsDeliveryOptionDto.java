package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSetCheckoutSettingsDeliveryOptionDto.kt */
/* loaded from: classes15.dex */
public final class MarketSetCheckoutSettingsDeliveryOptionDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSetCheckoutSettingsDeliveryOptionDto[] $VALUES;

    @pmi0("courier")
    public static final MarketSetCheckoutSettingsDeliveryOptionDto COURIER;
    public static final Parcelable.Creator<MarketSetCheckoutSettingsDeliveryOptionDto> CREATOR;

    @pmi0(BuildConfig.FLAVOR)
    public static final MarketSetCheckoutSettingsDeliveryOptionDto DEFAULT;

    @pmi0("self")
    public static final MarketSetCheckoutSettingsDeliveryOptionDto SELF;
    private final String value;

    /* compiled from: MarketSetCheckoutSettingsDeliveryOptionDto.kt */
    public static final class a implements Parcelable.Creator<MarketSetCheckoutSettingsDeliveryOptionDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSetCheckoutSettingsDeliveryOptionDto createFromParcel(Parcel parcel) {
            return MarketSetCheckoutSettingsDeliveryOptionDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSetCheckoutSettingsDeliveryOptionDto[] newArray(int i) {
            return new MarketSetCheckoutSettingsDeliveryOptionDto[i];
        }
    }

    static {
        MarketSetCheckoutSettingsDeliveryOptionDto marketSetCheckoutSettingsDeliveryOptionDto = new MarketSetCheckoutSettingsDeliveryOptionDto("COURIER", 0, "courier");
        COURIER = marketSetCheckoutSettingsDeliveryOptionDto;
        MarketSetCheckoutSettingsDeliveryOptionDto marketSetCheckoutSettingsDeliveryOptionDto2 = new MarketSetCheckoutSettingsDeliveryOptionDto("DEFAULT", 1, BuildConfig.FLAVOR);
        DEFAULT = marketSetCheckoutSettingsDeliveryOptionDto2;
        MarketSetCheckoutSettingsDeliveryOptionDto marketSetCheckoutSettingsDeliveryOptionDto3 = new MarketSetCheckoutSettingsDeliveryOptionDto("SELF", 2, "self");
        SELF = marketSetCheckoutSettingsDeliveryOptionDto3;
        MarketSetCheckoutSettingsDeliveryOptionDto[] marketSetCheckoutSettingsDeliveryOptionDtoArr = {marketSetCheckoutSettingsDeliveryOptionDto, marketSetCheckoutSettingsDeliveryOptionDto2, marketSetCheckoutSettingsDeliveryOptionDto3};
        $VALUES = marketSetCheckoutSettingsDeliveryOptionDtoArr;
        $ENTRIES = new asp(marketSetCheckoutSettingsDeliveryOptionDtoArr);
        CREATOR = new a();
    }

    private MarketSetCheckoutSettingsDeliveryOptionDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<MarketSetCheckoutSettingsDeliveryOptionDto> i() {
        return $ENTRIES;
    }

    public static MarketSetCheckoutSettingsDeliveryOptionDto valueOf(String str) {
        return (MarketSetCheckoutSettingsDeliveryOptionDto) Enum.valueOf(MarketSetCheckoutSettingsDeliveryOptionDto.class, str);
    }

    public static MarketSetCheckoutSettingsDeliveryOptionDto[] values() {
        return (MarketSetCheckoutSettingsDeliveryOptionDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String j() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
