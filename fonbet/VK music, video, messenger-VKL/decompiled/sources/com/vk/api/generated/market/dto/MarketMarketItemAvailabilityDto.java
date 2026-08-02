package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketMarketItemAvailabilityDto.kt */
/* loaded from: classes15.dex */
public final class MarketMarketItemAvailabilityDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketMarketItemAvailabilityDto[] $VALUES;

    @pmi0("0")
    public static final MarketMarketItemAvailabilityDto AVAILABLE;
    public static final Parcelable.Creator<MarketMarketItemAvailabilityDto> CREATOR;

    @pmi0("1")
    public static final MarketMarketItemAvailabilityDto REMOVED;

    @pmi0("2")
    public static final MarketMarketItemAvailabilityDto UNAVAILABLE;
    private final int value;

    /* compiled from: MarketMarketItemAvailabilityDto.kt */
    public static final class a implements Parcelable.Creator<MarketMarketItemAvailabilityDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketMarketItemAvailabilityDto createFromParcel(Parcel parcel) {
            return MarketMarketItemAvailabilityDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketMarketItemAvailabilityDto[] newArray(int i) {
            return new MarketMarketItemAvailabilityDto[i];
        }
    }

    static {
        MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto = new MarketMarketItemAvailabilityDto("AVAILABLE", 0, 0);
        AVAILABLE = marketMarketItemAvailabilityDto;
        MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto2 = new MarketMarketItemAvailabilityDto(SignalingProtocol.HUNGUP_REASON_REMOVED, 1, 1);
        REMOVED = marketMarketItemAvailabilityDto2;
        MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto3 = new MarketMarketItemAvailabilityDto("UNAVAILABLE", 2, 2);
        UNAVAILABLE = marketMarketItemAvailabilityDto3;
        MarketMarketItemAvailabilityDto[] marketMarketItemAvailabilityDtoArr = {marketMarketItemAvailabilityDto, marketMarketItemAvailabilityDto2, marketMarketItemAvailabilityDto3};
        $VALUES = marketMarketItemAvailabilityDtoArr;
        $ENTRIES = new asp(marketMarketItemAvailabilityDtoArr);
        CREATOR = new a();
    }

    private MarketMarketItemAvailabilityDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketMarketItemAvailabilityDto valueOf(String str) {
        return (MarketMarketItemAvailabilityDto) Enum.valueOf(MarketMarketItemAvailabilityDto.class, str);
    }

    public static MarketMarketItemAvailabilityDto[] values() {
        return (MarketMarketItemAvailabilityDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
