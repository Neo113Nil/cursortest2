package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketEditOrderPaymentStatusDto.kt */
/* loaded from: classes15.dex */
public final class MarketEditOrderPaymentStatusDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketEditOrderPaymentStatusDto[] $VALUES;
    public static final Parcelable.Creator<MarketEditOrderPaymentStatusDto> CREATOR;

    @pmi0("not_paid")
    public static final MarketEditOrderPaymentStatusDto NOT_PAID;

    @pmi0("paid")
    public static final MarketEditOrderPaymentStatusDto PAID;

    @pmi0("returned")
    public static final MarketEditOrderPaymentStatusDto RETURNED;
    private final String value;

    /* compiled from: MarketEditOrderPaymentStatusDto.kt */
    public static final class a implements Parcelable.Creator<MarketEditOrderPaymentStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketEditOrderPaymentStatusDto createFromParcel(Parcel parcel) {
            return MarketEditOrderPaymentStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketEditOrderPaymentStatusDto[] newArray(int i) {
            return new MarketEditOrderPaymentStatusDto[i];
        }
    }

    static {
        MarketEditOrderPaymentStatusDto marketEditOrderPaymentStatusDto = new MarketEditOrderPaymentStatusDto("NOT_PAID", 0, "not_paid");
        NOT_PAID = marketEditOrderPaymentStatusDto;
        MarketEditOrderPaymentStatusDto marketEditOrderPaymentStatusDto2 = new MarketEditOrderPaymentStatusDto("PAID", 1, "paid");
        PAID = marketEditOrderPaymentStatusDto2;
        MarketEditOrderPaymentStatusDto marketEditOrderPaymentStatusDto3 = new MarketEditOrderPaymentStatusDto("RETURNED", 2, "returned");
        RETURNED = marketEditOrderPaymentStatusDto3;
        MarketEditOrderPaymentStatusDto[] marketEditOrderPaymentStatusDtoArr = {marketEditOrderPaymentStatusDto, marketEditOrderPaymentStatusDto2, marketEditOrderPaymentStatusDto3};
        $VALUES = marketEditOrderPaymentStatusDtoArr;
        $ENTRIES = new asp(marketEditOrderPaymentStatusDtoArr);
        CREATOR = new a();
    }

    private MarketEditOrderPaymentStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketEditOrderPaymentStatusDto valueOf(String str) {
        return (MarketEditOrderPaymentStatusDto) Enum.valueOf(MarketEditOrderPaymentStatusDto.class, str);
    }

    public static MarketEditOrderPaymentStatusDto[] values() {
        return (MarketEditOrderPaymentStatusDto[]) $VALUES.clone();
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
