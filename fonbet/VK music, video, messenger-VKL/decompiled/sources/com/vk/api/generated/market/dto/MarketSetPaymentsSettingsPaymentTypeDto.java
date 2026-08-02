package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSetPaymentsSettingsPaymentTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketSetPaymentsSettingsPaymentTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSetPaymentsSettingsPaymentTypeDto[] $VALUES;
    public static final Parcelable.Creator<MarketSetPaymentsSettingsPaymentTypeDto> CREATOR;

    @pmi0("0")
    public static final MarketSetPaymentsSettingsPaymentTypeDto TYPE_0;

    @pmi0("1")
    public static final MarketSetPaymentsSettingsPaymentTypeDto TYPE_1;
    private final int value;

    /* compiled from: MarketSetPaymentsSettingsPaymentTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketSetPaymentsSettingsPaymentTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSetPaymentsSettingsPaymentTypeDto createFromParcel(Parcel parcel) {
            return MarketSetPaymentsSettingsPaymentTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSetPaymentsSettingsPaymentTypeDto[] newArray(int i) {
            return new MarketSetPaymentsSettingsPaymentTypeDto[i];
        }
    }

    static {
        MarketSetPaymentsSettingsPaymentTypeDto marketSetPaymentsSettingsPaymentTypeDto = new MarketSetPaymentsSettingsPaymentTypeDto("TYPE_0", 0, 0);
        TYPE_0 = marketSetPaymentsSettingsPaymentTypeDto;
        MarketSetPaymentsSettingsPaymentTypeDto marketSetPaymentsSettingsPaymentTypeDto2 = new MarketSetPaymentsSettingsPaymentTypeDto("TYPE_1", 1, 1);
        TYPE_1 = marketSetPaymentsSettingsPaymentTypeDto2;
        MarketSetPaymentsSettingsPaymentTypeDto[] marketSetPaymentsSettingsPaymentTypeDtoArr = {marketSetPaymentsSettingsPaymentTypeDto, marketSetPaymentsSettingsPaymentTypeDto2};
        $VALUES = marketSetPaymentsSettingsPaymentTypeDtoArr;
        $ENTRIES = new asp(marketSetPaymentsSettingsPaymentTypeDtoArr);
        CREATOR = new a();
    }

    private MarketSetPaymentsSettingsPaymentTypeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSetPaymentsSettingsPaymentTypeDto valueOf(String str) {
        return (MarketSetPaymentsSettingsPaymentTypeDto) Enum.valueOf(MarketSetPaymentsSettingsPaymentTypeDto.class, str);
    }

    public static MarketSetPaymentsSettingsPaymentTypeDto[] values() {
        return (MarketSetPaymentsSettingsPaymentTypeDto[]) $VALUES.clone();
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
