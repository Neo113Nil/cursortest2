package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketGetContentAttachedItemsContentTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetContentAttachedItemsContentTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketGetContentAttachedItemsContentTypeDto[] $VALUES;
    public static final Parcelable.Creator<MarketGetContentAttachedItemsContentTypeDto> CREATOR;

    @pmi0("post")
    public static final MarketGetContentAttachedItemsContentTypeDto POST;
    private final String value;

    /* compiled from: MarketGetContentAttachedItemsContentTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetContentAttachedItemsContentTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetContentAttachedItemsContentTypeDto createFromParcel(Parcel parcel) {
            return MarketGetContentAttachedItemsContentTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetContentAttachedItemsContentTypeDto[] newArray(int i) {
            return new MarketGetContentAttachedItemsContentTypeDto[i];
        }
    }

    static {
        MarketGetContentAttachedItemsContentTypeDto marketGetContentAttachedItemsContentTypeDto = new MarketGetContentAttachedItemsContentTypeDto("POST", 0, "post");
        POST = marketGetContentAttachedItemsContentTypeDto;
        MarketGetContentAttachedItemsContentTypeDto[] marketGetContentAttachedItemsContentTypeDtoArr = {marketGetContentAttachedItemsContentTypeDto};
        $VALUES = marketGetContentAttachedItemsContentTypeDtoArr;
        $ENTRIES = new asp(marketGetContentAttachedItemsContentTypeDtoArr);
        CREATOR = new a();
    }

    private MarketGetContentAttachedItemsContentTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketGetContentAttachedItemsContentTypeDto valueOf(String str) {
        return (MarketGetContentAttachedItemsContentTypeDto) Enum.valueOf(MarketGetContentAttachedItemsContentTypeDto.class, str);
    }

    public static MarketGetContentAttachedItemsContentTypeDto[] values() {
        return (MarketGetContentAttachedItemsContentTypeDto[]) $VALUES.clone();
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
