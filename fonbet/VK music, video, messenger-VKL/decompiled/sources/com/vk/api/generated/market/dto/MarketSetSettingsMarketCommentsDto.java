package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSetSettingsMarketCommentsDto.kt */
/* loaded from: classes15.dex */
public final class MarketSetSettingsMarketCommentsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSetSettingsMarketCommentsDto[] $VALUES;
    public static final Parcelable.Creator<MarketSetSettingsMarketCommentsDto> CREATOR;

    @pmi0("0")
    public static final MarketSetSettingsMarketCommentsDto TYPE_0;

    @pmi0("1")
    public static final MarketSetSettingsMarketCommentsDto TYPE_1;
    private final int value;

    /* compiled from: MarketSetSettingsMarketCommentsDto.kt */
    public static final class a implements Parcelable.Creator<MarketSetSettingsMarketCommentsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSetSettingsMarketCommentsDto createFromParcel(Parcel parcel) {
            return MarketSetSettingsMarketCommentsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSetSettingsMarketCommentsDto[] newArray(int i) {
            return new MarketSetSettingsMarketCommentsDto[i];
        }
    }

    static {
        MarketSetSettingsMarketCommentsDto marketSetSettingsMarketCommentsDto = new MarketSetSettingsMarketCommentsDto("TYPE_0", 0, 0);
        TYPE_0 = marketSetSettingsMarketCommentsDto;
        MarketSetSettingsMarketCommentsDto marketSetSettingsMarketCommentsDto2 = new MarketSetSettingsMarketCommentsDto("TYPE_1", 1, 1);
        TYPE_1 = marketSetSettingsMarketCommentsDto2;
        MarketSetSettingsMarketCommentsDto[] marketSetSettingsMarketCommentsDtoArr = {marketSetSettingsMarketCommentsDto, marketSetSettingsMarketCommentsDto2};
        $VALUES = marketSetSettingsMarketCommentsDtoArr;
        $ENTRIES = new asp(marketSetSettingsMarketCommentsDtoArr);
        CREATOR = new a();
    }

    private MarketSetSettingsMarketCommentsDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSetSettingsMarketCommentsDto valueOf(String str) {
        return (MarketSetSettingsMarketCommentsDto) Enum.valueOf(MarketSetSettingsMarketCommentsDto.class, str);
    }

    public static MarketSetSettingsMarketCommentsDto[] values() {
        return (MarketSetSettingsMarketCommentsDto[]) $VALUES.clone();
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
