package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketGetIntegrationSettingsIntegrationTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetIntegrationSettingsIntegrationTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketGetIntegrationSettingsIntegrationTypeDto[] $VALUES;
    public static final Parcelable.Creator<MarketGetIntegrationSettingsIntegrationTypeDto> CREATOR;

    @pmi0("ozon")
    public static final MarketGetIntegrationSettingsIntegrationTypeDto OZON;
    private final String value;

    /* compiled from: MarketGetIntegrationSettingsIntegrationTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetIntegrationSettingsIntegrationTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetIntegrationSettingsIntegrationTypeDto createFromParcel(Parcel parcel) {
            return MarketGetIntegrationSettingsIntegrationTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetIntegrationSettingsIntegrationTypeDto[] newArray(int i) {
            return new MarketGetIntegrationSettingsIntegrationTypeDto[i];
        }
    }

    static {
        MarketGetIntegrationSettingsIntegrationTypeDto marketGetIntegrationSettingsIntegrationTypeDto = new MarketGetIntegrationSettingsIntegrationTypeDto("OZON", 0, "ozon");
        OZON = marketGetIntegrationSettingsIntegrationTypeDto;
        MarketGetIntegrationSettingsIntegrationTypeDto[] marketGetIntegrationSettingsIntegrationTypeDtoArr = {marketGetIntegrationSettingsIntegrationTypeDto};
        $VALUES = marketGetIntegrationSettingsIntegrationTypeDtoArr;
        $ENTRIES = new asp(marketGetIntegrationSettingsIntegrationTypeDtoArr);
        CREATOR = new a();
    }

    private MarketGetIntegrationSettingsIntegrationTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketGetIntegrationSettingsIntegrationTypeDto valueOf(String str) {
        return (MarketGetIntegrationSettingsIntegrationTypeDto) Enum.valueOf(MarketGetIntegrationSettingsIntegrationTypeDto.class, str);
    }

    public static MarketGetIntegrationSettingsIntegrationTypeDto[] values() {
        return (MarketGetIntegrationSettingsIntegrationTypeDto[]) $VALUES.clone();
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
