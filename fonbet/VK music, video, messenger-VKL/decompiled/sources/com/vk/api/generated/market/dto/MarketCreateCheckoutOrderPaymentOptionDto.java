package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketCreateCheckoutOrderPaymentOptionDto.kt */
/* loaded from: classes15.dex */
public final class MarketCreateCheckoutOrderPaymentOptionDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketCreateCheckoutOrderPaymentOptionDto[] $VALUES;
    public static final Parcelable.Creator<MarketCreateCheckoutOrderPaymentOptionDto> CREATOR;

    @pmi0("in_chat")
    public static final MarketCreateCheckoutOrderPaymentOptionDto IN_CHAT;

    @pmi0("now")
    public static final MarketCreateCheckoutOrderPaymentOptionDto NOW;
    private final String value;

    /* compiled from: MarketCreateCheckoutOrderPaymentOptionDto.kt */
    public static final class a implements Parcelable.Creator<MarketCreateCheckoutOrderPaymentOptionDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCreateCheckoutOrderPaymentOptionDto createFromParcel(Parcel parcel) {
            return MarketCreateCheckoutOrderPaymentOptionDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCreateCheckoutOrderPaymentOptionDto[] newArray(int i) {
            return new MarketCreateCheckoutOrderPaymentOptionDto[i];
        }
    }

    static {
        MarketCreateCheckoutOrderPaymentOptionDto marketCreateCheckoutOrderPaymentOptionDto = new MarketCreateCheckoutOrderPaymentOptionDto("IN_CHAT", 0, "in_chat");
        IN_CHAT = marketCreateCheckoutOrderPaymentOptionDto;
        MarketCreateCheckoutOrderPaymentOptionDto marketCreateCheckoutOrderPaymentOptionDto2 = new MarketCreateCheckoutOrderPaymentOptionDto("NOW", 1, "now");
        NOW = marketCreateCheckoutOrderPaymentOptionDto2;
        MarketCreateCheckoutOrderPaymentOptionDto[] marketCreateCheckoutOrderPaymentOptionDtoArr = {marketCreateCheckoutOrderPaymentOptionDto, marketCreateCheckoutOrderPaymentOptionDto2};
        $VALUES = marketCreateCheckoutOrderPaymentOptionDtoArr;
        $ENTRIES = new asp(marketCreateCheckoutOrderPaymentOptionDtoArr);
        CREATOR = new a();
    }

    private MarketCreateCheckoutOrderPaymentOptionDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketCreateCheckoutOrderPaymentOptionDto valueOf(String str) {
        return (MarketCreateCheckoutOrderPaymentOptionDto) Enum.valueOf(MarketCreateCheckoutOrderPaymentOptionDto.class, str);
    }

    public static MarketCreateCheckoutOrderPaymentOptionDto[] values() {
        return (MarketCreateCheckoutOrderPaymentOptionDto[]) $VALUES.clone();
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
