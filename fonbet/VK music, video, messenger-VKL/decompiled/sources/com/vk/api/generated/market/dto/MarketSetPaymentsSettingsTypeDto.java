package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSetPaymentsSettingsTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketSetPaymentsSettingsTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSetPaymentsSettingsTypeDto[] $VALUES;
    public static final Parcelable.Creator<MarketSetPaymentsSettingsTypeDto> CREATOR;

    @pmi0("legal")
    public static final MarketSetPaymentsSettingsTypeDto LEGAL;

    @pmi0("natural")
    public static final MarketSetPaymentsSettingsTypeDto NATURAL;
    private final String value;

    /* compiled from: MarketSetPaymentsSettingsTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketSetPaymentsSettingsTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSetPaymentsSettingsTypeDto createFromParcel(Parcel parcel) {
            return MarketSetPaymentsSettingsTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSetPaymentsSettingsTypeDto[] newArray(int i) {
            return new MarketSetPaymentsSettingsTypeDto[i];
        }
    }

    static {
        MarketSetPaymentsSettingsTypeDto marketSetPaymentsSettingsTypeDto = new MarketSetPaymentsSettingsTypeDto("LEGAL", 0, "legal");
        LEGAL = marketSetPaymentsSettingsTypeDto;
        MarketSetPaymentsSettingsTypeDto marketSetPaymentsSettingsTypeDto2 = new MarketSetPaymentsSettingsTypeDto("NATURAL", 1, "natural");
        NATURAL = marketSetPaymentsSettingsTypeDto2;
        MarketSetPaymentsSettingsTypeDto[] marketSetPaymentsSettingsTypeDtoArr = {marketSetPaymentsSettingsTypeDto, marketSetPaymentsSettingsTypeDto2};
        $VALUES = marketSetPaymentsSettingsTypeDtoArr;
        $ENTRIES = new asp(marketSetPaymentsSettingsTypeDtoArr);
        CREATOR = new a();
    }

    private MarketSetPaymentsSettingsTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketSetPaymentsSettingsTypeDto valueOf(String str) {
        return (MarketSetPaymentsSettingsTypeDto) Enum.valueOf(MarketSetPaymentsSettingsTypeDto.class, str);
    }

    public static MarketSetPaymentsSettingsTypeDto[] values() {
        return (MarketSetPaymentsSettingsTypeDto[]) $VALUES.clone();
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
