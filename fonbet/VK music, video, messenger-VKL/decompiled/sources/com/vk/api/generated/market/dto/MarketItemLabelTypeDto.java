package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketItemLabelTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemLabelTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketItemLabelTypeDto[] $VALUES;
    public static final Parcelable.Creator<MarketItemLabelTypeDto> CREATOR;

    @pmi0("1")
    public static final MarketItemLabelTypeDto OZON;

    @pmi0("0")
    public static final MarketItemLabelTypeDto VK;
    private final int value;

    /* compiled from: MarketItemLabelTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemLabelTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemLabelTypeDto createFromParcel(Parcel parcel) {
            return MarketItemLabelTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemLabelTypeDto[] newArray(int i) {
            return new MarketItemLabelTypeDto[i];
        }
    }

    static {
        MarketItemLabelTypeDto marketItemLabelTypeDto = new MarketItemLabelTypeDto("VK", 0, 0);
        VK = marketItemLabelTypeDto;
        MarketItemLabelTypeDto marketItemLabelTypeDto2 = new MarketItemLabelTypeDto("OZON", 1, 1);
        OZON = marketItemLabelTypeDto2;
        MarketItemLabelTypeDto[] marketItemLabelTypeDtoArr = {marketItemLabelTypeDto, marketItemLabelTypeDto2};
        $VALUES = marketItemLabelTypeDtoArr;
        $ENTRIES = new asp(marketItemLabelTypeDtoArr);
        CREATOR = new a();
    }

    private MarketItemLabelTypeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketItemLabelTypeDto valueOf(String str) {
        return (MarketItemLabelTypeDto) Enum.valueOf(MarketItemLabelTypeDto.class, str);
    }

    public static MarketItemLabelTypeDto[] values() {
        return (MarketItemLabelTypeDto[]) $VALUES.clone();
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
