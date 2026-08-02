package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketGetItemCardItemTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetItemCardItemTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketGetItemCardItemTypeDto[] $VALUES;

    @pmi0("card")
    public static final MarketGetItemCardItemTypeDto CARD;
    public static final Parcelable.Creator<MarketGetItemCardItemTypeDto> CREATOR;

    @pmi0("preview")
    public static final MarketGetItemCardItemTypeDto PREVIEW;
    private final String value;

    /* compiled from: MarketGetItemCardItemTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetItemCardItemTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetItemCardItemTypeDto createFromParcel(Parcel parcel) {
            return MarketGetItemCardItemTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetItemCardItemTypeDto[] newArray(int i) {
            return new MarketGetItemCardItemTypeDto[i];
        }
    }

    static {
        MarketGetItemCardItemTypeDto marketGetItemCardItemTypeDto = new MarketGetItemCardItemTypeDto("CARD", 0, "card");
        CARD = marketGetItemCardItemTypeDto;
        MarketGetItemCardItemTypeDto marketGetItemCardItemTypeDto2 = new MarketGetItemCardItemTypeDto("PREVIEW", 1, "preview");
        PREVIEW = marketGetItemCardItemTypeDto2;
        MarketGetItemCardItemTypeDto[] marketGetItemCardItemTypeDtoArr = {marketGetItemCardItemTypeDto, marketGetItemCardItemTypeDto2};
        $VALUES = marketGetItemCardItemTypeDtoArr;
        $ENTRIES = new asp(marketGetItemCardItemTypeDtoArr);
        CREATOR = new a();
    }

    private MarketGetItemCardItemTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketGetItemCardItemTypeDto valueOf(String str) {
        return (MarketGetItemCardItemTypeDto) Enum.valueOf(MarketGetItemCardItemTypeDto.class, str);
    }

    public static MarketGetItemCardItemTypeDto[] values() {
        return (MarketGetItemCardItemTypeDto[]) $VALUES.clone();
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
