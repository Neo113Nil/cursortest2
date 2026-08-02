package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketBadgeTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketBadgeTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketBadgeTypeDto[] $VALUES;

    @pmi0("1")
    public static final MarketBadgeTypeDto CASHBACK;
    public static final Parcelable.Creator<MarketBadgeTypeDto> CREATOR;

    @pmi0("0")
    public static final MarketBadgeTypeDto DEFAULT;

    @pmi0("3")
    public static final MarketBadgeTypeDto INTEGRATION;

    @pmi0("2")
    public static final MarketBadgeTypeDto OZON;
    private final int value;

    /* compiled from: MarketBadgeTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketBadgeTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketBadgeTypeDto createFromParcel(Parcel parcel) {
            return MarketBadgeTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketBadgeTypeDto[] newArray(int i) {
            return new MarketBadgeTypeDto[i];
        }
    }

    static {
        MarketBadgeTypeDto marketBadgeTypeDto = new MarketBadgeTypeDto("DEFAULT", 0, 0);
        DEFAULT = marketBadgeTypeDto;
        MarketBadgeTypeDto marketBadgeTypeDto2 = new MarketBadgeTypeDto("CASHBACK", 1, 1);
        CASHBACK = marketBadgeTypeDto2;
        MarketBadgeTypeDto marketBadgeTypeDto3 = new MarketBadgeTypeDto("OZON", 2, 2);
        OZON = marketBadgeTypeDto3;
        MarketBadgeTypeDto marketBadgeTypeDto4 = new MarketBadgeTypeDto("INTEGRATION", 3, 3);
        INTEGRATION = marketBadgeTypeDto4;
        MarketBadgeTypeDto[] marketBadgeTypeDtoArr = {marketBadgeTypeDto, marketBadgeTypeDto2, marketBadgeTypeDto3, marketBadgeTypeDto4};
        $VALUES = marketBadgeTypeDtoArr;
        $ENTRIES = new asp(marketBadgeTypeDtoArr);
        CREATOR = new a();
    }

    private MarketBadgeTypeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketBadgeTypeDto valueOf(String str) {
        return (MarketBadgeTypeDto) Enum.valueOf(MarketBadgeTypeDto.class, str);
    }

    public static MarketBadgeTypeDto[] values() {
        return (MarketBadgeTypeDto[]) $VALUES.clone();
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
