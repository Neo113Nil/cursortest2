package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSaveIntegrationSettingsIntegrationTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketSaveIntegrationSettingsIntegrationTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSaveIntegrationSettingsIntegrationTypeDto[] $VALUES;
    public static final Parcelable.Creator<MarketSaveIntegrationSettingsIntegrationTypeDto> CREATOR;

    @pmi0("ozon")
    public static final MarketSaveIntegrationSettingsIntegrationTypeDto OZON;
    private final String value;

    /* compiled from: MarketSaveIntegrationSettingsIntegrationTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketSaveIntegrationSettingsIntegrationTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSaveIntegrationSettingsIntegrationTypeDto createFromParcel(Parcel parcel) {
            return MarketSaveIntegrationSettingsIntegrationTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSaveIntegrationSettingsIntegrationTypeDto[] newArray(int i) {
            return new MarketSaveIntegrationSettingsIntegrationTypeDto[i];
        }
    }

    static {
        MarketSaveIntegrationSettingsIntegrationTypeDto marketSaveIntegrationSettingsIntegrationTypeDto = new MarketSaveIntegrationSettingsIntegrationTypeDto("OZON", 0, "ozon");
        OZON = marketSaveIntegrationSettingsIntegrationTypeDto;
        MarketSaveIntegrationSettingsIntegrationTypeDto[] marketSaveIntegrationSettingsIntegrationTypeDtoArr = {marketSaveIntegrationSettingsIntegrationTypeDto};
        $VALUES = marketSaveIntegrationSettingsIntegrationTypeDtoArr;
        $ENTRIES = new asp(marketSaveIntegrationSettingsIntegrationTypeDtoArr);
        CREATOR = new a();
    }

    private MarketSaveIntegrationSettingsIntegrationTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketSaveIntegrationSettingsIntegrationTypeDto valueOf(String str) {
        return (MarketSaveIntegrationSettingsIntegrationTypeDto) Enum.valueOf(MarketSaveIntegrationSettingsIntegrationTypeDto.class, str);
    }

    public static MarketSaveIntegrationSettingsIntegrationTypeDto[] values() {
        return (MarketSaveIntegrationSettingsIntegrationTypeDto[]) $VALUES.clone();
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
