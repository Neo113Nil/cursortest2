package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketGetCommunityShopConditionsFieldsDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetCommunityShopConditionsFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketGetCommunityShopConditionsFieldsDto[] $VALUES;

    @pmi0("buttons")
    public static final MarketGetCommunityShopConditionsFieldsDto BUTTONS;
    public static final Parcelable.Creator<MarketGetCommunityShopConditionsFieldsDto> CREATOR;
    private final String value;

    /* compiled from: MarketGetCommunityShopConditionsFieldsDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetCommunityShopConditionsFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetCommunityShopConditionsFieldsDto createFromParcel(Parcel parcel) {
            return MarketGetCommunityShopConditionsFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetCommunityShopConditionsFieldsDto[] newArray(int i) {
            return new MarketGetCommunityShopConditionsFieldsDto[i];
        }
    }

    static {
        MarketGetCommunityShopConditionsFieldsDto marketGetCommunityShopConditionsFieldsDto = new MarketGetCommunityShopConditionsFieldsDto("BUTTONS", 0, "buttons");
        BUTTONS = marketGetCommunityShopConditionsFieldsDto;
        MarketGetCommunityShopConditionsFieldsDto[] marketGetCommunityShopConditionsFieldsDtoArr = {marketGetCommunityShopConditionsFieldsDto};
        $VALUES = marketGetCommunityShopConditionsFieldsDtoArr;
        $ENTRIES = new asp(marketGetCommunityShopConditionsFieldsDtoArr);
        CREATOR = new a();
    }

    private MarketGetCommunityShopConditionsFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketGetCommunityShopConditionsFieldsDto valueOf(String str) {
        return (MarketGetCommunityShopConditionsFieldsDto) Enum.valueOf(MarketGetCommunityShopConditionsFieldsDto.class, str);
    }

    public static MarketGetCommunityShopConditionsFieldsDto[] values() {
        return (MarketGetCommunityShopConditionsFieldsDto[]) $VALUES.clone();
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
