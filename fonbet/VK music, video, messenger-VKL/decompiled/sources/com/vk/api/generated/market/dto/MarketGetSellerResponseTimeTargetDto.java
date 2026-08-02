package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketGetSellerResponseTimeTargetDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetSellerResponseTimeTargetDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketGetSellerResponseTimeTargetDto[] $VALUES;

    @pmi0("button")
    public static final MarketGetSellerResponseTimeTargetDto BUTTON;
    public static final Parcelable.Creator<MarketGetSellerResponseTimeTargetDto> CREATOR;

    @pmi0("messages")
    public static final MarketGetSellerResponseTimeTargetDto MESSAGES;
    private final String value;

    /* compiled from: MarketGetSellerResponseTimeTargetDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetSellerResponseTimeTargetDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetSellerResponseTimeTargetDto createFromParcel(Parcel parcel) {
            return MarketGetSellerResponseTimeTargetDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetSellerResponseTimeTargetDto[] newArray(int i) {
            return new MarketGetSellerResponseTimeTargetDto[i];
        }
    }

    static {
        MarketGetSellerResponseTimeTargetDto marketGetSellerResponseTimeTargetDto = new MarketGetSellerResponseTimeTargetDto("BUTTON", 0, "button");
        BUTTON = marketGetSellerResponseTimeTargetDto;
        MarketGetSellerResponseTimeTargetDto marketGetSellerResponseTimeTargetDto2 = new MarketGetSellerResponseTimeTargetDto("MESSAGES", 1, "messages");
        MESSAGES = marketGetSellerResponseTimeTargetDto2;
        MarketGetSellerResponseTimeTargetDto[] marketGetSellerResponseTimeTargetDtoArr = {marketGetSellerResponseTimeTargetDto, marketGetSellerResponseTimeTargetDto2};
        $VALUES = marketGetSellerResponseTimeTargetDtoArr;
        $ENTRIES = new asp(marketGetSellerResponseTimeTargetDtoArr);
        CREATOR = new a();
    }

    private MarketGetSellerResponseTimeTargetDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketGetSellerResponseTimeTargetDto valueOf(String str) {
        return (MarketGetSellerResponseTimeTargetDto) Enum.valueOf(MarketGetSellerResponseTimeTargetDto.class, str);
    }

    public static MarketGetSellerResponseTimeTargetDto[] values() {
        return (MarketGetSellerResponseTimeTargetDto[]) $VALUES.clone();
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
