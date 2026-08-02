package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4504q2;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketGetItemsForReviewViewTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetItemsForReviewViewTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketGetItemsForReviewViewTypeDto[] $VALUES;

    @pmi0("community_main")
    public static final MarketGetItemsForReviewViewTypeDto COMMUNITY_MAIN;
    public static final Parcelable.Creator<MarketGetItemsForReviewViewTypeDto> CREATOR;

    @pmi0("market_main")
    public static final MarketGetItemsForReviewViewTypeDto MARKET_MAIN;

    @pmi0(C4504q2.u)
    public static final MarketGetItemsForReviewViewTypeDto ORDER;
    private final String value;

    /* compiled from: MarketGetItemsForReviewViewTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetItemsForReviewViewTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetItemsForReviewViewTypeDto createFromParcel(Parcel parcel) {
            return MarketGetItemsForReviewViewTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetItemsForReviewViewTypeDto[] newArray(int i) {
            return new MarketGetItemsForReviewViewTypeDto[i];
        }
    }

    static {
        MarketGetItemsForReviewViewTypeDto marketGetItemsForReviewViewTypeDto = new MarketGetItemsForReviewViewTypeDto("COMMUNITY_MAIN", 0, "community_main");
        COMMUNITY_MAIN = marketGetItemsForReviewViewTypeDto;
        MarketGetItemsForReviewViewTypeDto marketGetItemsForReviewViewTypeDto2 = new MarketGetItemsForReviewViewTypeDto("MARKET_MAIN", 1, "market_main");
        MARKET_MAIN = marketGetItemsForReviewViewTypeDto2;
        MarketGetItemsForReviewViewTypeDto marketGetItemsForReviewViewTypeDto3 = new MarketGetItemsForReviewViewTypeDto("ORDER", 2, C4504q2.u);
        ORDER = marketGetItemsForReviewViewTypeDto3;
        MarketGetItemsForReviewViewTypeDto[] marketGetItemsForReviewViewTypeDtoArr = {marketGetItemsForReviewViewTypeDto, marketGetItemsForReviewViewTypeDto2, marketGetItemsForReviewViewTypeDto3};
        $VALUES = marketGetItemsForReviewViewTypeDtoArr;
        $ENTRIES = new asp(marketGetItemsForReviewViewTypeDtoArr);
        CREATOR = new a();
    }

    private MarketGetItemsForReviewViewTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketGetItemsForReviewViewTypeDto valueOf(String str) {
        return (MarketGetItemsForReviewViewTypeDto) Enum.valueOf(MarketGetItemsForReviewViewTypeDto.class, str);
    }

    public static MarketGetItemsForReviewViewTypeDto[] values() {
        return (MarketGetItemsForReviewViewTypeDto[]) $VALUES.clone();
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
