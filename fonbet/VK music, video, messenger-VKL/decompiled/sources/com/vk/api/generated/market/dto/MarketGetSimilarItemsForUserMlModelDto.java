package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketGetSimilarItemsForUserMlModelDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetSimilarItemsForUserMlModelDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketGetSimilarItemsForUserMlModelDto[] $VALUES;

    @pmi0("click")
    public static final MarketGetSimilarItemsForUserMlModelDto CLICK;
    public static final Parcelable.Creator<MarketGetSimilarItemsForUserMlModelDto> CREATOR;
    private final String value;

    /* compiled from: MarketGetSimilarItemsForUserMlModelDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetSimilarItemsForUserMlModelDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetSimilarItemsForUserMlModelDto createFromParcel(Parcel parcel) {
            return MarketGetSimilarItemsForUserMlModelDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetSimilarItemsForUserMlModelDto[] newArray(int i) {
            return new MarketGetSimilarItemsForUserMlModelDto[i];
        }
    }

    static {
        MarketGetSimilarItemsForUserMlModelDto marketGetSimilarItemsForUserMlModelDto = new MarketGetSimilarItemsForUserMlModelDto("CLICK", 0, "click");
        CLICK = marketGetSimilarItemsForUserMlModelDto;
        MarketGetSimilarItemsForUserMlModelDto[] marketGetSimilarItemsForUserMlModelDtoArr = {marketGetSimilarItemsForUserMlModelDto};
        $VALUES = marketGetSimilarItemsForUserMlModelDtoArr;
        $ENTRIES = new asp(marketGetSimilarItemsForUserMlModelDtoArr);
        CREATOR = new a();
    }

    private MarketGetSimilarItemsForUserMlModelDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketGetSimilarItemsForUserMlModelDto valueOf(String str) {
        return (MarketGetSimilarItemsForUserMlModelDto) Enum.valueOf(MarketGetSimilarItemsForUserMlModelDto.class, str);
    }

    public static MarketGetSimilarItemsForUserMlModelDto[] values() {
        return (MarketGetSimilarItemsForUserMlModelDto[]) $VALUES.clone();
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
