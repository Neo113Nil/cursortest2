package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketOrderSettingsDeliveryOptionTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketOrderSettingsDeliveryOptionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketOrderSettingsDeliveryOptionTypeDto[] $VALUES;

    @pmi0("aliexpress_checkout")
    public static final MarketOrderSettingsDeliveryOptionTypeDto ALIEXPRESS_CHECKOUT;

    @pmi0("courier")
    public static final MarketOrderSettingsDeliveryOptionTypeDto COURIER;
    public static final Parcelable.Creator<MarketOrderSettingsDeliveryOptionTypeDto> CREATOR;

    @pmi0(BuildConfig.FLAVOR)
    public static final MarketOrderSettingsDeliveryOptionTypeDto DEFAULT;

    @pmi0("post")
    public static final MarketOrderSettingsDeliveryOptionTypeDto POST;

    @pmi0("self")
    public static final MarketOrderSettingsDeliveryOptionTypeDto SELF;

    @pmi0("service")
    public static final MarketOrderSettingsDeliveryOptionTypeDto SERVICE;
    private final String value;

    /* compiled from: MarketOrderSettingsDeliveryOptionTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketOrderSettingsDeliveryOptionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketOrderSettingsDeliveryOptionTypeDto createFromParcel(Parcel parcel) {
            return MarketOrderSettingsDeliveryOptionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketOrderSettingsDeliveryOptionTypeDto[] newArray(int i) {
            return new MarketOrderSettingsDeliveryOptionTypeDto[i];
        }
    }

    static {
        MarketOrderSettingsDeliveryOptionTypeDto marketOrderSettingsDeliveryOptionTypeDto = new MarketOrderSettingsDeliveryOptionTypeDto("POST", 0, "post");
        POST = marketOrderSettingsDeliveryOptionTypeDto;
        MarketOrderSettingsDeliveryOptionTypeDto marketOrderSettingsDeliveryOptionTypeDto2 = new MarketOrderSettingsDeliveryOptionTypeDto("SERVICE", 1, "service");
        SERVICE = marketOrderSettingsDeliveryOptionTypeDto2;
        MarketOrderSettingsDeliveryOptionTypeDto marketOrderSettingsDeliveryOptionTypeDto3 = new MarketOrderSettingsDeliveryOptionTypeDto("SELF", 2, "self");
        SELF = marketOrderSettingsDeliveryOptionTypeDto3;
        MarketOrderSettingsDeliveryOptionTypeDto marketOrderSettingsDeliveryOptionTypeDto4 = new MarketOrderSettingsDeliveryOptionTypeDto("DEFAULT", 3, BuildConfig.FLAVOR);
        DEFAULT = marketOrderSettingsDeliveryOptionTypeDto4;
        MarketOrderSettingsDeliveryOptionTypeDto marketOrderSettingsDeliveryOptionTypeDto5 = new MarketOrderSettingsDeliveryOptionTypeDto("ALIEXPRESS_CHECKOUT", 4, "aliexpress_checkout");
        ALIEXPRESS_CHECKOUT = marketOrderSettingsDeliveryOptionTypeDto5;
        MarketOrderSettingsDeliveryOptionTypeDto marketOrderSettingsDeliveryOptionTypeDto6 = new MarketOrderSettingsDeliveryOptionTypeDto("COURIER", 5, "courier");
        COURIER = marketOrderSettingsDeliveryOptionTypeDto6;
        MarketOrderSettingsDeliveryOptionTypeDto[] marketOrderSettingsDeliveryOptionTypeDtoArr = {marketOrderSettingsDeliveryOptionTypeDto, marketOrderSettingsDeliveryOptionTypeDto2, marketOrderSettingsDeliveryOptionTypeDto3, marketOrderSettingsDeliveryOptionTypeDto4, marketOrderSettingsDeliveryOptionTypeDto5, marketOrderSettingsDeliveryOptionTypeDto6};
        $VALUES = marketOrderSettingsDeliveryOptionTypeDtoArr;
        $ENTRIES = new asp(marketOrderSettingsDeliveryOptionTypeDtoArr);
        CREATOR = new a();
    }

    private MarketOrderSettingsDeliveryOptionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketOrderSettingsDeliveryOptionTypeDto valueOf(String str) {
        return (MarketOrderSettingsDeliveryOptionTypeDto) Enum.valueOf(MarketOrderSettingsDeliveryOptionTypeDto.class, str);
    }

    public static MarketOrderSettingsDeliveryOptionTypeDto[] values() {
        return (MarketOrderSettingsDeliveryOptionTypeDto[]) $VALUES.clone();
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
