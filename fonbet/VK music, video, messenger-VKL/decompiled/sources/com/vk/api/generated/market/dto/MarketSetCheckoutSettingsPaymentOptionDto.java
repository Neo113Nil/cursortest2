package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSetCheckoutSettingsPaymentOptionDto.kt */
/* loaded from: classes15.dex */
public final class MarketSetCheckoutSettingsPaymentOptionDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSetCheckoutSettingsPaymentOptionDto[] $VALUES;
    public static final Parcelable.Creator<MarketSetCheckoutSettingsPaymentOptionDto> CREATOR;

    @pmi0("in_chat")
    public static final MarketSetCheckoutSettingsPaymentOptionDto IN_CHAT;

    @pmi0("now")
    public static final MarketSetCheckoutSettingsPaymentOptionDto NOW;
    private final String value;

    /* compiled from: MarketSetCheckoutSettingsPaymentOptionDto.kt */
    public static final class a implements Parcelable.Creator<MarketSetCheckoutSettingsPaymentOptionDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSetCheckoutSettingsPaymentOptionDto createFromParcel(Parcel parcel) {
            return MarketSetCheckoutSettingsPaymentOptionDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSetCheckoutSettingsPaymentOptionDto[] newArray(int i) {
            return new MarketSetCheckoutSettingsPaymentOptionDto[i];
        }
    }

    static {
        MarketSetCheckoutSettingsPaymentOptionDto marketSetCheckoutSettingsPaymentOptionDto = new MarketSetCheckoutSettingsPaymentOptionDto("IN_CHAT", 0, "in_chat");
        IN_CHAT = marketSetCheckoutSettingsPaymentOptionDto;
        MarketSetCheckoutSettingsPaymentOptionDto marketSetCheckoutSettingsPaymentOptionDto2 = new MarketSetCheckoutSettingsPaymentOptionDto("NOW", 1, "now");
        NOW = marketSetCheckoutSettingsPaymentOptionDto2;
        MarketSetCheckoutSettingsPaymentOptionDto[] marketSetCheckoutSettingsPaymentOptionDtoArr = {marketSetCheckoutSettingsPaymentOptionDto, marketSetCheckoutSettingsPaymentOptionDto2};
        $VALUES = marketSetCheckoutSettingsPaymentOptionDtoArr;
        $ENTRIES = new asp(marketSetCheckoutSettingsPaymentOptionDtoArr);
        CREATOR = new a();
    }

    private MarketSetCheckoutSettingsPaymentOptionDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<MarketSetCheckoutSettingsPaymentOptionDto> i() {
        return $ENTRIES;
    }

    public static MarketSetCheckoutSettingsPaymentOptionDto valueOf(String str) {
        return (MarketSetCheckoutSettingsPaymentOptionDto) Enum.valueOf(MarketSetCheckoutSettingsPaymentOptionDto.class, str);
    }

    public static MarketSetCheckoutSettingsPaymentOptionDto[] values() {
        return (MarketSetCheckoutSettingsPaymentOptionDto[]) $VALUES.clone();
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
