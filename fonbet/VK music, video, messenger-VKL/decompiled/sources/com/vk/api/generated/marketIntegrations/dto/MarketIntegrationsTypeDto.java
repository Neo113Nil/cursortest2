package com.vk.api.generated.marketIntegrations.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketIntegrationsTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketIntegrationsTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketIntegrationsTypeDto[] $VALUES;
    public static final Parcelable.Creator<MarketIntegrationsTypeDto> CREATOR;

    @pmi0("general")
    public static final MarketIntegrationsTypeDto GENERAL;

    @pmi0("none")
    public static final MarketIntegrationsTypeDto NONE;

    @pmi0("ozon")
    public static final MarketIntegrationsTypeDto OZON;
    private final String value;

    /* compiled from: MarketIntegrationsTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketIntegrationsTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketIntegrationsTypeDto createFromParcel(Parcel parcel) {
            return MarketIntegrationsTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketIntegrationsTypeDto[] newArray(int i) {
            return new MarketIntegrationsTypeDto[i];
        }
    }

    static {
        MarketIntegrationsTypeDto marketIntegrationsTypeDto = new MarketIntegrationsTypeDto("NONE", 0, "none");
        NONE = marketIntegrationsTypeDto;
        MarketIntegrationsTypeDto marketIntegrationsTypeDto2 = new MarketIntegrationsTypeDto("OZON", 1, "ozon");
        OZON = marketIntegrationsTypeDto2;
        MarketIntegrationsTypeDto marketIntegrationsTypeDto3 = new MarketIntegrationsTypeDto("GENERAL", 2, "general");
        GENERAL = marketIntegrationsTypeDto3;
        MarketIntegrationsTypeDto[] marketIntegrationsTypeDtoArr = {marketIntegrationsTypeDto, marketIntegrationsTypeDto2, marketIntegrationsTypeDto3};
        $VALUES = marketIntegrationsTypeDtoArr;
        $ENTRIES = new asp(marketIntegrationsTypeDtoArr);
        CREATOR = new a();
    }

    private MarketIntegrationsTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketIntegrationsTypeDto valueOf(String str) {
        return (MarketIntegrationsTypeDto) Enum.valueOf(MarketIntegrationsTypeDto.class, str);
    }

    public static MarketIntegrationsTypeDto[] values() {
        return (MarketIntegrationsTypeDto[]) $VALUES.clone();
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
