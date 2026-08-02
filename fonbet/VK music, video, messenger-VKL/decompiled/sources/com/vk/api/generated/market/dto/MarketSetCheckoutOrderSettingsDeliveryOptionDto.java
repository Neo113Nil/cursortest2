package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSetCheckoutOrderSettingsDeliveryOptionDto.kt */
/* loaded from: classes15.dex */
public final class MarketSetCheckoutOrderSettingsDeliveryOptionDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSetCheckoutOrderSettingsDeliveryOptionDto[] $VALUES;

    @pmi0("courier")
    public static final MarketSetCheckoutOrderSettingsDeliveryOptionDto COURIER;
    public static final Parcelable.Creator<MarketSetCheckoutOrderSettingsDeliveryOptionDto> CREATOR;

    @pmi0(BuildConfig.FLAVOR)
    public static final MarketSetCheckoutOrderSettingsDeliveryOptionDto DEFAULT;

    @pmi0("post")
    public static final MarketSetCheckoutOrderSettingsDeliveryOptionDto POST;

    @pmi0("self")
    public static final MarketSetCheckoutOrderSettingsDeliveryOptionDto SELF;

    @pmi0("service")
    public static final MarketSetCheckoutOrderSettingsDeliveryOptionDto SERVICE;
    private final String value;

    /* compiled from: MarketSetCheckoutOrderSettingsDeliveryOptionDto.kt */
    public static final class a implements Parcelable.Creator<MarketSetCheckoutOrderSettingsDeliveryOptionDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSetCheckoutOrderSettingsDeliveryOptionDto createFromParcel(Parcel parcel) {
            return MarketSetCheckoutOrderSettingsDeliveryOptionDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSetCheckoutOrderSettingsDeliveryOptionDto[] newArray(int i) {
            return new MarketSetCheckoutOrderSettingsDeliveryOptionDto[i];
        }
    }

    static {
        MarketSetCheckoutOrderSettingsDeliveryOptionDto marketSetCheckoutOrderSettingsDeliveryOptionDto = new MarketSetCheckoutOrderSettingsDeliveryOptionDto("COURIER", 0, "courier");
        COURIER = marketSetCheckoutOrderSettingsDeliveryOptionDto;
        MarketSetCheckoutOrderSettingsDeliveryOptionDto marketSetCheckoutOrderSettingsDeliveryOptionDto2 = new MarketSetCheckoutOrderSettingsDeliveryOptionDto("DEFAULT", 1, BuildConfig.FLAVOR);
        DEFAULT = marketSetCheckoutOrderSettingsDeliveryOptionDto2;
        MarketSetCheckoutOrderSettingsDeliveryOptionDto marketSetCheckoutOrderSettingsDeliveryOptionDto3 = new MarketSetCheckoutOrderSettingsDeliveryOptionDto("POST", 2, "post");
        POST = marketSetCheckoutOrderSettingsDeliveryOptionDto3;
        MarketSetCheckoutOrderSettingsDeliveryOptionDto marketSetCheckoutOrderSettingsDeliveryOptionDto4 = new MarketSetCheckoutOrderSettingsDeliveryOptionDto("SELF", 3, "self");
        SELF = marketSetCheckoutOrderSettingsDeliveryOptionDto4;
        MarketSetCheckoutOrderSettingsDeliveryOptionDto marketSetCheckoutOrderSettingsDeliveryOptionDto5 = new MarketSetCheckoutOrderSettingsDeliveryOptionDto("SERVICE", 4, "service");
        SERVICE = marketSetCheckoutOrderSettingsDeliveryOptionDto5;
        MarketSetCheckoutOrderSettingsDeliveryOptionDto[] marketSetCheckoutOrderSettingsDeliveryOptionDtoArr = {marketSetCheckoutOrderSettingsDeliveryOptionDto, marketSetCheckoutOrderSettingsDeliveryOptionDto2, marketSetCheckoutOrderSettingsDeliveryOptionDto3, marketSetCheckoutOrderSettingsDeliveryOptionDto4, marketSetCheckoutOrderSettingsDeliveryOptionDto5};
        $VALUES = marketSetCheckoutOrderSettingsDeliveryOptionDtoArr;
        $ENTRIES = new asp(marketSetCheckoutOrderSettingsDeliveryOptionDtoArr);
        CREATOR = new a();
    }

    private MarketSetCheckoutOrderSettingsDeliveryOptionDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketSetCheckoutOrderSettingsDeliveryOptionDto valueOf(String str) {
        return (MarketSetCheckoutOrderSettingsDeliveryOptionDto) Enum.valueOf(MarketSetCheckoutOrderSettingsDeliveryOptionDto.class, str);
    }

    public static MarketSetCheckoutOrderSettingsDeliveryOptionDto[] values() {
        return (MarketSetCheckoutOrderSettingsDeliveryOptionDto[]) $VALUES.clone();
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
