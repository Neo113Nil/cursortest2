package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketGetEditUrlTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetEditUrlTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketGetEditUrlTypeDto[] $VALUES;
    public static final Parcelable.Creator<MarketGetEditUrlTypeDto> CREATOR;

    @pmi0("market")
    public static final MarketGetEditUrlTypeDto MARKET;

    @pmi0("market_services")
    public static final MarketGetEditUrlTypeDto MARKET_SERVICES;
    private final String value;

    /* compiled from: MarketGetEditUrlTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetEditUrlTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetEditUrlTypeDto createFromParcel(Parcel parcel) {
            return MarketGetEditUrlTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetEditUrlTypeDto[] newArray(int i) {
            return new MarketGetEditUrlTypeDto[i];
        }
    }

    static {
        MarketGetEditUrlTypeDto marketGetEditUrlTypeDto = new MarketGetEditUrlTypeDto("MARKET", 0, "market");
        MARKET = marketGetEditUrlTypeDto;
        MarketGetEditUrlTypeDto marketGetEditUrlTypeDto2 = new MarketGetEditUrlTypeDto("MARKET_SERVICES", 1, "market_services");
        MARKET_SERVICES = marketGetEditUrlTypeDto2;
        MarketGetEditUrlTypeDto[] marketGetEditUrlTypeDtoArr = {marketGetEditUrlTypeDto, marketGetEditUrlTypeDto2};
        $VALUES = marketGetEditUrlTypeDtoArr;
        $ENTRIES = new asp(marketGetEditUrlTypeDtoArr);
        CREATOR = new a();
    }

    private MarketGetEditUrlTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketGetEditUrlTypeDto valueOf(String str) {
        return (MarketGetEditUrlTypeDto) Enum.valueOf(MarketGetEditUrlTypeDto.class, str);
    }

    public static MarketGetEditUrlTypeDto[] values() {
        return (MarketGetEditUrlTypeDto[]) $VALUES.clone();
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
