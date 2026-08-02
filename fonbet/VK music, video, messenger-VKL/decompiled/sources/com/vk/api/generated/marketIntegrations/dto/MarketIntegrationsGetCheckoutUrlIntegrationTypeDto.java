package com.vk.api.generated.marketIntegrations.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketIntegrationsGetCheckoutUrlIntegrationTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketIntegrationsGetCheckoutUrlIntegrationTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketIntegrationsGetCheckoutUrlIntegrationTypeDto[] $VALUES;
    public static final Parcelable.Creator<MarketIntegrationsGetCheckoutUrlIntegrationTypeDto> CREATOR;

    @pmi0("ozon")
    public static final MarketIntegrationsGetCheckoutUrlIntegrationTypeDto OZON;
    private final String value;

    /* compiled from: MarketIntegrationsGetCheckoutUrlIntegrationTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketIntegrationsGetCheckoutUrlIntegrationTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketIntegrationsGetCheckoutUrlIntegrationTypeDto createFromParcel(Parcel parcel) {
            return MarketIntegrationsGetCheckoutUrlIntegrationTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketIntegrationsGetCheckoutUrlIntegrationTypeDto[] newArray(int i) {
            return new MarketIntegrationsGetCheckoutUrlIntegrationTypeDto[i];
        }
    }

    static {
        MarketIntegrationsGetCheckoutUrlIntegrationTypeDto marketIntegrationsGetCheckoutUrlIntegrationTypeDto = new MarketIntegrationsGetCheckoutUrlIntegrationTypeDto("OZON", 0, "ozon");
        OZON = marketIntegrationsGetCheckoutUrlIntegrationTypeDto;
        MarketIntegrationsGetCheckoutUrlIntegrationTypeDto[] marketIntegrationsGetCheckoutUrlIntegrationTypeDtoArr = {marketIntegrationsGetCheckoutUrlIntegrationTypeDto};
        $VALUES = marketIntegrationsGetCheckoutUrlIntegrationTypeDtoArr;
        $ENTRIES = new asp(marketIntegrationsGetCheckoutUrlIntegrationTypeDtoArr);
        CREATOR = new a();
    }

    private MarketIntegrationsGetCheckoutUrlIntegrationTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketIntegrationsGetCheckoutUrlIntegrationTypeDto valueOf(String str) {
        return (MarketIntegrationsGetCheckoutUrlIntegrationTypeDto) Enum.valueOf(MarketIntegrationsGetCheckoutUrlIntegrationTypeDto.class, str);
    }

    public static MarketIntegrationsGetCheckoutUrlIntegrationTypeDto[] values() {
        return (MarketIntegrationsGetCheckoutUrlIntegrationTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
