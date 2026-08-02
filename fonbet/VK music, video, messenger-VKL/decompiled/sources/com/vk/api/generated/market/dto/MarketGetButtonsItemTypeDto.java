package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketGetButtonsItemTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetButtonsItemTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketGetButtonsItemTypeDto[] $VALUES;

    @pmi0("card")
    public static final MarketGetButtonsItemTypeDto CARD;
    public static final Parcelable.Creator<MarketGetButtonsItemTypeDto> CREATOR;

    @pmi0("preview")
    public static final MarketGetButtonsItemTypeDto PREVIEW;
    private final String value;

    /* compiled from: MarketGetButtonsItemTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetButtonsItemTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetButtonsItemTypeDto createFromParcel(Parcel parcel) {
            return MarketGetButtonsItemTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetButtonsItemTypeDto[] newArray(int i) {
            return new MarketGetButtonsItemTypeDto[i];
        }
    }

    static {
        MarketGetButtonsItemTypeDto marketGetButtonsItemTypeDto = new MarketGetButtonsItemTypeDto("CARD", 0, "card");
        CARD = marketGetButtonsItemTypeDto;
        MarketGetButtonsItemTypeDto marketGetButtonsItemTypeDto2 = new MarketGetButtonsItemTypeDto("PREVIEW", 1, "preview");
        PREVIEW = marketGetButtonsItemTypeDto2;
        MarketGetButtonsItemTypeDto[] marketGetButtonsItemTypeDtoArr = {marketGetButtonsItemTypeDto, marketGetButtonsItemTypeDto2};
        $VALUES = marketGetButtonsItemTypeDtoArr;
        $ENTRIES = new asp(marketGetButtonsItemTypeDtoArr);
        CREATOR = new a();
    }

    private MarketGetButtonsItemTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketGetButtonsItemTypeDto valueOf(String str) {
        return (MarketGetButtonsItemTypeDto) Enum.valueOf(MarketGetButtonsItemTypeDto.class, str);
    }

    public static MarketGetButtonsItemTypeDto[] values() {
        return (MarketGetButtonsItemTypeDto[]) $VALUES.clone();
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
